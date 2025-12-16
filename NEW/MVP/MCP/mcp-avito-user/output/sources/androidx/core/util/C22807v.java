package androidx.core.util;

import java.util.Objects;

/* compiled from: Pair.java */
/* renamed from: androidx.core.util.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22807v<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public final F f44895a;

    /* renamed from: b, reason: collision with root package name */
    public final S f44896b;

    public C22807v(F f12, S s5) {
        this.f44895a = f12;
        this.f44896b = s5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22807v)) {
            return false;
        }
        C22807v c22807v = (C22807v) obj;
        return Objects.equals(c22807v.f44895a, this.f44895a) && Objects.equals(c22807v.f44896b, this.f44896b);
    }

    public final int hashCode() {
        F f12 = this.f44895a;
        int iHashCode = f12 == null ? 0 : f12.hashCode();
        S s5 = this.f44896b;
        return (s5 != null ? s5.hashCode() : 0) ^ iHashCode;
    }

    @j.N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Pair{");
        sb2.append(this.f44895a);
        sb2.append(" ");
        return androidx.appcompat.app.r.o(this.f44896b, "}", sb2);
    }
}
