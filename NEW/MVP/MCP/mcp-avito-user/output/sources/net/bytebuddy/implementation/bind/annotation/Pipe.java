package net.bytebuddy.implementation.bind.annotation;

import com.yandex.div2.D8;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.a;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.MethodAccessorFactory;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.c;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.b;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.matcher.z;

/* JADX WARN: Method from annotation default annotation not found: serializableProxy */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface Pipe {

    @HashCodeAndEqualsPlugin.Enhance
    public static class Binder implements c.b<Pipe> {

        /* renamed from: b, reason: collision with root package name */
        public static final a.d f417728b = (a.d) TypeDescription.d.A0(Pipe.class).q().P1(C44411u.x("serializableProxy")).M2();

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final MethodDelegationBinder.ParameterBinding a(AnnotationDescription.g gVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.c cVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing) {
            cVar.getType().f5();
            throw null;
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final Class<Pipe> b() {
            return Pipe.class;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            getClass().hashCode();
            throw null;
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class RedirectionProxy extends StackManipulation.a implements net.bytebuddy.implementation.auxiliary.a {
            @Override // net.bytebuddy.implementation.auxiliary.a
            public final String c() {
                throw null;
            }

            @Override // net.bytebuddy.implementation.auxiliary.a
            public final a.d d(String str, ClassFileVersion classFileVersion, MethodAccessorFactory methodAccessorFactory) {
                throw null;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                throw null;
            }

            public final int hashCode() {
                getClass().hashCode();
                throw null;
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Implementation.Context context) {
                TypeDescription typeDescriptionE = context.e(this);
                return new StackManipulation.b(net.bytebuddy.implementation.bytecode.b.g(typeDescriptionE), Duplication.f417792d, MethodVariableAccess.a(null), MethodInvocation.a((a.d) typeDescriptionE.q().P1(MethodSortMatcher.Sort.f418387e.f418392c).M2())).n(sVar, context);
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class ConstructorCall implements Implementation {

                /* renamed from: c, reason: collision with root package name */
                public static final ConstructorCall f417729c;

                /* renamed from: d, reason: collision with root package name */
                public static final /* synthetic */ ConstructorCall[] f417730d;

                /* renamed from: b, reason: collision with root package name */
                public final transient a.d f417731b = (a.d) ((net.bytebuddy.description.method.b) ((z.a) TypeDescription.f416317A2.q()).P1(MethodSortMatcher.Sort.f418387e.f418392c)).M2();

                @HashCodeAndEqualsPlugin.Enhance
                public static class a implements net.bytebuddy.implementation.bytecode.a {

                    /* renamed from: b, reason: collision with root package name */
                    public final TypeDescription f417732b;

                    public a(TypeDescription typeDescription, a aVar) {
                        this.f417732b = typeDescription;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f417732b.equals(((a) obj).f417732b);
                        }
                        return false;
                    }

                    @Override // net.bytebuddy.implementation.bytecode.a
                    public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                        net.bytebuddy.description.field.b<a.c> bVarX = this.f417732b.x();
                        StackManipulation[] stackManipulationArr = new StackManipulation[bVarX.size()];
                        Iterator<a.c> it = bVarX.iterator();
                        int i12 = 0;
                        while (it.hasNext()) {
                            stackManipulationArr[i12] = new StackManipulation.b(MethodVariableAccess.c(), MethodVariableAccess.b((net.bytebuddy.description.method.c) aVar.getParameters().get(i12)), FieldAccess.c(it.next()).a());
                            i12++;
                        }
                        return new a.c(new StackManipulation.b(MethodVariableAccess.c(), MethodInvocation.a(ConstructorCall.f417729c.f417731b), new StackManipulation.b(stackManipulationArr), MethodReturn.f418075h).n(sVar, context).f417834b, aVar.p());
                    }

                    public final int hashCode() {
                        return this.f417732b.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                static {
                    ConstructorCall constructorCall = new ConstructorCall();
                    f417729c = constructorCall;
                    f417730d = new ConstructorCall[]{constructorCall};
                }

                public static ConstructorCall valueOf(String str) {
                    return (ConstructorCall) Enum.valueOf(ConstructorCall.class, str);
                }

                public static ConstructorCall[] values() {
                    return (ConstructorCall[]) f417730d.clone();
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
            public static class a implements Implementation {

                /* renamed from: b, reason: collision with root package name */
                public final net.bytebuddy.description.method.a f417733b;

                /* renamed from: c, reason: collision with root package name */
                public final Assigner f417734c;

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$a$a, reason: collision with other inner class name */
                public class C12095a implements net.bytebuddy.implementation.bytecode.a {

                    /* renamed from: b, reason: collision with root package name */
                    public final TypeDescription f417735b;

                    public C12095a(TypeDescription typeDescription, a aVar) {
                        this.f417735b = typeDescription;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        C12095a c12095a = (C12095a) obj;
                        return this.f417735b.equals(c12095a.f417735b) && a.this.equals(a.this);
                    }

                    @Override // net.bytebuddy.implementation.bytecode.a
                    public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                        net.bytebuddy.description.field.b<a.c> bVarX = this.f417735b.x();
                        StackManipulation[] stackManipulationArr = new StackManipulation[bVarX.size()];
                        Iterator<a.c> it = bVarX.iterator();
                        int i12 = 0;
                        while (it.hasNext()) {
                            stackManipulationArr[i12] = new StackManipulation.b(MethodVariableAccess.c(), FieldAccess.c(it.next()).read());
                            i12++;
                        }
                        MethodVariableAccess.b bVar = MethodVariableAccess.f418084i.new b(1);
                        a aVar2 = a.this;
                        Assigner assigner = aVar2.f417734c;
                        TypeDescription.Generic.d.b bVar2 = TypeDescription.Generic.f416323x2;
                        net.bytebuddy.description.method.a aVar3 = aVar2.f417733b;
                        TypeDescription.Generic genericP0 = aVar3.n().P0();
                        Assigner.Typing typing = Assigner.Typing.DYNAMIC;
                        return new a.c(new StackManipulation.b(bVar, assigner.a(bVar2, genericP0, typing), new StackManipulation.b(stackManipulationArr), MethodInvocation.b(aVar3), aVar2.f417734c.a(aVar3.getReturnType(), aVar.getReturnType(), typing), MethodReturn.f418076i).n(sVar, context).f417834b, aVar.p());
                    }

                    public final int hashCode() {
                        return a.this.hashCode() + D8.j(this.f417735b, getClass().hashCode() * 31, 31);
                    }
                }

                public a(net.bytebuddy.description.method.a aVar, Assigner assigner, a aVar2) {
                    this.f417733b = aVar;
                    this.f417734c = assigner;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.f417733b.equals(aVar.f417733b) && this.f417734c.equals(aVar.f417734c);
                }

                public final int hashCode() {
                    return this.f417734c.hashCode() + D8.h(this.f417733b, getClass().hashCode() * 31, 31);
                }

                @Override // net.bytebuddy.implementation.Implementation
                public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
                    TypeDescription typeDescriptionA = target.a();
                    net.bytebuddy.description.method.a aVar = this.f417733b;
                    if (aVar.P(typeDescriptionA)) {
                        return new C12095a(target.a(), null);
                    }
                    throw new IllegalStateException("Cannot invoke " + aVar + " from outside of class via @Pipe proxy");
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public final InstrumentedType e(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }
        }
    }
}
