package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;
import j.P;
import rZ0.InterfaceC47620a;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
/* loaded from: classes4.dex */
final class o extends CrashlyticsReport.f.d.a.b.AbstractC10705a {

    /* renamed from: a, reason: collision with root package name */
    public final long f361344a;

    /* renamed from: b, reason: collision with root package name */
    public final long f361345b;

    /* renamed from: c, reason: collision with root package name */
    public final String f361346c;

    /* renamed from: d, reason: collision with root package name */
    public final String f361347d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
    public static final class b extends CrashlyticsReport.f.d.a.b.AbstractC10705a.AbstractC10706a {

        /* renamed from: a, reason: collision with root package name */
        public Long f361348a;

        /* renamed from: b, reason: collision with root package name */
        public Long f361349b;

        /* renamed from: c, reason: collision with root package name */
        public String f361350c;

        /* renamed from: d, reason: collision with root package name */
        public String f361351d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10705a.AbstractC10706a
        public final CrashlyticsReport.f.d.a.b.AbstractC10705a a() {
            String strQ = this.f361348a == null ? " baseAddress" : "";
            if (this.f361349b == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " size");
            }
            if (this.f361350c == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " name");
            }
            if (strQ.isEmpty()) {
                return new o(this.f361348a.longValue(), this.f361349b.longValue(), this.f361350c, this.f361351d, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10705a.AbstractC10706a
        public final CrashlyticsReport.f.d.a.b.AbstractC10705a.AbstractC10706a b(long j12) {
            this.f361348a = Long.valueOf(j12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10705a.AbstractC10706a
        public final CrashlyticsReport.f.d.a.b.AbstractC10705a.AbstractC10706a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f361350c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10705a.AbstractC10706a
        public final CrashlyticsReport.f.d.a.b.AbstractC10705a.AbstractC10706a d(long j12) {
            this.f361349b = Long.valueOf(j12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10705a.AbstractC10706a
        public final CrashlyticsReport.f.d.a.b.AbstractC10705a.AbstractC10706a e(@P String str) {
            this.f361351d = str;
            return this;
        }
    }

    public o(long j12, long j13, String str, String str2, a aVar) {
        this.f361344a = j12;
        this.f361345b = j13;
        this.f361346c = str;
        this.f361347d = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10705a
    @N
    public final long b() {
        return this.f361344a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10705a
    @N
    public final String c() {
        return this.f361346c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10705a
    public final long d() {
        return this.f361345b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10705a
    @InterfaceC47620a.b
    @P
    public final String e() {
        return this.f361347d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.d.a.b.AbstractC10705a)) {
            return false;
        }
        CrashlyticsReport.f.d.a.b.AbstractC10705a abstractC10705a = (CrashlyticsReport.f.d.a.b.AbstractC10705a) obj;
        if (this.f361344a == abstractC10705a.b() && this.f361345b == abstractC10705a.d() && this.f361346c.equals(abstractC10705a.c())) {
            String str = this.f361347d;
            if (str == null) {
                if (abstractC10705a.e() == null) {
                    return true;
                }
            } else if (str.equals(abstractC10705a.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j12 = this.f361344a;
        long j13 = this.f361345b;
        int iHashCode = (((((((int) (j12 ^ (j12 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003) ^ this.f361346c.hashCode()) * 1000003;
        String str = this.f361347d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f361344a);
        sb2.append(", size=");
        sb2.append(this.f361345b);
        sb2.append(", name=");
        sb2.append(this.f361346c);
        sb2.append(", uuid=");
        return AK.c.s(sb2, this.f361347d, "}");
    }
}
