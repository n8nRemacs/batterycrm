package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class msg extends dtf implements sm6 {
    public final /* synthetic */ psg X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ List Z;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msg(psg psgVar, long j, List list, Continuation continuation) {
        super(2, continuation);
        this.X = psgVar;
        this.Y = j;
        this.Z = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((msg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        msg msgVar = new msg(this.X, this.Y, this.Z, continuation);
        msgVar.o = obj;
        return msgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return svi.e((f84) this.o, null, null, new lsg(this.X, this.Y, this.Z, null), 3);
    }
}
