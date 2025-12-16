package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xlg extends dtf implements sm6 {
    public final /* synthetic */ String X;
    public final /* synthetic */ emg o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlg(emg emgVar, String str, Continuation continuation) {
        super(2, continuation);
        this.o = emgVar;
        this.X = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xlg xlgVar = (xlg) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xlgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xlg(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        emg emgVar = this.o;
        tcf tcfVar = emgVar.w0;
        log logVar = (log) tcfVar.getValue();
        boolean z = logVar instanceof iog;
        qqg qqgVar = qqg.a;
        if (z) {
            AtomicReference atomicReference = emgVar.z0;
            String str = this.X;
            String str2 = (String) atomicReference.getAndUpdate(new uhf(str, 2));
            iog iogVar = (iog) logVar;
            if (iogVar.c.c != null && !fni.a(str2, str)) {
                tcfVar.m(null, iog.c(iogVar, null, jog.a(iogVar.c, null), 7));
            }
        }
        return qqgVar;
    }
}
