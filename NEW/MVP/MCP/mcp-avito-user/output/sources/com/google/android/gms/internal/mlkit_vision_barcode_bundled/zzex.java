package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzex extends zzez {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f352458c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ zzex(zzew zzewVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez
    public final void a(long j12, Object obj) {
        Object objUnmodifiableList;
        List list = (List) zzgz.f352545c.zzm(obj, j12);
        if (list instanceof zzev) {
            objUnmodifiableList = ((zzev) list).zze();
        } else {
            if (f352458c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzft) && (list instanceof zzek)) {
                zzek zzekVar = (zzek) list;
                if (zzekVar.zzc()) {
                    zzekVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzgz.o(obj, j12, objUnmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez
    public final void b(Object obj, long j12, Object obj2) {
        zzeu zzeuVar;
        zzgy zzgyVar = zzgz.f352545c;
        List list = (List) zzgyVar.zzm(obj2, j12);
        int size = list.size();
        List listZzd = (List) zzgyVar.zzm(obj, j12);
        if (listZzd.isEmpty()) {
            listZzd = listZzd instanceof zzev ? new zzeu(size) : ((listZzd instanceof zzft) && (listZzd instanceof zzek)) ? ((zzek) listZzd).zzd(size) : new ArrayList(size);
            zzgz.o(obj, j12, listZzd);
        } else {
            if (f352458c.isAssignableFrom(listZzd.getClass())) {
                ArrayList arrayList = new ArrayList(listZzd.size() + size);
                arrayList.addAll(listZzd);
                zzgz.o(obj, j12, arrayList);
                zzeuVar = arrayList;
            } else if (listZzd instanceof zzgu) {
                zzeu zzeuVar2 = new zzeu(listZzd.size() + size);
                zzeuVar2.addAll(zzeuVar2.size(), (zzgu) listZzd);
                zzgz.o(obj, j12, zzeuVar2);
                zzeuVar = zzeuVar2;
            } else if ((listZzd instanceof zzft) && (listZzd instanceof zzek)) {
                zzek zzekVar = (zzek) listZzd;
                if (!zzekVar.zzc()) {
                    listZzd = zzekVar.zzd(listZzd.size() + size);
                    zzgz.o(obj, j12, listZzd);
                }
            }
            listZzd = zzeuVar;
        }
        int size2 = listZzd.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            listZzd.addAll(list);
        }
        if (size2 > 0) {
            list = listZzd;
        }
        zzgz.o(obj, j12, list);
    }

    public zzex() {
        super(null);
    }
}
