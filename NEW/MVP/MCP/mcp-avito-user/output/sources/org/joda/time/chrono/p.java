package org.joda.time.chrono;

import org.joda.time.AbstractC44868j;
import org.joda.time.C44874p;

/* compiled from: GJCacheKey.java */
/* loaded from: classes7.dex */
class p {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC44868j f420612a;

    /* renamed from: b, reason: collision with root package name */
    public final C44874p f420613b;

    /* renamed from: c, reason: collision with root package name */
    public final int f420614c;

    public p(AbstractC44868j abstractC44868j, C44874p c44874p, int i12) {
        this.f420612a = abstractC44868j;
        this.f420613b = c44874p;
        this.f420614c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        C44874p c44874p = pVar.f420613b;
        C44874p c44874p2 = this.f420613b;
        if (c44874p2 == null) {
            if (c44874p != null) {
                return false;
            }
        } else if (!c44874p2.equals(c44874p)) {
            return false;
        }
        if (this.f420614c != pVar.f420614c) {
            return false;
        }
        AbstractC44868j abstractC44868j = pVar.f420612a;
        AbstractC44868j abstractC44868j2 = this.f420612a;
        if (abstractC44868j2 == null) {
            if (abstractC44868j != null) {
                return false;
            }
        } else if (!abstractC44868j2.equals(abstractC44868j)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C44874p c44874p = this.f420613b;
        int iHashCode = ((((c44874p == null ? 0 : c44874p.hashCode()) + 31) * 31) + this.f420614c) * 31;
        AbstractC44868j abstractC44868j = this.f420612a;
        return iHashCode + (abstractC44868j != null ? abstractC44868j.hashCode() : 0);
    }
}
