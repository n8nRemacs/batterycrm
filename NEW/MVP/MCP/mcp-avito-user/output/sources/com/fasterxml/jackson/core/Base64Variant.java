package com.fasterxml.jackson.core;

import androidx.camera.camera2.internal.G;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Base64Variant implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final transient int[] f341002b;

    /* renamed from: c, reason: collision with root package name */
    public final transient char[] f341003c;

    /* renamed from: d, reason: collision with root package name */
    public final transient byte[] f341004d;

    /* renamed from: e, reason: collision with root package name */
    public final String f341005e;

    /* renamed from: f, reason: collision with root package name */
    public final char f341006f;

    /* renamed from: g, reason: collision with root package name */
    public final int f341007g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f341008h;

    /* renamed from: i, reason: collision with root package name */
    public final PaddingReadBehaviour f341009i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PaddingReadBehaviour {

        /* renamed from: b, reason: collision with root package name */
        public static final PaddingReadBehaviour f341010b;

        /* renamed from: c, reason: collision with root package name */
        public static final PaddingReadBehaviour f341011c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ PaddingReadBehaviour[] f341012d;

        static {
            PaddingReadBehaviour paddingReadBehaviour = new PaddingReadBehaviour("PADDING_FORBIDDEN", 0);
            f341010b = paddingReadBehaviour;
            PaddingReadBehaviour paddingReadBehaviour2 = new PaddingReadBehaviour("PADDING_REQUIRED", 1);
            f341011c = paddingReadBehaviour2;
            f341012d = new PaddingReadBehaviour[]{paddingReadBehaviour, paddingReadBehaviour2, new PaddingReadBehaviour("PADDING_ALLOWED", 2)};
        }

        public PaddingReadBehaviour() {
            throw null;
        }

        public static PaddingReadBehaviour valueOf(String str) {
            return (PaddingReadBehaviour) Enum.valueOf(PaddingReadBehaviour.class, str);
        }

        public static PaddingReadBehaviour[] values() {
            return (PaddingReadBehaviour[]) f341012d.clone();
        }
    }

    public Base64Variant(String str, String str2, boolean z12, char c12, int i12) {
        int[] iArr = new int[128];
        this.f341002b = iArr;
        char[] cArr = new char[64];
        this.f341003c = cArr;
        this.f341004d = new byte[64];
        this.f341005e = str;
        this.f341008h = z12;
        this.f341006f = c12;
        this.f341007g = i12;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException(G.e(length, "Base64Alphabet length must be exactly 64 (was ", ")"));
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i13 = 0; i13 < length; i13++) {
            char c13 = this.f341003c[i13];
            this.f341004d[i13] = (byte) c13;
            this.f341002b[c13] = i13;
        }
        if (z12) {
            this.f341002b[c12] = -2;
        }
        this.f341009i = z12 ? PaddingReadBehaviour.f341011c : PaddingReadBehaviour.f341010b;
    }

    public final void a(String str, int i12, char c12) {
        String strR;
        if (c12 <= ' ') {
            strR = "Illegal white space character (code 0x" + Integer.toHexString(c12) + ") as character #" + (i12 + 1) + " of 4-char base64 unit: can only used between units";
        } else {
            char c13 = this.f341006f;
            if (c12 == c13) {
                strR = "Unexpected padding character ('" + c13 + "') as character #" + (i12 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
            } else if (!Character.isDefined(c12) || Character.isISOControl(c12)) {
                strR = "Illegal character (code 0x" + Integer.toHexString(c12) + ") in base64 content";
            } else {
                strR = "Illegal character '" + c12 + "' (code 0x" + Integer.toHexString(c12) + ") in base64 content";
            }
        }
        if (str != null) {
            strR = androidx.appcompat.app.r.r(strR, ": ", str);
        }
        throw new IllegalArgumentException(strR);
    }

    public final void b(String str, com.fasterxml.jackson.core.util.c cVar) {
        int length = str.length();
        int i12 = 0;
        while (i12 < length) {
            int i13 = i12 + 1;
            char cCharAt = str.charAt(i12);
            if (cCharAt > ' ') {
                int iC2 = c(cCharAt);
                if (iC2 < 0) {
                    a(null, 0, cCharAt);
                    throw null;
                }
                if (i13 >= length) {
                    throw new IllegalArgumentException(k());
                }
                int i14 = i12 + 2;
                char cCharAt2 = str.charAt(i13);
                int iC3 = c(cCharAt2);
                if (iC3 < 0) {
                    a(null, 1, cCharAt2);
                    throw null;
                }
                int i15 = (iC2 << 6) | iC3;
                PaddingReadBehaviour paddingReadBehaviour = PaddingReadBehaviour.f341011c;
                PaddingReadBehaviour paddingReadBehaviour2 = this.f341009i;
                if (i14 >= length) {
                    if (paddingReadBehaviour2 == paddingReadBehaviour) {
                        throw new IllegalArgumentException(k());
                    }
                    cVar.b(i15 >> 4);
                    return;
                }
                int i16 = i12 + 3;
                char cCharAt3 = str.charAt(i14);
                int iC4 = c(cCharAt3);
                String str2 = this.f341005e;
                PaddingReadBehaviour paddingReadBehaviour3 = PaddingReadBehaviour.f341010b;
                if (iC4 >= 0) {
                    int i17 = (i15 << 6) | iC4;
                    if (i16 >= length) {
                        if (paddingReadBehaviour2 == paddingReadBehaviour) {
                            throw new IllegalArgumentException(k());
                        }
                        cVar.d(i17 >> 2);
                        return;
                    }
                    i12 += 4;
                    char cCharAt4 = str.charAt(i16);
                    int iC5 = c(cCharAt4);
                    if (iC5 >= 0) {
                        cVar.c((i17 << 6) | iC5);
                    } else {
                        if (iC5 != -2) {
                            a(null, 3, cCharAt4);
                            throw null;
                        }
                        if (paddingReadBehaviour2 == paddingReadBehaviour3) {
                            throw new IllegalArgumentException(AK.c.k("Unexpected end of base64-encoded String: base64 variant '", str2, "' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured"));
                        }
                        cVar.d(i17 >> 2);
                    }
                } else {
                    if (iC4 != -2) {
                        a(null, 2, cCharAt3);
                        throw null;
                    }
                    if (paddingReadBehaviour2 == paddingReadBehaviour3) {
                        throw new IllegalArgumentException(AK.c.k("Unexpected end of base64-encoded String: base64 variant '", str2, "' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured"));
                    }
                    if (i16 >= length) {
                        throw new IllegalArgumentException(k());
                    }
                    i12 += 4;
                    char cCharAt5 = str.charAt(i16);
                    char c12 = this.f341006f;
                    if (cCharAt5 != c12) {
                        a("expected padding character '" + c12 + "'", 3, cCharAt5);
                        throw null;
                    }
                    cVar.b(i15 >> 4);
                }
            } else {
                i12 = i13;
            }
        }
    }

    public final int c(char c12) {
        if (c12 <= 127) {
            return this.f341002b[c12];
        }
        return -1;
    }

    public final int d(int i12) {
        if (i12 <= 127) {
            return this.f341002b[i12];
        }
        return -1;
    }

    public final String e(byte[] bArr) {
        char[] cArr;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder((length >> 2) + length + (length >> 3));
        int i12 = this.f341007g >> 2;
        int i13 = length - 3;
        int i14 = 0;
        loop0: while (true) {
            int i15 = i12;
            do {
                cArr = this.f341003c;
                if (i14 > i13) {
                    break loop0;
                }
                int i16 = i14 + 2;
                int i17 = ((bArr[i14 + 1] & 255) | (bArr[i14] << 8)) << 8;
                i14 += 3;
                int i18 = i17 | (bArr[i16] & 255);
                sb2.append(cArr[(i18 >> 18) & 63]);
                sb2.append(cArr[(i18 >> 12) & 63]);
                sb2.append(cArr[(i18 >> 6) & 63]);
                sb2.append(cArr[i18 & 63]);
                i15--;
            } while (i15 > 0);
            sb2.append("\\n");
        }
        int i19 = length - i14;
        if (i19 > 0) {
            int i22 = i14 + 1;
            int i23 = bArr[i14] << 16;
            if (i19 == 2) {
                i23 |= (bArr[i22] & 255) << 8;
            }
            sb2.append(cArr[(i23 >> 18) & 63]);
            sb2.append(cArr[(i23 >> 12) & 63]);
            if (this.f341008h) {
                char c12 = this.f341006f;
                sb2.append(i19 == 2 ? cArr[(i23 >> 6) & 63] : c12);
                sb2.append(c12);
            } else if (i19 == 2) {
                sb2.append(cArr[(i23 >> 6) & 63]);
            }
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != Base64Variant.class) {
            return false;
        }
        Base64Variant base64Variant = (Base64Variant) obj;
        return base64Variant.f341006f == this.f341006f && base64Variant.f341007g == this.f341007g && base64Variant.f341008h == this.f341008h && base64Variant.f341009i == this.f341009i && this.f341005e.equals(base64Variant.f341005e);
    }

    public final int f(int i12, int i13, byte[] bArr) {
        byte[] bArr2 = this.f341004d;
        bArr[i13] = bArr2[(i12 >> 18) & 63];
        bArr[i13 + 1] = bArr2[(i12 >> 12) & 63];
        int i14 = i13 + 3;
        bArr[i13 + 2] = bArr2[(i12 >> 6) & 63];
        int i15 = i13 + 4;
        bArr[i14] = bArr2[i12 & 63];
        return i15;
    }

    public final int g(char[] cArr, int i12, int i13) {
        char[] cArr2 = this.f341003c;
        cArr[i13] = cArr2[(i12 >> 18) & 63];
        cArr[i13 + 1] = cArr2[(i12 >> 12) & 63];
        int i14 = i13 + 3;
        cArr[i13 + 2] = cArr2[(i12 >> 6) & 63];
        int i15 = i13 + 4;
        cArr[i14] = cArr2[i12 & 63];
        return i15;
    }

    public final int h(int i12, int i13, int i14, byte[] bArr) {
        byte[] bArr2 = this.f341004d;
        bArr[i14] = bArr2[(i12 >> 18) & 63];
        int i15 = i14 + 2;
        bArr[i14 + 1] = bArr2[(i12 >> 12) & 63];
        if (!this.f341008h) {
            if (i13 != 2) {
                return i15;
            }
            int i16 = i14 + 3;
            bArr[i15] = bArr2[(i12 >> 6) & 63];
            return i16;
        }
        byte b12 = (byte) this.f341006f;
        int i17 = i14 + 3;
        bArr[i15] = i13 == 2 ? bArr2[(i12 >> 6) & 63] : b12;
        int i18 = i14 + 4;
        bArr[i17] = b12;
        return i18;
    }

    public final int hashCode() {
        return this.f341005e.hashCode();
    }

    public final int i(int i12, int i13, char[] cArr, int i14) {
        char[] cArr2 = this.f341003c;
        cArr[i14] = cArr2[(i12 >> 18) & 63];
        int i15 = i14 + 2;
        cArr[i14 + 1] = cArr2[(i12 >> 12) & 63];
        if (!this.f341008h) {
            if (i13 != 2) {
                return i15;
            }
            int i16 = i14 + 3;
            cArr[i15] = cArr2[(i12 >> 6) & 63];
            return i16;
        }
        int i17 = i14 + 3;
        char c12 = this.f341006f;
        cArr[i15] = i13 == 2 ? cArr2[(i12 >> 6) & 63] : c12;
        int i18 = i14 + 4;
        cArr[i17] = c12;
        return i18;
    }

    public final String k() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", this.f341005e, Character.valueOf(this.f341006f));
    }

    public Object readResolve() {
        Base64Variant base64Variant = a.f341118a;
        String str = base64Variant.f341005e;
        String str2 = this.f341005e;
        if (!str.equals(str2)) {
            base64Variant = a.f341119b;
            if (!base64Variant.f341005e.equals(str2)) {
                base64Variant = a.f341120c;
                if (!base64Variant.f341005e.equals(str2)) {
                    base64Variant = a.f341121d;
                    if (!base64Variant.f341005e.equals(str2)) {
                        throw new IllegalArgumentException(G.f("No Base64Variant with name ", str2 == null ? "<null>" : AK.c.k("'", str2, "'")));
                    }
                }
            }
        }
        Base64Variant base64Variant2 = base64Variant;
        boolean z12 = this.f341008h;
        boolean z13 = base64Variant2.f341008h;
        return (z12 == z13 && this.f341006f == base64Variant2.f341006f && this.f341009i == base64Variant2.f341009i && this.f341007g == base64Variant2.f341007g && z12 == z13) ? base64Variant2 : new Base64Variant(base64Variant2, this.f341005e, z12, this.f341006f, this.f341009i, this.f341007g);
    }

    public final String toString() {
        return this.f341005e;
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z12, char c12, PaddingReadBehaviour paddingReadBehaviour, int i12) {
        int[] iArr = new int[128];
        this.f341002b = iArr;
        char[] cArr = new char[64];
        this.f341003c = cArr;
        byte[] bArr = new byte[64];
        this.f341004d = bArr;
        this.f341005e = str;
        byte[] bArr2 = base64Variant.f341004d;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = base64Variant.f341003c;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = base64Variant.f341002b;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f341008h = z12;
        this.f341006f = c12;
        this.f341007g = i12;
        this.f341009i = paddingReadBehaviour;
    }
}
