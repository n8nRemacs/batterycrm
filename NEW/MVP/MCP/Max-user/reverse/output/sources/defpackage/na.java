package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class na extends dtf implements sm6 {
    public final /* synthetic */ AdminWaitingRoomScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(AdminWaitingRoomScreen adminWaitingRoomScreen, Continuation continuation) {
        super(2, continuation);
        this.X = adminWaitingRoomScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        na naVar = (na) l((pa) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        naVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        na naVar = new na(this.X, continuation);
        naVar.o = obj;
        return naVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        pa paVar = (pa) this.o;
        List list = paVar.b;
        yy7[] yy7VarArr = AdminWaitingRoomScreen.Z;
        AdminWaitingRoomScreen adminWaitingRoomScreen = this.X;
        ((la) adminWaitingRoomScreen.Y.getValue()).E(list);
        bbd bbdVar = adminWaitingRoomScreen.d;
        yy7[] yy7VarArr2 = AdminWaitingRoomScreen.Z;
        hqi.g((OneMeButton) bbdVar.D(adminWaitingRoomScreen, yy7VarArr2[2]), !list.isEmpty(), 0L, null, 6);
        hqi.g((OneMeButton) adminWaitingRoomScreen.o.D(adminWaitingRoomScreen, yy7VarArr2[3]), !list.isEmpty(), 0L, null, 6);
        hqi.g((RecyclerView) adminWaitingRoomScreen.c.D(adminWaitingRoomScreen, yy7VarArr2[1]), !list.isEmpty(), 0L, null, 6);
        hqi.g((x3b) adminWaitingRoomScreen.X.D(adminWaitingRoomScreen, yy7VarArr2[4]), paVar.b.isEmpty() && paVar != pa.c, 0L, null, 6);
        ((yfb) adminWaitingRoomScreen.b.D(adminWaitingRoomScreen, yy7VarArr2[0])).setSubtitle(paVar.a.b(adminWaitingRoomScreen.getContext()));
        return qqg.a;
    }
}
