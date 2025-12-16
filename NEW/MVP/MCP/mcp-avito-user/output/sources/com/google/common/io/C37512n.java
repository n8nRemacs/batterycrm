package com.google.common.io;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: ByteStreams.java */
@XY0.c
@InterfaceC37521x
@XY0.d
/* renamed from: com.google.common.io.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37512n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f360331a = 0;

    /* compiled from: ByteStreams.java */
    /* renamed from: com.google.common.io.n$a */
    public class a extends OutputStream {
        public final String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i12) {
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            bArr.getClass();
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i12, int i13) {
            bArr.getClass();
            com.google.common.base.M.l(i12, i13 + i12, bArr.length);
        }
    }

    /* compiled from: ByteStreams.java */
    /* renamed from: com.google.common.io.n$b */
    public static class b implements InterfaceC37507i {
        @Override // java.io.DataInput
        public final boolean readBoolean() {
            throw null;
        }

        @Override // java.io.DataInput
        public final byte readByte() {
            throw null;
        }

        @Override // java.io.DataInput
        public final char readChar() {
            throw null;
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            throw null;
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            throw null;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) {
            throw null;
        }

        @Override // java.io.DataInput
        public final int readInt() {
            throw null;
        }

        @Override // java.io.DataInput
        @I41.a
        public final String readLine() {
            throw null;
        }

        @Override // java.io.DataInput
        public final long readLong() {
            throw null;
        }

        @Override // java.io.DataInput
        public final short readShort() {
            throw null;
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            throw null;
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            throw null;
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() {
            throw null;
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i12) {
            throw null;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i12, int i13) {
            throw null;
        }
    }

    /* compiled from: ByteStreams.java */
    /* renamed from: com.google.common.io.n$c */
    public static class c implements InterfaceC37508j {
        @Override // java.io.DataOutput
        public final void write(int i12) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeBoolean(boolean z12) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeByte(int i12) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeBytes(String str) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeChar(int i12) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeChars(String str) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeDouble(double d12) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeFloat(float f12) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeInt(int i12) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeLong(long j12) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeShort(int i12) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void writeUTF(String str) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void write(byte[] bArr) {
            throw null;
        }

        @Override // java.io.DataOutput
        public final void write(byte[] bArr, int i12, int i13) {
            throw null;
        }
    }

    static {
        new a();
    }

    public static byte[] a(ArrayDeque arrayDeque, int i12) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i12) {
            return bArr;
        }
        int length = i12 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i12);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i12 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static void b(J j12, byte[] bArr, int i12, int i13) {
        bArr.getClass();
        if (i13 < 0) {
            throw new IndexOutOfBoundsException(androidx.camera.camera2.internal.G.e(i13, "len (", ") cannot be negative"));
        }
        com.google.common.base.M.l(i12, i12 + i13, bArr.length);
        int i14 = 0;
        while (i14 < i13) {
            int i15 = j12.read(bArr, i12 + i14, i13 - i14);
            if (i15 == -1) {
                break;
            } else {
                i14 += i15;
            }
        }
        if (i14 != i13) {
            throw new EOFException(androidx.appcompat.app.r.l(i14, i13, "reached end of stream after reading ", " bytes; ", " bytes expected"));
        }
    }

    public static byte[] c(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i12 = 0;
        while (i12 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i12);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i13 = 0;
            while (i13 < iMin2) {
                int i14 = inputStream.read(bArr, i13, iMin2 - i13);
                if (i14 == -1) {
                    return a(arrayDeque, i12);
                }
                i13 += i14;
                i12 += i14;
            }
            iMin = com.google.common.primitives.l.f(iMin * (iMin < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* compiled from: ByteStreams.java */
    /* renamed from: com.google.common.io.n$d */
    public static final class d extends FilterInputStream {

        /* renamed from: b, reason: collision with root package name */
        public long f360332b;

        /* renamed from: c, reason: collision with root package name */
        public long f360333c;

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f360332b);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void mark(int i12) {
            ((FilterInputStream) this).in.mark(i12);
            this.f360333c = this.f360332b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            if (this.f360332b == 0) {
                return -1;
            }
            int i12 = ((FilterInputStream) this).in.read();
            if (i12 != -1) {
                this.f360332b--;
            }
            return i12;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f360333c == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f360332b = this.f360333c;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final long skip(long j12) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j12, this.f360332b));
            this.f360332b -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i12, int i13) throws IOException {
            long j12 = this.f360332b;
            if (j12 == 0) {
                return -1;
            }
            int i14 = ((FilterInputStream) this).in.read(bArr, i12, (int) Math.min(i13, j12));
            if (i14 != -1) {
                this.f360332b -= i14;
            }
            return i14;
        }
    }
}
