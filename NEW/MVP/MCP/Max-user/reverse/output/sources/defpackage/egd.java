package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class egd extends dtf implements sm6 {
    public final /* synthetic */ RecordExitBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egd(Continuation continuation, RecordExitBottomSheet recordExitBottomSheet) {
        super(2, continuation);
        this.X = recordExitBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        egd egdVar = (egd) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        egdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        egd egdVar = new egd(continuation, this.X);
        egdVar.o = obj;
        return egdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        igd igdVar = (igd) this.o;
        yy7[] yy7VarArr = RecordExitBottomSheet.K0;
        RecordExitBottomSheet recordExitBottomSheet = this.X;
        TextView textViewT0 = recordExitBottomSheet.T0();
        n5g n5gVar = igdVar.a;
        hgd hgdVar = igdVar.d;
        hgd hgdVar2 = igdVar.c;
        textViewT0.setText(n5gVar.b(recordExitBottomSheet.getContext()));
        TextView textViewS0 = recordExitBottomSheet.S0();
        s5g s5gVar = igdVar.b;
        textViewS0.setText(s5gVar != null ? s5gVar.b(recordExitBottomSheet.getContext()) : null);
        recordExitBottomSheet.S0().setVisibility(s5gVar != null ? 0 : 8);
        CharSequence charSequenceB = igdVar.e.b(recordExitBottomSheet.getContext());
        recordExitBottomSheet.R0().setTitle(charSequenceB);
        recordExitBottomSheet.R0().setVisibility((charSequenceB == null || charSequenceB.length() == 0) ? 8 : 0);
        recordExitBottomSheet.O0().setVisibility(igdVar.f ? 0 : 8);
        OneMeButton oneMeButtonP0 = recordExitBottomSheet.P0();
        oneMeButtonP0.setMode(hgdVar2.c);
        oneMeButtonP0.setText(hgdVar2.b.b(oneMeButtonP0.getContext()));
        f8j.d(oneMeButtonP0, 300L, new iu1(recordExitBottomSheet, 2, igdVar));
        OneMeButton oneMeButtonQ0 = recordExitBottomSheet.Q0();
        oneMeButtonQ0.setMode(hgdVar.c);
        oneMeButtonQ0.setText(hgdVar.b.b(oneMeButtonQ0.getContext()));
        f8j.d(oneMeButtonQ0, 300L, new r6(11, recordExitBottomSheet));
        return qqg.a;
    }
}
