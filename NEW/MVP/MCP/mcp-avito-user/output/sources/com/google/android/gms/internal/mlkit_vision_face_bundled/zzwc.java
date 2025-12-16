package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzwc extends zzwg {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f354076c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ zzwc(zzwb zzwbVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwg
    public final void a(long j12, Object obj) {
        Object objUnmodifiableList;
        List list = (List) zzyg.i(j12, obj);
        if (list instanceof zzwa) {
            objUnmodifiableList = ((zzwa) list).zze();
        } else {
            if (f354076c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzxa) && (list instanceof zzvs)) {
                zzvs zzvsVar = (zzvs) list;
                if (zzvsVar.zzc()) {
                    zzvsVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzyg.p(obj, j12, objUnmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwg
    public final void b(Object obj, long j12, Object obj2) {
        zzvz zzvzVar;
        List list = (List) zzyg.i(j12, obj2);
        int size = list.size();
        List listZzd = (List) zzyg.i(j12, obj);
        if (listZzd.isEmpty()) {
            listZzd = listZzd instanceof zzwa ? new zzvz(size) : ((listZzd instanceof zzxa) && (listZzd instanceof zzvs)) ? ((zzvs) listZzd).zzd(size) : new ArrayList(size);
            zzyg.p(obj, j12, listZzd);
        } else {
            if (f354076c.isAssignableFrom(listZzd.getClass())) {
                ArrayList arrayList = new ArrayList(listZzd.size() + size);
                arrayList.addAll(listZzd);
                zzyg.p(obj, j12, arrayList);
                zzvzVar = arrayList;
            } else if (listZzd instanceof zzyb) {
                zzvz zzvzVar2 = new zzvz(listZzd.size() + size);
                zzvzVar2.addAll(zzvzVar2.size(), (zzyb) listZzd);
                zzyg.p(obj, j12, zzvzVar2);
                zzvzVar = zzvzVar2;
            } else if ((listZzd instanceof zzxa) && (listZzd instanceof zzvs)) {
                zzvs zzvsVar = (zzvs) listZzd;
                if (!zzvsVar.zzc()) {
                    listZzd = zzvsVar.zzd(listZzd.size() + size);
                    zzyg.p(obj, j12, listZzd);
                }
            }
            listZzd = zzvzVar;
        }
        int size2 = listZzd.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            listZzd.addAll(list);
        }
        if (size2 > 0) {
            list = listZzd;
        }
        zzyg.p(obj, j12, list);
    }

    public zzwc() {
        super(null);
    }
}
