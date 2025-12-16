package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rtf extends dtf implements wm6 {
    public /* synthetic */ Throwable X;
    public final /* synthetic */ ytf Y;
    public final /* synthetic */ ttg Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtf(ytf ytfVar, ttg ttgVar, Continuation continuation) {
        super(4, continuation);
        this.Y = ytfVar;
        this.Z = ttgVar;
    }

    @Override // defpackage.wm6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).longValue();
        rtf rtfVar = new rtf(this.Y, this.Z, (Continuation) obj4);
        rtfVar.X = (Throwable) obj2;
        return rtfVar.n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        ttg ttgVar = this.Z;
        ytf ytfVar = this.Y;
        if (i == 0) {
            g8j.b(obj);
            Throwable th = this.X;
            String str = ttgVar.a.d;
            this.o = 1;
            obj = ytf.c(ytfVar, str, th, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            tgg tggVar = ytfVar.a;
            String str2 = ttgVar.a.d;
            tggVar.getClass();
            kvg kvgVar = kvg.g;
            kvgVar.getClass();
            kvgVar.a(str2, new imb(q0f.URL_TYPE_RETRY, 1));
        }
        return obj;
    }
}
