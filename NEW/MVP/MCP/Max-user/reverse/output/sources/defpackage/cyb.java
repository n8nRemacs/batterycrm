package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsListWidget;

/* loaded from: classes2.dex */
public final class cyb extends dtf implements sm6 {
    public final /* synthetic */ PickerChatsListWidget o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyb(Continuation continuation, PickerChatsListWidget pickerChatsListWidget) {
        super(2, continuation);
        this.o = pickerChatsListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        cyb cybVar = (cyb) l((Set) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        cybVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cyb(continuation, this.o);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = PickerChatsListWidget.A0;
        this.o.C0().Y();
        return qqg.a;
    }
}
