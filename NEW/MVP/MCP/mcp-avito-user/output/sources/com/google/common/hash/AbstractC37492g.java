package com.google.common.hash;

import aZ0.InterfaceC19845a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: AbstractStreamingHasher.java */
@InterfaceC37497l
/* renamed from: com.google.common.hash.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37492g extends AbstractC37490e {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f360248a;

    /* renamed from: b, reason: collision with root package name */
    public final int f360249b;

    /* renamed from: c, reason: collision with root package name */
    public final int f360250c;

    public AbstractC37492g(int i12) {
        com.google.common.base.M.g(i12 % i12 == 0);
        this.f360248a = ByteBuffer.allocate(i12 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f360249b = i12;
        this.f360250c = i12;
    }

    @Override // com.google.common.hash.AbstractC37490e, com.google.common.hash.s, com.google.common.hash.J
    @InterfaceC19845a
    public final /* bridge */ /* synthetic */ J a(int i12) {
        a(i12);
        return this;
    }

    @Override // com.google.common.hash.AbstractC37490e, com.google.common.hash.s, com.google.common.hash.J
    @InterfaceC19845a
    public final /* bridge */ /* synthetic */ J b(long j12) {
        b(j12);
        return this;
    }

    @Override // com.google.common.hash.s
    public final q e() {
        k();
        ByteBuffer byteBuffer = this.f360248a;
        byteBuffer.flip();
        if (byteBuffer.remaining() > 0) {
            n(byteBuffer);
            byteBuffer.position(byteBuffer.limit());
        }
        return j();
    }

    @Override // com.google.common.hash.s
    @InterfaceC19845a
    public final s f(byte b12) {
        this.f360248a.put(b12);
        l();
        return this;
    }

    @Override // com.google.common.hash.AbstractC37490e
    @InterfaceC19845a
    public final s h(int i12, byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, i12).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = this.f360248a;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            l();
        } else {
            int iPosition = this.f360249b - byteBuffer.position();
            for (int i13 = 0; i13 < iPosition; i13++) {
                byteBuffer.put(byteBufferOrder.get());
            }
            k();
            while (byteBufferOrder.remaining() >= this.f360250c) {
                m(byteBufferOrder);
            }
            byteBuffer.put(byteBufferOrder);
        }
        return this;
    }

    @Override // com.google.common.hash.AbstractC37490e
    @InterfaceC19845a
    public final void i(char c12) {
        this.f360248a.putChar(c12);
        l();
    }

    public abstract q j();

    public final void k() {
        ByteBuffer byteBuffer = this.f360248a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= this.f360250c) {
            m(byteBuffer);
        }
        byteBuffer.compact();
    }

    public final void l() {
        if (this.f360248a.remaining() < 8) {
            k();
        }
    }

    public abstract void m(ByteBuffer byteBuffer);

    public void n(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.limit());
        int i12 = this.f360250c;
        byteBuffer.limit(i12 + 7);
        while (byteBuffer.position() < i12) {
            byteBuffer.putLong(0L);
        }
        byteBuffer.limit(i12);
        byteBuffer.flip();
        m(byteBuffer);
    }

    @Override // com.google.common.hash.AbstractC37490e, com.google.common.hash.s, com.google.common.hash.J
    @InterfaceC19845a
    public final s a(int i12) {
        this.f360248a.putInt(i12);
        l();
        return this;
    }

    @Override // com.google.common.hash.AbstractC37490e, com.google.common.hash.s, com.google.common.hash.J
    @InterfaceC19845a
    public final s b(long j12) {
        this.f360248a.putLong(j12);
        l();
        return this;
    }
}
