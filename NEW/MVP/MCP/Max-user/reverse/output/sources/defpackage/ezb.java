package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class ezb extends dtf implements sm6 {
    public final /* synthetic */ PickerMembersListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezb(PickerMembersListWidget pickerMembersListWidget, Continuation continuation) {
        super(2, continuation);
        this.X = pickerMembersListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ezb ezbVar = (ezb) l((String) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ezbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ezb ezbVar = new ezb(this.X, continuation);
        ezbVar.o = obj;
        return ezbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        PickerMembersListWidget pickerMembersListWidget = this.X;
        dxb dxbVar = pickerMembersListWidget.Z;
        dxb dxbVar2 = pickerMembersListWidget.s0;
        g8j.b(obj);
        String str = (String) this.o;
        if (str == null || vmf.F(str)) {
            yy7[] yy7VarArr = PickerMembersListWidget.y0;
            if (!fni.a(pickerMembersListWidget.B0().getAdapter(), dxbVar)) {
                ocg ocgVar = pickerMembersListWidget.v0;
                if (ocgVar != null) {
                    ocgVar.b(pickerMembersListWidget.B0());
                }
                pickerMembersListWidget.B0().K0(dxbVar, false);
                pickerMembersListWidget.v0 = x7j.c(pickerMembersListWidget.B0());
                if (pickerMembersListWidget.z0()) {
                    EndlessRecyclerView2 endlessRecyclerView2B0 = pickerMembersListWidget.B0();
                    q67 q67Var = pickerMembersListWidget.w0;
                    if (q67Var != null) {
                        endlessRecyclerView2B0.p0(q67Var);
                    }
                    pickerMembersListWidget.w0 = null;
                    okf okfVar = pickerMembersListWidget.x0;
                    if (okfVar != null) {
                        endlessRecyclerView2B0.p0(okfVar);
                    }
                    pickerMembersListWidget.x0 = null;
                    pickerMembersListWidget.y0(pickerMembersListWidget.B0());
                }
            }
        } else {
            yy7[] yy7VarArr2 = PickerMembersListWidget.y0;
            if (!fni.a(pickerMembersListWidget.B0().getAdapter(), dxbVar2)) {
                ocg ocgVar2 = pickerMembersListWidget.v0;
                if (ocgVar2 != null) {
                    ocgVar2.b(pickerMembersListWidget.B0());
                }
                pickerMembersListWidget.B0().K0(dxbVar2, false);
                pickerMembersListWidget.v0 = x7j.c(pickerMembersListWidget.B0());
                if (pickerMembersListWidget.z0()) {
                    EndlessRecyclerView2 endlessRecyclerView2B02 = pickerMembersListWidget.B0();
                    q67 q67Var2 = pickerMembersListWidget.w0;
                    if (q67Var2 != null) {
                        endlessRecyclerView2B02.p0(q67Var2);
                    }
                    pickerMembersListWidget.w0 = null;
                    okf okfVar2 = pickerMembersListWidget.x0;
                    if (okfVar2 != null) {
                        endlessRecyclerView2B02.p0(okfVar2);
                    }
                    pickerMembersListWidget.x0 = null;
                }
            }
        }
        return qqg.a;
    }
}
