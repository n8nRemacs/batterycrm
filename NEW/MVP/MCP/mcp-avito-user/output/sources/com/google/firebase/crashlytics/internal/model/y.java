package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.C;

/* compiled from: AutoValue_StaticSessionData_AppData.java */
/* loaded from: classes4.dex */
final class y extends C.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f361413a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361414b;

    /* renamed from: c, reason: collision with root package name */
    public final String f361415c;

    /* renamed from: d, reason: collision with root package name */
    public final String f361416d;

    /* renamed from: e, reason: collision with root package name */
    public final int f361417e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.c f361418f;

    public y(String str, String str2, String str3, String str4, int i12, com.google.firebase.crashlytics.internal.c cVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f361413a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f361414b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f361415c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f361416d = str4;
        this.f361417e = i12;
        this.f361418f = cVar;
    }

    @Override // com.google.firebase.crashlytics.internal.model.C.a
    public final String a() {
        return this.f361413a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.C.a
    public final int c() {
        return this.f361417e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.C.a
    public final com.google.firebase.crashlytics.internal.c d() {
        return this.f361418f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.C.a
    public final String e() {
        return this.f361416d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C.a)) {
            return false;
        }
        C.a aVar = (C.a) obj;
        return this.f361413a.equals(aVar.a()) && this.f361414b.equals(aVar.f()) && this.f361415c.equals(aVar.g()) && this.f361416d.equals(aVar.e()) && this.f361417e == aVar.c() && this.f361418f.equals(aVar.d());
    }

    @Override // com.google.firebase.crashlytics.internal.model.C.a
    public final String f() {
        return this.f361414b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.C.a
    public final String g() {
        return this.f361415c;
    }

    public final int hashCode() {
        return ((((((((((this.f361413a.hashCode() ^ 1000003) * 1000003) ^ this.f361414b.hashCode()) * 1000003) ^ this.f361415c.hashCode()) * 1000003) ^ this.f361416d.hashCode()) * 1000003) ^ this.f361417e) * 1000003) ^ this.f361418f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f361413a + ", versionCode=" + this.f361414b + ", versionName=" + this.f361415c + ", installUuid=" + this.f361416d + ", deliveryMechanism=" + this.f361417e + ", developmentPlatformProvider=" + this.f361418f + "}";
    }
}
