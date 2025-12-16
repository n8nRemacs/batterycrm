package com.google.mlkit.common.internal;

import NZ0.e;
import RX0.a;
import com.google.android.gms.internal.mlkit_common.zzaq;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b;
import com.google.firebase.components.f;
import com.google.firebase.components.n;
import com.google.mlkit.common.internal.model.j;
import com.google.mlkit.common.sdkinternal.C37632a;
import com.google.mlkit.common.sdkinternal.C37634c;
import com.google.mlkit.common.sdkinternal.C37637f;
import com.google.mlkit.common.sdkinternal.C37642k;
import com.google.mlkit.common.sdkinternal.C37643l;
import com.google.mlkit.common.sdkinternal.model.d;
import com.google.mlkit.common.sdkinternal.p;
import j.N;
import java.util.List;

/* compiled from: com.google.mlkit:common@@18.10.0 */
@a
/* loaded from: classes6.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @N
    public final List getComponents() {
        b<?> bVar = p.f362380b;
        b.C10697b c10697bB = b.b(d.class);
        c10697bB.a(n.a(C37642k.class));
        c10697bB.c(new f() { // from class: MZ0.a
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                return new com.google.mlkit.common.sdkinternal.model.d((C37642k) cVar.a(C37642k.class));
            }
        });
        b bVarB = c10697bB.b();
        b.C10697b c10697bB2 = b.b(C37643l.class);
        c10697bB2.c(new f() { // from class: MZ0.b
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                return new C37643l();
            }
        });
        b bVarB2 = c10697bB2.b();
        b.C10697b c10697bB3 = b.b(e.class);
        c10697bB3.a(new n(2, 0, e.a.class));
        c10697bB3.c(new f() { // from class: MZ0.c
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                return new NZ0.e(cVar.h(e.a.class));
            }
        });
        b bVarB3 = c10697bB3.b();
        b.C10697b c10697bB4 = b.b(C37637f.class);
        c10697bB4.a(new n(1, 1, C37643l.class));
        c10697bB4.c(new f() { // from class: MZ0.d
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                return new C37637f(cVar.b(C37643l.class));
            }
        });
        b bVarB4 = c10697bB4.b();
        b.C10697b c10697bB5 = b.b(C37632a.class);
        c10697bB5.c(new f() { // from class: MZ0.e
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                return C37632a.a();
            }
        });
        b bVarB5 = c10697bB5.b();
        b.C10697b c10697bB6 = b.b(C37634c.a.class);
        c10697bB6.a(n.a(C37632a.class));
        c10697bB6.c(new f() { // from class: MZ0.f
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                return new C37634c.a();
            }
        });
        b bVarB6 = c10697bB6.b();
        b.C10697b c10697bB7 = b.b(j.class);
        c10697bB7.a(n.a(C37642k.class));
        c10697bB7.c(new f() { // from class: MZ0.g
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                return new j((C37642k) cVar.a(C37642k.class));
            }
        });
        b bVarB7 = c10697bB7.b();
        b.C10697b c10697bB8 = b.b(e.a.class);
        c10697bB8.f360736e = 1;
        c10697bB8.a(new n(1, 1, j.class));
        c10697bB8.c(new f() { // from class: MZ0.h
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                return new e.a(cVar.b(j.class));
            }
        });
        return zzaq.zzi(bVar, bVarB, bVarB2, bVarB3, bVarB4, bVarB5, bVarB6, bVarB7, c10697bB8.b());
    }
}
