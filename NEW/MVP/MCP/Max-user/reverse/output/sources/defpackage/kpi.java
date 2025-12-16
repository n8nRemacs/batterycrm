package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public abstract class kpi {
    public static final t75 a(int i) {
        if (i == 0) {
            return t75.a;
        }
        if (i == 1) {
            return t75.b;
        }
        if (i == 2) {
            return t75.c;
        }
        if (i == 3) {
            return t75.d;
        }
        if (i == 4) {
            return t75.o;
        }
        t75 t75Var = t75.X;
        if (i != 5) {
            wqi.e("OneMeDynamicFont", ho7.f(i, "unknown font size mode "), new IllegalStateException(ho7.f(i, "unknown font size mode ")));
        }
        return t75Var;
    }

    public static final Layout b(Context context, h18 h18Var, CharSequence charSequence, int i, TextPaint textPaint, wzg wzgVar) {
        int iR = r(textPaint.getTextSize() / context.getResources().getDisplayMetrics().density);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((char) 8288);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.setSpan(new yzg(context, iR, false, wzgVar), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        int iC = h18.a(h18Var, spannableStringBuilder, textPaint, i, Integer.MAX_VALUE, false, null, 0.0f, false, 496).getLineCount() > 1 ? i - u45.c(xrf.d(iR), vw4.d().getDisplayMetrics().density, kti.d(xrf.g(iR) * vw4.d().getDisplayMetrics().density)) : i;
        Layout layoutA = h18.a(h18Var, spannableStringBuilder, textPaint, iC, 1, false, null, 0.0f, false, 496);
        if (iC == i) {
            return layoutA;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(layoutA.getText().subSequence(0, layoutA.getEllipsisStart(0) + 1));
        spannableStringBuilder2.append((char) 8288);
        spannableStringBuilder2.append((CharSequence) " ");
        spannableStringBuilder2.setSpan(new yzg(context, iR, false, wzgVar), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
        return h18.a(h18Var, spannableStringBuilder2, textPaint, i, 1, false, null, 0.0f, false, 496);
    }

    public static final int r(float f) {
        return f >= ((float) 16) ? 2 : 1;
    }

    public boolean c() {
        return false;
    }

    public abstract boolean d();

    public abstract void e(boolean z);

    public abstract int f();

    public abstract Context g();

    public boolean h() {
        return false;
    }

    public abstract void i();

    public void j() {
    }

    public abstract boolean k(int i, KeyEvent keyEvent);

    public boolean l(KeyEvent keyEvent) {
        return false;
    }

    public boolean m() {
        return false;
    }

    public abstract void n(boolean z);

    public abstract void o(boolean z);

    public abstract void p(CharSequence charSequence);

    public l7 q(h79 h79Var) {
        return null;
    }
}
