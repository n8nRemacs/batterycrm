package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzhw implements Comparator<zzhu> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzhu zzhuVar, zzhu zzhuVar2) {
        zzhu zzhuVar3 = zzhuVar;
        zzhu zzhuVar4 = zzhuVar2;
        zzia zziaVar = (zzia) zzhuVar3.iterator();
        zzia zziaVar2 = (zzia) zzhuVar4.iterator();
        while (zziaVar.hasNext() && zziaVar2.hasNext()) {
            int iCompareTo = Integer.valueOf(zziaVar.zza() & 255).compareTo(Integer.valueOf(zziaVar2.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzhuVar3.zzb()).compareTo(Integer.valueOf(zzhuVar4.zzb()));
    }
}
