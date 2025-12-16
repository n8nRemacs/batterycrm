package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.oc;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
final class ow extends ve {

    /* renamed from: i, reason: collision with root package name */
    private static final int f388652i = Float.floatToIntBits(Float.NaN);

    @Override // com.yandex.mobile.ads.impl.oc
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferA;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i12 = iLimit - iPosition;
        int i13 = this.f390850b.f388488c;
        if (i13 == 536870912) {
            byteBufferA = a((i12 / 3) * 4);
            while (iPosition < iLimit) {
                int iFloatToIntBits = Float.floatToIntBits((float) ((((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (iFloatToIntBits == f388652i) {
                    iFloatToIntBits = Float.floatToIntBits(0.0f);
                }
                byteBufferA.putInt(iFloatToIntBits);
                iPosition += 3;
            }
        } else {
            if (i13 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferA = a(i12);
            while (iPosition < iLimit) {
                int iFloatToIntBits2 = Float.floatToIntBits((float) (((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24)) * 4.656612875245797E-10d));
                if (iFloatToIntBits2 == f388652i) {
                    iFloatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                byteBufferA.putInt(iFloatToIntBits2);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA.flip();
    }

    @Override // com.yandex.mobile.ads.impl.ve
    public final oc.a b(oc.a aVar) throws oc.b {
        int i12 = aVar.f388488c;
        if (i12 == 536870912 || i12 == 805306368 || i12 == 4) {
            return i12 != 4 ? new oc.a(aVar.f388486a, aVar.f388487b, 4) : oc.a.f388485e;
        }
        throw new oc.b(aVar);
    }
}
