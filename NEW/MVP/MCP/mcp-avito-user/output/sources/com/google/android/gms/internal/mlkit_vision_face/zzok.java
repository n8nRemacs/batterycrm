package com.google.android.gms.internal.mlkit_vision_face;

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

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzok implements zzob {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final p f353446a;

    /* renamed from: b, reason: collision with root package name */
    public final p f353447b;

    /* renamed from: c, reason: collision with root package name */
    public final zznt f353448c;

    public zzok(Context context, zznt zzntVar) {
        this.f353448c = zzntVar;
        a aVar = a.f342925e;
        v.b(context);
        final h hVarC = v.a().c(aVar);
        if (a.f342924d.contains(new c("json"))) {
            this.f353446a = new p(new b() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoh
                @Override // wZ0.b
                public final Object get() {
                    return hVarC.a("FIREBASE_ML_SDK", new c("json"), new f() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoj
                        @Override // com.google.android.datatransport.f
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f353447b = new p(new b() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoi
            @Override // wZ0.b
            public final Object get() {
                return hVarC.a("FIREBASE_ML_SDK", new c("proto"), new f() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzog
                    @Override // com.google.android.datatransport.f
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzob
    public final void zza(zznr zznrVar) {
        zznt zzntVar = this.f353448c;
        if (zzntVar.zza() != 0) {
            g gVar = (g) this.f353447b.get();
            int iZza = zzntVar.zza();
            gVar.a(zznrVar.zza() != 0 ? d.d(zznrVar.zze(iZza, false)) : d.e(zznrVar.zze(iZza, false)));
        } else {
            p pVar = this.f353446a;
            if (pVar != null) {
                g gVar2 = (g) pVar.get();
                int iZza2 = zzntVar.zza();
                gVar2.a(zznrVar.zza() != 0 ? d.d(zznrVar.zze(iZza2, false)) : d.e(zznrVar.zze(iZza2, false)));
            }
        }
    }
}
