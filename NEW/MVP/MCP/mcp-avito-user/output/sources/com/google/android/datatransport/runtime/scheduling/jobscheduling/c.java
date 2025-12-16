package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AutoValue_SchedulerConfig.java */
/* loaded from: classes10.dex */
final class c extends SchedulerConfig {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.a f343183a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f343184b;

    public c(com.google.android.datatransport.runtime.time.a aVar, HashMap map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f343183a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f343184b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final com.google.android.datatransport.runtime.time.a a() {
        return this.f343183a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final Map<Priority, SchedulerConfig.b> d() {
        return this.f343184b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.f343183a.equals(schedulerConfig.a()) && this.f343184b.equals(schedulerConfig.d());
    }

    public final int hashCode() {
        return ((this.f343183a.hashCode() ^ 1000003) * 1000003) ^ this.f343184b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f343183a + ", values=" + this.f343184b + "}";
    }
}
