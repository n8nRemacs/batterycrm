package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzeq {

    /* renamed from: a, reason: collision with root package name */
    public final zzgl f350097a = new zzgl(16, null);

    /* renamed from: b, reason: collision with root package name */
    public boolean f350098b;

    static {
        new zzeq(0);
    }

    public zzeq() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.google.android.gms.internal.auth.zzep r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.auth.zzho r0 = r2.zzb()
            java.nio.charset.Charset r1 = com.google.android.gms.internal.auth.zzfa.f350106a
            r3.getClass()
            com.google.android.gms.internal.auth.zzho r1 = com.google.android.gms.internal.auth.zzho.zza
            com.google.android.gms.internal.auth.zzhp r1 = com.google.android.gms.internal.auth.zzhp.INT
            com.google.android.gms.internal.auth.zzhp r0 = r0.zza()
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
            boolean r0 = r3 instanceof com.google.android.gms.internal.auth.zzfx
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof com.google.android.gms.internal.auth.zzfc
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof com.google.android.gms.internal.auth.zzex
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r3 instanceof com.google.android.gms.internal.auth.zzef
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
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.auth.zzho r2 = r2.zzb()
            com.google.android.gms.internal.auth.zzhp r2 = r2.zza()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzeq.a(com.google.android.gms.internal.auth.zzep, java.lang.Object):void");
    }

    public static zzeq zza() {
        throw null;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzgl zzglVar;
        zzeq zzeqVar = new zzeq();
        int i12 = 0;
        while (true) {
            zzglVar = this.f350097a;
            if (i12 >= zzglVar.zzb()) {
                break;
            }
            Map.Entry entryZzg = zzglVar.zzg(i12);
            zzeqVar.zzc((zzep) entryZzg.getKey(), entryZzg.getValue());
            i12++;
        }
        for (Map.Entry entry : zzglVar.zzc()) {
            zzeqVar.zzc((zzep) entry.getKey(), entry.getValue());
        }
        return zzeqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzeq) {
            return this.f350097a.equals(((zzeq) obj).f350097a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f350097a.hashCode();
    }

    public final void zzb() {
        if (this.f350098b) {
            return;
        }
        int i12 = 0;
        while (true) {
            zzgl zzglVar = this.f350097a;
            if (i12 >= zzglVar.zzb()) {
                zzglVar.zza();
                this.f350098b = true;
                return;
            }
            Map.Entry entryZzg = zzglVar.zzg(i12);
            if (entryZzg.getValue() instanceof zzev) {
                zzev zzevVar = (zzev) entryZzg.getValue();
                zzevVar.getClass();
                zzgf.zza().zzb(zzevVar.getClass()).zze(zzevVar);
                zzevVar.c();
            }
            i12++;
        }
    }

    public final void zzc(zzep zzepVar, Object obj) {
        if (!zzepVar.zzc()) {
            a(zzepVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                a(zzepVar, arrayList.get(i12));
            }
            obj = arrayList;
        }
        boolean z12 = obj instanceof zzfc;
        this.f350097a.put(zzepVar, obj);
    }

    public zzeq(int i12) {
        zzb();
        zzb();
    }
}
