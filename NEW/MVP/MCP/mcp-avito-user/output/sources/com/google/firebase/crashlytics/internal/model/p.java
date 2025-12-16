package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;
import j.P;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
/* loaded from: classes4.dex */
final class p extends CrashlyticsReport.f.d.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f361352a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361353b;

    /* renamed from: c, reason: collision with root package name */
    public final B<CrashlyticsReport.f.d.a.b.e.AbstractC10712b> f361354c;

    /* renamed from: d, reason: collision with root package name */
    public final CrashlyticsReport.f.d.a.b.c f361355d;

    /* renamed from: e, reason: collision with root package name */
    public final int f361356e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
    public static final class b extends CrashlyticsReport.f.d.a.b.c.AbstractC10708a {

        /* renamed from: a, reason: collision with root package name */
        public String f361357a;

        /* renamed from: b, reason: collision with root package name */
        public String f361358b;

        /* renamed from: c, reason: collision with root package name */
        public B<CrashlyticsReport.f.d.a.b.e.AbstractC10712b> f361359c;

        /* renamed from: d, reason: collision with root package name */
        public CrashlyticsReport.f.d.a.b.c f361360d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f361361e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c.AbstractC10708a
        public final CrashlyticsReport.f.d.a.b.c a() {
            String strQ = this.f361357a == null ? " type" : "";
            if (this.f361359c == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " frames");
            }
            if (this.f361361e == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " overflowCount");
            }
            if (strQ.isEmpty()) {
                return new p(this.f361357a, this.f361358b, this.f361359c, this.f361360d, this.f361361e.intValue(), null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c.AbstractC10708a
        public final CrashlyticsReport.f.d.a.b.c.AbstractC10708a b(CrashlyticsReport.f.d.a.b.c cVar) {
            this.f361360d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c.AbstractC10708a
        public final CrashlyticsReport.f.d.a.b.c.AbstractC10708a c(B<CrashlyticsReport.f.d.a.b.e.AbstractC10712b> b12) {
            if (b12 == null) {
                throw new NullPointerException("Null frames");
            }
            this.f361359c = b12;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c.AbstractC10708a
        public final CrashlyticsReport.f.d.a.b.c.AbstractC10708a d(int i12) {
            this.f361361e = Integer.valueOf(i12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c.AbstractC10708a
        public final CrashlyticsReport.f.d.a.b.c.AbstractC10708a e(String str) {
            this.f361358b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c.AbstractC10708a
        public final CrashlyticsReport.f.d.a.b.c.AbstractC10708a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f361357a = str;
            return this;
        }
    }

    public p() {
        throw null;
    }

    public p(String str, String str2, B b12, CrashlyticsReport.f.d.a.b.c cVar, int i12, a aVar) {
        this.f361352a = str;
        this.f361353b = str2;
        this.f361354c = b12;
        this.f361355d = cVar;
        this.f361356e = i12;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c
    @P
    public final CrashlyticsReport.f.d.a.b.c b() {
        return this.f361355d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c
    @N
    public final B<CrashlyticsReport.f.d.a.b.e.AbstractC10712b> c() {
        return this.f361354c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c
    public final int d() {
        return this.f361356e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c
    @P
    public final String e() {
        return this.f361353b;
    }

    public final boolean equals(Object obj) {
        String str;
        CrashlyticsReport.f.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.d.a.b.c)) {
            return false;
        }
        CrashlyticsReport.f.d.a.b.c cVar2 = (CrashlyticsReport.f.d.a.b.c) obj;
        if (this.f361352a.equals(cVar2.f()) && ((str = this.f361353b) != null ? str.equals(cVar2.e()) : cVar2.e() == null)) {
            if (this.f361354c.f361077b.equals(cVar2.c()) && ((cVar = this.f361355d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f361356e == cVar2.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c
    @N
    public final String f() {
        return this.f361352a;
    }

    public final int hashCode() {
        int iHashCode = (this.f361352a.hashCode() ^ 1000003) * 1000003;
        String str = this.f361353b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f361354c.f361077b.hashCode()) * 1000003;
        CrashlyticsReport.f.d.a.b.c cVar = this.f361355d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f361356e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f361352a);
        sb2.append(", reason=");
        sb2.append(this.f361353b);
        sb2.append(", frames=");
        sb2.append(this.f361354c);
        sb2.append(", causedBy=");
        sb2.append(this.f361355d);
        sb2.append(", overflowCount=");
        return AK.c.i(this.f361356e, "}", sb2);
    }
}
