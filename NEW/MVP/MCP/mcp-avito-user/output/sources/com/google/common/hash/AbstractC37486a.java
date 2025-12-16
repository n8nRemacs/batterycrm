package com.google.common.hash;

import aZ0.InterfaceC19845a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: AbstractByteHasher.java */
@InterfaceC37497l
/* renamed from: com.google.common.hash.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37486a extends AbstractC37490e {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f360242a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

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

    @Override // com.google.common.hash.AbstractC37490e, com.google.common.hash.s, com.google.common.hash.J
    @InterfaceC19845a
    public final /* bridge */ /* synthetic */ J c(byte[] bArr) {
        c(bArr);
        return this;
    }

    @Override // com.google.common.hash.s
    @InterfaceC19845a
    public final s f(byte b12) {
        j(b12);
        return this;
    }

    @Override // com.google.common.hash.AbstractC37490e
    @InterfaceC19845a
    public final s h(int i12, byte[] bArr) {
        com.google.common.base.M.l(0, i12, bArr.length);
        l(i12, bArr);
        return this;
    }

    @Override // com.google.common.hash.AbstractC37490e
    @InterfaceC19845a
    public final void i(char c12) {
        this.f360242a.putChar(c12);
        k(2);
    }

    public abstract void j(byte b12);

    @InterfaceC19845a
    public final void k(int i12) {
        ByteBuffer byteBuffer = this.f360242a;
        try {
            l(i12, byteBuffer.array());
        } finally {
            byteBuffer.clear();
        }
    }

    public void l(int i12, byte[] bArr) {
        for (int i13 = 0; i13 < i12; i13++) {
            j(bArr[i13]);
        }
    }

    public void m(byte[] bArr) {
        l(bArr.length, bArr);
    }

    @Override // com.google.common.hash.AbstractC37490e, com.google.common.hash.s, com.google.common.hash.J
    @InterfaceC19845a
    public final s a(int i12) {
        this.f360242a.putInt(i12);
        k(4);
        return this;
    }

    @Override // com.google.common.hash.AbstractC37490e, com.google.common.hash.s, com.google.common.hash.J
    @InterfaceC19845a
    public final s b(long j12) {
        this.f360242a.putLong(j12);
        k(8);
        return this;
    }

    @Override // com.google.common.hash.AbstractC37490e, com.google.common.hash.s, com.google.common.hash.J
    @InterfaceC19845a
    public final s c(byte[] bArr) {
        bArr.getClass();
        m(bArr);
        return this;
    }
}
