package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes8.dex */
final class yc1 {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f391995d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f391996a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private int f391997b;

    /* renamed from: c, reason: collision with root package name */
    private int f391998c;

    public final long a(to toVar, boolean z12, boolean z13, int i12) throws EOFException, InterruptedIOException {
        if (this.f391997b == 0) {
            if (!toVar.a(this.f391996a, 0, 1, z12)) {
                return -1L;
            }
            int iA2 = a(this.f391996a[0] & 255);
            this.f391998c = iA2;
            if (iA2 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f391997b = 1;
        }
        int i13 = this.f391998c;
        if (i13 > i12) {
            this.f391997b = 0;
            return -2L;
        }
        if (i13 != 1) {
            toVar.a(this.f391996a, 1, i13 - 1, false);
        }
        this.f391997b = 0;
        return a(this.f391996a, this.f391998c, z13);
    }

    public final void b() {
        this.f391997b = 0;
        this.f391998c = 0;
    }

    public final int a() {
        return this.f391998c;
    }

    public static int a(int i12) {
        long j12;
        int i13 = 0;
        do {
            long[] jArr = f391995d;
            if (i13 >= 8) {
                return -1;
            }
            j12 = jArr[i13] & i12;
            i13++;
        } while (j12 == 0);
        return i13;
    }

    public static long a(byte[] bArr, int i12, boolean z12) {
        long j12 = bArr[0] & 255;
        if (z12) {
            j12 &= ~f391995d[i12 - 1];
        }
        for (int i13 = 1; i13 < i12; i13++) {
            j12 = (j12 << 8) | (bArr[i13] & 255);
        }
        return j12;
    }
}
