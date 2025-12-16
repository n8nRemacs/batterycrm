package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.g0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37123g0 extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public final C37118e1 f358322b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f358323c;

    /* renamed from: d, reason: collision with root package name */
    public long f358324d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f358325e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f358326f;

    public C37123g0(InputStream inputStream) {
        super(inputStream);
        this.f358322b = new C37118e1();
        this.f358323c = new byte[4096];
        this.f358325e = false;
        this.f358326f = false;
    }

    public final C37105a0 a() {
        byte[] bArr;
        if (this.f358324d > 0) {
            do {
                bArr = this.f358323c;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f358325e || this.f358326f) {
            return new C37105a0(null, -1L, -1, false, false, null);
        }
        boolean zB2 = b(30);
        C37118e1 c37118e1 = this.f358322b;
        if (!zB2) {
            this.f358325e = true;
            return c37118e1.b();
        }
        C37105a0 c37105a0B = c37118e1.b();
        if (c37105a0B.f358287e) {
            this.f358326f = true;
            return c37105a0B;
        }
        if (c37105a0B.f358284b == 4294967295L) {
            throw new C37184v0("Files bigger than 4GiB are not supported.");
        }
        int i12 = c37118e1.f358314f - 30;
        int length = this.f358323c.length;
        long j12 = i12;
        if (j12 > length) {
            do {
                length += length;
            } while (length < j12);
            this.f358323c = Arrays.copyOf(this.f358323c, length);
        }
        if (!b(i12)) {
            this.f358325e = true;
            return c37118e1.b();
        }
        C37105a0 c37105a0B2 = c37118e1.b();
        this.f358324d = c37105a0B2.f358284b;
        return c37105a0B2;
    }

    public final boolean b(int i12) {
        int iMax = Math.max(0, super.read(this.f358323c, 0, i12));
        C37118e1 c37118e1 = this.f358322b;
        if (iMax != i12) {
            int i13 = i12 - iMax;
            if (Math.max(0, super.read(this.f358323c, iMax, i13)) != i13) {
                c37118e1.a(this.f358323c, 0, iMax);
                return false;
            }
        }
        c37118e1.a(this.f358323c, 0, i12);
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i12, int i13) {
        long j12 = this.f358324d;
        if (j12 <= 0 || this.f358325e) {
            return -1;
        }
        int iMax = Math.max(0, super.read(bArr, i12, (int) Math.min(j12, i13)));
        this.f358324d -= iMax;
        if (iMax != 0) {
            return iMax;
        }
        this.f358325e = true;
        return 0;
    }
}
