package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.A;
import j.P;

/* compiled from: TrueHdSampleRechunker.java */
/* loaded from: classes6.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f344376a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f344377b;

    /* renamed from: c, reason: collision with root package name */
    public int f344378c;

    /* renamed from: d, reason: collision with root package name */
    public long f344379d;

    /* renamed from: e, reason: collision with root package name */
    public int f344380e;

    /* renamed from: f, reason: collision with root package name */
    public int f344381f;

    /* renamed from: g, reason: collision with root package name */
    public int f344382g;

    public final void a(A a12, @P A.a aVar) {
        if (this.f344378c > 0) {
            a12.f(this.f344379d, this.f344380e, this.f344381f, this.f344382g, aVar);
            this.f344378c = 0;
        }
    }

    public final void b(A a12, long j12, int i12, int i13, int i14, @P A.a aVar) {
        if (!(this.f344382g <= i13 + i14)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f344377b) {
            int i15 = this.f344378c;
            int i16 = i15 + 1;
            this.f344378c = i16;
            if (i15 == 0) {
                this.f344379d = j12;
                this.f344380e = i12;
                this.f344381f = 0;
            }
            this.f344381f += i13;
            this.f344382g = i14;
            if (i16 >= 16) {
                a(a12, aVar);
            }
        }
    }

    public final void c(k kVar) {
        if (this.f344377b) {
            return;
        }
        byte[] bArr = this.f344376a;
        int i12 = 0;
        kVar.b(0, 10, bArr);
        kVar.f();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b12 = bArr[7];
            if ((b12 & 254) == 186) {
                i12 = 40 << ((bArr[(b12 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i12 == 0) {
            return;
        }
        this.f344377b = true;
    }
}
