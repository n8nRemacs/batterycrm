package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.util.C36585a;
import java.util.Arrays;

/* compiled from: NalUnitTargetBuffer.java */
/* loaded from: classes6.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f345286a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f345287b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f345288c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f345289d;

    /* renamed from: e, reason: collision with root package name */
    public int f345290e;

    public r(int i12) {
        this.f345286a = i12;
        byte[] bArr = new byte[131];
        this.f345289d = bArr;
        bArr[2] = 1;
    }

    public final void a(int i12, int i13, byte[] bArr) {
        if (this.f345287b) {
            int i14 = i13 - i12;
            byte[] bArr2 = this.f345289d;
            int length = bArr2.length;
            int i15 = this.f345290e;
            if (length < i15 + i14) {
                this.f345289d = Arrays.copyOf(bArr2, (i15 + i14) * 2);
            }
            System.arraycopy(bArr, i12, this.f345289d, this.f345290e, i14);
            this.f345290e += i14;
        }
    }

    public final boolean b(int i12) {
        if (!this.f345287b) {
            return false;
        }
        this.f345290e -= i12;
        this.f345287b = false;
        this.f345288c = true;
        return true;
    }

    public final void c() {
        this.f345287b = false;
        this.f345288c = false;
    }

    public final void d(int i12) {
        C36585a.d(!this.f345287b);
        boolean z12 = i12 == this.f345286a;
        this.f345287b = z12;
        if (z12) {
            this.f345290e = 3;
            this.f345288c = false;
        }
    }
}
