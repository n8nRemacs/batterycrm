package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import shark.AndroidResourceIdNames;

/* compiled from: UTF8Writer.java */
/* loaded from: classes3.dex */
public final class p extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public OutputStream f341202b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f341203c;

    /* renamed from: d, reason: collision with root package name */
    public int f341204d;

    /* renamed from: e, reason: collision with root package name */
    public int f341205e;

    public static void b(int i12) throws IOException {
        throw new IOException(c(i12));
    }

    public static String c(int i12) {
        if (i12 > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i12) + ") to output; max is 0x10FFFF as per RFC 4627";
        }
        if (i12 < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i12) + ") to output";
        }
        if (i12 <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i12) + ")";
        }
        return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i12) + ")";
    }

    public final int a(int i12) throws IOException {
        int i13 = this.f341205e;
        this.f341205e = 0;
        if (i12 >= 56320 && i12 <= 57343) {
            return (i12 - 56320) + ((i13 - 55296) << 10) + AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i13) + ", second 0x" + Integer.toHexString(i12) + "; illegal combination");
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c12) throws IOException {
        write(c12);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OutputStream outputStream = this.f341202b;
        if (outputStream != null) {
            int i12 = this.f341204d;
            if (i12 > 0) {
                outputStream.write(this.f341203c, 0, i12);
                this.f341204d = 0;
            }
            OutputStream outputStream2 = this.f341202b;
            this.f341202b = null;
            if (this.f341203c != null) {
                this.f341203c = null;
                throw null;
            }
            outputStream2.close();
            int i13 = this.f341205e;
            this.f341205e = 0;
            if (i13 <= 0) {
                return;
            }
            b(i13);
            throw null;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        OutputStream outputStream = this.f341202b;
        if (outputStream != null) {
            int i12 = this.f341204d;
            if (i12 > 0) {
                outputStream.write(this.f341203c, 0, i12);
                this.f341204d = 0;
            }
            this.f341202b.flush();
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c12) throws IOException {
        write(c12);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0023, code lost:
    
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(char[] r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.p.write(char[], int, int):void");
    }

    @Override // java.io.Writer
    public final void write(int i12) throws IOException {
        int i13;
        if (this.f341205e > 0) {
            i12 = a(i12);
        } else if (i12 >= 55296 && i12 <= 57343) {
            if (i12 <= 56319) {
                this.f341205e = i12;
                return;
            } else {
                b(i12);
                throw null;
            }
        }
        int i14 = this.f341204d;
        if (i14 >= 0) {
            this.f341202b.write(this.f341203c, 0, i14);
            this.f341204d = 0;
        }
        if (i12 < 128) {
            byte[] bArr = this.f341203c;
            int i15 = this.f341204d;
            this.f341204d = i15 + 1;
            bArr[i15] = (byte) i12;
            return;
        }
        int i16 = this.f341204d;
        if (i12 < 2048) {
            byte[] bArr2 = this.f341203c;
            int i17 = i16 + 1;
            bArr2[i16] = (byte) ((i12 >> 6) | 192);
            i13 = i16 + 2;
            bArr2[i17] = (byte) ((i12 & 63) | 128);
        } else if (i12 <= 65535) {
            byte[] bArr3 = this.f341203c;
            bArr3[i16] = (byte) ((i12 >> 12) | 224);
            int i18 = i16 + 2;
            bArr3[i16 + 1] = (byte) (((i12 >> 6) & 63) | 128);
            i13 = i16 + 3;
            bArr3[i18] = (byte) ((i12 & 63) | 128);
        } else if (i12 <= 1114111) {
            byte[] bArr4 = this.f341203c;
            bArr4[i16] = (byte) ((i12 >> 18) | 240);
            bArr4[i16 + 1] = (byte) (((i12 >> 12) & 63) | 128);
            int i19 = i16 + 3;
            bArr4[i16 + 2] = (byte) (((i12 >> 6) & 63) | 128);
            i13 = i16 + 4;
            bArr4[i19] = (byte) ((i12 & 63) | 128);
        } else {
            b(i12);
            throw null;
        }
        this.f341204d = i13;
    }

    @Override // java.io.Writer
    public final void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0027, code lost:
    
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(java.lang.String r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.p.write(java.lang.String, int, int):void");
    }
}
