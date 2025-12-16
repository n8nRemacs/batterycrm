package net.bytebuddy.implementation.auxiliary;

import androidx.compose.foundation.H;
import com.yandex.div2.D8;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.modifier.Ownership;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.a;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.MethodAccessorFactory;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.Throw;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.constant.DefaultValue;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.FieldAccess.b.C12105b;
import net.bytebuddy.implementation.bytecode.member.FieldAccess.b.c;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.B;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.matcher.C44396e;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.C44413w;
import net.bytebuddy.matcher.K;
import net.bytebuddy.matcher.LatentMatcher;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.utility.g;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class TypeProxy implements net.bytebuddy.implementation.auxiliary.a {

    /* renamed from: b, reason: collision with root package name */
    public final TypeDescription f417554b;

    /* renamed from: c, reason: collision with root package name */
    public final Implementation.Target f417555c;

    /* renamed from: d, reason: collision with root package name */
    public final InvocationFactory.Default f417556d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f417557e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f417558f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AbstractMethodErrorThrow implements StackManipulation {

        /* renamed from: c, reason: collision with root package name */
        public static final AbstractMethodErrorThrow f417559c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AbstractMethodErrorThrow[] f417560d;

        /* renamed from: b, reason: collision with root package name */
        public final transient StackManipulation.b f417561b;

        static {
            AbstractMethodErrorThrow abstractMethodErrorThrow = new AbstractMethodErrorThrow();
            f417559c = abstractMethodErrorThrow;
            f417560d = new AbstractMethodErrorThrow[]{abstractMethodErrorThrow};
        }

        public AbstractMethodErrorThrow() {
            TypeDescription typeDescriptionA0 = TypeDescription.d.A0(AbstractMethodError.class);
            this.f417561b = new StackManipulation.b(net.bytebuddy.implementation.bytecode.b.g(typeDescriptionA0), Duplication.f417792d, MethodInvocation.b((net.bytebuddy.description.method.a) typeDescriptionA0.q().P1(MethodSortMatcher.Sort.f418387e.f418392c.a(C44411u.z(0))).M2()), Throw.f417844b);
        }

        public static AbstractMethodErrorThrow valueOf(String str) {
            return (AbstractMethodErrorThrow) Enum.valueOf(AbstractMethodErrorThrow.class, str);
        }

        public static AbstractMethodErrorThrow[] values() {
            return (AbstractMethodErrorThrow[]) f417560d.clone();
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final boolean isValid() {
            return this.f417561b.isValid();
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            return this.f417561b.n(sVar, context);
        }
    }

    public interface InvocationFactory {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static abstract class Default implements InvocationFactory {

            /* renamed from: b, reason: collision with root package name */
            public static final Default f417562b;

            /* renamed from: c, reason: collision with root package name */
            public static final Default f417563c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Default[] f417564d;

            public enum a extends Default {
                @Override // net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory
                public final Implementation.SpecialMethodInvocation a(Implementation.Target target, TypeDescription typeDescription, net.bytebuddy.description.method.a aVar) {
                    return target.e(aVar.e());
                }
            }

            public enum b extends Default {
                @Override // net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory
                public final Implementation.SpecialMethodInvocation a(Implementation.Target target, TypeDescription typeDescription, net.bytebuddy.description.method.a aVar) {
                    return target.d(aVar.e(), typeDescription);
                }
            }

            static {
                a aVar = new a("SUPER_METHOD", 0, null);
                f417562b = aVar;
                b bVar = new b("DEFAULT_METHOD", 1, null);
                f417563c = bVar;
                f417564d = new Default[]{aVar, bVar};
            }

            public Default() {
                throw null;
            }

            public Default(String str, int i12, a aVar) {
            }

            public static Default valueOf(String str) {
                return (Default) Enum.valueOf(Default.class, str);
            }

            public static Default[] values() {
                return (Default[]) f417564d.clone();
            }
        }

        Implementation.SpecialMethodInvocation a(Implementation.Target target, TypeDescription typeDescription, net.bytebuddy.description.method.a aVar);
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class b extends StackManipulation.a {

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription f417568b;

        /* renamed from: c, reason: collision with root package name */
        public final Implementation.Target f417569c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f417570d;

        public b(TypeDescription typeDescription, Implementation.Target target, boolean z12) {
            this.f417568b = typeDescription;
            this.f417569c = target;
            this.f417570d = z12;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f417570d == bVar.f417570d && this.f417568b.equals(bVar.f417568b) && this.f417569c.equals(bVar.f417569c);
        }

        public final int hashCode() {
            return ((this.f417569c.hashCode() + D8.j(this.f417568b, getClass().hashCode() * 31, 31)) * 31) + (this.f417570d ? 1 : 0);
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            TypeDescription typeDescriptionE = context.e(new TypeProxy(this.f417568b, this.f417569c, InvocationFactory.Default.f417563c, true, this.f417570d));
            net.bytebuddy.implementation.bytecode.b bVarG = net.bytebuddy.implementation.bytecode.b.g(typeDescriptionE);
            MethodInvocation.e eVarA = MethodInvocation.a((a.d) typeDescriptionE.q().P1(MethodSortMatcher.Sort.f418387e.f418392c).M2());
            StackManipulation stackManipulationC = MethodVariableAccess.c();
            FieldAccess.b.c cVar = FieldAccess.b((a.c) typeDescriptionE.x().P1(C44411u.x("target")).M2()).new c();
            Duplication duplication = Duplication.f417792d;
            return new StackManipulation.b(bVarG, duplication, eVarA, duplication, stackManipulationC, cVar).n(sVar, context);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class c extends StackManipulation.a {

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription f417571b;

        /* renamed from: c, reason: collision with root package name */
        public final Implementation.Target f417572c;

        /* renamed from: d, reason: collision with root package name */
        public final List<TypeDescription> f417573d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f417574e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f417575f;

        public c(TypeDescription typeDescription, Implementation.Target target, List<TypeDescription> list, boolean z12, boolean z13) {
            this.f417571b = typeDescription;
            this.f417572c = target;
            this.f417573d = list;
            this.f417574e = z12;
            this.f417575f = z13;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f417574e == cVar.f417574e && this.f417575f == cVar.f417575f && this.f417571b.equals(cVar.f417571b) && this.f417572c.equals(cVar.f417572c) && this.f417573d.equals(cVar.f417573d);
        }

        public final int hashCode() {
            return ((H.e((this.f417572c.hashCode() + D8.j(this.f417571b, getClass().hashCode() * 31, 31)) * 31, 31, this.f417573d) + (this.f417574e ? 1 : 0)) * 31) + (this.f417575f ? 1 : 0);
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            TypeDescription typeDescriptionE = context.e(new TypeProxy(this.f417571b, this.f417572c, InvocationFactory.Default.f417562b, this.f417574e, this.f417575f));
            List<TypeDescription> list = this.f417573d;
            StackManipulation[] stackManipulationArr = new StackManipulation[list.size()];
            Iterator<TypeDescription> it = list.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                stackManipulationArr[i12] = DefaultValue.c(it.next());
                i12++;
            }
            net.bytebuddy.implementation.bytecode.b bVarG = net.bytebuddy.implementation.bytecode.b.g(typeDescriptionE);
            StackManipulation.b bVar = new StackManipulation.b(stackManipulationArr);
            MethodInvocation.e eVarA = MethodInvocation.a((a.d) typeDescriptionE.q().P1(MethodSortMatcher.Sort.f418387e.f418392c.a(C44411u.A(list))).M2());
            StackManipulation stackManipulationC = MethodVariableAccess.c();
            FieldAccess.b.c cVar = FieldAccess.b((a.c) typeDescriptionE.x().P1(C44411u.x("target")).M2()).new c();
            Duplication duplication = Duplication.f417792d;
            return new StackManipulation.b(bVarG, duplication, bVar, eVarA, duplication, stackManipulationC, cVar).n(sVar, context);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class d extends StackManipulation.a {

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription f417576b;

        /* renamed from: c, reason: collision with root package name */
        public final Implementation.Target f417577c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f417578d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f417579e;

        public d(TypeDescription typeDescription, Implementation.Target target, boolean z12, boolean z13) {
            this.f417576b = typeDescription;
            this.f417577c = target;
            this.f417578d = z12;
            this.f417579e = z13;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f417578d == dVar.f417578d && this.f417579e == dVar.f417579e && this.f417576b.equals(dVar.f417576b) && this.f417577c.equals(dVar.f417577c);
        }

        public final int hashCode() {
            return ((((this.f417577c.hashCode() + D8.j(this.f417576b, getClass().hashCode() * 31, 31)) * 31) + (this.f417578d ? 1 : 0)) * 31) + (this.f417579e ? 1 : 0);
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            TypeDescription typeDescriptionE = context.e(new TypeProxy(this.f417576b, this.f417577c, InvocationFactory.Default.f417562b, this.f417578d, this.f417579e));
            return new StackManipulation.b(MethodInvocation.a((a.d) typeDescriptionE.q().P1(C44411u.x("make").a(C44411u.z(0))).M2()), Duplication.f417792d, MethodVariableAccess.c(), FieldAccess.b((a.c) typeDescriptionE.x().P1(C44411u.x("target")).M2()).new c()).n(sVar, context);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public class e implements Implementation {

        /* renamed from: b, reason: collision with root package name */
        public final Implementation.Context.Default f417580b;

        @HashCodeAndEqualsPlugin.Enhance
        public class a implements net.bytebuddy.implementation.bytecode.a {

            /* renamed from: b, reason: collision with root package name */
            public final FieldAccess.b.C12105b f417582b;

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.implementation.auxiliary.TypeProxy$e$a$a, reason: collision with other inner class name */
            public class C12087a implements StackManipulation {

                /* renamed from: b, reason: collision with root package name */
                public final net.bytebuddy.description.method.a f417584b;

                /* renamed from: c, reason: collision with root package name */
                public final Implementation.SpecialMethodInvocation f417585c;

                public C12087a(net.bytebuddy.description.method.a aVar, Implementation.SpecialMethodInvocation specialMethodInvocation) {
                    this.f417584b = aVar;
                    this.f417585c = specialMethodInvocation;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    C12087a c12087a = (C12087a) obj;
                    return this.f417584b.equals(c12087a.f417584b) && this.f417585c.equals(c12087a.f417585c) && a.this.equals(a.this);
                }

                public final int hashCode() {
                    return a.this.hashCode() + ((this.f417585c.hashCode() + D8.h(this.f417584b, getClass().hashCode() * 31, 31)) * 31);
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public final boolean isValid() {
                    return this.f417585c.isValid();
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public final StackManipulation.d n(s sVar, Implementation.Context context) {
                    a aVar = a.this;
                    a.d dVarC = e.this.f417580b.c(this.f417585c, MethodAccessorFactory.AccessType.DEFAULT);
                    StackManipulation stackManipulationC = MethodVariableAccess.c();
                    FieldAccess.b.C12105b c12105b = aVar.f417582b;
                    net.bytebuddy.description.method.a aVar2 = this.f417584b;
                    return new StackManipulation.b(stackManipulationC, c12105b, new MethodVariableAccess.MethodLoading(MethodVariableAccess.a(aVar2).f418090b, new MethodVariableAccess.MethodLoading.TypeCastingHandler.a(dVarC)), MethodInvocation.a(dVarC), MethodReturn.c(aVar2.getReturnType())).n(sVar, context);
                }
            }

            public a(TypeDescription typeDescription) {
                this.f417582b = FieldAccess.b((a.c) typeDescription.x().P1(C44411u.x("target")).M2()).new C12105b();
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f417582b.equals(aVar.f417582b) && e.this.equals(e.this);
            }

            @Override // net.bytebuddy.implementation.bytecode.a
            public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                TypeProxy typeProxy = TypeProxy.this;
                Implementation.SpecialMethodInvocation specialMethodInvocationA = typeProxy.f417556d.a(typeProxy.f417555c, typeProxy.f417554b, aVar);
                return new a.c((specialMethodInvocationA.isValid() ? new C12087a(aVar, specialMethodInvocationA) : AbstractMethodErrorThrow.f417559c).n(sVar, context).f417834b, aVar.p());
            }

            public final int hashCode() {
                return e.this.hashCode() + ((this.f417582b.hashCode() + (getClass().hashCode() * 31)) * 31);
            }
        }

        public e(Implementation.Context.Default r22) {
            this.f417580b = r22;
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public final InstrumentedType e(InstrumentedType instrumentedType) {
            return instrumentedType.W(new a.g("target", 65, TypeProxy.this.f417555c.a().P0()));
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f417580b.equals(eVar.f417580b) && TypeProxy.this.equals(TypeProxy.this);
        }

        public final int hashCode() {
            return TypeProxy.this.hashCode() + ((this.f417580b.hashCode() + (getClass().hashCode() * 31)) * 31);
        }

        @Override // net.bytebuddy.implementation.Implementation
        public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
            return new a(target.a());
        }
    }

    public TypeProxy(TypeDescription typeDescription, Implementation.Target target, InvocationFactory.Default r32, boolean z12, boolean z13) {
        this.f417554b = typeDescription;
        this.f417555c = target;
        this.f417556d = r32;
        this.f417557e = z12;
        this.f417558f = z13;
    }

    @Override // net.bytebuddy.implementation.auxiliary.a
    public final String c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g.a(this.f417554b.hashCode()));
        sb2.append(this.f417557e ? "I" : "0");
        sb2.append(this.f417558f ? "S" : "0");
        return sb2.toString();
    }

    @Override // net.bytebuddy.implementation.auxiliary.a
    public final a.d d(String str, ClassFileVersion classFileVersion, MethodAccessorFactory methodAccessorFactory) {
        ByteBuddy byteBuddyD = new ByteBuddy(classFileVersion).d();
        return ((a.InterfaceC12009a.AbstractC12010a) new ByteBuddy(byteBuddyD.f415271a, byteBuddyD.f415272b, byteBuddyD.f415273c, byteBuddyD.f415274d, byteBuddyD.f415275e, byteBuddyD.f415276f, byteBuddyD.f415277g, byteBuddyD.f415278h, byteBuddyD.f415280j, byteBuddyD.f415281k, byteBuddyD.f415282l, new LatentMatcher.f(this.f417557e ? C44411u.x("finalize").a(C44411u.z(0)).a(new K(new C44413w(C44411u.f(TypeDescription.f416321E2)))) : C44396e.f418423d)).c(this.f417554b, ConstructorStrategy.Default.f417164c).L(str)).y(net.bytebuddy.implementation.auxiliary.a.f417587J2).m(this.f417558f ? new Class[]{Serializable.class} : new Class[0]).u(C44396e.f418422c).z(new e((Implementation.Context.Default) methodAccessorFactory)).B("make", net.bytebuddy.dynamic.c.class, Ownership.STATIC).z(SilentConstruction.f417565b).p();
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TypeProxy typeProxy = (TypeProxy) obj;
        return this.f417557e == typeProxy.f417557e && this.f417558f == typeProxy.f417558f && this.f417554b.equals(typeProxy.f417554b) && this.f417555c.equals(typeProxy.f417555c) && this.f417556d.equals(typeProxy.f417556d);
    }

    public final int hashCode() {
        return ((((this.f417556d.hashCode() + ((this.f417555c.hashCode() + D8.j(this.f417554b, getClass().hashCode() * 31, 31)) * 31)) * 31) + (this.f417557e ? 1 : 0)) * 31) + (this.f417558f ? 1 : 0);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SilentConstruction implements Implementation {

        /* renamed from: b, reason: collision with root package name */
        public static final SilentConstruction f417565b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ SilentConstruction[] f417566c;

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements net.bytebuddy.implementation.bytecode.a {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f417567b;

            public a(TypeDescription typeDescription, a aVar) {
                this.f417567b = typeDescription;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417567b.equals(((a) obj).f417567b);
                }
                return false;
            }

            @Override // net.bytebuddy.implementation.bytecode.a
            public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                sVar.A("sun/reflect/ReflectionFactory", "getReflectionFactory", "()Lsun/reflect/ReflectionFactory;", 184, false);
                TypeDescription typeDescription = this.f417567b;
                sVar.t(B.v(typeDescription.getDescriptor()));
                sVar.t(B.w(0, 18, "Ljava/lang/Object;"));
                sVar.m(3);
                sVar.I(189, "java/lang/Class");
                sVar.A("java/lang/Class", "getDeclaredConstructor", "([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", 182, false);
                sVar.A("sun/reflect/ReflectionFactory", "newConstructorForSerialization", "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;)Ljava/lang/reflect/Constructor;", 182, false);
                sVar.m(3);
                sVar.I(189, "java/lang/Object");
                sVar.A("java/lang/reflect/Constructor", "newInstance", "([Ljava/lang/Object;)Ljava/lang/Object;", 182, false);
                sVar.I(192, typeDescription.V());
                sVar.m(176);
                return new a.c(4, 0);
            }

            public final int hashCode() {
                return this.f417567b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        static {
            SilentConstruction silentConstruction = new SilentConstruction("INSTANCE", 0);
            f417565b = silentConstruction;
            f417566c = new SilentConstruction[]{silentConstruction};
        }

        public SilentConstruction() {
            throw null;
        }

        public static SilentConstruction valueOf(String str) {
            return (SilentConstruction) Enum.valueOf(SilentConstruction.class, str);
        }

        public static SilentConstruction[] values() {
            return (SilentConstruction[]) f417566c.clone();
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
