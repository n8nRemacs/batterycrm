package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.oc;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
final class gz0 extends ve {
    @Override // com.yandex.mobile.ads.impl.oc
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i12 = iLimit - iPosition;
        int i13 = this.f390850b.f388488c;
        if (i13 == 3) {
            i12 *= 2;
        } else if (i13 == 4) {
            i12 /= 2;
        } else if (i13 != 268435456) {
            if (i13 != 536870912) {
                if (i13 != 805306368) {
                    throw new IllegalStateException();
                }
                i12 /= 2;
            } else {
                i12 /= 3;
                i12 *= 2;
            }
        }
        ByteBuffer byteBufferA = a(i12);
        int i14 = this.f390850b.f388488c;
        if (i14 == 3) {
            while (iPosition < iLimit) {
                byteBufferA.put((byte) 0);
                byteBufferA.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i14 == 4) {
            while (iPosition < iLimit) {
                float f12 = byteBuffer.getFloat(iPosition);
                int i15 = pc1.f388768a;
                short sMax = (short) (Math.max(-1.0f, Math.min(f12, 1.0f)) * 32767.0f);
                byteBufferA.put((byte) (sMax & 255));
                byteBufferA.put((byte) ((sMax >> 8) & 255));
                iPosition += 4;
            }
        } else if (i14 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferA.put(byteBuffer.get(iPosition + 1));
                byteBufferA.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i14 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferA.put(byteBuffer.get(iPosition + 1));
                byteBufferA.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i14 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferA.put(byteBuffer.get(iPosition + 2));
                byteBufferA.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA.flip();
    }

    @Override // com.yandex.mobile.ads.impl.ve
    public final oc.a b(oc.a aVar) throws oc.b {
        int i12 = aVar.f388488c;
        if (i12 == 3 || i12 == 2 || i12 == 268435456 || i12 == 536870912 || i12 == 805306368 || i12 == 4) {
            return i12 != 2 ? new oc.a(aVar.f388486a, aVar.f388487b, 2) : oc.a.f388485e;
        }
        throw new oc.b(aVar);
    }
}
