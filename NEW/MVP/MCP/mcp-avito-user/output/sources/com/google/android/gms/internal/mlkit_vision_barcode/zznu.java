package com.google.android.gms.internal.mlkit_vision_barcode;

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

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zznu implements zznl {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final p f352219a;

    /* renamed from: b, reason: collision with root package name */
    public final p f352220b;

    /* renamed from: c, reason: collision with root package name */
    public final zzne f352221c;

    public zznu(Context context, zzne zzneVar) {
        this.f352221c = zzneVar;
        a aVar = a.f342925e;
        v.b(context);
        final h hVarC = v.a().c(aVar);
        if (a.f342924d.contains(new c("json"))) {
            this.f352219a = new p(new b() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzns
                @Override // wZ0.b
                public final Object get() {
                    return hVarC.a("FIREBASE_ML_SDK", new c("json"), new f() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zznq
                        @Override // com.google.android.datatransport.f
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f352220b = new p(new b() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zznt
            @Override // wZ0.b
            public final Object get() {
                return hVarC.a("FIREBASE_ML_SDK", new c("proto"), new f() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zznr
                    @Override // com.google.android.datatransport.f
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zznl
    public final void zza(zznp zznpVar) {
        zzne zzneVar = this.f352221c;
        if (zzneVar.zza() != 0) {
            g gVar = (g) this.f352220b.get();
            int iZza = zzneVar.zza();
            gVar.a(zznpVar.zza() != 0 ? d.d(zznpVar.zzc(iZza, false)) : d.e(zznpVar.zzc(iZza, false)));
        } else {
            p pVar = this.f352219a;
            if (pVar != null) {
                g gVar2 = (g) pVar.get();
                int iZza2 = zzneVar.zza();
                gVar2.a(zznpVar.zza() != 0 ? d.d(zznpVar.zzc(iZza2, false)) : d.e(zznpVar.zzc(iZza2, false)));
            }
        }
    }
}
