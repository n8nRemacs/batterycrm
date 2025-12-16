package defpackage;

import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ph4 extends oy {
    public boolean X;
    public long Y;
    public ByteBuffer Z;
    public hf6 c;
    public final za4 d;
    public ByteBuffer o;
    public final int s0;

    static {
        e19.a("media3.decoder");
    }

    public ph4(int i) {
        super(2);
        this.d = new za4(1);
        this.s0 = i;
    }

    public void w() {
        this.b = 0;
        ByteBuffer byteBuffer = this.o;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.Z;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.X = false;
    }

    public final ByteBuffer x(int i) {
        int i2 = this.s0;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.o;
        throw new DecoderInputBuffer$InsufficientCapacityException(wy1.g("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i, ")"));
    }

    public final void y(int i) {
        ByteBuffer byteBuffer = this.o;
        if (byteBuffer == null) {
            this.o = x(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.o = byteBuffer;
            return;
        }
        ByteBuffer byteBufferX = x(i2);
        byteBufferX.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferX.put(byteBuffer);
        }
        this.o = byteBufferX;
    }

    public final void z() {
        ByteBuffer byteBuffer = this.o;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.Z;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
