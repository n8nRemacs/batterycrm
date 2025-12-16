package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.common.internal.P0;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzds {

    /* renamed from: d, reason: collision with root package name */
    public static final zzds f352424d = new zzds(0);

    /* renamed from: a, reason: collision with root package name */
    public final zzge f352425a = new zzge(16, null);

    /* renamed from: b, reason: collision with root package name */
    public boolean f352426b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f352427c;

    public zzds() {
    }

    public static boolean b(Map.Entry entry) {
        zzdr zzdrVar = (zzdr) entry.getKey();
        if (zzdrVar.zze() != zzhg.MESSAGE) {
            return true;
        }
        zzdrVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzfm) {
            return ((zzfm) value).zzY();
        }
        if (value instanceof zzes) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static final int c(Map.Entry entry) {
        zzdr zzdrVar = (zzdr) entry.getKey();
        Object value = entry.getValue();
        if (zzdrVar.zze() != zzhg.MESSAGE) {
            return zza(zzdrVar, value);
        }
        zzdrVar.zzg();
        zzdrVar.zzf();
        if (value instanceof zzes) {
            int iZza = ((zzdr) entry.getKey()).zza();
            int iZzD = zzdi.zzD(8);
            int iZza2 = ((zzes) value).zza();
            return P0.e(iZza2, iZza2, zzdi.zzD(24), P0.d(iZza, zzdi.zzD(16), iZzD + iZzD));
        }
        int iZza3 = ((zzdr) entry.getKey()).zza();
        int iZzD2 = zzdi.zzD(8);
        return zzdi.zzz((zzfl) value) + zzdi.zzD(24) + P0.d(iZza3, zzdi.zzD(16), iZzD2 + iZzD2);
    }

    public static int zza(zzdr zzdrVar, Object obj) {
        zzhf zzhfVarZzd = zzdrVar.zzd();
        int iZza = zzdrVar.zza();
        zzdrVar.zzg();
        int iZzC = zzdi.zzC(iZza);
        if (zzhfVarZzd == zzhf.zzj) {
            if (((zzfl) obj) instanceof zzcl) {
                throw null;
            }
            iZzC += iZzC;
        }
        zzhg zzhgVar = zzhg.INT;
        int iZzE = 4;
        switch (zzhfVarZzd.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iZzE = 8;
                return iZzC + iZzE;
            case 1:
                ((Float) obj).getClass();
                return iZzC + iZzE;
            case 2:
                iZzE = zzdi.zzE(((Long) obj).longValue());
                return iZzC + iZzE;
            case 3:
                iZzE = zzdi.zzE(((Long) obj).longValue());
                return iZzC + iZzE;
            case 4:
                iZzE = zzdi.zzx(((Integer) obj).intValue());
                return iZzC + iZzE;
            case 5:
                ((Long) obj).getClass();
                iZzE = 8;
                return iZzC + iZzE;
            case 6:
                ((Integer) obj).getClass();
                return iZzC + iZzE;
            case 7:
                ((Boolean) obj).getClass();
                iZzE = 1;
                return iZzC + iZzE;
            case 8:
                iZzE = obj instanceof zzdb ? zzdi.zzu((zzdb) obj) : zzdi.zzB((String) obj);
                return iZzC + iZzE;
            case 9:
                iZzE = zzdi.zzw((zzfl) obj);
                return iZzC + iZzE;
            case 10:
                iZzE = obj instanceof zzes ? zzdi.zzy((zzes) obj) : zzdi.zzz((zzfl) obj);
                return iZzC + iZzE;
            case 11:
                iZzE = obj instanceof zzdb ? zzdi.zzu((zzdb) obj) : zzdi.zzt((byte[]) obj);
                return iZzC + iZzE;
            case 12:
                iZzE = zzdi.zzD(((Integer) obj).intValue());
                return iZzC + iZzE;
            case 13:
                iZzE = obj instanceof zzee ? zzdi.zzx(((zzee) obj).zza()) : zzdi.zzx(((Integer) obj).intValue());
                return iZzC + iZzE;
            case 14:
                ((Integer) obj).getClass();
                return iZzC + iZzE;
            case 15:
                ((Long) obj).getClass();
                iZzE = 8;
                return iZzC + iZzE;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iZzE = zzdi.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iZzC + iZzE;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iZzE = zzdi.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iZzC + iZzE;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzds zzd() {
        return f352424d;
    }

    public final void a(Map.Entry entry) {
        zzfl zzflVarZzl;
        zzdr zzdrVar = (zzdr) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzes) {
            throw null;
        }
        zzdrVar.zzg();
        zzhg zzhgVarZze = zzdrVar.zze();
        zzhg zzhgVar = zzhg.MESSAGE;
        zzge zzgeVar = this.f352425a;
        if (zzhgVarZze != zzhgVar) {
            if (value instanceof zzfq) {
                value = ((zzfq) value).zzc();
            } else if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, 0, bArr2, 0, length);
                value = bArr2;
            }
            zzgeVar.put(zzdrVar, value);
            return;
        }
        Object objZze = zze(zzdrVar);
        if (objZze != null) {
            if (objZze instanceof zzfq) {
                zzflVarZzl = zzdrVar.zzc((zzfq) objZze, (zzfq) value);
            } else {
                zzfk zzfkVarZzV = ((zzfl) objZze).zzV();
                zzdrVar.zzb(zzfkVarZzV, (zzfl) value);
                zzflVarZzl = zzfkVarZzV.zzl();
            }
            zzgeVar.put(zzdrVar, zzflVarZzl);
            return;
        }
        if (value instanceof zzfq) {
            value = ((zzfq) value).zzc();
        } else if (value instanceof byte[]) {
            byte[] bArr3 = (byte[]) value;
            int length2 = bArr3.length;
            byte[] bArr4 = new byte[length2];
            System.arraycopy(bArr3, 0, bArr4, 0, length2);
            value = bArr4;
        }
        zzgeVar.put(zzdrVar, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzds) {
            return this.f352425a.equals(((zzds) obj).f352425a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f352425a.hashCode();
    }

    public final int zzb() {
        zzge zzgeVar;
        int i12 = 0;
        int iC2 = 0;
        while (true) {
            zzgeVar = this.f352425a;
            if (i12 >= zzgeVar.zzb()) {
                break;
            }
            iC2 += c(zzgeVar.zzg(i12));
            i12++;
        }
        Iterator it = zzgeVar.zzc().iterator();
        while (it.hasNext()) {
            iC2 += c((Map.Entry) it.next());
        }
        return iC2;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzds clone() {
        zzge zzgeVar;
        zzds zzdsVar = new zzds();
        int i12 = 0;
        while (true) {
            zzgeVar = this.f352425a;
            if (i12 >= zzgeVar.zzb()) {
                break;
            }
            Map.Entry entryZzg = zzgeVar.zzg(i12);
            zzdsVar.zzi((zzdr) entryZzg.getKey(), entryZzg.getValue());
            i12++;
        }
        for (Map.Entry entry : zzgeVar.zzc()) {
            zzdsVar.zzi((zzdr) entry.getKey(), entry.getValue());
        }
        zzdsVar.f352427c = this.f352427c;
        return zzdsVar;
    }

    public final Object zze(zzdr zzdrVar) {
        Object obj = this.f352425a.get(zzdrVar);
        if (obj instanceof zzes) {
            throw null;
        }
        return obj;
    }

    public final Iterator zzf() {
        boolean z12 = this.f352427c;
        zzge zzgeVar = this.f352425a;
        return z12 ? new zzer(zzgeVar.entrySet().iterator()) : zzgeVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.f352426b) {
            return;
        }
        this.f352425a.zza();
        this.f352426b = true;
    }

    public final void zzh(zzds zzdsVar) {
        zzge zzgeVar;
        int i12 = 0;
        while (true) {
            int iZzb = zzdsVar.f352425a.zzb();
            zzgeVar = zzdsVar.f352425a;
            if (i12 >= iZzb) {
                break;
            }
            a(zzgeVar.zzg(i12));
            i12++;
        }
        Iterator it = zzgeVar.zzc().iterator();
        while (it.hasNext()) {
            a((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzee) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzes) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdr r3, java.lang.Object r4) {
        /*
            r2 = this;
            r3.zzg()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf r0 = r3.zzd()
            java.nio.charset.Charset r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.f352447a
            r4.getClass()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf.zza
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg.INT
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L46;
                case 1: goto L43;
                case 2: goto L40;
                case 3: goto L3d;
                case 4: goto L3a;
                case 5: goto L37;
                case 6: goto L2e;
                case 7: goto L25;
                case 8: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L57
        L1c:
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzes
            if (r0 == 0) goto L57
            goto L4a
        L25:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzee
            if (r0 == 0) goto L57
            goto L4a
        L2e:
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L57
            goto L4a
        L37:
            boolean r0 = r4 instanceof java.lang.String
            goto L48
        L3a:
            boolean r0 = r4 instanceof java.lang.Boolean
            goto L48
        L3d:
            boolean r0 = r4 instanceof java.lang.Double
            goto L48
        L40:
            boolean r0 = r4 instanceof java.lang.Float
            goto L48
        L43:
            boolean r0 = r4 instanceof java.lang.Long
            goto L48
        L46:
            boolean r0 = r4 instanceof java.lang.Integer
        L48:
            if (r0 == 0) goto L57
        L4a:
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzes
            if (r0 == 0) goto L51
            r0 = 1
            r2.f352427c = r0
        L51:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge r0 = r2.f352425a
            r0.put(r3, r4)
            return
        L57:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf r3 = r3.zzd()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg r3 = r3.zza()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds.zzi(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdr, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.f352426b;
    }

    public final boolean zzk() {
        int i12 = 0;
        while (true) {
            zzge zzgeVar = this.f352425a;
            if (i12 >= zzgeVar.zzb()) {
                Iterator it = zzgeVar.zzc().iterator();
                while (it.hasNext()) {
                    if (!b((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!b(zzgeVar.zzg(i12))) {
                return false;
            }
            i12++;
        }
    }

    public zzds(int i12) {
        zzg();
        zzg();
    }
}
