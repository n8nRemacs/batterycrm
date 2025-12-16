package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.members.PickerMembersListWidget;

/* loaded from: classes2.dex */
public final class dzb extends dtf implements sm6 {
    public final /* synthetic */ PickerMembersListWidget o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzb(PickerMembersListWidget pickerMembersListWidget, Continuation continuation) {
        super(2, continuation);
        this.o = pickerMembersListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dzb dzbVar = (dzb) l((Set) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dzbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dzb(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = PickerMembersListWidget.y0;
        this.o.B0().Y();
        return qqg.a;
    }
}
