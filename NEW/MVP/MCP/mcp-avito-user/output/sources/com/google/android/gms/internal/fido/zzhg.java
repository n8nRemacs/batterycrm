package com.google.android.gms.internal.fido;

import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzhg extends zzhp {

    /* renamed from: b, reason: collision with root package name */
    public final zzcc f350413b;

    /* renamed from: c, reason: collision with root package name */
    public final int f350414c;

    public zzhg(zzcc zzccVar) throws zzhf {
        zzccVar.getClass();
        this.f350413b = zzccVar;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            zzcc zzccVar2 = this.f350413b;
            if (i12 >= zzccVar2.size()) {
                break;
            }
            int iA2 = ((zzhp) zzccVar2.get(i12)).a();
            if (i13 < iA2) {
                i13 = iA2;
            }
            i12++;
        }
        int i14 = i13 + 1;
        this.f350414c = i14;
        if (i14 > 8) {
            throw new zzhf();
        }
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int a() {
        return this.f350414c;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        int iZza = zzhpVar.zza();
        int iC2 = zzhp.c((byte) -128);
        if (iC2 != iZza) {
            return iC2 - zzhpVar.zza();
        }
        zzcc zzccVar = this.f350413b;
        int size = zzccVar.size();
        zzcc zzccVar2 = ((zzhg) zzhpVar).f350413b;
        if (size != zzccVar2.size()) {
            return zzccVar.size() - zzccVar2.size();
        }
        for (int i12 = 0; i12 < zzccVar.size(); i12++) {
            int iCompareTo = ((zzhp) zzccVar.get(i12)).compareTo((zzhp) zzccVar2.get(i12));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhg.class == obj.getClass()) {
            return this.f350413b.equals(((zzhg) obj).f350413b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.c((byte) -128)), this.f350413b});
    }

    public final String toString() {
        zzcc zzccVar = this.f350413b;
        if (zzccVar.isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        ArrayList arrayList = new ArrayList();
        int size = zzccVar.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(((zzhp) zzccVar.get(i12)).toString().replace("\n", "\n  "));
        }
        zzbd zzbdVarZza = zzbd.zza(",\n  ");
        StringBuilder sb2 = new StringBuilder("[\n  ");
        zzbdVarZza.zzc(sb2, arrayList.iterator());
        sb2.append("\n]");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.c((byte) -128);
    }
}
