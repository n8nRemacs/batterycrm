package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class a4g {
    public float c;
    public float d;
    public final WeakReference f;
    public s3g g;
    public final TextPaint a = new TextPaint(1);
    public final e83 b = new e83(1, this);
    public boolean e = true;

    public a4g(z3g z3gVar) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(z3gVar);
    }

    public final float a(String str) {
        if (!this.e) {
            return this.c;
        }
        b(str);
        return this.c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.e = false;
    }

    public final void c(s3g s3gVar, Context context) {
        if (this.g != s3gVar) {
            this.g = s3gVar;
            if (s3gVar != null) {
                TextPaint textPaint = this.a;
                e83 e83Var = this.b;
                s3gVar.f(context, textPaint, e83Var);
                z3g z3gVar = (z3g) this.f.get();
                if (z3gVar != null) {
                    textPaint.drawableState = z3gVar.getState();
                }
                s3gVar.e(context, textPaint, e83Var);
                this.e = true;
            }
            z3g z3gVar2 = (z3g) this.f.get();
            if (z3gVar2 != null) {
                z3gVar2.a();
                z3gVar2.onStateChange(z3gVar2.getState());
            }
        }
    }
}
