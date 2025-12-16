package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* loaded from: classes2.dex */
public final class syb extends dtf implements sm6 {
    public final /* synthetic */ PickerContactsListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syb(PickerContactsListWidget pickerContactsListWidget, Continuation continuation) {
        super(2, continuation);
        this.X = pickerContactsListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        syb sybVar = (syb) l((String) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        sybVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        syb sybVar = new syb(this.X, continuation);
        sybVar.o = obj;
        return sybVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        PickerContactsListWidget pickerContactsListWidget = this.X;
        dxb dxbVar = pickerContactsListWidget.Y;
        zm3 zm3Var = pickerContactsListWidget.s0;
        g8j.b(obj);
        if (vmf.F((String) this.o)) {
            yy7[] yy7VarArr = PickerContactsListWidget.y0;
            if (!fni.a(pickerContactsListWidget.A0().getAdapter(), zm3Var)) {
                ocg ocgVar = pickerContactsListWidget.v0;
                if (ocgVar != null) {
                    ocgVar.b(pickerContactsListWidget.A0());
                }
                pickerContactsListWidget.A0().setAdapter(zm3Var);
                pickerContactsListWidget.v0 = x7j.c(pickerContactsListWidget.A0());
                RecyclerView recyclerViewA0 = pickerContactsListWidget.A0();
                q67 q67Var = pickerContactsListWidget.w0;
                if (q67Var != null) {
                    recyclerViewA0.p0(q67Var);
                }
                pickerContactsListWidget.w0 = null;
                okf okfVar = pickerContactsListWidget.x0;
                if (okfVar != null) {
                    recyclerViewA0.p0(okfVar);
                }
                pickerContactsListWidget.x0 = null;
                pickerContactsListWidget.y0(pickerContactsListWidget.A0());
            }
        } else {
            yy7[] yy7VarArr2 = PickerContactsListWidget.y0;
            if (!fni.a(pickerContactsListWidget.A0().getAdapter(), dxbVar)) {
                ocg ocgVar2 = pickerContactsListWidget.v0;
                if (ocgVar2 != null) {
                    ocgVar2.b(pickerContactsListWidget.A0());
                }
                pickerContactsListWidget.A0().setAdapter(dxbVar);
                pickerContactsListWidget.v0 = x7j.c(pickerContactsListWidget.A0());
                RecyclerView recyclerViewA02 = pickerContactsListWidget.A0();
                q67 q67Var2 = pickerContactsListWidget.w0;
                if (q67Var2 != null) {
                    recyclerViewA02.p0(q67Var2);
                }
                pickerContactsListWidget.w0 = null;
                okf okfVar2 = pickerContactsListWidget.x0;
                if (okfVar2 != null) {
                    recyclerViewA02.p0(okfVar2);
                }
                pickerContactsListWidget.x0 = null;
            }
        }
        return qqg.a;
    }
}
