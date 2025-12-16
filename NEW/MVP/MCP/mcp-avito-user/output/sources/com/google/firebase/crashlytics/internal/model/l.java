package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;
import j.P;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
/* loaded from: classes4.dex */
final class l extends CrashlyticsReport.f.d {

    /* renamed from: a, reason: collision with root package name */
    public final long f361314a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361315b;

    /* renamed from: c, reason: collision with root package name */
    public final CrashlyticsReport.f.d.a f361316c;

    /* renamed from: d, reason: collision with root package name */
    public final CrashlyticsReport.f.d.c f361317d;

    /* renamed from: e, reason: collision with root package name */
    public final CrashlyticsReport.f.d.AbstractC10714d f361318e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    public static final class b extends CrashlyticsReport.f.d.b {

        /* renamed from: a, reason: collision with root package name */
        public Long f361319a;

        /* renamed from: b, reason: collision with root package name */
        public String f361320b;

        /* renamed from: c, reason: collision with root package name */
        public CrashlyticsReport.f.d.a f361321c;

        /* renamed from: d, reason: collision with root package name */
        public CrashlyticsReport.f.d.c f361322d;

        /* renamed from: e, reason: collision with root package name */
        public CrashlyticsReport.f.d.AbstractC10714d f361323e;

        public b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.b
        public final CrashlyticsReport.f.d a() {
            String strQ = this.f361319a == null ? " timestamp" : "";
            if (this.f361320b == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " type");
            }
            if (this.f361321c == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " app");
            }
            if (this.f361322d == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " device");
            }
            if (strQ.isEmpty()) {
                return new l(this.f361319a.longValue(), this.f361320b, this.f361321c, this.f361322d, this.f361323e, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.b
        public final CrashlyticsReport.f.d.b b(CrashlyticsReport.f.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f361321c = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.b
        public final CrashlyticsReport.f.d.b c(CrashlyticsReport.f.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f361322d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.b
        public final CrashlyticsReport.f.d.b d(CrashlyticsReport.f.d.AbstractC10714d abstractC10714d) {
            this.f361323e = abstractC10714d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.b
        public final CrashlyticsReport.f.d.b e(long j12) {
            this.f361319a = Long.valueOf(j12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.b
        public final CrashlyticsReport.f.d.b f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f361320b = str;
            return this;
        }

        public b(CrashlyticsReport.f.d dVar, a aVar) {
            this.f361319a = Long.valueOf(dVar.e());
            this.f361320b = dVar.f();
            this.f361321c = dVar.b();
            this.f361322d = dVar.c();
            this.f361323e = dVar.d();
        }
    }

    public l(long j12, String str, CrashlyticsReport.f.d.a aVar, CrashlyticsReport.f.d.c cVar, CrashlyticsReport.f.d.AbstractC10714d abstractC10714d, a aVar2) {
        this.f361314a = j12;
        this.f361315b = str;
        this.f361316c = aVar;
        this.f361317d = cVar;
        this.f361318e = abstractC10714d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d
    @N
    public final CrashlyticsReport.f.d.a b() {
        return this.f361316c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d
    @N
    public final CrashlyticsReport.f.d.c c() {
        return this.f361317d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d
    @P
    public final CrashlyticsReport.f.d.AbstractC10714d d() {
        return this.f361318e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d
    public final long e() {
        return this.f361314a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.d)) {
            return false;
        }
        CrashlyticsReport.f.d dVar = (CrashlyticsReport.f.d) obj;
        if (this.f361314a == dVar.e() && this.f361315b.equals(dVar.f()) && this.f361316c.equals(dVar.b()) && this.f361317d.equals(dVar.c())) {
            CrashlyticsReport.f.d.AbstractC10714d abstractC10714d = this.f361318e;
            if (abstractC10714d == null) {
                if (dVar.d() == null) {
                    return true;
                }
            } else if (abstractC10714d.equals(dVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d
    @N
    public final String f() {
        return this.f361315b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d
    public final CrashlyticsReport.f.d.b g() {
        return new b(this, null);
    }

    public final int hashCode() {
        long j12 = this.f361314a;
        int iHashCode = (((((((((int) ((j12 >>> 32) ^ j12)) ^ 1000003) * 1000003) ^ this.f361315b.hashCode()) * 1000003) ^ this.f361316c.hashCode()) * 1000003) ^ this.f361317d.hashCode()) * 1000003;
        CrashlyticsReport.f.d.AbstractC10714d abstractC10714d = this.f361318e;
        return iHashCode ^ (abstractC10714d == null ? 0 : abstractC10714d.hashCode());
    }

    public final String toString() {
        return "Event{timestamp=" + this.f361314a + ", type=" + this.f361315b + ", app=" + this.f361316c + ", device=" + this.f361317d + ", log=" + this.f361318e + "}";
    }
}
