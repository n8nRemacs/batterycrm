package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Qc {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f379255a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f379256b;

    public Qc(boolean z12, boolean z13) {
        this.f379255a = z12;
        this.f379256b = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Qc.class != obj.getClass()) {
            return false;
        }
        Qc qc2 = (Qc) obj;
        return this.f379255a == qc2.f379255a && this.f379256b == qc2.f379256b;
    }

    public int hashCode() {
        return ((this.f379255a ? 1 : 0) * 31) + (this.f379256b ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProviderAccessFlags{lastKnownEnabled=");
        sb2.append(this.f379255a);
        sb2.append(", scanningEnabled=");
        return androidx.appcompat.app.r.x(sb2, this.f379256b, '}');
    }
}
