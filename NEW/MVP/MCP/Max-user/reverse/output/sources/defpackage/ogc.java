package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.ProfileEditScreen;

/* loaded from: classes2.dex */
public final class ogc extends dtf implements sm6 {
    public final /* synthetic */ ProfileEditScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogc(ProfileEditScreen profileEditScreen, Continuation continuation) {
        super(2, continuation);
        this.X = profileEditScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ogc ogcVar = (ogc) l((tgc) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ogcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ogc ogcVar = new ogc(this.X, continuation);
        ogcVar.o = obj;
        return ogcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        tgc tgcVar = (tgc) this.o;
        if (tgcVar == null) {
            throw new NoWhenBranchMatchedException();
        }
        n5g n5gVar = tgcVar.a;
        ProfileEditScreen profileEditScreen = this.X;
        CharSequence charSequenceB = n5gVar.b(profileEditScreen.getContext());
        qqg qqgVar = qqg.a;
        if (charSequenceB == null) {
            return qqgVar;
        }
        ccb ccbVar = new ccb(profileEditScreen);
        ccbVar.e(tcb.a);
        ccbVar.h(charSequenceB);
        ccbVar.f(vcb.a);
        ccbVar.c(new kcb(0, 0, tgcVar.b, 3));
        ccbVar.d(tgcVar.c);
        ccbVar.i();
        return qqgVar;
    }
}
