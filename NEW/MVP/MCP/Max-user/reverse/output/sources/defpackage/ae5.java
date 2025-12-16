package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ae5 implements zd5 {
    public final tu1 X;
    public final AtomicBoolean Y = new AtomicBoolean(false);
    public final MediaCodec a;
    public final MediaCodec.BufferInfo b;
    public final int c;
    public final ByteBuffer d;
    public final wu1 o;

    public ae5(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.a = mediaCodec;
        this.c = i;
        this.d = mediaCodec.getOutputBuffer(i);
        this.b = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        this.o = ixi.a(new tu0(atomicReference, 2));
        tu1 tu1Var = (tu1) atomicReference.get();
        tu1Var.getClass();
        this.X = tu1Var;
    }

    @Override // defpackage.zd5
    public final boolean C() {
        return (this.b.flags & 1) != 0;
    }

    @Override // defpackage.zd5
    public final long U() {
        return this.b.presentationTimeUs;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        tu1 tu1Var = this.X;
        if (this.Y.getAndSet(true)) {
            return;
        }
        try {
            this.a.releaseOutputBuffer(this.c, false);
            tu1Var.b(null);
        } catch (IllegalStateException e) {
            tu1Var.d(e);
        }
    }

    @Override // defpackage.zd5
    public final ByteBuffer o() {
        if (this.Y.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
        MediaCodec.BufferInfo bufferInfo = this.b;
        int i = bufferInfo.offset;
        ByteBuffer byteBuffer = this.d;
        byteBuffer.position(i);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return byteBuffer;
    }

    @Override // defpackage.zd5
    public final long size() {
        return this.b.size;
    }

    @Override // defpackage.zd5
    public final MediaCodec.BufferInfo z() {
        return this.b;
    }
}
