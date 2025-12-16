package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.C;

/* compiled from: AutoValue_StaticSessionData.java */
/* loaded from: classes4.dex */
final class x extends C {

    /* renamed from: a, reason: collision with root package name */
    public final C.a f361410a;

    /* renamed from: b, reason: collision with root package name */
    public final C.c f361411b;

    /* renamed from: c, reason: collision with root package name */
    public final C.b f361412c;

    public x(C.a aVar, C.c cVar, C.b bVar) {
        this.f361410a = aVar;
        this.f361411b = cVar;
        this.f361412c = bVar;
    }

    @Override // com.google.firebase.crashlytics.internal.model.C
    public final C.a a() {
        return this.f361410a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.C
    public final C.b c() {
        return this.f361412c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.C
    public final C.c d() {
        return this.f361411b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c12 = (C) obj;
        return this.f361410a.equals(c12.a()) && this.f361411b.equals(c12.d()) && this.f361412c.equals(c12.c());
    }

    public final int hashCode() {
        return ((((this.f361410a.hashCode() ^ 1000003) * 1000003) ^ this.f361411b.hashCode()) * 1000003) ^ this.f361412c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f361410a + ", osData=" + this.f361411b + ", deviceData=" + this.f361412c + "}";
    }
}
