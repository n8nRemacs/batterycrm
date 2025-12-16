package com.google.protobuf;

import com.google.protobuf.s1;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public abstract class CodedOutputStream extends AbstractC37698s {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f362603b = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f362604c = r1.f362948e;

    /* renamed from: a, reason: collision with root package name */
    public C37712z f362605a;

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
        public final byte[] f362606d;

        /* renamed from: e, reason: collision with root package name */
        public final int f362607e;

        /* renamed from: f, reason: collision with root package name */
        public int f362608f;

        public b(int i12) {
            super();
            if (i12 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i12, 20)];
            this.f362606d = bArr;
            this.f362607e = bArr.length;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int J() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void Z(byte b12) {
            int i12 = this.f362608f;
            this.f362608f = i12 + 1;
            this.f362606d[i12] = b12;
        }

        public final void a0(int i12) {
            int i13 = this.f362608f;
            int i14 = i13 + 1;
            this.f362608f = i14;
            byte[] bArr = this.f362606d;
            bArr[i13] = (byte) (i12 & 255);
            int i15 = i13 + 2;
            this.f362608f = i15;
            bArr[i14] = (byte) ((i12 >> 8) & 255);
            int i16 = i13 + 3;
            this.f362608f = i16;
            bArr[i15] = (byte) ((i12 >> 16) & 255);
            this.f362608f = i13 + 4;
            bArr[i16] = (byte) ((i12 >> 24) & 255);
        }

        public final void b0(long j12) {
            int i12 = this.f362608f;
            int i13 = i12 + 1;
            this.f362608f = i13;
            byte[] bArr = this.f362606d;
            bArr[i12] = (byte) (j12 & 255);
            int i14 = i12 + 2;
            this.f362608f = i14;
            bArr[i13] = (byte) ((j12 >> 8) & 255);
            int i15 = i12 + 3;
            this.f362608f = i15;
            bArr[i14] = (byte) ((j12 >> 16) & 255);
            int i16 = i12 + 4;
            this.f362608f = i16;
            bArr[i15] = (byte) (255 & (j12 >> 24));
            int i17 = i12 + 5;
            this.f362608f = i17;
            bArr[i16] = (byte) (((int) (j12 >> 32)) & 255);
            int i18 = i12 + 6;
            this.f362608f = i18;
            bArr[i17] = (byte) (((int) (j12 >> 40)) & 255);
            int i19 = i12 + 7;
            this.f362608f = i19;
            bArr[i18] = (byte) (((int) (j12 >> 48)) & 255);
            this.f362608f = i12 + 8;
            bArr[i19] = (byte) (((int) (j12 >> 56)) & 255);
        }

        public final void c0(int i12, int i13) {
            d0((i12 << 3) | i13);
        }

        public final void d0(int i12) {
            boolean z12 = CodedOutputStream.f362604c;
            byte[] bArr = this.f362606d;
            if (z12) {
                while ((i12 & (-128)) != 0) {
                    int i13 = this.f362608f;
                    this.f362608f = i13 + 1;
                    r1.q(bArr, i13, (byte) ((i12 & 127) | 128));
                    i12 >>>= 7;
                }
                int i14 = this.f362608f;
                this.f362608f = i14 + 1;
                r1.q(bArr, i14, (byte) i12);
                return;
            }
            while ((i12 & (-128)) != 0) {
                int i15 = this.f362608f;
                this.f362608f = i15 + 1;
                bArr[i15] = (byte) ((i12 & 127) | 128);
                i12 >>>= 7;
            }
            int i16 = this.f362608f;
            this.f362608f = i16 + 1;
            bArr[i16] = (byte) i12;
        }

        public final void e0(long j12) {
            boolean z12 = CodedOutputStream.f362604c;
            byte[] bArr = this.f362606d;
            if (z12) {
                while ((j12 & (-128)) != 0) {
                    int i12 = this.f362608f;
                    this.f362608f = i12 + 1;
                    r1.q(bArr, i12, (byte) ((((int) j12) & 127) | 128));
                    j12 >>>= 7;
                }
                int i13 = this.f362608f;
                this.f362608f = i13 + 1;
                r1.q(bArr, i13, (byte) j12);
                return;
            }
            while ((j12 & (-128)) != 0) {
                int i14 = this.f362608f;
                this.f362608f = i14 + 1;
                bArr[i14] = (byte) ((((int) j12) & 127) | 128);
                j12 >>>= 7;
            }
            int i15 = this.f362608f;
            this.f362608f = i15 + 1;
            bArr[i15] = (byte) j12;
        }
    }

    public static class c extends CodedOutputStream {

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f362609d;

        /* renamed from: e, reason: collision with root package name */
        public final int f362610e;

        /* renamed from: f, reason: collision with root package name */
        public int f362611f;

        public c(byte[] bArr, int i12) {
            super();
            if (((bArr.length - i12) | i12) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i12)));
            }
            this.f362609d = bArr;
            this.f362611f = 0;
            this.f362610e = i12;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int J() {
            return this.f362610e - this.f362611f;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void K(byte b12) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f362609d;
                int i12 = this.f362611f;
                this.f362611f = i12 + 1;
                bArr[i12] = b12;
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f362611f), Integer.valueOf(this.f362610e), 1), e12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void L(int i12, byte[] bArr) throws OutOfSpaceException {
            X(i12);
            Z(bArr, 0, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void M(AbstractC37700t abstractC37700t) throws OutOfSpaceException {
            X(abstractC37700t.size());
            abstractC37700t.O(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void N(int i12) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f362609d;
                int i13 = this.f362611f;
                int i14 = i13 + 1;
                this.f362611f = i14;
                bArr[i13] = (byte) (i12 & 255);
                int i15 = i13 + 2;
                this.f362611f = i15;
                bArr[i14] = (byte) ((i12 >> 8) & 255);
                int i16 = i13 + 3;
                this.f362611f = i16;
                bArr[i15] = (byte) ((i12 >> 16) & 255);
                this.f362611f = i13 + 4;
                bArr[i16] = (byte) ((i12 >> 24) & 255);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f362611f), Integer.valueOf(this.f362610e), 1), e12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void O(long j12) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f362609d;
                int i12 = this.f362611f;
                int i13 = i12 + 1;
                this.f362611f = i13;
                bArr[i12] = (byte) (((int) j12) & 255);
                int i14 = i12 + 2;
                this.f362611f = i14;
                bArr[i13] = (byte) (((int) (j12 >> 8)) & 255);
                int i15 = i12 + 3;
                this.f362611f = i15;
                bArr[i14] = (byte) (((int) (j12 >> 16)) & 255);
                int i16 = i12 + 4;
                this.f362611f = i16;
                bArr[i15] = (byte) (((int) (j12 >> 24)) & 255);
                int i17 = i12 + 5;
                this.f362611f = i17;
                bArr[i16] = (byte) (((int) (j12 >> 32)) & 255);
                int i18 = i12 + 6;
                this.f362611f = i18;
                bArr[i17] = (byte) (((int) (j12 >> 40)) & 255);
                int i19 = i12 + 7;
                this.f362611f = i19;
                bArr[i18] = (byte) (((int) (j12 >> 48)) & 255);
                this.f362611f = i12 + 8;
                bArr[i19] = (byte) (((int) (j12 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f362611f), Integer.valueOf(this.f362610e), 1), e12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void P(int i12) throws OutOfSpaceException {
            if (i12 >= 0) {
                X(i12);
            } else {
                Y(i12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Q(int i12, InterfaceC37707w0 interfaceC37707w0) throws OutOfSpaceException {
            W(i12, 2);
            S(interfaceC37707w0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void R(int i12, InterfaceC37707w0 interfaceC37707w0, T0 t02) throws OutOfSpaceException {
            W(i12, 2);
            X(((AbstractC37663a) interfaceC37707w0).getSerializedSize(t02));
            t02.b(interfaceC37707w0, this.f362605a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void S(InterfaceC37707w0 interfaceC37707w0) throws OutOfSpaceException {
            X(interfaceC37707w0.getSerializedSize());
            interfaceC37707w0.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void T(int i12, InterfaceC37707w0 interfaceC37707w0) throws OutOfSpaceException {
            W(1, 3);
            writeUInt32(2, i12);
            Q(3, interfaceC37707w0);
            W(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void U(int i12, AbstractC37700t abstractC37700t) throws OutOfSpaceException {
            W(1, 3);
            writeUInt32(2, i12);
            a(3, abstractC37700t);
            W(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void V(String str) throws OutOfSpaceException {
            int i12 = this.f362611f;
            try {
                int iD2 = CodedOutputStream.D(str.length() * 3);
                int iD3 = CodedOutputStream.D(str.length());
                byte[] bArr = this.f362609d;
                if (iD3 == iD2) {
                    int i13 = i12 + iD3;
                    this.f362611f = i13;
                    int iD4 = s1.f362953a.d(i13, J(), str, bArr);
                    this.f362611f = i12;
                    X((iD4 - i12) - iD3);
                    this.f362611f = iD4;
                } else {
                    X(s1.d(str));
                    this.f362611f = s1.f362953a.d(this.f362611f, J(), str, bArr);
                }
            } catch (s1.d e12) {
                this.f362611f = i12;
                I(str, e12);
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(e13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void W(int i12, int i13) throws OutOfSpaceException {
            X((i12 << 3) | i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void X(int i12) throws OutOfSpaceException {
            while (true) {
                int i13 = i12 & (-128);
                byte[] bArr = this.f362609d;
                if (i13 == 0) {
                    int i14 = this.f362611f;
                    this.f362611f = i14 + 1;
                    bArr[i14] = (byte) i12;
                    return;
                } else {
                    try {
                        int i15 = this.f362611f;
                        this.f362611f = i15 + 1;
                        bArr[i15] = (byte) ((i12 & 127) | 128);
                        i12 >>>= 7;
                    } catch (IndexOutOfBoundsException e12) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f362611f), Integer.valueOf(this.f362610e), 1), e12);
                    }
                }
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f362611f), Integer.valueOf(this.f362610e), 1), e12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Y(long j12) throws OutOfSpaceException {
            boolean z12 = CodedOutputStream.f362604c;
            byte[] bArr = this.f362609d;
            if (z12 && J() >= 10) {
                while ((j12 & (-128)) != 0) {
                    int i12 = this.f362611f;
                    this.f362611f = i12 + 1;
                    r1.q(bArr, i12, (byte) ((((int) j12) & 127) | 128));
                    j12 >>>= 7;
                }
                int i13 = this.f362611f;
                this.f362611f = i13 + 1;
                r1.q(bArr, i13, (byte) j12);
                return;
            }
            while ((j12 & (-128)) != 0) {
                try {
                    int i14 = this.f362611f;
                    this.f362611f = i14 + 1;
                    bArr[i14] = (byte) ((((int) j12) & 127) | 128);
                    j12 >>>= 7;
                } catch (IndexOutOfBoundsException e12) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f362611f), Integer.valueOf(this.f362610e), 1), e12);
                }
            }
            int i15 = this.f362611f;
            this.f362611f = i15 + 1;
            bArr[i15] = (byte) j12;
        }

        public final void Z(byte[] bArr, int i12, int i13) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i12, this.f362609d, this.f362611f, i13);
                this.f362611f += i13;
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f362611f), Integer.valueOf(this.f362610e), Integer.valueOf(i13)), e12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void a(int i12, AbstractC37700t abstractC37700t) throws OutOfSpaceException {
            W(i12, 2);
            M(abstractC37700t);
        }

        @Override // com.google.protobuf.AbstractC37698s
        public final void g(ByteBuffer byteBuffer) throws OutOfSpaceException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f362609d, this.f362611f, iRemaining);
                this.f362611f += iRemaining;
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f362611f), Integer.valueOf(this.f362610e), Integer.valueOf(iRemaining)), e12);
            }
        }

        @Override // com.google.protobuf.AbstractC37698s
        public final void h(byte[] bArr, int i12, int i13) throws OutOfSpaceException {
            Z(bArr, i12, i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBool(int i12, boolean z12) throws OutOfSpaceException {
            W(i12, 0);
            K(z12 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32(int i12, int i13) throws OutOfSpaceException {
            W(i12, 5);
            N(i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64(int i12, long j12) throws OutOfSpaceException {
            W(i12, 1);
            O(j12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32(int i12, int i13) throws OutOfSpaceException {
            W(i12, 0);
            P(i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeString(int i12, String str) throws OutOfSpaceException {
            W(i12, 2);
            V(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32(int i12, int i13) throws OutOfSpaceException {
            W(i12, 0);
            X(i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64(int i12, long j12) throws OutOfSpaceException {
            W(i12, 0);
            Y(j12);
        }
    }

    public static final class d extends b {
        @Override // com.google.protobuf.CodedOutputStream
        public final void K(byte b12) {
            if (this.f362608f == this.f362607e) {
                throw null;
            }
            Z(b12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void L(int i12, byte[] bArr) {
            X(i12);
            if (this.f362608f > 0) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void M(AbstractC37700t abstractC37700t) {
            X(abstractC37700t.size());
            abstractC37700t.O(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void N(int i12) {
            f0(4);
            a0(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void O(long j12) {
            f0(8);
            b0(j12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void P(int i12) {
            if (i12 >= 0) {
                X(i12);
            } else {
                Y(i12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Q(int i12, InterfaceC37707w0 interfaceC37707w0) {
            W(i12, 2);
            S(interfaceC37707w0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void R(int i12, InterfaceC37707w0 interfaceC37707w0, T0 t02) {
            W(i12, 2);
            X(((AbstractC37663a) interfaceC37707w0).getSerializedSize(t02));
            t02.b(interfaceC37707w0, this.f362605a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void S(InterfaceC37707w0 interfaceC37707w0) {
            X(interfaceC37707w0.getSerializedSize());
            interfaceC37707w0.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void T(int i12, InterfaceC37707w0 interfaceC37707w0) {
            W(1, 3);
            writeUInt32(2, i12);
            Q(3, interfaceC37707w0);
            W(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void U(int i12, AbstractC37700t abstractC37700t) {
            W(1, 3);
            writeUInt32(2, i12);
            a(3, abstractC37700t);
            W(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void V(String str) throws OutOfSpaceException {
            int length = str.length() * 3;
            int iD2 = CodedOutputStream.D(length);
            int i12 = iD2 + length;
            int i13 = this.f362607e;
            if (i12 > i13) {
                X(s1.f362953a.d(0, length, str, new byte[length]));
                if (this.f362608f > 0) {
                    throw null;
                }
                throw null;
            }
            int i14 = this.f362608f;
            if (i12 > i13 - i14) {
                throw null;
            }
            try {
                int iD3 = CodedOutputStream.D(str.length());
                byte[] bArr = this.f362606d;
                if (iD3 == iD2) {
                    int i15 = i14 + iD3;
                    this.f362608f = i15;
                    int iD4 = s1.f362953a.d(i15, i13 - i15, str, bArr);
                    this.f362608f = i14;
                    d0((iD4 - i14) - iD3);
                    this.f362608f = iD4;
                } else {
                    int iD5 = s1.d(str);
                    d0(iD5);
                    this.f362608f = s1.f362953a.d(this.f362608f, iD5, str, bArr);
                }
            } catch (s1.d e12) {
                this.f362608f = i14;
                I(str, e12);
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(e13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void W(int i12, int i13) {
            X((i12 << 3) | i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void X(int i12) {
            f0(5);
            d0(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Y(long j12) {
            f0(10);
            e0(j12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void a(int i12, AbstractC37700t abstractC37700t) {
            W(i12, 2);
            M(abstractC37700t);
        }

        public final void f0(int i12) {
            if (this.f362607e - this.f362608f < i12) {
                throw null;
            }
        }

        @Override // com.google.protobuf.AbstractC37698s
        public final void g(ByteBuffer byteBuffer) {
            if (this.f362608f > 0) {
                throw null;
            }
            byteBuffer.remaining();
            throw null;
        }

        @Override // com.google.protobuf.AbstractC37698s
        public final void h(byte[] bArr, int i12, int i13) {
            if (this.f362608f > 0) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBool(int i12, boolean z12) {
            f0(11);
            c0(i12, 0);
            Z(z12 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32(int i12, int i13) {
            f0(14);
            c0(i12, 5);
            a0(i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64(int i12, long j12) {
            f0(18);
            c0(i12, 1);
            b0(j12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32(int i12, int i13) {
            f0(20);
            c0(i12, 0);
            if (i13 >= 0) {
                d0(i13);
            } else {
                e0(i13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeString(int i12, String str) throws OutOfSpaceException {
            W(i12, 2);
            V(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32(int i12, int i13) {
            f0(20);
            c0(i12, 0);
            d0(i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64(int i12, long j12) {
            f0(20);
            c0(i12, 0);
            e0(j12);
        }
    }

    public static final class e extends c {
    }

    public static final class f extends b {

        /* renamed from: g, reason: collision with root package name */
        public final OutputStream f362612g;

        public f(OutputStream outputStream, int i12) {
            super(i12);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f362612g = outputStream;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void K(byte b12) {
            if (this.f362608f == this.f362607e) {
                f0();
            }
            Z(b12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void L(int i12, byte[] bArr) throws IOException {
            X(i12);
            h0(bArr, 0, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void M(AbstractC37700t abstractC37700t) {
            X(abstractC37700t.size());
            abstractC37700t.O(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void N(int i12) {
            g0(4);
            a0(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void O(long j12) {
            g0(8);
            b0(j12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void P(int i12) {
            if (i12 >= 0) {
                X(i12);
            } else {
                Y(i12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Q(int i12, InterfaceC37707w0 interfaceC37707w0) {
            W(i12, 2);
            S(interfaceC37707w0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void R(int i12, InterfaceC37707w0 interfaceC37707w0, T0 t02) {
            W(i12, 2);
            X(((AbstractC37663a) interfaceC37707w0).getSerializedSize(t02));
            t02.b(interfaceC37707w0, this.f362605a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void S(InterfaceC37707w0 interfaceC37707w0) {
            X(interfaceC37707w0.getSerializedSize());
            interfaceC37707w0.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void T(int i12, InterfaceC37707w0 interfaceC37707w0) {
            W(1, 3);
            writeUInt32(2, i12);
            Q(3, interfaceC37707w0);
            W(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void U(int i12, AbstractC37700t abstractC37700t) {
            W(1, 3);
            writeUInt32(2, i12);
            a(3, abstractC37700t);
            W(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void V(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int iD2 = CodedOutputStream.D(length);
                int i12 = iD2 + length;
                int i13 = this.f362607e;
                if (i12 > i13) {
                    byte[] bArr = new byte[length];
                    int iD3 = s1.f362953a.d(0, length, str, bArr);
                    X(iD3);
                    h0(bArr, 0, iD3);
                    return;
                }
                if (i12 > i13 - this.f362608f) {
                    f0();
                }
                int iD4 = CodedOutputStream.D(str.length());
                int i14 = this.f362608f;
                byte[] bArr2 = this.f362606d;
                try {
                    if (iD4 == iD2) {
                        int i15 = i14 + iD4;
                        this.f362608f = i15;
                        int iD5 = s1.f362953a.d(i15, i13 - i15, str, bArr2);
                        this.f362608f = i14;
                        d0((iD5 - i14) - iD4);
                        this.f362608f = iD5;
                    } else {
                        int iD6 = s1.d(str);
                        d0(iD6);
                        this.f362608f = s1.f362953a.d(this.f362608f, iD6, str, bArr2);
                    }
                } catch (s1.d e12) {
                    this.f362608f = i14;
                    throw e12;
                } catch (ArrayIndexOutOfBoundsException e13) {
                    throw new OutOfSpaceException(e13);
                }
            } catch (s1.d e14) {
                I(str, e14);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void W(int i12, int i13) {
            X((i12 << 3) | i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void X(int i12) {
            g0(5);
            d0(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Y(long j12) {
            g0(10);
            e0(j12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void a(int i12, AbstractC37700t abstractC37700t) {
            W(i12, 2);
            M(abstractC37700t);
        }

        public final void f0() {
            this.f362612g.write(this.f362606d, 0, this.f362608f);
            this.f362608f = 0;
        }

        @Override // com.google.protobuf.AbstractC37698s
        public final void g(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i12 = this.f362608f;
            int i13 = this.f362607e;
            int i14 = i13 - i12;
            byte[] bArr = this.f362606d;
            if (i14 >= iRemaining) {
                byteBuffer.get(bArr, i12, iRemaining);
                this.f362608f += iRemaining;
                return;
            }
            byteBuffer.get(bArr, i12, i14);
            int i15 = iRemaining - i14;
            this.f362608f = i13;
            f0();
            while (i15 > i13) {
                byteBuffer.get(bArr, 0, i13);
                this.f362612g.write(bArr, 0, i13);
                i15 -= i13;
            }
            byteBuffer.get(bArr, 0, i15);
            this.f362608f = i15;
        }

        public final void g0(int i12) {
            if (this.f362607e - this.f362608f < i12) {
                f0();
            }
        }

        @Override // com.google.protobuf.AbstractC37698s
        public final void h(byte[] bArr, int i12, int i13) throws IOException {
            h0(bArr, i12, i13);
        }

        public final void h0(byte[] bArr, int i12, int i13) throws IOException {
            int i14 = this.f362608f;
            int i15 = this.f362607e;
            int i16 = i15 - i14;
            byte[] bArr2 = this.f362606d;
            if (i16 >= i13) {
                System.arraycopy(bArr, i12, bArr2, i14, i13);
                this.f362608f += i13;
                return;
            }
            System.arraycopy(bArr, i12, bArr2, i14, i16);
            int i17 = i12 + i16;
            int i18 = i13 - i16;
            this.f362608f = i15;
            f0();
            if (i18 > i15) {
                this.f362612g.write(bArr, i17, i18);
            } else {
                System.arraycopy(bArr, i17, bArr2, 0, i18);
                this.f362608f = i18;
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBool(int i12, boolean z12) {
            g0(11);
            c0(i12, 0);
            Z(z12 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32(int i12, int i13) {
            g0(14);
            c0(i12, 5);
            a0(i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64(int i12, long j12) {
            g0(18);
            c0(i12, 1);
            b0(j12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32(int i12, int i13) {
            g0(20);
            c0(i12, 0);
            if (i13 >= 0) {
                d0(i13);
            } else {
                e0(i13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeString(int i12, String str) throws IOException {
            W(i12, 2);
            V(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32(int i12, int i13) {
            g0(20);
            c0(i12, 0);
            d0(i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64(int i12, long j12) {
            g0(20);
            c0(i12, 0);
            e0(j12);
        }
    }

    public static final class g extends CodedOutputStream {
        @Override // com.google.protobuf.CodedOutputStream
        public final int J() {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void K(byte b12) {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void L(int i12, byte[] bArr) {
            X(i12);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void M(AbstractC37700t abstractC37700t) {
            X(abstractC37700t.size());
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void N(int i12) {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void O(long j12) {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void P(int i12) {
            if (i12 >= 0) {
                X(i12);
                throw null;
            }
            Y(i12);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Q(int i12, InterfaceC37707w0 interfaceC37707w0) {
            W(i12, 2);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void R(int i12, InterfaceC37707w0 interfaceC37707w0, T0 t02) {
            W(i12, 2);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void S(InterfaceC37707w0 interfaceC37707w0) {
            X(interfaceC37707w0.getSerializedSize());
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void T(int i12, InterfaceC37707w0 interfaceC37707w0) {
            W(1, 3);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void U(int i12, AbstractC37700t abstractC37700t) {
            W(1, 3);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void V(String str) {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void W(int i12, int i13) {
            X((i12 << 3) | i13);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void X(int i12) {
            if ((i12 & (-128)) != 0) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Y(long j12) {
            if ((j12 & (-128)) != 0) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void a(int i12, AbstractC37700t abstractC37700t) {
            W(i12, 2);
            throw null;
        }

        @Override // com.google.protobuf.AbstractC37698s
        public final void g(ByteBuffer byteBuffer) {
            throw null;
        }

        @Override // com.google.protobuf.AbstractC37698s
        public final void h(byte[] bArr, int i12, int i13) {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBool(int i12, boolean z12) {
            W(i12, 0);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32(int i12, int i13) {
            W(i12, 5);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64(int i12, long j12) {
            W(i12, 1);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32(int i12, int i13) {
            W(i12, 0);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeString(int i12, String str) {
            W(i12, 2);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32(int i12, int i13) {
            W(i12, 0);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64(int i12, long j12) {
            W(i12, 0);
            throw null;
        }
    }

    public static final class h extends CodedOutputStream {

        /* renamed from: d, reason: collision with root package name */
        public long f362613d;

        @Override // com.google.protobuf.CodedOutputStream
        public final int J() {
            return (int) (0 - this.f362613d);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void K(byte b12) throws OutOfSpaceException {
            long j12 = this.f362613d;
            if (j12 >= 0) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f362613d), 0L, 1));
            }
            this.f362613d = 1 + j12;
            r1.p(j12, b12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void L(int i12, byte[] bArr) throws OutOfSpaceException {
            X(i12);
            Z(bArr, 0, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void M(AbstractC37700t abstractC37700t) throws OutOfSpaceException {
            X(abstractC37700t.size());
            abstractC37700t.O(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void N(int i12) {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void O(long j12) {
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void P(int i12) throws OutOfSpaceException {
            if (i12 >= 0) {
                X(i12);
            } else {
                Y(i12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Q(int i12, InterfaceC37707w0 interfaceC37707w0) throws OutOfSpaceException {
            W(i12, 2);
            S(interfaceC37707w0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void R(int i12, InterfaceC37707w0 interfaceC37707w0, T0 t02) throws OutOfSpaceException {
            W(i12, 2);
            X(((AbstractC37663a) interfaceC37707w0).getSerializedSize(t02));
            t02.b(interfaceC37707w0, this.f362605a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void S(InterfaceC37707w0 interfaceC37707w0) throws OutOfSpaceException {
            X(interfaceC37707w0.getSerializedSize());
            interfaceC37707w0.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void T(int i12, InterfaceC37707w0 interfaceC37707w0) throws OutOfSpaceException {
            W(1, 3);
            writeUInt32(2, i12);
            Q(3, interfaceC37707w0);
            W(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void U(int i12, AbstractC37700t abstractC37700t) throws OutOfSpaceException {
            W(1, 3);
            writeUInt32(2, i12);
            a(3, abstractC37700t);
            W(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void V(String str) throws OutOfSpaceException {
            long j12 = this.f362613d;
            try {
                if (CodedOutputStream.D(str.length()) == CodedOutputStream.D(str.length() * 3)) {
                    throw null;
                }
                X(s1.d(str));
                throw null;
            } catch (s1.d unused) {
                this.f362613d = j12;
                throw null;
            } catch (IllegalArgumentException e12) {
                throw new OutOfSpaceException(e12);
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(e13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void W(int i12, int i13) throws OutOfSpaceException {
            X((i12 << 3) | i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void X(int i12) throws OutOfSpaceException {
            if (this.f362613d <= 0) {
                while ((i12 & (-128)) != 0) {
                    long j12 = this.f362613d;
                    this.f362613d = j12 + 1;
                    r1.p(j12, (byte) ((i12 & 127) | 128));
                    i12 >>>= 7;
                }
                long j13 = this.f362613d;
                this.f362613d = 1 + j13;
                r1.p(j13, (byte) i12);
                return;
            }
            while (true) {
                long j14 = this.f362613d;
                if (j14 >= 0) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f362613d), 0L, 1));
                }
                if ((i12 & (-128)) == 0) {
                    this.f362613d = 1 + j14;
                    r1.p(j14, (byte) i12);
                    return;
                } else {
                    this.f362613d = j14 + 1;
                    r1.p(j14, (byte) ((i12 & 127) | 128));
                    i12 >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Y(long j12) throws OutOfSpaceException {
            if (this.f362613d <= 0) {
                while ((j12 & (-128)) != 0) {
                    long j13 = this.f362613d;
                    this.f362613d = j13 + 1;
                    r1.p(j13, (byte) ((((int) j12) & 127) | 128));
                    j12 >>>= 7;
                }
                long j14 = this.f362613d;
                this.f362613d = 1 + j14;
                r1.p(j14, (byte) j12);
                return;
            }
            while (true) {
                long j15 = this.f362613d;
                if (j15 >= 0) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f362613d), 0L, 1));
                }
                if ((j12 & (-128)) == 0) {
                    this.f362613d = 1 + j15;
                    r1.p(j15, (byte) j12);
                    return;
                } else {
                    this.f362613d = j15 + 1;
                    r1.p(j15, (byte) ((((int) j12) & 127) | 128));
                    j12 >>>= 7;
                }
            }
        }

        public final void Z(byte[] bArr, int i12, int i13) throws OutOfSpaceException {
            if (bArr != null && i12 >= 0 && i13 >= 0 && bArr.length - i13 >= i12) {
                long j12 = i13;
                long j13 = 0 - j12;
                long j14 = this.f362613d;
                if (j13 >= j14) {
                    r1.f362946c.d(bArr, i12, j14, j12);
                    this.f362613d += j12;
                    return;
                }
            }
            if (bArr != null) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f362613d), 0L, Integer.valueOf(i13)));
            }
            throw new NullPointerException("value");
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void a(int i12, AbstractC37700t abstractC37700t) throws OutOfSpaceException {
            W(i12, 2);
            M(abstractC37700t);
        }

        @Override // com.google.protobuf.AbstractC37698s
        public final void g(ByteBuffer byteBuffer) throws OutOfSpaceException {
            try {
                byteBuffer.remaining();
                throw null;
            } catch (BufferOverflowException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // com.google.protobuf.AbstractC37698s
        public final void h(byte[] bArr, int i12, int i13) throws OutOfSpaceException {
            Z(bArr, i12, i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBool(int i12, boolean z12) throws OutOfSpaceException {
            W(i12, 0);
            K(z12 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32(int i12, int i13) throws OutOfSpaceException {
            W(i12, 5);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64(int i12, long j12) throws OutOfSpaceException {
            W(i12, 1);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32(int i12, int i13) throws OutOfSpaceException {
            W(i12, 0);
            P(i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeString(int i12, String str) throws OutOfSpaceException {
            W(i12, 2);
            V(str);
            throw null;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32(int i12, int i13) throws OutOfSpaceException {
            W(i12, 0);
            X(i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64(int i12, long j12) throws OutOfSpaceException {
            W(i12, 0);
            Y(j12);
        }
    }

    public static int A(String str) {
        int length;
        try {
            length = s1.d(str);
        } catch (s1.d unused) {
            length = str.getBytes(C37670d0.f362857a).length;
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

    public static int j(int i12, AbstractC37700t abstractC37700t) {
        return k(abstractC37700t) + B(i12);
    }

    public static int k(AbstractC37700t abstractC37700t) {
        int size = abstractC37700t.size();
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
    public static int q(int i12, InterfaceC37707w0 interfaceC37707w0, T0 t02) {
        return ((AbstractC37663a) interfaceC37707w0).getSerializedSize(t02) + (B(i12) * 2);
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

    public static int u(C37680i0 c37680i0) {
        int size = c37680i0.f362880b != null ? c37680i0.f362880b.size() : c37680i0.f362879a != null ? c37680i0.f362879a.getSerializedSize() : 0;
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

    public final void I(String str, s1.d dVar) throws OutOfSpaceException {
        f362603b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C37670d0.f362857a);
        try {
            X(bytes.length);
            h(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e12) {
            throw new OutOfSpaceException(e12);
        }
    }

    public abstract int J();

    public abstract void K(byte b12);

    public abstract void L(int i12, byte[] bArr);

    public abstract void M(AbstractC37700t abstractC37700t);

    public abstract void N(int i12);

    public abstract void O(long j12);

    public abstract void P(int i12);

    public abstract void Q(int i12, InterfaceC37707w0 interfaceC37707w0);

    public abstract void R(int i12, InterfaceC37707w0 interfaceC37707w0, T0 t02);

    public abstract void S(InterfaceC37707w0 interfaceC37707w0);

    public abstract void T(int i12, InterfaceC37707w0 interfaceC37707w0);

    public abstract void U(int i12, AbstractC37700t abstractC37700t);

    public abstract void V(String str);

    public abstract void W(int i12, int i13);

    public abstract void X(int i12);

    public abstract void Y(long j12);

    public abstract void a(int i12, AbstractC37700t abstractC37700t);

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
