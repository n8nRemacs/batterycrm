package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* loaded from: classes.dex */
public abstract class m6i {
    public static final ColorDrawable a = new ColorDrawable(0);

    public static Drawable a(Drawable drawable, vtd vtdVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            Paint paint = bitmapDrawable.getPaint();
            vtdVar.getClass();
            ntd ntdVar = new ntd(resources, bitmap, paint);
            b(ntdVar, vtdVar);
            return ntdVar;
        }
        if (drawable instanceof NinePatchDrawable) {
            ttd ttdVar = new ttd((NinePatchDrawable) drawable);
            b(ttdVar, vtdVar);
            return ttdVar;
        }
        if (!(drawable instanceof ColorDrawable)) {
            op5.m("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        ptd ptdVar = new ptd(((ColorDrawable) drawable).getColor());
        b(ptdVar, vtdVar);
        return ptdVar;
    }

    public static void b(mtd mtdVar, vtd vtdVar) {
        mtdVar.b(vtdVar.b);
        mtdVar.m(vtdVar.c);
        mtdVar.a(vtdVar.f, vtdVar.e);
        mtdVar.h(vtdVar.g);
        mtdVar.k();
        mtdVar.i();
        mtdVar.f();
    }

    public static Drawable c(Drawable drawable, vtd vtdVar, Resources resources) {
        try {
            ml6.i();
            if (drawable != null && vtdVar != null && vtdVar.a == 2) {
                if (!(drawable instanceof ch6)) {
                    return a(drawable, vtdVar, resources);
                }
                w35 w35Var = (ch6) drawable;
                while (true) {
                    Object objJ = w35Var.j();
                    if (objJ == w35Var || !(objJ instanceof w35)) {
                        break;
                    }
                    w35Var = (w35) objJ;
                }
                w35Var.e(a(w35Var.e(a), vtdVar, resources));
                return drawable;
            }
            return drawable;
        } finally {
            ml6.i();
        }
    }

    public static Drawable d(Drawable drawable, vtd vtdVar) {
        try {
            ml6.i();
            if (drawable != null && vtdVar != null && vtdVar.a == 1) {
                rtd rtdVar = new rtd(drawable);
                b(rtdVar, vtdVar);
                rtdVar.w0 = vtdVar.d;
                rtdVar.invalidateSelf();
                return rtdVar;
            }
            return drawable;
        } finally {
            ml6.i();
        }
    }

    public static Drawable e(Drawable drawable, syd sydVar) {
        ml6.i();
        if (drawable == null || sydVar == null) {
            ml6.i();
            return drawable;
        }
        qyd qydVar = new qyd(drawable, sydVar);
        ml6.i();
        return qydVar;
    }
}
