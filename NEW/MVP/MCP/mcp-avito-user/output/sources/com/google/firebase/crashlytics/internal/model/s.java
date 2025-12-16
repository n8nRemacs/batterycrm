package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;
import j.P;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
/* loaded from: classes4.dex */
final class s extends CrashlyticsReport.f.d.a.b.e.AbstractC10712b {

    /* renamed from: a, reason: collision with root package name */
    public final long f361374a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361375b;

    /* renamed from: c, reason: collision with root package name */
    public final String f361376c;

    /* renamed from: d, reason: collision with root package name */
    public final long f361377d;

    /* renamed from: e, reason: collision with root package name */
    public final int f361378e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    public static final class b extends CrashlyticsReport.f.d.a.b.e.AbstractC10712b.AbstractC10713a {

        /* renamed from: a, reason: collision with root package name */
        public Long f361379a;

        /* renamed from: b, reason: collision with root package name */
        public String f361380b;

        /* renamed from: c, reason: collision with root package name */
        public String f361381c;

        /* renamed from: d, reason: collision with root package name */
        public Long f361382d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f361383e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC10712b.AbstractC10713a
        public final CrashlyticsReport.f.d.a.b.e.AbstractC10712b a() {
            String strQ = this.f361379a == null ? " pc" : "";
            if (this.f361380b == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " symbol");
            }
            if (this.f361382d == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " offset");
            }
            if (this.f361383e == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " importance");
            }
            if (strQ.isEmpty()) {
                return new s(this.f361379a.longValue(), this.f361380b, this.f361381c, this.f361382d.longValue(), this.f361383e.intValue(), null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC10712b.AbstractC10713a
        public final CrashlyticsReport.f.d.a.b.e.AbstractC10712b.AbstractC10713a b(String str) {
            this.f361381c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC10712b.AbstractC10713a
        public final CrashlyticsReport.f.d.a.b.e.AbstractC10712b.AbstractC10713a c(int i12) {
            this.f361383e = Integer.valueOf(i12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC10712b.AbstractC10713a
        public final CrashlyticsReport.f.d.a.b.e.AbstractC10712b.AbstractC10713a d(long j12) {
            this.f361382d = Long.valueOf(j12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC10712b.AbstractC10713a
        public final CrashlyticsReport.f.d.a.b.e.AbstractC10712b.AbstractC10713a e(long j12) {
            this.f361379a = Long.valueOf(j12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC10712b.AbstractC10713a
        public final CrashlyticsReport.f.d.a.b.e.AbstractC10712b.AbstractC10713a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f361380b = str;
            return this;
        }
    }

    public s(long j12, String str, String str2, long j13, int i12, a aVar) {
        this.f361374a = j12;
        this.f361375b = str;
        this.f361376c = str2;
        this.f361377d = j13;
        this.f361378e = i12;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC10712b
    @P
    public final String b() {
        return this.f361376c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC10712b
    public final int c() {
        return this.f361378e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC10712b
    public final long d() {
        return this.f361377d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC10712b
    public final long e() {
        return this.f361374a;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.d.a.b.e.AbstractC10712b)) {
            return false;
        }
        CrashlyticsReport.f.d.a.b.e.AbstractC10712b abstractC10712b = (CrashlyticsReport.f.d.a.b.e.AbstractC10712b) obj;
        return this.f361374a == abstractC10712b.e() && this.f361375b.equals(abstractC10712b.f()) && ((str = this.f361376c) != null ? str.equals(abstractC10712b.b()) : abstractC10712b.b() == null) && this.f361377d == abstractC10712b.d() && this.f361378e == abstractC10712b.c();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC10712b
    @N
    public final String f() {
        return this.f361375b;
    }

    public final int hashCode() {
        long j12 = this.f361374a;
        int iHashCode = (((((int) (j12 ^ (j12 >>> 32))) ^ 1000003) * 1000003) ^ this.f361375b.hashCode()) * 1000003;
        String str = this.f361376c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j13 = this.f361377d;
        return ((iHashCode2 ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003) ^ this.f361378e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f361374a);
        sb2.append(", symbol=");
        sb2.append(this.f361375b);
        sb2.append(", file=");
        sb2.append(this.f361376c);
        sb2.append(", offset=");
        sb2.append(this.f361377d);
        sb2.append(", importance=");
        return AK.c.i(this.f361378e, "}", sb2);
    }
}
