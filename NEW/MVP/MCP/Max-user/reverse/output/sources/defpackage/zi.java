package defpackage;

import android.graphics.Color;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class zi implements uud {
    public final zh a;
    public final a93 b;
    public ae4 c;

    public zi(zh zhVar, a93 a93Var) {
        this.a = zhVar;
        this.b = a93Var;
    }

    @Override // defpackage.uud
    public final void a(ae4 ae4Var, byte[] bArr, int i) {
        Object giVar;
        SystemClock.elapsedRealtime();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byte b = byteBufferWrap.get();
        byteBufferWrap.getShort();
        byteBufferWrap.getInt();
        int i2 = b == 1 ? byteBufferWrap.getShort() & 65535 : byteBufferWrap.getInt();
        byte b2 = byteBufferWrap.get();
        ByteBuffer byteBufferSlice = byteBufferWrap.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        int i3 = 0;
        if (b == 1) {
            int iRemaining = byteBufferSlice.remaining() / 4;
            float[] fArr = new float[iRemaining];
            while (i3 < iRemaining) {
                fArr[i3] = byteBufferSlice.getFloat();
                i3++;
            }
            giVar = new gi(fArr);
        } else if (b2 != 0) {
            giVar = b2 != 1 ? b2 != 2 ? new ki() : new ii(Color.rgb(byteBufferSlice.get() & 255, byteBufferSlice.get() & 255, byteBufferSlice.get() & 255)) : ji.a;
        } else {
            int iRemaining2 = byteBufferSlice.remaining();
            float[] fArr2 = new float[iRemaining2];
            while (i3 < iRemaining2) {
                fArr2[i3] = (byteBufferSlice.get() & 255) * 0.003921569f;
                i3++;
            }
            giVar = new gi(fArr2);
        }
        bj bjVar = new bj(i2, giVar, 0);
        ((AtomicInteger) this.b.X).incrementAndGet();
        ((AtomicInteger) this.b.o).addAndGet(bArr.length);
        zh zhVar = this.a;
        if (zhVar.i) {
            ej ejVar = zhVar.h;
            if (ejVar.p) {
                return;
            }
            ejVar.g.post(new ud(ejVar, 2, bjVar));
        }
    }
}
