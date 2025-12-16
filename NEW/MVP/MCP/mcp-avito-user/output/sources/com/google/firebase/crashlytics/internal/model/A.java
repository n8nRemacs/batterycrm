package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.C;

/* compiled from: AutoValue_StaticSessionData_OsData.java */
/* loaded from: classes4.dex */
final class A extends C.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f361074a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361075b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f361076c;

    public A(String str, String str2, boolean z12) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f361074a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f361075b = str2;
        this.f361076c = z12;
    }

    @Override // com.google.firebase.crashlytics.internal.model.C.c
    public final boolean b() {
        return this.f361076c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.C.c
    public final String c() {
        return this.f361075b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.C.c
    public final String d() {
        return this.f361074a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C.c)) {
            return false;
        }
        C.c cVar = (C.c) obj;
        return this.f361074a.equals(cVar.d()) && this.f361075b.equals(cVar.c()) && this.f361076c == cVar.b();
    }

    public final int hashCode() {
        return ((((this.f361074a.hashCode() ^ 1000003) * 1000003) ^ this.f361075b.hashCode()) * 1000003) ^ (this.f361076c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OsData{osRelease=");
        sb2.append(this.f361074a);
        sb2.append(", osCodeName=");
        sb2.append(this.f361075b);
        sb2.append(", isRooted=");
        return androidx.appcompat.app.r.s("}", sb2, this.f361076c);
    }
}
