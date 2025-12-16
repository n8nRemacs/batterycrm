package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* loaded from: classes2.dex */
public final class ryb extends dtf implements sm6 {
    public final /* synthetic */ PickerContactsListWidget o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryb(PickerContactsListWidget pickerContactsListWidget, Continuation continuation) {
        super(2, continuation);
        this.o = pickerContactsListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ryb rybVar = (ryb) l((Set) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        rybVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ryb(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = PickerContactsListWidget.y0;
        PickerContactsListWidget pickerContactsListWidget = this.o;
        y7j.c(5, pickerContactsListWidget.A0(), new qyb(pickerContactsListWidget.A0(), 0), null);
        return qqg.a;
    }
}
