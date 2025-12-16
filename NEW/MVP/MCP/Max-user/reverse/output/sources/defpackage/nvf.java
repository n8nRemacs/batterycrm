package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nvf extends dtf implements sm6 {
    public zf8 X;
    public int Y;
    public final /* synthetic */ qvf Z;
    public qvf o;
    public final /* synthetic */ zf8 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvf(qvf qvfVar, zf8 zf8Var, Continuation continuation) {
        super(2, continuation);
        this.Z = qvfVar;
        this.s0 = zf8Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((nvf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nvf(this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        zf8 zf8Var;
        qvf qvfVar;
        Throwable th;
        int i = this.Y;
        try {
            if (i == 0) {
                g8j.b(obj);
                qvf qvfVar2 = this.Z;
                zf8Var = this.s0;
                try {
                    hwa hwaVar = (hwa) qvfVar2.c.getValue();
                    this.o = qvfVar2;
                    this.X = zf8Var;
                    this.Y = 1;
                    Object objF = hwaVar.F(zf8Var, this);
                    g84 g84Var = g84.a;
                    return objF == g84Var ? g84Var : objF;
                } catch (Throwable th2) {
                    qvfVar = qvfVar2;
                    th = th2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zf8Var = this.X;
                qvfVar = this.o;
                try {
                    g8j.b(obj);
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            wqi.p(qvfVar.g, zf8Var + " fail", th);
            return null;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
