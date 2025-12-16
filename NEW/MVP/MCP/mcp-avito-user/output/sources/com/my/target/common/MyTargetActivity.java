package com.my.target.common;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import e11.C39912v;
import e11.C39920x1;
import e11.J1;
import j.P;

/* loaded from: classes7.dex */
public class MyTargetActivity extends Activity {

    /* renamed from: d, reason: collision with root package name */
    @P
    public static J1.f f364771d;

    /* renamed from: b, reason: collision with root package name */
    @P
    public J1.f f364772b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public FrameLayout f364773c;

    public interface a {
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        C39920x1 c39920x1;
        J1.f fVar = this.f364772b;
        if (fVar != null && (c39920x1 = fVar.f394383b) != null) {
            C39912v c39912v = c39920x1.f394898l;
            c39912v.getClass();
            try {
                WebView webView = c39912v.f394853b;
                if (webView != null) {
                    if (webView.canGoBack()) {
                        WebView webView2 = fVar.f394383b.f394898l.f394853b;
                        if (webView2 == null) {
                            return;
                        }
                        try {
                            webView2.goBack();
                            return;
                        } catch (Throwable th2) {
                            th2.getMessage();
                            return;
                        }
                    }
                }
            } catch (Throwable th3) {
                th3.getMessage();
            }
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        J1.f fVar = f364771d;
        this.f364772b = fVar;
        f364771d = null;
        if (fVar == null || intent == null) {
            finish();
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this);
        this.f364773c = frameLayout;
        J1.f fVar2 = this.f364772b;
        fVar2.getClass();
        setTheme(R.style.Theme.Light.NoTitleBar);
        Window window = getWindow();
        window.addFlags(BeduinInputModel.MIN_TEXT_VERSION);
        window.setStatusBarColor(-12232092);
        try {
            C39920x1 c39920x1 = new C39920x1(this);
            fVar2.f394383b = c39920x1;
            frameLayout.addView(c39920x1);
            fVar2.f394383b.b();
            fVar2.f394383b.setUrl(fVar2.f394382a);
            fVar2.f394383b.setListener(new com.my.target.ads.a(this, 16));
        } catch (Throwable th2) {
            th2.getMessage();
            finish();
        }
        setContentView(this.f364773c);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C39920x1 c39920x1;
        super.onDestroy();
        J1.f fVar = this.f364772b;
        if (fVar == null || (c39920x1 = fVar.f394383b) == null) {
            return;
        }
        C39912v c39912v = c39920x1.f394898l;
        c39912v.setWebChromeClient(null);
        c39912v.a(0);
        fVar.f394383b = null;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
    }
}
