package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import java.util.concurrent.CancellationException;
import ru.ok.utils.widgets.LongRoundedTitleSubtitleButton;

/* loaded from: classes.dex */
public abstract class cei {
    public static final Object a = new Object();
    public static volatile cei b;

    public static final boolean a(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (fni.b(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public static void b(q1g q1gVar, LongRoundedTitleSubtitleButton longRoundedTitleSubtitleButton, int i) {
        int i2 = q1gVar.k;
        int i3 = q1gVar.l;
        longRoundedTitleSubtitleButton.setBackground(uga.b(i2, q1gVar.i, zob.b(i2, 0.3f), i));
        longRoundedTitleSubtitleButton.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[]{-16842910}, new int[0]}, new int[]{i3, i3, i3}));
    }

    public static cei g() {
        cei ceiVar;
        synchronized (a) {
            try {
                if (b == null) {
                    b = new yg8(3);
                }
                ceiVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ceiVar;
    }

    public static final Drawable h(int i, int i2, Context context) {
        Drawable drawableB = r34.b(context, i);
        if (drawableB == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Drawable drawableMutate = drawableB.mutate();
        k(drawableMutate, i2);
        return drawableMutate;
    }

    public static final void k(Drawable drawable, int i) {
        if (drawable != null) {
            t35.g(drawable, i);
            t35.i(drawable, PorterDuff.Mode.SRC_IN);
        }
    }

    public static final void l(ProgressBar progressBar, int i) {
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            indeterminateDrawable = progressBar.getProgressDrawable();
        }
        if (indeterminateDrawable != null) {
            k(indeterminateDrawable, i);
        }
    }

    public static String m(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th);

    public abstract void e(String str, String str2);

    public abstract void f(String str, String str2, Throwable th);

    public abstract void i(String str, String str2);

    public abstract void j(String str, String str2, CancellationException cancellationException);

    public abstract void n(String str);

    public abstract void o(String str, String str2);

    public abstract void p(String str, String str2, RuntimeException runtimeException);
}
