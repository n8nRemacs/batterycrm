package defpackage;

import android.util.Log;
import androidx.viewpager.widget.ViewPager;
import androidx.work.Worker;
import java.io.IOException;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class thg implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ thg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((f54) this.b).d();
                return;
            case 1:
                api.f(((veb) this.b).a);
                return;
            case 2:
                ((lfh) this.b).n(0);
                return;
            case 3:
                ((ViewPager) this.b).setScrollState(0);
                return;
            case 4:
                Worker worker = (Worker) this.b;
                try {
                    worker.a.i(worker.a());
                    return;
                } catch (Throwable th) {
                    worker.a.j(th);
                    return;
                }
            case 5:
                k01 k01Var = (k01) this.b;
                k01Var.P.log("OKRTCCall", "💀 pc.timeout");
                m07 m07Var = m07.a;
                k01Var.e(m07Var);
                k01Var.K = m07Var;
                k01Var.f1.D(ConversationEndReason.PeerConnectionTimeout.INSTANCE);
                k01Var.l(x71.c, null);
                return;
            case 6:
                Object socketLock = ((q0f) this.b).getSocketLock();
                q0f q0fVar = (q0f) this.b;
                synchronized (socketLock) {
                    q0fVar.getSignalingLogger().a("transport.DISCONNECT");
                    q0fVar.safelyCloseSocketWithCodeAndReason(1001, "dispose");
                }
                return;
            case 7:
                ie8 ie8Var = (ie8) ((k5i) this.b).o;
                try {
                    ie8Var.g.execute(new m1h(17, this));
                    return;
                } catch (Throwable th2) {
                    ie8Var.n.logException("OKRTCLmsAdapter", "Unexpected executor usage error", th2);
                    return;
                }
            case 8:
                ((wai) this.b).e();
                return;
            case 9:
                fl flVar = ((wai) ((znd) this.b).a).d;
                flVar.b(flVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 10:
                ((hbi) this.b).j.f(new es3(4));
                return;
            case 11:
                throw null;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ujh ujhVar = (ujh) this.b;
                synchronized (ujhVar.a) {
                    try {
                        if (ujhVar.b()) {
                            Log.e("WakeLock", String.valueOf(ujhVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            ujhVar.d();
                            if (ujhVar.b()) {
                                ujhVar.c = 1;
                                ujhVar.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 13:
                if (((n2g) this.b).c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            default:
                synchronized (((qpi) this.b).c) {
                    ((kva) ((qpi) this.b).d).b();
                }
                return;
        }
    }

    public /* synthetic */ thg(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj2;
    }
}
