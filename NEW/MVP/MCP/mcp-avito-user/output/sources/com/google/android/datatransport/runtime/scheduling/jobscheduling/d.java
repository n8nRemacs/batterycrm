package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import androidx.appcompat.app.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* loaded from: classes10.dex */
final class d extends SchedulerConfig.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f343185a;

    /* renamed from: b, reason: collision with root package name */
    public final long f343186b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<SchedulerConfig.Flag> f343187c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    public static final class b extends SchedulerConfig.b.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f343188a;

        /* renamed from: b, reason: collision with root package name */
        public Long f343189b;

        /* renamed from: c, reason: collision with root package name */
        public Set<SchedulerConfig.Flag> f343190c;

        public final SchedulerConfig.b a() {
            String strQ = this.f343188a == null ? " delta" : "";
            if (this.f343189b == null) {
                strQ = r.q(strQ, " maxAllowedDelay");
            }
            if (this.f343190c == null) {
                strQ = r.q(strQ, " flags");
            }
            if (strQ.isEmpty()) {
                return new d(this.f343188a.longValue(), this.f343189b.longValue(), this.f343190c, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }
    }

    public d() {
        throw null;
    }

    public d(long j12, long j13, Set set, a aVar) {
        this.f343185a = j12;
        this.f343186b = j13;
        this.f343187c = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b
    public final long a() {
        return this.f343185a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b
    public final Set<SchedulerConfig.Flag> b() {
        return this.f343187c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b
    public final long c() {
        return this.f343186b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.b)) {
            return false;
        }
        SchedulerConfig.b bVar = (SchedulerConfig.b) obj;
        return this.f343185a == bVar.a() && this.f343186b == bVar.c() && this.f343187c.equals(bVar.b());
    }

    public final int hashCode() {
        long j12 = this.f343185a;
        int i12 = (((int) (j12 ^ (j12 >>> 32))) ^ 1000003) * 1000003;
        long j13 = this.f343186b;
        return ((i12 ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003) ^ this.f343187c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f343185a + ", maxAllowedDelay=" + this.f343186b + ", flags=" + this.f343187c + "}";
    }
}
