package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;

/* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
/* loaded from: classes4.dex */
final class e extends CrashlyticsReport.d {

    /* renamed from: a, reason: collision with root package name */
    public final String f361247a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361248b;

    /* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
    public static final class b extends CrashlyticsReport.d.a {

        /* renamed from: a, reason: collision with root package name */
        public String f361249a;

        /* renamed from: b, reason: collision with root package name */
        public String f361250b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.a
        public final CrashlyticsReport.d a() {
            String strQ = this.f361249a == null ? " key" : "";
            if (this.f361250b == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " value");
            }
            if (strQ.isEmpty()) {
                return new e(this.f361249a, this.f361250b, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.a
        public final CrashlyticsReport.d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f361249a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.a
        public final CrashlyticsReport.d.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f361250b = str;
            return this;
        }
    }

    public e(String str, String str2, a aVar) {
        this.f361247a = str;
        this.f361248b = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d
    @N
    public final String b() {
        return this.f361247a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d
    @N
    public final String c() {
        return this.f361248b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d)) {
            return false;
        }
        CrashlyticsReport.d dVar = (CrashlyticsReport.d) obj;
        return this.f361247a.equals(dVar.b()) && this.f361248b.equals(dVar.c());
    }

    public final int hashCode() {
        return ((this.f361247a.hashCode() ^ 1000003) * 1000003) ^ this.f361248b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f361247a);
        sb2.append(", value=");
        return AK.c.s(sb2, this.f361248b, "}");
    }
}
