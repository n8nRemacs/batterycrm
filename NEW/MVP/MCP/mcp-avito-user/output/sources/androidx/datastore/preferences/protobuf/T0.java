package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC22934w;
import androidx.datastore.preferences.protobuf.L1;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: NioByteString.java */
/* loaded from: classes.dex */
final class T0 extends AbstractC22934w.i {

    /* renamed from: e, reason: collision with root package name */
    public final ByteBuffer f45751e;

    public T0(ByteBuffer byteBuffer) {
        Charset charset = C22914m0.f45874a;
        this.f45751e = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        ByteBuffer byteBufferSlice = this.f45751e.slice();
        int iRemaining = byteBufferSlice.remaining();
        AbstractC22934w.g(0, iRemaining, byteBufferSlice.remaining());
        byte[] bArr = new byte[iRemaining];
        byteBufferSlice.get(bArr);
        return new AbstractC22934w.j(bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final String E(Charset charset) {
        byte[] bArrC;
        int length;
        int iPosition;
        ByteBuffer byteBuffer = this.f45751e;
        if (byteBuffer.hasArray()) {
            bArrC = byteBuffer.array();
            iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
            length = byteBuffer.remaining();
        } else {
            bArrC = C();
            length = bArrC.length;
            iPosition = 0;
        }
        return new String(bArrC, iPosition, length, charset);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final void I(AbstractC22932v abstractC22932v) {
        abstractC22932v.g(this.f45751e.slice());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w.i
    public final boolean N(AbstractC22934w abstractC22934w, int i12, int i13) {
        return y(0, i13).equals(abstractC22934w.y(i12, i13 + i12));
    }

    public final ByteBuffer O(int i12, int i13) {
        ByteBuffer byteBuffer = this.f45751e;
        if (i12 < byteBuffer.position() || i13 > byteBuffer.limit() || i12 > i13) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i12), Integer.valueOf(i13)));
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.position(i12 - byteBuffer.position());
        byteBufferSlice.limit(i13 - byteBuffer.position());
        return byteBufferSlice;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final ByteBuffer b() {
        return this.f45751e.asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final byte d(int i12) {
        try {
            return this.f45751e.get(i12);
        } catch (ArrayIndexOutOfBoundsException e12) {
            throw e12;
        } catch (IndexOutOfBoundsException e13) {
            throw new ArrayIndexOutOfBoundsException(e13.getMessage());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC22934w)) {
            return false;
        }
        AbstractC22934w abstractC22934w = (AbstractC22934w) obj;
        ByteBuffer byteBuffer = this.f45751e;
        if (byteBuffer.remaining() != abstractC22934w.size()) {
            return false;
        }
        if (byteBuffer.remaining() == 0) {
            return true;
        }
        return obj instanceof T0 ? byteBuffer.equals(((T0) obj).f45751e) : obj instanceof C22894f1 ? obj.equals(this) : byteBuffer.equals(abstractC22934w.b());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final void i(byte[] bArr, int i12, int i13, int i14) {
        ByteBuffer byteBufferSlice = this.f45751e.slice();
        byteBufferSlice.position(i12);
        byteBufferSlice.get(bArr, i13, i14);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final boolean s() {
        L1.b bVar = L1.f45728a;
        ByteBuffer byteBuffer = this.f45751e;
        return L1.f45728a.f(0, byteBuffer, byteBuffer.position(), byteBuffer.remaining()) == 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final int size() {
        return this.f45751e.remaining();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final int v(int i12, int i13, int i14) {
        for (int i15 = i13; i15 < i13 + i14; i15++) {
            i12 = (i12 * 31) + this.f45751e.get(i15);
        }
        return i12;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final int w(int i12, int i13, int i14) {
        return L1.f45728a.f(i12, this.f45751e, i13, i14 + i13);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final AbstractC22934w y(int i12, int i13) {
        try {
            return new T0(O(i12, i13));
        } catch (ArrayIndexOutOfBoundsException e12) {
            throw e12;
        } catch (IndexOutOfBoundsException e13) {
            throw new ArrayIndexOutOfBoundsException(e13.getMessage());
        }
    }
}
