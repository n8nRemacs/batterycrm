package org.threeten.bp;

import java.io.Serializable;
import java.util.regex.Pattern;
import org.threeten.bp.temporal.ChronoUnit;

/* compiled from: Period.java */
/* loaded from: classes8.dex */
public final class k extends org.threeten.bp.chrono.f implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final k f422090c = new k(0);
    private static final long serialVersionUID = -8290556941213247973L;

    /* renamed from: b, reason: collision with root package name */
    public final int f422091b;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    }

    public k(int i12) {
        this.f422091b = i12;
    }

    public static k b(int i12) {
        return i12 == 0 ? f422090c : new k(i12);
    }

    private Object readResolve() {
        return this.f422091b == 0 ? f422090c : this;
    }

    @Override // org.threeten.bp.temporal.g
    public final org.threeten.bp.temporal.c a(org.threeten.bp.chrono.c cVar) {
        int i12 = this.f422091b;
        return i12 != 0 ? cVar.r(i12, ChronoUnit.DAYS) : cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        kVar.getClass();
        return this.f422091b == kVar.f422091b;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f422091b, 16) + Integer.rotateLeft(0, 8);
    }

    public final String toString() {
        if (this == f422090c) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder("P");
        int i12 = this.f422091b;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }
}
