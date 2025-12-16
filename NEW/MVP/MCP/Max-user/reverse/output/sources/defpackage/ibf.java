package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class ibf extends dtf implements sm6 {
    public final /* synthetic */ nbf o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibf(nbf nbfVar, Continuation continuation) {
        super(2, continuation);
        this.o = nbfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ibf ibfVar = (ibf) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ibfVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ibf(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        nbf nbfVar = this.o;
        tcf tcfVar = nbfVar.x0;
        o98 o98VarD = ve3.d();
        o98VarD.add(new k94(ndb.s, yud.Z1, new n5g(mvd.x)));
        l5c l5cVar = (l5c) nbfVar.c;
        l5cVar.getClass();
        if (l5cVar.j(PmsKey.f27channelsenabled, false)) {
            o98VarD.add(new k94(ndb.r, y9b.l, new n5g(mvd.P)));
        }
        tcfVar.setValue(ve3.a(o98VarD));
        return qqg.a;
    }
}
