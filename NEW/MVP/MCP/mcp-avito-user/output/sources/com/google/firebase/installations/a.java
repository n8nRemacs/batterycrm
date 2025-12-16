package com.google.firebase.installations;

import com.google.firebase.installations.l;
import j.N;

/* compiled from: AutoValue_InstallationTokenResult.java */
/* loaded from: classes6.dex */
final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public final String f361625a;

    /* renamed from: b, reason: collision with root package name */
    public final long f361626b;

    /* renamed from: c, reason: collision with root package name */
    public final long f361627c;

    /* compiled from: AutoValue_InstallationTokenResult.java */
    public static final class b extends l.a {

        /* renamed from: a, reason: collision with root package name */
        public String f361628a;

        /* renamed from: b, reason: collision with root package name */
        public Long f361629b;

        /* renamed from: c, reason: collision with root package name */
        public Long f361630c;

        public b() {
        }

        public b(l lVar, C10723a c10723a) {
            this.f361628a = lVar.a();
            this.f361629b = Long.valueOf(lVar.c());
            this.f361630c = Long.valueOf(lVar.b());
        }
    }

    public a(String str, long j12, long j13, C10723a c10723a) {
        this.f361625a = str;
        this.f361626b = j12;
        this.f361627c = j13;
    }

    @Override // com.google.firebase.installations.l
    @N
    public final String a() {
        return this.f361625a;
    }

    @Override // com.google.firebase.installations.l
    @N
    public final long b() {
        return this.f361627c;
    }

    @Override // com.google.firebase.installations.l
    @N
    public final long c() {
        return this.f361626b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f361625a.equals(lVar.a()) && this.f361626b == lVar.c() && this.f361627c == lVar.b();
    }

    public final int hashCode() {
        int iHashCode = (this.f361625a.hashCode() ^ 1000003) * 1000003;
        long j12 = this.f361626b;
        long j13 = this.f361627c;
        return ((iHashCode ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ ((int) (j13 ^ (j13 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f361625a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f361626b);
        sb2.append(", tokenCreationTimestamp=");
        return AK.c.j(this.f361627c, "}", sb2);
    }
}
