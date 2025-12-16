package com.google.mlkit.vision.face.internal;

import com.google.android.gms.internal.mlkit_vision_face.zzbn;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b;
import com.google.mlkit.common.sdkinternal.C37637f;
import com.google.mlkit.common.sdkinternal.C37642k;
import j.N;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
@RX0.a
/* loaded from: classes6.dex */
public class FaceRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @N
    public final List getComponents() {
        b.C10697b c10697bB = com.google.firebase.components.b.b(f.class);
        c10697bB.a(com.google.firebase.components.n.a(C37642k.class));
        c10697bB.c(new com.google.firebase.components.f() { // from class: com.google.mlkit.vision.face.internal.l
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                return new f((C37642k) cVar.a(C37642k.class));
            }
        });
        com.google.firebase.components.b bVarB = c10697bB.b();
        b.C10697b c10697bB2 = com.google.firebase.components.b.b(d.class);
        c10697bB2.a(com.google.firebase.components.n.a(f.class));
        c10697bB2.a(com.google.firebase.components.n.a(C37637f.class));
        c10697bB2.c(new com.google.firebase.components.f() { // from class: com.google.mlkit.vision.face.internal.m
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                return new d((f) cVar.a(f.class), (C37637f) cVar.a(C37637f.class));
            }
        });
        return zzbn.zzi(bVarB, c10697bB2.b());
    }
}
