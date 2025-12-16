package defpackage;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer$InsufficientCapacityException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class oh4 extends oy {
    public long X;
    public ByteBuffer Y;
    public final int Z;
    public final za4 c;
    public ByteBuffer d;
    public boolean o;

    static {
        tm5.a("goog.exo.decoder");
    }

    public oh4(int i) {
        super(1);
        this.c = new za4(0);
        this.Z = i;
    }

    public void w() {
        this.b = 0;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.Y;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.o = false;
    }

    public final ByteBuffer x(int i) {
        int i2 = this.Z;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.d;
        int iCapacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(iCapacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new DecoderInputBuffer$InsufficientCapacityException(sb.toString());
    }

    public final void y(int i) {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            this.d = x(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferX = x(i2);
        byteBufferX.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferX.put(byteBuffer);
        }
        this.d = byteBufferX;
    }

    public final void z() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.Y;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
