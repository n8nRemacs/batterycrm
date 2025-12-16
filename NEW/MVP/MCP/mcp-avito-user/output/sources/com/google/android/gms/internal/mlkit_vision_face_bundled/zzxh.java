package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.google.android.gms.common.internal.P0;
import java.util.List;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzxh {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f354117a;

    /* renamed from: b, reason: collision with root package name */
    public static final zzxw f354118b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzxy f354119c;
    public static final /* synthetic */ int zza = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzxw zzxwVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f354117a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzxwVar = (zzxw) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        f354118b = zzxwVar;
        f354119c = new zzxy();
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(List list) {
        int iZzx;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzvo) {
            zzvo zzvoVar = (zzvo) list;
            iZzx = 0;
            while (i12 < size) {
                iZzx += zzut.zzx(zzvoVar.zze(i12));
                i12++;
            }
        } else {
            iZzx = 0;
            while (i12 < size) {
                iZzx += zzut.zzx(((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
        return iZzx;
    }

    public static int c(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzut.zzw(i12 << 3) + 4) * size;
    }

    public static int d(List list) {
        return list.size() * 4;
    }

    public static int e(int i12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzut.zzw(i12 << 3) + 8) * size;
    }

    public static int f(List list) {
        return list.size() * 8;
    }

    public static int g(List list) {
        int iZzx;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzvo) {
            zzvo zzvoVar = (zzvo) list;
            iZzx = 0;
            while (i12 < size) {
                iZzx += zzut.zzx(zzvoVar.zze(i12));
                i12++;
            }
        } else {
            iZzx = 0;
            while (i12 < size) {
                iZzx += zzut.zzx(((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
        return iZzx;
    }

    public static int h(List list) {
        int iZzx;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzwh) {
            zzwh zzwhVar = (zzwh) list;
            iZzx = 0;
            while (i12 < size) {
                iZzx += zzut.zzx(zzwhVar.zze(i12));
                i12++;
            }
        } else {
            iZzx = 0;
            while (i12 < size) {
                iZzx += zzut.zzx(((Long) list.get(i12)).longValue());
                i12++;
            }
        }
        return iZzx;
    }

    public static int i(int i12, Object obj, zzxf zzxfVar) {
        int i13 = i12 << 3;
        if (!(obj instanceof zzvy)) {
            return zzut.b((zzws) obj, zzxfVar) + zzut.zzw(i13);
        }
        int iZzw = zzut.zzw(i13);
        int iZza = ((zzvy) obj).zza();
        return P0.j(iZza, iZza, iZzw);
    }

    public static int j(List list) {
        int iZzw;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzvo) {
            zzvo zzvoVar = (zzvo) list;
            iZzw = 0;
            while (i12 < size) {
                int iZze = zzvoVar.zze(i12);
                iZzw += zzut.zzw((iZze >> 31) ^ (iZze + iZze));
                i12++;
            }
        } else {
            iZzw = 0;
            while (i12 < size) {
                int iIntValue = ((Integer) list.get(i12)).intValue();
                iZzw += zzut.zzw((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i12++;
            }
        }
        return iZzw;
    }

    public static int k(List list) {
        int iZzx;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzwh) {
            zzwh zzwhVar = (zzwh) list;
            iZzx = 0;
            while (i12 < size) {
                long jZze = zzwhVar.zze(i12);
                iZzx += zzut.zzx((jZze >> 63) ^ (jZze + jZze));
                i12++;
            }
        } else {
            iZzx = 0;
            while (i12 < size) {
                long jLongValue = ((Long) list.get(i12)).longValue();
                iZzx += zzut.zzx((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i12++;
            }
        }
        return iZzx;
    }

    public static int l(List list) {
        int iZzw;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzvo) {
            zzvo zzvoVar = (zzvo) list;
            iZzw = 0;
            while (i12 < size) {
                iZzw += zzut.zzw(zzvoVar.zze(i12));
                i12++;
            }
        } else {
            iZzw = 0;
            while (i12 < size) {
                iZzw += zzut.zzw(((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
        return iZzw;
    }

    public static int m(List list) {
        int iZzx;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzwh) {
            zzwh zzwhVar = (zzwh) list;
            iZzx = 0;
            while (i12 < size) {
                iZzx += zzut.zzx(zzwhVar.zze(i12));
                i12++;
            }
        } else {
            iZzx = 0;
            while (i12 < size) {
                iZzx += zzut.zzx(((Long) list.get(i12)).longValue());
                i12++;
            }
        }
        return iZzx;
    }

    public static Object n(Object obj, int i12, int i13, Object obj2, zzxw zzxwVar) {
        if (obj2 == null) {
            obj2 = zzxwVar.c(obj);
        }
        zzxwVar.f(i12, i13, obj2);
        return obj2;
    }

    public static void zzA(int i12, List list, zzyo zzyoVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyoVar.zzs(i12, list, z12);
    }

    public static void zzB(int i12, List list, zzyo zzyoVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyoVar.zzu(i12, list, z12);
    }

    public static void zzC(int i12, List list, zzyo zzyoVar, zzxf zzxfVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((zzuu) zzyoVar).zzv(i12, list.get(i13), zzxfVar);
        }
    }

    public static void zzD(int i12, List list, zzyo zzyoVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyoVar.zzy(i12, list, z12);
    }

    public static void zzE(int i12, List list, zzyo zzyoVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyoVar.zzA(i12, list, z12);
    }

    public static void zzF(int i12, List list, zzyo zzyoVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyoVar.zzC(i12, list, z12);
    }

    public static void zzG(int i12, List list, zzyo zzyoVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyoVar.zzE(i12, list, z12);
    }

    public static void zzH(int i12, List list, zzyo zzyoVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyoVar.zzH(i12, list);
    }

    public static void zzI(int i12, List list, zzyo zzyoVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyoVar.zzJ(i12, list, z12);
    }

    public static void zzJ(int i12, List list, zzyo zzyoVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyoVar.zzL(i12, list, z12);
    }

    public static zzxw zzm() {
        return f354118b;
    }

    public static zzxw zzn() {
        return f354119c;
    }

    public static void zzr(Class cls) {
        Class cls2;
        if (!zzvn.class.isAssignableFrom(cls) && (cls2 = f354117a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzs(int i12, List list, zzyo zzyoVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyoVar.zzc(i12, list, z12);
    }

    public static void zzt(int i12, List list, zzyo zzyoVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyoVar.zze(i12, list);
    }

    public static void zzu(int i12, List list, zzyo zzyoVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyoVar.zzg(i12, list, z12);
    }

    public static void zzv(int i12, List list, zzyo zzyoVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyoVar.zzj(i12, list, z12);
    }

    public static void zzw(int i12, List list, zzyo zzyoVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyoVar.zzl(i12, list, z12);
    }

    public static void zzx(int i12, List list, zzyo zzyoVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyoVar.zzn(i12, list, z12);
    }

    public static void zzy(int i12, List list, zzyo zzyoVar, boolean z12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyoVar.zzp(i12, list, z12);
    }

    public static void zzz(int i12, List list, zzyo zzyoVar, zzxf zzxfVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((zzuu) zzyoVar).zzq(i12, list.get(i13), zzxfVar);
        }
    }
}
