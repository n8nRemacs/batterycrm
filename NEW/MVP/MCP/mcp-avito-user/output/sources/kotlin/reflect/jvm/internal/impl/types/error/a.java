package kotlin.reflect.jvm.internal.impl.types.error;

import Y61.k;
import java.util.Arrays;
import java.util.Collections;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42883l;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42866j;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42868l;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;
import kotlin.reflect.jvm.internal.impl.types.A0;
import kotlin.reflect.jvm.internal.impl.types.E0;

/* compiled from: ErrorClassDescriptor.kt */
/* loaded from: classes8.dex */
public final class a extends C42868l {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(@k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        h.f410195a.getClass();
        c cVar = h.f410196b;
        Modality modality = Modality.f407441e;
        ClassKind classKind = ClassKind.f407413b;
        C42784z0 c42784z0 = C42784z0.f406748b;
        b0 b0Var = b0.f407539a;
        super(cVar, fVar, modality, classKind, c42784z0, b0Var, kotlin.reflect.jvm.internal.impl.storage.f.f409976e);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        g.a.C11652a c11652a = g.a.f407524b;
        if (c11652a == null) {
            C42866j.L(5);
            throw null;
        }
        C42866j c42866j = new C42866j(this, null, c11652a, true, CallableMemberDescriptor.Kind.f407408b, b0Var);
        c42866j.Q0(c42784z0, r.f407788d);
        e eVarA = h.a(ErrorScopeKind.f410140g, false, (String[]) Arrays.copyOf(new String[]{c42866j.getName().f409252b, ""}, 2));
        ErrorTypeKind errorTypeKind = ErrorTypeKind.f410171w;
        c42866j.f407709h = new f(h.c(errorTypeKind, new String[0]), eVarA, errorTypeKind, null, false, new String[0], 24, null);
        F0(eVarA, Collections.singleton(c42866j), c42866j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42858b, kotlin.reflect.jvm.internal.impl.descriptors.impl.A
    @k
    public final j L(@k A0 a02, @k kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        ErrorScopeKind errorScopeKind = ErrorScopeKind.f410140g;
        String[] strArr = {getName().f409252b, a02.toString()};
        h hVar = h.f410195a;
        return h.a(errorScopeKind, false, (String[]) Arrays.copyOf(strArr, 2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.C42868l
    @k
    public final String toString() {
        return getName().b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42858b, kotlin.reflect.jvm.internal.impl.descriptors.d0, kotlin.reflect.jvm.internal.impl.descriptors.m0
    public final InterfaceC42883l b(E0 e02) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42858b
    @k
    /* renamed from: n0 */
    public final InterfaceC42851d b(@k E0 e02) {
        return this;
    }
}
