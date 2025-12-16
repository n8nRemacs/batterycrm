package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;
import j.P;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
/* renamed from: com.google.firebase.crashlytics.internal.model.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C37606c extends CrashlyticsReport.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f361223a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361224b;

    /* renamed from: c, reason: collision with root package name */
    public final int f361225c;

    /* renamed from: d, reason: collision with root package name */
    public final int f361226d;

    /* renamed from: e, reason: collision with root package name */
    public final long f361227e;

    /* renamed from: f, reason: collision with root package name */
    public final long f361228f;

    /* renamed from: g, reason: collision with root package name */
    public final long f361229g;

    /* renamed from: h, reason: collision with root package name */
    public final String f361230h;

    /* renamed from: i, reason: collision with root package name */
    public final B<CrashlyticsReport.a.AbstractC10700a> f361231i;

    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.c$b */
    public static final class b extends CrashlyticsReport.a.b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f361232a;

        /* renamed from: b, reason: collision with root package name */
        public String f361233b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f361234c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f361235d;

        /* renamed from: e, reason: collision with root package name */
        public Long f361236e;

        /* renamed from: f, reason: collision with root package name */
        public Long f361237f;

        /* renamed from: g, reason: collision with root package name */
        public Long f361238g;

        /* renamed from: h, reason: collision with root package name */
        public String f361239h;

        /* renamed from: i, reason: collision with root package name */
        public B<CrashlyticsReport.a.AbstractC10700a> f361240i;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.b
        public final CrashlyticsReport.a a() {
            String strQ = this.f361232a == null ? " pid" : "";
            if (this.f361233b == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " processName");
            }
            if (this.f361234c == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " reasonCode");
            }
            if (this.f361235d == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " importance");
            }
            if (this.f361236e == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " pss");
            }
            if (this.f361237f == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " rss");
            }
            if (this.f361238g == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " timestamp");
            }
            if (strQ.isEmpty()) {
                return new C37606c(this.f361232a.intValue(), this.f361233b, this.f361234c.intValue(), this.f361235d.intValue(), this.f361236e.longValue(), this.f361237f.longValue(), this.f361238g.longValue(), this.f361239h, this.f361240i, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.b
        public final CrashlyticsReport.a.b b(@P B<CrashlyticsReport.a.AbstractC10700a> b12) {
            this.f361240i = b12;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.b
        public final CrashlyticsReport.a.b c(int i12) {
            this.f361235d = Integer.valueOf(i12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.b
        public final CrashlyticsReport.a.b d(int i12) {
            this.f361232a = Integer.valueOf(i12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.b
        public final CrashlyticsReport.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f361233b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.b
        public final CrashlyticsReport.a.b f(long j12) {
            this.f361236e = Long.valueOf(j12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.b
        public final CrashlyticsReport.a.b g(int i12) {
            this.f361234c = Integer.valueOf(i12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.b
        public final CrashlyticsReport.a.b h(long j12) {
            this.f361237f = Long.valueOf(j12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.b
        public final CrashlyticsReport.a.b i(long j12) {
            this.f361238g = Long.valueOf(j12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.b
        public final CrashlyticsReport.a.b j(@P String str) {
            this.f361239h = str;
            return this;
        }
    }

    public C37606c() {
        throw null;
    }

    public C37606c(int i12, String str, int i13, int i14, long j12, long j13, long j14, String str2, B b12, a aVar) {
        this.f361223a = i12;
        this.f361224b = str;
        this.f361225c = i13;
        this.f361226d = i14;
        this.f361227e = j12;
        this.f361228f = j13;
        this.f361229g = j14;
        this.f361230h = str2;
        this.f361231i = b12;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
    @P
    public final B<CrashlyticsReport.a.AbstractC10700a> b() {
        return this.f361231i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
    @N
    public final int c() {
        return this.f361226d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
    @N
    public final int d() {
        return this.f361223a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
    @N
    public final String e() {
        return this.f361224b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.a)) {
            return false;
        }
        CrashlyticsReport.a aVar = (CrashlyticsReport.a) obj;
        if (this.f361223a == aVar.d() && this.f361224b.equals(aVar.e()) && this.f361225c == aVar.g() && this.f361226d == aVar.c() && this.f361227e == aVar.f() && this.f361228f == aVar.h() && this.f361229g == aVar.i() && ((str = this.f361230h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            B<CrashlyticsReport.a.AbstractC10700a> b12 = this.f361231i;
            if (b12 == null) {
                if (aVar.b() == null) {
                    return true;
                }
            } else if (b12.f361077b.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
    @N
    public final long f() {
        return this.f361227e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
    @N
    public final int g() {
        return this.f361225c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
    @N
    public final long h() {
        return this.f361228f;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f361223a ^ 1000003) * 1000003) ^ this.f361224b.hashCode()) * 1000003) ^ this.f361225c) * 1000003) ^ this.f361226d) * 1000003;
        long j12 = this.f361227e;
        int i12 = (iHashCode ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        long j13 = this.f361228f;
        int i13 = (i12 ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        long j14 = this.f361229g;
        int i14 = (i13 ^ ((int) (j14 ^ (j14 >>> 32)))) * 1000003;
        String str = this.f361230h;
        int iHashCode2 = (i14 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        B<CrashlyticsReport.a.AbstractC10700a> b12 = this.f361231i;
        return iHashCode2 ^ (b12 != null ? b12.f361077b.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
    @N
    public final long i() {
        return this.f361229g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
    @P
    public final String j() {
        return this.f361230h;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f361223a + ", processName=" + this.f361224b + ", reasonCode=" + this.f361225c + ", importance=" + this.f361226d + ", pss=" + this.f361227e + ", rss=" + this.f361228f + ", timestamp=" + this.f361229g + ", traceFile=" + this.f361230h + ", buildIdMappingForArch=" + this.f361231i + "}";
    }
}
