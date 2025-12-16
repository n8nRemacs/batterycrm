package com.google.common.hash;

import aZ0.InterfaceC19845a;
import com.google.common.base.C37262f;
import com.google.common.hash.q;
import java.io.Serializable;
import java.nio.charset.Charset;

/* compiled from: Murmur3_32HashFunction.java */
@InterfaceC37497l
@aZ0.j
/* loaded from: classes6.dex */
final class H extends AbstractC37489d implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f360210d = 0;
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f360211b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f360212c;

    /* compiled from: Murmur3_32HashFunction.java */
    public static final class a extends AbstractC37490e {

        /* renamed from: a, reason: collision with root package name */
        public int f360213a;

        /* renamed from: b, reason: collision with root package name */
        public long f360214b;

        /* renamed from: c, reason: collision with root package name */
        public int f360215c;

        /* renamed from: d, reason: collision with root package name */
        public int f360216d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f360217e;

        @Override // com.google.common.hash.AbstractC37490e, com.google.common.hash.s, com.google.common.hash.J
        @InterfaceC19845a
        public final s a(int i12) {
            j(4, i12);
            return this;
        }

        @Override // com.google.common.hash.AbstractC37490e, com.google.common.hash.s, com.google.common.hash.J
        @InterfaceC19845a
        public final /* bridge */ /* synthetic */ J b(long j12) {
            b(j12);
            return this;
        }

        @Override // com.google.common.hash.s
        public final q e() {
            com.google.common.base.M.q(!this.f360217e);
            this.f360217e = true;
            int i12 = this.f360213a;
            int i13 = (int) this.f360214b;
            int i14 = H.f360210d;
            int iRotateLeft = i12 ^ (Integer.rotateLeft(i13 * (-862048943), 15) * 461845907);
            this.f360213a = iRotateLeft;
            int i15 = iRotateLeft ^ this.f360216d;
            int i16 = (i15 ^ (i15 >>> 16)) * (-2048144789);
            int i17 = (i16 ^ (i16 >>> 13)) * (-1028477387);
            int i18 = i17 ^ (i17 >>> 16);
            char[] cArr = q.f360281b;
            return new q.b(i18);
        }

        @Override // com.google.common.hash.s
        @InterfaceC19845a
        public final s f(byte b12) {
            j(1, b12 & 255);
            return this;
        }

        @Override // com.google.common.hash.AbstractC37490e
        @InterfaceC19845a
        public final s h(int i12, byte[] bArr) {
            int i13 = 0;
            com.google.common.base.M.l(0, i12, bArr.length);
            while (true) {
                int i14 = i13 + 4;
                if (i14 > i12) {
                    break;
                }
                int i15 = H.f360210d;
                j(4, com.google.common.primitives.l.d(bArr[i13 + 3], bArr[i13 + 2], bArr[i13 + 1], bArr[i13]));
                i13 = i14;
            }
            while (i13 < i12) {
                f(bArr[i13]);
                i13++;
            }
            return this;
        }

        @Override // com.google.common.hash.AbstractC37490e
        @InterfaceC19845a
        public final void i(char c12) {
            j(2, c12);
        }

        public final void j(int i12, long j12) {
            long j13 = this.f360214b;
            int i13 = this.f360215c;
            this.f360214b = ((j12 & 4294967295L) << i13) | j13;
            int i14 = (i12 * 8) + i13;
            this.f360215c = i14;
            this.f360216d += i12;
            if (i14 >= 32) {
                int i15 = this.f360213a;
                int i16 = H.f360210d;
                this.f360213a = (Integer.rotateLeft((Integer.rotateLeft(((int) r6) * (-862048943), 15) * 461845907) ^ i15, 13) * 5) - 430675100;
                this.f360214b >>>= 32;
                this.f360215c -= 32;
            }
        }

        @Override // com.google.common.hash.AbstractC37490e, com.google.common.hash.s, com.google.common.hash.J
        @InterfaceC19845a
        public final J a(int i12) {
            j(4, i12);
            return this;
        }

        @Override // com.google.common.hash.AbstractC37490e, com.google.common.hash.s, com.google.common.hash.J
        @InterfaceC19845a
        public final s b(long j12) {
            j(4, (int) j12);
            j(4, j12 >>> 32);
            return this;
        }

        @Override // com.google.common.hash.AbstractC37490e, com.google.common.hash.s, com.google.common.hash.J
        @InterfaceC19845a
        public final s d(CharSequence charSequence, Charset charset) {
            int i12;
            char c12;
            int i13;
            char c13 = 3;
            if (!C37262f.f359034c.equals(charset)) {
                return super.d(charSequence, charset);
            }
            int length = charSequence.length();
            int i14 = 0;
            while (true) {
                int i15 = i14 + 4;
                if (i15 > length) {
                    break;
                }
                char cCharAt = charSequence.charAt(i14);
                char cCharAt2 = charSequence.charAt(i14 + 1);
                char cCharAt3 = charSequence.charAt(i14 + 2);
                char cCharAt4 = charSequence.charAt(i14 + 3);
                if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                    break;
                }
                int i16 = cCharAt4 << 24;
                j(4, i16 | (cCharAt3 << 16) | (cCharAt2 << '\b') | cCharAt);
                i14 = i15;
            }
            while (i14 < length) {
                char cCharAt5 = charSequence.charAt(i14);
                if (cCharAt5 < 128) {
                    j(1, cCharAt5);
                    c12 = c13;
                    i12 = length;
                } else if (cCharAt5 < 2048) {
                    int i17 = H.f360210d;
                    j(2, (((cCharAt5 & '?') | 128) << 8) | (cCharAt5 >>> 6) | 192);
                    i12 = length;
                    c12 = 3;
                } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                    i12 = length;
                    int i18 = H.f360210d;
                    c12 = 3;
                    j(3, (((cCharAt5 & '?') | 128) << 16) | (cCharAt5 >>> '\f') | 224 | ((((cCharAt5 >>> 6) & 63) | 128) << 8));
                } else {
                    if (Character.codePointAt(charSequence, i14) == cCharAt5) {
                        byte[] bytes = charSequence.subSequence(i14, length).toString().getBytes(charset);
                        h(bytes.length, bytes);
                        return this;
                    }
                    i14++;
                    int i19 = H.f360210d;
                    i12 = length;
                    j(4, (((r6 & 63) | 128) << 24) | ((((r6 >>> 12) & 63) | 128) << 8) | (r6 >>> 18) | 240 | ((((r6 >>> 6) & 63) | 128) << 16));
                    i13 = 1;
                    c12 = 3;
                    i14 += i13;
                    c13 = c12;
                    length = i12;
                }
                i13 = 1;
                i14 += i13;
                c13 = c12;
                length = i12;
            }
            return this;
        }
    }

    static {
        new H(0, false);
        new H(0, true);
        new H(t.f360285a, true);
    }

    public H(int i12, boolean z12) {
        this.f360211b = i12;
        this.f360212c = z12;
    }

    @Override // com.google.common.hash.r
    public final s a() {
        a aVar = new a();
        aVar.f360213a = this.f360211b;
        aVar.f360216d = 0;
        aVar.f360217e = false;
        return aVar;
    }

    @Override // com.google.common.hash.r
    public final int b() {
        return 32;
    }

    public final boolean equals(@I41.a Object obj) {
        if (!(obj instanceof H)) {
            return false;
        }
        H h12 = (H) obj;
        return this.f360211b == h12.f360211b && this.f360212c == h12.f360212c;
    }

    public final int hashCode() {
        return H.class.hashCode() ^ this.f360211b;
    }

    public final String toString() {
        return AK.c.i(this.f360211b, ")", new StringBuilder("Hashing.murmur3_32("));
    }
}
