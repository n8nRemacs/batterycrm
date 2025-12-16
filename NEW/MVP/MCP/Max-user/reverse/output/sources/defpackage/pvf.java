package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pvf extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ qvf Y;
    public final /* synthetic */ l8a Z;
    public qvf o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvf(qvf qvfVar, l8a l8aVar, Continuation continuation) {
        super(2, continuation);
        this.Y = qvfVar;
        this.Z = l8aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pvf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new pvf(this.Y, this.Z, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [qvf] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object obj2 = this.X;
        qqg qqgVar = qqg.a;
        try {
            if (obj2 == 0) {
                g8j.b(obj);
                qvf qvfVar = this.Y;
                l8a l8aVar = this.Z;
                this.o = qvfVar;
                this.X = 1;
                Object objD = d7j.d(new ovf(qvfVar, l8aVar, null), this);
                obj2 = g84.a;
                if (objD != obj2) {
                    objD = qqgVar;
                }
                if (objD == obj2) {
                    return obj2;
                }
            } else {
                if (obj2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.o;
                g8j.b(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            wqi.p(obj2.g, "fail", th);
        }
        return qqgVar;
    }
}
