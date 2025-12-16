package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsListWidget;

/* loaded from: classes2.dex */
public final class dyb extends dtf implements sm6 {
    public final /* synthetic */ PickerChatsListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyb(Continuation continuation, PickerChatsListWidget pickerChatsListWidget) {
        super(2, continuation);
        this.X = pickerChatsListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dyb dybVar = (dyb) l((String) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dybVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dyb dybVar = new dyb(continuation, this.X);
        dybVar.o = obj;
        return dybVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        String str = (String) this.o;
        PickerChatsListWidget pickerChatsListWidget = this.X;
        dxb dxbVar = pickerChatsListWidget.x0;
        dxb dxbVar2 = pickerChatsListWidget.w0;
        zm3 zm3Var = pickerChatsListWidget.v0;
        phd phdVar = (phd) zm3Var.C().get(0);
        if (vmf.F(str)) {
            if (!fni.a(phdVar, dxbVar2)) {
                ocg ocgVar = pickerChatsListWidget.Z;
                if (ocgVar != null) {
                    ocgVar.b(pickerChatsListWidget.C0());
                }
                zm3Var.E(dxbVar);
                zm3Var.d.a(0, dxbVar2);
                pickerChatsListWidget.C0().setRefreshingNext(PickerChatsListWidget.z0(pickerChatsListWidget));
                pickerChatsListWidget.Z = x7j.c(pickerChatsListWidget.C0());
            }
        } else if (!fni.a(phdVar, dxbVar)) {
            ocg ocgVar2 = pickerChatsListWidget.Z;
            if (ocgVar2 != null) {
                ocgVar2.b(pickerChatsListWidget.C0());
            }
            zm3Var.E(dxbVar2);
            zm3Var.d.a(0, dxbVar);
            pickerChatsListWidget.C0().setRefreshingNext(PickerChatsListWidget.z0(pickerChatsListWidget));
            pickerChatsListWidget.Z = x7j.c(pickerChatsListWidget.C0());
        }
        return qqg.a;
    }
}
