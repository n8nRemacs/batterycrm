package com.google.mlkit.vision.common.internal;

import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b;
import com.google.firebase.components.f;
import com.google.firebase.components.n;
import com.google.mlkit.vision.common.internal.a;
import j.N;
import java.util.List;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
@RX0.a
/* loaded from: classes6.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @N
    public final List getComponents() {
        b.C10697b c10697bB = b.b(a.class);
        c10697bB.a(new n(2, 0, a.d.class));
        c10697bB.c(new f() { // from class: SZ0.l
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                return new com.google.mlkit.vision.common.internal.a(cVar.h(a.d.class));
            }
        });
        return zzp.zzi(c10697bB.b());
    }
}
