package com.google.common.io;

import com.google.common.base.d0;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

@InterfaceC37521x
@XY0.b
/* loaded from: classes6.dex */
public abstract class BaseEncoding {

    /* renamed from: a, reason: collision with root package name */
    public static final BaseEncoding f360297a;

    public static final class DecodingException extends IOException {
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f360298a;

        /* renamed from: b, reason: collision with root package name */
        public final char[] f360299b;

        /* renamed from: c, reason: collision with root package name */
        public final int f360300c;

        /* renamed from: d, reason: collision with root package name */
        public final int f360301d;

        /* renamed from: e, reason: collision with root package name */
        public final int f360302e;

        /* renamed from: f, reason: collision with root package name */
        public final byte[] f360303f;

        public a(String str, char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            int i12 = 0;
            while (true) {
                if (i12 >= cArr.length) {
                    this.f360298a = str;
                    this.f360299b = cArr;
                    try {
                        int iB2 = com.google.common.math.f.b(cArr.length, RoundingMode.UNNECESSARY);
                        this.f360300c = iB2;
                        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iB2);
                        int i13 = 1 << (3 - iNumberOfTrailingZeros);
                        this.f360301d = i13;
                        this.f360302e = iB2 >> iNumberOfTrailingZeros;
                        this.f360303f = bArr;
                        boolean[] zArr = new boolean[i13];
                        for (int i14 = 0; i14 < this.f360302e; i14++) {
                            zArr[com.google.common.math.f.a(i14 * 8, this.f360300c, RoundingMode.CEILING)] = true;
                        }
                        return;
                    } catch (ArithmeticException e12) {
                        throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e12);
                    }
                }
                char c12 = cArr[i12];
                if (!(c12 < 128)) {
                    throw new IllegalArgumentException(d0.b("Non-ASCII character: %s", Character.valueOf(c12)));
                }
                if (!(bArr[c12] == -1)) {
                    throw new IllegalArgumentException(d0.b("Duplicate character: %s", Character.valueOf(c12)));
                }
                bArr[c12] = (byte) i12;
                i12++;
            }
        }

        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return Arrays.equals(this.f360299b, aVar.f360299b);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f360299b) + 1237;
        }

        public final String toString() {
            return this.f360298a;
        }
    }

    public static final class b extends e {

        /* renamed from: d, reason: collision with root package name */
        public final char[] f360304d;

        public b() {
            a aVar = new a("base16()", "0123456789ABCDEF".toCharArray());
            super(aVar, (Character) null);
            this.f360304d = new char[512];
            char[] cArr = aVar.f360299b;
            com.google.common.base.M.g(cArr.length == 16);
            for (int i12 = 0; i12 < 256; i12++) {
                char[] cArr2 = this.f360304d;
                cArr2[i12] = cArr[i12 >>> 4];
                cArr2[i12 | 256] = cArr[i12 & 15];
            }
        }
    }

    public static final class c extends e {
        public c(String str, String str2) {
            a aVar = new a(str, str2.toCharArray());
            super(aVar, (Character) '=');
            com.google.common.base.M.g(aVar.f360299b.length == 64);
        }
    }

    public static final class d extends BaseEncoding {
        public final String toString() {
            return "null.withSeparator(\"null\", 0)";
        }
    }

    public static class e extends BaseEncoding {

        /* renamed from: b, reason: collision with root package name */
        public final a f360305b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public final Character f360306c;

        public e(String str, String str2) {
            this(new a(str, str2.toCharArray()), (Character) '=');
        }

        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f360305b.equals(eVar.f360305b) && Objects.equals(this.f360306c, eVar.f360306c);
        }

        public final int hashCode() {
            return this.f360305b.hashCode() ^ Objects.hashCode(this.f360306c);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            a aVar = this.f360305b;
            sb2.append(aVar);
            if (8 % aVar.f360300c != 0) {
                Character ch2 = this.f360306c;
                if (ch2 == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(ch2);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public e(com.google.common.io.BaseEncoding.a r3, @I41.a java.lang.Character r4) {
            /*
                r2 = this;
                r2.<init>()
                r2.f360305b = r3
                if (r4 == 0) goto L17
                char r0 = r4.charValue()
                byte[] r3 = r3.f360303f
                int r1 = r3.length
                if (r0 >= r1) goto L17
                r3 = r3[r0]
                r0 = -1
                if (r3 == r0) goto L17
                r3 = 0
                goto L18
            L17:
                r3 = 1
            L18:
                java.lang.String r0 = "Padding character %s was already in alphabet"
                com.google.common.base.M.f(r0, r3, r4)
                r2.f360306c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.BaseEncoding.e.<init>(com.google.common.io.BaseEncoding$a, java.lang.Character):void");
        }
    }

    static {
        new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f360297a = new b();
    }
}
