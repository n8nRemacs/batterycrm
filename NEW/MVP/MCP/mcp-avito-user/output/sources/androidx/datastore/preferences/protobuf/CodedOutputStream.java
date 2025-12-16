package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.L1;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class CodedOutputStream extends AbstractC22932v {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f45598b = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f45599c = K1.f45722f;

    /* renamed from: a, reason: collision with root package name */
    public B f45600a;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str));
        }

        public OutOfSpaceException(RuntimeException runtimeException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", runtimeException);
        }

        public OutOfSpaceException(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    public static abstract class b extends CodedOutputStream {

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f45601d;

        /* renamed from: e, reason: collision with root package name */
        public final int f45602e;

        /* renamed from: f, reason: collision with root package name */
        public int f45603f;

        public b(int i12) {
            super();
            if (i12 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i12, 20)];
            this.f45601d = bArr;
            this.f45602e = bArr.length;
        }

        public final void Y(byte b12) {
            int i12 = this.f45603f;
            this.f45603f = i12 + 1;
            this.f45601d[i12] = b12;
        }

        public final void Z(int i12) {
            int i13 = this.f45603f;
            int i14 = i13 + 1;
            this.f45603f = i14;
            byte[] bArr = this.f45601d;
            bArr[i13] = (byte) (i12 & 255);
            int i15 = i13 + 2;
            this.f45603f = i15;
            bArr[i14] = (byte) ((i12 >> 8) & 255);
            int i16 = i13 + 3;
            this.f45603f = i16;
            bArr[i15] = (byte) ((i12 >> 16) & 255);
            this.f45603f = i13 + 4;
            bArr[i16] = (byte) ((i12 >> 24) & 255);
        }

        public final void a0(long j12) {
            int i12 = this.f45603f;
            int i13 = i12 + 1;
            this.f45603f = i13;
            byte[] bArr = this.f45601d;
            bArr[i12] = (byte) (j12 & 255);
            int i14 = i12 + 2;
            this.f45603f = i14;
            bArr[i13] = (byte) ((j12 >> 8) & 255);
            int i15 = i12 + 3;
            this.f45603f = i15;
            bArr[i14] = (byte) ((j12 >> 16) & 255);
            int i16 = i12 + 4;
            this.f45603f = i16;
            bArr[i15] = (byte) (255 & (j12 >> 24));
            int i17 = i12 + 5;
            this.f45603f = i17;
            bArr[i16] = (byte) (((int) (j12 >> 32)) & 255);
            int i18 = i12 + 6;
            this.f45603f = i18;
            bArr[i17] = (byte) (((int) (j12 >> 40)) & 255);
            int i19 = i12 + 7;
            this.f45603f = i19;
            bArr[i18] = (byte) (((int) (j12 >> 48)) & 255);
            this.f45603f = i12 + 8;
            bArr[i19] = (byte) (((int) (j12 >> 56)) & 255);
        }

        public final void b0(int i12, int i13) {
            c0((i12 << 3) | i13);
        }

        public final void c0(int i12) {
            boolean z12 = CodedOutputStream.f45599c;
            byte[] bArr = this.f45601d;
            if (z12) {
                while ((i12 & (-128)) != 0) {
                    int i13 = this.f45603f;
                    this.f45603f = i13 + 1;
                    K1.p(bArr, i13, (byte) ((i12 & 127) | 128));
                    i12 >>>= 7;
                }
                int i14 = this.f45603f;
                this.f45603f = i14 + 1;
                K1.p(bArr, i14, (byte) i12);
                return;
            }
            while ((i12 & (-128)) != 0) {
                int i15 = this.f45603f;
                this.f45603f = i15 + 1;
                bArr[i15] = (byte) ((i12 & 127) | 128);
                i12 >>>= 7;
            }
            int i16 = this.f45603f;
            this.f45603f = i16 + 1;
            bArr[i16] = (byte) i12;
        }

        public final void d0(long j12) {
            boolean z12 = CodedOutputStream.f45599c;
            byte[] bArr = this.f45601d;
            if (z12) {
                while ((j12 & (-128)) != 0) {
                    int i12 = this.f45603f;
                    this.f45603f = i12 + 1;
                    K1.p(bArr, i12, (byte) ((((int) j12) & 127) | 128));
                    j12 >>>= 7;
                }
                int i13 = this.f45603f;
                this.f45603f = i13 + 1;
                K1.p(bArr, i13, (byte) j12);
                return;
            }
            while ((j12 & (-128)) != 0) {
                int i14 = this.f45603f;
                this.f45603f = i14 + 1;
                bArr[i14] = (byte) ((((int) j12) & 127) | 128);
                j12 >>>= 7;
            }
            int i15 = this.f45603f;
            this.f45603f = i15 + 1;
            bArr[i15] = (byte) j12;
        }
    }

    public static class c extends CodedOutputStream {

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f45604d;

        /* renamed from: e, reason: collision with root package name */
        public final int f45605e;

        /* renamed from: f, reason: collision with root package name */
        public int f45606f;

        public c(byte[] bArr, int i12) {
            super();
            if (((bArr.length - i12) | i12) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i12)));
            }
            this.f45604d = bArr;
            this.f45606f = 0;
            this.f45605e = i12;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void J(byte b12) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f45604d;
                int i12 = this.f45606f;
                this.f45606f = i12 + 1;
                bArr[i12] = b12;
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45606f), Integer.valueOf(this.f45605e), 1), e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void K(int i12, byte[] bArr) throws OutOfSpaceException {
            W(i12);
            Y(bArr, 0, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void L(AbstractC22934w abstractC22934w) throws OutOfSpaceException {
            W(abstractC22934w.size());
            abstractC22934w.I(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void M(int i12) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f45604d;
                int i13 = this.f45606f;
                int i14 = i13 + 1;
                this.f45606f = i14;
                bArr[i13] = (byte) (i12 & 255);
                int i15 = i13 + 2;
                this.f45606f = i15;
                bArr[i14] = (byte) ((i12 >> 8) & 255);
                int i16 = i13 + 3;
                this.f45606f = i16;
                bArr[i15] = (byte) ((i12 >> 16) & 255);
                this.f45606f = i13 + 4;
                bArr[i16] = (byte) ((i12 >> 24) & 255);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45606f), Integer.valueOf(this.f45605e), 1), e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void N(long j12) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f45604d;
                int i12 = this.f45606f;
                int i13 = i12 + 1;
                this.f45606f = i13;
                bArr[i12] = (byte) (((int) j12) & 255);
                int i14 = i12 + 2;
                this.f45606f = i14;
                bArr[i13] = (byte) (((int) (j12 >> 8)) & 255);
                int i15 = i12 + 3;
                this.f45606f = i15;
                bArr[i14] = (byte) (((int) (j12 >> 16)) & 255);
                int i16 = i12 + 4;
                this.f45606f = i16;
                bArr[i15] = (byte) (((int) (j12 >> 24)) & 255);
                int i17 = i12 + 5;
                this.f45606f = i17;
                bArr[i16] = (byte) (((int) (j12 >> 32)) & 255);
                int i18 = i12 + 6;
                this.f45606f = i18;
                bArr[i17] = (byte) (((int) (j12 >> 40)) & 255);
                int i19 = i12 + 7;
                this.f45606f = i19;
                bArr[i18] = (byte) (((int) (j12 >> 48)) & 255);
                this.f45606f = i12 + 8;
                bArr[i19] = (byte) (((int) (j12 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45606f), Integer.valueOf(this.f45605e), 1), e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void O(int i12) throws OutOfSpaceException {
            if (i12 >= 0) {
                W(i12);
            } else {
                X(i12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void P(int i12, F0 f02) throws OutOfSpaceException {
            V(i12, 2);
            R(f02);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Q(int i12, F0 f02, InterfaceC22897g1 interfaceC22897g1) throws OutOfSpaceException {
            V(i12, 2);
            W(((AbstractC22877a) f02).e(interfaceC22897g1));
            interfaceC22897g1.c(f02, this.f45600a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void R(F0 f02) throws OutOfSpaceException {
            W(f02.getSerializedSize());
            f02.b(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void S(int i12, F0 f02) throws OutOfSpaceException {
            V(1, 3);
            writeUInt32(2, i12);
            P(3, f02);
            V(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void T(int i12, AbstractC22934w abstractC22934w) throws OutOfSpaceException {
            V(1, 3);
            writeUInt32(2, i12);
            b(3, abstractC22934w);
            V(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void U(String str) throws OutOfSpaceException {
            int i12 = this.f45606f;
            try {
                int iD2 = CodedOutputStream.D(str.length() * 3);
                int iD3 = CodedOutputStream.D(str.length());
                int i13 = this.f45605e;
                byte[] bArr = this.f45604d;
                if (iD3 == iD2) {
                    int i14 = i12 + iD3;
                    this.f45606f = i14;
                    int iD4 = L1.f45728a.d(i14, i13 - i14, str, bArr);
                    this.f45606f = i12;
                    W((iD4 - i12) - iD3);
                    this.f45606f = iD4;
                } else {
                    W(L1.d(str));
                    int i15 = this.f45606f;
                    this.f45606f = L1.f45728a.d(i15, i13 - i15, str, bArr);
                }
            } catch (L1.d e12) {
                this.f45606f = i12;
                I(str, e12);
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(e13);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void V(int i12, int i13) throws OutOfSpaceException {
            W((i12 << 3) | i13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void W(int i12) throws OutOfSpaceException {
            boolean z12 = CodedOutputStream.f45599c;
            int i13 = this.f45605e;
            byte[] bArr = this.f45604d;
            if (z12 && !C22895g.a()) {
                int i14 = this.f45606f;
                if (i13 - i14 >= 5) {
                    if ((i12 & (-128)) == 0) {
                        this.f45606f = i14 + 1;
                        K1.p(bArr, i14, (byte) i12);
                        return;
                    }
                    this.f45606f = i14 + 1;
                    K1.p(bArr, i14, (byte) (i12 | 128));
                    int i15 = i12 >>> 7;
                    if ((i15 & (-128)) == 0) {
                        int i16 = this.f45606f;
                        this.f45606f = i16 + 1;
                        K1.p(bArr, i16, (byte) i15);
                        return;
                    }
                    int i17 = this.f45606f;
                    this.f45606f = i17 + 1;
                    K1.p(bArr, i17, (byte) (i15 | 128));
                    int i18 = i12 >>> 14;
                    if ((i18 & (-128)) == 0) {
                        int i19 = this.f45606f;
                        this.f45606f = i19 + 1;
                        K1.p(bArr, i19, (byte) i18);
                        return;
                    }
                    int i22 = this.f45606f;
                    this.f45606f = i22 + 1;
                    K1.p(bArr, i22, (byte) (i18 | 128));
                    int i23 = i12 >>> 21;
                    if ((i23 & (-128)) == 0) {
                        int i24 = this.f45606f;
                        this.f45606f = i24 + 1;
                        K1.p(bArr, i24, (byte) i23);
                        return;
                    } else {
                        int i25 = this.f45606f;
                        this.f45606f = i25 + 1;
                        K1.p(bArr, i25, (byte) (i23 | 128));
                        int i26 = this.f45606f;
                        this.f45606f = i26 + 1;
                        K1.p(bArr, i26, (byte) (i12 >>> 28));
                        return;
                    }
                }
            }
            while ((i12 & (-128)) != 0) {
                try {
                    int i27 = this.f45606f;
                    this.f45606f = i27 + 1;
                    bArr[i27] = (byte) ((i12 & 127) | 128);
                    i12 >>>= 7;
                } catch (IndexOutOfBoundsException e12) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45606f), Integer.valueOf(i13), 1), e12);
                }
            }
            int i28 = this.f45606f;
            this.f45606f = i28 + 1;
            bArr[i28] = (byte) i12;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void X(long j12) throws OutOfSpaceException {
            boolean z12 = CodedOutputStream.f45599c;
            int i12 = this.f45605e;
            byte[] bArr = this.f45604d;
            if (z12 && i12 - this.f45606f >= 10) {
                while ((j12 & (-128)) != 0) {
                    int i13 = this.f45606f;
                    this.f45606f = i13 + 1;
                    K1.p(bArr, i13, (byte) ((((int) j12) & 127) | 128));
                    j12 >>>= 7;
                }
                int i14 = this.f45606f;
                this.f45606f = i14 + 1;
                K1.p(bArr, i14, (byte) j12);
                return;
            }
            while ((j12 & (-128)) != 0) {
                try {
                    int i15 = this.f45606f;
                    this.f45606f = i15 + 1;
                    bArr[i15] = (byte) ((((int) j12) & 127) | 128);
                    j12 >>>= 7;
                } catch (IndexOutOfBoundsException e12) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45606f), Integer.valueOf(i12), 1), e12);
                }
            }
            int i16 = this.f45606f;
            this.f45606f = i16 + 1;
            bArr[i16] = (byte) j12;
        }

        public final void Y(byte[] bArr, int i12, int i13) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i12, this.f45604d, this.f45606f, i13);
                this.f45606f += i13;
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45606f), Integer.valueOf(this.f45605e), Integer.valueOf(i13)), e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void b(int i12, AbstractC22934w abstractC22934w) throws OutOfSpaceException {
            V(i12, 2);
            L(abstractC22934w);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22932v
        public final void g(ByteBuffer byteBuffer) throws OutOfSpaceException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f45604d, this.f45606f, iRemaining);
                this.f45606f += iRemaining;
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45606f), Integer.valueOf(this.f45605e), Integer.valueOf(iRemaining)), e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22932v
        public final void h(byte[] bArr, int i12, int i13) throws OutOfSpaceException {
            Y(bArr, i12, i13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i12, boolean z12) throws OutOfSpaceException {
            V(i12, 0);
            J(z12 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i12, int i13) throws OutOfSpaceException {
            V(i12, 5);
            M(i13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i12, long j12) throws OutOfSpaceException {
            V(i12, 1);
            N(j12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i12, int i13) throws OutOfSpaceException {
            V(i12, 0);
            O(i13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i12, String str) throws OutOfSpaceException {
            V(i12, 2);
            U(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i12, int i13) throws OutOfSpaceException {
            V(i12, 0);
            W(i13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i12, long j12) throws OutOfSpaceException {
            V(i12, 0);
            X(j12);
        }
    }

    public static final class d extends b {
        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void J(byte b12) {
            if (this.f45603f == this.f45602e) {
                throw null;
            }
            Y(b12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void K(int i12, byte[] bArr) {
            W(i12);
            if (this.f45603f > 0) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void L(AbstractC22934w abstractC22934w) {
            W(abstractC22934w.size());
            abstractC22934w.I(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void M(int i12) {
            e0(4);
            Z(i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void N(long j12) {
            e0(8);
            a0(j12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void O(int i12) {
            if (i12 >= 0) {
                W(i12);
            } else {
                X(i12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void P(int i12, F0 f02) {
            V(i12, 2);
            R(f02);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Q(int i12, F0 f02, InterfaceC22897g1 interfaceC22897g1) {
            V(i12, 2);
            W(((AbstractC22877a) f02).e(interfaceC22897g1));
            interfaceC22897g1.c(f02, this.f45600a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void R(F0 f02) {
            W(f02.getSerializedSize());
            f02.b(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void S(int i12, F0 f02) {
            V(1, 3);
            writeUInt32(2, i12);
            P(3, f02);
            V(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void T(int i12, AbstractC22934w abstractC22934w) {
            V(1, 3);
            writeUInt32(2, i12);
            b(3, abstractC22934w);
            V(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void U(String str) throws OutOfSpaceException {
            int length = str.length() * 3;
            int iD2 = CodedOutputStream.D(length);
            int i12 = iD2 + length;
            int i13 = this.f45602e;
            if (i12 > i13) {
                W(L1.f45728a.d(0, length, str, new byte[length]));
                if (this.f45603f > 0) {
                    throw null;
                }
                throw null;
            }
            int i14 = this.f45603f;
            if (i12 > i13 - i14) {
                throw null;
            }
            try {
                int iD3 = CodedOutputStream.D(str.length());
                byte[] bArr = this.f45601d;
                if (iD3 == iD2) {
                    int i15 = i14 + iD3;
                    this.f45603f = i15;
                    int iD4 = L1.f45728a.d(i15, i13 - i15, str, bArr);
                    this.f45603f = i14;
                    c0((iD4 - i14) - iD3);
                    this.f45603f = iD4;
                } else {
                    int iD5 = L1.d(str);
                    c0(iD5);
                    this.f45603f = L1.f45728a.d(this.f45603f, iD5, str, bArr);
                }
            } catch (L1.d e12) {
                this.f45603f = i14;
                I(str, e12);
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(e13);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void V(int i12, int i13) {
            W((i12 << 3) | i13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void W(int i12) {
            e0(5);
            c0(i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void X(long j12) {
            e0(10);
            d0(j12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void b(int i12, AbstractC22934w abstractC22934w) {
            V(i12, 2);
            L(abstractC22934w);
        }

        public final void e0(int i12) {
            if (this.f45602e - this.f45603f < i12) {
                throw null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22932v
        public final void g(ByteBuffer byteBuffer) {
            if (this.f45603f > 0) {
                throw null;
            }
            byteBuffer.remaining();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22932v
        public final void h(byte[] bArr, int i12, int i13) {
            if (this.f45603f > 0) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i12, boolean z12) {
            e0(11);
            b0(i12, 0);
            Y(z12 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i12, int i13) {
            e0(14);
            b0(i12, 5);
            Z(i13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i12, long j12) {
            e0(18);
            b0(i12, 1);
            a0(j12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i12, int i13) {
            e0(20);
            b0(i12, 0);
            if (i13 >= 0) {
                c0(i13);
            } else {
                d0(i13);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i12, String str) throws OutOfSpaceException {
            V(i12, 2);
            U(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i12, int i13) {
            e0(20);
            b0(i12, 0);
            c0(i13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i12, long j12) {
            e0(20);
            b0(i12, 0);
            d0(j12);
        }
    }

    public static final class e extends c {
    }

    public static final class f extends b {

        /* renamed from: g, reason: collision with root package name */
        public final OutputStream f45607g;

        public f(OutputStream outputStream, int i12) {
            super(i12);
            this.f45607g = outputStream;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void J(byte b12) {
            if (this.f45603f == this.f45602e) {
                e0();
            }
            Y(b12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void K(int i12, byte[] bArr) throws IOException {
            W(i12);
            g0(bArr, 0, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void L(AbstractC22934w abstractC22934w) {
            W(abstractC22934w.size());
            abstractC22934w.I(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void M(int i12) {
            f0(4);
            Z(i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void N(long j12) {
            f0(8);
            a0(j12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void O(int i12) {
            if (i12 >= 0) {
                W(i12);
            } else {
                X(i12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void P(int i12, F0 f02) {
            V(i12, 2);
            R(f02);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Q(int i12, F0 f02, InterfaceC22897g1 interfaceC22897g1) {
            V(i12, 2);
            W(((AbstractC22877a) f02).e(interfaceC22897g1));
            interfaceC22897g1.c(f02, this.f45600a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void R(F0 f02) {
            W(f02.getSerializedSize());
            f02.b(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void S(int i12, F0 f02) {
            V(1, 3);
            writeUInt32(2, i12);
            P(3, f02);
            V(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void T(int i12, AbstractC22934w abstractC22934w) {
            V(1, 3);
            writeUInt32(2, i12);
            b(3, abstractC22934w);
            V(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void U(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int iD2 = CodedOutputStream.D(length);
                int i12 = iD2 + length;
                int i13 = this.f45602e;
                if (i12 > i13) {
                    byte[] bArr = new byte[length];
                    int iD3 = L1.f45728a.d(0, length, str, bArr);
                    W(iD3);
                    g0(bArr, 0, iD3);
                    return;
                }
                if (i12 > i13 - this.f45603f) {
                    e0();
                }
                int iD4 = CodedOutputStream.D(str.length());
                int i14 = this.f45603f;
                byte[] bArr2 = this.f45601d;
                try {
                    if (iD4 == iD2) {
                        int i15 = i14 + iD4;
                        this.f45603f = i15;
                        int iD5 = L1.f45728a.d(i15, i13 - i15, str, bArr2);
                        this.f45603f = i14;
                        c0((iD5 - i14) - iD4);
                        this.f45603f = iD5;
                    } else {
                        int iD6 = L1.d(str);
                        c0(iD6);
                        this.f45603f = L1.f45728a.d(this.f45603f, iD6, str, bArr2);
                    }
                } catch (L1.d e12) {
                    this.f45603f = i14;
                    throw e12;
                } catch (ArrayIndexOutOfBoundsException e13) {
                    throw new OutOfSpaceException(e13);
                }
            } catch (L1.d e14) {
                I(str, e14);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void V(int i12, int i13) {
            W((i12 << 3) | i13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void W(int i12) {
            f0(5);
            c0(i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void X(long j12) {
            f0(10);
            d0(j12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void b(int i12, AbstractC22934w abstractC22934w) {
            V(i12, 2);
            L(abstractC22934w);
        }

        public final void e0() {
            this.f45607g.write(this.f45601d, 0, this.f45603f);
            this.f45603f = 0;
        }

        public final void f0(int i12) {
            if (this.f45602e - this.f45603f < i12) {
                e0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22932v
        public final void g(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i12 = this.f45603f;
            int i13 = this.f45602e;
            int i14 = i13 - i12;
            byte[] bArr = this.f45601d;
            if (i14 >= iRemaining) {
                byteBuffer.get(bArr, i12, iRemaining);
                this.f45603f += iRemaining;
                return;
            }
            byteBuffer.get(bArr, i12, i14);
            int i15 = iRemaining - i14;
            this.f45603f = i13;
            e0();
            while (i15 > i13) {
                byteBuffer.get(bArr, 0, i13);
                this.f45607g.write(bArr, 0, i13);
                i15 -= i13;
            }
            byteBuffer.get(bArr, 0, i15);
            this.f45603f = i15;
        }

        public final void g0(byte[] bArr, int i12, int i13) throws IOException {
            int i14 = this.f45603f;
            int i15 = this.f45602e;
            int i16 = i15 - i14;
            byte[] bArr2 = this.f45601d;
            if (i16 >= i13) {
                System.arraycopy(bArr, i12, bArr2, i14, i13);
                this.f45603f += i13;
                return;
            }
            System.arraycopy(bArr, i12, bArr2, i14, i16);
            int i17 = i12 + i16;
            int i18 = i13 - i16;
            this.f45603f = i15;
            e0();
            if (i18 > i15) {
                this.f45607g.write(bArr, i17, i18);
            } else {
                System.arraycopy(bArr, i17, bArr2, 0, i18);
                this.f45603f = i18;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22932v
        public final void h(byte[] bArr, int i12, int i13) throws IOException {
            g0(bArr, i12, i13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i12, boolean z12) {
            f0(11);
            b0(i12, 0);
            Y(z12 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i12, int i13) {
            f0(14);
            b0(i12, 5);
            Z(i13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i12, long j12) {
            f0(18);
            b0(i12, 1);
            a0(j12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i12, int i13) {
            f0(20);
            b0(i12, 0);
            if (i13 >= 0) {
                c0(i13);
            } else {
                d0(i13);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i12, String str) throws IOException {
            V(i12, 2);
            U(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i12, int i13) {
            f0(20);
            b0(i12, 0);
            c0(i13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i12, long j12) {
            f0(20);
            b0(i12, 0);
            d0(j12);
        }
    }

    public static final class g extends CodedOutputStream {
        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void J(byte b12) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void K(int i12, byte[] bArr) {
            W(i12);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void L(AbstractC22934w abstractC22934w) {
            W(abstractC22934w.size());
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void M(int i12) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void N(long j12) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void O(int i12) {
            if (i12 >= 0) {
                W(i12);
                throw null;
            }
            X(i12);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void P(int i12, F0 f02) {
            V(i12, 2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Q(int i12, F0 f02, InterfaceC22897g1 interfaceC22897g1) {
            V(i12, 2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void R(F0 f02) {
            W(f02.getSerializedSize());
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void S(int i12, F0 f02) {
            V(1, 3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void T(int i12, AbstractC22934w abstractC22934w) {
            V(1, 3);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void U(String str) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void V(int i12, int i13) {
            W((i12 << 3) | i13);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void W(int i12) {
            if ((i12 & (-128)) != 0) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void X(long j12) {
            if ((j12 & (-128)) != 0) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void b(int i12, AbstractC22934w abstractC22934w) {
            V(i12, 2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22932v
        public final void g(ByteBuffer byteBuffer) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22932v
        public final void h(byte[] bArr, int i12, int i13) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i12, boolean z12) {
            V(i12, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i12, int i13) {
            V(i12, 5);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i12, long j12) {
            V(i12, 1);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i12, int i13) {
            V(i12, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i12, String str) {
            V(i12, 2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i12, int i13) {
            V(i12, 0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i12, long j12) {
            V(i12, 0);
            throw null;
        }
    }

    public static final class h extends CodedOutputStream {

        /* renamed from: d, reason: collision with root package name */
        public long f45608d;

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void J(byte b12) throws OutOfSpaceException {
            long j12 = this.f45608d;
            if (j12 >= 0) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f45608d), 0L, 1));
            }
            this.f45608d = 1 + j12;
            K1.o(j12, b12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void K(int i12, byte[] bArr) throws OutOfSpaceException {
            W(i12);
            Y(bArr, 0, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void L(AbstractC22934w abstractC22934w) throws OutOfSpaceException {
            W(abstractC22934w.size());
            abstractC22934w.I(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void M(int i12) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void N(long j12) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void O(int i12) throws OutOfSpaceException {
            if (i12 >= 0) {
                W(i12);
            } else {
                X(i12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void P(int i12, F0 f02) throws OutOfSpaceException {
            V(i12, 2);
            R(f02);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Q(int i12, F0 f02, InterfaceC22897g1 interfaceC22897g1) throws OutOfSpaceException {
            V(i12, 2);
            W(((AbstractC22877a) f02).e(interfaceC22897g1));
            interfaceC22897g1.c(f02, this.f45600a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void R(F0 f02) throws OutOfSpaceException {
            W(f02.getSerializedSize());
            f02.b(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void S(int i12, F0 f02) throws OutOfSpaceException {
            V(1, 3);
            writeUInt32(2, i12);
            P(3, f02);
            V(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void T(int i12, AbstractC22934w abstractC22934w) throws OutOfSpaceException {
            V(1, 3);
            writeUInt32(2, i12);
            b(3, abstractC22934w);
            V(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void U(String str) throws OutOfSpaceException {
            long j12 = this.f45608d;
            try {
                if (CodedOutputStream.D(str.length()) == CodedOutputStream.D(str.length() * 3)) {
                    throw null;
                }
                W(L1.d(str));
                throw null;
            } catch (L1.d unused) {
                this.f45608d = j12;
                throw null;
            } catch (IllegalArgumentException e12) {
                throw new OutOfSpaceException(e12);
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(e13);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void V(int i12, int i13) throws OutOfSpaceException {
            W((i12 << 3) | i13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void W(int i12) throws OutOfSpaceException {
            if (this.f45608d <= 0) {
                while ((i12 & (-128)) != 0) {
                    long j12 = this.f45608d;
                    this.f45608d = j12 + 1;
                    K1.o(j12, (byte) ((i12 & 127) | 128));
                    i12 >>>= 7;
                }
                long j13 = this.f45608d;
                this.f45608d = 1 + j13;
                K1.o(j13, (byte) i12);
                return;
            }
            while (true) {
                long j14 = this.f45608d;
                if (j14 >= 0) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f45608d), 0L, 1));
                }
                if ((i12 & (-128)) == 0) {
                    this.f45608d = 1 + j14;
                    K1.o(j14, (byte) i12);
                    return;
                } else {
                    this.f45608d = j14 + 1;
                    K1.o(j14, (byte) ((i12 & 127) | 128));
                    i12 >>>= 7;
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void X(long j12) throws OutOfSpaceException {
            if (this.f45608d <= 0) {
                while ((j12 & (-128)) != 0) {
                    long j13 = this.f45608d;
                    this.f45608d = j13 + 1;
                    K1.o(j13, (byte) ((((int) j12) & 127) | 128));
                    j12 >>>= 7;
                }
                long j14 = this.f45608d;
                this.f45608d = 1 + j14;
                K1.o(j14, (byte) j12);
                return;
            }
            while (true) {
                long j15 = this.f45608d;
                if (j15 >= 0) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f45608d), 0L, 1));
                }
                if ((j12 & (-128)) == 0) {
                    this.f45608d = 1 + j15;
                    K1.o(j15, (byte) j12);
                    return;
                } else {
                    this.f45608d = j15 + 1;
                    K1.o(j15, (byte) ((((int) j12) & 127) | 128));
                    j12 >>>= 7;
                }
            }
        }

        public final void Y(byte[] bArr, int i12, int i13) throws OutOfSpaceException {
            if (bArr != null && i12 >= 0 && i13 >= 0 && bArr.length - i13 >= i12) {
                long j12 = i13;
                long j13 = 0 - j12;
                long j14 = this.f45608d;
                if (j13 >= j14) {
                    K1.f45720d.d(bArr, i12, j14, j12);
                    this.f45608d += j12;
                    return;
                }
            }
            if (bArr != null) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f45608d), 0L, Integer.valueOf(i13)));
            }
            throw new NullPointerException("value");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void b(int i12, AbstractC22934w abstractC22934w) throws OutOfSpaceException {
            V(i12, 2);
            L(abstractC22934w);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22932v
        public final void g(ByteBuffer byteBuffer) throws OutOfSpaceException {
            try {
                byteBuffer.remaining();
                throw null;
            } catch (BufferOverflowException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22932v
        public final void h(byte[] bArr, int i12, int i13) throws OutOfSpaceException {
            Y(bArr, i12, i13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i12, boolean z12) throws OutOfSpaceException {
            V(i12, 0);
            J(z12 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i12, int i13) throws OutOfSpaceException {
            V(i12, 5);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i12, long j12) throws OutOfSpaceException {
            V(i12, 1);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i12, int i13) throws OutOfSpaceException {
            V(i12, 0);
            O(i13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i12, String str) throws OutOfSpaceException {
            V(i12, 2);
            U(str);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i12, int i13) throws OutOfSpaceException {
            V(i12, 0);
            W(i13);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i12, long j12) throws OutOfSpaceException {
            V(i12, 0);
            X(j12);
        }
    }

    public static int A(String str) {
        int length;
        try {
            length = L1.d(str);
        } catch (L1.d unused) {
            length = str.getBytes(C22914m0.f45874a).length;
        }
        return D(length) + length;
    }

    public static int B(int i12) {
        return D(i12 << 3);
    }

    public static int C(int i12, int i13) {
        return D(i13) + B(i12);
    }

    public static int D(int i12) {
        if ((i12 & (-128)) == 0) {
            return 1;
        }
        if ((i12 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i12) == 0) {
            return 3;
        }
        return (i12 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int E(int i12, long j12) {
        return F(j12) + B(i12);
    }

    public static int F(long j12) {
        int i12;
        if (((-128) & j12) == 0) {
            return 1;
        }
        if (j12 < 0) {
            return 10;
        }
        if (((-34359738368L) & j12) != 0) {
            j12 >>>= 28;
            i12 = 6;
        } else {
            i12 = 2;
        }
        if (((-2097152) & j12) != 0) {
            i12 += 2;
            j12 >>>= 14;
        }
        return (j12 & (-16384)) != 0 ? i12 + 1 : i12;
    }

    public static int G(int i12) {
        return (i12 >> 31) ^ (i12 << 1);
    }

    public static long H(long j12) {
        return (j12 >> 63) ^ (j12 << 1);
    }

    public static int i(int i12) {
        return B(i12) + 1;
    }

    public static int j(int i12, AbstractC22934w abstractC22934w) {
        return k(abstractC22934w) + B(i12);
    }

    public static int k(AbstractC22934w abstractC22934w) {
        int size = abstractC22934w.size();
        return D(size) + size;
    }

    public static int l(int i12) {
        return B(i12) + 8;
    }

    public static int m(int i12, int i13) {
        return s(i13) + B(i12);
    }

    public static int n(int i12) {
        return B(i12) + 4;
    }

    public static int o(int i12) {
        return B(i12) + 8;
    }

    public static int p(int i12) {
        return B(i12) + 4;
    }

    @Deprecated
    public static int q(int i12, F0 f02, InterfaceC22897g1 interfaceC22897g1) {
        return ((AbstractC22877a) f02).e(interfaceC22897g1) + (B(i12) * 2);
    }

    public static int r(int i12, int i13) {
        return s(i13) + B(i12);
    }

    public static int s(int i12) {
        if (i12 >= 0) {
            return D(i12);
        }
        return 10;
    }

    public static int t(int i12, long j12) {
        return F(j12) + B(i12);
    }

    public static int u(C22924q0 c22924q0) {
        int size = c22924q0.f45913b != null ? c22924q0.f45913b.size() : c22924q0.f45912a != null ? c22924q0.f45912a.getSerializedSize() : 0;
        return D(size) + size;
    }

    public static int v(int i12) {
        return B(i12) + 4;
    }

    public static int w(int i12) {
        return B(i12) + 8;
    }

    public static int x(int i12, int i13) {
        return D(G(i13)) + B(i12);
    }

    public static int y(int i12, long j12) {
        return F(H(j12)) + B(i12);
    }

    public static int z(int i12, String str) {
        return A(str) + B(i12);
    }

    public final void I(String str, L1.d dVar) throws OutOfSpaceException {
        f45598b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C22914m0.f45874a);
        try {
            W(bytes.length);
            h(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e12) {
            throw e12;
        } catch (IndexOutOfBoundsException e13) {
            throw new OutOfSpaceException(e13);
        }
    }

    public abstract void J(byte b12);

    public abstract void K(int i12, byte[] bArr);

    public abstract void L(AbstractC22934w abstractC22934w);

    public abstract void M(int i12);

    public abstract void N(long j12);

    public abstract void O(int i12);

    public abstract void P(int i12, F0 f02);

    public abstract void Q(int i12, F0 f02, InterfaceC22897g1 interfaceC22897g1);

    public abstract void R(F0 f02);

    public abstract void S(int i12, F0 f02);

    public abstract void T(int i12, AbstractC22934w abstractC22934w);

    public abstract void U(String str);

    public abstract void V(int i12, int i13);

    public abstract void W(int i12);

    public abstract void X(long j12);

    public abstract void b(int i12, AbstractC22934w abstractC22934w);

    public abstract void writeBool(int i12, boolean z12);

    public abstract void writeFixed32(int i12, int i13);

    public abstract void writeFixed64(int i12, long j12);

    public abstract void writeInt32(int i12, int i13);

    public abstract void writeString(int i12, String str);

    public abstract void writeUInt32(int i12, int i13);

    public abstract void writeUInt64(int i12, long j12);

    public CodedOutputStream() {
    }
}
