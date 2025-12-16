package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;
import j.P;

/* compiled from: AutoValue_CrashlyticsReport.java */
/* renamed from: com.google.firebase.crashlytics.internal.model.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C37605b extends CrashlyticsReport {

    /* renamed from: b, reason: collision with root package name */
    public final String f361205b;

    /* renamed from: c, reason: collision with root package name */
    public final String f361206c;

    /* renamed from: d, reason: collision with root package name */
    public final int f361207d;

    /* renamed from: e, reason: collision with root package name */
    public final String f361208e;

    /* renamed from: f, reason: collision with root package name */
    public final String f361209f;

    /* renamed from: g, reason: collision with root package name */
    public final String f361210g;

    /* renamed from: h, reason: collision with root package name */
    public final CrashlyticsReport.f f361211h;

    /* renamed from: i, reason: collision with root package name */
    public final CrashlyticsReport.e f361212i;

    /* renamed from: j, reason: collision with root package name */
    public final CrashlyticsReport.a f361213j;

    /* compiled from: AutoValue_CrashlyticsReport.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.b$b, reason: collision with other inner class name */
    public static final class C10717b extends CrashlyticsReport.c {

        /* renamed from: a, reason: collision with root package name */
        public String f361214a;

        /* renamed from: b, reason: collision with root package name */
        public String f361215b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f361216c;

        /* renamed from: d, reason: collision with root package name */
        public String f361217d;

        /* renamed from: e, reason: collision with root package name */
        public String f361218e;

        /* renamed from: f, reason: collision with root package name */
        public String f361219f;

        /* renamed from: g, reason: collision with root package name */
        public CrashlyticsReport.f f361220g;

        /* renamed from: h, reason: collision with root package name */
        public CrashlyticsReport.e f361221h;

        /* renamed from: i, reason: collision with root package name */
        public CrashlyticsReport.a f361222i;

        public C10717b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
        public final CrashlyticsReport a() {
            String strQ = this.f361214a == null ? " sdkVersion" : "";
            if (this.f361215b == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " gmpAppId");
            }
            if (this.f361216c == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " platform");
            }
            if (this.f361217d == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " installationUuid");
            }
            if (this.f361218e == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " buildVersion");
            }
            if (this.f361219f == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " displayVersion");
            }
            if (strQ.isEmpty()) {
                return new C37605b(this.f361214a, this.f361215b, this.f361216c.intValue(), this.f361217d, this.f361218e, this.f361219f, this.f361220g, this.f361221h, this.f361222i, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
        public final CrashlyticsReport.c b(CrashlyticsReport.a aVar) {
            this.f361222i = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
        public final CrashlyticsReport.c c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f361218e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
        public final CrashlyticsReport.c d(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f361219f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
        public final CrashlyticsReport.c e(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f361215b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
        public final CrashlyticsReport.c f(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f361217d = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
        public final CrashlyticsReport.c g(CrashlyticsReport.e eVar) {
            this.f361221h = eVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
        public final CrashlyticsReport.c h(int i12) {
            this.f361216c = Integer.valueOf(i12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
        public final CrashlyticsReport.c i(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f361214a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
        public final CrashlyticsReport.c j(CrashlyticsReport.f fVar) {
            this.f361220g = fVar;
            return this;
        }

        public C10717b(CrashlyticsReport crashlyticsReport, a aVar) {
            this.f361214a = crashlyticsReport.i();
            this.f361215b = crashlyticsReport.e();
            this.f361216c = Integer.valueOf(crashlyticsReport.h());
            this.f361217d = crashlyticsReport.f();
            this.f361218e = crashlyticsReport.c();
            this.f361219f = crashlyticsReport.d();
            this.f361220g = crashlyticsReport.j();
            this.f361221h = crashlyticsReport.g();
            this.f361222i = crashlyticsReport.b();
        }
    }

    public C37605b(String str, String str2, int i12, String str3, String str4, String str5, CrashlyticsReport.f fVar, CrashlyticsReport.e eVar, CrashlyticsReport.a aVar, a aVar2) {
        this.f361205b = str;
        this.f361206c = str2;
        this.f361207d = i12;
        this.f361208e = str3;
        this.f361209f = str4;
        this.f361210g = str5;
        this.f361211h = fVar;
        this.f361212i = eVar;
        this.f361213j = aVar;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @P
    public final CrashlyticsReport.a b() {
        return this.f361213j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @N
    public final String c() {
        return this.f361209f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @N
    public final String d() {
        return this.f361210g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @N
    public final String e() {
        return this.f361206c;
    }

    public final boolean equals(Object obj) {
        CrashlyticsReport.f fVar;
        CrashlyticsReport.e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (this.f361205b.equals(crashlyticsReport.i()) && this.f361206c.equals(crashlyticsReport.e()) && this.f361207d == crashlyticsReport.h() && this.f361208e.equals(crashlyticsReport.f()) && this.f361209f.equals(crashlyticsReport.c()) && this.f361210g.equals(crashlyticsReport.d()) && ((fVar = this.f361211h) != null ? fVar.equals(crashlyticsReport.j()) : crashlyticsReport.j() == null) && ((eVar = this.f361212i) != null ? eVar.equals(crashlyticsReport.g()) : crashlyticsReport.g() == null)) {
            CrashlyticsReport.a aVar = this.f361213j;
            if (aVar == null) {
                if (crashlyticsReport.b() == null) {
                    return true;
                }
            } else if (aVar.equals(crashlyticsReport.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @N
    public final String f() {
        return this.f361208e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @P
    public final CrashlyticsReport.e g() {
        return this.f361212i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final int h() {
        return this.f361207d;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.f361205b.hashCode() ^ 1000003) * 1000003) ^ this.f361206c.hashCode()) * 1000003) ^ this.f361207d) * 1000003) ^ this.f361208e.hashCode()) * 1000003) ^ this.f361209f.hashCode()) * 1000003) ^ this.f361210g.hashCode()) * 1000003;
        CrashlyticsReport.f fVar = this.f361211h;
        int iHashCode2 = (iHashCode ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        CrashlyticsReport.e eVar = this.f361212i;
        int iHashCode3 = (iHashCode2 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        CrashlyticsReport.a aVar = this.f361213j;
        return iHashCode3 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @N
    public final String i() {
        return this.f361205b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @P
    public final CrashlyticsReport.f j() {
        return this.f361211h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.c k() {
        return new C10717b(this, null);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f361205b + ", gmpAppId=" + this.f361206c + ", platform=" + this.f361207d + ", installationUuid=" + this.f361208e + ", buildVersion=" + this.f361209f + ", displayVersion=" + this.f361210g + ", session=" + this.f361211h + ", ndkPayload=" + this.f361212i + ", appExitInfo=" + this.f361213j + "}";
    }
}
