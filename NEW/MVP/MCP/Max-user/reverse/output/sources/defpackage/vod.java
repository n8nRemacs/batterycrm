package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class vod extends dtf implements sm6 {
    public final /* synthetic */ wod o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vod(wod wodVar, Continuation continuation) {
        super(2, continuation);
        this.o = wodVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vod vodVar = (vod) l(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vodVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new vod(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        wod wodVar = this.o;
        wqi.c(wodVar.o, "executeTasks", new Object[0]);
        she.v((c6i) wodVar.a.getValue());
        ((vm9) wodVar.b.getValue()).a();
        return qqg.a;
    }
}
