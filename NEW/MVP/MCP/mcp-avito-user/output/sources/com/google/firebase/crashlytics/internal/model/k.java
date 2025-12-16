package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;

/* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
/* loaded from: classes4.dex */
final class k extends CrashlyticsReport.f.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f361296a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361297b;

    /* renamed from: c, reason: collision with root package name */
    public final int f361298c;

    /* renamed from: d, reason: collision with root package name */
    public final long f361299d;

    /* renamed from: e, reason: collision with root package name */
    public final long f361300e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f361301f;

    /* renamed from: g, reason: collision with root package name */
    public final int f361302g;

    /* renamed from: h, reason: collision with root package name */
    public final String f361303h;

    /* renamed from: i, reason: collision with root package name */
    public final String f361304i;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
    public static final class b extends CrashlyticsReport.f.c.a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f361305a;

        /* renamed from: b, reason: collision with root package name */
        public String f361306b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f361307c;

        /* renamed from: d, reason: collision with root package name */
        public Long f361308d;

        /* renamed from: e, reason: collision with root package name */
        public Long f361309e;

        /* renamed from: f, reason: collision with root package name */
        public Boolean f361310f;

        /* renamed from: g, reason: collision with root package name */
        public Integer f361311g;

        /* renamed from: h, reason: collision with root package name */
        public String f361312h;

        /* renamed from: i, reason: collision with root package name */
        public String f361313i;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public final CrashlyticsReport.f.c a() {
            String strQ = this.f361305a == null ? " arch" : "";
            if (this.f361306b == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " model");
            }
            if (this.f361307c == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " cores");
            }
            if (this.f361308d == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " ram");
            }
            if (this.f361309e == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " diskSpace");
            }
            if (this.f361310f == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " simulator");
            }
            if (this.f361311g == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " state");
            }
            if (this.f361312h == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " manufacturer");
            }
            if (this.f361313i == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " modelClass");
            }
            if (strQ.isEmpty()) {
                return new k(this.f361305a.intValue(), this.f361306b, this.f361307c.intValue(), this.f361308d.longValue(), this.f361309e.longValue(), this.f361310f.booleanValue(), this.f361311g.intValue(), this.f361312h, this.f361313i, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public final CrashlyticsReport.f.c.a b(int i12) {
            this.f361305a = Integer.valueOf(i12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public final CrashlyticsReport.f.c.a c(int i12) {
            this.f361307c = Integer.valueOf(i12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public final CrashlyticsReport.f.c.a d(long j12) {
            this.f361309e = Long.valueOf(j12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public final CrashlyticsReport.f.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f361312h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public final CrashlyticsReport.f.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f361306b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public final CrashlyticsReport.f.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f361313i = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public final CrashlyticsReport.f.c.a h(long j12) {
            this.f361308d = Long.valueOf(j12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public final CrashlyticsReport.f.c.a i(boolean z12) {
            this.f361310f = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public final CrashlyticsReport.f.c.a j(int i12) {
            this.f361311g = Integer.valueOf(i12);
            return this;
        }
    }

    public k(int i12, String str, int i13, long j12, long j13, boolean z12, int i14, String str2, String str3, a aVar) {
        this.f361296a = i12;
        this.f361297b = str;
        this.f361298c = i13;
        this.f361299d = j12;
        this.f361300e = j13;
        this.f361301f = z12;
        this.f361302g = i14;
        this.f361303h = str2;
        this.f361304i = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c
    @N
    public final int b() {
        return this.f361296a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c
    public final int c() {
        return this.f361298c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c
    public final long d() {
        return this.f361300e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c
    @N
    public final String e() {
        return this.f361303h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.c)) {
            return false;
        }
        CrashlyticsReport.f.c cVar = (CrashlyticsReport.f.c) obj;
        return this.f361296a == cVar.b() && this.f361297b.equals(cVar.f()) && this.f361298c == cVar.c() && this.f361299d == cVar.h() && this.f361300e == cVar.d() && this.f361301f == cVar.j() && this.f361302g == cVar.i() && this.f361303h.equals(cVar.e()) && this.f361304i.equals(cVar.g());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c
    @N
    public final String f() {
        return this.f361297b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c
    @N
    public final String g() {
        return this.f361304i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c
    public final long h() {
        return this.f361299d;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f361296a ^ 1000003) * 1000003) ^ this.f361297b.hashCode()) * 1000003) ^ this.f361298c) * 1000003;
        long j12 = this.f361299d;
        int i12 = (iHashCode ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        long j13 = this.f361300e;
        return ((((((((i12 ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003) ^ (this.f361301f ? 1231 : 1237)) * 1000003) ^ this.f361302g) * 1000003) ^ this.f361303h.hashCode()) * 1000003) ^ this.f361304i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c
    public final int i() {
        return this.f361302g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c
    public final boolean j() {
        return this.f361301f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f361296a);
        sb2.append(", model=");
        sb2.append(this.f361297b);
        sb2.append(", cores=");
        sb2.append(this.f361298c);
        sb2.append(", ram=");
        sb2.append(this.f361299d);
        sb2.append(", diskSpace=");
        sb2.append(this.f361300e);
        sb2.append(", simulator=");
        sb2.append(this.f361301f);
        sb2.append(", state=");
        sb2.append(this.f361302g);
        sb2.append(", manufacturer=");
        sb2.append(this.f361303h);
        sb2.append(", modelClass=");
        return AK.c.s(sb2, this.f361304i, "}");
    }
}
