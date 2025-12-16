package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;

/* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
/* loaded from: classes4.dex */
final class v extends CrashlyticsReport.f.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f361400a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361401b;

    /* renamed from: c, reason: collision with root package name */
    public final String f361402c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f361403d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    public static final class b extends CrashlyticsReport.f.e.a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f361404a;

        /* renamed from: b, reason: collision with root package name */
        public String f361405b;

        /* renamed from: c, reason: collision with root package name */
        public String f361406c;

        /* renamed from: d, reason: collision with root package name */
        public Boolean f361407d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.e.a
        public final CrashlyticsReport.f.e a() {
            String strQ = this.f361404a == null ? " platform" : "";
            if (this.f361405b == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " version");
            }
            if (this.f361406c == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " buildVersion");
            }
            if (this.f361407d == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " jailbroken");
            }
            if (strQ.isEmpty()) {
                return new v(this.f361404a.intValue(), this.f361405b, this.f361406c, this.f361407d.booleanValue(), null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.e.a
        public final CrashlyticsReport.f.e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f361406c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.e.a
        public final CrashlyticsReport.f.e.a c(boolean z12) {
            this.f361407d = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.e.a
        public final CrashlyticsReport.f.e.a d(int i12) {
            this.f361404a = Integer.valueOf(i12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.e.a
        public final CrashlyticsReport.f.e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f361405b = str;
            return this;
        }
    }

    public v(int i12, String str, String str2, boolean z12, a aVar) {
        this.f361400a = i12;
        this.f361401b = str;
        this.f361402c = str2;
        this.f361403d = z12;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.e
    @N
    public final String b() {
        return this.f361402c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.e
    public final int c() {
        return this.f361400a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.e
    @N
    public final String d() {
        return this.f361401b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.e
    public final boolean e() {
        return this.f361403d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.e)) {
            return false;
        }
        CrashlyticsReport.f.e eVar = (CrashlyticsReport.f.e) obj;
        return this.f361400a == eVar.c() && this.f361401b.equals(eVar.d()) && this.f361402c.equals(eVar.b()) && this.f361403d == eVar.e();
    }

    public final int hashCode() {
        return ((((((this.f361400a ^ 1000003) * 1000003) ^ this.f361401b.hashCode()) * 1000003) ^ this.f361402c.hashCode()) * 1000003) ^ (this.f361403d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OperatingSystem{platform=");
        sb2.append(this.f361400a);
        sb2.append(", version=");
        sb2.append(this.f361401b);
        sb2.append(", buildVersion=");
        sb2.append(this.f361402c);
        sb2.append(", jailbroken=");
        return androidx.appcompat.app.r.s("}", sb2, this.f361403d);
    }
}
