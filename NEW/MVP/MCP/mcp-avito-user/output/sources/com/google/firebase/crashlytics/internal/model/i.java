package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;
import j.P;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
/* loaded from: classes4.dex */
final class i extends CrashlyticsReport.f.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f361281a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361282b;

    /* renamed from: c, reason: collision with root package name */
    public final String f361283c;

    /* renamed from: d, reason: collision with root package name */
    public final CrashlyticsReport.f.a.b f361284d;

    /* renamed from: e, reason: collision with root package name */
    public final String f361285e;

    /* renamed from: f, reason: collision with root package name */
    public final String f361286f;

    /* renamed from: g, reason: collision with root package name */
    public final String f361287g;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
    public static final class b extends CrashlyticsReport.f.a.AbstractC10702a {

        /* renamed from: a, reason: collision with root package name */
        public String f361288a;

        /* renamed from: b, reason: collision with root package name */
        public String f361289b;

        /* renamed from: c, reason: collision with root package name */
        public String f361290c;

        /* renamed from: d, reason: collision with root package name */
        public final CrashlyticsReport.f.a.b f361291d;

        /* renamed from: e, reason: collision with root package name */
        public String f361292e;

        /* renamed from: f, reason: collision with root package name */
        public String f361293f;

        /* renamed from: g, reason: collision with root package name */
        public String f361294g;

        public b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.AbstractC10702a
        public final CrashlyticsReport.f.a a() {
            String strQ = this.f361288a == null ? " identifier" : "";
            if (this.f361289b == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " version");
            }
            if (strQ.isEmpty()) {
                return new i(this.f361288a, this.f361289b, this.f361290c, this.f361291d, this.f361292e, this.f361293f, this.f361294g, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.AbstractC10702a
        public final CrashlyticsReport.f.a.AbstractC10702a b(@P String str) {
            this.f361293f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.AbstractC10702a
        public final CrashlyticsReport.f.a.AbstractC10702a c(@P String str) {
            this.f361294g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.AbstractC10702a
        public final CrashlyticsReport.f.a.AbstractC10702a d(String str) {
            this.f361290c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.AbstractC10702a
        public final CrashlyticsReport.f.a.AbstractC10702a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f361288a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.AbstractC10702a
        public final CrashlyticsReport.f.a.AbstractC10702a f(String str) {
            this.f361292e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.AbstractC10702a
        public final CrashlyticsReport.f.a.AbstractC10702a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f361289b = str;
            return this;
        }

        public b(CrashlyticsReport.f.a aVar, a aVar2) {
            this.f361288a = aVar.e();
            this.f361289b = aVar.h();
            this.f361290c = aVar.d();
            this.f361291d = aVar.g();
            this.f361292e = aVar.f();
            this.f361293f = aVar.b();
            this.f361294g = aVar.c();
        }
    }

    public i(String str, String str2, String str3, CrashlyticsReport.f.a.b bVar, String str4, String str5, String str6, a aVar) {
        this.f361281a = str;
        this.f361282b = str2;
        this.f361283c = str3;
        this.f361284d = bVar;
        this.f361285e = str4;
        this.f361286f = str5;
        this.f361287g = str6;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a
    @P
    public final String b() {
        return this.f361286f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a
    @P
    public final String c() {
        return this.f361287g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a
    @P
    public final String d() {
        return this.f361283c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a
    @N
    public final String e() {
        return this.f361281a;
    }

    public final boolean equals(Object obj) {
        String str;
        CrashlyticsReport.f.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.a)) {
            return false;
        }
        CrashlyticsReport.f.a aVar = (CrashlyticsReport.f.a) obj;
        if (this.f361281a.equals(aVar.e()) && this.f361282b.equals(aVar.h()) && ((str = this.f361283c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f361284d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f361285e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f361286f) != null ? str3.equals(aVar.b()) : aVar.b() == null)) {
            String str4 = this.f361287g;
            if (str4 == null) {
                if (aVar.c() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a
    @P
    public final String f() {
        return this.f361285e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a
    @P
    public final CrashlyticsReport.f.a.b g() {
        return this.f361284d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a
    @N
    public final String h() {
        return this.f361282b;
    }

    public final int hashCode() {
        int iHashCode = (((this.f361281a.hashCode() ^ 1000003) * 1000003) ^ this.f361282b.hashCode()) * 1000003;
        String str = this.f361283c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        CrashlyticsReport.f.a.b bVar = this.f361284d;
        int iHashCode3 = (iHashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f361285e;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f361286f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f361287g;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f361281a);
        sb2.append(", version=");
        sb2.append(this.f361282b);
        sb2.append(", displayVersion=");
        sb2.append(this.f361283c);
        sb2.append(", organization=");
        sb2.append(this.f361284d);
        sb2.append(", installationUuid=");
        sb2.append(this.f361285e);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f361286f);
        sb2.append(", developmentPlatformVersion=");
        return AK.c.s(sb2, this.f361287g, "}");
    }
}
