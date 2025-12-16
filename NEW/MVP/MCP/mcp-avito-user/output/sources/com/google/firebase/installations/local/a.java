package com.google.firebase.installations.local;

import androidx.appcompat.app.r;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.c;
import j.N;
import j.P;

/* compiled from: AutoValue_PersistedInstallationEntry.java */
/* loaded from: classes6.dex */
final class a extends c {

    /* renamed from: b, reason: collision with root package name */
    public final String f361664b;

    /* renamed from: c, reason: collision with root package name */
    public final PersistedInstallation.RegistrationStatus f361665c;

    /* renamed from: d, reason: collision with root package name */
    public final String f361666d;

    /* renamed from: e, reason: collision with root package name */
    public final String f361667e;

    /* renamed from: f, reason: collision with root package name */
    public final long f361668f;

    /* renamed from: g, reason: collision with root package name */
    public final long f361669g;

    /* renamed from: h, reason: collision with root package name */
    public final String f361670h;

    /* compiled from: AutoValue_PersistedInstallationEntry.java */
    public static final class b extends c.a {

        /* renamed from: a, reason: collision with root package name */
        public String f361671a;

        /* renamed from: b, reason: collision with root package name */
        public PersistedInstallation.RegistrationStatus f361672b;

        /* renamed from: c, reason: collision with root package name */
        public String f361673c;

        /* renamed from: d, reason: collision with root package name */
        public String f361674d;

        /* renamed from: e, reason: collision with root package name */
        public Long f361675e;

        /* renamed from: f, reason: collision with root package name */
        public Long f361676f;

        /* renamed from: g, reason: collision with root package name */
        public String f361677g;

        public b() {
        }

        @Override // com.google.firebase.installations.local.c.a
        public final c a() {
            String strQ = this.f361672b == null ? " registrationStatus" : "";
            if (this.f361675e == null) {
                strQ = r.q(strQ, " expiresInSecs");
            }
            if (this.f361676f == null) {
                strQ = r.q(strQ, " tokenCreationEpochInSecs");
            }
            if (strQ.isEmpty()) {
                return new a(this.f361671a, this.f361672b, this.f361673c, this.f361674d, this.f361675e.longValue(), this.f361676f.longValue(), this.f361677g, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.firebase.installations.local.c.a
        public final c.a b(@P String str) {
            this.f361673c = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.c.a
        public final c.a c(long j12) {
            this.f361675e = Long.valueOf(j12);
            return this;
        }

        @Override // com.google.firebase.installations.local.c.a
        public final c.a d(String str) {
            this.f361671a = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.c.a
        public final c.a e(@P String str) {
            this.f361674d = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.c.a
        public final c.a f(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f361672b = registrationStatus;
            return this;
        }

        @Override // com.google.firebase.installations.local.c.a
        public final c.a g(long j12) {
            this.f361676f = Long.valueOf(j12);
            return this;
        }

        public b(c cVar, C10724a c10724a) {
            this.f361671a = cVar.c();
            this.f361672b = cVar.f();
            this.f361673c = cVar.a();
            this.f361674d = cVar.e();
            this.f361675e = Long.valueOf(cVar.b());
            this.f361676f = Long.valueOf(cVar.g());
            this.f361677g = cVar.d();
        }
    }

    public a(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j12, long j13, String str4, C10724a c10724a) {
        this.f361664b = str;
        this.f361665c = registrationStatus;
        this.f361666d = str2;
        this.f361667e = str3;
        this.f361668f = j12;
        this.f361669g = j13;
        this.f361670h = str4;
    }

    @Override // com.google.firebase.installations.local.c
    @P
    public final String a() {
        return this.f361666d;
    }

    @Override // com.google.firebase.installations.local.c
    public final long b() {
        return this.f361668f;
    }

    @Override // com.google.firebase.installations.local.c
    @P
    public final String c() {
        return this.f361664b;
    }

    @Override // com.google.firebase.installations.local.c
    @P
    public final String d() {
        return this.f361670h;
    }

    @Override // com.google.firebase.installations.local.c
    @P
    public final String e() {
        return this.f361667e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        String str3 = this.f361664b;
        if (str3 != null ? str3.equals(cVar.c()) : cVar.c() == null) {
            if (this.f361665c.equals(cVar.f()) && ((str = this.f361666d) != null ? str.equals(cVar.a()) : cVar.a() == null) && ((str2 = this.f361667e) != null ? str2.equals(cVar.e()) : cVar.e() == null) && this.f361668f == cVar.b() && this.f361669g == cVar.g()) {
                String str4 = this.f361670h;
                if (str4 == null) {
                    if (cVar.d() == null) {
                        return true;
                    }
                } else if (str4.equals(cVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.local.c
    @N
    public final PersistedInstallation.RegistrationStatus f() {
        return this.f361665c;
    }

    @Override // com.google.firebase.installations.local.c
    public final long g() {
        return this.f361669g;
    }

    @Override // com.google.firebase.installations.local.c
    public final c.a h() {
        return new b(this, null);
    }

    public final int hashCode() {
        String str = this.f361664b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f361665c.hashCode()) * 1000003;
        String str2 = this.f361666d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f361667e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j12 = this.f361668f;
        int i12 = (iHashCode3 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        long j13 = this.f361669g;
        int i13 = (i12 ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        String str4 = this.f361670h;
        return (str4 != null ? str4.hashCode() : 0) ^ i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f361664b);
        sb2.append(", registrationStatus=");
        sb2.append(this.f361665c);
        sb2.append(", authToken=");
        sb2.append(this.f361666d);
        sb2.append(", refreshToken=");
        sb2.append(this.f361667e);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f361668f);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f361669g);
        sb2.append(", fisError=");
        return AK.c.s(sb2, this.f361670h, "}");
    }
}
