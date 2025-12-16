package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsTabWidget;

/* loaded from: classes2.dex */
public final class hyb extends dtf implements sm6 {
    public final /* synthetic */ PickerChatsTabWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hyb(PickerChatsTabWidget pickerChatsTabWidget, Continuation continuation) {
        super(2, continuation);
        this.X = pickerChatsTabWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        hyb hybVar = (hyb) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        hybVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hyb hybVar = new hyb(this.X, continuation);
        hybVar.o = obj;
        return hybVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        g8j.b(obj);
        List list = (List) this.o;
        PickerChatsTabWidget pickerChatsTabWidget = this.X;
        pickerChatsTabWidget.t0.f(list);
        pickerChatsTabWidget.v0.M(list);
        return qqg.a;
    }
}
