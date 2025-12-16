package com.google.common.hash;

import com.google.common.base.d0;
import com.google.common.hash.q;
import java.util.Arrays;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

/* compiled from: Hashing.java */
@InterfaceC37497l
/* loaded from: classes6.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final int f360285a = (int) System.currentTimeMillis();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Hashing.java */
    @aZ0.j
    public static abstract class b implements x<Checksum> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b[] f360286b;

        /* JADX INFO: Fake field, exist only in values array */
        b EF9;

        /* compiled from: Hashing.java */
        public enum a extends b {
            @Override // com.google.common.base.e0
            public final Object get() {
                return new CRC32();
            }
        }

        /* compiled from: Hashing.java */
        /* renamed from: com.google.common.hash.t$b$b, reason: collision with other inner class name */
        public enum C10681b extends b {
            @Override // com.google.common.base.e0
            public final Object get() {
                return new Adler32();
            }
        }

        static {
            f360286b = new b[]{new a("CRC_32", 0, "Hashing.crc32()"), new C10681b("ADLER_32", 1, "Hashing.adler32()")};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f360286b.clone();
        }

        public b(String str, int i12, String str2) {
            new C37495j(this, str2);
        }
    }

    /* compiled from: Hashing.java */
    public static final class c extends AbstractC37488c {
        public c(r[] rVarArr, a aVar) {
            super(rVarArr);
            for (r rVar : rVarArr) {
                boolean z12 = rVar.b() % 8 == 0;
                int iB2 = rVar.b();
                if (!z12) {
                    throw new IllegalArgumentException(d0.b("the number of bits (%s) in hashFunction (%s) must be divisible by 8", Integer.valueOf(iB2), rVar));
                }
            }
        }

        @Override // com.google.common.hash.r
        public final int b() {
            int iB2 = 0;
            for (r rVar : this.f360245b) {
                iB2 += rVar.b();
            }
            return iB2;
        }

        @Override // com.google.common.hash.AbstractC37488c
        public final q c(s[] sVarArr) {
            int iB2 = b() / 8;
            byte[] bArr = new byte[iB2];
            int length = sVarArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                q qVarE = sVarArr[i12].e();
                int[] iArr = {qVarE.d() / 8, qVarE.d() / 8};
                int i14 = iArr[0];
                int i15 = iArr[1];
                if (i15 < i14) {
                    i14 = i15;
                }
                int i16 = i13 + i14;
                com.google.common.base.M.l(i13, i16, iB2);
                qVarE.g(i13, i14, bArr);
                i12++;
                i13 = i16;
            }
            char[] cArr = q.f360281b;
            return new q.a(bArr);
        }

        public final boolean equals(@I41.a Object obj) {
            if (obj instanceof c) {
                return Arrays.equals(this.f360245b, ((c) obj).f360245b);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f360245b);
        }
    }

    /* compiled from: Hashing.java */
    public static final class d {
    }

    /* compiled from: Hashing.java */
    public static class e {
        static {
            new F("MD5", "Hashing.md5()");
        }
    }

    /* compiled from: Hashing.java */
    public static class f {
        static {
            new F("SHA-1", "Hashing.sha1()");
        }
    }

    /* compiled from: Hashing.java */
    public static class g {
        static {
            new F("SHA-256", "Hashing.sha256()");
        }
    }

    /* compiled from: Hashing.java */
    public static class h {
        static {
            new F("SHA-384", "Hashing.sha384()");
        }
    }

    /* compiled from: Hashing.java */
    public static class i {
        static {
            new F("SHA-512", "Hashing.sha512()");
        }
    }
}
