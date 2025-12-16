package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;
import j.P;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
/* loaded from: classes4.dex */
final class f extends CrashlyticsReport.e {

    /* renamed from: a, reason: collision with root package name */
    public final B<CrashlyticsReport.e.b> f361251a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361252b;

    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
    public static final class b extends CrashlyticsReport.e.a {

        /* renamed from: a, reason: collision with root package name */
        public B<CrashlyticsReport.e.b> f361253a;

        /* renamed from: b, reason: collision with root package name */
        public String f361254b;

        public b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e.a
        public final CrashlyticsReport.e a() {
            String str = this.f361253a == null ? " files" : "";
            if (str.isEmpty()) {
                return new f(this.f361253a, this.f361254b, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e.a
        public final CrashlyticsReport.e.a b(B<CrashlyticsReport.e.b> b12) {
            this.f361253a = b12;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e.a
        public final CrashlyticsReport.e.a c(String str) {
            this.f361254b = str;
            return this;
        }

        public b(CrashlyticsReport.e eVar, a aVar) {
            this.f361253a = eVar.b();
            this.f361254b = eVar.c();
        }
    }

    public f() {
        throw null;
    }

    public f(B b12, String str, a aVar) {
        this.f361251a = b12;
        this.f361252b = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e
    @N
    public final B<CrashlyticsReport.e.b> b() {
        return this.f361251a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e
    @P
    public final String c() {
        return this.f361252b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.e)) {
            return false;
        }
        CrashlyticsReport.e eVar = (CrashlyticsReport.e) obj;
        if (this.f361251a.f361077b.equals(eVar.b())) {
            String str = this.f361252b;
            if (str == null) {
                if (eVar.c() == null) {
                    return true;
                }
            } else if (str.equals(eVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f361251a.f361077b.hashCode() ^ 1000003) * 1000003;
        String str = this.f361252b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f361251a);
        sb2.append(", orgId=");
        return AK.c.s(sb2, this.f361252b, "}");
    }
}
