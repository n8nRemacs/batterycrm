package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarPickerBottomSheet;

/* loaded from: classes2.dex */
public final class dfa extends dtf implements sm6 {
    public final /* synthetic */ NeuroAvatarPickerBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfa(Continuation continuation, NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet) {
        super(2, continuation);
        this.X = neuroAvatarPickerBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dfa dfaVar = (dfa) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dfaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dfa dfaVar = new dfa(continuation, this.X);
        dfaVar.o = obj;
        return dfaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = this.X;
        bbd bbdVar = neuroAvatarPickerBottomSheet.L0;
        g8j.b(obj);
        ffa ffaVar = (ffa) this.o;
        Integer num = ffaVar.b;
        if (num != null && num.intValue() >= 0) {
            yy7[] yy7VarArr = NeuroAvatarPickerBottomSheet.N0;
            ((RecyclerView) bbdVar.D(neuroAvatarPickerBottomSheet, yy7VarArr[3])).E0();
            neuroAvatarPickerBottomSheet.H0.c = true;
            s52 s52Var = new s52(neuroAvatarPickerBottomSheet.getContext(), 1);
            s52Var.a = num.intValue();
            a layoutManager = ((RecyclerView) bbdVar.D(neuroAvatarPickerBottomSheet, yy7VarArr[3])).getLayoutManager();
            if (layoutManager != null) {
                layoutManager.K0(s52Var);
            }
        }
        int i = ffaVar.a;
        if (i >= 0) {
            yy7[] yy7VarArr2 = NeuroAvatarPickerBottomSheet.N0;
            if (neuroAvatarPickerBottomSheet.O0().getSelectedTabPosition() != i) {
                neuroAvatarPickerBottomSheet.O0().stopNestedScroll();
                iyf iyfVarH = neuroAvatarPickerBottomSheet.O0().h(i);
                if (iyfVarH != null) {
                    iyfVarH.a();
                }
            }
        }
        return qqg.a;
    }
}
