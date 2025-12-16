package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
/* loaded from: classes4.dex */
final class d extends CrashlyticsReport.a.AbstractC10700a {

    /* renamed from: a, reason: collision with root package name */
    public final String f361241a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361242b;

    /* renamed from: c, reason: collision with root package name */
    public final String f361243c;

    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
    public static final class b extends CrashlyticsReport.a.AbstractC10700a.AbstractC10701a {

        /* renamed from: a, reason: collision with root package name */
        public String f361244a;

        /* renamed from: b, reason: collision with root package name */
        public String f361245b;

        /* renamed from: c, reason: collision with root package name */
        public String f361246c;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.AbstractC10700a.AbstractC10701a
        public final CrashlyticsReport.a.AbstractC10700a a() {
            String strQ = this.f361244a == null ? " arch" : "";
            if (this.f361245b == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " libraryName");
            }
            if (this.f361246c == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " buildId");
            }
            if (strQ.isEmpty()) {
                return new d(this.f361244a, this.f361245b, this.f361246c, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.AbstractC10700a.AbstractC10701a
        public final CrashlyticsReport.a.AbstractC10700a.AbstractC10701a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f361244a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.AbstractC10700a.AbstractC10701a
        public final CrashlyticsReport.a.AbstractC10700a.AbstractC10701a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f361246c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.AbstractC10700a.AbstractC10701a
        public final CrashlyticsReport.a.AbstractC10700a.AbstractC10701a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f361245b = str;
            return this;
        }
    }

    public d(String str, String str2, String str3, a aVar) {
        this.f361241a = str;
        this.f361242b = str2;
        this.f361243c = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.AbstractC10700a
    @N
    public final String b() {
        return this.f361241a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.AbstractC10700a
    @N
    public final String c() {
        return this.f361243c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.AbstractC10700a
    @N
    public final String d() {
        return this.f361242b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.a.AbstractC10700a)) {
            return false;
        }
        CrashlyticsReport.a.AbstractC10700a abstractC10700a = (CrashlyticsReport.a.AbstractC10700a) obj;
        return this.f361241a.equals(abstractC10700a.b()) && this.f361242b.equals(abstractC10700a.d()) && this.f361243c.equals(abstractC10700a.c());
    }

    public final int hashCode() {
        return ((((this.f361241a.hashCode() ^ 1000003) * 1000003) ^ this.f361242b.hashCode()) * 1000003) ^ this.f361243c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f361241a);
        sb2.append(", libraryName=");
        sb2.append(this.f361242b);
        sb2.append(", buildId=");
        return AK.c.s(sb2, this.f361243c, "}");
    }
}
