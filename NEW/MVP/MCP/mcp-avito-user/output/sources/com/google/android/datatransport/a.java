package com.google.android.datatransport;

import j.P;

/* compiled from: AutoValue_Event.java */
/* loaded from: classes10.dex */
final class a<T> extends d<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f342920a;

    /* renamed from: b, reason: collision with root package name */
    public final Priority f342921b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Object obj, Priority priority) {
        if (obj == 0) {
            throw new NullPointerException("Null payload");
        }
        this.f342920a = obj;
        this.f342921b = priority;
    }

    @Override // com.google.android.datatransport.d
    @P
    public final Integer a() {
        return null;
    }

    @Override // com.google.android.datatransport.d
    public final T b() {
        return this.f342920a;
    }

    @Override // com.google.android.datatransport.d
    public final Priority c() {
        return this.f342921b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.a() == null) {
            if (this.f342920a.equals(dVar.b()) && this.f342921b.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f342921b.hashCode() ^ (((1000003 * 1000003) ^ this.f342920a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f342920a + ", priority=" + this.f342921b + "}";
    }
}
