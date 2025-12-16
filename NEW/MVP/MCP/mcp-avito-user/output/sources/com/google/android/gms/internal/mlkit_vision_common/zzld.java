package com.google.android.gms.internal.mlkit_vision_common;

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

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
public final class zzld implements zzkw {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final p f352907a;

    /* renamed from: b, reason: collision with root package name */
    public final p f352908b;

    /* renamed from: c, reason: collision with root package name */
    public final zzkr f352909c;

    public zzld(Context context, zzkr zzkrVar) {
        this.f352909c = zzkrVar;
        a aVar = a.f342925e;
        v.b(context);
        final h hVarC = v.a().c(aVar);
        if (a.f342924d.contains(new c("json"))) {
            this.f352907a = new p(new b() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzla
                @Override // wZ0.b
                public final Object get() {
                    return hVarC.a("FIREBASE_ML_SDK", new c("json"), new f() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzlc
                        @Override // com.google.android.datatransport.f
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f352908b = new p(new b() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzlb
            @Override // wZ0.b
            public final Object get() {
                return hVarC.a("FIREBASE_ML_SDK", new c("proto"), new f() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzkz
                    @Override // com.google.android.datatransport.f
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzkw
    public final void zza(zzkp zzkpVar) {
        zzkr zzkrVar = this.f352909c;
        if (zzkrVar.zza() != 0) {
            ((g) this.f352908b.get()).a(d.e(zzkpVar.zzd(zzkrVar.zza(), false)));
            return;
        }
        p pVar = this.f352907a;
        if (pVar != null) {
            ((g) pVar.get()).a(d.e(zzkpVar.zzd(zzkrVar.zza(), false)));
        }
    }
}
