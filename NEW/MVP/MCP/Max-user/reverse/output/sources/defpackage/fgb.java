package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatmedia.viewer.VideoWebViewScreen;

/* loaded from: classes2.dex */
public class fgb extends WebView {
    public ValueCallback a;
    public egb b;

    public fgb(Context context, int i) {
        super(new m44(context, 0), (AttributeSet) null, (i & 4) != 0 ? 0 : R.attr.webViewStyle, 0);
        b();
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 33) {
            getSettings().setAlgorithmicDarkeningAllowed(true);
        }
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage == null) {
            wqi.c(getClass().getName(), "WebView package not found.", new Object[0]);
            return;
        }
        wqi.c(getClass().getName(), "WebView package: " + currentWebViewPackage.packageName + ", version: " + currentWebViewPackage.versionName, new Object[0]);
    }

    public final void b() {
        int i;
        int iOrdinal = a93.s0.x(getContext()).k().h().ordinal();
        if (iOrdinal == 0) {
            i = bvd.b;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = bvd.b;
        } else {
            i = bvd.a;
        }
        getContext().setTheme(i);
    }

    public final ValueCallback<Uri[]> getFilePathCallback() {
        return this.a;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        b();
        super.onConfigurationChanged(configuration);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        egb egbVar;
        if (this.b != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) && (egbVar = this.b) != null)) {
            VideoWebViewScreen videoWebViewScreen = ((keh) egbVar).a;
            yy7[] yy7VarArr = VideoWebViewScreen.H0;
            videoWebViewScreen.K0(true);
            videoWebViewScreen.S0();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setFilePathCallback(ValueCallback<Uri[]> valueCallback) {
        this.a = valueCallback;
    }

    public final void setInteractionListener(egb egbVar) {
        this.b = egbVar;
    }
}
