package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class n51 {

    /* renamed from: a, reason: collision with root package name */
    private final pr0 f388164a = new pr0(8);

    /* renamed from: b, reason: collision with root package name */
    private int f388165b;

    private long a(to toVar) {
        int i12 = 0;
        toVar.b(this.f388164a.c(), 0, 1, false);
        int i13 = this.f388164a.c()[0] & 255;
        if (i13 == 0) {
            return Long.MIN_VALUE;
        }
        int i14 = 128;
        int i15 = 0;
        while ((i13 & i14) == 0) {
            i14 >>= 1;
            i15++;
        }
        int i16 = i13 & (~i14);
        toVar.b(this.f388164a.c(), 1, i15, false);
        while (i12 < i15) {
            i12++;
            i16 = (this.f388164a.c()[i12] & 255) + (i16 << 8);
        }
        this.f388165b = i15 + 1 + this.f388165b;
        return i16;
    }

    public final boolean b(to toVar) {
        long jA2 = toVar.a();
        long j12 = 1024;
        if (jA2 != -1 && jA2 <= 1024) {
            j12 = jA2;
        }
        int i12 = (int) j12;
        toVar.b(this.f388164a.c(), 0, 4, false);
        long jV2 = this.f388164a.v();
        this.f388165b = 4;
        while (jV2 != 440786851) {
            int i13 = this.f388165b + 1;
            this.f388165b = i13;
            if (i13 == i12) {
                return false;
            }
            toVar.b(this.f388164a.c(), 0, 1, false);
            jV2 = ((jV2 << 8) & (-256)) | (this.f388164a.c()[0] & 255);
        }
        long jA3 = a(toVar);
        long j13 = this.f388165b;
        if (jA3 == Long.MIN_VALUE) {
            return false;
        }
        if (jA2 != -1 && j13 + jA3 >= jA2) {
            return false;
        }
        while (true) {
            long j14 = this.f388165b;
            long j15 = j13 + jA3;
            if (j14 >= j15) {
                return j14 == j15;
            }
            if (a(toVar) == Long.MIN_VALUE) {
                return false;
            }
            long jA4 = a(toVar);
            if (jA4 < 0 || jA4 > 2147483647L) {
                break;
            }
            if (jA4 != 0) {
                int i14 = (int) jA4;
                toVar.a(false, i14);
                this.f388165b += i14;
            }
        }
        return false;
    }
}
