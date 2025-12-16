package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profileedit.ProfileEditScreen;

/* loaded from: classes2.dex */
public final class mgc extends dtf implements sm6 {
    public final /* synthetic */ ProfileEditScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgc(ProfileEditScreen profileEditScreen, Continuation continuation) {
        super(2, continuation);
        this.X = profileEditScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        mgc mgcVar = (mgc) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        mgcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mgc mgcVar = new mgc(this.X, continuation);
        mgcVar.o = obj;
        return mgcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.o.E((List) this.o);
        return qqg.a;
    }
}
