package com.google.android.exoplayer2.extractor;

import j.P;

/* compiled from: SeekPoint.java */
/* loaded from: classes6.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final z f345393c = new z(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f345394a;

    /* renamed from: b, reason: collision with root package name */
    public final long f345395b;

    public z(long j12, long j13) {
        this.f345394a = j12;
        this.f345395b = j13;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return this.f345394a == zVar.f345394a && this.f345395b == zVar.f345395b;
    }

    public final int hashCode() {
        return (((int) this.f345394a) * 31) + ((int) this.f345395b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f345394a);
        sb2.append(", position=");
        return AK.c.j(this.f345395b, "]", sb2);
    }
}
