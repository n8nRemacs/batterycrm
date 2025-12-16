package defpackage;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.devmenu.tools.server.ServerHostBottomSheet;

/* loaded from: classes2.dex */
public final class ofe extends dtf implements sm6 {
    public final /* synthetic */ ServerHostBottomSheet X;
    public final /* synthetic */ View Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofe(Continuation continuation, ServerHostBottomSheet serverHostBottomSheet, View view) {
        super(2, continuation);
        this.X = serverHostBottomSheet;
        this.Y = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ofe ofeVar = (ofe) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ofeVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ofe ofeVar = new ofe(continuation, this.X, this.Y);
        ofeVar.o = obj;
        return ofeVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ServerHostBottomSheet serverHostBottomSheet = this.X;
        bbd bbdVar = serverHostBottomSheet.H0;
        bbd bbdVar2 = serverHostBottomSheet.F0;
        AutoTransition autoTransition = serverHostBottomSheet.D0;
        g8j.b(obj);
        p77 p77Var = (p77) this.o;
        if (p77Var instanceof m77) {
            api.c(serverHostBottomSheet);
            serverHostBottomSheet.E0(true);
        } else {
            boolean z = p77Var instanceof n77;
            View view = this.Y;
            if (z) {
                TransitionManager.beginDelayedTransition((ViewGroup) view, autoTransition);
                yy7[] yy7VarArr = ServerHostBottomSheet.K0;
                ((RecyclerView) bbdVar2.D(serverHostBottomSheet, yy7VarArr[0])).setVisibility(8);
                ((LinearLayout) bbdVar.D(serverHostBottomSheet, yy7VarArr[2])).setVisibility(0);
                veb vebVar = (veb) serverHostBottomSheet.I0.D(serverHostBottomSheet, yy7VarArr[3]);
                String str = ((n77) p77Var).a;
                if (str == null) {
                    str = "";
                }
                vebVar.setText(str);
            } else {
                if (!(p77Var instanceof o77)) {
                    throw new NoWhenBranchMatchedException();
                }
                TransitionManager.beginDelayedTransition((ViewGroup) view, autoTransition);
                yy7[] yy7VarArr2 = ServerHostBottomSheet.K0;
                ((RecyclerView) bbdVar2.D(serverHostBottomSheet, yy7VarArr2[0])).setVisibility(8);
                ((LinearLayout) bbdVar.D(serverHostBottomSheet, yy7VarArr2[2])).setVisibility(8);
                ((m9b) serverHostBottomSheet.G0.D(serverHostBottomSheet, yy7VarArr2[1])).setVisibility(0);
            }
        }
        return qqg.a;
    }
}
