package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
/* loaded from: classes4.dex */
final class u extends CrashlyticsReport.f.d.AbstractC10714d {

    /* renamed from: a, reason: collision with root package name */
    public final String f361398a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
    public static final class b extends CrashlyticsReport.f.d.AbstractC10714d.a {

        /* renamed from: a, reason: collision with root package name */
        public String f361399a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.AbstractC10714d.a
        public final CrashlyticsReport.f.d.AbstractC10714d a() {
            String str = this.f361399a == null ? " content" : "";
            if (str.isEmpty()) {
                return new u(this.f361399a, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.AbstractC10714d.a
        public final CrashlyticsReport.f.d.AbstractC10714d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f361399a = str;
            return this;
        }
    }

    public u(String str, a aVar) {
        this.f361398a = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.AbstractC10714d
    @N
    public final String b() {
        return this.f361398a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.f.d.AbstractC10714d) {
            return this.f361398a.equals(((CrashlyticsReport.f.d.AbstractC10714d) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f361398a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AK.c.s(new StringBuilder("Log{content="), this.f361398a, "}");
    }
}
