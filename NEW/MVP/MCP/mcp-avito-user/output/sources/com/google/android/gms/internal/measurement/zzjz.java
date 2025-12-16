package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzjz extends zzka {

    /* renamed from: c, reason: collision with root package name */
    public static final Class<?> f350908c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(int i12, long j12, Object obj) {
        zzjy zzjyVar;
        List list = (List) zzmo.r(j12, obj);
        if (list.isEmpty()) {
            List zzjyVar2 = list instanceof zzjx ? new zzjy(i12) : ((list instanceof zzld) && (list instanceof zzjn)) ? ((zzjn) list).zza(i12) : new ArrayList(i12);
            zzmo.g(obj, j12, zzjyVar2);
            return zzjyVar2;
        }
        if (f350908c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i12);
            arrayList.addAll(list);
            zzmo.g(obj, j12, arrayList);
            zzjyVar = arrayList;
        } else {
            if (!(list instanceof zzmj)) {
                if (!(list instanceof zzld) || !(list instanceof zzjn)) {
                    return list;
                }
                zzjn zzjnVar = (zzjn) list;
                if (zzjnVar.zzc()) {
                    return list;
                }
                zzjn zzjnVarZza = zzjnVar.zza(list.size() + i12);
                zzmo.g(obj, j12, zzjnVarZza);
                return zzjnVarZza;
            }
            zzjy zzjyVar3 = new zzjy(list.size() + i12);
            zzjyVar3.addAll((zzmj) list);
            zzmo.g(obj, j12, zzjyVar3);
            zzjyVar = zzjyVar3;
        }
        return zzjyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final List a(long j12, Object obj) {
        return d(10, j12, obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final void b(Object obj, long j12, Object obj2) {
        List list = (List) zzmo.r(j12, obj2);
        List listD = d(list.size(), j12, obj);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        zzmo.g(obj, j12, list);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final void c(long j12, Object obj) {
        Object objUnmodifiableList;
        List list = (List) zzmo.r(j12, obj);
        if (list instanceof zzjx) {
            objUnmodifiableList = ((zzjx) list).h_();
        } else {
            if (f350908c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzld) && (list instanceof zzjn)) {
                zzjn zzjnVar = (zzjn) list;
                if (zzjnVar.zzc()) {
                    zzjnVar.i_();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzmo.g(obj, j12, objUnmodifiableList);
    }

    public zzjz() {
        super();
    }
}
