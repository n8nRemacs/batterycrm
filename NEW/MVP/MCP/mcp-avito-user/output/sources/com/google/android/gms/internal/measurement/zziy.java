package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzja;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zziy<T extends zzja<T>> {

    /* renamed from: d, reason: collision with root package name */
    public static final zziy f350880d = new zziy(null);

    /* renamed from: a, reason: collision with root package name */
    public final zzln f350881a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f350882b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f350883c;

    public zziy() {
        this.f350881a = new zzln(16, null);
    }

    public static int a(zzmv zzmvVar, int i12, Object obj) {
        int iZzi = zzio.zzi(i12);
        if (zzmvVar == zzmv.zzj) {
            boolean z12 = ((zzkr) obj) instanceof zzhm;
            iZzi <<= 1;
        }
        return iZzi + b(zzmvVar, obj);
    }

    public static int b(zzmv zzmvVar, Object obj) {
        switch (zzix.f350879b[zzmvVar.ordinal()]) {
            case 1:
                return zzio.zza(((Double) obj).doubleValue());
            case 2:
                return zzio.zza(((Float) obj).floatValue());
            case 3:
                return zzio.zzd(((Long) obj).longValue());
            case 4:
                return zzio.zzg(((Long) obj).longValue());
            case 5:
                return zzio.zzf(((Integer) obj).intValue());
            case 6:
                return zzio.zzc(((Long) obj).longValue());
            case 7:
                return zzio.zze(((Integer) obj).intValue());
            case 8:
                return zzio.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzio.zzb((zzkr) obj);
            case 10:
                return obj instanceof zzjr ? zzio.zza((zzjr) obj) : zzio.zzc((zzkr) obj);
            case 11:
                return obj instanceof zzhu ? zzio.zzb((zzhu) obj) : zzio.zzb((String) obj);
            case 12:
                return obj instanceof zzhu ? zzio.zzb((zzhu) obj) : zzio.zza((byte[]) obj);
            case 13:
                return zzio.zzj(((Integer) obj).intValue());
            case 14:
                return zzio.zzg(((Integer) obj).intValue());
            case 15:
                return zzio.zze(((Long) obj).longValue());
            case 16:
                return zzio.zzh(((Integer) obj).intValue());
            case 17:
                return zzio.zzf(((Long) obj).longValue());
            case 18:
                return obj instanceof zzjk ? zzio.zzd(((zzjk) obj).zza()) : zzio.zzd(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int c(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        return (key.zzc() != zznf.MESSAGE || key.zze() || key.zzd()) ? zza(key, value) : value instanceof zzjr ? zzio.zza(entry.getKey().zza(), (zzjr) value) : zzio.zzb(entry.getKey().zza(), (zzkr) value);
    }

    public static Object d(Object obj) {
        if (obj instanceof zzla) {
            return ((zzla) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static void e(zzio zzioVar, zzmv zzmvVar, int i12, Object obj) {
        if (zzmvVar == zzmv.zzj) {
            zzkr zzkrVar = (zzkr) obj;
            boolean z12 = zzkrVar instanceof zzhm;
            zzioVar.zzc(i12, 3);
            zzkrVar.zza(zzioVar);
            zzioVar.zzc(i12, 4);
        }
        zzioVar.zzc(i12, zzmvVar.zza());
        switch (zzix.f350879b[zzmvVar.ordinal()]) {
            case 1:
                zzioVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzioVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzioVar.zzb(((Long) obj).longValue());
                break;
            case 4:
                zzioVar.zzb(((Long) obj).longValue());
                break;
            case 5:
                zzioVar.zzb(((Integer) obj).intValue());
                break;
            case 6:
                zzioVar.zza(((Long) obj).longValue());
                break;
            case 7:
                zzioVar.zza(((Integer) obj).intValue());
                break;
            case 8:
                zzioVar.zzb(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzkr) obj).zza(zzioVar);
                break;
            case 10:
                zzioVar.zza((zzkr) obj);
                break;
            case 11:
                if (!(obj instanceof zzhu)) {
                    zzioVar.zza((String) obj);
                    break;
                } else {
                    zzioVar.zza((zzhu) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof zzhu)) {
                    byte[] bArr = (byte[]) obj;
                    zzioVar.zzb(bArr, 0, bArr.length);
                    break;
                } else {
                    zzioVar.zza((zzhu) obj);
                    break;
                }
            case 13:
                zzioVar.zzc(((Integer) obj).intValue());
                break;
            case 14:
                zzioVar.zza(((Integer) obj).intValue());
                break;
            case 15:
                zzioVar.zza(((Long) obj).longValue());
                break;
            case 16:
                zzioVar.zzk(((Integer) obj).intValue());
                break;
            case 17:
                zzioVar.zzh(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof zzjk)) {
                    zzioVar.zzb(((Integer) obj).intValue());
                    break;
                } else {
                    zzioVar.zzb(((zzjk) obj).zza());
                    break;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(T r3, java.lang.Object r4) {
        /*
            com.google.android.gms.internal.measurement.zzmv r0 = r3.zzb()
            java.nio.charset.Charset r1 = com.google.android.gms.internal.measurement.zzjh.f350896a
            r4.getClass()
            int[] r1 = com.google.android.gms.internal.measurement.zzix.f350878a
            com.google.android.gms.internal.measurement.zznf r0 = r0.zzb()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L46;
                case 2: goto L43;
                case 3: goto L40;
                case 4: goto L3d;
                case 5: goto L3a;
                case 6: goto L37;
                case 7: goto L2e;
                case 8: goto L25;
                case 9: goto L1c;
                default: goto L1a;
            }
        L1a:
            r1 = r2
            goto L48
        L1c:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzkr
            if (r0 != 0) goto L48
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzjr
            if (r0 == 0) goto L1a
            goto L48
        L25:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L48
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzjk
            if (r0 == 0) goto L1a
            goto L48
        L2e:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzhu
            if (r0 != 0) goto L48
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L1a
            goto L48
        L37:
            boolean r1 = r4 instanceof java.lang.String
            goto L48
        L3a:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L48
        L3d:
            boolean r1 = r4 instanceof java.lang.Double
            goto L48
        L40:
            boolean r1 = r4 instanceof java.lang.Float
            goto L48
        L43:
            boolean r1 = r4 instanceof java.lang.Long
            goto L48
        L46:
            boolean r1 = r4 instanceof java.lang.Integer
        L48:
            if (r1 == 0) goto L4b
            return
        L4b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.measurement.zzmv r3 = r3.zzb()
            com.google.android.gms.internal.measurement.zznf r3 = r3.zzb()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zziy.i(com.google.android.gms.internal.measurement.zzja, java.lang.Object):void");
    }

    public static <T extends zzja<T>> boolean j(Map.Entry<T, Object> entry) {
        boolean zZzci;
        T key = entry.getKey();
        if (key.zzc() == zznf.MESSAGE) {
            if (!key.zze()) {
                Object value = entry.getValue();
                if (value instanceof zzkt) {
                    return ((zzkt) value).zzci();
                }
                if (value instanceof zzjr) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            for (Object obj : (List) entry.getValue()) {
                if (obj instanceof zzkt) {
                    zZzci = ((zzkt) obj).zzci();
                } else {
                    if (!(obj instanceof zzjr)) {
                        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    }
                    zZzci = true;
                }
                if (!zZzci) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int zza(zzja<?> zzjaVar, Object obj) {
        zzmv zzmvVarZzb = zzjaVar.zzb();
        int iZza = zzjaVar.zza();
        if (!zzjaVar.zze()) {
            return a(zzmvVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int iA2 = 0;
        if (!zzjaVar.zzd()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iA2 += a(zzmvVarZzb, iZza, it.next());
            }
            return iA2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iA2 += b(zzmvVarZzb, it2.next());
        }
        return zzio.zzj(iA2) + zzio.zzi(iZza) + iA2;
    }

    public static <T extends zzja<T>> zziy<T> zzb() {
        return f350880d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        zzln zzlnVar;
        zziy zziyVar = new zziy();
        int i12 = 0;
        while (true) {
            zzlnVar = this.f350881a;
            if (i12 >= zzlnVar.zzb()) {
                break;
            }
            Map.Entry entryZzb = zzlnVar.zzb(i12);
            zziyVar.f((zzja) entryZzb.getKey(), entryZzb.getValue());
            i12++;
        }
        for (Map.Entry entry : zzlnVar.zzc()) {
            zziyVar.f((zzja) entry.getKey(), entry.getValue());
        }
        zziyVar.f350883c = this.f350883c;
        return zziyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zziy) {
            return this.f350881a.equals(((zziy) obj).f350881a);
        }
        return false;
    }

    public final void f(T t12, Object obj) {
        if (!t12.zze()) {
            i(t12, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj2 = arrayList.get(i12);
                i12++;
                i(t12, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzjr) {
            this.f350883c = true;
        }
        this.f350881a.put(t12, obj);
    }

    public final void g(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z12 = value instanceof zzjr;
        boolean zZze = key.zze();
        zzln zzlnVar = this.f350881a;
        if (zZze) {
            if (z12) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object arrayList = zzlnVar.get(key);
            if (arrayList instanceof zzjr) {
                arrayList = zzjr.zza();
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) arrayList).add(d(it.next()));
            }
            zzlnVar.put(key, arrayList);
            return;
        }
        if (key.zzc() != zznf.MESSAGE) {
            if (z12) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            zzlnVar.put(key, d(value));
            return;
        }
        Object objZza = zzlnVar.get(key);
        if (objZza instanceof zzjr) {
            objZza = zzjr.zza();
        }
        if (objZza != null) {
            if (z12) {
                value = zzjr.zza();
            }
            zzlnVar.put(key, objZza instanceof zzla ? key.zza((zzla) objZza, (zzla) value) : key.zza(((zzkr) objZza).zzce(), (zzkr) value).zzah());
        } else {
            zzlnVar.put(key, d(value));
            if (z12) {
                this.f350883c = true;
            }
        }
    }

    public final Iterator<Map.Entry<T, Object>> h() {
        boolean z12 = this.f350883c;
        zzln zzlnVar = this.f350881a;
        if (z12) {
            if (zzlnVar.f350970h == null) {
                zzlnVar.f350970h = new zzls(zzlnVar, null);
            }
            return new zzjw(zzlnVar.f350970h.iterator());
        }
        if (zzlnVar.f350970h == null) {
            zzlnVar.f350970h = new zzls(zzlnVar, null);
        }
        return (Iterator<Map.Entry<T, Object>>) zzlnVar.f350970h.iterator();
    }

    public final int hashCode() {
        return this.f350881a.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        boolean z12 = this.f350883c;
        zzln zzlnVar = this.f350881a;
        return z12 ? new zzjw(zzlnVar.entrySet().iterator()) : zzlnVar.entrySet().iterator();
    }

    public final void zze() {
        if (this.f350882b) {
            return;
        }
        int i12 = 0;
        while (true) {
            zzln zzlnVar = this.f350881a;
            if (i12 >= zzlnVar.zzb()) {
                zzlnVar.zza();
                this.f350882b = true;
                return;
            }
            Map.Entry entryZzb = zzlnVar.zzb(i12);
            if (entryZzb.getValue() instanceof zzjf) {
                zzjf zzjfVar = (zzjf) entryZzb.getValue();
                zzjfVar.getClass();
                zzlf.zza().zza((zzlf) zzjfVar).zzc(zzjfVar);
                zzjfVar.l();
            }
            i12++;
        }
    }

    public final boolean zzf() {
        return this.f350882b;
    }

    public final boolean zzg() {
        int i12 = 0;
        while (true) {
            zzln zzlnVar = this.f350881a;
            if (i12 >= zzlnVar.zzb()) {
                Iterator it = zzlnVar.zzc().iterator();
                while (it.hasNext()) {
                    if (!j((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!j(zzlnVar.zzb(i12))) {
                return false;
            }
            i12++;
        }
    }

    public zziy(Object obj) {
        int i12 = zzlo.f350963i;
        this.f350881a = new zzln(0, null);
        zze();
        zze();
    }

    public final int zza() {
        zzln zzlnVar;
        int i12 = 0;
        int iC2 = 0;
        while (true) {
            zzlnVar = this.f350881a;
            if (i12 >= zzlnVar.zzb()) {
                break;
            }
            iC2 += c(zzlnVar.zzb(i12));
            i12++;
        }
        Iterator it = zzlnVar.zzc().iterator();
        while (it.hasNext()) {
            iC2 += c((Map.Entry) it.next());
        }
        return iC2;
    }

    public final void zza(zziy<T> zziyVar) {
        zzln zzlnVar;
        int i12 = 0;
        while (true) {
            int iZzb = zziyVar.f350881a.zzb();
            zzlnVar = zziyVar.f350881a;
            if (i12 >= iZzb) {
                break;
            }
            g(zzlnVar.zzb(i12));
            i12++;
        }
        Iterator it = zzlnVar.zzc().iterator();
        while (it.hasNext()) {
            g((Map.Entry) it.next());
        }
    }
}
