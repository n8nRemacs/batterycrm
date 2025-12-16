package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsTabWidget;

/* loaded from: classes2.dex */
public final class jyb extends dtf implements sm6 {
    public final /* synthetic */ PickerChatsTabWidget X;
    public /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyb(PickerChatsTabWidget pickerChatsTabWidget, Continuation continuation) {
        super(2, continuation);
        this.X = pickerChatsTabWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jyb jybVar = (jyb) l(bool, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jybVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jyb jybVar = new jyb(this.X, continuation);
        jybVar.o = ((Boolean) obj).booleanValue();
        return jybVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        boolean z = this.o;
        PickerChatsTabWidget pickerChatsTabWidget = this.X;
        if (z) {
            yy7[] yy7VarArr = PickerChatsTabWidget.x0;
            if (pickerChatsTabWidget.z0().getCurrentItem() != 0) {
                pickerChatsTabWidget.z0().e(0, false);
            }
        }
        yy7[] yy7VarArr2 = PickerChatsTabWidget.x0;
        pickerChatsTabWidget.z0().setUserInputEnabled(!z);
        zhg.a(pickerChatsTabWidget.y0(), pickerChatsTabWidget.w0);
        pickerChatsTabWidget.y0().setVisibility(z ? 8 : 0);
        return qqg.a;
    }
}
