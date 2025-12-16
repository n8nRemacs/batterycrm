package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import Y41.l;
import Y61.k;
import java.util.Collections;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.h;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42883l;
import kotlin.reflect.jvm.internal.impl.descriptors.K;
import kotlin.reflect.jvm.internal.impl.descriptors.T;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.j;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: DescriptorUtils.kt */
@s0
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f409615a = 0;

    /* compiled from: DescriptorUtils.kt */
    public /* synthetic */ class a extends G implements l<k0, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f409616b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC42817q, kotlin.reflect.c
        @k
        /* renamed from: getName */
        public final String getF407039i() {
            return "declaresDefaultValue";
        }

        @Override // kotlin.jvm.internal.AbstractC42817q
        @k
        public final h getOwner() {
            return m0.f406844a.b(k0.class);
        }

        @Override // kotlin.jvm.internal.AbstractC42817q
        @k
        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }

        @Override // Y41.l
        public final Boolean invoke(k0 k0Var) {
            return Boolean.valueOf(k0Var.k0());
        }
    }

    static {
        f.e("value");
    }

    public static final boolean a(@k k0 k0Var) {
        return kotlin.reflect.jvm.internal.impl.utils.b.d(Collections.singletonList(k0Var), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.f409614a, a.f409616b).booleanValue();
    }

    public static CallableMemberDescriptor b(CallableMemberDescriptor callableMemberDescriptor, l lVar) {
        return (CallableMemberDescriptor) kotlin.reflect.jvm.internal.impl.utils.b.b(Collections.singletonList(callableMemberDescriptor), new b(), new d(lVar, new l0.h()));
    }

    @Y61.l
    public static final kotlin.reflect.jvm.internal.impl.name.c c(@k InterfaceC42883l interfaceC42883l) {
        kotlin.reflect.jvm.internal.impl.name.d dVarG = j.g(interfaceC42883l);
        if (!dVarG.d()) {
            dVarG = null;
        }
        if (dVarG != null) {
            return dVarG.g();
        }
        return null;
    }

    @Y61.l
    public static final InterfaceC42851d d(@k kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        InterfaceC42853f interfaceC42853fB = cVar.getType().H0().b();
        if (interfaceC42853fB instanceof InterfaceC42851d) {
            return (InterfaceC42851d) interfaceC42853fB;
        }
        return null;
    }

    @k
    public static final kotlin.reflect.jvm.internal.impl.builtins.k e(@k InterfaceC42882k interfaceC42882k) {
        return j.d(interfaceC42882k).m();
    }

    @Y61.l
    public static final kotlin.reflect.jvm.internal.impl.name.b f(@Y61.l InterfaceC42853f interfaceC42853f) {
        InterfaceC42882k interfaceC42882kF;
        kotlin.reflect.jvm.internal.impl.name.b bVarF;
        if (interfaceC42853f == null || (interfaceC42882kF = interfaceC42853f.f()) == null) {
            return null;
        }
        if (interfaceC42882kF instanceof K) {
            return new kotlin.reflect.jvm.internal.impl.name.b(((K) interfaceC42882kF).d(), interfaceC42853f.getName());
        }
        if (!(interfaceC42882kF instanceof InterfaceC42854g) || (bVarF = f((InterfaceC42853f) interfaceC42882kF)) == null) {
            return null;
        }
        return bVarF.d(interfaceC42853f.getName());
    }

    @k
    public static final kotlin.reflect.jvm.internal.impl.name.c g(@k InterfaceC42882k interfaceC42882k) {
        kotlin.reflect.jvm.internal.impl.name.c cVarH = j.h(interfaceC42882k);
        if (cVarH == null) {
            cVarH = j.g(interfaceC42882k.f()).b(interfaceC42882k.getName()).g();
        }
        if (cVarH != null) {
            return cVarH;
        }
        j.a(4);
        throw null;
    }

    @k
    public static final InterfaceC43030m h(@k InterfaceC42854g interfaceC42854g) {
        return C43033p.f(C43033p.u(e.f409619l, interfaceC42854g), 1);
    }

    @k
    public static final CallableMemberDescriptor i(@k CallableMemberDescriptor callableMemberDescriptor) {
        return callableMemberDescriptor instanceof T ? ((T) callableMemberDescriptor).s0() : callableMemberDescriptor;
    }
}
