package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes8.dex */
final class kj0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f387171a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f387172b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f387173c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f387174d;

    /* renamed from: e, reason: collision with root package name */
    public int f387175e;

    public kj0(int i12) {
        this.f387171a = i12;
        byte[] bArr = new byte[131];
        this.f387174d = bArr;
        bArr[2] = 1;
    }

    public final boolean a() {
        return this.f387173c;
    }

    public final void b() {
        this.f387172b = false;
        this.f387173c = false;
    }

    public final void a(byte[] bArr, int i12, int i13) {
        if (this.f387172b) {
            int i14 = i13 - i12;
            byte[] bArr2 = this.f387174d;
            int length = bArr2.length;
            int i15 = this.f387175e + i14;
            if (length < i15) {
                this.f387174d = Arrays.copyOf(bArr2, i15 * 2);
            }
            System.arraycopy(bArr, i12, this.f387174d, this.f387175e, i14);
            this.f387175e += i14;
        }
    }

    public final void b(int i12) {
        db.b(!this.f387172b);
        boolean z12 = i12 == this.f387171a;
        this.f387172b = z12;
        if (z12) {
            this.f387175e = 3;
            this.f387173c = false;
        }
    }

    public final boolean a(int i12) {
        if (!this.f387172b) {
            return false;
        }
        this.f387175e -= i12;
        this.f387172b = false;
        this.f387173c = true;
        return true;
    }
}
