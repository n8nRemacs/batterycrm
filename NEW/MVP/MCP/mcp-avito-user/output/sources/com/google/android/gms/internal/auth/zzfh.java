package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzfh extends zzfl {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f350109c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ zzfh(zzfg zzfgVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    public final void a(long j12, Object obj) {
        Object objUnmodifiableList;
        List list = (List) zzhj.d(j12, obj);
        if (list instanceof zzff) {
            objUnmodifiableList = ((zzff) list).zze();
        } else {
            if (f350109c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzge) && (list instanceof zzez)) {
                zzez zzezVar = (zzez) list;
                if (zzezVar.zzc()) {
                    zzezVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzhj.m(obj, j12, objUnmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzfl
    public final void b(Object obj, long j12, Object obj2) {
        zzfe zzfeVar;
        List list = (List) zzhj.d(j12, obj2);
        int size = list.size();
        List listZzd = (List) zzhj.d(j12, obj);
        if (listZzd.isEmpty()) {
            listZzd = listZzd instanceof zzff ? new zzfe(size) : ((listZzd instanceof zzge) && (listZzd instanceof zzez)) ? ((zzez) listZzd).zzd(size) : new ArrayList(size);
            zzhj.m(obj, j12, listZzd);
        } else {
            if (f350109c.isAssignableFrom(listZzd.getClass())) {
                ArrayList arrayList = new ArrayList(listZzd.size() + size);
                arrayList.addAll(listZzd);
                zzhj.m(obj, j12, arrayList);
                zzfeVar = arrayList;
            } else if (listZzd instanceof zzhe) {
                zzfe zzfeVar2 = new zzfe(listZzd.size() + size);
                zzfeVar2.addAll(zzfeVar2.size(), (zzhe) listZzd);
                zzhj.m(obj, j12, zzfeVar2);
                zzfeVar = zzfeVar2;
            } else if ((listZzd instanceof zzge) && (listZzd instanceof zzez)) {
                zzez zzezVar = (zzez) listZzd;
                if (!zzezVar.zzc()) {
                    listZzd = zzezVar.zzd(listZzd.size() + size);
                    zzhj.m(obj, j12, listZzd);
                }
            }
            listZzd = zzfeVar;
        }
        int size2 = listZzd.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            listZzd.addAll(list);
        }
        if (size2 > 0) {
            list = listZzd;
        }
        zzhj.m(obj, j12, list);
    }

    public zzfh() {
        super(null);
    }
}
