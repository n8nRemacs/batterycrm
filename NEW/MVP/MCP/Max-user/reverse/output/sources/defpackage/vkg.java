package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vkg extends dtf implements sm6 {
    public final /* synthetic */ String X;
    public final /* synthetic */ xkg o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vkg(xkg xkgVar, String str, Continuation continuation) {
        super(2, continuation);
        this.o = xkgVar;
        this.X = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vkg vkgVar = (vkg) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vkgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new vkg(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xkg xkgVar = this.o;
        tcf tcfVar = xkgVar.w0;
        log logVar = (log) tcfVar.getValue();
        boolean z = logVar instanceof gog;
        qqg qqgVar = qqg.a;
        if (z) {
            AtomicReference atomicReference = xkgVar.y0;
            String str = this.X;
            String str2 = (String) atomicReference.getAndUpdate(new uhf(str, 2));
            gog gogVar = (gog) logVar;
            if (gogVar.c.c != null && !fni.a(str2, str)) {
                tcfVar.m(null, gog.c(gogVar, jog.a(gogVar.c, null)));
            }
        }
        return qqgVar;
    }
}
