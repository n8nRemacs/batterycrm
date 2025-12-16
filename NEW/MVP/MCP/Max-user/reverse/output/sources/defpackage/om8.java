package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* loaded from: classes2.dex */
public final /* synthetic */ class om8 implements um6 {
    public final /* synthetic */ int a;

    public /* synthetic */ om8(int i) {
        this.a = i;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                yeb yebVar = (yeb) obj3;
                Drawable drawable = ((ImageView) obj).getDrawable();
                EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = drawable instanceof EnhancedAnimatedVectorDrawable ? (EnhancedAnimatedVectorDrawable) drawable : null;
                if (enhancedAnimatedVectorDrawable != null) {
                    z18.e(enhancedAnimatedVectorDrawable, "left_dot", yebVar.b().b.c.a);
                    z18.e(enhancedAnimatedVectorDrawable, "middle_dot", yebVar.b().b.c.a);
                    z18.e(enhancedAnimatedVectorDrawable, "right_dot", yebVar.b().b.c.a);
                    z18.e(enhancedAnimatedVectorDrawable, "shape", zBooleanValue ? yebVar.getIcon().a.c.a : yebVar.getIcon().a.c.b);
                }
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                yeb yebVar2 = (yeb) obj3;
                Drawable drawable2 = ((ImageView) obj).getDrawable();
                EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable2 = drawable2 instanceof EnhancedAnimatedVectorDrawable ? (EnhancedAnimatedVectorDrawable) drawable2 : null;
                if (enhancedAnimatedVectorDrawable2 != null) {
                    z18.e(enhancedAnimatedVectorDrawable2, "second_body", yebVar2.b().b.c.a);
                    z18.e(enhancedAnimatedVectorDrawable2, "second_head", yebVar2.b().b.c.a);
                    z18.e(enhancedAnimatedVectorDrawable2, "first_body", yebVar2.b().b.c.a);
                    z18.e(enhancedAnimatedVectorDrawable2, "first_head", yebVar2.b().b.c.a);
                    vb7 vb7Var = yebVar2.getIcon().a.c;
                    z18.f(enhancedAnimatedVectorDrawable2, "border", zBooleanValue2 ? vb7Var.a : vb7Var.b);
                    z18.e(enhancedAnimatedVectorDrawable2, "background", zBooleanValue2 ? yebVar2.getIcon().a.c.a : yebVar2.getIcon().a.c.b);
                }
                break;
            default:
                Log.println(((lg8) obj).a, (String) obj2, (String) obj3);
                break;
        }
        return qqg.a;
    }
}
