package org.mockito.internal.creation.bytebuddy;

import net.bytebuddy.matcher.C44394c;
import net.bytebuddy.matcher.C44402k;
import net.bytebuddy.matcher.C44405n;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.C44413w;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.K;

/* compiled from: BytecodeGenerator.java */
/* renamed from: org.mockito.internal.creation.bytebuddy.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC44924c {
    static InterfaceC44410t.a b(boolean z12) {
        InterfaceC44410t.a.c cVarD = C44411u.l(C44411u.x("groovy.lang.GroovyObjectSupport")).d(new C44405n(new C44402k(new C44394c(C44411u.x("groovy.transform.Internal")))));
        return z12 ? cVarD.d(C44411u.x("$getStaticMetaClass").a(new K(new C44413w(C44411u.x("groovy.lang.MetaClass"))))) : cVarD;
    }

    <T> Class<? extends T> a(n<T> nVar);
}
