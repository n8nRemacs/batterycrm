package aX0;

import I41.h;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.util.HashMap;
import java.util.Map;
import uW0.C48986a;
import uW0.C48987b;

/* compiled from: RequestLoggingListener.java */
@Nullsafe
/* renamed from: aX0.g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C19836g implements InterfaceC19835f {

    /* renamed from: a, reason: collision with root package name */
    @J41.a
    public final HashMap f20909a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    @J41.a
    public final HashMap f20910b = new HashMap();

    public static long l(long j12, @h Long l12) {
        if (l12 != null) {
            return j12 - l12.longValue();
        }
        return -1L;
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final synchronized void a(String str, String str2) {
        if (C48986a.f440079a.a(2)) {
            Pair pairCreate = Pair.create(str, str2);
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.f20909a.put(pairCreate, Long.valueOf(jUptimeMillis));
            C48986a.h("time %d: onProducerStart: {requestId: %s, producer: %s}", Long.valueOf(jUptimeMillis), str, str2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final synchronized void b(String str, String str2, @h Map<String, String> map) {
        if (C48986a.f440079a.a(2)) {
            Long l12 = (Long) this.f20909a.remove(Pair.create(str, str2));
            long jUptimeMillis = SystemClock.uptimeMillis();
            C48986a.i("RequestLoggingListener", "time %d: onProducerFinishWithSuccess: {requestId: %s, producer: %s, elapsedTime: %d ms, extraMap: %s}", Long.valueOf(jUptimeMillis), str, str2, Long.valueOf(l(jUptimeMillis, l12)), map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final synchronized void c(String str, String str2, boolean z12) {
        if (C48986a.f440079a.a(2)) {
            Long l12 = (Long) this.f20909a.remove(Pair.create(str, str2));
            long jUptimeMillis = SystemClock.uptimeMillis();
            C48986a.i("RequestLoggingListener", "time %d: onUltimateProducerReached: {requestId: %s, producer: %s, elapsedTime: %d ms, success: %b}", Long.valueOf(jUptimeMillis), str, str2, Long.valueOf(l(jUptimeMillis, l12)), Boolean.valueOf(z12));
        }
    }

    @Override // aX0.InterfaceC19835f
    public final synchronized void d(String str) {
        if (C48986a.f440079a.a(2)) {
            Long l12 = (Long) this.f20910b.remove(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            C48986a.h("time %d: onRequestCancellation: {requestId: %s, elapsedTime: %d ms}", Long.valueOf(jUptimeMillis), str, Long.valueOf(l(jUptimeMillis, l12)));
        }
    }

    @Override // aX0.InterfaceC19835f
    public final synchronized void e(ImageRequest imageRequest, String str, boolean z12) {
        if (C48986a.f440079a.a(2)) {
            Long l12 = (Long) this.f20910b.remove(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            C48986a.h("time %d: onRequestSuccess: {requestId: %s, elapsedTime: %d ms}", Long.valueOf(jUptimeMillis), str, Long.valueOf(l(jUptimeMillis, l12)));
        }
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final synchronized void f(String str, String str2, Throwable th2, @h Map<String, String> map) {
        if (C48986a.f440079a.a(5)) {
            Long l12 = (Long) this.f20909a.remove(Pair.create(str, str2));
            long jUptimeMillis = SystemClock.uptimeMillis();
            Object[] objArr = {Long.valueOf(jUptimeMillis), str, str2, Long.valueOf(l(jUptimeMillis, l12)), map, th2.toString()};
            C48987b c48987b = C48986a.f440079a;
            if (c48987b.a(5)) {
                c48987b.c(5, "RequestLoggingListener", String.format(null, "time %d: onProducerFinishWithFailure: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s, throwable: %s}", objArr), th2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final synchronized void g(String str, String str2) {
        if (C48986a.f440079a.a(2)) {
            Long l12 = (Long) this.f20909a.remove(Pair.create(str, str2));
            long jUptimeMillis = SystemClock.uptimeMillis();
            C48986a.i("RequestLoggingListener", "time %d: onProducerFinishWithCancellation: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s}", Long.valueOf(jUptimeMillis), str, str2, Long.valueOf(l(jUptimeMillis, l12)), null);
        }
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final synchronized void h(String str) {
        if (C48986a.f440079a.a(2)) {
            Long l12 = (Long) this.f20909a.get(Pair.create(str, "NetworkFetchProducer"));
            C48986a.i("RequestLoggingListener", "time %d: onProducerEvent: {requestId: %s, stage: %s, eventName: %s; elapsedTime: %d ms}", Long.valueOf(SystemClock.uptimeMillis()), str, "NetworkFetchProducer", "intermediate_result", Long.valueOf(l(SystemClock.uptimeMillis(), l12)));
        }
    }

    @Override // aX0.InterfaceC19835f
    public final synchronized void i(ImageRequest imageRequest, Object obj, String str, boolean z12) {
        if (C48986a.f440079a.a(2)) {
            Long lValueOf = Long.valueOf(SystemClock.uptimeMillis());
            Boolean boolValueOf = Boolean.valueOf(z12);
            C48987b c48987b = C48986a.f440079a;
            if (c48987b.a(2)) {
                c48987b.b(2, "RequestLoggingListener", String.format(null, "time %d: onRequestSubmit: {requestId: %s, callerContext: %s, isPrefetch: %b}", lValueOf, str, obj, boolValueOf));
            }
            this.f20910b.put(str, Long.valueOf(SystemClock.uptimeMillis()));
        }
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final boolean j(String str) {
        return C48986a.f440079a.a(2);
    }

    @Override // aX0.InterfaceC19835f
    public final synchronized void k(ImageRequest imageRequest, String str, Throwable th2, boolean z12) {
        if (C48986a.f440079a.a(5)) {
            Long l12 = (Long) this.f20910b.remove(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            C48986a.l("RequestLoggingListener", "time %d: onRequestFailure: {requestId: %s, elapsedTime: %d ms, throwable: %s}", Long.valueOf(jUptimeMillis), str, Long.valueOf(l(jUptimeMillis, l12)), th2.toString());
        }
    }
}
