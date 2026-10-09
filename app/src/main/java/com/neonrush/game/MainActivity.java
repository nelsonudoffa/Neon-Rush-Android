package com.neonrush.game;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class MainActivity extends Activity {
  private WebView game;
  @Override public void onCreate(Bundle b) {
    super.onCreate(b);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    game = new WebView(this);
    game.setBackgroundColor(0xFF080B1A);
    WebSettings s = game.getSettings();
    s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setMediaPlaybackRequiresUserGesture(false);
    game.setWebViewClient(new WebViewClient()); game.setWebChromeClient(new WebChromeClient());
    setContentView(game); game.loadUrl("file:///android_asset/index.html");
  }
  @Override public void onBackPressed() { if (game != null && game.canGoBack()) game.goBack(); else super.onBackPressed(); }
}
