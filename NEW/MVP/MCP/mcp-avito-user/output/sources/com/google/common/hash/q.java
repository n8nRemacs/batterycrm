package com.google.common.hash;

import java.io.Serializable;

/* compiled from: HashCode.java */
@InterfaceC37497l
/* loaded from: classes6.dex */
public abstract class q {

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f360281b = "0123456789abcdef".toCharArray();

    /* compiled from: HashCode.java */
    public static final class a extends q implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f360282c;

        public a(byte[] bArr) {
            bArr.getClass();
            this.f360282c = bArr;
        }

        @Override // com.google.common.hash.q
        public final byte[] a() {
            return (byte[]) this.f360282c.clone();
        }

        @Override // com.google.common.hash.q
        public final int b() {
            byte[] bArr = this.f360282c;
            com.google.common.base.M.m(bArr.length, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length >= 4);
            return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        }

        @Override // com.google.common.hash.q
        public final long c() {
            byte[] bArr = this.f360282c;
            com.google.common.base.M.m(bArr.length, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length >= 8);
            long j12 = bArr[0] & 255;
            for (int i12 = 1; i12 < Math.min(bArr.length, 8); i12++) {
                j12 |= (bArr[i12] & 255) << (i12 * 8);
            }
            return j12;
        }

        @Override // com.google.common.hash.q
        public final int d() {
            return this.f360282c.length * 8;
        }

        @Override // com.google.common.hash.q
        public final boolean e(q qVar) {
            byte[] bArr = this.f360282c;
            if (bArr.length != qVar.f().length) {
                return false;
            }
            boolean z12 = true;
            for (int i12 = 0; i12 < bArr.length; i12++) {
                z12 &= bArr[i12] == qVar.f()[i12];
            }
            return z12;
        }

        @Override // com.google.common.hash.q
        public final byte[] f() {
            return this.f360282c;
        }

        @Override // com.google.common.hash.q
        public final void g(int i12, int i13, byte[] bArr) {
            System.arraycopy(this.f360282c, 0, bArr, i12, i13);
        }
    }

    /* compiled from: HashCode.java */
    public static final class b extends q implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        public final int f360283c;

        public b(int i12) {
            this.f360283c = i12;
        }

        @Override // com.google.common.hash.q
        public final byte[] a() {
            int i12 = this.f360283c;
            return new byte[]{(byte) i12, (byte) (i12 >> 8), (byte) (i12 >> 16), (byte) (i12 >> 24)};
        }

        @Override // com.google.common.hash.q
        public final int b() {
            return this.f360283c;
        }

        @Override // com.google.common.hash.q
        public final long c() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        @Override // com.google.common.hash.q
        public final int d() {
            return 32;
        }

        @Override // com.google.common.hash.q
        public final boolean e(q qVar) {
            return this.f360283c == qVar.b();
        }

        @Override // com.google.common.hash.q
        public final void g(int i12, int i13, byte[] bArr) {
            for (int i14 = 0; i14 < i13; i14++) {
                bArr[i12 + i14] = (byte) (this.f360283c >> (i14 * 8));
            }
        }
    }

    /* compiled from: HashCode.java */
    public static final class c extends q implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        public final long f360284c;

        public c(long j12) {
            this.f360284c = j12;
        }

        @Override // com.google.common.hash.q
        public final byte[] a() {
            return new byte[]{(byte) this.f360284c, (byte) (r0 >> 8), (byte) (r0 >> 16), (byte) (r0 >> 24), (byte) (r0 >> 32), (byte) (r0 >> 40), (byte) (r0 >> 48), (byte) (r0 >> 56)};
        }

        @Override // com.google.common.hash.q
        public final int b() {
            return (int) this.f360284c;
        }

        @Override // com.google.common.hash.q
        public final long c() {
            return this.f360284c;
        }

        @Override // com.google.common.hash.q
        public final int d() {
            return 64;
        }

        @Override // com.google.common.hash.q
        public final boolean e(q qVar) {
            return this.f360284c == qVar.c();
        }

        @Override // com.google.common.hash.q
        public final void g(int i12, int i13, byte[] bArr) {
            for (int i14 = 0; i14 < i13; i14++) {
                bArr[i12 + i14] = (byte) (this.f360284c >> (i14 * 8));
            }
        }
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public abstract boolean e(q qVar);

    public final boolean equals(@I41.a Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return d() == qVar.d() && e(qVar);
    }

    public byte[] f() {
        return a();
    }

    public abstract void g(int i12, int i13, byte[] bArr);

    public final int hashCode() {
        if (d() >= 32) {
            return b();
        }
        byte[] bArrF = f();
        int i12 = bArrF[0] & 255;
        for (int i13 = 1; i13 < bArrF.length; i13++) {
            i12 |= (bArrF[i13] & 255) << (i13 * 8);
        }
        return i12;
    }

    public final String toString() {
        byte[] bArrF = f();
        StringBuilder sb2 = new StringBuilder(bArrF.length * 2);
        for (byte b12 : bArrF) {
            char[] cArr = f360281b;
            sb2.append(cArr[(b12 >> 4) & 15]);
            sb2.append(cArr[b12 & 15]);
        }
        return sb2.toString();
    }
}
