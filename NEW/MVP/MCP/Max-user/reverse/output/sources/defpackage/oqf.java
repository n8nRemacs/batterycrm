package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;

/* loaded from: classes2.dex */
public final class oqf extends dtf implements sm6 {
    public final /* synthetic */ SuggestionsWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqf(SuggestionsWidget suggestionsWidget, Continuation continuation) {
        super(2, continuation);
        this.X = suggestionsWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        oqf oqfVar = (oqf) l((ypf) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        oqfVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        oqf oqfVar = new oqf(this.X, continuation);
        oqfVar.o = obj;
        return oqfVar;
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ypf ypfVar = (ypf) this.o;
        SuggestionsWidget suggestionsWidget = this.X;
        if (ypfVar == null) {
            yy7[] yy7VarArr = SuggestionsWidget.F0;
            suggestionsWidget.Q0();
        } else {
            ArrayList arrayList = ypfVar.b;
            boolean zIsEmpty = arrayList.isEmpty();
            yy7[] yy7VarArr2 = SuggestionsWidget.F0;
            suggestionsWidget.N0().setVisibility(zIsEmpty ? 0 : 8);
            suggestionsWidget.O0().setVisibility(zIsEmpty ? 8 : 0);
            suggestionsWidget.N0().setText(ypfVar.a == xpf.c ? nab.r : nab.s);
            ((dqf) suggestionsWidget.y0.getValue()).E(arrayList);
        }
        return qqg.a;
    }
}
