package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
/* loaded from: classes4.dex */
final class r extends CrashlyticsReport.f.d.a.b.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f361368a;

    /* renamed from: b, reason: collision with root package name */
    public final int f361369b;

    /* renamed from: c, reason: collision with root package name */
    public final B<CrashlyticsReport.f.d.a.b.e.AbstractC10712b> f361370c;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
    public static final class b extends CrashlyticsReport.f.d.a.b.e.AbstractC10711a {

        /* renamed from: a, reason: collision with root package name */
        public String f361371a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f361372b;

        /* renamed from: c, reason: collision with root package name */
        public B<CrashlyticsReport.f.d.a.b.e.AbstractC10712b> f361373c;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC10711a
        public final CrashlyticsReport.f.d.a.b.e a() {
            String strQ = this.f361371a == null ? " name" : "";
            if (this.f361372b == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " importance");
            }
            if (this.f361373c == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " frames");
            }
            if (strQ.isEmpty()) {
                return new r(this.f361371a, this.f361372b.intValue(), this.f361373c, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC10711a
        public final CrashlyticsReport.f.d.a.b.e.AbstractC10711a b(B<CrashlyticsReport.f.d.a.b.e.AbstractC10712b> b12) {
            if (b12 == null) {
                throw new NullPointerException("Null frames");
            }
            this.f361373c = b12;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC10711a
        public final CrashlyticsReport.f.d.a.b.e.AbstractC10711a c(int i12) {
            this.f361372b = Integer.valueOf(i12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC10711a
        public final CrashlyticsReport.f.d.a.b.e.AbstractC10711a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f361371a = str;
            return this;
        }
    }

    public r() {
        throw null;
    }

    public r(String str, int i12, B b12, a aVar) {
        this.f361368a = str;
        this.f361369b = i12;
        this.f361370c = b12;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e
    @N
    public final B<CrashlyticsReport.f.d.a.b.e.AbstractC10712b> b() {
        return this.f361370c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e
    public final int c() {
        return this.f361369b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e
    @N
    public final String d() {
        return this.f361368a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.d.a.b.e)) {
            return false;
        }
        CrashlyticsReport.f.d.a.b.e eVar = (CrashlyticsReport.f.d.a.b.e) obj;
        if (this.f361368a.equals(eVar.d()) && this.f361369b == eVar.c()) {
            if (this.f361370c.f361077b.equals(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f361368a.hashCode() ^ 1000003) * 1000003) ^ this.f361369b) * 1000003) ^ this.f361370c.f361077b.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f361368a + ", importance=" + this.f361369b + ", frames=" + this.f361370c + "}";
    }
}
