package androidx.media3.common.util;

import java.util.Arrays;

/* compiled from: LongArray.java */
@J
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public int f47946a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f47947b = new long[32];

    public final void a(long j12) {
        int i12 = this.f47946a;
        long[] jArr = this.f47947b;
        if (i12 == jArr.length) {
            this.f47947b = Arrays.copyOf(jArr, i12 * 2);
        }
        long[] jArr2 = this.f47947b;
        int i13 = this.f47946a;
        this.f47946a = i13 + 1;
        jArr2[i13] = j12;
    }

    public final long b(int i12) {
        if (i12 >= 0 && i12 < this.f47946a) {
            return this.f47947b[i12];
        }
        StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Invalid index ", ", size is ");
        sbJ.append(this.f47946a);
        throw new IndexOutOfBoundsException(sbJ.toString());
    }
}
