package defpackage;

import java.util.Arrays;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;

/* loaded from: classes2.dex */
public final class ss3 {
    public final i21 a;
    public final y6d b;
    public final rs3 c;
    public double e;
    public volatile boolean i;
    public volatile boolean j;
    public final dq0 d = new dq0(0);
    public final hk8 f = new hk8();
    public double g = 1.0d;
    public final s6b h = new s6b(8);

    public ss3(i21 i21Var, y6d y6dVar, rs3 rs3Var) {
        this.a = i21Var;
        this.b = y6dVar;
        this.c = rs3Var;
        y6dVar.log("CallAnalyticsLoggerConnectivityTracker", "Configuration: " + rs3Var);
    }

    public final void a() {
        if (this.i && this.j) {
            double d = this.g;
            rs3 rs3Var = this.c;
            if (d <= rs3Var.b && this.e >= rs3Var.c) {
                if (this.a.c) {
                    b("Already enabled");
                } else {
                    b("Enable upload analytics");
                }
                i21 i21Var = this.a;
                if (i21Var.c) {
                    return;
                }
                i21Var.c = true;
                ((CallAnalyticsSender) i21Var.e).setIdle(true);
                return;
            }
        }
        if (this.a.c) {
            b("Disable upload analytics");
        } else {
            b("Already disabled");
        }
        i21 i21Var2 = this.a;
        if (i21Var2.c) {
            i21Var2.c = false;
            ((CallAnalyticsSender) i21Var2.e).setIdle(i21Var2.b);
        }
    }

    public final void b(String str) {
        this.b.log("CallAnalyticsLoggerConnectivityTracker", str + ": signaling_connected=" + this.i + ", pc_connected=" + this.j + ", bitrate=" + String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.e)}, 1)) + ", loss=" + String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.g)}, 1)));
    }
}
