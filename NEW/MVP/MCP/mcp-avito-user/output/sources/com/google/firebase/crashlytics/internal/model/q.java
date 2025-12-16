package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
/* loaded from: classes4.dex */
final class q extends CrashlyticsReport.f.d.a.b.AbstractC10709d {

    /* renamed from: a, reason: collision with root package name */
    public final String f361362a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361363b;

    /* renamed from: c, reason: collision with root package name */
    public final long f361364c;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
    public static final class b extends CrashlyticsReport.f.d.a.b.AbstractC10709d.AbstractC10710a {

        /* renamed from: a, reason: collision with root package name */
        public String f361365a;

        /* renamed from: b, reason: collision with root package name */
        public String f361366b;

        /* renamed from: c, reason: collision with root package name */
        public Long f361367c;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10709d.AbstractC10710a
        public final CrashlyticsReport.f.d.a.b.AbstractC10709d a() {
            String strQ = this.f361365a == null ? " name" : "";
            if (this.f361366b == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " code");
            }
            if (this.f361367c == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " address");
            }
            if (strQ.isEmpty()) {
                return new q(this.f361365a, this.f361366b, this.f361367c.longValue(), null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10709d.AbstractC10710a
        public final CrashlyticsReport.f.d.a.b.AbstractC10709d.AbstractC10710a b(long j12) {
            this.f361367c = Long.valueOf(j12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10709d.AbstractC10710a
        public final CrashlyticsReport.f.d.a.b.AbstractC10709d.AbstractC10710a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f361366b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10709d.AbstractC10710a
        public final CrashlyticsReport.f.d.a.b.AbstractC10709d.AbstractC10710a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f361365a = str;
            return this;
        }
    }

    public q(String str, String str2, long j12, a aVar) {
        this.f361362a = str;
        this.f361363b = str2;
        this.f361364c = j12;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10709d
    @N
    public final long b() {
        return this.f361364c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10709d
    @N
    public final String c() {
        return this.f361363b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10709d
    @N
    public final String d() {
        return this.f361362a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.d.a.b.AbstractC10709d)) {
            return false;
        }
        CrashlyticsReport.f.d.a.b.AbstractC10709d abstractC10709d = (CrashlyticsReport.f.d.a.b.AbstractC10709d) obj;
        return this.f361362a.equals(abstractC10709d.d()) && this.f361363b.equals(abstractC10709d.c()) && this.f361364c == abstractC10709d.b();
    }

    public final int hashCode() {
        int iHashCode = (((this.f361362a.hashCode() ^ 1000003) * 1000003) ^ this.f361363b.hashCode()) * 1000003;
        long j12 = this.f361364c;
        return iHashCode ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f361362a);
        sb2.append(", code=");
        sb2.append(this.f361363b);
        sb2.append(", address=");
        return AK.c.j(this.f361364c, "}", sb2);
    }
}
