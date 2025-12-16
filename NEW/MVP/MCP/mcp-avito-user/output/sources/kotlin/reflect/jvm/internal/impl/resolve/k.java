package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C42906y;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.F;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.descriptors.V;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42966b;

/* compiled from: inlineClassesUtils.kt */
@s0
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f409643a = 0;

    static {
        kotlin.reflect.jvm.internal.impl.name.b.j(new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.JvmInline"));
    }

    public static final boolean a(@Y61.k CallableMemberDescriptor callableMemberDescriptor) {
        i0<Y> i0VarI;
        if (callableMemberDescriptor instanceof V) {
            U uS02 = ((V) callableMemberDescriptor).s0();
            if (uS02.H() == null) {
                InterfaceC42882k interfaceC42882kF = uS02.f();
                InterfaceC42851d interfaceC42851d = interfaceC42882kF instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42882kF : null;
                if (interfaceC42851d != null && (i0VarI = interfaceC42851d.I()) != null && i0VarI.a(uS02.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean b(@Y61.k InterfaceC42882k interfaceC42882k) {
        return (interfaceC42882k instanceof InterfaceC42851d) && (((InterfaceC42851d) interfaceC42882k).I() instanceof C42906y);
    }

    public static final boolean c(@Y61.k InterfaceC42882k interfaceC42882k) {
        return (interfaceC42882k instanceof InterfaceC42851d) && (((InterfaceC42851d) interfaceC42882k).I() instanceof F);
    }

    public static final boolean d(@Y61.k m0 m0Var) {
        if (m0Var.H() == null) {
            InterfaceC42882k interfaceC42882kF = m0Var.f();
            kotlin.reflect.jvm.internal.impl.name.f fVar = null;
            InterfaceC42851d interfaceC42851d = interfaceC42882kF instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42882kF : null;
            if (interfaceC42851d != null) {
                int i12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
                i0<Y> i0VarI = interfaceC42851d.I();
                C42906y c42906y = i0VarI instanceof C42906y ? (C42906y) i0VarI : null;
                if (c42906y != null) {
                    fVar = c42906y.f407881a;
                }
            }
            if (L.f(fVar, m0Var.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean e(@Y61.k InterfaceC42882k interfaceC42882k) {
        return b(interfaceC42882k) || c(interfaceC42882k);
    }

    public static final boolean f(@Y61.k O o12) {
        InterfaceC42853f interfaceC42853fB = o12.H0().b();
        if (interfaceC42853fB == null || !c(interfaceC42853fB)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.checker.u.f410124a.getClass();
        return !InterfaceC42966b.a.H(o12);
    }

    @Y61.l
    public static final Y g(@Y61.k O o12) {
        InterfaceC42853f interfaceC42853fB = o12.H0().b();
        InterfaceC42851d interfaceC42851d = interfaceC42853fB instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42853fB : null;
        if (interfaceC42851d == null) {
            return null;
        }
        int i12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
        i0<Y> i0VarI = interfaceC42851d.I();
        C42906y c42906y = i0VarI instanceof C42906y ? (C42906y) i0VarI : null;
        if (c42906y != null) {
            return (Y) c42906y.f407882b;
        }
        return null;
    }
}
