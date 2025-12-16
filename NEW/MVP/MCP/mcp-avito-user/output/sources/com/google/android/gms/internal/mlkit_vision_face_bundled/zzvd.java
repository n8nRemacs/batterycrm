package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzvd {

    /* renamed from: c, reason: collision with root package name */
    public static final zzvd f354049c = new zzvd(0);

    /* renamed from: a, reason: collision with root package name */
    public final zzxi f354050a = new zzxi(16, null);

    /* renamed from: b, reason: collision with root package name */
    public boolean f354051b;

    public zzvd() {
    }

    public static boolean b(Map.Entry entry) {
        zzvc zzvcVar = (zzvc) entry.getKey();
        if (zzvcVar.zzc() != zzyn.MESSAGE) {
            return true;
        }
        zzvcVar.zze();
        for (Object obj : (List) entry.getValue()) {
            if (obj instanceof zzwt) {
                if (!((zzwt) obj).zzt()) {
                    return false;
                }
            } else if (!(obj instanceof zzvx)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.google.android.gms.internal.mlkit_vision_face_bundled.zzvc r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzym r0 = r2.zzb()
            java.nio.charset.Charset r1 = com.google.android.gms.internal.mlkit_vision_face_bundled.zzvt.f354067a
            r3.getClass()
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzym r1 = com.google.android.gms.internal.mlkit_vision_face_bundled.zzym.zza
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzyn r1 = com.google.android.gms.internal.mlkit_vision_face_bundled.zzyn.INT
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzyn r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_vision_face_bundled.zzws
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_vision_face_bundled.zzvx
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_vision_face_bundled.zzvp
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_vision_face_bundled.zzul
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L48
            goto L47
        L34:
            boolean r0 = r3 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r3 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r3 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r3 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r3 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
        L47:
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2.zza()
            r1 = 202056002(0xc0b2142, float:1.0718179E-31)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzym r2 = r2.zzb()
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzyn r2 = r2.zza()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzvd.c(com.google.android.gms.internal.mlkit_vision_face_bundled.zzvc, java.lang.Object):void");
    }

    public static int zza(zzvc zzvcVar, Object obj) {
        int iZzd;
        int iZzw;
        zzym zzymVarZzb = zzvcVar.zzb();
        zzvcVar.zza();
        zzvcVar.zze();
        zzvcVar.zzd();
        int i12 = 0;
        for (Object obj2 : (List) obj) {
            int iZzw2 = zzut.zzw(1616448016);
            if (zzymVarZzb == zzym.zzj) {
                Charset charset = zzvt.f354067a;
                if (((zzws) obj2) instanceof zztv) {
                    throw null;
                }
                iZzw2 += iZzw2;
            }
            zzyn zzynVar = zzyn.INT;
            int iZzx = 4;
            switch (zzymVarZzb.ordinal()) {
                case 0:
                    ((Double) obj2).getClass();
                    iZzx = 8;
                    i12 += iZzw2 + iZzx;
                case 1:
                    ((Float) obj2).getClass();
                    i12 += iZzw2 + iZzx;
                case 2:
                    iZzx = zzut.zzx(((Long) obj2).longValue());
                    i12 += iZzw2 + iZzx;
                case 3:
                    iZzx = zzut.zzx(((Long) obj2).longValue());
                    i12 += iZzw2 + iZzx;
                case 4:
                    iZzx = zzut.zzx(((Integer) obj2).intValue());
                    i12 += iZzw2 + iZzx;
                case 5:
                    ((Long) obj2).getClass();
                    iZzx = 8;
                    i12 += iZzw2 + iZzx;
                case 6:
                    ((Integer) obj2).getClass();
                    i12 += iZzw2 + iZzx;
                case 7:
                    ((Boolean) obj2).getClass();
                    iZzx = 1;
                    i12 += iZzw2 + iZzx;
                case 8:
                    if (obj2 instanceof zzul) {
                        iZzd = ((zzul) obj2).zzd();
                        iZzw = zzut.zzw(iZzd);
                        iZzx = iZzw + iZzd;
                        i12 += iZzw2 + iZzx;
                    } else {
                        iZzx = zzut.zzv((String) obj2);
                        i12 += iZzw2 + iZzx;
                    }
                case 9:
                    iZzx = ((zzws) obj2).zzu();
                    i12 += iZzw2 + iZzx;
                case 10:
                    if (obj2 instanceof zzvx) {
                        iZzd = ((zzvx) obj2).zza();
                        iZzw = zzut.zzw(iZzd);
                    } else {
                        iZzd = ((zzws) obj2).zzu();
                        iZzw = zzut.zzw(iZzd);
                    }
                    iZzx = iZzw + iZzd;
                    i12 += iZzw2 + iZzx;
                case 11:
                    if (obj2 instanceof zzul) {
                        iZzd = ((zzul) obj2).zzd();
                        iZzw = zzut.zzw(iZzd);
                    } else {
                        iZzd = ((byte[]) obj2).length;
                        iZzw = zzut.zzw(iZzd);
                    }
                    iZzx = iZzw + iZzd;
                    i12 += iZzw2 + iZzx;
                case 12:
                    iZzx = zzut.zzw(((Integer) obj2).intValue());
                    i12 += iZzw2 + iZzx;
                case 13:
                    iZzx = obj2 instanceof zzvp ? zzut.zzx(((zzvp) obj2).zza()) : zzut.zzx(((Integer) obj2).intValue());
                    i12 += iZzw2 + iZzx;
                case 14:
                    ((Integer) obj2).getClass();
                    i12 += iZzw2 + iZzx;
                case 15:
                    ((Long) obj2).getClass();
                    iZzx = 8;
                    i12 += iZzw2 + iZzx;
                case 16:
                    int iIntValue = ((Integer) obj2).intValue();
                    iZzx = zzut.zzw((iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i12 += iZzw2 + iZzx;
                case 17:
                    long jLongValue = ((Long) obj2).longValue();
                    iZzx = zzut.zzx((jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i12 += iZzw2 + iZzx;
                default:
                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
        return i12;
    }

    public static zzvd zzd() {
        return f354049c;
    }

    public final void a(Map.Entry entry) {
        zzvc zzvcVar = (zzvc) entry.getKey();
        Object value = entry.getValue();
        boolean z12 = value instanceof zzvx;
        zzvcVar.zze();
        if (z12) {
            throw new IllegalStateException("Lazy fields can not be repeated");
        }
        Object objZze = zze(zzvcVar);
        if (objZze == null) {
            objZze = new ArrayList();
        }
        for (Object objZzb : (List) value) {
            List list = (List) objZze;
            if (objZzb instanceof zzwx) {
                objZzb = ((zzwx) objZzb).zzb();
            } else if (objZzb instanceof byte[]) {
                byte[] bArr = (byte[]) objZzb;
                int length = bArr.length;
                Object obj = new byte[length];
                System.arraycopy(bArr, 0, obj, 0, length);
                objZzb = obj;
            }
            list.add(objZzb);
        }
        this.f354050a.put(zzvcVar, objZze);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzvd) {
            return this.f354050a.equals(((zzvd) obj).f354050a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f354050a.hashCode();
    }

    public final int zzb() {
        zzxi zzxiVar;
        int i12 = 0;
        int iZza = 0;
        while (true) {
            zzxiVar = this.f354050a;
            if (i12 >= zzxiVar.zzb()) {
                break;
            }
            Map.Entry entryZzg = zzxiVar.zzg(i12);
            zzvc zzvcVar = (zzvc) entryZzg.getKey();
            Object value = entryZzg.getValue();
            if (zzvcVar.zzc() == zzyn.MESSAGE) {
                zzvcVar.zze();
            }
            iZza += zza(zzvcVar, value);
            i12++;
        }
        for (Map.Entry entry : zzxiVar.zzc()) {
            zzvc zzvcVar2 = (zzvc) entry.getKey();
            Object value2 = entry.getValue();
            if (zzvcVar2.zzc() == zzyn.MESSAGE) {
                zzvcVar2.zze();
            }
            iZza += zza(zzvcVar2, value2);
        }
        return iZza;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzvd clone() {
        zzxi zzxiVar;
        zzvd zzvdVar = new zzvd();
        int i12 = 0;
        while (true) {
            zzxiVar = this.f354050a;
            if (i12 >= zzxiVar.zzb()) {
                break;
            }
            Map.Entry entryZzg = zzxiVar.zzg(i12);
            zzvdVar.zzj((zzvc) entryZzg.getKey(), entryZzg.getValue());
            i12++;
        }
        for (Map.Entry entry : zzxiVar.zzc()) {
            zzvdVar.zzj((zzvc) entry.getKey(), entry.getValue());
        }
        return zzvdVar;
    }

    public final Object zze(zzvc zzvcVar) {
        Object obj = this.f354050a.get(zzvcVar);
        if (obj instanceof zzvx) {
            throw null;
        }
        return obj;
    }

    public final Iterator zzf() {
        return this.f354050a.entrySet().iterator();
    }

    public final void zzg(zzvc zzvcVar, Object obj) {
        List arrayList;
        c(zzvcVar, obj);
        Object objZze = zze(zzvcVar);
        if (objZze == null) {
            arrayList = new ArrayList();
            this.f354050a.put(zzvcVar, arrayList);
        } else {
            arrayList = (List) objZze;
        }
        arrayList.add(obj);
    }

    public final void zzh() {
        if (this.f354051b) {
            return;
        }
        int i12 = 0;
        while (true) {
            zzxi zzxiVar = this.f354050a;
            if (i12 >= zzxiVar.zzb()) {
                zzxiVar.zza();
                this.f354051b = true;
                return;
            }
            Map.Entry entryZzg = zzxiVar.zzg(i12);
            if (entryZzg.getValue() instanceof zzvn) {
                zzvn zzvnVar = (zzvn) entryZzg.getValue();
                zzvnVar.getClass();
                zzxb.zza().zzb(zzvnVar.getClass()).zzf(zzvnVar);
                zzvnVar.c();
            }
            i12++;
        }
    }

    public final void zzi(zzvd zzvdVar) {
        zzxi zzxiVar;
        int i12 = 0;
        while (true) {
            int iZzb = zzvdVar.f354050a.zzb();
            zzxiVar = zzvdVar.f354050a;
            if (i12 >= iZzb) {
                break;
            }
            a(zzxiVar.zzg(i12));
            i12++;
        }
        Iterator it = zzxiVar.zzc().iterator();
        while (it.hasNext()) {
            a((Map.Entry) it.next());
        }
    }

    public final void zzj(zzvc zzvcVar, Object obj) {
        zzvcVar.zze();
        if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((List) obj);
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            c(zzvcVar, arrayList.get(i12));
        }
        this.f354050a.put(zzvcVar, arrayList);
    }

    public final boolean zzk() {
        return this.f354051b;
    }

    public final boolean zzl() {
        int i12 = 0;
        while (true) {
            zzxi zzxiVar = this.f354050a;
            if (i12 >= zzxiVar.zzb()) {
                Iterator it = zzxiVar.zzc().iterator();
                while (it.hasNext()) {
                    if (!b((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!b(zzxiVar.zzg(i12))) {
                return false;
            }
            i12++;
        }
    }

    public zzvd(int i12) {
        zzh();
        zzh();
    }
}
