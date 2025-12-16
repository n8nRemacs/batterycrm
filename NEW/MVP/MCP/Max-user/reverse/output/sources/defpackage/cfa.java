package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarPickerBottomSheet;

/* loaded from: classes2.dex */
public final class cfa extends dtf implements sm6 {
    public final /* synthetic */ NeuroAvatarPickerBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfa(Continuation continuation, NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet) {
        super(2, continuation);
        this.X = neuroAvatarPickerBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        cfa cfaVar = (cfa) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        cfaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        cfa cfaVar = new cfa(continuation, this.X);
        cfaVar.o = obj;
        return cfaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List list = (List) this.o;
        NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = this.X;
        ((cga) neuroAvatarPickerBottomSheet.M0.D(neuroAvatarPickerBottomSheet, NeuroAvatarPickerBottomSheet.N0[4])).setVisibility(list.isEmpty() ? 0 : 8);
        neuroAvatarPickerBottomSheet.O0().setVisibility(list.isEmpty() ? 8 : 0);
        v1a v1aVar = neuroAvatarPickerBottomSheet.I0;
        neb nebVarO0 = neuroAvatarPickerBottomSheet.O0();
        v1aVar.getClass();
        v1a.n(nebVarO0, list);
        return qqg.a;
    }
}
