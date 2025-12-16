package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class uu0 implements zd5 {
    public final ByteBuffer a;
    public final MediaCodec.BufferInfo b;
    public final tu1 c;

    public uu0(zd5 zd5Var) {
        MediaCodec.BufferInfo bufferInfoZ = zd5Var.z();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, bufferInfoZ.size, bufferInfoZ.presentationTimeUs, bufferInfoZ.flags);
        this.b = bufferInfo;
        ByteBuffer byteBufferO = zd5Var.o();
        MediaCodec.BufferInfo bufferInfoZ2 = zd5Var.z();
        byteBufferO.position(bufferInfoZ2.offset);
        byteBufferO.limit(bufferInfoZ2.offset + bufferInfoZ2.size);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfoZ2.size);
        byteBufferAllocate.order(byteBufferO.order());
        byteBufferAllocate.put(byteBufferO);
        byteBufferAllocate.flip();
        this.a = byteBufferAllocate;
        AtomicReference atomicReference = new AtomicReference();
        ixi.a(new tu0(atomicReference, 0));
        tu1 tu1Var = (tu1) atomicReference.get();
        tu1Var.getClass();
        this.c = tu1Var;
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
        this.c.b(null);
    }

    @Override // defpackage.zd5
    public final ByteBuffer o() {
        return this.a;
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
