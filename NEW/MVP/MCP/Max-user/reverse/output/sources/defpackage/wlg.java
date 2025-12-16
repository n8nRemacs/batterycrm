package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wlg extends dtf implements sm6 {
    public final /* synthetic */ String X;
    public final /* synthetic */ emg o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wlg(emg emgVar, String str, Continuation continuation) {
        super(2, continuation);
        this.o = emgVar;
        this.X = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        wlg wlgVar = (wlg) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wlgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new wlg(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        emg emgVar = this.o;
        AtomicReference atomicReference = emgVar.y0;
        tcf tcfVar = emgVar.w0;
        log logVar = (log) tcfVar.getValue();
        boolean z = logVar instanceof gog;
        String str = this.X;
        qqg qqgVar = qqg.a;
        if (z) {
            String str2 = (String) atomicReference.getAndUpdate(new uhf(str, 2));
            gog gogVar = (gog) logVar;
            if (gogVar.c.c != null && !fni.a(str2, str)) {
                tcfVar.m(null, gog.c(gogVar, jog.a(gogVar.c, null)));
                return qqgVar;
            }
        } else if (logVar instanceof iog) {
            String str3 = (String) atomicReference.getAndUpdate(new uhf(str, 2));
            iog iogVar = (iog) logVar;
            if (iogVar.b.c != null && !fni.a(str3, str)) {
                tcfVar.m(null, iog.c(iogVar, jog.a(iogVar.b, null), null, 11));
                return qqgVar;
            }
        } else if (logVar instanceof fog) {
            fog fogVar = (fog) logVar;
            jog jogVar = fogVar.c;
            if (jogVar.c != null) {
                tcfVar.m(null, fog.c(fogVar, jog.a(jogVar, null)));
                return qqgVar;
            }
        } else if (logVar instanceof hog) {
            hog hogVar = (hog) logVar;
            jog jogVar2 = hogVar.c;
            if (jogVar2.c != null) {
                tcfVar.m(null, hog.c(hogVar, jog.a(jogVar2, null)));
                return qqgVar;
            }
        } else if (logVar != null && !(logVar instanceof kog)) {
            throw new NoWhenBranchMatchedException();
        }
        return qqgVar;
    }
}
