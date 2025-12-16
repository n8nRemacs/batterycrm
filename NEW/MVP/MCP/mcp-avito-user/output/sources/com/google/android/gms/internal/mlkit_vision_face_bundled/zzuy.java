package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzuy {

    /* renamed from: b, reason: collision with root package name */
    public static final zzuy f354044b = new zzuy(0);
    public static final /* synthetic */ int zzb = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Map f354045a;

    public zzuy() {
        this.f354045a = new HashMap();
    }

    public static zzuy zza() {
        return new zzuy();
    }

    public final zzvl zzb(zzws zzwsVar, int i12) {
        return (zzvl) this.f354045a.get(new zzux(zzwsVar, i12));
    }

    public final void zzc(zzvl zzvlVar) {
        this.f354045a.put(new zzux(zzvlVar.f354061a, 202056002), zzvlVar);
    }

    public zzuy(int i12) {
        this.f354045a = Collections.emptyMap();
    }
}
