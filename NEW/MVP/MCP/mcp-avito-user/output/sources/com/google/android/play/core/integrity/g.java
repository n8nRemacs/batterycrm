package com.google.android.play.core.integrity;

import j.P;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
final class g extends c {

    /* renamed from: a, reason: collision with root package name */
    public final String f358571a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f358572b;

    public /* synthetic */ g(String str, Long l12, f fVar) {
        this.f358571a = str;
        this.f358572b = l12;
    }

    @Override // com.google.android.play.core.integrity.c
    @P
    public final Long b() {
        return this.f358572b;
    }

    @Override // com.google.android.play.core.integrity.c
    public final String c() {
        return this.f358571a;
    }

    public final boolean equals(Object obj) {
        Long l12;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f358571a.equals(cVar.c()) && ((l12 = this.f358572b) != null ? l12.equals(cVar.b()) : cVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f358571a.hashCode() ^ 1000003;
        Long l12 = this.f358572b;
        return (iHashCode * 1000003) ^ (l12 == null ? 0 : l12.hashCode());
    }

    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.f358571a + ", cloudProjectNumber=" + this.f358572b + "}";
    }
}
