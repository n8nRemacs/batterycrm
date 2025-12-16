package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class wec extends dtf implements sm6 {
    public final /* synthetic */ ProfileEditAdminPermissionsWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wec(Continuation continuation, ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget) {
        super(2, continuation);
        this.X = profileEditAdminPermissionsWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        wec wecVar = (wec) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wecVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wec wecVar = new wec(continuation, this.X);
        wecVar.o = obj;
        return wecVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        kec kecVar = (kec) this.o;
        ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.X;
        vnd vndVar = profileEditAdminPermissionsWidget.s0;
        if (vndVar.e()) {
            ((OneMeButton) vndVar.getValue()).setVisibility(kecVar.b ? 0 : 8);
            profileEditAdminPermissionsWidget.A0();
        }
        profileEditAdminPermissionsWidget.X.E(kecVar.a);
        return qqg.a;
    }
}
