package com.google.common.io;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* compiled from: LittleEndianDataOutputStream.java */
@XY0.c
@InterfaceC37521x
@XY0.d
/* loaded from: classes6.dex */
public final class K extends FilterOutputStream implements DataOutput {
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public final void write(byte[] bArr, int i12, int i13) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i12, i13);
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z12) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBoolean(z12);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i12) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeByte(i12);
    }

    @Override // java.io.DataOutput
    @Deprecated
    public final void writeBytes(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBytes(str);
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i12) throws IOException {
        writeShort(i12);
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) throws IOException {
        for (int i12 = 0; i12 < str.length(); i12++) {
            writeShort(str.charAt(i12));
        }
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d12) throws IOException {
        writeLong(Double.doubleToLongBits(d12));
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f12) throws IOException {
        writeInt(Float.floatToIntBits(f12));
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i12) throws IOException {
        ((FilterOutputStream) this).out.write(i12 & 255);
        ((FilterOutputStream) this).out.write((i12 >> 8) & 255);
        ((FilterOutputStream) this).out.write((i12 >> 16) & 255);
        ((FilterOutputStream) this).out.write((i12 >> 24) & 255);
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j12) throws IOException {
        long jReverseBytes = Long.reverseBytes(j12);
        byte[] bArr = new byte[8];
        for (int i12 = 7; i12 >= 0; i12--) {
            bArr[i12] = (byte) (255 & jReverseBytes);
            jReverseBytes >>= 8;
        }
        write(bArr, 0, 8);
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i12) throws IOException {
        ((FilterOutputStream) this).out.write(i12 & 255);
        ((FilterOutputStream) this).out.write((i12 >> 8) & 255);
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeUTF(str);
    }
}
