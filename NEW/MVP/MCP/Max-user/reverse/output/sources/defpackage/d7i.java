package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d7i extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ e7i Y;
    public final /* synthetic */ zmd Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7i(e7i e7iVar, zmd zmdVar, Continuation continuation) {
        super(2, continuation);
        this.Y = e7iVar;
        this.Z = zmdVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((d7i) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        d7i d7iVar = new d7i(this.Y, this.Z, continuation);
        d7iVar.X = obj;
        return d7iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object obj2 = this.o;
        try {
            if (obj2 == 0) {
                g8j.b(obj);
                f84 f84Var = (f84) this.X;
                e7i e7iVar = this.Y;
                mbd mbdVarB = ((sua) e7iVar.c.getValue()).b(this.Z);
                this.X = f84Var;
                this.o = 1;
                obj = kti.a(mbdVarB, this);
                g84 g84Var = g84.a;
                obj2 = f84Var;
                if (obj == g84Var) {
                    return g84Var;
                }
            } else {
                if (obj2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f84 f84Var2 = (f84) this.X;
                g8j.b(obj);
                obj2 = f84Var2;
            }
            qod qodVar = ((ood) obj).Y;
            if (qodVar != null) {
                return new JSONObject(qodVar.Q());
            }
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            wqi.p(obj2.getClass().getName(), "fail to geocode", th);
            return null;
        }
    }
}
