package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class r9j {
    public static tee a(String str, s9j s9jVar, ree[] reeVarArr) {
        if (vmf.F(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (s9jVar.equals(nnf.b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        da3 da3Var = new da3(str);
        return new tee(str, s9jVar, da3Var.b.size(), ys.D(reeVarArr), da3Var);
    }

    public static ColorStateList b(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !c5.t(drawable)) {
            return null;
        }
        return y35.e(drawable).getColorStateList();
    }
}
