package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Arrays;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzxy extends zzxw {
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxw
    public final /* synthetic */ int a(Object obj) {
        return ((zzxx) obj).zza();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxw
    public final /* synthetic */ int b(Object obj) {
        return ((zzxx) obj).zzb();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxw
    public final /* bridge */ /* synthetic */ zzxx c(Object obj) {
        zzvn zzvnVar = (zzvn) obj;
        zzxx zzxxVar = zzvnVar.zzc;
        if (zzxxVar != zzxx.zzc()) {
            return zzxxVar;
        }
        zzxx zzxxVarA = zzxx.a();
        zzvnVar.zzc = zzxxVarA;
        return zzxxVarA;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxw
    public final /* synthetic */ zzxx d(Object obj) {
        return ((zzvn) obj).zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxw
    public final Object e(Object obj, Object obj2) {
        if (zzxx.zzc().equals(obj2)) {
            return obj;
        }
        if (zzxx.zzc().equals(obj)) {
            zzxx zzxxVar = (zzxx) obj2;
            zzxx zzxxVar2 = (zzxx) obj;
            int i12 = zzxxVar2.f354138a + zzxxVar.f354138a;
            int[] iArrCopyOf = Arrays.copyOf(zzxxVar2.f354139b, i12);
            System.arraycopy(zzxxVar.f354139b, 0, iArrCopyOf, zzxxVar2.f354138a, zzxxVar.f354138a);
            Object[] objArrCopyOf = Arrays.copyOf(zzxxVar2.f354140c, i12);
            System.arraycopy(zzxxVar.f354140c, 0, objArrCopyOf, zzxxVar2.f354138a, zzxxVar.f354138a);
            return new zzxx(i12, iArrCopyOf, objArrCopyOf, true);
        }
        zzxx zzxxVar3 = (zzxx) obj2;
        zzxx zzxxVar4 = (zzxx) obj;
        zzxxVar4.getClass();
        if (zzxxVar3.equals(zzxx.f354137f)) {
            return obj;
        }
        if (!zzxxVar4.f354142e) {
            throw new UnsupportedOperationException();
        }
        int i13 = zzxxVar4.f354138a + zzxxVar3.f354138a;
        zzxxVar4.c(i13);
        System.arraycopy(zzxxVar3.f354139b, 0, zzxxVar4.f354139b, zzxxVar4.f354138a, zzxxVar3.f354138a);
        System.arraycopy(zzxxVar3.f354140c, 0, zzxxVar4.f354140c, zzxxVar4.f354138a, zzxxVar3.f354138a);
        zzxxVar4.f354138a = i13;
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxw
    public final /* bridge */ /* synthetic */ void f(int i12, long j12, Object obj) {
        ((zzxx) obj).b(i12 << 3, Long.valueOf(j12));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxw
    public final void g(Object obj) {
        ((zzvn) obj).zzc.zzh();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxw
    public final /* synthetic */ void h(Object obj, Object obj2) {
        ((zzvn) obj).zzc = (zzxx) obj2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxw
    public final void i(Object obj, zzyo zzyoVar) {
        zzxx zzxxVar = (zzxx) obj;
        for (int i12 = 0; i12 < zzxxVar.f354138a; i12++) {
            zzyoVar.zzw(zzxxVar.f354139b[i12] >>> 3, zzxxVar.f354140c[i12]);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxw
    public final /* synthetic */ void j(Object obj, zzyo zzyoVar) {
        ((zzxx) obj).zzl(zzyoVar);
    }
}
