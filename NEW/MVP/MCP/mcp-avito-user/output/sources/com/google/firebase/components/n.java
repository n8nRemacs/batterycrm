package com.google.firebase.components;

/* compiled from: Dependency.java */
/* loaded from: classes13.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final u<?> f360769a;

    /* renamed from: b, reason: collision with root package name */
    public final int f360770b;

    /* renamed from: c, reason: collision with root package name */
    public final int f360771c;

    public n(int i12, int i13, Class cls) {
        this((u<?>) u.a(cls), i12, i13);
    }

    public static n a(Class<?> cls) {
        return new n(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f360769a.equals(nVar.f360769a) && this.f360770b == nVar.f360770b && this.f360771c == nVar.f360771c;
    }

    public final int hashCode() {
        return ((((this.f360769a.hashCode() ^ 1000003) * 1000003) ^ this.f360770b) * 1000003) ^ this.f360771c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f360769a);
        sb2.append(", type=");
        int i12 = this.f360770b;
        sb2.append(i12 == 1 ? "required" : i12 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i13 = this.f360771c;
        if (i13 == 0) {
            str = "direct";
        } else if (i13 == 1) {
            str = "provider";
        } else {
            if (i13 != 2) {
                throw new AssertionError(AK.c.g(i13, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return AK.c.s(sb2, str, "}");
    }

    public n(u<?> uVar, int i12, int i13) {
        this.f360769a = uVar;
        this.f360770b = i12;
        this.f360771c = i13;
    }
}
