package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sv2 extends dtf implements um6 {
    public /* synthetic */ FrameLayout X;
    public /* synthetic */ yeb Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sv2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FrameLayout frameLayout = (FrameLayout) obj;
        yeb yebVar = (yeb) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                sv2 sv2Var = new sv2(3, continuation, 0);
                sv2Var.X = frameLayout;
                sv2Var.Y = yebVar;
                qqg qqgVar = qqg.a;
                sv2Var.n(qqgVar);
                return qqgVar;
            case 1:
                sv2 sv2Var2 = new sv2(3, continuation, 1);
                sv2Var2.X = frameLayout;
                sv2Var2.Y = yebVar;
                qqg qqgVar2 = qqg.a;
                sv2Var2.n(qqgVar2);
                return qqgVar2;
            case 2:
                sv2 sv2Var3 = new sv2(3, continuation, 2);
                sv2Var3.X = frameLayout;
                sv2Var3.Y = yebVar;
                qqg qqgVar3 = qqg.a;
                sv2Var3.n(qqgVar3);
                return qqgVar3;
            case 3:
                sv2 sv2Var4 = new sv2(3, continuation, 3);
                sv2Var4.X = frameLayout;
                sv2Var4.Y = yebVar;
                qqg qqgVar4 = qqg.a;
                sv2Var4.n(qqgVar4);
                return qqgVar4;
            case 4:
                sv2 sv2Var5 = new sv2(3, continuation, 4);
                sv2Var5.X = frameLayout;
                sv2Var5.Y = yebVar;
                qqg qqgVar5 = qqg.a;
                sv2Var5.n(qqgVar5);
                return qqgVar5;
            case 5:
                sv2 sv2Var6 = new sv2(3, continuation, 5);
                sv2Var6.X = frameLayout;
                sv2Var6.Y = yebVar;
                qqg qqgVar6 = qqg.a;
                sv2Var6.n(qqgVar6);
                return qqgVar6;
            case 6:
                sv2 sv2Var7 = new sv2(3, continuation, 6);
                sv2Var7.X = frameLayout;
                sv2Var7.Y = yebVar;
                qqg qqgVar7 = qqg.a;
                sv2Var7.n(qqgVar7);
                return qqgVar7;
            case 7:
                sv2 sv2Var8 = new sv2(3, continuation, 7);
                sv2Var8.X = frameLayout;
                sv2Var8.Y = yebVar;
                qqg qqgVar8 = qqg.a;
                sv2Var8.n(qqgVar8);
                return qqgVar8;
            default:
                sv2 sv2Var9 = new sv2(3, continuation, 8);
                sv2Var9.X = frameLayout;
                sv2Var9.Y = yebVar;
                qqg qqgVar9 = qqg.a;
                sv2Var9.n(qqgVar9);
                return qqgVar9;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Paint paint;
        switch (this.o) {
            case 0:
                g8j.b(obj);
                this.X.setBackgroundColor(this.Y.a().u().a.a.d);
                break;
            case 1:
                g8j.b(obj);
                this.X.setBackgroundColor(this.Y.a().k().a.d);
                break;
            case 2:
                g8j.b(obj);
                FrameLayout frameLayout = this.X;
                yeb yebVar = this.Y;
                a93.s0.x(frameLayout.getContext()).getClass();
                a93.g(frameLayout, yebVar);
                break;
            case 3:
                g8j.b(obj);
                this.X.setBackgroundColor(this.Y.b().l);
                break;
            case 4:
                g8j.b(obj);
                FrameLayout frameLayout2 = this.X;
                yeb yebVar2 = this.Y;
                Drawable background = frameLayout2.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColors(yebVar2.d().c.a);
                }
                break;
            case 5:
                g8j.b(obj);
                this.X.setBackgroundColor(this.Y.b().k);
                break;
            case 6:
                g8j.b(obj);
                this.X.setBackgroundColor(this.Y.b().l);
                break;
            case 7:
                g8j.b(obj);
                FrameLayout frameLayout3 = this.X;
                yeb yebVar3 = this.Y;
                Drawable background2 = frameLayout3.getBackground();
                ShapeDrawable shapeDrawable = background2 instanceof ShapeDrawable ? (ShapeDrawable) background2 : null;
                if (shapeDrawable != null && (paint = shapeDrawable.getPaint()) != null) {
                    yebVar3.getIcon();
                    paint.setColor(-1);
                }
                break;
            default:
                g8j.b(obj);
                FrameLayout frameLayout4 = this.X;
                yeb yebVar4 = this.Y;
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(vw4.d().getDisplayMetrics().density * 16.0f);
                gradientDrawable2.setTint(yebVar4.b().h);
                frameLayout4.setBackground(gradientDrawable2);
                frameLayout4.setForeground(new RippleDrawable(ColorStateList.valueOf(yebVar4.c().a.a.i), null, zff.J0));
                break;
        }
        return qqg.a;
    }
}
