package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzva extends zzuz {
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuz
    public final void a(Map.Entry entry) {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuz
    public final zzvd b(Object obj) {
        return ((zzvj) obj).zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuz
    public final zzvd c(Object obj) {
        return ((zzvj) obj).k();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuz
    public final zzvl d(zzuy zzuyVar, zzws zzwsVar, int i12) {
        return zzuyVar.zzb(zzwsVar, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuz
    public final void e(Object obj) {
        ((zzvj) obj).zzb.zzh();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuz
    public final void f(zzyo zzyoVar, Map.Entry entry) {
        zzvk zzvkVar = (zzvk) entry.getKey();
        zzym zzymVar = zzym.zza;
        switch (zzvkVar.f354060b.ordinal()) {
            case 0:
                zzxh.zzu(202056002, (List) entry.getValue(), zzyoVar, false);
                break;
            case 1:
                zzxh.zzy(202056002, (List) entry.getValue(), zzyoVar, false);
                break;
            case 2:
                zzxh.zzB(202056002, (List) entry.getValue(), zzyoVar, false);
                break;
            case 3:
                zzxh.zzJ(202056002, (List) entry.getValue(), zzyoVar, false);
                break;
            case 4:
                zzxh.zzA(202056002, (List) entry.getValue(), zzyoVar, false);
                break;
            case 5:
                zzxh.zzx(202056002, (List) entry.getValue(), zzyoVar, false);
                break;
            case 6:
                zzxh.zzw(202056002, (List) entry.getValue(), zzyoVar, false);
                break;
            case 7:
                zzxh.zzs(202056002, (List) entry.getValue(), zzyoVar, false);
                break;
            case 8:
                zzxh.zzH(202056002, (List) entry.getValue(), zzyoVar);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzxh.zzz(202056002, (List) entry.getValue(), zzyoVar, zzxb.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzxh.zzC(202056002, (List) entry.getValue(), zzyoVar, zzxb.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                zzxh.zzt(202056002, (List) entry.getValue(), zzyoVar);
                break;
            case 12:
                zzxh.zzI(202056002, (List) entry.getValue(), zzyoVar, false);
                break;
            case 13:
                zzxh.zzA(202056002, (List) entry.getValue(), zzyoVar, false);
                break;
            case 14:
                zzxh.zzD(202056002, (List) entry.getValue(), zzyoVar, false);
                break;
            case 15:
                zzxh.zzE(202056002, (List) entry.getValue(), zzyoVar, false);
                break;
            case 16:
                zzxh.zzF(202056002, (List) entry.getValue(), zzyoVar, false);
                break;
            case 17:
                zzxh.zzG(202056002, (List) entry.getValue(), zzyoVar, false);
                break;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuz
    public final boolean g(zzws zzwsVar) {
        return zzwsVar instanceof zzvj;
    }
}
