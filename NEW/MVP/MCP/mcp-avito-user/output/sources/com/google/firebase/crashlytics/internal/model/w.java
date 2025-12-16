package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;

/* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
/* loaded from: classes4.dex */
final class w extends CrashlyticsReport.f.AbstractC10715f {

    /* renamed from: a, reason: collision with root package name */
    public final String f361408a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
    public static final class b extends CrashlyticsReport.f.AbstractC10715f.a {

        /* renamed from: a, reason: collision with root package name */
        public String f361409a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.AbstractC10715f.a
        public final CrashlyticsReport.f.AbstractC10715f a() {
            String str = this.f361409a == null ? " identifier" : "";
            if (str.isEmpty()) {
                return new w(this.f361409a, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.AbstractC10715f.a
        public final CrashlyticsReport.f.AbstractC10715f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f361409a = str;
            return this;
        }
    }

    public w(String str, a aVar) {
        this.f361408a = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.AbstractC10715f
    @N
    public final String b() {
        return this.f361408a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.f.AbstractC10715f) {
            return this.f361408a.equals(((CrashlyticsReport.f.AbstractC10715f) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f361408a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AK.c.s(new StringBuilder("User{identifier="), this.f361408a, "}");
    }
}
