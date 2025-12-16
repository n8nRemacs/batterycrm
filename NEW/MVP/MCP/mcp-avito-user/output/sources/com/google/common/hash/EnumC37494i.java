package com.google.common.hash;

import com.google.common.hash.C37493h;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BloomFilterStrategies.java */
@InterfaceC37497l
/* renamed from: com.google.common.hash.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class EnumC37494i implements C37493h.c {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC37494i[] f360259b = {new a("MURMUR128_MITZ_32", 0, null), new b("MURMUR128_MITZ_64", 1, null)};

    /* JADX INFO: Fake field, exist only in values array */
    EnumC37494i EF7;

    /* compiled from: BloomFilterStrategies.java */
    /* renamed from: com.google.common.hash.i$a */
    public enum a extends EnumC37494i {
        @Override // com.google.common.hash.C37493h.c
        public final <T> boolean w3(@I T t12, o<? super T> oVar, int i12, c cVar) {
            long length = cVar.f360260a.length() * 64;
            int i13 = t.f360285a;
            long jC2 = ((AbstractC37489d) G.f360205c).a().g(t12, oVar).e().c();
            int i14 = (int) jC2;
            int i15 = (int) (jC2 >>> 32);
            for (int i16 = 1; i16 <= i12; i16++) {
                int i17 = (i16 * i15) + i14;
                if (i17 < 0) {
                    i17 = ~i17;
                }
                long j12 = i17 % length;
                if (((1 << ((int) j12)) & cVar.f360260a.get((int) (j12 >>> 6))) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: BloomFilterStrategies.java */
    /* renamed from: com.google.common.hash.i$b */
    public enum b extends EnumC37494i {
        @Override // com.google.common.hash.C37493h.c
        public final <T> boolean w3(@I T t12, o<? super T> oVar, int i12, c cVar) {
            long length = cVar.f360260a.length() * 64;
            int i13 = t.f360285a;
            byte[] bArrF = ((AbstractC37489d) G.f360205c).a().g(t12, oVar).e().f();
            long jA2 = com.google.common.primitives.n.a(bArrF[7], bArrF[6], bArrF[5], bArrF[4], bArrF[3], bArrF[2], bArrF[1], bArrF[0]);
            long jA3 = com.google.common.primitives.n.a(bArrF[15], bArrF[14], bArrF[13], bArrF[12], bArrF[11], bArrF[10], bArrF[9], bArrF[8]);
            for (int i14 = 0; i14 < i12; i14++) {
                long j12 = (Long.MAX_VALUE & jA2) % length;
                if (((1 << ((int) j12)) & cVar.f360260a.get((int) (j12 >>> 6))) == 0) {
                    return false;
                }
                jA2 += jA3;
            }
            return true;
        }
    }

    /* compiled from: BloomFilterStrategies.java */
    /* renamed from: com.google.common.hash.i$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicLongArray f360260a;

        /* renamed from: b, reason: collision with root package name */
        public final B f360261b;

        public c(long[] jArr) {
            com.google.common.base.M.d("data length is zero!", jArr.length > 0);
            this.f360260a = new AtomicLongArray(jArr);
            this.f360261b = C.f360192a.get();
            long jBitCount = 0;
            for (long j12 : jArr) {
                jBitCount += Long.bitCount(j12);
            }
            this.f360261b.add(jBitCount);
        }

        public static long[] a(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i12 = 0; i12 < length; i12++) {
                jArr[i12] = atomicLongArray.get(i12);
            }
            return jArr;
        }

        public final boolean equals(@I41.a Object obj) {
            if (obj instanceof c) {
                return Arrays.equals(a(this.f360260a), a(((c) obj).f360260a));
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(a(this.f360260a));
        }
    }

    public EnumC37494i() {
        throw null;
    }

    public EnumC37494i(String str, int i12, a aVar) {
    }

    public static EnumC37494i valueOf(String str) {
        return (EnumC37494i) Enum.valueOf(EnumC37494i.class, str);
    }

    public static EnumC37494i[] values() {
        return (EnumC37494i[]) f360259b.clone();
    }
}
