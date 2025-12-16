package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.oc;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class t31 extends ve {

    /* renamed from: i, reason: collision with root package name */
    private final long f390065i = 150000;

    /* renamed from: j, reason: collision with root package name */
    private final long f390066j = 20000;

    /* renamed from: k, reason: collision with root package name */
    private final short f390067k = 1024;

    /* renamed from: l, reason: collision with root package name */
    private int f390068l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f390069m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f390070n;

    /* renamed from: o, reason: collision with root package name */
    private byte[] f390071o;

    /* renamed from: p, reason: collision with root package name */
    private int f390072p;

    /* renamed from: q, reason: collision with root package name */
    private int f390073q;

    /* renamed from: r, reason: collision with root package name */
    private int f390074r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f390075s;

    /* renamed from: t, reason: collision with root package name */
    private long f390076t;

    public t31(int i12) {
        byte[] bArr = pc1.f388773f;
        this.f390070n = bArr;
        this.f390071o = bArr;
    }

    public final void a(boolean z12) {
        this.f390069m = z12;
    }

    @Override // com.yandex.mobile.ads.impl.ve
    public final oc.a b(oc.a aVar) throws oc.b {
        if (aVar.f388488c == 2) {
            return this.f390069m ? aVar : oc.a.f388485e;
        }
        throw new oc.b(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.ve, com.yandex.mobile.ads.impl.oc
    public final boolean d() {
        return this.f390069m;
    }

    @Override // com.yandex.mobile.ads.impl.ve
    public final void f() {
        if (this.f390069m) {
            oc.a aVar = this.f390850b;
            int i12 = aVar.f388489d;
            this.f390068l = i12;
            long j12 = this.f390065i;
            long j13 = aVar.f388486a;
            int i13 = ((int) ((j12 * j13) / 1000000)) * i12;
            if (this.f390070n.length != i13) {
                this.f390070n = new byte[i13];
            }
            int i14 = ((int) ((this.f390066j * j13) / 1000000)) * i12;
            this.f390074r = i14;
            if (this.f390071o.length != i14) {
                this.f390071o = new byte[i14];
            }
        }
        this.f390072p = 0;
        this.f390076t = 0L;
        this.f390073q = 0;
        this.f390075s = false;
    }

    @Override // com.yandex.mobile.ads.impl.ve
    public final void g() {
        int i12 = this.f390073q;
        if (i12 > 0) {
            a(i12).put(this.f390070n, 0, i12).flip();
            if (i12 > 0) {
                this.f390075s = true;
            }
        }
        if (this.f390075s) {
            return;
        }
        this.f390076t += this.f390074r / this.f390068l;
    }

    @Override // com.yandex.mobile.ads.impl.ve
    public final void h() {
        this.f390069m = false;
        this.f390074r = 0;
        byte[] bArr = pc1.f388773f;
        this.f390070n = bArr;
        this.f390071o = bArr;
    }

    public final long i() {
        return this.f390076t;
    }

    @Override // com.yandex.mobile.ads.impl.oc
    public final void a(ByteBuffer byteBuffer) {
        int iLimit;
        int iLimit2;
        int iPosition;
        while (byteBuffer.hasRemaining() && !e()) {
            int i12 = this.f390072p;
            if (i12 == 0) {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.f390070n.length));
                int iLimit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit4)) > this.f390067k) {
                            int i13 = this.f390068l;
                            iPosition = androidx.compose.ui.graphics.colorspace.e.x(iLimit4, i13, i13, i13);
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f390072p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    a(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f390075s = true;
                    }
                }
                byteBuffer.limit(iLimit3);
            } else if (i12 == 1) {
                int iLimit5 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position();
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit2 = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iPosition2)) > this.f390067k) {
                            int i14 = this.f390068l;
                            iLimit2 = (iPosition2 / i14) * i14;
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit2 - byteBuffer.position();
                byte[] bArr = this.f390070n;
                int length = bArr.length;
                int i15 = this.f390073q;
                int i16 = length - i15;
                if (iLimit2 >= iLimit5 || iPosition3 >= i16) {
                    int iMin = Math.min(iPosition3, i16);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f390070n, this.f390073q, iMin);
                    int i17 = this.f390073q + iMin;
                    this.f390073q = i17;
                    byte[] bArr2 = this.f390070n;
                    if (i17 == bArr2.length) {
                        if (this.f390075s) {
                            int i18 = this.f390074r;
                            a(i18).put(bArr2, 0, i18).flip();
                            if (i18 > 0) {
                                this.f390075s = true;
                            }
                            this.f390076t += (this.f390073q - (this.f390074r * 2)) / this.f390068l;
                        } else {
                            this.f390076t += (i17 - this.f390074r) / this.f390068l;
                        }
                        byte[] bArr3 = this.f390070n;
                        int i19 = this.f390073q;
                        int iMin2 = Math.min(byteBuffer.remaining(), this.f390074r);
                        int i22 = this.f390074r - iMin2;
                        System.arraycopy(bArr3, i19 - i22, this.f390071o, 0, i22);
                        byteBuffer.position(byteBuffer.limit() - iMin2);
                        byteBuffer.get(this.f390071o, i22, iMin2);
                        this.f390073q = 0;
                        this.f390072p = 2;
                    }
                    byteBuffer.limit(iLimit5);
                } else {
                    a(i15).put(bArr, 0, i15).flip();
                    if (i15 > 0) {
                        this.f390075s = true;
                    }
                    this.f390073q = 0;
                    this.f390072p = 0;
                }
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException();
                }
                int iLimit6 = byteBuffer.limit();
                int iPosition4 = byteBuffer.position();
                while (true) {
                    if (iPosition4 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iPosition4)) > this.f390067k) {
                            int i23 = this.f390068l;
                            iLimit = (iPosition4 / i23) * i23;
                            break;
                        }
                        iPosition4 += 2;
                    }
                }
                byteBuffer.limit(iLimit);
                this.f390076t += byteBuffer.remaining() / this.f390068l;
                byte[] bArr4 = this.f390071o;
                int i24 = this.f390074r;
                int iMin3 = Math.min(byteBuffer.remaining(), this.f390074r);
                int i25 = this.f390074r - iMin3;
                System.arraycopy(bArr4, i24 - i25, this.f390071o, 0, i25);
                byteBuffer.position(byteBuffer.limit() - iMin3);
                byteBuffer.get(this.f390071o, i25, iMin3);
                if (iLimit < iLimit6) {
                    byte[] bArr5 = this.f390071o;
                    int i26 = this.f390074r;
                    a(i26).put(bArr5, 0, i26).flip();
                    if (i26 > 0) {
                        this.f390075s = true;
                    }
                    this.f390072p = 0;
                    byteBuffer.limit(iLimit6);
                }
            }
        }
    }
}
