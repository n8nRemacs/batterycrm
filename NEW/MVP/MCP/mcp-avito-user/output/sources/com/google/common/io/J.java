package com.google.common.io;

import aZ0.InterfaceC19845a;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;

/* compiled from: LittleEndianDataInputStream.java */
@XY0.c
@InterfaceC37521x
@XY0.d
/* loaded from: classes6.dex */
public final class J extends FilterInputStream implements DataInput {
    public final byte a() throws IOException {
        int i12 = ((FilterInputStream) this).in.read();
        if (-1 != i12) {
            return (byte) i12;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    @InterfaceC19845a
    public final boolean readBoolean() {
        return readUnsignedByte() != 0;
    }

    @Override // java.io.DataInput
    @InterfaceC19845a
    public final byte readByte() {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    @InterfaceC19845a
    public final char readChar() {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @InterfaceC19845a
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    @InterfaceC19845a
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        int i12 = C37512n.f360331a;
        C37512n.b(this, bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    @InterfaceC19845a
    public final int readInt() throws IOException {
        byte bA2 = a();
        byte bA3 = a();
        return com.google.common.primitives.l.d(a(), a(), bA3, bA2);
    }

    @Override // java.io.DataInput
    @InterfaceC19845a
    @aZ0.e
    public final String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    @InterfaceC19845a
    public final long readLong() throws IOException {
        byte bA2 = a();
        byte bA3 = a();
        byte bA4 = a();
        byte bA5 = a();
        byte bA6 = a();
        byte bA7 = a();
        return com.google.common.primitives.n.a(a(), a(), bA7, bA6, bA5, bA4, bA3, bA2);
    }

    @Override // java.io.DataInput
    @InterfaceC19845a
    public final short readShort() {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @InterfaceC19845a
    public final String readUTF() {
        return new DataInputStream(((FilterInputStream) this).in).readUTF();
    }

    @Override // java.io.DataInput
    @InterfaceC19845a
    public final int readUnsignedByte() throws IOException {
        int i12 = ((FilterInputStream) this).in.read();
        if (i12 >= 0) {
            return i12;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    @InterfaceC19845a
    public final int readUnsignedShort() throws IOException {
        return com.google.common.primitives.l.d((byte) 0, (byte) 0, a(), a());
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i12) {
        return (int) ((FilterInputStream) this).in.skip(i12);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i12, int i13) {
        C37512n.b(this, bArr, i12, i13);
    }
}
