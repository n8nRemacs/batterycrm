package defpackage;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import java.util.Locale;

/* loaded from: classes.dex */
public final class m1c {
    public static final void a(m1c m1cVar, View view, qj1 qj1Var, RectF rectF) {
        view.setPivotX(rectF.top);
        view.setPivotY(rectF.left);
        view.setX(rectF.top);
        view.setY(rectF.left);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        mfh.j(view, 0.0f);
        qj1Var.setAlpha(1.0f);
    }

    public static boolean b() {
        String str = Build.MANUFACTURER;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            if (vmf.s(lowerCase, "huawei", false) || vmf.s(lowerCase, "honor", false)) {
                return true;
            }
        }
        return false;
    }
}
