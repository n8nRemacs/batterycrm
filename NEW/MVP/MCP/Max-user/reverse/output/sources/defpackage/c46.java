package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import one.me.rlottie.RLottieImageView;
import one.me.sdk.concurrent.watchdog.ThreadExecutorStuckException;

/* loaded from: classes.dex */
public final /* synthetic */ class c46 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ c46(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) throws IOException {
        StackTraceElement[] stackTrace;
        int i = this.a;
        long j = this.b;
        switch (i) {
            case 0:
                return Long.valueOf(j);
            case 1:
                return Boolean.valueOf(((pb2) obj).b.a == j);
            case 2:
                return Boolean.valueOf(fni.a(rqi.c((RLottieImageView) obj, p0d.tag_reaction_effects_view), Long.valueOf(j)));
            case 3:
                return Boolean.valueOf(((yyb) obj).a == j);
            default:
                ckh ckhVar = (ckh) obj;
                int i2 = ThreadExecutorStuckException.a;
                List list = ckhVar.e;
                long j2 = ckhVar.b;
                long j3 = ckhVar.c;
                StringBuilder sb = new StringBuilder("WatchdogTask(\n\tsubmitThread='");
                sb.append(ckhVar.a);
                sb.append("',\n\trunningThread='");
                Thread thread = ckhVar.d;
                String strN = null;
                String name = thread != null ? thread.getName() : null;
                if (name == null) {
                    name = "";
                }
                sb.append(name);
                long jB = ckhVar.b(j);
                if (s65.d(jB, 0L) > 0) {
                    sb.append("',\n\texecutionTime=");
                    sb.append(s65.g(jB));
                }
                if (s65.e(j3, j2)) {
                    j3 = j;
                }
                long jG = s65.g(s65.k(j3, j2));
                if (jG > 0) {
                    sb.append(",\n\tqueueTime=");
                    sb.append(jG);
                }
                if (thread != Thread.currentThread()) {
                    sb.append(",\n\tstate=" + (thread != null ? thread.getState() : null));
                    sb.append(",\n\tlocked_stacktrace=\n");
                    if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            if (!dnf.r(stackTraceElement.getClassName(), "java.util.concurrent", false) && !dnf.r(stackTraceElement.getClassName(), "kotlinx.coroutines", false)) {
                                arrayList.add(stackTraceElement);
                            }
                        }
                        strN = ue3.N(ue3.Y(arrayList, 3), "\n\t\t\t", "\t\t", null, null, 60);
                    }
                    sb.append(strN);
                }
                if (!list.isEmpty()) {
                    sb.append("\n\tsubmit_stacktrace=\n\t");
                    sb.append(ue3.N(ue3.Y(list, 5), "\n\t\t", null, null, null, 62));
                }
                sb.append("\n)");
                return sb.toString();
        }
    }
}
