package com.google.android.gms.internal.measurement;

import androidx.media3.common.C23088b;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzkv<T> implements zzlj<T> {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f350923p = new int[0];

    /* renamed from: q, reason: collision with root package name */
    public static final Unsafe f350924q = zzmo.j();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f350925a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f350926b;

    /* renamed from: c, reason: collision with root package name */
    public final int f350927c;

    /* renamed from: d, reason: collision with root package name */
    public final int f350928d;

    /* renamed from: e, reason: collision with root package name */
    public final zzkr f350929e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f350930f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f350931g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f350932h;

    /* renamed from: i, reason: collision with root package name */
    public final int f350933i;

    /* renamed from: j, reason: collision with root package name */
    public final int f350934j;

    /* renamed from: k, reason: collision with root package name */
    public final zzkz f350935k;

    /* renamed from: l, reason: collision with root package name */
    public final zzka f350936l;

    /* renamed from: m, reason: collision with root package name */
    public final zzmi<?, ?> f350937m;

    /* renamed from: n, reason: collision with root package name */
    public final zziu<?> f350938n;

    /* renamed from: o, reason: collision with root package name */
    public final zzko f350939o;

    public zzkv(int[] iArr, Object[] objArr, int i12, int i13, zzkr zzkrVar, int[] iArr2, int i14, int i15, zzkz zzkzVar, zzka zzkaVar, zzmi zzmiVar, zziu zziuVar, zzko zzkoVar) {
        this.f350925a = iArr;
        this.f350926b = objArr;
        this.f350927c = i12;
        this.f350928d = i13;
        this.f350931g = zzkrVar instanceof zzjf;
        this.f350930f = zziuVar != null && zziuVar.g(zzkrVar);
        this.f350932h = iArr2;
        this.f350933i = i14;
        this.f350934j = i15;
        this.f350935k = zzkzVar;
        this.f350936l = zzkaVar;
        this.f350937m = zzmiVar;
        this.f350938n = zziuVar;
        this.f350929e = zzkrVar;
        this.f350939o = zzkoVar;
    }

    public static void B(Object obj) {
        if (!C(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static boolean C(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzjf) {
            return ((zzjf) obj).m();
        }
        return true;
    }

    public static int c(byte[] bArr, int i12, int i13, zzmv zzmvVar, Class<?> cls, zzht zzhtVar) {
        switch (zzky.f350945a[zzmvVar.ordinal()]) {
            case 1:
                int iP2 = zzhq.p(bArr, i12, zzhtVar);
                zzhtVar.zzc = Boolean.valueOf(zzhtVar.zzb != 0);
                return iP2;
            case 2:
                return zzhq.j(bArr, i12, zzhtVar);
            case 3:
                zzhtVar.zzc = Double.valueOf(zzhq.a(i12, bArr));
                return i12 + 8;
            case 4:
            case 5:
                zzhtVar.zzc = Integer.valueOf(zzhq.n(i12, bArr));
                return i12 + 4;
            case 6:
            case 7:
                zzhtVar.zzc = Long.valueOf(zzhq.q(i12, bArr));
                return i12 + 8;
            case 8:
                zzhtVar.zzc = Float.valueOf(zzhq.l(i12, bArr));
                return i12 + 4;
            case 9:
            case 10:
            case 11:
                int iO2 = zzhq.o(bArr, i12, zzhtVar);
                zzhtVar.zzc = Integer.valueOf(zzhtVar.zza);
                return iO2;
            case 12:
            case 13:
                int iP3 = zzhq.p(bArr, i12, zzhtVar);
                zzhtVar.zzc = Long.valueOf(zzhtVar.zzb);
                return iP3;
            case 14:
                zzlj<T> zzljVarZza = zzlf.zza().zza((Class) cls);
                T tZza = zzljVarZza.zza();
                int i14 = zzhq.i(tZza, zzljVarZza, bArr, i12, i13, zzhtVar);
                zzljVarZza.zzc(tZza);
                zzhtVar.zzc = tZza;
                return i14;
            case 15:
                int iO3 = zzhq.o(bArr, i12, zzhtVar);
                zzhtVar.zzc = Integer.valueOf(zzij.zze(zzhtVar.zza));
                return iO3;
            case 16:
                int iP4 = zzhq.p(bArr, i12, zzhtVar);
                zzhtVar.zzc = Long.valueOf(zzij.zza(zzhtVar.zzb));
                return iP4;
            case 17:
                return zzhq.m(bArr, i12, zzhtVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0395  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.zzkv d(com.google.android.gms.internal.measurement.zzkp r33, com.google.android.gms.internal.measurement.zzkz r34, com.google.android.gms.internal.measurement.zzka r35, com.google.android.gms.internal.measurement.zzmi r36, com.google.android.gms.internal.measurement.zziu r37, com.google.android.gms.internal.measurement.zzko r38) {
        /*
            Method dump skipped, instructions count: 1055
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkv.d(com.google.android.gms.internal.measurement.zzkp, com.google.android.gms.internal.measurement.zzkz, com.google.android.gms.internal.measurement.zzka, com.google.android.gms.internal.measurement.zzmi, com.google.android.gms.internal.measurement.zziu, com.google.android.gms.internal.measurement.zzko):com.google.android.gms.internal.measurement.zzkv");
    }

    public static Field h(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbB = C23088b.b("Field ", str, " for ", name, " not found. Known fields are ");
            sbB.append(string);
            throw new RuntimeException(sbB.toString());
        }
    }

    public static void i(int i12, Object obj, zzne zzneVar) {
        if (obj instanceof String) {
            zzneVar.zza(i12, (String) obj);
        } else {
            zzneVar.zza(i12, (zzhu) obj);
        }
    }

    public static int s(long j12, Object obj) {
        return ((Integer) zzmo.r(j12, obj)).intValue();
    }

    public static long w(long j12, Object obj) {
        return ((Long) zzmo.r(j12, obj)).longValue();
    }

    public static zzmh z(Object obj) {
        zzjf zzjfVar = (zzjf) obj;
        zzmh zzmhVar = zzjfVar.zzb;
        if (zzmhVar != zzmh.zzc()) {
            return zzmhVar;
        }
        zzmh zzmhVar2 = new zzmh();
        zzjfVar.zzb = zzmhVar2;
        return zzmhVar2;
    }

    public final Object A(int i12) {
        return this.f350926b[(i12 / 3) << 1];
    }

    public final int a(int i12, int i13) {
        int[] iArr = this.f350925a;
        int length = (iArr.length / 3) - 1;
        while (i13 <= length) {
            int i14 = (length + i13) >>> 1;
            int i15 = i14 * 3;
            int i16 = iArr[i15];
            if (i12 == i16) {
                return i15;
            }
            if (i12 < i16) {
                length = i14 - 1;
            } else {
                i13 = i14 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:428:0x099e, code lost:
    
        throw com.google.android.gms.internal.measurement.zzjq.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0c71, code lost:
    
        if (r14 == 1048575) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0c73, code lost:
    
        r29.putInt(r7, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0c79, code lost:
    
        r3 = null;
        r10 = r6.f350933i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0c80, code lost:
    
        if (r10 >= r6.f350934j) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0c82, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.zzmh) g(r32, r6.f350932h[r10], r3, r6.f350937m, r32);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0c98, code lost:
    
        if (r3 == null) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0c9a, code lost:
    
        r6.f350937m.m(r7, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0c9f, code lost:
    
        if (r9 != 0) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0ca3, code lost:
    
        if (r8 != r35) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0caa, code lost:
    
        throw com.google.android.gms.internal.measurement.zzjq.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0cad, code lost:
    
        if (r8 > r35) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0caf, code lost:
    
        if (r11 != r9) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0cb1, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0cb6, code lost:
    
        throw com.google.android.gms.internal.measurement.zzjq.d();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0878 A[PHI: r7 r8 r9 r10 r11 r29
  0x0878: PHI (r7v33 com.google.android.gms.internal.measurement.zzht) = 
  (r7v10 com.google.android.gms.internal.measurement.zzht)
  (r7v11 com.google.android.gms.internal.measurement.zzht)
  (r7v12 com.google.android.gms.internal.measurement.zzht)
  (r7v18 com.google.android.gms.internal.measurement.zzht)
  (r7v25 com.google.android.gms.internal.measurement.zzht)
  (r7v34 com.google.android.gms.internal.measurement.zzht)
 binds: [B:375:0x0857, B:359:0x080c, B:343:0x07c0, B:268:0x0667, B:165:0x049d, B:140:0x03f5] A[DONT_GENERATE, DONT_INLINE]
  0x0878: PHI (r8v82 int) = (r8v48 int), (r8v49 int), (r8v50 int), (r8v65 int), (r8v76 int), (r8v83 int) binds: [B:375:0x0857, B:359:0x080c, B:343:0x07c0, B:268:0x0667, B:165:0x049d, B:140:0x03f5] A[DONT_GENERATE, DONT_INLINE]
  0x0878: PHI (r9v68 int) = (r9v48 int), (r9v49 int), (r9v50 int), (r9v53 int), (r9v62 int), (r9v69 int) binds: [B:375:0x0857, B:359:0x080c, B:343:0x07c0, B:268:0x0667, B:165:0x049d, B:140:0x03f5] A[DONT_GENERATE, DONT_INLINE]
  0x0878: PHI (r10v64 int) = (r10v48 int), (r10v49 int), (r10v50 int), (r10v53 int), (r10v59 int), (r10v65 int) binds: [B:375:0x0857, B:359:0x080c, B:343:0x07c0, B:268:0x0667, B:165:0x049d, B:140:0x03f5] A[DONT_GENERATE, DONT_INLINE]
  0x0878: PHI (r11v49 int) = (r11v32 int), (r11v33 int), (r11v34 int), (r11v44 int), (r11v46 int), (r11v50 int) binds: [B:375:0x0857, B:359:0x080c, B:343:0x07c0, B:268:0x0667, B:165:0x049d, B:140:0x03f5] A[DONT_GENERATE, DONT_INLINE]
  0x0878: PHI (r29v31 sun.misc.Unsafe) = 
  (r29v10 sun.misc.Unsafe)
  (r29v11 sun.misc.Unsafe)
  (r29v12 sun.misc.Unsafe)
  (r29v18 sun.misc.Unsafe)
  (r29v25 sun.misc.Unsafe)
  (r29v32 sun.misc.Unsafe)
 binds: [B:375:0x0857, B:359:0x080c, B:343:0x07c0, B:268:0x0667, B:165:0x049d, B:140:0x03f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0bf0 A[PHI: r1 r5 r6 r17 r23
  0x0bf0: PHI (r1v113 int) = 
  (r1v92 int)
  (r1v93 int)
  (r1v94 int)
  (r1v95 int)
  (r1v96 int)
  (r1v97 int)
  (r1v98 int)
  (r1v99 int)
  (r1v107 int)
  (r1v110 int)
  (r1v114 int)
 binds: [B:499:0x0bdd, B:496:0x0bc0, B:493:0x0ba3, B:490:0x0b87, B:487:0x0b6a, B:484:0x0b4c, B:477:0x0b25, B:463:0x0ae9, B:442:0x0a2e, B:437:0x09f7, B:433:0x09bf] A[DONT_GENERATE, DONT_INLINE]
  0x0bf0: PHI (r5v97 com.google.android.gms.internal.measurement.zzht) = 
  (r5v75 com.google.android.gms.internal.measurement.zzht)
  (r5v76 com.google.android.gms.internal.measurement.zzht)
  (r5v77 com.google.android.gms.internal.measurement.zzht)
  (r5v78 com.google.android.gms.internal.measurement.zzht)
  (r5v79 com.google.android.gms.internal.measurement.zzht)
  (r5v80 com.google.android.gms.internal.measurement.zzht)
  (r5v81 com.google.android.gms.internal.measurement.zzht)
  (r5v82 com.google.android.gms.internal.measurement.zzht)
  (r5v89 com.google.android.gms.internal.measurement.zzht)
  (r5v92 com.google.android.gms.internal.measurement.zzht)
  (r5v98 com.google.android.gms.internal.measurement.zzht)
 binds: [B:499:0x0bdd, B:496:0x0bc0, B:493:0x0ba3, B:490:0x0b87, B:487:0x0b6a, B:484:0x0b4c, B:477:0x0b25, B:463:0x0ae9, B:442:0x0a2e, B:437:0x09f7, B:433:0x09bf] A[DONT_GENERATE, DONT_INLINE]
  0x0bf0: PHI (r6v31 com.google.android.gms.internal.measurement.zzkv<T>) = 
  (r6v12 com.google.android.gms.internal.measurement.zzkv<T>)
  (r6v13 com.google.android.gms.internal.measurement.zzkv<T>)
  (r6v14 com.google.android.gms.internal.measurement.zzkv<T>)
  (r6v15 com.google.android.gms.internal.measurement.zzkv<T>)
  (r6v16 com.google.android.gms.internal.measurement.zzkv<T>)
  (r6v17 com.google.android.gms.internal.measurement.zzkv<T>)
  (r6v18 com.google.android.gms.internal.measurement.zzkv<T>)
  (r6v19 com.google.android.gms.internal.measurement.zzkv<T>)
  (r6v25 com.google.android.gms.internal.measurement.zzkv<T>)
  (r6v28 com.google.android.gms.internal.measurement.zzkv<T>)
  (r6v32 com.google.android.gms.internal.measurement.zzkv<T>)
 binds: [B:499:0x0bdd, B:496:0x0bc0, B:493:0x0ba3, B:490:0x0b87, B:487:0x0b6a, B:484:0x0b4c, B:477:0x0b25, B:463:0x0ae9, B:442:0x0a2e, B:437:0x09f7, B:433:0x09bf] A[DONT_GENERATE, DONT_INLINE]
  0x0bf0: PHI (r17v19 int) = 
  (r17v4 int)
  (r17v5 int)
  (r17v6 int)
  (r17v7 int)
  (r17v8 int)
  (r17v9 int)
  (r17v10 int)
  (r17v11 int)
  (r17v14 int)
  (r17v16 int)
  (r17v20 int)
 binds: [B:499:0x0bdd, B:496:0x0bc0, B:493:0x0ba3, B:490:0x0b87, B:487:0x0b6a, B:484:0x0b4c, B:477:0x0b25, B:463:0x0ae9, B:442:0x0a2e, B:437:0x09f7, B:433:0x09bf] A[DONT_GENERATE, DONT_INLINE]
  0x0bf0: PHI (r23v15 int) = 
  (r23v9 int)
  (r23v9 int)
  (r23v9 int)
  (r23v9 int)
  (r23v9 int)
  (r23v9 int)
  (r23v9 int)
  (r23v9 int)
  (r23v12 int)
  (r23v9 int)
  (r23v9 int)
 binds: [B:499:0x0bdd, B:496:0x0bc0, B:493:0x0ba3, B:490:0x0b87, B:487:0x0b6a, B:484:0x0b4c, B:477:0x0b25, B:463:0x0ae9, B:442:0x0a2e, B:437:0x09f7, B:433:0x09bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0bf5  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0c59  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x088a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:620:0x087b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v121, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(T r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.measurement.zzht r37) throws com.google.android.gms.internal.measurement.zzjq {
        /*
            Method dump skipped, instructions count: 3404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkv.b(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzht):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object e(int i12, int i13, Object obj) {
        zzlj zzljVarY = y(i13);
        if (!t(i12, i13, obj)) {
            return zzljVarY.zza();
        }
        Object object = f350924q.getObject(obj, r(i13) & 1048575);
        if (C(object)) {
            return object;
        }
        Object objZza = zzljVarY.zza();
        if (object != null) {
            zzljVarY.zza(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object f(int i12, Object obj) {
        zzlj zzljVarY = y(i12);
        long jR2 = r(i12) & 1048575;
        if (!u(i12, obj)) {
            return zzljVarY.zza();
        }
        Object object = f350924q.getObject(obj, jR2);
        if (C(object)) {
            return object;
        }
        Object objZza = zzljVarY.zza();
        if (object != null) {
            zzljVarY.zza(objZza, object);
        }
        return objZza;
    }

    public final <UT, UB> UB g(Object obj, int i12, UB ub2, zzmi<UT, UB> zzmiVar, Object obj2) {
        zzjm zzjmVarX;
        int i13 = this.f350925a[i12];
        Object objR = zzmo.r(r(i12) & 1048575, obj);
        if (objR == null || (zzjmVarX = x(i12)) == null) {
            return ub2;
        }
        zzko zzkoVar = this.f350939o;
        Map<?, ?> mapZze = zzkoVar.zze(objR);
        zzkm<?, ?> zzkmVarZza = zzkoVar.zza(A(i12));
        Iterator<Map.Entry<?, ?>> it = mapZze.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<?, ?> next = it.next();
            if (!zzjmVarX.zza(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = (UB) zzmiVar.n(obj2);
                }
                zzid zzidVar = new zzid(zziy.a(zzkmVarZza.zza, 1, next.getKey()) + zziy.a(zzkmVarZza.zzc, 2, next.getValue()), null);
                zzio zzioVarZzb = zzidVar.zzb();
                try {
                    Object key = next.getKey();
                    Object value = next.getValue();
                    zziy.e(zzioVarZzb, zzkmVarZza.zza, 1, key);
                    zziy.e(zzioVarZzb, zzkmVarZza.zzc, 2, value);
                    zzmiVar.f(ub2, i13, zzidVar.zza());
                    it.remove();
                } catch (IOException e12) {
                    throw new RuntimeException(e12);
                }
            }
        }
        return ub2;
    }

    public final void j(int i12, Object obj, Object obj2, int i13) {
        f350924q.putObject(obj, r(i13) & 1048575, obj2);
        o(i12, i13, obj);
    }

    public final void k(Object obj, int i12, zzlk zzlkVar) {
        if ((536870912 & i12) != 0) {
            zzmo.g(obj, i12 & 1048575, zzlkVar.zzr());
        } else if (this.f350931g) {
            zzmo.g(obj, i12 & 1048575, zzlkVar.zzq());
        } else {
            zzmo.g(obj, i12 & 1048575, zzlkVar.zzp());
        }
    }

    public final void l(T t12, int i12, Object obj) {
        f350924q.putObject(t12, r(i12) & 1048575, obj);
        p(i12, t12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(T t12, T t13, int i12) {
        if (u(i12, t13)) {
            long jR2 = r(i12) & 1048575;
            Unsafe unsafe = f350924q;
            Object object = unsafe.getObject(t13, jR2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f350925a[i12] + " is present but null: " + String.valueOf(t13));
            }
            zzlj zzljVarY = y(i12);
            if (!u(i12, t12)) {
                if (C(object)) {
                    Object objZza = zzljVarY.zza();
                    zzljVarY.zza(objZza, object);
                    unsafe.putObject(t12, jR2, objZza);
                } else {
                    unsafe.putObject(t12, jR2, object);
                }
                p(i12, t12);
                return;
            }
            Object object2 = unsafe.getObject(t12, jR2);
            if (!C(object2)) {
                Object objZza2 = zzljVarY.zza();
                zzljVarY.zza(objZza2, object2);
                unsafe.putObject(t12, jR2, objZza2);
                object2 = objZza2;
            }
            zzljVarY.zza(object2, object);
        }
    }

    public final boolean n(T t12, int i12, int i13, int i14, int i15) {
        return i13 == 1048575 ? u(i12, t12) : (i14 & i15) != 0;
    }

    public final void o(int i12, int i13, Object obj) {
        zzmo.e(obj, this.f350925a[i13 + 2] & 1048575, i12);
    }

    public final void p(int i12, Object obj) {
        int i13 = this.f350925a[i12 + 2];
        long j12 = 1048575 & i13;
        if (j12 == 1048575) {
            return;
        }
        zzmo.e(obj, j12, (1 << (i13 >>> 20)) | zzmo.f350998c.zzd(obj, j12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(int i12, Object obj, Object obj2) {
        int[] iArr = this.f350925a;
        int i13 = iArr[i12];
        if (t(i13, i12, obj2)) {
            long jR2 = r(i12) & 1048575;
            Unsafe unsafe = f350924q;
            Object object = unsafe.getObject(obj2, jR2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i12] + " is present but null: " + String.valueOf(obj2));
            }
            zzlj zzljVarY = y(i12);
            if (!t(i13, i12, obj)) {
                if (C(object)) {
                    Object objZza = zzljVarY.zza();
                    zzljVarY.zza(objZza, object);
                    unsafe.putObject(obj, jR2, objZza);
                } else {
                    unsafe.putObject(obj, jR2, object);
                }
                o(i13, i12, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jR2);
            if (!C(object2)) {
                Object objZza2 = zzljVarY.zza();
                zzljVarY.zza(objZza2, object2);
                unsafe.putObject(obj, jR2, objZza2);
                object2 = objZza2;
            }
            zzljVarY.zza(object2, object);
        }
    }

    public final int r(int i12) {
        return this.f350925a[i12 + 1];
    }

    public final boolean t(int i12, int i13, Object obj) {
        return zzmo.f350998c.zzd(obj, (long) (this.f350925a[i13 + 2] & 1048575)) == i12;
    }

    public final boolean u(int i12, Object obj) {
        int i13 = this.f350925a[i12 + 2];
        long j12 = i13 & 1048575;
        if (j12 != 1048575) {
            return ((1 << (i13 >>> 20)) & zzmo.f350998c.zzd(obj, j12)) != 0;
        }
        int iR2 = r(i12);
        long j13 = iR2 & 1048575;
        switch ((iR2 & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzmo.f350998c.zza(obj, j13)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmo.f350998c.zzb(obj, j13)) != 0;
            case 2:
                return zzmo.f350998c.zze(obj, j13) != 0;
            case 3:
                return zzmo.f350998c.zze(obj, j13) != 0;
            case 4:
                return zzmo.f350998c.zzd(obj, j13) != 0;
            case 5:
                return zzmo.f350998c.zze(obj, j13) != 0;
            case 6:
                return zzmo.f350998c.zzd(obj, j13) != 0;
            case 7:
                return zzmo.f350998c.zzc(obj, j13);
            case 8:
                Object objR = zzmo.r(j13, obj);
                if (objR instanceof String) {
                    return !((String) objR).isEmpty();
                }
                if (objR instanceof zzhu) {
                    return !zzhu.zza.equals(objR);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmo.r(j13, obj) != null;
            case 10:
                return !zzhu.zza.equals(zzmo.r(j13, obj));
            case 11:
                return zzmo.f350998c.zzd(obj, j13) != 0;
            case 12:
                return zzmo.f350998c.zzd(obj, j13) != 0;
            case 13:
                return zzmo.f350998c.zzd(obj, j13) != 0;
            case 14:
                return zzmo.f350998c.zze(obj, j13) != 0;
            case 15:
                return zzmo.f350998c.zzd(obj, j13) != 0;
            case 16:
                return zzmo.f350998c.zze(obj, j13) != 0;
            case 17:
                return zzmo.r(j13, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean v(int i12, Object obj, Object obj2) {
        return u(i12, obj) == u(i12, obj2);
    }

    public final zzjm x(int i12) {
        return (zzjm) this.f350926b[((i12 / 3) << 1) + 1];
    }

    public final zzlj y(int i12) {
        int i13 = (i12 / 3) << 1;
        Object[] objArr = this.f350926b;
        zzlj zzljVar = (zzlj) objArr[i13];
        if (zzljVar != null) {
            return zzljVar;
        }
        zzlj<T> zzljVarZza = zzlf.zza().zza((Class) objArr[i13 + 1]);
        objArr[i13] = zzljVarZza;
        return zzljVarZza;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzlj
    public final int zza(T t12) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iZza;
        int iZzb;
        int iN2;
        int iO2;
        int iZzi;
        int iZzj;
        int iZza2;
        Unsafe unsafe = f350924q;
        int i16 = 0;
        int i17 = 1048575;
        int i18 = 0;
        int i19 = 0;
        int iA2 = 0;
        int i22 = 1048575;
        while (true) {
            int[] iArr = this.f350925a;
            if (i19 < iArr.length) {
                int iR2 = r(i19);
                int i23 = (267386880 & iR2) >>> 20;
                int i24 = iArr[i19];
                int i25 = iArr[i19 + 2];
                int i26 = i25 & i17;
                if (i23 <= 17) {
                    if (i26 != i22) {
                        i18 = i26 == i17 ? i16 : unsafe.getInt(t12, i26);
                        i22 = i26;
                    }
                    i12 = i22;
                    i13 = i18;
                    i14 = 1 << (i25 >>> 20);
                } else {
                    i12 = i22;
                    i13 = i18;
                    i14 = i16;
                }
                long j12 = iR2 & i17;
                if (i23 >= zziz.zza.zza()) {
                    zziz.zzb.zza();
                }
                switch (i23) {
                    case 0:
                        i15 = i16;
                        if (n(t12, i19, i12, i13, i14)) {
                            iZza = zzio.zza(i24, 0.0d);
                            iA2 += iZza;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        i15 = i16;
                        if (n(t12, i19, i12, i13, i14)) {
                            iZza = zzio.zza(i24, 0.0f);
                            iA2 += iZza;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        i15 = i16;
                        if (n(t12, i19, i12, i13, i14)) {
                            iZza = zzio.zzd(i24, unsafe.getLong(t12, j12));
                            iA2 += iZza;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        i15 = i16;
                        if (n(t12, i19, i12, i13, i14)) {
                            iZza = zzio.zzg(i24, unsafe.getLong(t12, j12));
                            iA2 += iZza;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        i15 = i16;
                        if (n(t12, i19, i12, i13, i14)) {
                            iZza = zzio.zzg(i24, unsafe.getInt(t12, j12));
                            iA2 += iZza;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        i15 = i16;
                        if (n(t12, i19, i12, i13, i14)) {
                            iZza = zzio.zzc(i24, 0L);
                            iA2 += iZza;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (n(t12, i19, i12, i13, i14)) {
                            i15 = 0;
                            iZza = zzio.zzf(i24, 0);
                            iA2 += iZza;
                            break;
                        }
                        i15 = 0;
                        break;
                    case 7:
                        if (n(t12, i19, i12, i13, i14)) {
                            iZzb = zzio.zzb(i24, true);
                            iA2 += iZzb;
                        }
                        i15 = 0;
                        break;
                    case 8:
                        if (n(t12, i19, i12, i13, i14)) {
                            Object object = unsafe.getObject(t12, j12);
                            iZzb = object instanceof zzhu ? zzio.zzc(i24, (zzhu) object) : zzio.zzb(i24, (String) object);
                            iA2 += iZzb;
                        }
                        i15 = 0;
                        break;
                    case 9:
                        if (n(t12, i19, i12, i13, i14)) {
                            iA2 += zzll.a(i24, unsafe.getObject(t12, j12), y(i19));
                        }
                        i15 = 0;
                        break;
                    case 10:
                        if (n(t12, i19, i12, i13, i14)) {
                            iZzb = zzio.zzc(i24, (zzhu) unsafe.getObject(t12, j12));
                            iA2 += iZzb;
                        }
                        i15 = 0;
                        break;
                    case 11:
                        if (n(t12, i19, i12, i13, i14)) {
                            iZzb = zzio.zzj(i24, unsafe.getInt(t12, j12));
                            iA2 += iZzb;
                        }
                        i15 = 0;
                        break;
                    case 12:
                        if (n(t12, i19, i12, i13, i14)) {
                            iZzb = zzio.zze(i24, unsafe.getInt(t12, j12));
                            iA2 += iZzb;
                        }
                        i15 = 0;
                        break;
                    case 13:
                        if (n(t12, i19, i12, i13, i14)) {
                            iA2 += zzio.zzh(i24, 0);
                        }
                        i15 = 0;
                        break;
                    case 14:
                        if (n(t12, i19, i12, i13, i14)) {
                            iZzb = zzio.zze(i24, 0L);
                            iA2 += iZzb;
                        }
                        i15 = 0;
                        break;
                    case 15:
                        if (n(t12, i19, i12, i13, i14)) {
                            iZzb = zzio.zzi(i24, unsafe.getInt(t12, j12));
                            iA2 += iZzb;
                        }
                        i15 = 0;
                        break;
                    case 16:
                        if (n(t12, i19, i12, i13, i14)) {
                            iZzb = zzio.zzf(i24, unsafe.getLong(t12, j12));
                            iA2 += iZzb;
                        }
                        i15 = 0;
                        break;
                    case 17:
                        if (n(t12, i19, i12, i13, i14)) {
                            iZzb = zzio.b(i24, (zzkr) unsafe.getObject(t12, j12), y(i19));
                            iA2 += iZzb;
                        }
                        i15 = 0;
                        break;
                    case 18:
                        iN2 = zzll.n(i24, (List) unsafe.getObject(t12, j12));
                        iA2 += iN2;
                        i15 = i16;
                        break;
                    case 19:
                        iN2 = zzll.l(i24, (List) unsafe.getObject(t12, j12));
                        iA2 += iN2;
                        i15 = i16;
                        break;
                    case 20:
                        iN2 = zzll.r(i24, (List) unsafe.getObject(t12, j12));
                        iA2 += iN2;
                        i15 = i16;
                        break;
                    case 21:
                        iN2 = zzll.z(i24, (List) unsafe.getObject(t12, j12));
                        iA2 += iN2;
                        i15 = i16;
                        break;
                    case 22:
                        iN2 = zzll.p(i24, (List) unsafe.getObject(t12, j12));
                        iA2 += iN2;
                        i15 = i16;
                        break;
                    case 23:
                        iN2 = zzll.n(i24, (List) unsafe.getObject(t12, j12));
                        iA2 += iN2;
                        i15 = i16;
                        break;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        iN2 = zzll.l(i24, (List) unsafe.getObject(t12, j12));
                        iA2 += iN2;
                        i15 = i16;
                        break;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        iN2 = zzll.b(i24, (List) unsafe.getObject(t12, j12));
                        iA2 += iN2;
                        i15 = i16;
                        break;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        iN2 = zzll.k(i24, (List) unsafe.getObject(t12, j12));
                        iA2 += iN2;
                        i15 = i16;
                        break;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        iN2 = zzll.i(i24, (List) unsafe.getObject(t12, j12), y(i19));
                        iA2 += iN2;
                        i15 = i16;
                        break;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        iN2 = zzll.g(i24, (List) unsafe.getObject(t12, j12));
                        iA2 += iN2;
                        i15 = i16;
                        break;
                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        iN2 = zzll.x(i24, (List) unsafe.getObject(t12, j12));
                        iA2 += iN2;
                        i15 = i16;
                        break;
                    case 30:
                        iN2 = zzll.h(i24, (List) unsafe.getObject(t12, j12));
                        iA2 += iN2;
                        i15 = i16;
                        break;
                    case 31:
                        iN2 = zzll.l(i24, (List) unsafe.getObject(t12, j12));
                        iA2 += iN2;
                        i15 = i16;
                        break;
                    case 32:
                        iN2 = zzll.n(i24, (List) unsafe.getObject(t12, j12));
                        iA2 += iN2;
                        i15 = i16;
                        break;
                    case 33:
                        iN2 = zzll.t(i24, (List) unsafe.getObject(t12, j12));
                        iA2 += iN2;
                        i15 = i16;
                        break;
                    case 34:
                        iN2 = zzll.v(i24, (List) unsafe.getObject(t12, j12));
                        iA2 += iN2;
                        i15 = i16;
                        break;
                    case 35:
                        iO2 = zzll.o((List) unsafe.getObject(t12, j12));
                        if (iO2 > 0) {
                            iZzi = zzio.zzi(i24);
                            iZzj = zzio.zzj(iO2);
                            iA2 += iZzj + iZzi + iO2;
                        }
                        i15 = i16;
                        break;
                    case 36:
                        iO2 = zzll.m((List) unsafe.getObject(t12, j12));
                        if (iO2 > 0) {
                            iZzi = zzio.zzi(i24);
                            iZzj = zzio.zzj(iO2);
                            iA2 += iZzj + iZzi + iO2;
                        }
                        i15 = i16;
                        break;
                    case 37:
                        iO2 = zzll.s((List) unsafe.getObject(t12, j12));
                        if (iO2 > 0) {
                            iZzi = zzio.zzi(i24);
                            iZzj = zzio.zzj(iO2);
                            iA2 += iZzj + iZzi + iO2;
                        }
                        i15 = i16;
                        break;
                    case 38:
                        iO2 = zzll.A((List) unsafe.getObject(t12, j12));
                        if (iO2 > 0) {
                            iZzi = zzio.zzi(i24);
                            iZzj = zzio.zzj(iO2);
                            iA2 += iZzj + iZzi + iO2;
                        }
                        i15 = i16;
                        break;
                    case 39:
                        iO2 = zzll.q((List) unsafe.getObject(t12, j12));
                        if (iO2 > 0) {
                            iZzi = zzio.zzi(i24);
                            iZzj = zzio.zzj(iO2);
                            iA2 += iZzj + iZzi + iO2;
                        }
                        i15 = i16;
                        break;
                    case 40:
                        iO2 = zzll.o((List) unsafe.getObject(t12, j12));
                        if (iO2 > 0) {
                            iZzi = zzio.zzi(i24);
                            iZzj = zzio.zzj(iO2);
                            iA2 += iZzj + iZzi + iO2;
                        }
                        i15 = i16;
                        break;
                    case 41:
                        iO2 = zzll.m((List) unsafe.getObject(t12, j12));
                        if (iO2 > 0) {
                            iZzi = zzio.zzi(i24);
                            iZzj = zzio.zzj(iO2);
                            iA2 += iZzj + iZzi + iO2;
                        }
                        i15 = i16;
                        break;
                    case 42:
                        iO2 = zzll.d((List) unsafe.getObject(t12, j12));
                        if (iO2 > 0) {
                            iZzi = zzio.zzi(i24);
                            iZzj = zzio.zzj(iO2);
                            iA2 += iZzj + iZzi + iO2;
                        }
                        i15 = i16;
                        break;
                    case 43:
                        iO2 = zzll.y((List) unsafe.getObject(t12, j12));
                        if (iO2 > 0) {
                            iZzi = zzio.zzi(i24);
                            iZzj = zzio.zzj(iO2);
                            iA2 += iZzj + iZzi + iO2;
                        }
                        i15 = i16;
                        break;
                    case 44:
                        iO2 = zzll.j((List) unsafe.getObject(t12, j12));
                        if (iO2 > 0) {
                            iZzi = zzio.zzi(i24);
                            iZzj = zzio.zzj(iO2);
                            iA2 += iZzj + iZzi + iO2;
                        }
                        i15 = i16;
                        break;
                    case 45:
                        iO2 = zzll.m((List) unsafe.getObject(t12, j12));
                        if (iO2 > 0) {
                            iZzi = zzio.zzi(i24);
                            iZzj = zzio.zzj(iO2);
                            iA2 += iZzj + iZzi + iO2;
                        }
                        i15 = i16;
                        break;
                    case 46:
                        iO2 = zzll.o((List) unsafe.getObject(t12, j12));
                        if (iO2 > 0) {
                            iZzi = zzio.zzi(i24);
                            iZzj = zzio.zzj(iO2);
                            iA2 += iZzj + iZzi + iO2;
                        }
                        i15 = i16;
                        break;
                    case 47:
                        iO2 = zzll.u((List) unsafe.getObject(t12, j12));
                        if (iO2 > 0) {
                            iZzi = zzio.zzi(i24);
                            iZzj = zzio.zzj(iO2);
                            iA2 += iZzj + iZzi + iO2;
                        }
                        i15 = i16;
                        break;
                    case 48:
                        iO2 = zzll.w((List) unsafe.getObject(t12, j12));
                        if (iO2 > 0) {
                            iZzi = zzio.zzi(i24);
                            iZzj = zzio.zzj(iO2);
                            iA2 += iZzj + iZzi + iO2;
                        }
                        i15 = i16;
                        break;
                    case 49:
                        iN2 = zzll.c(i24, (List) unsafe.getObject(t12, j12), y(i19));
                        iA2 += iN2;
                        i15 = i16;
                        break;
                    case 50:
                        iN2 = this.f350939o.zza(i24, unsafe.getObject(t12, j12), A(i19));
                        iA2 += iN2;
                        i15 = i16;
                        break;
                    case 51:
                        if (t(i24, i19, t12)) {
                            iZza2 = zzio.zza(i24, 0.0d);
                            iA2 += iZza2;
                        }
                        i15 = i16;
                        break;
                    case 52:
                        if (t(i24, i19, t12)) {
                            iZza2 = zzio.zza(i24, 0.0f);
                            iA2 += iZza2;
                        }
                        i15 = i16;
                        break;
                    case 53:
                        if (t(i24, i19, t12)) {
                            iZza2 = zzio.zzd(i24, w(j12, t12));
                            iA2 += iZza2;
                        }
                        i15 = i16;
                        break;
                    case 54:
                        if (t(i24, i19, t12)) {
                            iZza2 = zzio.zzg(i24, w(j12, t12));
                            iA2 += iZza2;
                        }
                        i15 = i16;
                        break;
                    case 55:
                        if (t(i24, i19, t12)) {
                            iZza2 = zzio.zzg(i24, s(j12, t12));
                            iA2 += iZza2;
                        }
                        i15 = i16;
                        break;
                    case 56:
                        if (t(i24, i19, t12)) {
                            iZza2 = zzio.zzc(i24, 0L);
                            iA2 += iZza2;
                        }
                        i15 = i16;
                        break;
                    case 57:
                        if (t(i24, i19, t12)) {
                            iZza2 = zzio.zzf(i24, i16);
                            iA2 += iZza2;
                        }
                        i15 = i16;
                        break;
                    case 58:
                        if (t(i24, i19, t12)) {
                            iZza2 = zzio.zzb(i24, true);
                            iA2 += iZza2;
                        }
                        i15 = i16;
                        break;
                    case 59:
                        if (t(i24, i19, t12)) {
                            Object object2 = unsafe.getObject(t12, j12);
                            iZza2 = object2 instanceof zzhu ? zzio.zzc(i24, (zzhu) object2) : zzio.zzb(i24, (String) object2);
                            iA2 += iZza2;
                        }
                        i15 = i16;
                        break;
                    case 60:
                        if (t(i24, i19, t12)) {
                            iN2 = zzll.a(i24, unsafe.getObject(t12, j12), y(i19));
                            iA2 += iN2;
                        }
                        i15 = i16;
                        break;
                    case 61:
                        if (t(i24, i19, t12)) {
                            iZza2 = zzio.zzc(i24, (zzhu) unsafe.getObject(t12, j12));
                            iA2 += iZza2;
                        }
                        i15 = i16;
                        break;
                    case 62:
                        if (t(i24, i19, t12)) {
                            iZza2 = zzio.zzj(i24, s(j12, t12));
                            iA2 += iZza2;
                        }
                        i15 = i16;
                        break;
                    case 63:
                        if (t(i24, i19, t12)) {
                            iZza2 = zzio.zze(i24, s(j12, t12));
                            iA2 += iZza2;
                        }
                        i15 = i16;
                        break;
                    case 64:
                        if (t(i24, i19, t12)) {
                            iZza2 = zzio.zzh(i24, i16);
                            iA2 += iZza2;
                        }
                        i15 = i16;
                        break;
                    case 65:
                        if (t(i24, i19, t12)) {
                            iZza2 = zzio.zze(i24, 0L);
                            iA2 += iZza2;
                        }
                        i15 = i16;
                        break;
                    case 66:
                        if (t(i24, i19, t12)) {
                            iZza2 = zzio.zzi(i24, s(j12, t12));
                            iA2 += iZza2;
                        }
                        i15 = i16;
                        break;
                    case 67:
                        if (t(i24, i19, t12)) {
                            iZza2 = zzio.zzf(i24, w(j12, t12));
                            iA2 += iZza2;
                        }
                        i15 = i16;
                        break;
                    case 68:
                        if (t(i24, i19, t12)) {
                            iZza2 = zzio.b(i24, (zzkr) unsafe.getObject(t12, j12), y(i19));
                            iA2 += iZza2;
                        }
                        i15 = i16;
                        break;
                    default:
                        i15 = i16;
                        break;
                }
                i19 += 3;
                i22 = i12;
                i16 = i15;
                i18 = i13;
                i17 = 1048575;
            } else {
                int iZza3 = i16;
                zzmi<?, ?> zzmiVar = this.f350937m;
                int iA3 = iA2 + zzmiVar.a(zzmiVar.p(t12));
                if (!this.f350930f) {
                    return iA3;
                }
                zziy<T> zziyVarB = this.f350938n.b(t12);
                int i27 = iZza3;
                while (true) {
                    int iZzb2 = zziyVarB.f350881a.zzb();
                    zzln zzlnVar = zziyVarB.f350881a;
                    if (i27 >= iZzb2) {
                        for (Map.Entry entry : zzlnVar.zzc()) {
                            iZza3 += zziy.zza((zzja) entry.getKey(), entry.getValue());
                        }
                        return iA3 + iZza3;
                    }
                    Map.Entry entryZzb = zzlnVar.zzb(i27);
                    iZza3 += zziy.zza((zzja) entryZzb.getKey(), entryZzb.getValue());
                    i27++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final int zzb(T t12) {
        int i12;
        int iZza;
        int i13;
        int iZzd;
        int[] iArr = this.f350925a;
        int length = iArr.length;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15 += 3) {
            int iR2 = r(i15);
            int i16 = iArr[i15];
            long j12 = 1048575 & iR2;
            int iHashCode = 37;
            switch ((iR2 & 267386880) >>> 20) {
                case 0:
                    i12 = i14 * 53;
                    iZza = zzjh.zza(Double.doubleToLongBits(zzmo.f350998c.zza(t12, j12)));
                    i14 = iZza + i12;
                    break;
                case 1:
                    i12 = i14 * 53;
                    iZza = Float.floatToIntBits(zzmo.f350998c.zzb(t12, j12));
                    i14 = iZza + i12;
                    break;
                case 2:
                    i12 = i14 * 53;
                    iZza = zzjh.zza(zzmo.f350998c.zze(t12, j12));
                    i14 = iZza + i12;
                    break;
                case 3:
                    i12 = i14 * 53;
                    iZza = zzjh.zza(zzmo.f350998c.zze(t12, j12));
                    i14 = iZza + i12;
                    break;
                case 4:
                    i13 = i14 * 53;
                    iZzd = zzmo.f350998c.zzd(t12, j12);
                    i14 = i13 + iZzd;
                    break;
                case 5:
                    i12 = i14 * 53;
                    iZza = zzjh.zza(zzmo.f350998c.zze(t12, j12));
                    i14 = iZza + i12;
                    break;
                case 6:
                    i13 = i14 * 53;
                    iZzd = zzmo.f350998c.zzd(t12, j12);
                    i14 = i13 + iZzd;
                    break;
                case 7:
                    i12 = i14 * 53;
                    iZza = zzjh.zza(zzmo.f350998c.zzc(t12, j12));
                    i14 = iZza + i12;
                    break;
                case 8:
                    i12 = i14 * 53;
                    iZza = ((String) zzmo.r(j12, t12)).hashCode();
                    i14 = iZza + i12;
                    break;
                case 9:
                    Object objR = zzmo.r(j12, t12);
                    if (objR != null) {
                        iHashCode = objR.hashCode();
                    }
                    i14 = (i14 * 53) + iHashCode;
                    break;
                case 10:
                    i12 = i14 * 53;
                    iZza = zzmo.r(j12, t12).hashCode();
                    i14 = iZza + i12;
                    break;
                case 11:
                    i13 = i14 * 53;
                    iZzd = zzmo.f350998c.zzd(t12, j12);
                    i14 = i13 + iZzd;
                    break;
                case 12:
                    i13 = i14 * 53;
                    iZzd = zzmo.f350998c.zzd(t12, j12);
                    i14 = i13 + iZzd;
                    break;
                case 13:
                    i13 = i14 * 53;
                    iZzd = zzmo.f350998c.zzd(t12, j12);
                    i14 = i13 + iZzd;
                    break;
                case 14:
                    i12 = i14 * 53;
                    iZza = zzjh.zza(zzmo.f350998c.zze(t12, j12));
                    i14 = iZza + i12;
                    break;
                case 15:
                    i13 = i14 * 53;
                    iZzd = zzmo.f350998c.zzd(t12, j12);
                    i14 = i13 + iZzd;
                    break;
                case 16:
                    i12 = i14 * 53;
                    iZza = zzjh.zza(zzmo.f350998c.zze(t12, j12));
                    i14 = iZza + i12;
                    break;
                case 17:
                    Object objR2 = zzmo.r(j12, t12);
                    if (objR2 != null) {
                        iHashCode = objR2.hashCode();
                    }
                    i14 = (i14 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i12 = i14 * 53;
                    iZza = zzmo.r(j12, t12).hashCode();
                    i14 = iZza + i12;
                    break;
                case 50:
                    i12 = i14 * 53;
                    iZza = zzmo.r(j12, t12).hashCode();
                    i14 = iZza + i12;
                    break;
                case 51:
                    if (t(i16, i15, t12)) {
                        i12 = i14 * 53;
                        iZza = zzjh.zza(Double.doubleToLongBits(((Double) zzmo.r(j12, t12)).doubleValue()));
                        i14 = iZza + i12;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (t(i16, i15, t12)) {
                        i12 = i14 * 53;
                        iZza = Float.floatToIntBits(((Float) zzmo.r(j12, t12)).floatValue());
                        i14 = iZza + i12;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (t(i16, i15, t12)) {
                        i12 = i14 * 53;
                        iZza = zzjh.zza(w(j12, t12));
                        i14 = iZza + i12;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (t(i16, i15, t12)) {
                        i12 = i14 * 53;
                        iZza = zzjh.zza(w(j12, t12));
                        i14 = iZza + i12;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (t(i16, i15, t12)) {
                        i13 = i14 * 53;
                        iZzd = s(j12, t12);
                        i14 = i13 + iZzd;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (t(i16, i15, t12)) {
                        i12 = i14 * 53;
                        iZza = zzjh.zza(w(j12, t12));
                        i14 = iZza + i12;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (t(i16, i15, t12)) {
                        i13 = i14 * 53;
                        iZzd = s(j12, t12);
                        i14 = i13 + iZzd;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (t(i16, i15, t12)) {
                        i12 = i14 * 53;
                        iZza = zzjh.zza(((Boolean) zzmo.r(j12, t12)).booleanValue());
                        i14 = iZza + i12;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (t(i16, i15, t12)) {
                        i12 = i14 * 53;
                        iZza = ((String) zzmo.r(j12, t12)).hashCode();
                        i14 = iZza + i12;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (t(i16, i15, t12)) {
                        i12 = i14 * 53;
                        iZza = zzmo.r(j12, t12).hashCode();
                        i14 = iZza + i12;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (t(i16, i15, t12)) {
                        i12 = i14 * 53;
                        iZza = zzmo.r(j12, t12).hashCode();
                        i14 = iZza + i12;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (t(i16, i15, t12)) {
                        i13 = i14 * 53;
                        iZzd = s(j12, t12);
                        i14 = i13 + iZzd;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (t(i16, i15, t12)) {
                        i13 = i14 * 53;
                        iZzd = s(j12, t12);
                        i14 = i13 + iZzd;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (t(i16, i15, t12)) {
                        i13 = i14 * 53;
                        iZzd = s(j12, t12);
                        i14 = i13 + iZzd;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (t(i16, i15, t12)) {
                        i12 = i14 * 53;
                        iZza = zzjh.zza(w(j12, t12));
                        i14 = iZza + i12;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (t(i16, i15, t12)) {
                        i13 = i14 * 53;
                        iZzd = s(j12, t12);
                        i14 = i13 + iZzd;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (t(i16, i15, t12)) {
                        i12 = i14 * 53;
                        iZza = zzjh.zza(w(j12, t12));
                        i14 = iZza + i12;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (t(i16, i15, t12)) {
                        i12 = i14 * 53;
                        iZza = zzmo.r(j12, t12).hashCode();
                        i14 = iZza + i12;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.f350937m.p(t12).hashCode() + (i14 * 53);
        return this.f350930f ? (iHashCode2 * 53) + this.f350938n.b(t12).hashCode() : iHashCode2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    @Override // com.google.android.gms.internal.measurement.zzlj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc(T r9) {
        /*
            r8 = this;
            boolean r0 = C(r9)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r9 instanceof com.google.android.gms.internal.measurement.zzjf
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r9
            com.google.android.gms.internal.measurement.zzjf r0 = (com.google.android.gms.internal.measurement.zzjf) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.d(r2)
            r0.zza = r1
            r0.l()
        L1a:
            int[] r0 = r8.f350925a
            int r2 = r0.length
        L1d:
            if (r1 >= r2) goto L81
            int r3 = r8.r(r1)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r4 = (long) r4
            r6 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r6
            int r3 = r3 >>> 20
            r6 = 9
            if (r3 == r6) goto L6b
            r6 = 60
            if (r3 == r6) goto L55
            r6 = 68
            if (r3 == r6) goto L55
            switch(r3) {
                case 17: goto L6b;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L7e
        L3d:
            sun.misc.Unsafe r3 = com.google.android.gms.internal.measurement.zzkv.f350924q
            java.lang.Object r6 = r3.getObject(r9, r4)
            if (r6 == 0) goto L7e
            com.google.android.gms.internal.measurement.zzko r7 = r8.f350939o
            java.lang.Object r6 = r7.zzc(r6)
            r3.putObject(r9, r4, r6)
            goto L7e
        L4f:
            com.google.android.gms.internal.measurement.zzka r3 = r8.f350936l
            r3.c(r4, r9)
            goto L7e
        L55:
            r3 = r0[r1]
            boolean r3 = r8.t(r3, r1, r9)
            if (r3 == 0) goto L7e
            com.google.android.gms.internal.measurement.zzlj r3 = r8.y(r1)
            sun.misc.Unsafe r6 = com.google.android.gms.internal.measurement.zzkv.f350924q
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.zzc(r4)
            goto L7e
        L6b:
            boolean r3 = r8.u(r1, r9)
            if (r3 == 0) goto L7e
            com.google.android.gms.internal.measurement.zzlj r3 = r8.y(r1)
            sun.misc.Unsafe r6 = com.google.android.gms.internal.measurement.zzkv.f350924q
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.zzc(r4)
        L7e:
            int r1 = r1 + 3
            goto L1d
        L81:
            com.google.android.gms.internal.measurement.zzmi<?, ?> r0 = r8.f350937m
            r0.r(r9)
            boolean r0 = r8.f350930f
            if (r0 == 0) goto L8f
            com.google.android.gms.internal.measurement.zziu<?> r0 = r8.f350938n
            r0.j(r9)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkv.zzc(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.gms.internal.measurement.zzlj] */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.google.android.gms.internal.measurement.zzlj] */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.google.android.gms.internal.measurement.zzlj] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [com.google.android.gms.internal.measurement.zzlj] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    @Override // com.google.android.gms.internal.measurement.zzlj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzd(T r18) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkv.zzd(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    @Override // com.google.android.gms.internal.measurement.zzlj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzb(T r12, T r13) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkv.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final T zza() {
        return (T) this.f350935k.zza(this.f350929e);
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final void zza(T t12, T t13) {
        B(t12);
        t13.getClass();
        int i12 = 0;
        while (true) {
            int[] iArr = this.f350925a;
            if (i12 < iArr.length) {
                int iR2 = r(i12);
                long j12 = 1048575 & iR2;
                int i13 = iArr[i12];
                switch ((iR2 & 267386880) >>> 20) {
                    case 0:
                        if (!u(i12, t13)) {
                            break;
                        } else {
                            zzmo.c(t12, j12, zzmo.f350998c.zza(t13, j12));
                            p(i12, t12);
                            break;
                        }
                    case 1:
                        if (!u(i12, t13)) {
                            break;
                        } else {
                            zzmo.d(t12, j12, zzmo.f350998c.zzb(t13, j12));
                            p(i12, t12);
                            break;
                        }
                    case 2:
                        if (!u(i12, t13)) {
                            break;
                        } else {
                            zzmo.f(t12, j12, zzmo.f350998c.zze(t13, j12));
                            p(i12, t12);
                            break;
                        }
                    case 3:
                        if (!u(i12, t13)) {
                            break;
                        } else {
                            zzmo.f(t12, j12, zzmo.f350998c.zze(t13, j12));
                            p(i12, t12);
                            break;
                        }
                    case 4:
                        if (!u(i12, t13)) {
                            break;
                        } else {
                            zzmo.e(t12, j12, zzmo.f350998c.zzd(t13, j12));
                            p(i12, t12);
                            break;
                        }
                    case 5:
                        if (!u(i12, t13)) {
                            break;
                        } else {
                            zzmo.f(t12, j12, zzmo.f350998c.zze(t13, j12));
                            p(i12, t12);
                            break;
                        }
                    case 6:
                        if (!u(i12, t13)) {
                            break;
                        } else {
                            zzmo.e(t12, j12, zzmo.f350998c.zzd(t13, j12));
                            p(i12, t12);
                            break;
                        }
                    case 7:
                        if (!u(i12, t13)) {
                            break;
                        } else {
                            zzmo.n(t12, j12, zzmo.f350998c.zzc(t13, j12));
                            p(i12, t12);
                            break;
                        }
                    case 8:
                        if (!u(i12, t13)) {
                            break;
                        } else {
                            zzmo.g(t12, j12, zzmo.r(j12, t13));
                            p(i12, t12);
                            break;
                        }
                    case 9:
                        m(t12, t13, i12);
                        break;
                    case 10:
                        if (!u(i12, t13)) {
                            break;
                        } else {
                            zzmo.g(t12, j12, zzmo.r(j12, t13));
                            p(i12, t12);
                            break;
                        }
                    case 11:
                        if (!u(i12, t13)) {
                            break;
                        } else {
                            zzmo.e(t12, j12, zzmo.f350998c.zzd(t13, j12));
                            p(i12, t12);
                            break;
                        }
                    case 12:
                        if (!u(i12, t13)) {
                            break;
                        } else {
                            zzmo.e(t12, j12, zzmo.f350998c.zzd(t13, j12));
                            p(i12, t12);
                            break;
                        }
                    case 13:
                        if (!u(i12, t13)) {
                            break;
                        } else {
                            zzmo.e(t12, j12, zzmo.f350998c.zzd(t13, j12));
                            p(i12, t12);
                            break;
                        }
                    case 14:
                        if (!u(i12, t13)) {
                            break;
                        } else {
                            zzmo.f(t12, j12, zzmo.f350998c.zze(t13, j12));
                            p(i12, t12);
                            break;
                        }
                    case 15:
                        if (!u(i12, t13)) {
                            break;
                        } else {
                            zzmo.e(t12, j12, zzmo.f350998c.zzd(t13, j12));
                            p(i12, t12);
                            break;
                        }
                    case 16:
                        if (!u(i12, t13)) {
                            break;
                        } else {
                            zzmo.f(t12, j12, zzmo.f350998c.zze(t13, j12));
                            p(i12, t12);
                            break;
                        }
                    case 17:
                        m(t12, t13, i12);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f350936l.b(t12, j12, t13);
                        break;
                    case 50:
                        Class<?> cls = zzll.f350960a;
                        zzmo.g(t12, j12, this.f350939o.zza(zzmo.r(j12, t12), zzmo.r(j12, t13)));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!t(i13, i12, t13)) {
                            break;
                        } else {
                            zzmo.g(t12, j12, zzmo.r(j12, t13));
                            o(i13, i12, t12);
                            break;
                        }
                    case 60:
                        q(i12, t12, t13);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!t(i13, i12, t13)) {
                            break;
                        } else {
                            zzmo.g(t12, j12, zzmo.r(j12, t13));
                            o(i13, i12, t12);
                            break;
                        }
                    case 68:
                        q(i12, t12, t13);
                        break;
                }
                i12 += 3;
            } else {
                Class<?> cls2 = zzll.f350960a;
                zzmi<?, ?> zzmiVar = this.f350937m;
                zzmiVar.o(t12, zzmiVar.c(zzmiVar.p(t12), zzmiVar.p(t13)));
                if (this.f350930f) {
                    zziu<?> zziuVar = this.f350938n;
                    zziy<T> zziyVarB = zziuVar.b(t13);
                    if (zziyVarB.f350881a.isEmpty()) {
                        return;
                    }
                    zziuVar.i(t12).zza(zziyVarB);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0557 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {all -> 0x0067, blocks: (B:3:0x001a, B:5:0x0023, B:7:0x0027, B:19:0x004d, B:25:0x005d, B:27:0x0062, B:43:0x0092, B:44:0x0098, B:23:0x0055, B:45:0x0099, B:49:0x00ac, B:163:0x0552, B:165:0x0557, B:61:0x00d5, B:62:0x00e7, B:63:0x00fa, B:64:0x010d, B:65:0x0120, B:66:0x0133, B:68:0x013d, B:71:0x0144, B:73:0x0148, B:75:0x014f, B:76:0x0155, B:77:0x0164, B:78:0x0177, B:79:0x0186, B:80:0x0198, B:81:0x01a0, B:82:0x01b3, B:83:0x01c6, B:84:0x01d9, B:85:0x01ec, B:86:0x01ff, B:87:0x0212, B:88:0x0225, B:89:0x0238, B:92:0x024b, B:96:0x0264, B:93:0x0253, B:95:0x0259, B:97:0x0271, B:98:0x0281, B:99:0x028d, B:100:0x0299, B:101:0x02a5, B:102:0x02b1, B:103:0x02ca, B:104:0x02d6, B:105:0x02e2, B:106:0x02ee, B:107:0x02fa, B:108:0x0306, B:109:0x0312, B:110:0x031e, B:111:0x032a, B:112:0x0336, B:113:0x0342, B:114:0x034e, B:115:0x035a, B:116:0x0366, B:117:0x037f, B:118:0x038b, B:119:0x0397, B:120:0x03a7, B:124:0x03af, B:125:0x03bb, B:126:0x03c7, B:127:0x03d3, B:128:0x03df, B:129:0x03eb, B:130:0x03f7, B:131:0x0403, B:132:0x040f, B:133:0x041b, B:134:0x0427, B:135:0x0439, B:136:0x0448, B:137:0x0457, B:138:0x0466, B:139:0x0475, B:141:0x047f, B:144:0x0486, B:146:0x048a, B:148:0x0491, B:149:0x0497, B:150:0x04a2, B:151:0x04b1, B:152:0x04c0, B:153:0x04d2, B:154:0x04da, B:155:0x04e9, B:156:0x04f8, B:157:0x0507, B:158:0x0516, B:159:0x0525, B:160:0x0534, B:161:0x0543), top: B:183:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0564 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzlj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r19, com.google.android.gms.internal.measurement.zzlk r20, com.google.android.gms.internal.measurement.zzis r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkv.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzlk, com.google.android.gms.internal.measurement.zzis):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final void zza(T t12, byte[] bArr, int i12, int i13, zzht zzhtVar) throws zzjq {
        b(t12, bArr, i12, i13, 0, zzhtVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    @Override // com.google.android.gms.internal.measurement.zzlj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r27, com.google.android.gms.internal.measurement.zzne r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkv.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzne):void");
    }
}
