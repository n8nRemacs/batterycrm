package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class c24 extends dtf implements um6 {
    public /* synthetic */ View X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c24(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                c24 c24Var = new c24(3, continuation, 0);
                c24Var.X = view;
                qqg qqgVar = qqg.a;
                c24Var.n(qqgVar);
                return qqgVar;
            case 1:
                c24 c24Var2 = new c24(3, continuation, 1);
                c24Var2.X = view;
                qqg qqgVar2 = qqg.a;
                c24Var2.n(qqgVar2);
                return qqgVar2;
            default:
                c24 c24Var3 = new c24(3, continuation, 2);
                c24Var3.X = view;
                qqg qqgVar3 = qqg.a;
                c24Var3.n(qqgVar3);
                return qqgVar3;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                View view = this.X;
                view.setBackgroundColor(a93.s0.y(view).b().l);
                break;
            case 1:
                g8j.b(obj);
                View view2 = this.X;
                view2.setBackgroundColor(a93.s0.y(view2).i().b.c);
                break;
            default:
                g8j.b(obj);
                View view3 = this.X;
                Drawable background = view3.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(a93.s0.y(view3).getText().b);
                }
                break;
        }
        return qqg.a;
    }
}
