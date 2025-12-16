package FX0;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;

/* compiled from: SchedulingConfigModule_ConfigFactory.java */
/* loaded from: classes10.dex */
public final class g implements com.google.android.datatransport.runtime.dagger.internal.g<SchedulerConfig> {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.e f4748a;

    public g(com.google.android.datatransport.runtime.time.e eVar) {
        this.f4748a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f4748a.getClass();
        return SchedulerConfig.b(new com.google.android.datatransport.runtime.time.i());
    }
}
