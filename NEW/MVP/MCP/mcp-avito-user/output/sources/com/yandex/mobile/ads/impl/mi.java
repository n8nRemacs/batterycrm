package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.oc;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
final class mi extends ve {

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private int[] f388009i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private int[] f388010j;

    public final void a(@j.P int[] iArr) {
        this.f388009i = iArr;
    }

    @Override // com.yandex.mobile.ads.impl.ve
    public final oc.a b(oc.a aVar) throws oc.b {
        int[] iArr = this.f388009i;
        if (iArr == null) {
            return oc.a.f388485e;
        }
        if (aVar.f388488c != 2) {
            throw new oc.b(aVar);
        }
        boolean z12 = aVar.f388487b != iArr.length;
        int i12 = 0;
        while (i12 < iArr.length) {
            int i13 = iArr[i12];
            if (i13 >= aVar.f388487b) {
                throw new oc.b(aVar);
            }
            z12 |= i13 != i12;
            i12++;
        }
        return z12 ? new oc.a(aVar.f388486a, iArr.length, 2) : oc.a.f388485e;
    }

    @Override // com.yandex.mobile.ads.impl.ve
    public final void f() {
        this.f388010j = this.f388009i;
    }

    @Override // com.yandex.mobile.ads.impl.ve
    public final void h() {
        this.f388010j = null;
        this.f388009i = null;
    }

    @Override // com.yandex.mobile.ads.impl.oc
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.f388010j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferA = a(((iLimit - iPosition) / this.f390850b.f388489d) * this.f390851c.f388489d);
        while (iPosition < iLimit) {
            for (int i12 : iArr) {
                byteBufferA.putShort(byteBuffer.getShort((i12 * 2) + iPosition));
            }
            iPosition += this.f390850b.f388489d;
        }
        byteBuffer.position(iLimit);
        byteBufferA.flip();
    }
}
