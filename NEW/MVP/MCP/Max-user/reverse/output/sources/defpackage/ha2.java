package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ha2 extends wi0 {
    public int[] i;
    public int[] j;

    @Override // defpackage.j50
    public final void c(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferJ = j(((iLimit - iPosition) / this.b.d) * this.c.d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferJ.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferJ.flip();
    }

    @Override // defpackage.wi0
    public final h50 f(h50 h50Var) throws AudioProcessor$UnhandledAudioFormatException {
        int[] iArr = this.i;
        if (iArr == null) {
            return h50.e;
        }
        int i = h50Var.c;
        int i2 = h50Var.b;
        if (i != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(h50Var);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new AudioProcessor$UnhandledAudioFormatException(h50Var);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new h50(h50Var.a, iArr.length, 2) : h50.e;
    }

    @Override // defpackage.wi0
    public final void g() {
        this.j = this.i;
    }

    @Override // defpackage.wi0
    public final void i() {
        this.j = null;
        this.i = null;
    }
}
