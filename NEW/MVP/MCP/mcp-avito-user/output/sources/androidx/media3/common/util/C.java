package androidx.media3.common.util;

import j.P;

/* compiled from: Size.java */
@J
/* loaded from: classes.dex */
public final class C {

    /* renamed from: c, reason: collision with root package name */
    public static final C f47872c = new C(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f47873a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47874b;

    static {
        new C(0, 0);
    }

    public C(int i12, int i13) {
        C23110a.b((i12 == -1 || i12 >= 0) && (i13 == -1 || i13 >= 0));
        this.f47873a = i12;
        this.f47874b = i13;
    }

    public final boolean equals(@P Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c12 = (C) obj;
        return this.f47873a == c12.f47873a && this.f47874b == c12.f47874b;
    }

    public final int hashCode() {
        int i12 = this.f47873a;
        return ((i12 >>> 16) | (i12 << 16)) ^ this.f47874b;
    }

    public final String toString() {
        return this.f47873a + "x" + this.f47874b;
    }
}
