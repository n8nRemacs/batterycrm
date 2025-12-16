package com.google.crypto.tink.subtle;

import androidx.appcompat.app.r;
import androidx.compose.ui.graphics.colorspace.e;
import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class Base64 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;
    private static final Charset UTF_8 = Charset.forName(Constants.ENCODING);

    public static abstract class Coder {

        /* renamed from: op, reason: collision with root package name */
        public int f360680op;
        public byte[] output;

        public abstract int maxOutputSize(int i12);

        public abstract boolean process(byte[] bArr, int i12, int i13, boolean z12);
    }

    public static class Decoder extends Coder {
        private static final int[] DECODE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] DECODE_WEBSAFE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet;
        private int state;
        private int value;

        public Decoder(int i12, byte[] bArr) {
            this.output = bArr;
            this.alphabet = (i12 & 8) == 0 ? DECODE : DECODE_WEBSAFE;
            this.state = 0;
            this.value = 0;
        }

        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public int maxOutputSize(int i12) {
            return e.e(i12, 3, 4, 10);
        }

        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public boolean process(byte[] bArr, int i12, int i13, boolean z12) {
            int i14 = this.state;
            if (i14 == 6) {
                return false;
            }
            int i15 = i13 + i12;
            int i16 = this.value;
            byte[] bArr2 = this.output;
            int[] iArr = this.alphabet;
            int i17 = 0;
            int i18 = i16;
            int i19 = i14;
            int i22 = i12;
            while (i22 < i15) {
                if (i19 == 0) {
                    while (true) {
                        int i23 = i22 + 4;
                        if (i23 > i15 || (i18 = (iArr[bArr[i22] & 255] << 18) | (iArr[bArr[i22 + 1] & 255] << 12) | (iArr[bArr[i22 + 2] & 255] << 6) | iArr[bArr[i22 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i17 + 2] = (byte) i18;
                        bArr2[i17 + 1] = (byte) (i18 >> 8);
                        bArr2[i17] = (byte) (i18 >> 16);
                        i17 += 3;
                        i22 = i23;
                    }
                    if (i22 >= i15) {
                        break;
                    }
                }
                int i24 = i22 + 1;
                int i25 = iArr[bArr[i22] & 255];
                if (i19 != 0) {
                    if (i19 == 1) {
                        if (i25 < 0) {
                            if (i25 != -1) {
                                this.state = 6;
                                return false;
                            }
                        }
                        i25 |= i18 << 6;
                    } else if (i19 == 2) {
                        if (i25 < 0) {
                            if (i25 == -2) {
                                bArr2[i17] = (byte) (i18 >> 4);
                                i17++;
                                i19 = 4;
                            } else if (i25 != -1) {
                                this.state = 6;
                                return false;
                            }
                        }
                        i25 |= i18 << 6;
                    } else if (i19 != 3) {
                        if (i19 != 4) {
                            if (i19 == 5 && i25 != -1) {
                                this.state = 6;
                                return false;
                            }
                        } else if (i25 == -2) {
                            i19++;
                        } else if (i25 != -1) {
                            this.state = 6;
                            return false;
                        }
                    } else if (i25 >= 0) {
                        int i26 = i25 | (i18 << 6);
                        bArr2[i17 + 2] = (byte) i26;
                        bArr2[i17 + 1] = (byte) (i26 >> 8);
                        bArr2[i17] = (byte) (i26 >> 16);
                        i17 += 3;
                        i18 = i26;
                        i19 = 0;
                    } else if (i25 == -2) {
                        bArr2[i17 + 1] = (byte) (i18 >> 2);
                        bArr2[i17] = (byte) (i18 >> 10);
                        i17 += 2;
                        i19 = 5;
                    } else if (i25 != -1) {
                        this.state = 6;
                        return false;
                    }
                    i19++;
                    i18 = i25;
                } else if (i25 >= 0) {
                    i19++;
                    i18 = i25;
                } else if (i25 != -1) {
                    this.state = 6;
                    return false;
                }
                i22 = i24;
            }
            if (!z12) {
                this.state = i19;
                this.value = i18;
                this.f360680op = i17;
                return true;
            }
            if (i19 == 1) {
                this.state = 6;
                return false;
            }
            if (i19 == 2) {
                bArr2[i17] = (byte) (i18 >> 4);
                i17++;
            } else if (i19 == 3) {
                int i27 = i17 + 1;
                bArr2[i17] = (byte) (i18 >> 10);
                i17 += 2;
                bArr2[i27] = (byte) (i18 >> 2);
            } else if (i19 == 4) {
                this.state = 6;
                return false;
            }
            this.state = i19;
            this.f360680op = i17;
            return true;
        }
    }

    public static class Encoder extends Coder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final byte[] ENCODE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        private static final byte[] ENCODE_WEBSAFE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        public static final int LINE_GROUPS = 19;
        private final byte[] alphabet;
        private int count;
        public final boolean doCr;
        public final boolean doNewline;
        public final boolean doPadding;
        private final byte[] tail;
        int tailLen;

        public Encoder(int i12, byte[] bArr) {
            this.output = bArr;
            this.doPadding = (i12 & 1) == 0;
            boolean z12 = (i12 & 2) == 0;
            this.doNewline = z12;
            this.doCr = (i12 & 4) != 0;
            this.alphabet = (i12 & 8) == 0 ? ENCODE : ENCODE_WEBSAFE;
            this.tail = new byte[2];
            this.tailLen = 0;
            this.count = z12 ? 19 : -1;
        }

        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public int maxOutputSize(int i12) {
            return e.e(i12, 8, 5, 10);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00e6 A[SYNTHETIC] */
        @Override // com.google.crypto.tink.subtle.Base64.Coder
        @aZ0.InterfaceC19845a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean process(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 481
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.subtle.Base64.Encoder.process(byte[], int, int, boolean):boolean");
        }
    }

    private Base64() {
    }

    public static byte[] decode(String str) {
        return decode(str, 2);
    }

    public static String encode(byte[] bArr) {
        return encodeToString(bArr, 2);
    }

    public static String encodeToString(byte[] bArr, int i12) {
        try {
            return new String(encode(bArr, i12), "US-ASCII");
        } catch (UnsupportedEncodingException e12) {
            throw new AssertionError(e12);
        }
    }

    public static byte[] urlSafeDecode(String str) {
        return decode(str, 11);
    }

    public static String urlSafeEncode(byte[] bArr) {
        return encodeToString(bArr, 11);
    }

    public static byte[] decode(String str, int i12) {
        return decode(str.getBytes(UTF_8), i12);
    }

    public static byte[] encode(byte[] bArr, int i12) {
        return encode(bArr, 0, bArr.length, i12);
    }

    public static byte[] decode(byte[] bArr, int i12) {
        return decode(bArr, 0, bArr.length, i12);
    }

    public static byte[] encode(byte[] bArr, int i12, int i13, int i14) {
        Encoder encoder = new Encoder(i14, null);
        int iF2 = (i13 / 3) * 4;
        if (encoder.doPadding) {
            if (i13 % 3 > 0) {
                iF2 += 4;
            }
        } else {
            int i15 = i13 % 3;
            if (i15 == 1) {
                iF2 += 2;
            } else if (i15 == 2) {
                iF2 += 3;
            }
        }
        if (encoder.doNewline && i13 > 0) {
            iF2 += r.f(i13, 1, 57, 1) * (encoder.doCr ? 2 : 1);
        }
        encoder.output = new byte[iF2];
        encoder.process(bArr, i12, i13, true);
        return encoder.output;
    }

    public static String encodeToString(byte[] bArr, int i12, int i13, int i14) {
        try {
            return new String(encode(bArr, i12, i13, i14), "US-ASCII");
        } catch (UnsupportedEncodingException e12) {
            throw new AssertionError(e12);
        }
    }

    public static byte[] decode(byte[] bArr, int i12, int i13, int i14) {
        Decoder decoder = new Decoder(i14, new byte[(i13 * 3) / 4]);
        if (decoder.process(bArr, i12, i13, true)) {
            int i15 = decoder.f360680op;
            byte[] bArr2 = decoder.output;
            if (i15 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i15];
            System.arraycopy(bArr2, 0, bArr3, 0, i15);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }
}
