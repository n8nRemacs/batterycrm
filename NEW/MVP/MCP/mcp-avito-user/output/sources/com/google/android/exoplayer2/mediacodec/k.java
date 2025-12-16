package com.google.android.exoplayer2.mediacodec;

import java.util.NoSuchElementException;

/* compiled from: IntArrayQueue.java */
/* loaded from: classes6.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f345598a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f345599b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f345600c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int[] f345601d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public int f345602e;

    public k() {
        this.f345602e = r0.length - 1;
    }

    public final void a(int i12) {
        int i13 = this.f345600c;
        int[] iArr = this.f345601d;
        if (i13 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i14 = this.f345598a;
            int i15 = length2 - i14;
            System.arraycopy(iArr, i14, iArr2, 0, i15);
            System.arraycopy(this.f345601d, 0, iArr2, i15, i14);
            this.f345598a = 0;
            this.f345599b = this.f345600c - 1;
            this.f345601d = iArr2;
            this.f345602e = length - 1;
        }
        int i16 = (this.f345599b + 1) & this.f345602e;
        this.f345599b = i16;
        this.f345601d[i16] = i12;
        this.f345600c++;
    }

    public final int b() {
        int i12 = this.f345600c;
        if (i12 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f345601d;
        int i13 = this.f345598a;
        int i14 = iArr[i13];
        this.f345598a = (i13 + 1) & this.f345602e;
        this.f345600c = i12 - 1;
        return i14;
    }
}
