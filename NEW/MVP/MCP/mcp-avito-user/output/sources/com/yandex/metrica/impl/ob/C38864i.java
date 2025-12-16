package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38864i {

    /* renamed from: a, reason: collision with root package name */
    public final int f380750a;

    /* renamed from: b, reason: collision with root package name */
    public final int f380751b;

    public C38864i(int i12, int i13) {
        this.f380750a = i12;
        this.f380751b = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C38864i.class != obj.getClass()) {
            return false;
        }
        C38864i c38864i = (C38864i) obj;
        return this.f380750a == c38864i.f380750a && this.f380751b == c38864i.f380751b;
    }

    public int hashCode() {
        return (this.f380750a * 31) + this.f380751b;
    }

    @j.N
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BillingConfig{sendFrequencySeconds=");
        sb2.append(this.f380750a);
        sb2.append(", firstCollectingInappMaxAgeSeconds=");
        return AK.c.i(this.f380751b, "}", sb2);
    }
}
