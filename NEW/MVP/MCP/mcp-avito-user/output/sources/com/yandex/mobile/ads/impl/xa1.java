package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.oc;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
final class xa1 extends ve {

    /* renamed from: i, reason: collision with root package name */
    private int f391592i;

    /* renamed from: j, reason: collision with root package name */
    private int f391593j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f391594k;

    /* renamed from: l, reason: collision with root package name */
    private int f391595l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f391596m = pc1.f388773f;

    /* renamed from: n, reason: collision with root package name */
    private int f391597n;

    /* renamed from: o, reason: collision with root package name */
    private long f391598o;

    public final void a(int i12, int i13) {
        this.f391592i = i12;
        this.f391593j = i13;
    }

    @Override // com.yandex.mobile.ads.impl.ve
    public final oc.a b(oc.a aVar) throws oc.b {
        if (aVar.f388488c != 2) {
            throw new oc.b(aVar);
        }
        this.f391594k = true;
        return (this.f391592i == 0 && this.f391593j == 0) ? oc.a.f388485e : aVar;
    }

    @Override // com.yandex.mobile.ads.impl.ve
    public final void f() {
        if (this.f391594k) {
            this.f391594k = false;
            int i12 = this.f391593j;
            int i13 = this.f390850b.f388489d;
            this.f391596m = new byte[i12 * i13];
            this.f391595l = this.f391592i * i13;
        }
        this.f391597n = 0;
    }

    @Override // com.yandex.mobile.ads.impl.ve
    public final void g() {
        if (this.f391594k) {
            if (this.f391597n > 0) {
                this.f391598o += r0 / this.f390850b.f388489d;
            }
            this.f391597n = 0;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ve
    public final void h() {
        this.f391596m = pc1.f388773f;
    }

    public final long i() {
        return this.f391598o;
    }

    public final void j() {
        this.f391598o = 0L;
    }

    @Override // com.yandex.mobile.ads.impl.oc
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i12 = iLimit - iPosition;
        if (i12 == 0) {
            return;
        }
        int iMin = Math.min(i12, this.f391595l);
        this.f391598o += iMin / this.f390850b.f388489d;
        this.f391595l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f391595l > 0) {
            return;
        }
        int i13 = i12 - iMin;
        int length = (this.f391597n + i13) - this.f391596m.length;
        ByteBuffer byteBufferA = a(length);
        int i14 = this.f391597n;
        int i15 = pc1.f388768a;
        int iMax = Math.max(0, Math.min(length, i14));
        byteBufferA.put(this.f391596m, 0, iMax);
        int iMax2 = Math.max(0, Math.min(length - iMax, i13));
        byteBuffer.limit(byteBuffer.position() + iMax2);
        byteBufferA.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i16 = i13 - iMax2;
        int i17 = this.f391597n - iMax;
        this.f391597n = i17;
        byte[] bArr = this.f391596m;
        System.arraycopy(bArr, iMax, bArr, 0, i17);
        byteBuffer.get(this.f391596m, this.f391597n, i16);
        this.f391597n += i16;
        byteBufferA.flip();
    }

    @Override // com.yandex.mobile.ads.impl.ve, com.yandex.mobile.ads.impl.oc
    public final ByteBuffer b() {
        int i12;
        if (super.a() && (i12 = this.f391597n) > 0) {
            a(i12).put(this.f391596m, 0, this.f391597n).flip();
            this.f391597n = 0;
        }
        return super.b();
    }

    @Override // com.yandex.mobile.ads.impl.ve, com.yandex.mobile.ads.impl.oc
    public final boolean a() {
        return super.a() && this.f391597n == 0;
    }
}
