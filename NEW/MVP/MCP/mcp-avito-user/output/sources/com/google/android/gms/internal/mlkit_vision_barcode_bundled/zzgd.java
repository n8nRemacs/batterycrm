package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.common.internal.P0;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzgd {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f352512a;

    /* renamed from: b, reason: collision with root package name */
    public static final zzgp f352513b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzgp f352514c;

    /* renamed from: d, reason: collision with root package name */
    public static final zzgr f352515d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f352512a = cls;
        f352513b = d(false);
        f352514c = d(true);
        f352515d = new zzgr();
    }

    public static int A(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzC(i12) * size) + B(list);
    }

    public static int B(List list) {
        int iZzE;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            iZzE = 0;
            while (i12 < size) {
                iZzE += zzdi.zzE(zzfaVar.zze(i12));
                i12++;
            }
        } else {
            iZzE = 0;
            while (i12 < size) {
                iZzE += zzdi.zzE(((Long) list.get(i12)).longValue());
                i12++;
            }
        }
        return iZzE;
    }

    public static Object a(int i12, zzek zzekVar, zzeg zzegVar, zzgq zzgqVar, zzgp zzgpVar) {
        if (zzegVar == null) {
            return zzgqVar;
        }
        if (zzekVar != null) {
            int size = zzekVar.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                Integer num = (Integer) zzekVar.get(i14);
                int iIntValue = num.intValue();
                if (zzegVar.zza(iIntValue)) {
                    if (i14 != i13) {
                        zzekVar.set(i13, num);
                    }
                    i13++;
                } else {
                    if (zzgqVar == null) {
                        zzgqVar = zzgpVar.e();
                    }
                    zzgpVar.f(i12, iIntValue, zzgqVar);
                }
            }
            if (i13 != size) {
                zzekVar.subList(i13, size).clear();
                return zzgqVar;
            }
        } else {
            Iterator it = zzekVar.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zzegVar.zza(iIntValue2)) {
                    if (zzgqVar == null) {
                        zzgqVar = zzgpVar.e();
                    }
                    zzgpVar.f(i12, iIntValue2, zzgqVar);
                    it.remove();
                }
            }
        }
        return zzgqVar;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int c(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzD(i12 << 3) + 1) * size;
    }

    public static zzgp d(boolean z12) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzgp) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z12));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int e(List list) {
        return list.size();
    }

    public static int f(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzC = zzdi.zzC(i12) * size;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iZzC += zzdi.zzu((zzdb) list.get(i13));
        }
        return iZzC;
    }

    public static int g(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzC(i12) * size) + h(list);
    }

    public static int h(List list) {
        int iZzx;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzed) {
            zzed zzedVar = (zzed) list;
            iZzx = 0;
            while (i12 < size) {
                iZzx += zzdi.zzx(zzedVar.zze(i12));
                i12++;
            }
        } else {
            iZzx = 0;
            while (i12 < size) {
                iZzx += zzdi.zzx(((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
        return iZzx;
    }

    public static int i(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzD(i12 << 3) + 4) * size;
    }

    public static int j(List list) {
        return list.size() * 4;
    }

    public static int k(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzD(i12 << 3) + 8) * size;
    }

    public static int l(List list) {
        return list.size() * 8;
    }

    public static int m(int i12, List list, zzgb zzgbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA2 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iA2 += zzdi.a(i12, (zzfl) list.get(i13), zzgbVar);
        }
        return iA2;
    }

    public static int n(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzC(i12) * size) + o(list);
    }

    public static int o(List list) {
        int iZzx;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzed) {
            zzed zzedVar = (zzed) list;
            iZzx = 0;
            while (i12 < size) {
                iZzx += zzdi.zzx(zzedVar.zze(i12));
                i12++;
            }
        } else {
            iZzx = 0;
            while (i12 < size) {
                iZzx += zzdi.zzx(((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
        return iZzx;
    }

    public static int p(int i12, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzdi.zzC(i12) * list.size()) + q(list);
    }

    public static int q(List list) {
        int iZzE;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            iZzE = 0;
            while (i12 < size) {
                iZzE += zzdi.zzE(zzfaVar.zze(i12));
                i12++;
            }
        } else {
            iZzE = 0;
            while (i12 < size) {
                iZzE += zzdi.zzE(((Long) list.get(i12)).longValue());
                i12++;
            }
        }
        return iZzE;
    }

    public static int r(int i12, Object obj, zzgb zzgbVar) {
        if (obj instanceof zzet) {
            int iZzD = zzdi.zzD(i12 << 3);
            int iZza = ((zzet) obj).zza();
            return P0.d(iZza, iZza, iZzD);
        }
        int iZzD2 = zzdi.zzD(i12 << 3);
        zzck zzckVar = (zzck) ((zzfl) obj);
        int iA2 = zzckVar.a();
        if (iA2 == -1) {
            iA2 = zzgbVar.zza(zzckVar);
            zzckVar.b(iA2);
        }
        return P0.d(iA2, iA2, iZzD2);
    }

    public static int s(int i12, List list, zzgb zzgbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzC = zzdi.zzC(i12) * size;
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = list.get(i13);
            if (obj instanceof zzet) {
                iZzC = zzdi.zzy((zzet) obj) + iZzC;
            } else {
                zzck zzckVar = (zzck) ((zzfl) obj);
                int iA2 = zzckVar.a();
                if (iA2 == -1) {
                    iA2 = zzgbVar.zza(zzckVar);
                    zzckVar.b(iA2);
                }
                iZzC = P0.d(iA2, iA2, iZzC);
            }
        }
        return iZzC;
    }

    public static int t(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzC(i12) * size) + u(list);
    }

    public static int u(List list) {
        int iZzD;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzed) {
            zzed zzedVar = (zzed) list;
            iZzD = 0;
            while (i12 < size) {
                int iZze = zzedVar.zze(i12);
                iZzD += zzdi.zzD((iZze >> 31) ^ (iZze + iZze));
                i12++;
            }
        } else {
            iZzD = 0;
            while (i12 < size) {
                int iIntValue = ((Integer) list.get(i12)).intValue();
                iZzD += zzdi.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i12++;
            }
        }
        return iZzD;
    }

    public static int v(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzC(i12) * size) + w(list);
    }

    public static int w(List list) {
        int iZzE;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            iZzE = 0;
            while (i12 < size) {
                long jZze = zzfaVar.zze(i12);
                iZzE += zzdi.zzE((jZze >> 63) ^ (jZze + jZze));
                i12++;
            }
        } else {
            iZzE = 0;
            while (i12 < size) {
                long jLongValue = ((Long) list.get(i12)).longValue();
                iZzE += zzdi.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i12++;
            }
        }
        return iZzE;
    }

    public static int x(int i12, List list) {
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzC = zzdi.zzC(i12) * size;
        if (list instanceof zzev) {
            zzev zzevVar = (zzev) list;
            while (i13 < size) {
                Object objZzf = zzevVar.zzf(i13);
                iZzC = (objZzf instanceof zzdb ? zzdi.zzu((zzdb) objZzf) : zzdi.zzB((String) objZzf)) + iZzC;
                i13++;
            }
        } else {
            while (i13 < size) {
                Object obj = list.get(i13);
                iZzC = (obj instanceof zzdb ? zzdi.zzu((zzdb) obj) : zzdi.zzB((String) obj)) + iZzC;
                i13++;
            }
        }
        return iZzC;
    }

    public static int y(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdi.zzC(i12) * size) + z(list);
    }

    public static int z(List list) {
        int iZzD;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzed) {
            zzed zzedVar = (zzed) list;
            iZzD = 0;
            while (i12 < size) {
                iZzD += zzdi.zzD(zzedVar.zze(i12));
                i12++;
            }
        } else {
            iZzD = 0;
            while (i12 < size) {
                iZzD += zzdi.zzD(((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
        return iZzD;
    }

    public static zzgp zzA() {
        return f352514c;
    }

    public static zzgp zzB() {
        return f352515d;
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzec.class.isAssignableFrom(cls) && (cls2 = f352512a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzJ(int i12, List list, zzdj zzdjVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzc(i12, list, z12);
    }

    public static void zzK(int i12, List list, zzdj zzdjVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zze(i12, list);
    }

    public static void zzL(int i12, List list, zzdj zzdjVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzg(i12, list, z12);
    }

    public static void zzM(int i12, List list, zzdj zzdjVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzj(i12, list, z12);
    }

    public static void zzN(int i12, List list, zzdj zzdjVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzl(i12, list, z12);
    }

    public static void zzO(int i12, List list, zzdj zzdjVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzn(i12, list, z12);
    }

    public static void zzP(int i12, List list, zzdj zzdjVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzp(i12, list, z12);
    }

    public static void zzQ(int i12, List list, zzdj zzdjVar, zzgb zzgbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            zzdjVar.zzq(i12, list.get(i13), zzgbVar);
        }
    }

    public static void zzR(int i12, List list, zzdj zzdjVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzs(i12, list, z12);
    }

    public static void zzS(int i12, List list, zzdj zzdjVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzu(i12, list, z12);
    }

    public static void zzT(int i12, List list, zzdj zzdjVar, zzgb zzgbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            zzdjVar.zzv(i12, list.get(i13), zzgbVar);
        }
    }

    public static void zzU(int i12, List list, zzdj zzdjVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzy(i12, list, z12);
    }

    public static void zzV(int i12, List list, zzdj zzdjVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzA(i12, list, z12);
    }

    public static void zzW(int i12, List list, zzdj zzdjVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzC(i12, list, z12);
    }

    public static void zzX(int i12, List list, zzdj zzdjVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzE(i12, list, z12);
    }

    public static void zzY(int i12, List list, zzdj zzdjVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzH(i12, list);
    }

    public static void zzZ(int i12, List list, zzdj zzdjVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzJ(i12, list, z12);
    }

    public static void zzaa(int i12, List list, zzdj zzdjVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdjVar.zzL(i12, list, z12);
    }

    public static zzgp zzz() {
        return f352513b;
    }
}
