package FX0;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.j;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import javax.inject.Provider;

/* compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* loaded from: classes10.dex */
public final class i implements com.google.android.datatransport.runtime.dagger.internal.g<m> {

    /* renamed from: a, reason: collision with root package name */
    public final j f4749a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.google.android.datatransport.runtime.scheduling.persistence.d> f4750b;

    /* renamed from: c, reason: collision with root package name */
    public final g f4751c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.f f4752d;

    public i(j jVar, Provider provider, g gVar, com.google.android.datatransport.runtime.time.f fVar) {
        this.f4749a = jVar;
        this.f4750b = provider;
        this.f4751c = gVar;
        this.f4752d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f4749a.f343133a;
        com.google.android.datatransport.runtime.scheduling.persistence.d dVar = this.f4750b.get();
        SchedulerConfig schedulerConfig = (SchedulerConfig) this.f4751c.get();
        this.f4752d.getClass();
        new com.google.android.datatransport.runtime.time.g();
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(context, dVar, schedulerConfig);
    }
}
