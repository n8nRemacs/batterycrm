package net.bytebuddy.implementation.auxiliary;

import com.yandex.div2.D8;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.c;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.modifier.Visibility;
import net.bytebuddy.description.modifier.a;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.a;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.MethodAccessorFactory;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.matcher.z;
import net.bytebuddy.utility.g;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class MethodCallProxy implements net.bytebuddy.implementation.auxiliary.a {

    /* renamed from: b, reason: collision with root package name */
    public final Implementation.SpecialMethodInvocation f417529b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f417530c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PrecomputedMethodGraph implements MethodGraph.Compiler {

        /* renamed from: c, reason: collision with root package name */
        public static final PrecomputedMethodGraph f417535c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ PrecomputedMethodGraph[] f417536d;

        /* renamed from: b, reason: collision with root package name */
        public final transient MethodGraph.a.C12057a f417537b;

        static {
            PrecomputedMethodGraph precomputedMethodGraph = new PrecomputedMethodGraph();
            f417535c = precomputedMethodGraph;
            f417536d = new PrecomputedMethodGraph[]{precomputedMethodGraph};
        }

        public PrecomputedMethodGraph() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            a.f fVar = new a.f(TypeDescription.d.A0(Callable.class), "call", 1025, Collections.emptyList(), TypeDescription.Generic.f416323x2, Collections.emptyList(), Collections.singletonList(TypeDescription.Generic.d.b.y0(Exception.class)), Collections.emptyList(), null, null);
            linkedHashMap.put(fVar.e(), new MethodGraph.Node.a(fVar));
            a.f fVar2 = new a.f(TypeDescription.d.A0(Runnable.class), "run", 1025, Collections.emptyList(), TypeDescription.Generic.f416325z2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null);
            linkedHashMap.put(fVar2.e(), new MethodGraph.Node.a(fVar2));
            MethodGraph.c cVar = new MethodGraph.c(linkedHashMap);
            this.f417537b = new MethodGraph.a.C12057a(cVar, cVar, Collections.emptyMap());
        }

        public static PrecomputedMethodGraph valueOf(String str) {
            return (PrecomputedMethodGraph) Enum.valueOf(PrecomputedMethodGraph.class, str);
        }

        public static PrecomputedMethodGraph[] values() {
            return (PrecomputedMethodGraph[]) f417536d.clone();
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
        public final MethodGraph.a c(TypeDefinition typeDefinition) {
            return this.f417537b;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class b extends StackManipulation.a {

        /* renamed from: b, reason: collision with root package name */
        public final Implementation.SpecialMethodInvocation f417538b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f417539c;

        public b(Implementation.SpecialMethodInvocation specialMethodInvocation, boolean z12) {
            this.f417538b = specialMethodInvocation;
            this.f417539c = z12;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f417539c == bVar.f417539c && this.f417538b.equals(bVar.f417538b);
        }

        public final int hashCode() {
            return ((this.f417538b.hashCode() + (getClass().hashCode() * 31)) * 31) + (this.f417539c ? 1 : 0);
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            Implementation.SpecialMethodInvocation specialMethodInvocation = this.f417538b;
            TypeDescription typeDescriptionE = context.e(new MethodCallProxy(specialMethodInvocation, this.f417539c));
            return new StackManipulation.b(net.bytebuddy.implementation.bytecode.b.g(typeDescriptionE), Duplication.f417792d, MethodVariableAccess.a(specialMethodInvocation.o()).g(), MethodInvocation.a((a.d) typeDescriptionE.q().P1(MethodSortMatcher.Sort.f418387e.f418392c).M2())).n(sVar, context);
        }
    }

    public MethodCallProxy(Implementation.SpecialMethodInvocation specialMethodInvocation, boolean z12) {
        this.f417529b = specialMethodInvocation;
        this.f417530c = z12;
    }

    @Override // net.bytebuddy.implementation.auxiliary.a
    public final String c() {
        return g.a(this.f417529b.o().hashCode()).concat(this.f417530c ? "S" : "0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.bytebuddy.implementation.auxiliary.a
    public final a.d d(String str, ClassFileVersion classFileVersion, MethodAccessorFactory methodAccessorFactory) {
        int i12;
        a.d dVarC = ((Implementation.Context.Default) methodAccessorFactory).c(this.f417529b, MethodAccessorFactory.AccessType.DEFAULT);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (((c.a) dVarC).x0(8)) {
            i12 = 0;
        } else {
            linkedHashMap.put("argument0", dVarC.n().f5());
            i12 = 1;
        }
        Iterator<?> it = dVarC.getParameters().iterator();
        while (it.hasNext()) {
            linkedHashMap.put(AK.c.g(i12, "argument"), ((net.bytebuddy.description.method.c) it.next()).getType().f5());
            i12++;
        }
        ByteBuddy byteBuddyD = new ByteBuddy(classFileVersion).d();
        a.InterfaceC12009a interfaceC12009aZ = ((a.InterfaceC12009a.AbstractC12010a) new ByteBuddy(byteBuddyD.f415271a, byteBuddyD.f415272b, byteBuddyD.f415273c, byteBuddyD.f415274d, byteBuddyD.f415275e, byteBuddyD.f415276f, PrecomputedMethodGraph.f417535c, byteBuddyD.f415278h, byteBuddyD.f415280j, byteBuddyD.f415281k, byteBuddyD.f415282l, byteBuddyD.f415279i).b(Object.class, ConstructorStrategy.Default.f417163b).L(str)).y(net.bytebuddy.implementation.auxiliary.a.f417587J2).m(Runnable.class, Callable.class).z(new c(dVarC)).m(this.f417530c ? new Class[]{Serializable.class} : new Class[0]).f(new a.b[0]).G(linkedHashMap.values()).z(ConstructorCall.f417531c);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            interfaceC12009aZ = interfaceC12009aZ.d((String) entry.getKey(), (TypeDefinition) entry.getValue(), Visibility.PRIVATE);
        }
        return interfaceC12009aZ.p();
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MethodCallProxy methodCallProxy = (MethodCallProxy) obj;
        if (this.f417530c != methodCallProxy.f417530c || !this.f417529b.equals(methodCallProxy.f417529b)) {
            return false;
        }
        net.bytebuddy.implementation.bytecode.assign.primitive.b bVar = Assigner.f417851M2;
        return bVar.equals(bVar);
    }

    public final int hashCode() {
        return Assigner.f417851M2.hashCode() + ((((this.f417529b.hashCode() + (getClass().hashCode() * 31)) * 31) + (this.f417530c ? 1 : 0)) * 31);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ConstructorCall implements Implementation {

        /* renamed from: c, reason: collision with root package name */
        public static final ConstructorCall f417531c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ConstructorCall[] f417532d;

        /* renamed from: b, reason: collision with root package name */
        public final net.bytebuddy.description.method.a f417533b = (net.bytebuddy.description.method.a) ((net.bytebuddy.description.method.b) ((z.a) TypeDescription.f416317A2.q()).P1(MethodSortMatcher.Sort.f418387e.f418392c)).M2();

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements net.bytebuddy.implementation.bytecode.a {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f417534b;

            public a(TypeDescription typeDescription, a aVar) {
                this.f417534b = typeDescription;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417534b.equals(((a) obj).f417534b);
                }
                return false;
            }

            @Override // net.bytebuddy.implementation.bytecode.a
            public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                net.bytebuddy.description.field.b<a.c> bVarX = this.f417534b.x();
                StackManipulation[] stackManipulationArr = new StackManipulation[bVarX.size()];
                Iterator<a.c> it = bVarX.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    stackManipulationArr[i12] = new StackManipulation.b(MethodVariableAccess.c(), MethodVariableAccess.b((net.bytebuddy.description.method.c) aVar.getParameters().get(i12)), FieldAccess.c(it.next()).a());
                    i12++;
                }
                return new a.c(new StackManipulation.b(MethodVariableAccess.c(), MethodInvocation.b(ConstructorCall.f417531c.f417533b), new StackManipulation.b(stackManipulationArr), MethodReturn.f418075h).n(sVar, context).f417834b, aVar.p());
            }

            public final int hashCode() {
                return this.f417534b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        static {
            ConstructorCall constructorCall = new ConstructorCall();
            f417531c = constructorCall;
            f417532d = new ConstructorCall[]{constructorCall};
        }

        public static ConstructorCall valueOf(String str) {
            return (ConstructorCall) Enum.valueOf(ConstructorCall.class, str);
        }

        public static ConstructorCall[] values() {
            return (ConstructorCall[]) f417532d.clone();
        }

        @Override // net.bytebuddy.implementation.Implementation
        public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
            return new a(target.a(), null);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public final InstrumentedType e(InstrumentedType instrumentedType) {
            return instrumentedType;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class c implements Implementation {

        /* renamed from: b, reason: collision with root package name */
        public final a.d f417540b;

        @HashCodeAndEqualsPlugin.Enhance
        public class a implements net.bytebuddy.implementation.bytecode.a {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f417541b;

            public a(TypeDescription typeDescription, a aVar) {
                this.f417541b = typeDescription;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f417541b.equals(aVar.f417541b) && c.this.equals(c.this);
            }

            @Override // net.bytebuddy.implementation.bytecode.a
            public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                net.bytebuddy.description.field.b<a.c> bVarX = this.f417541b.x();
                ArrayList arrayList = new ArrayList(bVarX.size());
                Iterator<a.c> it = bVarX.iterator();
                while (it.hasNext()) {
                    arrayList.add(new StackManipulation.b(MethodVariableAccess.c(), FieldAccess.c(it.next()).read()));
                }
                StackManipulation.b bVar = new StackManipulation.b(arrayList);
                c cVar = c.this;
                return new a.c(new StackManipulation.b(bVar, MethodInvocation.b(cVar.f417540b), Assigner.f417851M2.a(cVar.f417540b.getReturnType(), aVar.getReturnType(), Assigner.Typing.DYNAMIC), MethodReturn.c(aVar.getReturnType())).n(sVar, context).f417834b, aVar.p());
            }

            public final int hashCode() {
                return c.this.hashCode() + D8.j(this.f417541b, getClass().hashCode() * 31, 31);
            }
        }

        public c(a.d dVar) {
            this.f417540b = dVar;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            if (!this.f417540b.equals(((c) obj).f417540b)) {
                return false;
            }
            net.bytebuddy.implementation.bytecode.assign.primitive.b bVar = Assigner.f417851M2;
            return bVar.equals(bVar);
        }

        public final int hashCode() {
            return Assigner.f417851M2.hashCode() + ((this.f417540b.hashCode() + (getClass().hashCode() * 31)) * 31);
        }

        @Override // net.bytebuddy.implementation.Implementation
        public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
            return new a(target.a(), null);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public final InstrumentedType e(InstrumentedType instrumentedType) {
            return instrumentedType;
        }
    }
}
