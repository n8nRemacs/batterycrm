package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;

/* loaded from: classes2.dex */
public final class uec extends dtf implements sm6 {
    public final /* synthetic */ ProfileEditAdminPermissionsWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uec(Continuation continuation, ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget) {
        super(2, continuation);
        this.X = profileEditAdminPermissionsWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        uec uecVar = (uec) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        uecVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        uec uecVar = new uec(continuation, this.X);
        uecVar.o = obj;
        return uecVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof gec) {
            rfc.c.p0().b(a9h.d(((gec) cdaVar).b, ":chats?id=", "&type=local"), null);
        } else if (cdaVar instanceof jc3) {
            ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.X;
            x9f x9fVar = profileEditAdminPermissionsWidget.v0;
            if (x9fVar != null) {
                x9fVar.cancel((CancellationException) null);
            }
            api.c(profileEditAdminPermissionsWidget);
            profileEditAdminPermissionsWidget.getRouter().B(profileEditAdminPermissionsWidget);
        } else if (cdaVar instanceof ei4) {
            rfc.c.s0((ei4) cdaVar);
        }
        return qqg.a;
    }
}
