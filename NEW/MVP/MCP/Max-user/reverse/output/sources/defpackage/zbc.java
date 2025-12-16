package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;

/* loaded from: classes2.dex */
public final class zbc extends dtf implements sm6 {
    public final /* synthetic */ ProfileAvatarsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbc(Continuation continuation, ProfileAvatarsScreen profileAvatarsScreen) {
        super(2, continuation);
        this.X = profileAvatarsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zbc zbcVar = (zbc) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zbcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zbc zbcVar = new zbc(continuation, this.X);
        zbcVar.o = obj;
        return zbcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        hcc hccVar = (hcc) this.o;
        boolean zA = fni.a(hccVar, gcc.a);
        ProfileAvatarsScreen profileAvatarsScreen = this.X;
        if (zA) {
            yy7[] yy7VarArr = ProfileAvatarsScreen.y0;
            profileAvatarsScreen.J0(true);
        } else if (fni.a(hccVar, ccc.a)) {
            yy7[] yy7VarArr2 = ProfileAvatarsScreen.y0;
            profileAvatarsScreen.J0(false);
        } else if (fni.a(hccVar, bcc.a)) {
            yy7[] yy7VarArr3 = ProfileAvatarsScreen.y0;
            profileAvatarsScreen.getRouter().C();
        } else if (hccVar instanceof ecc) {
            yy7[] yy7VarArr4 = ProfileAvatarsScreen.y0;
            String str = ap7.a;
            ap7.h(profileAvatarsScreen.getContext(), ((ecc) hccVar).a, "image/*");
        } else if (hccVar instanceof dcc) {
            dcc dccVar = (dcc) hccVar;
            yy7[] yy7VarArr5 = ProfileAvatarsScreen.y0;
            CharSequence charSequenceB = dccVar.a.b(profileAvatarsScreen.getContext());
            if (charSequenceB != null) {
                int i = dccVar.b ? yud.J : yud.o;
                ccb ccbVar = new ccb(profileAvatarsScreen);
                ccbVar.e(new qcb(i));
                ccbVar.h(charSequenceB);
                ccbVar.i();
            }
        } else {
            if (!(hccVar instanceof fcc)) {
                throw new NoWhenBranchMatchedException();
            }
            fcc fccVar = (fcc) hccVar;
            int size = profileAvatarsScreen.v0.v0.size();
            int i2 = fccVar.a;
            if (i2 >= 0 && i2 < size) {
                profileAvatarsScreen.O0().e(fccVar.a, true);
            }
        }
        return qqg.a;
    }
}
