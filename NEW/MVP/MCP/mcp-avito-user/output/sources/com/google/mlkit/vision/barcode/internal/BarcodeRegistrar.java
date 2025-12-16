package com.google.mlkit.vision.barcode.internal;

import com.google.android.gms.internal.mlkit_vision_barcode.zzcc;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b;
import com.google.mlkit.common.sdkinternal.C37637f;
import com.google.mlkit.common.sdkinternal.C37642k;
import j.N;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
@RX0.a
/* loaded from: classes6.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @N
    public final List getComponents() {
        b.C10697b c10697bB = com.google.firebase.components.b.b(g.class);
        c10697bB.a(com.google.firebase.components.n.a(C37642k.class));
        c10697bB.c(new com.google.firebase.components.f() { // from class: com.google.mlkit.vision.barcode.internal.d
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                return new g((C37642k) cVar.a(C37642k.class));
            }
        });
        com.google.firebase.components.b bVarB = c10697bB.b();
        b.C10697b c10697bB2 = com.google.firebase.components.b.b(f.class);
        c10697bB2.a(com.google.firebase.components.n.a(g.class));
        c10697bB2.a(com.google.firebase.components.n.a(C37637f.class));
        c10697bB2.c(new com.google.firebase.components.f() { // from class: com.google.mlkit.vision.barcode.internal.e
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                return new f((g) cVar.a(g.class), (C37637f) cVar.a(C37637f.class));
            }
        });
        return zzcc.zzi(bVarB, c10697bB2.b());
    }
}
