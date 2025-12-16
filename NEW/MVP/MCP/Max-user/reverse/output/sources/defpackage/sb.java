package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;
import one.me.sdk.uikit.common.views.EmptySearchView;

/* loaded from: classes2.dex */
public final class sb extends dtf implements sm6 {
    public final /* synthetic */ AdminsFromContactsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(Continuation continuation, AdminsFromContactsScreen adminsFromContactsScreen) {
        super(2, continuation);
        this.X = adminsFromContactsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        sb sbVar = (sb) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        sbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        sb sbVar = new sb(continuation, this.X);
        sbVar.o = obj;
        return sbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List list = (List) this.o;
        yy7[] yy7VarArr = AdminsFromContactsScreen.t0;
        AdminsFromContactsScreen adminsFromContactsScreen = this.X;
        boolean zT = ((ac) adminsFromContactsScreen.c.getValue()).t();
        if (zT) {
            RecyclerView recyclerViewZ0 = adminsFromContactsScreen.z0();
            okf okfVar = adminsFromContactsScreen.Y;
            if (okfVar != null) {
                recyclerViewZ0.p0(okfVar);
            }
            adminsFromContactsScreen.Y = null;
        } else {
            RecyclerView recyclerViewZ02 = adminsFromContactsScreen.z0();
            okf okfVar2 = adminsFromContactsScreen.Y;
            if (okfVar2 != null) {
                recyclerViewZ02.p0(okfVar2);
            }
            adminsFromContactsScreen.Y = null;
            adminsFromContactsScreen.y0(adminsFromContactsScreen.z0());
        }
        boolean z = zT && list.isEmpty();
        ((EmptySearchView) adminsFromContactsScreen.o.D(adminsFromContactsScreen, AdminsFromContactsScreen.t0[2])).setVisibility(z ? 0 : 8);
        adminsFromContactsScreen.z0().setVisibility(z ? 8 : 0);
        adminsFromContactsScreen.s0.E(list);
        return qqg.a;
    }
}
