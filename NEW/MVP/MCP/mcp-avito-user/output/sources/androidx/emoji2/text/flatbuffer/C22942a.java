package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.x;

/* compiled from: ArrayReadWriteBuf.java */
/* renamed from: androidx.emoji2.text.flatbuffer.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22942a implements q {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f46102a;

    public C22942a() {
        this(10);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public final String a(int i12, int i13) {
        byte[] bArr = this.f46102a;
        if ((i12 | i13 | ((bArr.length - i12) - i13)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i12), Integer.valueOf(i13)));
        }
        int i14 = i12 + i13;
        char[] cArr = new char[i13];
        int i15 = 0;
        while (i12 < i14) {
            byte b12 = bArr[i12];
            if (b12 < 0) {
                break;
            }
            i12++;
            cArr[i15] = (char) b12;
            i15++;
        }
        while (i12 < i14) {
            int i16 = i12 + 1;
            byte b13 = bArr[i12];
            if (b13 >= 0) {
                int i17 = i15 + 1;
                cArr[i15] = (char) b13;
                while (i16 < i14) {
                    byte b14 = bArr[i16];
                    if (b14 < 0) {
                        break;
                    }
                    i16++;
                    cArr[i17] = (char) b14;
                    i17++;
                }
                i15 = i17;
                i12 = i16;
            } else {
                if (b13 < -32) {
                    if (i16 >= i14) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    i12 += 2;
                    byte b15 = bArr[i16];
                    int i18 = i15 + 1;
                    if (b13 < -62) {
                        throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
                    }
                    if (x.a.a(b15)) {
                        throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
                    }
                    cArr[i15] = (char) ((b15 & 63) | ((b13 & 31) << 6));
                    i15 = i18;
                } else {
                    if (b13 >= -16) {
                        if (i16 >= i14 - 2) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        byte b16 = bArr[i16];
                        int i19 = i12 + 3;
                        byte b17 = bArr[i12 + 2];
                        i12 += 4;
                        byte b18 = bArr[i19];
                        if (!x.a.a(b16)) {
                            if ((((b16 + 112) + (b13 << 28)) >> 30) == 0 && !x.a.a(b17) && !x.a.a(b18)) {
                                int i22 = ((b16 & 63) << 12) | ((b13 & 7) << 18) | ((b17 & 63) << 6) | (b18 & 63);
                                cArr[i15] = (char) ((i22 >>> 10) + 55232);
                                cArr[i15 + 1] = (char) ((i22 & 1023) + 56320);
                                i15 += 2;
                            }
                        }
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    if (i16 >= i14 - 1) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int i23 = i12 + 2;
                    byte b19 = bArr[i16];
                    i12 += 3;
                    byte b22 = bArr[i23];
                    int i24 = i15 + 1;
                    if (x.a.a(b19) || ((b13 == -32 && b19 < -96) || ((b13 == -19 && b19 >= -96) || x.a.a(b22)))) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    cArr[i15] = (char) (((b19 & 63) << 6) | ((b13 & 15) << 12) | (b22 & 63));
                    i15 = i24;
                }
            }
        }
        return new String(cArr, 0, i15);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public final byte get(int i12) {
        return this.f46102a[i12];
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public final double getDouble(int i12) {
        return Double.longBitsToDouble(getLong(i12));
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public final float getFloat(int i12) {
        return Float.intBitsToFloat(getInt(i12));
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public final int getInt(int i12) {
        byte[] bArr = this.f46102a;
        return (bArr[i12] & 255) | (bArr[i12 + 3] << 24) | ((bArr[i12 + 2] & 255) << 16) | ((bArr[i12 + 1] & 255) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public final long getLong(int i12) {
        byte[] bArr = this.f46102a;
        return (bArr[i12 + 7] << 56) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16) | ((bArr[i12 + 3] & 255) << 24) | ((bArr[i12 + 4] & 255) << 32) | ((bArr[i12 + 5] & 255) << 40) | ((255 & bArr[i12 + 6]) << 48);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public final short getShort(int i12) {
        byte[] bArr = this.f46102a;
        return (short) ((bArr[i12] & 255) | (bArr[i12 + 1] << 8));
    }

    public C22942a(int i12) {
        this.f46102a = new byte[i12];
    }
}
