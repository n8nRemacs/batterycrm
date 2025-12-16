package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class lx extends dtf implements sm6 {
    public final /* synthetic */ px X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(px pxVar, Continuation continuation) {
        super(2, continuation);
        this.X = pxVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((lx) l((Throwable) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lx lxVar = new lx(this.X, continuation);
        lxVar.o = obj;
        return lxVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        boolean z;
        String str = this.X.i;
        g8j.b(obj);
        Throwable th = (Throwable) this.o;
        if ((th instanceof TamErrorException) && qaj.c(((TamErrorException) th).a.b)) {
            wqi.e(str, "request failed with " + th + ". Retrying", null);
            z = true;
        } else {
            wqi.e(str, "request failed with " + th + ". Couldn't recover", null);
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
