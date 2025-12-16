package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.members.PickerMembersListWidget;

/* loaded from: classes2.dex */
public final class azb extends dtf implements sm6 {
    public final /* synthetic */ PickerMembersListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azb(PickerMembersListWidget pickerMembersListWidget, Continuation continuation) {
        super(2, continuation);
        this.X = pickerMembersListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        azb azbVar = (azb) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        azbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        azb azbVar = new azb(this.X, continuation);
        azbVar.o = obj;
        return azbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.Z.E((List) this.o);
        return qqg.a;
    }
}
