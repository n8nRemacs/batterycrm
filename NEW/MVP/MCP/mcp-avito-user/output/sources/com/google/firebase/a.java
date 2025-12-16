package com.google.firebase;

/* compiled from: AutoValue_StartupTime.java */
/* loaded from: classes10.dex */
final class a extends o {

    /* renamed from: a, reason: collision with root package name */
    public final long f360700a;

    /* renamed from: b, reason: collision with root package name */
    public final long f360701b;

    /* renamed from: c, reason: collision with root package name */
    public final long f360702c;

    public a(long j12, long j13, long j14) {
        this.f360700a = j12;
        this.f360701b = j13;
        this.f360702c = j14;
    }

    @Override // com.google.firebase.o
    public final long a() {
        return this.f360701b;
    }

    @Override // com.google.firebase.o
    public final long b() {
        return this.f360700a;
    }

    @Override // com.google.firebase.o
    public final long c() {
        return this.f360702c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f360700a == oVar.b() && this.f360701b == oVar.a() && this.f360702c == oVar.c();
    }

    public final int hashCode() {
        long j12 = this.f360700a;
        long j13 = this.f360701b;
        int i12 = (((((int) (j12 ^ (j12 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        long j14 = this.f360702c;
        return i12 ^ ((int) ((j14 >>> 32) ^ j14));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f360700a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f360701b);
        sb2.append(", uptimeMillis=");
        return AK.c.j(this.f360702c, "}", sb2);
    }
}
