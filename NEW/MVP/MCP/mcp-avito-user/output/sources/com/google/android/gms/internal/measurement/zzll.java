package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzll {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f350960a;

    /* renamed from: b, reason: collision with root package name */
    public static final zzmi<?, ?> f350961b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzmk f350962c;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzmi<?, ?> zzmiVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f350960a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzmiVar = (zzmi) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        f350961b = zzmiVar;
        f350962c = new zzmk();
    }

    public static int A(List<Long> list) {
        int iZzg;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkg) {
            zzkg zzkgVar = (zzkg) list;
            iZzg = 0;
            while (i12 < size) {
                iZzg += zzio.zzg(zzkgVar.zzb(i12));
                i12++;
            }
        } else {
            iZzg = 0;
            while (i12 < size) {
                iZzg += zzio.zzg(list.get(i12).longValue());
                i12++;
            }
        }
        return iZzg;
    }

    public static int a(int i12, Object obj, zzlj zzljVar) {
        if (obj instanceof zzjv) {
            return zzio.zzb(i12, (zzjv) obj);
        }
        int iZzj = zzio.zzj(i12 << 3);
        int iA2 = ((zzhl) ((zzkr) obj)).a(zzljVar);
        return zzio.zzj(iA2) + iA2 + iZzj;
    }

    public static int b(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzio.zzb(i12, true) * size;
    }

    public static int c(int i12, List<zzkr> list, zzlj zzljVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB2 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iB2 += zzio.b(i12, list.get(i13), zzljVar);
        }
        return iB2;
    }

    public static int d(List<?> list) {
        return list.size();
    }

    public static <UT, UB> UB e(Object obj, int i12, List<Integer> list, zzjm zzjmVar, UB ub2, zzmi<UT, UB> zzmiVar) {
        if (zzjmVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                Integer num = list.get(i14);
                int iIntValue = num.intValue();
                if (zzjmVar.zza(iIntValue)) {
                    if (i14 != i13) {
                        list.set(i13, num);
                    }
                    i13++;
                } else {
                    if (ub2 == null) {
                        ub2 = (UB) zzmiVar.n(obj);
                    }
                    zzmiVar.k(i12, iIntValue, ub2);
                }
            }
            if (i13 != size) {
                list.subList(i13, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!zzjmVar.zza(iIntValue2)) {
                    if (ub2 == null) {
                        ub2 = (UB) zzmiVar.n(obj);
                    }
                    zzmiVar.k(i12, iIntValue2, ub2);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int g(int i12, List<zzhu> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = zzio.zzi(i12) * size;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iZzi += zzio.zzb(list.get(i13));
        }
        return iZzi;
    }

    public static int h(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzio.zzi(i12) * size) + j(list);
    }

    public static int i(int i12, List<?> list, zzlj zzljVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = zzio.zzi(i12) * size;
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = list.get(i13);
            if (obj instanceof zzjv) {
                iZzi = zzio.zza((zzjv) obj) + iZzi;
            } else {
                int iA2 = ((zzhl) ((zzkr) obj)).a(zzljVar);
                iZzi = zzio.zzj(iA2) + iA2 + iZzi;
            }
        }
        return iZzi;
    }

    public static int j(List<Integer> list) {
        int iZzd;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzji) {
            zzji zzjiVar = (zzji) list;
            iZzd = 0;
            while (i12 < size) {
                iZzd += zzio.zzd(zzjiVar.zzb(i12));
                i12++;
            }
        } else {
            iZzd = 0;
            while (i12 < size) {
                iZzd += zzio.zzd(list.get(i12).intValue());
                i12++;
            }
        }
        return iZzd;
    }

    public static int k(int i12, List<?> list) {
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzi = zzio.zzi(i12) * size;
        if (list instanceof zzjx) {
            zzjx zzjxVar = (zzjx) list;
            while (i13 < size) {
                Object objZzb = zzjxVar.zzb(i13);
                iZzi = (objZzb instanceof zzhu ? zzio.zzb((zzhu) objZzb) : zzio.zzb((String) objZzb)) + iZzi;
                i13++;
            }
        } else {
            while (i13 < size) {
                Object obj = list.get(i13);
                iZzi = (obj instanceof zzhu ? zzio.zzb((zzhu) obj) : zzio.zzb((String) obj)) + iZzi;
                i13++;
            }
        }
        return iZzi;
    }

    public static int l(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzio.zzf(i12, 0) * size;
    }

    public static int m(List<?> list) {
        return list.size() << 2;
    }

    public static int n(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzio.zzc(i12, 0L) * size;
    }

    public static int o(List<?> list) {
        return list.size() << 3;
    }

    public static int p(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzio.zzi(i12) * size) + q(list);
    }

    public static int q(List<Integer> list) {
        int iZzf;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzji) {
            zzji zzjiVar = (zzji) list;
            iZzf = 0;
            while (i12 < size) {
                iZzf += zzio.zzf(zzjiVar.zzb(i12));
                i12++;
            }
        } else {
            iZzf = 0;
            while (i12 < size) {
                iZzf += zzio.zzf(list.get(i12).intValue());
                i12++;
            }
        }
        return iZzf;
    }

    public static int r(int i12, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzio.zzi(i12) * list.size()) + s(list);
    }

    public static int s(List<Long> list) {
        int iZzd;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkg) {
            zzkg zzkgVar = (zzkg) list;
            iZzd = 0;
            while (i12 < size) {
                iZzd += zzio.zzd(zzkgVar.zzb(i12));
                i12++;
            }
        } else {
            iZzd = 0;
            while (i12 < size) {
                iZzd += zzio.zzd(list.get(i12).longValue());
                i12++;
            }
        }
        return iZzd;
    }

    public static int t(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzio.zzi(i12) * size) + u(list);
    }

    public static int u(List<Integer> list) {
        int iZzh;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzji) {
            zzji zzjiVar = (zzji) list;
            iZzh = 0;
            while (i12 < size) {
                iZzh += zzio.zzh(zzjiVar.zzb(i12));
                i12++;
            }
        } else {
            iZzh = 0;
            while (i12 < size) {
                iZzh += zzio.zzh(list.get(i12).intValue());
                i12++;
            }
        }
        return iZzh;
    }

    public static int v(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzio.zzi(i12) * size) + w(list);
    }

    public static int w(List<Long> list) {
        int iZzf;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkg) {
            zzkg zzkgVar = (zzkg) list;
            iZzf = 0;
            while (i12 < size) {
                iZzf += zzio.zzf(zzkgVar.zzb(i12));
                i12++;
            }
        } else {
            iZzf = 0;
            while (i12 < size) {
                iZzf += zzio.zzf(list.get(i12).longValue());
                i12++;
            }
        }
        return iZzf;
    }

    public static int x(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzio.zzi(i12) * size) + y(list);
    }

    public static int y(List<Integer> list) {
        int iZzj;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzji) {
            zzji zzjiVar = (zzji) list;
            iZzj = 0;
            while (i12 < size) {
                iZzj += zzio.zzj(zzjiVar.zzb(i12));
                i12++;
            }
        } else {
            iZzj = 0;
            while (i12 < size) {
                iZzj += zzio.zzj(list.get(i12).intValue());
                i12++;
            }
        }
        return iZzj;
    }

    public static int z(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzio.zzi(i12) * size) + A(list);
    }

    public static zzmi<?, ?> zza() {
        return f350961b;
    }

    public static zzmi<?, ?> zzb() {
        return f350962c;
    }

    public static void zzc(int i12, List<Integer> list, zzne zzneVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzneVar.zzc(i12, list, z12);
    }

    public static void zzd(int i12, List<Integer> list, zzne zzneVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzneVar.zzd(i12, list, z12);
    }

    public static void zze(int i12, List<Long> list, zzne zzneVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzneVar.zze(i12, list, z12);
    }

    public static void zzf(int i12, List<Float> list, zzne zzneVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzneVar.zzf(i12, list, z12);
    }

    public static void zzg(int i12, List<Integer> list, zzne zzneVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzneVar.zzg(i12, list, z12);
    }

    public static void zzh(int i12, List<Long> list, zzne zzneVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzneVar.zzh(i12, list, z12);
    }

    public static void zzi(int i12, List<Integer> list, zzne zzneVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzneVar.zzi(i12, list, z12);
    }

    public static void zzj(int i12, List<Long> list, zzne zzneVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzneVar.zzj(i12, list, z12);
    }

    public static void zzk(int i12, List<Integer> list, zzne zzneVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzneVar.zzk(i12, list, z12);
    }

    public static void zzl(int i12, List<Long> list, zzne zzneVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzneVar.zzl(i12, list, z12);
    }

    public static void zzm(int i12, List<Integer> list, zzne zzneVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzneVar.zzm(i12, list, z12);
    }

    public static void zzn(int i12, List<Long> list, zzne zzneVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzneVar.zzn(i12, list, z12);
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzjf.class.isAssignableFrom(cls) && (cls2 = f350960a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzb(int i12, List<Double> list, zzne zzneVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzneVar.zzb(i12, list, z12);
    }

    public static void zzb(int i12, List<?> list, zzne zzneVar, zzlj zzljVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzneVar.zzb(i12, list, zzljVar);
    }

    public static void zza(int i12, List<Boolean> list, zzne zzneVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzneVar.zza(i12, list, z12);
    }

    public static void zzb(int i12, List<String> list, zzne zzneVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzneVar.zzb(i12, list);
    }

    public static void zza(int i12, List<zzhu> list, zzne zzneVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzneVar.zza(i12, list);
    }

    public static void zza(int i12, List<?> list, zzne zzneVar, zzlj zzljVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzneVar.zza(i12, list, zzljVar);
    }
}
