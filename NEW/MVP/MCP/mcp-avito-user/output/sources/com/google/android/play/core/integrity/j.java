package com.google.android.play.core.integrity;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
final class j extends d {

    /* renamed from: a, reason: collision with root package name */
    public final String f358573a;

    @Override // com.google.android.play.core.integrity.d
    public final String a() {
        return this.f358573a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return this.f358573a.equals(((d) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f358573a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AK.c.s(new StringBuilder("IntegrityTokenResponse{token="), this.f358573a, "}");
    }
}
