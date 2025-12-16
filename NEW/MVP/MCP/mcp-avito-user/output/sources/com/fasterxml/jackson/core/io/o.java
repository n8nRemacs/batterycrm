package com.fasterxml.jackson.core.io;

import androidx.appcompat.app.r;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* compiled from: UTF32Reader.java */
/* loaded from: classes3.dex */
public class o extends Reader {

    /* renamed from: b, reason: collision with root package name */
    public final f f341191b;

    /* renamed from: c, reason: collision with root package name */
    public InputStream f341192c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f341193d;

    /* renamed from: e, reason: collision with root package name */
    public int f341194e;

    /* renamed from: f, reason: collision with root package name */
    public int f341195f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f341196g;

    /* renamed from: h, reason: collision with root package name */
    public char f341197h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f341198i;

    /* renamed from: j, reason: collision with root package name */
    public int f341199j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f341200k;

    /* renamed from: l, reason: collision with root package name */
    public char[] f341201l;

    public o(f fVar, InputStream inputStream, byte[] bArr, int i12, int i13, boolean z12) {
        this.f341191b = fVar;
        this.f341192c = inputStream;
        this.f341193d = bArr;
        this.f341194e = i12;
        this.f341195f = i13;
        this.f341196g = z12;
        this.f341200k = inputStream != null;
    }

    public final void a(int i12) throws CharConversionException {
        throw new CharConversionException(AK.c.i(this.f341199j + i12, ")", r.y(i12, this.f341198i, "Unexpected EOF in the middle of a 4-byte UTF-32 char: got ", ", needed 4, at char #", ", byte #")));
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f341192c;
        if (inputStream != null) {
            this.f341192c = null;
            byte[] bArr = this.f341193d;
            if (bArr != null) {
                this.f341193d = null;
                f fVar = this.f341191b;
                if (fVar != null) {
                    fVar.e(bArr);
                }
            }
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public final int read() {
        if (this.f341201l == null) {
            this.f341201l = new char[1];
        }
        if (read(this.f341201l, 0, 1) < 1) {
            return -1;
        }
        return this.f341201l[0];
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i12, int i13) throws IOException {
        int i14;
        int i15;
        byte[] bArr;
        byte[] bArr2;
        int i16;
        int i17;
        byte[] bArr3 = this.f341193d;
        if (bArr3 == null) {
            return -1;
        }
        if (i13 < 1) {
            return i13;
        }
        if (i12 >= 0 && (i14 = i12 + i13) <= cArr.length) {
            char c12 = this.f341197h;
            if (c12 != 0) {
                i15 = i12 + 1;
                cArr[i12] = c12;
                this.f341197h = (char) 0;
            } else {
                int i18 = this.f341195f;
                int i19 = this.f341194e;
                int i22 = i18 - i19;
                if (i22 < 4) {
                    InputStream inputStream = this.f341192c;
                    if (inputStream != null) {
                        this.f341199j = (i18 - i22) + this.f341199j;
                        f fVar = this.f341191b;
                        boolean z12 = this.f341200k;
                        if (i22 > 0) {
                            if (i19 > 0) {
                                System.arraycopy(bArr3, i19, bArr3, 0, i22);
                                this.f341194e = 0;
                            }
                            this.f341195f = i22;
                        } else {
                            this.f341194e = 0;
                            int i23 = inputStream.read(bArr3);
                            if (i23 < 1) {
                                this.f341195f = 0;
                                if (i23 >= 0) {
                                    throw new IOException("Strange I/O stream, returned 0 bytes on read");
                                }
                                if (z12 && (bArr = this.f341193d) != null) {
                                    this.f341193d = null;
                                    if (fVar != null) {
                                        fVar.e(bArr);
                                    }
                                }
                            } else {
                                this.f341195f = i23;
                            }
                        }
                        while (true) {
                            int i24 = this.f341195f;
                            if (i24 >= 4) {
                                break;
                            }
                            InputStream inputStream2 = this.f341192c;
                            byte[] bArr4 = this.f341193d;
                            int i25 = inputStream2.read(bArr4, i24, bArr4.length - i24);
                            if (i25 < 1) {
                                if (i25 < 0) {
                                    if (z12 && (bArr2 = this.f341193d) != null) {
                                        this.f341193d = null;
                                        if (fVar != null) {
                                            fVar.e(bArr2);
                                        }
                                    }
                                    a(this.f341195f);
                                    throw null;
                                }
                                throw new IOException("Strange I/O stream, returned 0 bytes on read");
                            }
                            this.f341195f += i25;
                        }
                    }
                    if (i22 == 0) {
                        return -1;
                    }
                    a(this.f341195f - this.f341194e);
                    throw null;
                }
                i15 = i12;
            }
            int i26 = this.f341195f - 4;
            while (true) {
                if (i15 >= i14) {
                    break;
                }
                int i27 = this.f341194e;
                if (i27 > i26) {
                    break;
                }
                if (this.f341196g) {
                    byte[] bArr5 = this.f341193d;
                    i16 = (bArr5[i27] << 8) | (bArr5[i27 + 1] & 255);
                    i17 = (bArr5[i27 + 3] & 255) | ((bArr5[i27 + 2] & 255) << 8);
                } else {
                    byte[] bArr6 = this.f341193d;
                    int i28 = (bArr6[i27] & 255) | ((bArr6[i27 + 1] & 255) << 8);
                    i16 = (bArr6[i27 + 3] << 8) | (bArr6[i27 + 2] & 255);
                    i17 = i28;
                }
                this.f341194e = i27 + 4;
                if (i16 != 0) {
                    int i29 = 65535 & i16;
                    int i32 = i17 | ((i29 - 1) << 16);
                    if (i29 <= 16) {
                        int i33 = i15 + 1;
                        cArr[i15] = (char) ((i32 >> 10) + 55296);
                        int i34 = (i32 & 1023) | 56320;
                        if (i33 >= i14) {
                            this.f341197h = (char) i32;
                            i15 = i33;
                            break;
                        }
                        i17 = i34;
                        i15 = i33;
                    } else {
                        throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(i32) + String.format(" (above 0x%08x)", 1114111) + " at char #" + (this.f341198i + (i15 - i12)) + ", byte #" + ((this.f341199j + this.f341194e) - 1) + ")");
                    }
                }
                cArr[i15] = (char) i17;
                i15++;
            }
            int i35 = i15 - i12;
            this.f341198i += i35;
            return i35;
        }
        throw new ArrayIndexOutOfBoundsException(String.format("read(buf,%d,%d), cbuf[%d]", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(cArr.length)));
    }
}
