package defpackage;

import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.unkowncontact.UnknownContactBottomSheet;

/* loaded from: classes.dex */
public final class tqg extends dtf implements sm6 {
    public final /* synthetic */ View X;
    public final /* synthetic */ UnknownContactBottomSheet Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqg(Continuation continuation, View view, UnknownContactBottomSheet unknownContactBottomSheet) {
        super(2, continuation);
        this.X = view;
        this.Y = unknownContactBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tqg tqgVar = (tqg) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tqgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tqg tqgVar = new tqg(continuation, this.X, this.Y);
        tqgVar.o = obj;
        return tqgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        irg irgVar = (irg) this.o;
        ViewGroup viewGroup = (ViewGroup) this.X;
        UnknownContactBottomSheet unknownContactBottomSheet = this.Y;
        TransitionManager.beginDelayedTransition(viewGroup, unknownContactBottomSheet.I0);
        bbd bbdVar = unknownContactBottomSheet.E0;
        yy7[] yy7VarArr = UnknownContactBottomSheet.J0;
        TextView textView = (TextView) bbdVar.D(unknownContactBottomSheet, yy7VarArr[2]);
        textView.setText(irgVar.a.b(textView.getContext()));
        bbd bbdVar2 = unknownContactBottomSheet.F0;
        TextView textView2 = (TextView) bbdVar2.D(unknownContactBottomSheet, yy7VarArr[3]);
        s5g s5gVar = irgVar.b;
        textView2.setVisibility(s5gVar != null ? 0 : 8);
        if (s5gVar != null) {
            TextView textView3 = (TextView) bbdVar2.D(unknownContactBottomSheet, yy7VarArr[3]);
            textView3.setText(s5gVar.b(textView3.getContext()));
        }
        ((yqg) unknownContactBottomSheet.G0.D(unknownContactBottomSheet, yy7VarArr[4])).a(irgVar.d, irgVar.c);
        return qqg.a;
    }
}
