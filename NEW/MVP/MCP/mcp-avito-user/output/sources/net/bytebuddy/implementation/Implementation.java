package net.bytebuddy.implementation;

import androidx.appcompat.app.r;
import com.yandex.div2.D8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.build.k;
import net.bytebuddy.description.annotation.AnnotationValue;
import net.bytebuddy.description.annotation.a;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.method.c;
import net.bytebuddy.description.method.d;
import net.bytebuddy.description.modifier.Visibility;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.d;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import net.bytebuddy.dynamic.scaffold.TypeInitializer;
import net.bytebuddy.dynamic.scaffold.TypeWriter;
import net.bytebuddy.implementation.MethodAccessorFactory;
import net.bytebuddy.implementation.attribute.AnnotationValueFilter;
import net.bytebuddy.implementation.auxiliary.a;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.constant.MethodConstant;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.f;
import net.bytebuddy.jar.asm.m;
import net.bytebuddy.jar.asm.s;

/* loaded from: classes7.dex */
public interface Implementation extends InstrumentedType.Prepareable {

    public interface Target {

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class AbstractBase implements Target {

            /* renamed from: a, reason: collision with root package name */
            public final TypeDescription f417327a;

            /* renamed from: b, reason: collision with root package name */
            public final MethodGraph.a f417328b;

            /* renamed from: c, reason: collision with root package name */
            public final DefaultMethodInvocation f417329c;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static abstract class DefaultMethodInvocation {

                /* renamed from: b, reason: collision with root package name */
                public static final DefaultMethodInvocation f417330b;

                /* renamed from: c, reason: collision with root package name */
                public static final DefaultMethodInvocation f417331c;

                /* renamed from: d, reason: collision with root package name */
                public static final /* synthetic */ DefaultMethodInvocation[] f417332d;

                public enum a extends DefaultMethodInvocation {
                    @Override // net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation
                    public final SpecialMethodInvocation a(MethodGraph.Node node, TypeDescription typeDescription) {
                        return node.o().f416908c ? SpecialMethodInvocation.b.g(node.b(), typeDescription) : SpecialMethodInvocation.Illegal.f417321b;
                    }
                }

                public enum b extends DefaultMethodInvocation {
                    @Override // net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation
                    public final SpecialMethodInvocation a(MethodGraph.Node node, TypeDescription typeDescription) {
                        return SpecialMethodInvocation.Illegal.f417321b;
                    }
                }

                static {
                    a aVar = new a("ENABLED", 0, null);
                    f417330b = aVar;
                    b bVar = new b("DISABLED", 1, null);
                    f417331c = bVar;
                    f417332d = new DefaultMethodInvocation[]{aVar, bVar};
                }

                public DefaultMethodInvocation() {
                    throw null;
                }

                public DefaultMethodInvocation(String str, int i12, a aVar) {
                }

                public static DefaultMethodInvocation valueOf(String str) {
                    return (DefaultMethodInvocation) Enum.valueOf(DefaultMethodInvocation.class, str);
                }

                public static DefaultMethodInvocation[] values() {
                    return (DefaultMethodInvocation[]) f417332d.clone();
                }

                public abstract SpecialMethodInvocation a(MethodGraph.Node node, TypeDescription typeDescription);
            }

            public AbstractBase(TypeDescription typeDescription, MethodGraph.a aVar, DefaultMethodInvocation defaultMethodInvocation) {
                this.f417327a = typeDescription;
                this.f417328b = aVar;
                this.f417329c = defaultMethodInvocation;
            }

            @Override // net.bytebuddy.implementation.Implementation.Target
            public final TypeDescription a() {
                return this.f417327a;
            }

            @Override // net.bytebuddy.implementation.Implementation.Target
            public final SpecialMethodInvocation b(a.g gVar) {
                SpecialMethodInvocation.Illegal illegal = SpecialMethodInvocation.Illegal.f417321b;
                Iterator<TypeDescription> it = this.f417327a.J0().f1().iterator();
                SpecialMethodInvocation specialMethodInvocation = illegal;
                while (it.hasNext()) {
                    SpecialMethodInvocation specialMethodInvocationE = d(gVar, it.next()).e(new a.j(gVar.f416190b, gVar.f416191c));
                    if (specialMethodInvocationE.isValid()) {
                        if (specialMethodInvocation.isValid()) {
                            return illegal;
                        }
                        specialMethodInvocation = specialMethodInvocationE;
                    }
                }
                return specialMethodInvocation;
            }

            @Override // net.bytebuddy.implementation.Implementation.Target
            public final SpecialMethodInvocation d(a.g gVar, TypeDescription typeDescription) {
                return this.f417329c.a(this.f417328b.b(typeDescription).d(gVar), typeDescription);
            }

            @Override // net.bytebuddy.implementation.Implementation.Target
            public final SpecialMethodInvocation e(a.g gVar) {
                SpecialMethodInvocation specialMethodInvocationC = c(gVar);
                return specialMethodInvocationC.isValid() ? specialMethodInvocationC : b(gVar);
            }

            public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                AbstractBase abstractBase = (AbstractBase) obj;
                return this.f417329c.equals(abstractBase.f417329c) && this.f417327a.equals(abstractBase.f417327a) && this.f417328b.equals(abstractBase.f417328b);
            }

            public int hashCode() {
                return this.f417329c.hashCode() + ((this.f417328b.hashCode() + D8.j(this.f417327a, getClass().hashCode() * 31, 31)) * 31);
            }
        }

        public interface a {
            Target a(TypeDescription typeDescription, MethodGraph.a aVar, ClassFileVersion classFileVersion);
        }

        TypeDescription a();

        SpecialMethodInvocation b(a.g gVar);

        SpecialMethodInvocation c(a.g gVar);

        SpecialMethodInvocation d(a.g gVar, TypeDescription typeDescription);

        SpecialMethodInvocation e(a.g gVar);

        TypeDefinition f();
    }

    public interface b extends Implementation {
        b c(b bVar);
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class c implements Implementation {

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements b {

            /* renamed from: b, reason: collision with root package name */
            public final b f417333b;

            /* renamed from: c, reason: collision with root package name */
            public final ArrayList f417334c;

            public a(Implementation implementation, b bVar) {
                this((List<? extends Implementation>) Collections.singletonList(implementation), bVar);
            }

            @Override // net.bytebuddy.implementation.Implementation.b
            public final b c(b bVar) {
                return new a(this.f417334c, this.f417333b.c(bVar));
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                Iterator it = this.f417334c.iterator();
                while (it.hasNext()) {
                    instrumentedType = ((Implementation) it.next()).e(instrumentedType);
                }
                return this.f417333b.e(instrumentedType);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f417333b.equals(aVar.f417333b) && this.f417334c.equals(aVar.f417334c);
            }

            public final int hashCode() {
                return this.f417334c.hashCode() + ((this.f417333b.hashCode() + (getClass().hashCode() * 31)) * 31);
            }

            @Override // net.bytebuddy.implementation.Implementation
            public final net.bytebuddy.implementation.bytecode.a i(Target target) {
                ArrayList arrayList = this.f417334c;
                net.bytebuddy.implementation.bytecode.a[] aVarArr = new net.bytebuddy.implementation.bytecode.a[arrayList.size() + 1];
                Iterator it = arrayList.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    aVarArr[i12] = ((Implementation) it.next()).i(target);
                    i12++;
                }
                aVarArr[i12] = this.f417333b.i(target);
                return new a.C12102a(aVarArr);
            }

            public a(List<? extends Implementation> list, b bVar) {
                this.f417334c = new ArrayList();
                for (Implementation implementation : list) {
                    if (implementation instanceof a) {
                        a aVar = (a) implementation;
                        this.f417334c.addAll(aVar.f417334c);
                        this.f417334c.add(aVar.f417333b);
                    } else if (implementation instanceof c) {
                        ArrayList arrayList = this.f417334c;
                        ((c) implementation).getClass();
                        arrayList.addAll(null);
                    } else {
                        this.f417334c.add(implementation);
                    }
                }
                if (!(bVar instanceof a)) {
                    this.f417333b = bVar;
                    return;
                }
                a aVar2 = (a) bVar;
                this.f417334c.addAll(aVar2.f417334c);
                this.f417333b = aVar2.f417333b;
            }
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public final InstrumentedType e(InstrumentedType instrumentedType) {
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

        @Override // net.bytebuddy.implementation.Implementation
        public final net.bytebuddy.implementation.bytecode.a i(Target target) {
            throw null;
        }
    }

    net.bytebuddy.implementation.bytecode.a i(Target target);

    public interface Context extends MethodAccessorFactory {

        public static class Disabled extends a.AbstractC12078a {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Factory implements b {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ Factory[] f417318b = {new Factory("INSTANCE", 0)};

                /* JADX INFO: Fake field, exist only in values array */
                Factory EF5;

                public Factory() {
                    throw null;
                }

                public static Factory valueOf(String str) {
                    return (Factory) Enum.valueOf(Factory.class, str);
                }

                public static Factory[] values() {
                    return (Factory[]) f417318b.clone();
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.b
                public final a a(TypeDescription typeDescription, a.InterfaceC12088a interfaceC12088a, TypeInitializer typeInitializer, ClassFileVersion classFileVersion, ClassFileVersion classFileVersion2) {
                    if (!typeInitializer.a()) {
                        return new Disabled(typeDescription, classFileVersion);
                    }
                    throw new IllegalStateException("Cannot define type initializer which was explicitly disabled: " + typeInitializer);
                }
            }

            @Override // net.bytebuddy.implementation.MethodAccessorFactory
            public final a.d c(SpecialMethodInvocation specialMethodInvocation, MethodAccessorFactory.AccessType accessType) {
                throw new IllegalStateException("Registration of method accessors was disabled: " + specialMethodInvocation.o());
            }

            @Override // net.bytebuddy.implementation.Implementation.Context.a
            public final void d(TypeInitializer.a aVar, f fVar, AnnotationValueFilter.b bVar) {
                aVar.b(fVar, TypeInitializer.None.f416957b, this);
            }

            @Override // net.bytebuddy.implementation.Implementation.Context
            public final TypeDescription e(net.bytebuddy.implementation.auxiliary.a aVar) {
                throw new IllegalStateException("Registration of auxiliary types was disabled: " + aVar);
            }

            @Override // net.bytebuddy.implementation.Implementation.Context.a
            public final List<net.bytebuddy.dynamic.a> f() {
                return Collections.emptyList();
            }

            @Override // net.bytebuddy.implementation.Implementation.Context
            public final a.c h(MethodConstant.c cVar, TypeDescription typeDescription) {
                throw new IllegalStateException(D8.o("Field values caching was disabled: ", typeDescription));
            }

            @Override // net.bytebuddy.implementation.Implementation.Context.a
            public final boolean isEnabled() {
                return false;
            }
        }

        public interface a extends Context {

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.implementation.Implementation$Context$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC12078a implements a {

                /* renamed from: b, reason: collision with root package name */
                public final TypeDescription f417319b;

                /* renamed from: c, reason: collision with root package name */
                public final ClassFileVersion f417320c;

                public AbstractC12078a(TypeDescription typeDescription, ClassFileVersion classFileVersion) {
                    this.f417319b = typeDescription;
                    this.f417320c = classFileVersion;
                }

                @Override // net.bytebuddy.implementation.Implementation.Context
                public final TypeDescription a() {
                    return this.f417319b;
                }

                @Override // net.bytebuddy.implementation.Implementation.Context
                public final ClassFileVersion b() {
                    return this.f417320c;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    AbstractC12078a abstractC12078a = (AbstractC12078a) obj;
                    return this.f417319b.equals(abstractC12078a.f417319b) && this.f417320c.equals(abstractC12078a.f417320c);
                }

                public final int hashCode() {
                    return this.f417320c.hashCode() + D8.j(this.f417319b, getClass().hashCode() * 31, 31);
                }
            }

            void d(TypeInitializer.a aVar, f fVar, AnnotationValueFilter.b bVar);

            List<net.bytebuddy.dynamic.a> f();

            boolean isEnabled();
        }

        public interface b {
            a a(TypeDescription typeDescription, a.InterfaceC12088a interfaceC12088a, TypeInitializer typeInitializer, ClassFileVersion classFileVersion, ClassFileVersion classFileVersion2);
        }

        TypeDescription a();

        ClassFileVersion b();

        TypeDescription e(net.bytebuddy.implementation.auxiliary.a aVar);

        a.c h(MethodConstant.c cVar, TypeDescription typeDescription);

        public static class Default extends a.AbstractC12078a {

            /* renamed from: d, reason: collision with root package name */
            public final a.InterfaceC12088a f417292d;

            /* renamed from: e, reason: collision with root package name */
            public final TypeInitializer f417293e;

            /* renamed from: f, reason: collision with root package name */
            public final ClassFileVersion f417294f;

            /* renamed from: g, reason: collision with root package name */
            public final HashMap f417295g;

            /* renamed from: h, reason: collision with root package name */
            public final HashMap f417296h;

            /* renamed from: i, reason: collision with root package name */
            public final HashMap f417297i;

            /* renamed from: j, reason: collision with root package name */
            public final HashMap f417298j;

            /* renamed from: k, reason: collision with root package name */
            public final HashMap f417299k;

            /* renamed from: l, reason: collision with root package name */
            public final HashSet f417300l;

            /* renamed from: m, reason: collision with root package name */
            public final String f417301m;

            /* renamed from: n, reason: collision with root package name */
            public boolean f417302n;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Factory implements b {

                /* renamed from: b, reason: collision with root package name */
                public static final Factory f417303b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ Factory[] f417304c;

                @HashCodeAndEqualsPlugin.Enhance
                public static class a implements b {
                    @Override // net.bytebuddy.implementation.Implementation.Context.b
                    public final a a(TypeDescription typeDescription, a.InterfaceC12088a interfaceC12088a, TypeInitializer typeInitializer, ClassFileVersion classFileVersion, ClassFileVersion classFileVersion2) {
                        return new Default(typeDescription, classFileVersion, interfaceC12088a, typeInitializer, classFileVersion2, "synthetic");
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        return true;
                    }

                    public final int hashCode() {
                        return (getClass().hashCode() * 31) + 989128517;
                    }
                }

                static {
                    Factory factory = new Factory("INSTANCE", 0);
                    f417303b = factory;
                    f417304c = new Factory[]{factory};
                }

                public Factory() {
                    throw null;
                }

                public static Factory valueOf(String str) {
                    return (Factory) Enum.valueOf(Factory.class, str);
                }

                public static Factory[] values() {
                    return (Factory[]) f417304c.clone();
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.b
                public final a a(TypeDescription typeDescription, a.InterfaceC12088a interfaceC12088a, TypeInitializer typeInitializer, ClassFileVersion classFileVersion, ClassFileVersion classFileVersion2) {
                    return new Default(typeDescription, classFileVersion, interfaceC12088a, typeInitializer, classFileVersion2, net.bytebuddy.utility.g.b());
                }
            }

            public static abstract class a extends a.d.AbstractC11975a {
                @Override // net.bytebuddy.description.c
                public final int getModifiers() {
                    return y0() | 4096 | (n().E() ? 1 : 16);
                }

                public abstract int y0();
            }

            public static class b extends a {

                /* renamed from: c, reason: collision with root package name */
                public final TypeDescription f417305c;

                /* renamed from: d, reason: collision with root package name */
                public final net.bytebuddy.description.method.a f417306d;

                /* renamed from: e, reason: collision with root package name */
                public final String f417307e;

                public b(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, TypeDescription typeDescription2, String str) {
                    this.f417305c = typeDescription;
                    this.f417306d = aVar;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(aVar.V());
                    sb2.append("$accessor$");
                    sb2.append(str);
                    sb2.append(typeDescription2.E() ? "$".concat(net.bytebuddy.utility.g.a(typeDescription2.hashCode())) : "");
                    this.f417307e = sb2.toString();
                }

                @Override // net.bytebuddy.description.method.a
                public final d.f N() {
                    return this.f417306d.N().N1();
                }

                @Override // net.bytebuddy.description.d.InterfaceC11969d
                public final String V() {
                    return this.f417307e;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return new a.b();
                }

                @Override // net.bytebuddy.description.method.a
                @net.bytebuddy.utility.nullability.b
                public final AnnotationValue<?, ?> getDefaultValue() {
                    return null;
                }

                @Override // net.bytebuddy.description.method.a
                public final net.bytebuddy.description.method.d<c.InterfaceC11982c> getParameters() {
                    return new d.c.a(this, this.f417306d.getParameters().p2().N1());
                }

                @Override // net.bytebuddy.description.method.a
                public final TypeDescription.Generic getReturnType() {
                    return this.f417306d.getReturnType().i5();
                }

                @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                @I41.g
                public final TypeDefinition n() {
                    return this.f417305c;
                }

                @Override // net.bytebuddy.description.TypeVariableSource
                public final d.f r() {
                    return new d.f.b();
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.a
                public final int y0() {
                    return this.f417306d.b() ? 8 : 0;
                }

                @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                @I41.g
                public final TypeDescription n() {
                    return this.f417305c;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class c extends e {

                /* renamed from: d, reason: collision with root package name */
                public final SpecialMethodInvocation f417308d;

                public c(a aVar, Visibility visibility, SpecialMethodInvocation specialMethodInvocation) {
                    super(aVar, visibility);
                    this.f417308d = specialMethodInvocation;
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.e
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f417308d.equals(((c) obj).f417308d);
                    }
                    return false;
                }

                @Override // net.bytebuddy.implementation.bytecode.a
                public final a.c h(s sVar, Context context, net.bytebuddy.description.method.a aVar) {
                    return new a.c(new StackManipulation.b(MethodVariableAccess.a(aVar).g(), this.f417308d, MethodReturn.c(aVar.getReturnType())).n(sVar, context).f417834b, aVar.p());
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.e
                public final int hashCode() {
                    return this.f417308d.hashCode() + (super.hashCode() * 31);
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.e
                public final e j(MethodAccessorFactory.AccessType accessType) {
                    return new c(this.f417312b, this.f417313c.c(accessType.f417363b), this.f417308d);
                }
            }

            public static class d extends a.c.AbstractC11972a {

                /* renamed from: c, reason: collision with root package name */
                public final TypeDescription f417309c;

                /* renamed from: d, reason: collision with root package name */
                public final TypeDescription.Generic f417310d;

                /* renamed from: e, reason: collision with root package name */
                public final String f417311e;

                public d(TypeDescription typeDescription, TypeDescription.Generic generic, String str, int i12) {
                    this.f417309c = typeDescription;
                    this.f417310d = generic;
                    StringBuilder sbA = r.A("cachedValue$", str, "$");
                    sbA.append(net.bytebuddy.utility.g.a(i12));
                    this.f417311e = sbA.toString();
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return new a.b();
                }

                @Override // net.bytebuddy.description.c
                public final int getModifiers() {
                    return (this.f417309c.E() ? 1 : 2) | 4120;
                }

                @Override // net.bytebuddy.description.d.InterfaceC11969d
                public final String getName() {
                    return this.f417311e;
                }

                @Override // net.bytebuddy.description.field.a
                public final TypeDescription.Generic getType() {
                    return this.f417310d;
                }

                @Override // net.bytebuddy.description.field.a.c.AbstractC11972a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                @I41.g
                public final TypeDefinition n() {
                    return this.f417309c;
                }

                @Override // net.bytebuddy.description.field.a.c.AbstractC11972a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                @I41.g
                public final TypeDescription n() {
                    return this.f417309c;
                }
            }

            public static class f implements StackManipulation {

                /* renamed from: b, reason: collision with root package name */
                public final MethodConstant.c f417314b;

                /* renamed from: c, reason: collision with root package name */
                public final TypeDescription f417315c;

                public f(MethodConstant.c cVar, TypeDescription typeDescription) {
                    this.f417314b = cVar;
                    this.f417315c = typeDescription;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    f fVar = (f) obj;
                    return this.f417314b.equals(fVar.f417314b) && this.f417315c.equals(fVar.f417315c);
                }

                public final int hashCode() {
                    return this.f417315c.hashCode() + (this.f417314b.hashCode() * 31);
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public final boolean isValid() {
                    return this.f417314b.isValid();
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public final StackManipulation.d n(s sVar, Context context) {
                    return this.f417314b.n(sVar, context);
                }
            }

            public static class g extends a {

                /* renamed from: c, reason: collision with root package name */
                public final TypeDescription f417316c;

                public g(String str, TypeDescription typeDescription) {
                    this.f417316c = typeDescription;
                    throw null;
                }

                @Override // net.bytebuddy.description.method.a
                public final d.f N() {
                    return new d.f.b();
                }

                @Override // net.bytebuddy.description.d.InterfaceC11969d
                public final String V() {
                    return null;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return new a.b();
                }

                @Override // net.bytebuddy.description.method.a
                @net.bytebuddy.utility.nullability.b
                public final AnnotationValue<?, ?> getDefaultValue() {
                    return null;
                }

                @Override // net.bytebuddy.description.method.a
                public final net.bytebuddy.description.method.d<c.InterfaceC11982c> getParameters() {
                    return new d.b();
                }

                @Override // net.bytebuddy.description.method.a
                public final TypeDescription.Generic getReturnType() {
                    throw null;
                }

                @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                @I41.g
                public final TypeDefinition n() {
                    return this.f417316c;
                }

                @Override // net.bytebuddy.description.TypeVariableSource
                public final d.f r() {
                    return new d.f.b();
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.a
                public final int y0() {
                    throw null;
                }

                @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                @I41.g
                public final TypeDescription n() {
                    return this.f417316c;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class h extends e {
                @Override // net.bytebuddy.implementation.Implementation.Context.Default.e
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    throw null;
                }

                @Override // net.bytebuddy.implementation.bytecode.a
                public final a.c h(s sVar, Context context, net.bytebuddy.description.method.a aVar) {
                    throw null;
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.e
                public final int hashCode() {
                    super.hashCode();
                    throw null;
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.e
                public final e j(MethodAccessorFactory.AccessType accessType) {
                    return new h(this.f417312b, this.f417313c.c(accessType.f417363b));
                }
            }

            public static class i extends a {

                /* renamed from: c, reason: collision with root package name */
                public final TypeDescription f417317c;

                public i(String str, TypeDescription typeDescription) {
                    this.f417317c = typeDescription;
                    throw null;
                }

                @Override // net.bytebuddy.description.method.a
                public final d.f N() {
                    return new d.f.b();
                }

                @Override // net.bytebuddy.description.d.InterfaceC11969d
                public final String V() {
                    return null;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return new a.b();
                }

                @Override // net.bytebuddy.description.method.a
                @net.bytebuddy.utility.nullability.b
                public final AnnotationValue<?, ?> getDefaultValue() {
                    return null;
                }

                @Override // net.bytebuddy.description.method.a
                public final net.bytebuddy.description.method.d<c.InterfaceC11982c> getParameters() {
                    throw null;
                }

                @Override // net.bytebuddy.description.method.a
                public final TypeDescription.Generic getReturnType() {
                    return TypeDescription.Generic.f416325z2;
                }

                @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                @I41.g
                public final TypeDefinition n() {
                    return this.f417317c;
                }

                @Override // net.bytebuddy.description.TypeVariableSource
                public final d.f r() {
                    return new d.f.b();
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.a
                public final int y0() {
                    throw null;
                }

                @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                @I41.g
                public final TypeDescription n() {
                    return this.f417317c;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class j extends e {
                @Override // net.bytebuddy.implementation.Implementation.Context.Default.e
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    throw null;
                }

                @Override // net.bytebuddy.implementation.bytecode.a
                public final a.c h(s sVar, Context context, net.bytebuddy.description.method.a aVar) {
                    MethodVariableAccess.a(aVar).g();
                    FieldAccess.c(null);
                    throw null;
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.e
                public final int hashCode() {
                    super.hashCode();
                    throw null;
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.e
                public final e j(MethodAccessorFactory.AccessType accessType) {
                    return new j(this.f417312b, this.f417313c.c(accessType.f417363b));
                }
            }

            public Default(TypeDescription typeDescription, ClassFileVersion classFileVersion, a.InterfaceC12088a interfaceC12088a, TypeInitializer typeInitializer, ClassFileVersion classFileVersion2, String str) {
                super(typeDescription, classFileVersion);
                this.f417292d = interfaceC12088a;
                this.f417293e = typeInitializer;
                this.f417294f = classFileVersion2;
                this.f417301m = str;
                this.f417295g = new HashMap();
                this.f417296h = new HashMap();
                this.f417297i = new HashMap();
                this.f417298j = new HashMap();
                this.f417299k = new HashMap();
                this.f417300l = new HashSet();
                this.f417302n = true;
            }

            @Override // net.bytebuddy.implementation.MethodAccessorFactory
            public final a.d c(SpecialMethodInvocation specialMethodInvocation, MethodAccessorFactory.AccessType accessType) {
                e eVarJ;
                HashMap map = this.f417295g;
                e eVar = (e) map.get(specialMethodInvocation);
                if (eVar == null) {
                    eVarJ = new c(new b(this.f417319b, specialMethodInvocation.o(), specialMethodInvocation.t(), this.f417301m), accessType.f417363b, specialMethodInvocation);
                } else {
                    eVarJ = eVar.j(accessType);
                }
                map.put(specialMethodInvocation, eVarJ);
                return eVarJ.f417312b;
            }

            @Override // net.bytebuddy.implementation.Implementation.Context.a
            public final void d(TypeInitializer.a aVar, net.bytebuddy.jar.asm.f fVar, AnnotationValueFilter.b bVar) {
                this.f417302n = false;
                TypeInitializer typeInitializerD = this.f417293e;
                for (Map.Entry entry : this.f417299k.entrySet()) {
                    m mVarG = fVar.g(((a.c) entry.getValue()).getModifiers(), ((a.c) entry.getValue()).V(), ((a.c) entry.getValue()).getDescriptor(), ((a.c) entry.getValue()).h(), null);
                    if (mVarG != null) {
                        mVarG.c();
                        f fVar2 = (f) entry.getKey();
                        net.bytebuddy.description.field.a aVar2 = (net.bytebuddy.description.field.a) entry.getValue();
                        fVar2.getClass();
                        typeInitializerD = typeInitializerD.d(new a.b(fVar2, FieldAccess.c(aVar2).a()));
                    }
                }
                aVar.b(fVar, typeInitializerD, this);
                Iterator it = this.f417295g.values().iterator();
                while (it.hasNext()) {
                    ((TypeWriter.MethodPool.Record) it.next()).g(fVar, this, bVar);
                }
                Iterator it2 = this.f417296h.values().iterator();
                while (it2.hasNext()) {
                    ((TypeWriter.MethodPool.Record) it2.next()).g(fVar, this, bVar);
                }
                Iterator it3 = this.f417297i.values().iterator();
                while (it3.hasNext()) {
                    ((TypeWriter.MethodPool.Record) it3.next()).g(fVar, this, bVar);
                }
            }

            @Override // net.bytebuddy.implementation.Implementation.Context
            public final TypeDescription e(net.bytebuddy.implementation.auxiliary.a aVar) {
                HashMap map = this.f417298j;
                net.bytebuddy.dynamic.a aVarD = (net.bytebuddy.dynamic.a) map.get(aVar);
                if (aVarD == null) {
                    aVarD = aVar.d(this.f417292d.a(this.f417319b, aVar), this.f417294f, this);
                    map.put(aVar, aVarD);
                }
                return aVarD.t();
            }

            @Override // net.bytebuddy.implementation.Implementation.Context.a
            public final List<net.bytebuddy.dynamic.a> f() {
                return new ArrayList(this.f417298j.values());
            }

            @Override // net.bytebuddy.implementation.Implementation.Context
            public final a.c h(MethodConstant.c cVar, TypeDescription typeDescription) {
                f fVar = new f(cVar, typeDescription);
                HashMap map = this.f417299k;
                a.c cVar2 = (a.c) map.get(fVar);
                if (cVar2 != null) {
                    return cVar2;
                }
                boolean z12 = this.f417302n;
                TypeDescription typeDescription2 = this.f417319b;
                if (!z12) {
                    throw new IllegalStateException(D8.o("Cached values cannot be registered after defining the type initializer for ", typeDescription2));
                }
                int iHashCode = cVar.hashCode();
                while (true) {
                    int i12 = iHashCode + 1;
                    d dVar = new d(typeDescription2, typeDescription.P0(), this.f417301m, iHashCode);
                    if (this.f417300l.add(dVar)) {
                        map.put(fVar, dVar);
                        return dVar;
                    }
                    iHashCode = i12;
                }
            }

            @Override // net.bytebuddy.implementation.Implementation.Context.a
            public final boolean isEnabled() {
                return true;
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class e extends TypeWriter.MethodPool.Record.b implements net.bytebuddy.implementation.bytecode.a {

                /* renamed from: b, reason: collision with root package name */
                public final a f417312b;

                /* renamed from: c, reason: collision with root package name */
                public final Visibility f417313c;

                public e(a aVar, Visibility visibility) {
                    this.f417312b = aVar;
                    this.f417313c = visibility;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final TypeWriter.MethodPool.Record b(net.bytebuddy.implementation.bytecode.a aVar) {
                    throw new UnsupportedOperationException("Cannot prepend code to a delegation for " + this.f417312b);
                }

                public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    e eVar = (e) obj;
                    return this.f417313c.equals(eVar.f417313c) && this.f417312b.equals(eVar.f417312b);
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final void f(s sVar, Context context, AnnotationValueFilter.b bVar) {
                    sVar.h();
                    a.c cVarH = h(sVar, context, this.f417312b);
                    sVar.y(cVarH.f417849a, cVarH.f417850b);
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final net.bytebuddy.description.method.a getMethod() {
                    return this.f417312b;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final Visibility getVisibility() {
                    return this.f417313c;
                }

                public int hashCode() {
                    return this.f417313c.hashCode() + ((this.f417312b.hashCode() + (getClass().hashCode() * 31)) * 31);
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final a.c i(s sVar, Context context) {
                    return h(sVar, context, this.f417312b);
                }

                public abstract e j(MethodAccessorFactory.AccessType accessType);

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final TypeWriter.MethodPool.Record.Sort o() {
                    return TypeWriter.MethodPool.Record.Sort.IMPLEMENTED;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final void e(s sVar) {
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final void c(s sVar, AnnotationValueFilter.b bVar) {
                }
            }
        }
    }

    public interface SpecialMethodInvocation extends StackManipulation {

        public static abstract class a extends StackManipulation.a implements SpecialMethodInvocation {

            /* renamed from: b, reason: collision with root package name */
            public transient /* synthetic */ int f417323b;

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SpecialMethodInvocation)) {
                    return false;
                }
                SpecialMethodInvocation specialMethodInvocation = (SpecialMethodInvocation) obj;
                return o().e().equals(specialMethodInvocation.o().e()) && t().equals(specialMethodInvocation.t());
            }

            @k.c
            public final int hashCode() {
                int iHashCode = this.f417323b != 0 ? 0 : (o().e().hashCode() * 31) + t().hashCode();
                if (iHashCode == 0) {
                    return this.f417323b;
                }
                this.f417323b = iHashCode;
                return iHashCode;
            }
        }

        public static class b extends a {

            /* renamed from: c, reason: collision with root package name */
            public final net.bytebuddy.description.method.a f417324c;

            /* renamed from: d, reason: collision with root package name */
            public final TypeDescription f417325d;

            /* renamed from: e, reason: collision with root package name */
            public final StackManipulation f417326e;

            public b(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription, StackManipulation stackManipulation) {
                this.f417324c = aVar;
                this.f417325d = typeDescription;
                this.f417326e = stackManipulation;
            }

            public static SpecialMethodInvocation g(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription) {
                StackManipulation stackManipulationH = MethodInvocation.b(aVar).h(typeDescription);
                return stackManipulationH.isValid() ? new b(aVar, typeDescription, stackManipulationH) : Illegal.f417321b;
            }

            @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
            public final SpecialMethodInvocation e(a.j jVar) {
                return this.f417324c.f0().equals(jVar) ? this : Illegal.f417321b;
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Context context) {
                return this.f417326e.n(sVar, context);
            }

            @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
            public final net.bytebuddy.description.method.a o() {
                return this.f417324c;
            }

            @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
            public final TypeDescription t() {
                return this.f417325d;
            }
        }

        SpecialMethodInvocation e(a.j jVar);

        net.bytebuddy.description.method.a o();

        TypeDescription t();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Illegal implements SpecialMethodInvocation {

            /* renamed from: b, reason: collision with root package name */
            public static final Illegal f417321b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Illegal[] f417322c;

            static {
                Illegal illegal = new Illegal("INSTANCE", 0);
                f417321b = illegal;
                f417322c = new Illegal[]{illegal};
            }

            public Illegal() {
                throw null;
            }

            public static Illegal valueOf(String str) {
                return (Illegal) Enum.valueOf(Illegal.class, str);
            }

            public static Illegal[] values() {
                return (Illegal[]) f417322c.clone();
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final boolean isValid() {
                return false;
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public final StackManipulation.d n(s sVar, Context context) {
                throw new IllegalStateException("Cannot implement an undefined method");
            }

            @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
            public final net.bytebuddy.description.method.a o() {
                throw new IllegalStateException("An illegal special method invocation must not be applied");
            }

            @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
            public final TypeDescription t() {
                throw new IllegalStateException("An illegal special method invocation must not be applied");
            }

            @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
            public final SpecialMethodInvocation e(a.j jVar) {
                return this;
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class d implements Implementation {

        public interface a {
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements Implementation {

            @HashCodeAndEqualsPlugin.Enhance
            public class a implements net.bytebuddy.implementation.bytecode.a {

                /* renamed from: b, reason: collision with root package name */
                public final Target f417335b;

                public a(Target target) {
                    this.f417335b = target;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.f417335b.equals(aVar.f417335b) && b.this.equals(b.this);
                }

                @Override // net.bytebuddy.implementation.bytecode.a
                public final a.c h(s sVar, Context context, net.bytebuddy.description.method.a aVar) {
                    b.this.getClass();
                    throw null;
                }

                public final int hashCode() {
                    getClass().hashCode();
                    this.f417335b.hashCode();
                    b.this.hashCode();
                    throw null;
                }
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
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

            @Override // net.bytebuddy.implementation.Implementation
            public final net.bytebuddy.implementation.bytecode.a i(Target target) {
                return new a(target);
            }
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

        @Override // net.bytebuddy.implementation.Implementation
        public final net.bytebuddy.implementation.bytecode.a i(Target target) {
            return null;
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public final InstrumentedType e(InstrumentedType instrumentedType) {
            return instrumentedType;
        }
    }
}
