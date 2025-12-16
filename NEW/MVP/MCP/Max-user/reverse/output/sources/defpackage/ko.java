package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* loaded from: classes.dex */
public final class ko {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static ko c;
    public eod a;

    public static synchronized ko a() {
        try {
            if (c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return eod.e(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            ko koVar = new ko();
            c = koVar;
            koVar.a = eod.b();
            eod eodVar = c.a;
            cb6 cb6Var = new cb6();
            synchronized (eodVar) {
                eodVar.e = cb6Var;
            }
        }
    }

    public static void e(Drawable drawable, i21 i21Var, int[] iArr) {
        PorterDuff.Mode mode = eod.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = i21Var.c;
        if (!z && !i21Var.b) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z ? (ColorStateList) i21Var.d : null;
        PorterDuff.Mode mode2 = i21Var.b ? (PorterDuff.Mode) i21Var.e : eod.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = eod.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.d(context, i);
    }
}
