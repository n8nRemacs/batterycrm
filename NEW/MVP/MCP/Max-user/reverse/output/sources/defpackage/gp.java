package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class gp extends f8j {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ lp d;

    public gp(lp lpVar, int i, int i2, WeakReference weakReference) {
        this.d = lpVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.f8j
    public final void b(int i) {
    }

    @Override // defpackage.f8j
    public final void c(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            typeface = kp.a(typeface, i, (this.b & 2) != 0);
        }
        lp lpVar = this.d;
        if (lpVar.m) {
            lpVar.l = typeface;
            TextView textView = (TextView) this.c.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new hp(textView, typeface, lpVar.j, 0));
                } else {
                    textView.setTypeface(typeface, lpVar.j);
                }
            }
        }
    }
}
