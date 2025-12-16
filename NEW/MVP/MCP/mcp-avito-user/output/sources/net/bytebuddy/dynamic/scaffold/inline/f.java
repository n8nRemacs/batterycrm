package net.bytebuddy.dynamic.scaffold.inline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.constant.DefaultValue;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.jar.asm.s;

/* compiled from: RebaseImplementationTarget.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes8.dex */
public class f extends Implementation.Target.AbstractBase {

    /* renamed from: d, reason: collision with root package name */
    public final Map<a.g, MethodRebaseResolver.b> f417157d;

    /* compiled from: RebaseImplementationTarget.java */
    @HashCodeAndEqualsPlugin.Enhance
    public static class a implements Implementation.Target.a {

        /* renamed from: b, reason: collision with root package name */
        public final MethodRebaseResolver.a f417158b;

        public a(MethodRebaseResolver.a aVar) {
            this.f417158b = aVar;
        }

        @Override // net.bytebuddy.implementation.Implementation.Target.a
        public final Implementation.Target a(TypeDescription typeDescription, MethodGraph.a aVar, ClassFileVersion classFileVersion) {
            Implementation.Target.AbstractBase.DefaultMethodInvocation defaultMethodInvocation = Implementation.Target.AbstractBase.DefaultMethodInvocation.f417330b;
            Implementation.Target.AbstractBase.DefaultMethodInvocation defaultMethodInvocation2 = classFileVersion.c(ClassFileVersion.f415298j) ? Implementation.Target.AbstractBase.DefaultMethodInvocation.f417330b : Implementation.Target.AbstractBase.DefaultMethodInvocation.f417331c;
            MethodRebaseResolver.a aVar2 = this.f417158b;
            HashMap map = new HashMap();
            for (Map.Entry entry : aVar2.f417125b.entrySet()) {
                map.put(((a.d) entry.getKey()).e(), entry.getValue());
            }
            return new f(typeDescription, aVar, defaultMethodInvocation2, map);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f417158b.equals(((a) obj).f417158b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f417158b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    /* compiled from: RebaseImplementationTarget.java */
    public static class b extends Implementation.SpecialMethodInvocation.a {

        /* renamed from: c, reason: collision with root package name */
        public final a.d f417159c;

        /* renamed from: d, reason: collision with root package name */
        public final TypeDescription f417160d;

        /* renamed from: e, reason: collision with root package name */
        public final StackManipulation.b f417161e;

        /* renamed from: f, reason: collision with root package name */
        public final net.bytebuddy.description.type.d f417162f;

        public b(a.d dVar, TypeDescription typeDescription, StackManipulation.b bVar, net.bytebuddy.description.type.d dVar2) {
            this.f417159c = dVar;
            this.f417160d = typeDescription;
            this.f417161e = bVar;
            this.f417162f = dVar2;
        }

        @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
        public final Implementation.SpecialMethodInvocation e(a.j jVar) {
            return this.f417159c.f0().equals(new a.j(jVar.f416206a, net.bytebuddy.utility.a.a(jVar.f416207b, this.f417162f))) ? this : Implementation.SpecialMethodInvocation.Illegal.f417321b;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            return this.f417161e.n(sVar, context);
        }

        @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
        public final net.bytebuddy.description.method.a o() {
            return this.f417159c;
        }

        @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
        public final TypeDescription t() {
            return this.f417160d;
        }
    }

    public f(TypeDescription typeDescription, MethodGraph.a aVar, Implementation.Target.AbstractBase.DefaultMethodInvocation defaultMethodInvocation, Map<a.g, MethodRebaseResolver.b> map) {
        super(typeDescription, aVar, defaultMethodInvocation);
        this.f417157d = map;
    }

    @Override // net.bytebuddy.implementation.Implementation.Target
    public final Implementation.SpecialMethodInvocation c(a.g gVar) {
        MethodRebaseResolver.b bVar = this.f417157d.get(gVar);
        Implementation.SpecialMethodInvocation.Illegal illegal = Implementation.SpecialMethodInvocation.Illegal.f417321b;
        TypeDescription typeDescription = this.f417327a;
        if (bVar == null) {
            MethodGraph.Node nodeD = this.f417328b.a().d(gVar);
            TypeDescription.Generic genericC3 = typeDescription.C3();
            return (!nodeD.o().f416907b || genericC3 == null) ? illegal : Implementation.SpecialMethodInvocation.b.g(nodeD.b(), genericC3.f5());
        }
        if (!bVar.c()) {
            return Implementation.SpecialMethodInvocation.b.g(bVar.b(), typeDescription);
        }
        a.d dVarB = bVar.b();
        net.bytebuddy.description.type.d dVarA = bVar.a();
        StackManipulation stackManipulationB = dVarB.b() ? MethodInvocation.b(dVarB) : MethodInvocation.b(dVarB).h(typeDescription);
        if (!stackManipulationB.isValid()) {
            return illegal;
        }
        ArrayList arrayList = new ArrayList(dVarA.size() + 1);
        Iterator<TypeDescription> it = dVarA.iterator();
        while (it.hasNext()) {
            arrayList.add(DefaultValue.c(it.next()));
        }
        arrayList.add(stackManipulationB);
        return new b(dVarB, typeDescription, new StackManipulation.b(arrayList), dVarA);
    }

    @Override // net.bytebuddy.implementation.Implementation.Target.AbstractBase
    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f417157d.equals(((f) obj).f417157d);
        }
        return false;
    }

    @Override // net.bytebuddy.implementation.Implementation.Target
    public final TypeDefinition f() {
        return this.f417327a;
    }

    @Override // net.bytebuddy.implementation.Implementation.Target.AbstractBase
    public final int hashCode() {
        return this.f417157d.hashCode() + (super.hashCode() * 31);
    }
}
