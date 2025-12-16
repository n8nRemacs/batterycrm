package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b6e extends dtf implements sm6 {
    public final /* synthetic */ c6e X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6e(c6e c6eVar, Continuation continuation) {
        super(2, continuation);
        this.X = c6eVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        b6e b6eVar = (b6e) l((u27) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        b6eVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        b6e b6eVar = new b6e(this.X, continuation);
        b6eVar.o = obj;
        return b6eVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        long j = ((u27) this.o).b;
        c6e c6eVar = this.X;
        ci5 ci5Var = c6eVar.Z;
        k6e k6eVar = k6e.c;
        long j2 = c6eVar.b;
        boolean z = c6eVar.c == uf2.b;
        k6eVar.getClass();
        StringBuilder sbN = ho7.n(":chats?id=", j2, "&type=", z ? "local" : "server");
        sbN.append("&message_id=");
        sbN.append(j);
        xc0.l(sbN.toString(), ci5Var);
        return qqg.a;
    }
}
