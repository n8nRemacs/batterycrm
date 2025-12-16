package androidx.media3.extractor;

import j.P;

/* compiled from: SeekPoint.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class I {

    /* renamed from: c, reason: collision with root package name */
    public static final I f50377c = new I(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f50378a;

    /* renamed from: b, reason: collision with root package name */
    public final long f50379b;

    public I(long j12, long j13) {
        this.f50378a = j12;
        this.f50379b = j13;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I.class != obj.getClass()) {
            return false;
        }
        I i12 = (I) obj;
        return this.f50378a == i12.f50378a && this.f50379b == i12.f50379b;
    }

    public final int hashCode() {
        return (((int) this.f50378a) * 31) + ((int) this.f50379b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f50378a);
        sb2.append(", position=");
        return AK.c.j(this.f50379b, "]", sb2);
    }
}
