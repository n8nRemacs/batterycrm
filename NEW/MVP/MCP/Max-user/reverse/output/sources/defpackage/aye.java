package defpackage;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.coroutines.Continuation;
import one.me.location.map.show.ShowLocationScreen;

/* loaded from: classes2.dex */
public final class aye extends dtf implements um6 {
    public /* synthetic */ yeb X;
    public final /* synthetic */ yfb Y;
    public final /* synthetic */ q6b Z;
    public /* synthetic */ ConstraintLayout o;
    public final /* synthetic */ SimpleDraweeView s0;
    public final /* synthetic */ ShowLocationScreen t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aye(yfb yfbVar, q6b q6bVar, SimpleDraweeView simpleDraweeView, ShowLocationScreen showLocationScreen, Continuation continuation) {
        super(3, continuation);
        this.Y = yfbVar;
        this.Z = q6bVar;
        this.s0 = simpleDraweeView;
        this.t0 = showLocationScreen;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SimpleDraweeView simpleDraweeView = this.s0;
        ShowLocationScreen showLocationScreen = this.t0;
        aye ayeVar = new aye(this.Y, this.Z, simpleDraweeView, showLocationScreen, (Continuation) obj3);
        ayeVar.o = (ConstraintLayout) obj;
        ayeVar.X = (yeb) obj2;
        qqg qqgVar = qqg.a;
        ayeVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ConstraintLayout constraintLayout = this.o;
        yeb yebVar = this.X;
        v1a v1aVar = a93.s0;
        this.Y.setBackgroundColor(v1aVar.y(constraintLayout).b().c);
        this.Z.c(v1aVar.y(constraintLayout));
        Context context = constraintLayout.getContext();
        yy7[] yy7VarArr = ShowLocationScreen.B0;
        ShowLocationScreen showLocationScreen = this.t0;
        uo8.b(this.s0, context, ((l5c) ((age) showLocationScreen.A0.getValue())).n());
        iw6 iw6Var = showLocationScreen.x0;
        if (iw6Var != null) {
            showLocationScreen.A0(v1aVar.y(constraintLayout), iw6Var);
        }
        v1aVar.x(constraintLayout.getContext()).getClass();
        a93.g(constraintLayout, yebVar);
        return qqg.a;
    }
}
