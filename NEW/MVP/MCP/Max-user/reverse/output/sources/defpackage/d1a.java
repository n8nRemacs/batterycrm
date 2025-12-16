package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class d1a extends dtf implements sm6 {
    public final /* synthetic */ k1a X;
    public final /* synthetic */ Object Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1a(k1a k1aVar, List list, Continuation continuation) {
        super(2, continuation);
        this.X = k1aVar;
        this.Y = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((d1a) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new d1a(this.X, this.Y, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        int i2 = s65.d;
        long jH = v9j.h(2, y65.SECONDS);
        this.o = 1;
        Object objJ = this.X.j(jH, this, this.Y);
        g84 g84Var = g84.a;
        return objJ == g84Var ? g84Var : objJ;
    }
}
