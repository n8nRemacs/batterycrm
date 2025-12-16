package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.F;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: OggPacket.java */
/* loaded from: classes6.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f344932a = new e();

    /* renamed from: b, reason: collision with root package name */
    public final F f344933b = new F(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f344934c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f344935d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f344936e;

    public final int a(int i12) {
        int i13;
        int i14 = 0;
        this.f344935d = 0;
        do {
            int i15 = this.f344935d;
            int i16 = i12 + i15;
            e eVar = this.f344932a;
            if (i16 >= eVar.f344939c) {
                break;
            }
            int[] iArr = eVar.f344942f;
            this.f344935d = i15 + 1;
            i13 = iArr[i15 + i12];
            i14 += i13;
        } while (i13 == 255);
        return i14;
    }

    public final boolean b(com.google.android.exoplayer2.extractor.f fVar) throws InterruptedIOException {
        int i12;
        C36585a.d(fVar != null);
        boolean z12 = this.f344936e;
        F f12 = this.f344933b;
        if (z12) {
            this.f344936e = false;
            f12.y(0);
        }
        while (!this.f344936e) {
            int i13 = this.f344934c;
            e eVar = this.f344932a;
            if (i13 < 0) {
                if (eVar.b(fVar, -1L) && eVar.a(fVar, true)) {
                    int iA2 = eVar.f344940d;
                    if ((eVar.f344937a & 1) == 1 && f12.f348072c == 0) {
                        iA2 += a(0);
                        i12 = this.f344935d;
                    } else {
                        i12 = 0;
                    }
                    try {
                        fVar.i(iA2);
                        this.f344934c = i12;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA3 = a(this.f344934c);
            int i14 = this.f344934c + this.f344935d;
            if (iA3 > 0) {
                f12.b(f12.f348072c + iA3);
                try {
                    fVar.d(f12.f348070a, f12.f348072c, iA3, false);
                    f12.A(f12.f348072c + iA3);
                    this.f344936e = eVar.f344942f[i14 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i14 == eVar.f344939c) {
                i14 = -1;
            }
            this.f344934c = i14;
        }
        return true;
    }
}
