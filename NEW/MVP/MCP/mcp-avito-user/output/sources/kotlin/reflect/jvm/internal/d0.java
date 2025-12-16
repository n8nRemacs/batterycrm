package kotlin.reflect.jvm.internal;

import j51.InterfaceC42201a;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.AbstractC43001j;
import kotlin.reflect.jvm.internal.AbstractC43002k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42881j;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.text.C43066x;
import m51.C43888b;
import m51.d;
import v51.C49167a;

/* compiled from: RuntimeTypeMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/d0;", "", "<init>", "()V", "Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final d0 f407150a = new d0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.b f407151b = kotlin.reflect.jvm.internal.impl.name.b.j(new kotlin.reflect.jvm.internal.impl.name.c("java.lang.Void"));

    public static AbstractC43001j.e a(InterfaceC42905x interfaceC42905x) {
        String strA = kotlin.reflect.jvm.internal.impl.load.java.J.a(interfaceC42905x);
        if (strA == null) {
            if (interfaceC42905x instanceof kotlin.reflect.jvm.internal.impl.descriptors.V) {
                strA = kotlin.reflect.jvm.internal.impl.load.java.D.a(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.i(interfaceC42905x).getName().b());
            } else if (interfaceC42905x instanceof kotlin.reflect.jvm.internal.impl.descriptors.W) {
                String strB = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.i(interfaceC42905x).getName().b();
                kotlin.reflect.jvm.internal.impl.load.java.D d12 = kotlin.reflect.jvm.internal.impl.load.java.D.f407911a;
                StringBuilder sb2 = new StringBuilder("set");
                sb2.append(kotlin.reflect.jvm.internal.impl.load.java.D.b(strB) ? strB.substring(2) : C49167a.a(strB));
                strA = sb2.toString();
            } else {
                strA = interfaceC42905x.getName().b();
            }
        }
        return new AbstractC43001j.e(new d.b(strA, kotlin.reflect.jvm.internal.impl.load.kotlin.E.a(interfaceC42905x, 1)));
    }

    @Y61.k
    public static AbstractC43002k b(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.U u12) {
        kotlin.reflect.jvm.internal.impl.descriptors.U uN02 = ((kotlin.reflect.jvm.internal.impl.descriptors.U) kotlin.reflect.jvm.internal.impl.resolve.j.t(u12)).n0();
        if (uN02 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.x) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.x xVar = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.x) uN02;
            h.g<ProtoBuf.h, JvmProtoBuf.d> gVar = JvmProtoBuf.f409148d;
            ProtoBuf.h hVar = xVar.f409878B;
            JvmProtoBuf.d dVar = (JvmProtoBuf.d) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(hVar, gVar);
            if (dVar != null) {
                return new AbstractC43002k.c(uN02, hVar, dVar, xVar.f409879C, xVar.f409880D);
            }
        } else if (uN02 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.f) {
            kotlin.reflect.jvm.internal.impl.descriptors.b0 b0VarE = ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.f) uN02).e();
            InterfaceC42201a interfaceC42201a = b0VarE instanceof InterfaceC42201a ? (InterfaceC42201a) b0VarE : null;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x xVarB = interfaceC42201a != null ? interfaceC42201a.b() : null;
            if (xVarB instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z) {
                return new AbstractC43002k.a(((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z) xVarB).f407877a);
            }
            if (!(xVarB instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C)) {
                throw new X("Incorrect resolution sequence for Java field " + uN02 + " (source = " + xVarB + ')');
            }
            Method method = ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C) xVarB).f407822a;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.N n12 = ((kotlin.reflect.jvm.internal.impl.descriptors.impl.L) uN02).f407598y;
            kotlin.reflect.jvm.internal.impl.descriptors.b0 b0VarE2 = n12 != null ? n12.e() : null;
            InterfaceC42201a interfaceC42201a2 = b0VarE2 instanceof InterfaceC42201a ? (InterfaceC42201a) b0VarE2 : null;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x xVarB2 = interfaceC42201a2 != null ? interfaceC42201a2.b() : null;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C c12 = xVarB2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C ? (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C) xVarB2 : null;
            return new AbstractC43002k.b(method, c12 != null ? c12.f407822a : null);
        }
        AbstractC43001j.e eVarA = a(uN02.getGetter());
        kotlin.reflect.jvm.internal.impl.descriptors.W wC2 = uN02.c();
        return new AbstractC43002k.d(eVarA, wC2 != null ? a(wC2) : null);
    }

    @Y61.k
    public static AbstractC43001j c(@Y61.k InterfaceC42905x interfaceC42905x) {
        Method method;
        InterfaceC42905x interfaceC42905xN0 = ((InterfaceC42905x) kotlin.reflect.jvm.internal.impl.resolve.j.t(interfaceC42905x)).n0();
        if (!(interfaceC42905xN0 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c)) {
            if (interfaceC42905xN0 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) {
                kotlin.reflect.jvm.internal.impl.descriptors.b0 b0VarE = ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) interfaceC42905xN0).e();
                InterfaceC42201a interfaceC42201a = b0VarE instanceof InterfaceC42201a ? (InterfaceC42201a) b0VarE : null;
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x xVarB = interfaceC42201a != null ? interfaceC42201a.b() : null;
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C c12 = xVarB instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C ? (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C) xVarB : null;
                if (c12 != null && (method = c12.f407822a) != null) {
                    return new AbstractC43001j.c(method);
                }
                throw new X("Incorrect resolution sequence for Java method " + interfaceC42905xN0);
            }
            if (interfaceC42905xN0 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.b) {
                kotlin.reflect.jvm.internal.impl.descriptors.b0 b0VarE2 = ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.b) interfaceC42905xN0).e();
                InterfaceC42201a interfaceC42201a2 = b0VarE2 instanceof InterfaceC42201a ? (InterfaceC42201a) b0VarE2 : null;
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x xVarB2 = interfaceC42201a2 != null ? interfaceC42201a2.b() : null;
                if (xVarB2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.w) {
                    return new AbstractC43001j.b(((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.w) xVarB2).f407875a);
                }
                if (xVarB2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t) {
                    kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t tVar = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t) xVarB2;
                    if (tVar.f407871a.isAnnotation()) {
                        return new AbstractC43001j.a(tVar.f407871a);
                    }
                }
                throw new X("Incorrect resolution sequence for Java constructor " + interfaceC42905xN0 + " (" + xVarB2 + ')');
            }
            if ((!interfaceC42905xN0.getName().equals(kotlin.reflect.jvm.internal.impl.builtins.n.f407330c) || !kotlin.reflect.jvm.internal.impl.resolve.i.l(interfaceC42905xN0)) && (!interfaceC42905xN0.getName().equals(kotlin.reflect.jvm.internal.impl.builtins.n.f407328a) || !kotlin.reflect.jvm.internal.impl.resolve.i.l(interfaceC42905xN0))) {
                kotlin.reflect.jvm.internal.impl.name.f name = interfaceC42905xN0.getName();
                kotlin.reflect.jvm.internal.impl.builtins.jvm.a.f407234e.getClass();
                if (!kotlin.jvm.internal.L.f(name, kotlin.reflect.jvm.internal.impl.builtins.jvm.a.f407235f) || !interfaceC42905xN0.g().isEmpty()) {
                    throw new X("Unknown origin of " + interfaceC42905xN0 + " (" + interfaceC42905xN0.getClass() + ')');
                }
            }
            return a(interfaceC42905xN0);
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c cVar = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c) interfaceC42905xN0;
        kotlin.reflect.jvm.internal.impl.protobuf.o oVarV = cVar.v();
        if (oVarV instanceof ProtoBuf.e) {
            m51.i iVar = m51.i.f414326a;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVarD = cVar.D();
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVarA0 = cVar.a0();
            iVar.getClass();
            d.b bVarC = m51.i.c((ProtoBuf.e) oVarV, cVarD, gVarA0);
            if (bVarC != null) {
                return new AbstractC43001j.e(bVarC);
            }
        }
        if (oVarV instanceof ProtoBuf.b) {
            m51.i iVar2 = m51.i.f414326a;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVarD2 = cVar.D();
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVarA02 = cVar.a0();
            iVar2.getClass();
            d.b bVarA = m51.i.a((ProtoBuf.b) oVarV, cVarD2, gVarA02);
            if (bVarA != null) {
                if (kotlin.reflect.jvm.internal.impl.resolve.k.b(interfaceC42905x.f())) {
                    return new AbstractC43001j.e(bVarA);
                }
                if (!kotlin.reflect.jvm.internal.impl.resolve.k.c(interfaceC42905x.f())) {
                    return new AbstractC43001j.d(bVarA);
                }
                InterfaceC42881j interfaceC42881j = (InterfaceC42881j) interfaceC42905x;
                boolean zJ2 = interfaceC42881j.J();
                String str = bVarA.f414317a;
                String str2 = bVarA.f414318b;
                if (zJ2) {
                    if (!kotlin.jvm.internal.L.f(str, "constructor-impl") || !C43066x.z(str2, ")V", false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + bVarA).toString());
                    }
                } else {
                    if (!kotlin.jvm.internal.L.f(str, "constructor-impl")) {
                        throw new IllegalArgumentException(("Invalid signature: " + bVarA).toString());
                    }
                    String strB = C43888b.b(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(interfaceC42881j.h0()).c());
                    if (C43066x.z(str2, ")V", false)) {
                        bVarA = new d.b(str, C43066x.X("V", str2) + strB);
                    } else if (!C43066x.z(str2, strB, false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + bVarA).toString());
                    }
                }
                return new AbstractC43001j.e(bVarA);
            }
        }
        return a(interfaceC42905xN0);
    }
}
