package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.e;

/* compiled from: AutoValue_EventStoreConfig.java */
/* loaded from: classes10.dex */
final class a extends e {

    /* renamed from: b, reason: collision with root package name */
    public final long f343230b;

    /* renamed from: c, reason: collision with root package name */
    public final int f343231c;

    /* renamed from: d, reason: collision with root package name */
    public final int f343232d;

    /* renamed from: e, reason: collision with root package name */
    public final long f343233e;

    /* renamed from: f, reason: collision with root package name */
    public final int f343234f;

    /* compiled from: AutoValue_EventStoreConfig.java */
    public static final class b extends e.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f343235a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f343236b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f343237c;

        /* renamed from: d, reason: collision with root package name */
        public Long f343238d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f343239e;
    }

    public a(long j12, int i12, int i13, long j13, int i14, C10565a c10565a) {
        this.f343230b = j12;
        this.f343231c = i12;
        this.f343232d = i13;
        this.f343233e = j13;
        this.f343234f = i14;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public final int a() {
        return this.f343232d;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public final long b() {
        return this.f343233e;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public final int c() {
        return this.f343231c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public final int d() {
        return this.f343234f;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public final long e() {
        return this.f343230b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f343230b == eVar.e() && this.f343231c == eVar.c() && this.f343232d == eVar.a() && this.f343233e == eVar.b() && this.f343234f == eVar.d();
    }

    public final int hashCode() {
        long j12 = this.f343230b;
        int i12 = (((((((int) (j12 ^ (j12 >>> 32))) ^ 1000003) * 1000003) ^ this.f343231c) * 1000003) ^ this.f343232d) * 1000003;
        long j13 = this.f343233e;
        return ((i12 ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003) ^ this.f343234f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f343230b);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f343231c);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f343232d);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f343233e);
        sb2.append(", maxBlobByteSizePerRow=");
        return AK.c.i(this.f343234f, "}", sb2);
    }
}
