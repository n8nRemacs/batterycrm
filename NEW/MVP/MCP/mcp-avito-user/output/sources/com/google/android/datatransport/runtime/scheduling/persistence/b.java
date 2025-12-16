package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: AutoValue_PersistedEvent.java */
/* loaded from: classes10.dex */
final class b extends k {

    /* renamed from: a, reason: collision with root package name */
    public final long f343240a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.r f343241b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.j f343242c;

    public b(long j12, com.google.android.datatransport.runtime.r rVar, com.google.android.datatransport.runtime.j jVar) {
        this.f343240a = j12;
        if (rVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f343241b = rVar;
        if (jVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f343242c = jVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.k
    public final com.google.android.datatransport.runtime.j a() {
        return this.f343242c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.k
    public final long b() {
        return this.f343240a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.k
    public final com.google.android.datatransport.runtime.r c() {
        return this.f343241b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f343240a == kVar.b() && this.f343241b.equals(kVar.c()) && this.f343242c.equals(kVar.a());
    }

    public final int hashCode() {
        long j12 = this.f343240a;
        return ((((((int) ((j12 >>> 32) ^ j12)) ^ 1000003) * 1000003) ^ this.f343241b.hashCode()) * 1000003) ^ this.f343242c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f343240a + ", transportContext=" + this.f343241b + ", event=" + this.f343242c + "}";
    }
}
