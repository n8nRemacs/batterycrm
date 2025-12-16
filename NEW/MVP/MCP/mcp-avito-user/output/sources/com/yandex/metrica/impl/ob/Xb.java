package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Xb {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final Qc f379901a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final Wb f379902b;

    public Xb(@j.N Qc qc2, @j.P Wb wb2) {
        this.f379901a = qc2;
        this.f379902b = wb2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Xb.class != obj.getClass()) {
            return false;
        }
        Xb xb2 = (Xb) obj;
        if (!this.f379901a.equals(xb2.f379901a)) {
            return false;
        }
        Wb wb2 = this.f379902b;
        Wb wb3 = xb2.f379902b;
        return wb2 != null ? wb2.equals(wb3) : wb3 == null;
    }

    public int hashCode() {
        int iHashCode = this.f379901a.hashCode() * 31;
        Wb wb2 = this.f379902b;
        return iHashCode + (wb2 != null ? wb2.hashCode() : 0);
    }

    public String toString() {
        return "ForcedCollectingConfig{providerAccessFlags=" + this.f379901a + ", arguments=" + this.f379902b + '}';
    }
}
