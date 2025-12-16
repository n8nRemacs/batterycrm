package com.google.android.play.integrity.internal;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final long f358915a;

    public g(long j12) {
        this.f358915a = j12;
    }

    @Override // com.google.android.play.integrity.internal.h
    public final long a() {
        return this.f358915a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            hVar.getClass();
            if (this.f358915a == hVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j12 = this.f358915a;
        return ((int) ((j12 >>> 32) ^ j12)) ^ (-724379968);
    }

    public final String toString() {
        return AK.c.j(this.f358915a, "}", new StringBuilder("EventRecord{eventType=3, eventTimestamp="));
    }
}
