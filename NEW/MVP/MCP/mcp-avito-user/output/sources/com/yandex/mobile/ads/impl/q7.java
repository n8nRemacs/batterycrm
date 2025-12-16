package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.embedded.guava.collect.p;
import com.yandex.mobile.ads.impl.cu;
import j.InterfaceC42153i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes8.dex */
public final class q7 extends hf {

    /* renamed from: f, reason: collision with root package name */
    private final pd f389096f;

    /* renamed from: g, reason: collision with root package name */
    private final hj f389097g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f389098a;

        /* renamed from: b, reason: collision with root package name */
        public final long f389099b;

        public a(long j12, long j13) {
            this.f389098a = j12;
            this.f389099b = j13;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f389098a == aVar.f389098a && this.f389099b == aVar.f389099b;
        }

        public final int hashCode() {
            return (((int) this.f389098a) * 31) + ((int) this.f389099b);
        }
    }

    public static class b implements cu.b {
        public b(int i12) {
            this((Object) null);
        }

        public b(Object obj) {
        }
    }

    public q7(v91 v91Var, int[] iArr, int i12, pd pdVar, long j12, long j13, com.yandex.mobile.ads.embedded.guava.collect.p pVar, hj hjVar) {
        super(v91Var, iArr);
        if (j13 < j12) {
            ka0.d("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
        }
        this.f389096f = pdVar;
        com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) pVar);
        this.f389097g = hjVar;
    }

    @Override // com.yandex.mobile.ads.impl.hf, com.yandex.mobile.ads.impl.cu
    public final void a(float f12) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.yandex.mobile.ads.embedded.guava.collect.p a(cu.a[] aVarArr) {
        int i12;
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        for (cu.a aVar : aVarArr) {
            if (aVar == null || aVar.f384457b.length <= 1) {
                arrayList.add(null);
            } else {
                int i14 = com.yandex.mobile.ads.embedded.guava.collect.p.f382791c;
                p.a aVar2 = new p.a();
                aVar2.b(new a(0L, 0L));
                arrayList.add(aVar2);
            }
        }
        int length = aVarArr.length;
        long[][] jArr = new long[length][];
        for (int i15 = 0; i15 < aVarArr.length; i15++) {
            cu.a aVar3 = aVarArr[i15];
            if (aVar3 == null) {
                jArr[i15] = new long[0];
            } else {
                jArr[i15] = new long[aVar3.f384457b.length];
                int i16 = 0;
                while (true) {
                    if (i16 >= aVar3.f384457b.length) {
                        break;
                    }
                    jArr[i15][i16] = aVar3.f384456a.a(r11[i16]).f391177h;
                    i16++;
                }
                Arrays.sort(jArr[i15]);
            }
        }
        int[] iArr = new int[length];
        long[] jArr2 = new long[length];
        for (int i17 = 0; i17 < length; i17++) {
            long[] jArr3 = jArr[i17];
            jArr2[i17] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        a(arrayList, jArr2);
        ej0 ej0VarB = com.yandex.mobile.ads.embedded.guava.collect.z.a().a().b();
        int i18 = 0;
        while (i18 < length) {
            long[] jArr4 = jArr[i18];
            if (jArr4.length <= 1) {
                i12 = length;
            } else {
                int length2 = jArr4.length;
                double[] dArr = new double[length2];
                int i19 = i13;
                while (true) {
                    long[] jArr5 = jArr[i18];
                    double dLog = 0.0d;
                    if (i19 >= jArr5.length) {
                        break;
                    }
                    int i22 = length;
                    long j12 = jArr5[i19];
                    if (j12 != -1) {
                        dLog = Math.log(j12);
                    }
                    dArr[i19] = dLog;
                    i19++;
                    length = i22;
                }
                i12 = length;
                int i23 = length2 - 1;
                double d12 = dArr[i23] - dArr[0];
                int i24 = 0;
                while (i24 < i23) {
                    double d13 = dArr[i24];
                    i24++;
                    ej0VarB.put(Double.valueOf(d12 == 0.0d ? 1.0d : (((d13 + dArr[i24]) * 0.5d) - dArr[0]) / d12), Integer.valueOf(i18));
                }
            }
            i18++;
            length = i12;
            i13 = 0;
        }
        com.yandex.mobile.ads.embedded.guava.collect.p pVarA = com.yandex.mobile.ads.embedded.guava.collect.p.a(ej0VarB.values());
        for (int i25 = 0; i25 < pVarA.size(); i25++) {
            int iIntValue = ((Integer) pVarA.get(i25)).intValue();
            int i26 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i26;
            jArr2[iIntValue] = jArr[iIntValue][i26];
            a(arrayList, jArr2);
        }
        for (int i27 = 0; i27 < aVarArr.length; i27++) {
            if (arrayList.get(i27) != null) {
                jArr2[i27] = jArr2[i27] * 2;
            }
        }
        a(arrayList, jArr2);
        p.a aVar4 = new p.a();
        for (int i28 = 0; i28 < arrayList.size(); i28++) {
            p.a aVar5 = (p.a) arrayList.get(i28);
            aVar4.b((Object) (aVar5 == null ? com.yandex.mobile.ads.embedded.guava.collect.p.i() : aVar5.a()));
        }
        return aVar4.a();
    }

    @Override // com.yandex.mobile.ads.impl.hf, com.yandex.mobile.ads.impl.cu
    @InterfaceC42153i
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.hf, com.yandex.mobile.ads.impl.cu
    @InterfaceC42153i
    public final void c() {
    }

    @Override // com.yandex.mobile.ads.impl.cu
    public final void e() {
    }

    private static void a(ArrayList arrayList, long[] jArr) {
        long j12 = 0;
        for (long j13 : jArr) {
            j12 += j13;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            p.a aVar = (p.a) arrayList.get(i12);
            if (aVar != null) {
                aVar.b(new a(j12, jArr[i12]));
            }
        }
    }
}
