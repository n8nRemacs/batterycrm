package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.P;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
/* loaded from: classes4.dex */
final class t extends CrashlyticsReport.f.d.c {

    /* renamed from: a, reason: collision with root package name */
    public final Double f361386a;

    /* renamed from: b, reason: collision with root package name */
    public final int f361387b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f361388c;

    /* renamed from: d, reason: collision with root package name */
    public final int f361389d;

    /* renamed from: e, reason: collision with root package name */
    public final long f361390e;

    /* renamed from: f, reason: collision with root package name */
    public final long f361391f;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
    public static final class b extends CrashlyticsReport.f.d.c.a {

        /* renamed from: a, reason: collision with root package name */
        public Double f361392a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f361393b;

        /* renamed from: c, reason: collision with root package name */
        public Boolean f361394c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f361395d;

        /* renamed from: e, reason: collision with root package name */
        public Long f361396e;

        /* renamed from: f, reason: collision with root package name */
        public Long f361397f;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c.a
        public final CrashlyticsReport.f.d.c a() {
            String strQ = this.f361393b == null ? " batteryVelocity" : "";
            if (this.f361394c == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " proximityOn");
            }
            if (this.f361395d == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " orientation");
            }
            if (this.f361396e == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " ramUsed");
            }
            if (this.f361397f == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " diskUsed");
            }
            if (strQ.isEmpty()) {
                return new t(this.f361392a, this.f361393b.intValue(), this.f361394c.booleanValue(), this.f361395d.intValue(), this.f361396e.longValue(), this.f361397f.longValue(), null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c.a
        public final CrashlyticsReport.f.d.c.a b(Double d12) {
            this.f361392a = d12;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c.a
        public final CrashlyticsReport.f.d.c.a c(int i12) {
            this.f361393b = Integer.valueOf(i12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c.a
        public final CrashlyticsReport.f.d.c.a d(long j12) {
            this.f361397f = Long.valueOf(j12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c.a
        public final CrashlyticsReport.f.d.c.a e(int i12) {
            this.f361395d = Integer.valueOf(i12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c.a
        public final CrashlyticsReport.f.d.c.a f(boolean z12) {
            this.f361394c = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c.a
        public final CrashlyticsReport.f.d.c.a g(long j12) {
            this.f361396e = Long.valueOf(j12);
            return this;
        }
    }

    public t(Double d12, int i12, boolean z12, int i13, long j12, long j13, a aVar) {
        this.f361386a = d12;
        this.f361387b = i12;
        this.f361388c = z12;
        this.f361389d = i13;
        this.f361390e = j12;
        this.f361391f = j13;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c
    @P
    public final Double b() {
        return this.f361386a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c
    public final int c() {
        return this.f361387b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c
    public final long d() {
        return this.f361391f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c
    public final int e() {
        return this.f361389d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.d.c)) {
            return false;
        }
        CrashlyticsReport.f.d.c cVar = (CrashlyticsReport.f.d.c) obj;
        Double d12 = this.f361386a;
        if (d12 != null ? d12.equals(cVar.b()) : cVar.b() == null) {
            if (this.f361387b == cVar.c() && this.f361388c == cVar.g() && this.f361389d == cVar.e() && this.f361390e == cVar.f() && this.f361391f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c
    public final long f() {
        return this.f361390e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c
    public final boolean g() {
        return this.f361388c;
    }

    public final int hashCode() {
        Double d12 = this.f361386a;
        int iHashCode = ((((((((d12 == null ? 0 : d12.hashCode()) ^ 1000003) * 1000003) ^ this.f361387b) * 1000003) ^ (this.f361388c ? 1231 : 1237)) * 1000003) ^ this.f361389d) * 1000003;
        long j12 = this.f361390e;
        long j13 = this.f361391f;
        return ((iHashCode ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ ((int) (j13 ^ (j13 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f361386a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f361387b);
        sb2.append(", proximityOn=");
        sb2.append(this.f361388c);
        sb2.append(", orientation=");
        sb2.append(this.f361389d);
        sb2.append(", ramUsed=");
        sb2.append(this.f361390e);
        sb2.append(", diskUsed=");
        return AK.c.j(this.f361391f, "}", sb2);
    }
}
