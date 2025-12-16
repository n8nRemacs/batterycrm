package com.vk.id.tracking.tracer;

import Y41.a;
import Y41.l;
import Y41.p;
import Y61.k;
import android.content.Context;
import com.vk.id.common.InternalVKIDApi;
import com.vk.id.tracking.core.AnalyticsTracking;
import com.vk.id.tracking.core.CrashReporter;
import com.vk.id.tracking.core.PerformanceTracker;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: TrackingDeps.kt */
@InternalVKIDApi
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/vk/id/tracking/tracer/TrackingDeps;", "", "context", "Landroid/content/Context;", "clientId", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "crashReporter", "Lcom/vk/id/tracking/core/CrashReporter;", "getCrashReporter", "()Lcom/vk/id/tracking/core/CrashReporter;", "performanceTracker", "Lcom/vk/id/tracking/core/PerformanceTracker;", "getPerformanceTracker", "()Lcom/vk/id/tracking/core/PerformanceTracker;", "analyticsTracking", "Lcom/vk/id/tracking/core/AnalyticsTracking;", "getAnalyticsTracking", "()Lcom/vk/id/tracking/core/AnalyticsTracking;", "tracking-noop_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackingDeps {

    @k
    private final CrashReporter crashReporter = new CrashReporter() { // from class: com.vk.id.tracking.tracer.TrackingDeps$crashReporter$1
        @Override // com.vk.id.tracking.core.CrashReporter
        public <T> T runReportingCrashes(l<? super Throwable, ? extends T> errorValueProvider, a<? extends T> action) {
            return action.invoke();
        }

        @Override // com.vk.id.tracking.core.CrashReporter
        public <T> Object runReportingCrashesSuspend(p<? super Throwable, ? super Continuation<? super T>, ? extends Object> pVar, l<? super Continuation<? super T>, ? extends Object> lVar, Continuation<? super T> continuation) {
            return lVar.invoke(continuation);
        }
    };

    @k
    private final PerformanceTracker performanceTracker = new PerformanceTracker() { // from class: com.vk.id.tracking.tracer.TrackingDeps$performanceTracker$1
        @Override // com.vk.id.tracking.core.PerformanceTracker
        public Object runTrackingSuspend(String str, l<? super Continuation<? super G0>, ? extends Object> lVar, Continuation<? super G0> continuation) {
            Object objInvoke = lVar.invoke(continuation);
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : G0.f406611a;
        }

        @Override // com.vk.id.tracking.core.PerformanceTracker
        public void endTracking(String key) {
        }

        @Override // com.vk.id.tracking.core.PerformanceTracker
        public void startTracking(String key) {
        }
    };

    @k
    private final AnalyticsTracking analyticsTracking = new AnalyticsTracking() { // from class: com.vk.id.tracking.tracer.TrackingDeps$analyticsTracking$1
        @Override // com.vk.id.tracking.core.AnalyticsTracking
        public void log(String message) {
        }
    };

    public TrackingDeps(@k Context context, @k String str) {
    }

    @k
    public final AnalyticsTracking getAnalyticsTracking() {
        return this.analyticsTracking;
    }

    @k
    public final CrashReporter getCrashReporter() {
        return this.crashReporter;
    }

    @k
    public final PerformanceTracker getPerformanceTracker() {
        return this.performanceTracker;
    }
}
