package com.google.android.gms.internal.mlkit_common;

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

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final class zzta implements zzsk {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final p f351738a;

    /* renamed from: b, reason: collision with root package name */
    public final p f351739b;

    /* renamed from: c, reason: collision with root package name */
    public final zzsm f351740c;

    public zzta(Context context, zzsm zzsmVar) {
        this.f351740c = zzsmVar;
        a aVar = a.f342925e;
        v.b(context);
        final h hVarC = v.a().c(aVar);
        if (a.f342924d.contains(new c("json"))) {
            this.f351738a = new p(new b() { // from class: com.google.android.gms.internal.mlkit_common.zzsx
                @Override // wZ0.b
                public final Object get() {
                    return hVarC.a("FIREBASE_ML_SDK", new c("json"), new f() { // from class: com.google.android.gms.internal.mlkit_common.zzsz
                        @Override // com.google.android.datatransport.f
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f351739b = new p(new b() { // from class: com.google.android.gms.internal.mlkit_common.zzsy
            @Override // wZ0.b
            public final Object get() {
                return hVarC.a("FIREBASE_ML_SDK", new c("proto"), new f() { // from class: com.google.android.gms.internal.mlkit_common.zzsw
                    @Override // com.google.android.datatransport.f
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsk
    public final void zza(zzsj zzsjVar) {
        zzsm zzsmVar = this.f351740c;
        if (zzsmVar.zza() != 0) {
            ((g) this.f351739b.get()).a(d.e(zzsjVar.zze(zzsmVar.zza(), false)));
            return;
        }
        p pVar = this.f351738a;
        if (pVar != null) {
            ((g) pVar.get()).a(d.e(zzsjVar.zze(zzsmVar.zza(), false)));
        }
    }
}
