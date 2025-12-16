package com.google.android.gms.internal.measurement;

import XY0.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzar extends zzal implements zzak {

    /* renamed from: d, reason: collision with root package name */
    @e
    public final ArrayList f350564d;

    /* renamed from: e, reason: collision with root package name */
    @e
    public final ArrayList f350565e;

    /* renamed from: f, reason: collision with root package name */
    @e
    public final zzh f350566f;

    public zzar(zzar zzarVar) {
        super(zzarVar.f350560b);
        ArrayList arrayList = new ArrayList(zzarVar.f350564d.size());
        this.f350564d = arrayList;
        arrayList.addAll(zzarVar.f350564d);
        ArrayList arrayList2 = new ArrayList(zzarVar.f350565e.size());
        this.f350565e = arrayList2;
        arrayList2.addAll(zzarVar.f350565e);
        this.f350566f = zzarVar.f350566f;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        zzh zzhVarZza = this.f350566f.zza();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f350564d;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (i12 < list.size()) {
                zzhVarZza.zza((String) arrayList.get(i12), zzhVar.zza(list.get(i12)));
            } else {
                zzhVarZza.zza((String) arrayList.get(i12), zzaq.zzc);
            }
            i12++;
        }
        Iterator it = this.f350565e.iterator();
        while (it.hasNext()) {
            zzaq zzaqVar = (zzaq) it.next();
            zzaq zzaqVarZza = zzhVarZza.zza(zzaqVar);
            if (zzaqVarZza instanceof zzat) {
                zzaqVarZza = zzhVarZza.zza(zzaqVar);
            }
            if (zzaqVarZza instanceof zzaj) {
                return ((zzaj) zzaqVarZza).zza();
            }
        }
        return zzaq.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzal, com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzar(this);
    }

    public zzar(String str, List<zzaq> list, List<zzaq> list2, zzh zzhVar) {
        super(str);
        this.f350564d = new ArrayList();
        this.f350566f = zzhVar;
        if (!list.isEmpty()) {
            Iterator<zzaq> it = list.iterator();
            while (it.hasNext()) {
                this.f350564d.add(it.next().zzf());
            }
        }
        this.f350565e = new ArrayList(list2);
    }
}
