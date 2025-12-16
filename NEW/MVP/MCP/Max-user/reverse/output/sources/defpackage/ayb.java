package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsListWidget;

/* loaded from: classes2.dex */
public final class ayb extends dtf implements sm6 {
    public final /* synthetic */ PickerChatsListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayb(Continuation continuation, PickerChatsListWidget pickerChatsListWidget) {
        super(2, continuation);
        this.X = pickerChatsListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ayb aybVar = (ayb) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        aybVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ayb aybVar = new ayb(continuation, this.X);
        aybVar.o = obj;
        return aybVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List list = (List) this.o;
        PickerChatsListWidget pickerChatsListWidget = this.X;
        boolean zZ0 = PickerChatsListWidget.z0(pickerChatsListWidget);
        pickerChatsListWidget.w0.E(list);
        if (pickerChatsListWidget.getView() != null) {
            pickerChatsListWidget.C0().setRefreshingNext(zZ0);
        }
        return qqg.a;
    }
}
