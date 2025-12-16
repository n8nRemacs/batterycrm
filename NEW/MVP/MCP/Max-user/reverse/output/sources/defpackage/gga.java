package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gga extends dtf implements sm6 {
    public final /* synthetic */ oga X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gga(oga ogaVar, Continuation continuation) {
        super(2, continuation);
        this.X = ogaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gga ggaVar = (gga) l((o8c) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ggaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gga ggaVar = new gga(this.X, continuation);
        ggaVar.o = obj;
        return ggaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        g8j.b(obj);
        o8c o8cVar = (o8c) this.o;
        if (o8cVar != null) {
            zea zeaVar = o8cVar.c;
            this.X.y0.m(null, o8cVar.a);
            this.X.X.m(null, o8cVar.b);
            if (zeaVar != null) {
                this.X.o = zeaVar;
                this.X.d.d(zeaVar);
                return qqgVar;
            }
        }
        return qqgVar;
    }
}
