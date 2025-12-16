package ru.ok.android.externcalls.sdk.net.internal.monitor;

import defpackage.a7d;
import defpackage.fni;
import defpackage.hk8;
import defpackage.i9f;
import defpackage.kti;
import defpackage.l9f;
import defpackage.n7j;
import defpackage.nm0;
import defpackage.qra;
import defpackage.vqa;
import defpackage.y6d;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00070\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitorImpl;", "Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitor;", "Ly6d;", "logger", "<init>", "(Ly6d;)V", "La7d;", "Lru/ok/android/externcalls/sdk/net/internal/monitor/NetworkStat;", "mapToMonitoringStat", "(La7d;)Lru/ok/android/externcalls/sdk/net/internal/monitor/NetworkStat;", "Lvqa;", "observeStat", "()Lvqa;", "rtcStat", "Lqqg;", "onRtcStats", "(La7d;)V", "Ly6d;", "Lnm0;", "kotlin.jvm.PlatformType", "statSubject", "Lnm0;", "Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitorImpl$LossCalculator;", "audioLossCalculator", "Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitorImpl$LossCalculator;", "videoLossCalculator", "Companion", "LossCalculator", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StatMonitorImpl implements StatMonitor {
    private static final String LOG_TAG = "StatMonitorImpl";
    private final y6d logger;
    private final nm0 statSubject = new nm0(null);
    private final LossCalculator audioLossCalculator = new LossCalculator();
    private final LossCalculator videoLossCalculator = new LossCalculator();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\t\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\b¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000e*\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0013\u001a\u0004\u0018\u00010\u000e\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/net/internal/monitor/StatMonitorImpl$LossCalculator;", "", "<init>", "()V", "Li9f;", "T", "", "Ll9f;", "ssrcs", "findSender", "(Ljava/util/List;)Li9f;", "Ljava/math/BigInteger;", "packetLost", "packetSent", "", "calculateLoss", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/lang/Float;", "round", "(F)F", "getLoss", "(Ljava/util/List;)Ljava/lang/Float;", "Lhk8;", "lossCalc", "Lhk8;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LossCalculator {
        private final hk8 lossCalc = new hk8();

        /* JADX INFO: Access modifiers changed from: private */
        public final Float calculateLoss(BigInteger packetLost, BigInteger packetSent) {
            if (packetSent == null || packetLost == null) {
                return null;
            }
            return Float.valueOf(round(n7j.b((float) this.lossCalc.a(packetLost.longValue(), packetSent.longValue()), 0.0f, 1.0f)));
        }

        private final /* synthetic */ <T extends i9f> T findSender(List<? extends l9f> ssrcs) {
            Iterator<T> it = ssrcs.iterator();
            if (!it.hasNext()) {
                fni.h();
                throw null;
            }
            fni.h();
            throw null;
        }

        private final float round(float f) {
            return kti.d(f * 100.0f) / 100.0f;
        }

        public final /* synthetic */ <T extends i9f> Float getLoss(List<? extends l9f> ssrcs) {
            Iterator<T> it = ssrcs.iterator();
            if (!it.hasNext()) {
                fni.h();
                throw null;
            }
            fni.h();
            throw null;
        }
    }

    public StatMonitorImpl(y6d y6dVar) {
        this.logger = y6dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final ru.ok.android.externcalls.sdk.net.internal.monitor.NetworkStat mapToMonitoringStat(defpackage.a7d r9) {
        /*
            r8 = this;
            u42 r0 = r9.c()
            if (r0 != 0) goto L13
            ru.ok.android.externcalls.sdk.net.internal.monitor.NetworkStat r1 = new ru.ok.android.externcalls.sdk.net.internal.monitor.NetworkStat
            r6 = 15
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L13:
            java.lang.String r1 = r0.h
            r2 = 0
            if (r1 == 0) goto L36
            yid r3 = defpackage.q1e.a     // Catch: java.lang.NumberFormatException -> L29
            boolean r3 = r3.a(r1)     // Catch: java.lang.NumberFormatException -> L29
            if (r3 == 0) goto L29
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L29
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L36
            float r1 = r1.floatValue()
            int r1 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L37
        L36:
            r1 = r2
        L37:
            java.util.List r9 = r9.c
            java.util.ArrayList r9 = defpackage.lbj.e(r9, r0)
            ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitorImpl$LossCalculator r3 = r8.audioLossCalculator
            java.util.Iterator r4 = r9.iterator()
        L43:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L61
            java.lang.Object r5 = r4.next()
            r6 = r5
            l9f r6 = (defpackage.l9f) r6
            boolean r7 = r6 instanceof defpackage.g9f
            if (r7 == 0) goto L43
            i9f r6 = (defpackage.i9f) r6
            java.lang.Boolean r6 = r6.l
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            boolean r6 = defpackage.fni.a(r6, r7)
            if (r6 == 0) goto L43
            goto L62
        L61:
            r5 = r2
        L62:
            boolean r4 = r5 instanceof defpackage.g9f
            if (r4 != 0) goto L67
            r5 = r2
        L67:
            g9f r5 = (defpackage.g9f) r5
            if (r5 != 0) goto L6d
            r3 = r2
            goto L75
        L6d:
            java.math.BigInteger r4 = r5.i
            java.math.BigInteger r5 = r5.h
            java.lang.Float r3 = ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitorImpl.LossCalculator.access$calculateLoss(r3, r4, r5)
        L75:
            ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitorImpl$LossCalculator r4 = r8.videoLossCalculator
            java.util.Iterator r9 = r9.iterator()
        L7b:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L99
            java.lang.Object r5 = r9.next()
            r6 = r5
            l9f r6 = (defpackage.l9f) r6
            boolean r7 = r6 instanceof defpackage.k9f
            if (r7 == 0) goto L7b
            i9f r6 = (defpackage.i9f) r6
            java.lang.Boolean r6 = r6.l
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            boolean r6 = defpackage.fni.a(r6, r7)
            if (r6 == 0) goto L7b
            goto L9a
        L99:
            r5 = r2
        L9a:
            boolean r9 = r5 instanceof defpackage.k9f
            if (r9 != 0) goto L9f
            r5 = r2
        L9f:
            k9f r5 = (defpackage.k9f) r5
            if (r5 != 0) goto La4
            goto Lac
        La4:
            java.math.BigInteger r9 = r5.i
            java.math.BigInteger r2 = r5.h
            java.lang.Float r2 = ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitorImpl.LossCalculator.access$calculateLoss(r4, r9, r2)
        Lac:
            java.lang.String r9 = r0.b
            ru.ok.android.externcalls.sdk.net.internal.monitor.NetworkStat r0 = new ru.ok.android.externcalls.sdk.net.internal.monitor.NetworkStat
            r0.<init>(r1, r3, r2, r9)
            y6d r9 = r8.logger
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "measured stat: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "StatMonitorImpl"
            r9.log(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitorImpl.mapToMonitoringStat(a7d):ru.ok.android.externcalls.sdk.net.internal.monitor.NetworkStat");
    }

    @Override // ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitor
    public vqa observeStat() {
        nm0 nm0Var = this.statSubject;
        nm0Var.getClass();
        return new qra(nm0Var, 1);
    }

    @Override // ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitor, defpackage.fl1
    public void onRtcStats(a7d rtcStat) {
        NetworkStat networkStatMapToMonitoringStat = mapToMonitoringStat(rtcStat);
        if (networkStatMapToMonitoringStat != null) {
            this.statSubject.f(networkStatMapToMonitoringStat);
        }
    }
}
