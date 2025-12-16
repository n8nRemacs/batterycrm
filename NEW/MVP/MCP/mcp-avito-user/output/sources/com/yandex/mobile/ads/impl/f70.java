package com.yandex.mobile.ads.impl;

import java.util.NoSuchElementException;

/* loaded from: classes8.dex */
final class f70 {

    /* renamed from: a, reason: collision with root package name */
    private int f385209a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f385210b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f385211c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int[] f385212d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    private int f385213e = 15;

    public final void a(int i12) {
        int i13 = this.f385211c;
        int[] iArr = this.f385212d;
        if (i13 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i14 = this.f385209a;
            int i15 = length2 - i14;
            System.arraycopy(iArr, i14, iArr2, 0, i15);
            System.arraycopy(this.f385212d, 0, iArr2, i15, i14);
            this.f385209a = 0;
            this.f385210b = this.f385211c - 1;
            this.f385212d = iArr2;
            this.f385213e = length - 1;
        }
        int i16 = (this.f385210b + 1) & this.f385213e;
        this.f385210b = i16;
        this.f385212d[i16] = i12;
        this.f385211c++;
    }

    public final boolean b() {
        return this.f385211c == 0;
    }

    public final int c() {
        int i12 = this.f385211c;
        if (i12 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f385212d;
        int i13 = this.f385209a;
        int i14 = iArr[i13];
        this.f385209a = (i13 + 1) & this.f385213e;
        this.f385211c = i12 - 1;
        return i14;
    }

    public final void a() {
        this.f385209a = 0;
        this.f385210b = -1;
        this.f385211c = 0;
    }
}
