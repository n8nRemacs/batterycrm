package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;
import j.N;
import j.X;

/* compiled from: Insets.java */
/* renamed from: androidx.core.graphics.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22771k {

    /* renamed from: e, reason: collision with root package name */
    @N
    public static final C22771k f44774e = new C22771k(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f44775a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44776b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44777c;

    /* renamed from: d, reason: collision with root package name */
    public final int f44778d;

    /* compiled from: Insets.java */
    @X
    /* renamed from: androidx.core.graphics.k$a */
    public static class a {
        public static Insets a(int i12, int i13, int i14, int i15) {
            return Insets.of(i12, i13, i14, i15);
        }
    }

    public C22771k(int i12, int i13, int i14, int i15) {
        this.f44775a = i12;
        this.f44776b = i13;
        this.f44777c = i14;
        this.f44778d = i15;
    }

    @N
    public static C22771k a(@N C22771k c22771k, @N C22771k c22771k2) {
        return b(Math.max(c22771k.f44775a, c22771k2.f44775a), Math.max(c22771k.f44776b, c22771k2.f44776b), Math.max(c22771k.f44777c, c22771k2.f44777c), Math.max(c22771k.f44778d, c22771k2.f44778d));
    }

    @N
    public static C22771k b(int i12, int i13, int i14, int i15) {
        return (i12 == 0 && i13 == 0 && i14 == 0 && i15 == 0) ? f44774e : new C22771k(i12, i13, i14, i15);
    }

    @N
    public static C22771k c(@N Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    @N
    @X
    public static C22771k d(@N Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    @N
    @X
    public final Insets e() {
        return a.a(this.f44775a, this.f44776b, this.f44777c, this.f44778d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C22771k.class != obj.getClass()) {
            return false;
        }
        C22771k c22771k = (C22771k) obj;
        return this.f44778d == c22771k.f44778d && this.f44775a == c22771k.f44775a && this.f44777c == c22771k.f44777c && this.f44776b == c22771k.f44776b;
    }

    public final int hashCode() {
        return (((((this.f44775a * 31) + this.f44776b) * 31) + this.f44777c) * 31) + this.f44778d;
    }

    @N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f44775a);
        sb2.append(", top=");
        sb2.append(this.f44776b);
        sb2.append(", right=");
        sb2.append(this.f44777c);
        sb2.append(", bottom=");
        return androidx.appcompat.app.r.t(sb2, this.f44778d, '}');
    }
}
