package defpackage;

import android.graphics.Rect;
import android.text.Spannable;
import android.text.method.TransformationMethod;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes2.dex */
public final class h88 implements TransformationMethod {
    public static final n7 d = new n7();
    public e88 a;
    public final boolean b;
    public final cm6 c;

    public h88(e88 e88Var, cm6 cm6Var, int i) {
        e88Var = (i & 1) != 0 ? null : e88Var;
        boolean z = (i & 2) != 0;
        this.a = e88Var;
        this.b = z;
        this.c = cm6Var;
    }

    public static void a(CharSequence charSequence) {
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
            if (spans != null) {
                for (Object obj : spans) {
                    if (obj instanceof d88) {
                        ((d88) obj).a = null;
                    } else if (obj instanceof nmc) {
                        ((nmc) obj).d = null;
                    } else if (obj instanceof z07) {
                        ((z07) obj).b = null;
                    } else if (obj instanceof hr0) {
                        ((hr0) obj).c = null;
                    } else if (obj instanceof fj9) {
                        ((fj9) obj).c = null;
                    } else if (obj instanceof b88) {
                        ((b88) obj).d = null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view, String str, i88 i88Var, ClickableSpan clickableSpan) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        n7 n7Var = d;
        if (jCurrentTimeMillis - n7Var.a > 300) {
            n7Var.a = jCurrentTimeMillis;
            e88 e88Var = this.a;
            if (e88Var == null) {
                e88Var = view instanceof e88 ? (e88) view : null;
            }
            if (e88Var != null) {
                e88Var.b(str, i88Var, clickableSpan);
            }
        }
    }

    public final void c(CharSequence charSequence) {
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
            if (spans != null) {
                for (Object obj : spans) {
                    d(obj);
                }
            }
        }
    }

    public final void d(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof d88) {
            ((d88) obj).a = this.a;
            return;
        }
        if (obj instanceof nmc) {
            ((nmc) obj).d = new f88(this);
            return;
        }
        if (obj instanceof z07) {
            ((z07) obj).b = new c88(this, obj);
            return;
        }
        if (obj instanceof hr0) {
            ((hr0) obj).c = new c88(this, obj);
        } else if (obj instanceof fj9) {
            ((fj9) obj).c = new g88(this);
        } else if (obj instanceof b88) {
            ((b88) obj).d = new c88(this, obj);
        }
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        Spannable spannableH = mni.H(charSequence, ((Number) this.c.invoke()).intValue(), this.b, new wu7(4, this));
        return spannableH == null ? charSequence : spannableH;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
