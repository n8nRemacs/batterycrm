package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Log;
import android.view.WindowManager;

/* loaded from: classes.dex */
public abstract class e6j {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.sac r4, defpackage.cm6 r5, defpackage.q44 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.mac
            if (r0 == 0) goto L13
            r0 = r6
            mac r0 = (defpackage.mac) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            mac r0 = new mac
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.o
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            cm6 r5 = r0.d
            defpackage.g8j.b(r6)     // Catch: java.lang.Throwable -> L27
            goto L63
        L27:
            r4 = move-exception
            goto L69
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.g8j.b(r6)
            x74 r6 = r0.b
            wha r1 = defpackage.wha.w0
            v74 r6 = r6.get(r1)
            if (r6 != r4) goto L6d
            r0.d = r5     // Catch: java.lang.Throwable -> L27
            r0.X = r2     // Catch: java.lang.Throwable -> L27
            l42 r6 = new l42     // Catch: java.lang.Throwable -> L27
            kotlin.coroutines.Continuation r0 = defpackage.hni.f(r0)     // Catch: java.lang.Throwable -> L27
            r6.<init>(r2, r0)     // Catch: java.lang.Throwable -> L27
            r6.o()     // Catch: java.lang.Throwable -> L27
            z11 r0 = new z11     // Catch: java.lang.Throwable -> L27
            r1 = 15
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> L27
            pac r4 = (defpackage.pac) r4     // Catch: java.lang.Throwable -> L27
            r4.E(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r6.n()     // Catch: java.lang.Throwable -> L27
            g84 r6 = defpackage.g84.a
            if (r4 != r6) goto L63
            return r6
        L63:
            r5.invoke()
            qqg r4 = defpackage.qqg.a
            return r4
        L69:
            r5.invoke()
            throw r4
        L6d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e6j.a(sac, cm6, q44):java.lang.Object");
    }

    public static final WindowManager b(Context context) {
        return (WindowManager) context.getSystemService("window");
    }

    public static final void c(Context context, String str) {
        if (str.length() == 0) {
            return;
        }
        try {
            Spannable spannableNewSpannable = Spannable.Factory.getInstance().newSpannable(str);
            boolean z = true;
            Linkify.addLinks(spannableNewSpannable, 1);
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableNewSpannable.getSpans(0, spannableNewSpannable.length(), URLSpan.class);
            if (uRLSpanArr.length != 0) {
                z = false;
            }
            if (!z) {
                str = ((URLSpan) ys.v(uRLSpanArr)).getURL();
            }
        } catch (Throwable unused) {
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Log.e("ContextExt", "openWebLink - " + ((Object) str) + ": " + e.getMessage());
        }
    }
}
