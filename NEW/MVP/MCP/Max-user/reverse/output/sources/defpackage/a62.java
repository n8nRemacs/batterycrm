package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a62 extends dtf implements um6 {
    public /* synthetic */ AppCompatImageView X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a62(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                a62 a62Var = new a62(3, continuation, 0);
                a62Var.X = appCompatImageView;
                qqg qqgVar = qqg.a;
                a62Var.n(qqgVar);
                return qqgVar;
            case 1:
                a62 a62Var2 = new a62(3, continuation, 1);
                a62Var2.X = appCompatImageView;
                qqg qqgVar2 = qqg.a;
                a62Var2.n(qqgVar2);
                return qqgVar2;
            case 2:
                a62 a62Var3 = new a62(3, continuation, 2);
                a62Var3.X = appCompatImageView;
                qqg qqgVar3 = qqg.a;
                a62Var3.n(qqgVar3);
                return qqgVar3;
            default:
                a62 a62Var4 = new a62(3, continuation, 3);
                a62Var4.X = appCompatImageView;
                qqg qqgVar4 = qqg.a;
                a62Var4.n(qqgVar4);
                return qqgVar4;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                AppCompatImageView appCompatImageView = this.X;
                v1a v1aVar = a93.s0;
                int i = v1aVar.y(appCompatImageView).c().a.a.i;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                appCompatImageView.setBackgroundDrawable(new RippleDrawable(ColorStateList.valueOf(i), null, shapeDrawable));
                appCompatImageView.setImageResource(yud.r0);
                appCompatImageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(appCompatImageView).getIcon().j));
                break;
            case 1:
                g8j.b(obj);
                AppCompatImageView appCompatImageView2 = this.X;
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(a93.s0.y(appCompatImageView2).getIcon().i));
                appCompatImageView2.setImageResource(y9b.y);
                break;
            case 2:
                g8j.b(obj);
                AppCompatImageView appCompatImageView3 = this.X;
                v1a v1aVar2 = a93.s0;
                appCompatImageView3.setImageTintList(ColorStateList.valueOf(v1aVar2.y(appCompatImageView3).getIcon().i));
                appCompatImageView3.setImageResource(y9b.a);
                int i2 = v1aVar2.y(appCompatImageView3).c().a.a.i;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.getPaint().setColor(-1);
                appCompatImageView3.setBackgroundDrawable(new RippleDrawable(ColorStateList.valueOf(i2), null, shapeDrawable2));
                break;
            default:
                g8j.b(obj);
                AppCompatImageView appCompatImageView4 = this.X;
                v1a v1aVar3 = a93.s0;
                appCompatImageView4.setImageTintList(ColorStateList.valueOf(v1aVar3.y(appCompatImageView4).getIcon().i));
                appCompatImageView4.setImageResource(v5b.i);
                int i3 = v1aVar3.y(appCompatImageView4).c().a.a.i;
                ShapeDrawable shapeDrawable3 = new ShapeDrawable(new OvalShape());
                shapeDrawable3.getPaint().setColor(-1);
                appCompatImageView4.setBackgroundDrawable(new RippleDrawable(ColorStateList.valueOf(i3), null, shapeDrawable3));
                break;
        }
        return qqg.a;
    }
}
