package defpackage;

import androidx.recyclerview.widget.a;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class yfa extends dtf implements sm6 {
    public final /* synthetic */ NeuroAvatarsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfa(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.X = neuroAvatarsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        yfa yfaVar = (yfa) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        yfaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yfa yfaVar = new yfa(continuation, this.X);
        yfaVar.o = obj;
        return yfaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ffa ffaVar = (ffa) this.o;
        Integer num = ffaVar.b;
        NeuroAvatarsScreen neuroAvatarsScreen = this.X;
        if (num != null && num.intValue() >= 0) {
            yy7[] yy7VarArr = NeuroAvatarsScreen.K0;
            neuroAvatarsScreen.z0().E0();
            neuroAvatarsScreen.H0.c = true;
            s52 s52Var = new s52(neuroAvatarsScreen.getContext(), 2);
            s52Var.a = num.intValue();
            a layoutManager = neuroAvatarsScreen.z0().getLayoutManager();
            if (layoutManager != null) {
                layoutManager.K0(s52Var);
            }
        }
        int i = ffaVar.a;
        if (i >= 0) {
            yy7[] yy7VarArr2 = NeuroAvatarsScreen.K0;
            if (neuroAvatarsScreen.B0().getSelectedTabPosition() != i) {
                neuroAvatarsScreen.B0().stopNestedScroll();
                iyf iyfVarH = neuroAvatarsScreen.B0().h(i);
                if (iyfVarH != null) {
                    iyfVarH.a();
                }
            }
        }
        return qqg.a;
    }
}
