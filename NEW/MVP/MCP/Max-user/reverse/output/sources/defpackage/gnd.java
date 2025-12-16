package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class gnd implements fnd {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    @Override // defpackage.fnd
    public final synchronized void a(rf7 rf7Var, String str, boolean z) {
        if (op5.a.h(2)) {
            Long l = (Long) this.b.remove(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            op5.g("time %d: onRequestSuccess: {requestId: %s, elapsedTime: %d ms}", Long.valueOf(jUptimeMillis), str, Long.valueOf(q85.e(jUptimeMillis, l)));
        }
    }

    @Override // defpackage.fnd
    public final synchronized void b(rf7 rf7Var, Object obj, String str, boolean z) {
        if (op5.a.h(2)) {
            Long lValueOf = Long.valueOf(SystemClock.uptimeMillis());
            Boolean boolValueOf = Boolean.valueOf(z);
            if (op5.a.h(2)) {
                op5.a.v("RequestLoggingListener", String.format(null, "time %d: onRequestSubmit: {requestId: %s, callerContext: %s, isPrefetch: %b}", lValueOf, str, obj, boolValueOf));
            }
            this.b.put(str, Long.valueOf(SystemClock.uptimeMillis()));
        }
    }

    @Override // defpackage.fnd
    public final synchronized void c(rf7 rf7Var, String str, Throwable th, boolean z) {
        if (op5.a.h(5)) {
            Long l = (Long) this.b.remove(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            op5.m("RequestLoggingListener", "time %d: onRequestFailure: {requestId: %s, elapsedTime: %d ms, throwable: %s}", Long.valueOf(jUptimeMillis), str, Long.valueOf(q85.e(jUptimeMillis, l)), th.toString());
        }
    }

    @Override // defpackage.fnd
    public final synchronized void d(String str, String str2) {
        if (op5.a.h(2)) {
            Pair pairCreate = Pair.create(str, str2);
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.a.put(pairCreate, Long.valueOf(jUptimeMillis));
            op5.g("time %d: onProducerStart: {requestId: %s, producer: %s}", Long.valueOf(jUptimeMillis), str, str2);
        }
    }

    @Override // defpackage.fnd
    public final synchronized void e(String str, String str2) {
        if (op5.a.h(2)) {
            Long l = (Long) this.a.remove(Pair.create(str, str2));
            long jUptimeMillis = SystemClock.uptimeMillis();
            op5.h("RequestLoggingListener", "time %d: onProducerFinishWithCancellation: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s}", Long.valueOf(jUptimeMillis), str, str2, Long.valueOf(q85.e(jUptimeMillis, l)), null);
        }
    }

    @Override // defpackage.fnd
    public final synchronized void f(String str, String str2, boolean z) {
        if (op5.a.h(2)) {
            Long l = (Long) this.a.remove(Pair.create(str, str2));
            long jUptimeMillis = SystemClock.uptimeMillis();
            op5.h("RequestLoggingListener", "time %d: onUltimateProducerReached: {requestId: %s, producer: %s, elapsedTime: %d ms, success: %b}", Long.valueOf(jUptimeMillis), str, str2, Long.valueOf(q85.e(jUptimeMillis, l)), Boolean.valueOf(z));
        }
    }

    @Override // defpackage.fnd
    public final synchronized void g(String str) {
        if (op5.a.h(2)) {
            Long l = (Long) this.a.get(Pair.create(str, "NetworkFetchProducer"));
            op5.h("RequestLoggingListener", "time %d: onProducerEvent: {requestId: %s, stage: %s, eventName: %s; elapsedTime: %d ms}", Long.valueOf(SystemClock.uptimeMillis()), str, "NetworkFetchProducer", "intermediate_result", Long.valueOf(q85.e(SystemClock.uptimeMillis(), l)));
        }
    }

    @Override // defpackage.fnd
    public final boolean h(String str) {
        return op5.a.h(2);
    }

    @Override // defpackage.fnd
    public final synchronized void i(String str, String str2, Map map) {
        if (op5.a.h(2)) {
            Long l = (Long) this.a.remove(Pair.create(str, str2));
            long jUptimeMillis = SystemClock.uptimeMillis();
            op5.h("RequestLoggingListener", "time %d: onProducerFinishWithSuccess: {requestId: %s, producer: %s, elapsedTime: %d ms, extraMap: %s}", Long.valueOf(jUptimeMillis), str, str2, Long.valueOf(q85.e(jUptimeMillis, l)), map);
        }
    }

    @Override // defpackage.fnd
    public final synchronized void j(String str, String str2, Throwable th, Map map) {
        if (op5.a.h(5)) {
            Long l = (Long) this.a.remove(Pair.create(str, str2));
            long jUptimeMillis = SystemClock.uptimeMillis();
            Object[] objArr = {Long.valueOf(jUptimeMillis), str, str2, Long.valueOf(q85.e(jUptimeMillis, l)), map, th.toString()};
            if (op5.a.h(5)) {
                op5.a.w("RequestLoggingListener", String.format(null, "time %d: onProducerFinishWithFailure: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s, throwable: %s}", objArr), th);
            }
        }
    }

    @Override // defpackage.fnd
    public final synchronized void k(String str) {
        if (op5.a.h(2)) {
            Long l = (Long) this.b.remove(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            op5.g("time %d: onRequestCancellation: {requestId: %s, elapsedTime: %d ms}", Long.valueOf(jUptimeMillis), str, Long.valueOf(q85.e(jUptimeMillis, l)));
        }
    }
}
