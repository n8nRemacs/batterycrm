package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes.dex */
public final class oo5 extends dtf implements sm6 {
    public final /* synthetic */ qo5 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo5(qo5 qo5Var, Continuation continuation) {
        super(2, continuation);
        this.X = qo5Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((oo5) l((Throwable) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        oo5 oo5Var = new oo5(this.X, continuation);
        oo5Var.o = obj;
        return oo5Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        boolean z;
        lg8 lg8Var = lg8.Y;
        g8j.b(obj);
        Throwable th = (Throwable) this.o;
        if ((th instanceof TamErrorException) && qaj.c(((TamErrorException) th).a.b)) {
            String str = this.X.d;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "ExternalCallback request failed with " + th + ". Retrying", null);
            }
            z = true;
        } else {
            String str2 = this.X.d;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, str2, "ExternalCallback request failed with " + th + ". Couldn't recover", null);
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
