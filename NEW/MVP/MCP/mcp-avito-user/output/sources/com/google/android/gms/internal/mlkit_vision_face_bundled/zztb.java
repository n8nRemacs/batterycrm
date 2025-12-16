package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.content.Context;
import com.google.android.datatransport.c;
import com.google.android.datatransport.cct.a;
import com.google.android.datatransport.d;
import com.google.android.datatransport.f;
import com.google.android.datatransport.g;
import com.google.android.datatransport.h;
import com.google.android.datatransport.runtime.v;
import com.google.firebase.components.p;
import j.P;
import wZ0.b;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zztb implements zzsm {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final p f353991a;

    /* renamed from: b, reason: collision with root package name */
    public final p f353992b;

    /* renamed from: c, reason: collision with root package name */
    public final zzso f353993c;

    public zztb(Context context, zzso zzsoVar) {
        this.f353993c = zzsoVar;
        a aVar = a.f342925e;
        v.b(context);
        final h hVarC = v.a().c(aVar);
        if (a.f342924d.contains(new c("json"))) {
            this.f353991a = new p(new b() { // from class: com.google.android.gms.internal.mlkit_vision_face_bundled.zzsy
                @Override // wZ0.b
                public final Object get() {
                    return hVarC.a("FIREBASE_ML_SDK", new c("json"), new f() { // from class: com.google.android.gms.internal.mlkit_vision_face_bundled.zzta
                        @Override // com.google.android.datatransport.f
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f353992b = new p(new b() { // from class: com.google.android.gms.internal.mlkit_vision_face_bundled.zzsz
            @Override // wZ0.b
            public final Object get() {
                return hVarC.a("FIREBASE_ML_SDK", new c("proto"), new f() { // from class: com.google.android.gms.internal.mlkit_vision_face_bundled.zzsx
                    @Override // com.google.android.datatransport.f
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzsm
    public final void zza(zzsl zzslVar) {
        zzso zzsoVar = this.f353993c;
        if (zzsoVar.zza() != 0) {
            g gVar = (g) this.f353992b.get();
            int iZza = zzsoVar.zza();
            gVar.a(zzslVar.zza() != 0 ? d.d(zzslVar.zze(iZza, false)) : d.e(zzslVar.zze(iZza, false)));
        } else {
            p pVar = this.f353991a;
            if (pVar != null) {
                g gVar2 = (g) pVar.get();
                int iZza2 = zzsoVar.zza();
                gVar2.a(zzslVar.zza() != 0 ? d.d(zzslVar.zze(iZza2, false)) : d.e(zzslVar.zze(iZza2, false)));
            }
        }
    }
}
