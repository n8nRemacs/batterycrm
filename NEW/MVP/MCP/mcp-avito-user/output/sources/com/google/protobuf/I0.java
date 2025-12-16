package com.google.protobuf;

import com.google.protobuf.AbstractC37700t;
import com.google.protobuf.s1;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: NioByteString.java */
/* loaded from: classes7.dex */
final class I0 extends AbstractC37700t.i {

    /* renamed from: e, reason: collision with root package name */
    public final ByteBuffer f362692e;

    public I0(ByteBuffer byteBuffer) {
        Charset charset = C37670d0.f362857a;
        this.f362692e = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        ByteBuffer byteBufferSlice = this.f362692e.slice();
        int iRemaining = byteBufferSlice.remaining();
        AbstractC37700t.g(0, iRemaining, byteBufferSlice.remaining());
        byte[] bArr = new byte[iRemaining];
        byteBufferSlice.get(bArr);
        return new AbstractC37700t.j(bArr);
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final int C(int i12, int i13, int i14) {
        return s1.f362953a.e(i12, this.f362692e, i13, i14 + i13);
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final AbstractC37700t E(int i12, int i13) {
        try {
            return new I0(R(i12, i13));
        } catch (ArrayIndexOutOfBoundsException e12) {
            throw e12;
        } catch (IndexOutOfBoundsException e13) {
            throw new ArrayIndexOutOfBoundsException(e13.getMessage());
        }
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final String K(Charset charset) {
        byte[] bArrI;
        int length;
        int iPosition;
        ByteBuffer byteBuffer = this.f362692e;
        if (byteBuffer.hasArray()) {
            bArrI = byteBuffer.array();
            iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
            length = byteBuffer.remaining();
        } else {
            bArrI = I();
            length = bArrI.length;
            iPosition = 0;
        }
        return new String(bArrI, iPosition, length, charset);
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final void O(AbstractC37698s abstractC37698s) {
        abstractC37698s.g(this.f362692e.slice());
    }

    @Override // com.google.protobuf.AbstractC37700t.i
    public final boolean Q(AbstractC37700t abstractC37700t, int i12, int i13) {
        return E(0, i13).equals(abstractC37700t.E(i12, i13 + i12));
    }

    public final ByteBuffer R(int i12, int i13) {
        ByteBuffer byteBuffer = this.f362692e;
        if (i12 < byteBuffer.position() || i13 > byteBuffer.limit() || i12 > i13) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i12), Integer.valueOf(i13)));
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.position(i12 - byteBuffer.position());
        byteBufferSlice.limit(i13 - byteBuffer.position());
        return byteBufferSlice;
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final ByteBuffer b() {
        return this.f362692e.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final byte d(int i12) {
        try {
            return this.f362692e.get(i12);
        } catch (ArrayIndexOutOfBoundsException e12) {
            throw e12;
        } catch (IndexOutOfBoundsException e13) {
            throw new ArrayIndexOutOfBoundsException(e13.getMessage());
        }
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC37700t)) {
            return false;
        }
        AbstractC37700t abstractC37700t = (AbstractC37700t) obj;
        ByteBuffer byteBuffer = this.f362692e;
        if (byteBuffer.remaining() != abstractC37700t.size()) {
            return false;
        }
        if (byteBuffer.remaining() == 0) {
            return true;
        }
        return obj instanceof I0 ? byteBuffer.equals(((I0) obj).f362692e) : obj instanceof S0 ? obj.equals(this) : byteBuffer.equals(abstractC37700t.b());
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final void l(byte[] bArr, int i12, int i13, int i14) {
        ByteBuffer byteBufferSlice = this.f362692e.slice();
        byteBufferSlice.position(i12);
        byteBufferSlice.get(bArr, i13, i14);
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final int size() {
        return this.f362692e.remaining();
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final boolean t() {
        s1.b bVar = s1.f362953a;
        ByteBuffer byteBuffer = this.f362692e;
        return s1.f362953a.e(0, byteBuffer, byteBuffer.position(), byteBuffer.remaining()) == 0;
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final AbstractC37708x w() {
        return AbstractC37708x.i(this.f362692e, true);
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final int y(int i12, int i13, int i14) {
        for (int i15 = i13; i15 < i13 + i14; i15++) {
            i12 = (i12 * 31) + this.f362692e.get(i15);
        }
        return i12;
    }
}
