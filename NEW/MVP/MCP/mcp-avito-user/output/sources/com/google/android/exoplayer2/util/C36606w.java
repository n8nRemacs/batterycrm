package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* compiled from: LongArray.java */
/* renamed from: com.google.android.exoplayer2.util.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36606w {

    /* renamed from: a, reason: collision with root package name */
    public int f348164a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f348165b = new long[32];

    public final void a(long j12) {
        int i12 = this.f348164a;
        long[] jArr = this.f348165b;
        if (i12 == jArr.length) {
            this.f348165b = Arrays.copyOf(jArr, i12 * 2);
        }
        long[] jArr2 = this.f348165b;
        int i13 = this.f348164a;
        this.f348164a = i13 + 1;
        jArr2[i13] = j12;
    }

    public final long b(int i12) {
        if (i12 >= 0 && i12 < this.f348164a) {
            return this.f348165b[i12];
        }
        StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Invalid index ", ", size is ");
        sbJ.append(this.f348164a);
        throw new IndexOutOfBoundsException(sbJ.toString());
    }
}
