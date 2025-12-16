package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.util.F;

/* compiled from: Sniffer.java */
/* loaded from: classes6.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    public final F f344697a = new F(8);

    /* renamed from: b, reason: collision with root package name */
    public int f344698b;

    public final long a(com.google.android.exoplayer2.extractor.f fVar) {
        F f12 = this.f344697a;
        int i12 = 0;
        fVar.a(f12.f348070a, 0, 1, false);
        int i13 = f12.f348070a[0] & 255;
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
        fVar.a(f12.f348070a, 1, i15, false);
        while (i12 < i15) {
            i12++;
            i16 = (f12.f348070a[i12] & 255) + (i16 << 8);
        }
        this.f344698b = i15 + 1 + this.f344698b;
        return i16;
    }
}
