package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization.java */
/* loaded from: classes4.dex */
final class j extends CrashlyticsReport.f.a.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f361295a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization.java */
    public static final class b extends CrashlyticsReport.f.a.b.AbstractC10703a {
        public b() {
        }

        public b(CrashlyticsReport.f.a.b bVar, a aVar) {
            bVar.getClass();
        }
    }

    public j(String str, a aVar) {
        this.f361295a = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.b
    @N
    public final String a() {
        return this.f361295a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.f.a.b) {
            return this.f361295a.equals(((CrashlyticsReport.f.a.b) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f361295a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AK.c.s(new StringBuilder("Organization{clsId="), this.f361295a, "}");
    }
}
