package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public abstract class zzvj extends zzvn implements zzwt {
    protected zzvd zzb = zzvd.zzd();

    public final zzvd k() {
        if (this.zzb.zzk()) {
            this.zzb = this.zzb.clone();
        }
        return this.zzb;
    }

    public final Object zzd(zzuw zzuwVar) {
        zzvl zzvlVar = (zzvl) zzuwVar;
        if (zzvlVar.f354061a != ((zzvn) h(6, null))) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        zzvd zzvdVar = this.zzb;
        zzvk zzvkVar = zzvlVar.f354064d;
        Object objZze = zzvdVar.zze(zzvkVar);
        if (objZze == null) {
            return zzvlVar.f354062b;
        }
        if (zzvkVar.f354060b.zza() != zzyn.ENUM) {
            return objZze;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) objZze) {
            if (zzvkVar.f354060b.zza() == zzyn.ENUM) {
                ((Integer) obj).getClass();
                throw null;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
