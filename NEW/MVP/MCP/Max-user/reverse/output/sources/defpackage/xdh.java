package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xdh extends dtf implements sm6 {
    public final /* synthetic */ aeh o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdh(aeh aehVar, Continuation continuation) {
        super(2, continuation);
        this.o = aehVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xdh xdhVar = (xdh) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xdhVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xdh(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        aeh aehVar = this.o;
        aehVar.v((String) aehVar.s0.getValue(), true);
        return qqg.a;
    }
}
