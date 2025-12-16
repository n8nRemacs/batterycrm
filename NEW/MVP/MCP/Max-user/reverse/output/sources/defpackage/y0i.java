package defpackage;

import android.webkit.JavascriptInterface;

/* loaded from: classes2.dex */
public final class y0i {
    public final uvh a;

    public y0i(uvh uvhVar) {
        this.a = uvhVar;
    }

    @JavascriptInterface
    public final void postEvent(String str, String str2) {
        uvh uvhVar = this.a;
        String str3 = uvhVar.F0;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str3, wy1.i("onJsEvent: ", str, " ", str2), null);
            }
        }
        ra3 ra3Var = uvhVar.J0;
        svi.e((f84) ra3Var.a, ((q2b) ((lzf) ra3Var.b)).a(), null, new wv7(str, str2, ra3Var, null), 2);
    }

    @JavascriptInterface
    public final void resolveShare(String str, byte[] bArr, String str2, String str3) {
        uvh uvhVar = this.a;
        uvhVar.getClass();
        xfh.o(uvhVar, null, new jvh(uvhVar, str, bArr, str2, str3, null), 3);
    }
}
