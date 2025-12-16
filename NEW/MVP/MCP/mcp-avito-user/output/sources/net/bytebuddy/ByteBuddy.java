package net.bytebuddy;

import com.yandex.div2.D8;
import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.bytebuddy.NamingStrategy;
import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.modifier.TypeManifestation;
import net.bytebuddy.description.modifier.Visibility;
import net.bytebuddy.description.modifier.a;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.b;
import net.bytebuddy.description.type.d;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.VisibilityBridgeStrategy;
import net.bytebuddy.dynamic.scaffold.ClassWriterStrategy;
import net.bytebuddy.dynamic.scaffold.FieldRegistry;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import net.bytebuddy.dynamic.scaffold.MethodRegistry;
import net.bytebuddy.dynamic.scaffold.RecordComponentRegistry;
import net.bytebuddy.dynamic.scaffold.TypeInitializer;
import net.bytebuddy.dynamic.scaffold.TypeValidation;
import net.bytebuddy.dynamic.scaffold.inline.g;
import net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.LoadedTypeInitializer;
import net.bytebuddy.implementation.attribute.AnnotationRetention;
import net.bytebuddy.implementation.attribute.AnnotationValueFilter;
import net.bytebuddy.implementation.attribute.TypeAttributeAppender;
import net.bytebuddy.implementation.auxiliary.a;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.FieldAccess.b.C12105b;
import net.bytebuddy.implementation.bytecode.member.FieldAccess.b.c;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.b;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.matcher.C44393b;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.LatentMatcher;
import net.bytebuddy.matcher.ModifierMatcher;
import net.bytebuddy.matcher.z;
import net.bytebuddy.utility.JavaConstant;
import net.bytebuddy.utility.JavaType;
import net.bytebuddy.utility.nullability.b;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes8.dex */
public class ByteBuddy {

    /* renamed from: m, reason: collision with root package name */
    @b
    public static final NamingStrategy.Suffixing f415267m;

    /* renamed from: n, reason: collision with root package name */
    @b
    public static final a.InterfaceC12088a.b f415268n;

    /* renamed from: o, reason: collision with root package name */
    @b
    public static final Implementation.Context.Default.Factory.a f415269o;

    /* renamed from: p, reason: collision with root package name */
    public static final boolean f415270p;

    /* renamed from: a, reason: collision with root package name */
    public final ClassFileVersion f415271a;

    /* renamed from: b, reason: collision with root package name */
    public final NamingStrategy.Suffixing f415272b;

    /* renamed from: c, reason: collision with root package name */
    public final a.InterfaceC12088a f415273c;

    /* renamed from: d, reason: collision with root package name */
    public final AnnotationValueFilter.Default f415274d;

    /* renamed from: e, reason: collision with root package name */
    public final AnnotationRetention f415275e;

    /* renamed from: f, reason: collision with root package name */
    public final Implementation.Context.b f415276f;

    /* renamed from: g, reason: collision with root package name */
    public final MethodGraph.Compiler f415277g;

    /* renamed from: h, reason: collision with root package name */
    public final InstrumentedType.Factory.Default f415278h;

    /* renamed from: i, reason: collision with root package name */
    public final LatentMatcher.f f415279i;

    /* renamed from: j, reason: collision with root package name */
    public final TypeValidation f415280j;

    /* renamed from: k, reason: collision with root package name */
    public final VisibilityBridgeStrategy.Default f415281k;

    /* renamed from: l, reason: collision with root package name */
    public final ClassWriterStrategy.Default f415282l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @HashCodeAndEqualsPlugin.Enhance
    public static final class RecordConstructorStrategy implements ConstructorStrategy, Implementation {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ RecordConstructorStrategy[] f415283b = {new RecordConstructorStrategy("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        RecordConstructorStrategy EF5;

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements net.bytebuddy.implementation.bytecode.a {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f415284b;

            public a(TypeDescription typeDescription) {
                this.f415284b = typeDescription;
            }

            public final boolean equals(@b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f415284b.equals(((a) obj).f415284b);
                }
                return false;
            }

            @Override // net.bytebuddy.implementation.bytecode.a
            public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                int i12 = 1;
                boolean zC2 = aVar.C();
                TypeDescription typeDescription = this.f415284b;
                if (zC2) {
                    return new a.b(MethodVariableAccess.c(), FieldAccess.b((a.c) typeDescription.x().P1(C44411u.x(aVar.getName())).M2()).new C12105b(), MethodReturn.c(aVar.getReturnType())).h(sVar, context, aVar);
                }
                ArrayList arrayList = new ArrayList((typeDescription.z().size() * 3) + 2);
                arrayList.add(MethodVariableAccess.c());
                arrayList.add(MethodInvocation.a(new a.f(JavaType.f418908l.f418912b, new a.h(1))));
                for (b.c cVar : typeDescription.z()) {
                    arrayList.add(MethodVariableAccess.c());
                    arrayList.add(MethodVariableAccess.d(cVar.getType()).new b(i12));
                    arrayList.add(FieldAccess.b((a.c) typeDescription.x().P1(C44411u.x(cVar.R())).M2()).new c());
                    i12 += cVar.getType().p().f417839b;
                }
                arrayList.add(MethodReturn.f418075h);
                return new a.b(arrayList).h(sVar, context, aVar);
            }

            public final int hashCode() {
                return this.f415284b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        public RecordConstructorStrategy() {
            throw null;
        }

        public static RecordConstructorStrategy valueOf(String str) {
            return (RecordConstructorStrategy) Enum.valueOf(RecordConstructorStrategy.class, str);
        }

        public static RecordConstructorStrategy[] values() {
            return (RecordConstructorStrategy[]) f415283b.clone();
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public final InstrumentedType e(InstrumentedType instrumentedType) {
            for (b.c cVar : instrumentedType.z()) {
                InstrumentedType instrumentedTypeW = instrumentedType.W(new a.g(cVar.R(), 18, cVar.getType(), cVar.getDeclaredAnnotations().P1(new C44393b(ElementType.FIELD))));
                String strR = cVar.R();
                List listEmptyList = Collections.emptyList();
                TypeDescription.Generic type = cVar.getType();
                List listEmptyList2 = Collections.emptyList();
                List listEmptyList3 = Collections.emptyList();
                net.bytebuddy.description.annotation.a aVarP1 = cVar.getDeclaredAnnotations().P1(new C44393b(ElementType.METHOD));
                TypeDescription.Generic.d.b bVar = TypeDescription.Generic.f416323x2;
                instrumentedType = instrumentedTypeW.n0(new a.h(strR, 1, listEmptyList, type, listEmptyList2, listEmptyList3, aVarP1, null, null));
            }
            return instrumentedType;
        }

        @Override // net.bytebuddy.implementation.Implementation
        public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
            return new a(target.a());
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class a implements Implementation {

        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.ByteBuddy$a$a, reason: collision with other inner class name */
        public static class C11869a implements net.bytebuddy.implementation.bytecode.a {
            public C11869a() {
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

            @Override // net.bytebuddy.implementation.bytecode.a
            public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                throw null;
            }

            public final int hashCode() {
                getClass().hashCode();
                throw null;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements net.bytebuddy.implementation.bytecode.a {

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f415290b;

            public b(TypeDescription typeDescription) {
                this.f415290b = typeDescription;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f415290b.equals(((b) obj).f415290b);
                }
                return false;
            }

            @Override // net.bytebuddy.implementation.bytecode.a
            public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                net.bytebuddy.description.field.a aVar2 = (net.bytebuddy.description.field.a) this.f415290b.x().P1(C44411u.x("$VALUES")).M2();
                return new a.c(new StackManipulation.b(FieldAccess.c(aVar2).read(), MethodInvocation.b((net.bytebuddy.description.method.a) ((net.bytebuddy.description.method.b) ((z.a) TypeDescription.Generic.f416323x2.q()).P1(C44411u.x("clone"))).M2()).i(aVar2.getType().f5()), net.bytebuddy.implementation.bytecode.assign.b.g(aVar2.getType().f5()), MethodReturn.f418076i).n(sVar, context).f417834b, aVar.p());
            }

            public final int hashCode() {
                return this.f415290b.hashCode() + (getClass().hashCode() * 31);
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
        public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
            return new b(target.a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    static {
        /*
            r0 = 0
            r1 = 0
            java.lang.String r2 = "java.security.AccessController"
            java.lang.Class.forName(r2, r0, r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            java.lang.String r2 = "net.bytebuddy.securitymanager"
            java.lang.String r3 = "true"
            java.lang.String r2 = java.lang.System.getProperty(r2, r3)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            net.bytebuddy.ByteBuddy.f415270p = r2     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            goto L19
        L16:
            r0 = 1
        L17:
            net.bytebuddy.ByteBuddy.f415270p = r0
        L19:
            net.bytebuddy.utility.privilege.b r0 = new net.bytebuddy.utility.privilege.b
            java.lang.String r2 = "net.bytebuddy.naming"
            r0.<init>(r2)
            boolean r3 = net.bytebuddy.ByteBuddy.f415270p
            if (r3 == 0) goto L29
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            goto L2d
        L29:
            java.lang.String r0 = java.lang.System.getProperty(r2)
        L2d:
            java.lang.String r0 = (java.lang.String) r0
            net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType r2 = net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType.f415320b
            if (r0 != 0) goto L53
            net.bytebuddy.utility.GraalImageCode r0 = net.bytebuddy.utility.GraalImageCode.a()
            boolean r0 = r0.f418861b
            if (r0 == 0) goto L50
            net.bytebuddy.NamingStrategy$Suffixing r1 = new net.bytebuddy.NamingStrategy$Suffixing
            net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$c r0 = new net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$c
            r0.<init>()
            r1.<init>(r0)
            net.bytebuddy.implementation.auxiliary.a$a$b r0 = new net.bytebuddy.implementation.auxiliary.a$a$b
            r0.<init>()
            net.bytebuddy.implementation.Implementation$Context$Default$Factory$a r2 = new net.bytebuddy.implementation.Implementation$Context$Default$Factory$a
            r2.<init>()
            goto La9
        L50:
            r0 = r1
            r2 = r0
            goto La9
        L53:
            java.lang.String r1 = "fixed"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L6b
            net.bytebuddy.NamingStrategy$Suffixing r1 = new net.bytebuddy.NamingStrategy$Suffixing
            r1.<init>(r2)
            net.bytebuddy.implementation.auxiliary.a$a$b r0 = new net.bytebuddy.implementation.auxiliary.a$a$b
            r0.<init>()
            net.bytebuddy.implementation.Implementation$Context$Default$Factory$a r2 = new net.bytebuddy.implementation.Implementation$Context$Default$Factory$a
            r2.<init>()
            goto La9
        L6b:
            java.lang.String r1 = "caller"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L88
            net.bytebuddy.NamingStrategy$Suffixing r1 = new net.bytebuddy.NamingStrategy$Suffixing
            net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$c r0 = new net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$c
            r0.<init>()
            r1.<init>(r0)
            net.bytebuddy.implementation.auxiliary.a$a$b r0 = new net.bytebuddy.implementation.auxiliary.a$a$b
            r0.<init>()
            net.bytebuddy.implementation.Implementation$Context$Default$Factory$a r2 = new net.bytebuddy.implementation.Implementation$Context$Default$Factory$a
            r2.<init>()
            goto La9
        L88:
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> Lb0
            net.bytebuddy.NamingStrategy$SuffixingRandom r2 = new net.bytebuddy.NamingStrategy$SuffixingRandom
            net.bytebuddy.utility.g r3 = new net.bytebuddy.utility.g
            java.util.Random r4 = new java.util.Random
            r4.<init>(r0)
            r3.<init>(r4)
            r2.<init>(r3)
            net.bytebuddy.implementation.auxiliary.a$a$b r1 = new net.bytebuddy.implementation.auxiliary.a$a$b
            r1.<init>()
            net.bytebuddy.implementation.Implementation$Context$Default$Factory$a r0 = new net.bytebuddy.implementation.Implementation$Context$Default$Factory$a
            r0.<init>()
            r5 = r2
            r2 = r0
            r0 = r1
            r1 = r5
        La9:
            net.bytebuddy.ByteBuddy.f415267m = r1
            net.bytebuddy.ByteBuddy.f415268n = r0
            net.bytebuddy.ByteBuddy.f415269o = r2
            return
        Lb0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "'net.bytebuddy.naming' is set to an unknown, non-numeric value: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.ByteBuddy.<clinit>():void");
    }

    public ByteBuddy() {
        this(ClassFileVersion.h(ClassFileVersion.f415295g));
    }

    public final g a(TypeDescription typeDescription, ClassFileLocator classFileLocator) {
        if (typeDescription.w2() || typeDescription.w5()) {
            throw new IllegalArgumentException(D8.o("Cannot redefine array or primitive type: ", typeDescription));
        }
        InstrumentedType.d dVarA = this.f415278h.a(typeDescription);
        FieldRegistry.a aVar = new FieldRegistry.a();
        MethodRegistry.b bVar = new MethodRegistry.b();
        RecordComponentRegistry.a aVar2 = new RecordComponentRegistry.a();
        AnnotationRetention annotationRetention = this.f415275e;
        return new g(dVarA, aVar, bVar, aVar2, annotationRetention.f417488b ? new TypeAttributeAppender.ForInstrumentedType.a(typeDescription) : TypeAttributeAppender.ForInstrumentedType.f417509b, AsmVisitorWrapper.NoOp.f415884b, this.f415271a, this.f415273c, this.f415274d, annotationRetention, this.f415276f, this.f415277g, this.f415280j, this.f415281k, this.f415282l, this.f415279i, Collections.emptyList(), typeDescription, classFileLocator);
    }

    public final net.bytebuddy.dynamic.scaffold.subclass.a b(Class cls, ConstructorStrategy.Default r22) {
        return c(TypeDescription.d.A0(cls), r22);
    }

    public final net.bytebuddy.dynamic.scaffold.subclass.a c(TypeDefinition typeDefinition, ConstructorStrategy.Default r312) {
        TypeDescription.Generic genericP0;
        d.f bVar;
        if (typeDefinition.w5() || typeDefinition.w2() || typeDefinition.isFinal()) {
            throw new IllegalArgumentException("Cannot subclass primitive, array or final types: " + typeDefinition);
        }
        if (typeDefinition.E()) {
            genericP0 = TypeDescription.Generic.f416323x2;
            bVar = new d.f.c(typeDefinition);
        } else {
            genericP0 = typeDefinition.P0();
            bVar = new d.f.b();
        }
        TypeDescription.Generic generic = genericP0;
        TypeDescription.Generic genericP02 = typeDefinition.P0();
        NamingStrategy.Suffixing suffixing = this.f415272b;
        suffixing.getClass();
        String strA = suffixing.a(genericP02.f5());
        int iA2 = new a.e(Arrays.asList(Visibility.PUBLIC, TypeManifestation.PLAIN)).a(typeDefinition.getModifiers());
        this.f415278h.getClass();
        List listEmptyList = Collections.emptyList();
        List listEmptyList2 = Collections.emptyList();
        List listEmptyList3 = Collections.emptyList();
        Map mapEmptyMap = Collections.emptyMap();
        List listEmptyList4 = Collections.emptyList();
        List listEmptyList5 = Collections.emptyList();
        List listEmptyList6 = Collections.emptyList();
        TypeInitializer.None none = TypeInitializer.None.f416957b;
        LoadedTypeInitializer.NoOp noOp = LoadedTypeInitializer.NoOp.f417353b;
        TypeDescription.d dVar = TypeDescription.f416317A2;
        return new net.bytebuddy.dynamic.scaffold.subclass.a(new InstrumentedType.b(strA, iA2, generic, listEmptyList, listEmptyList2, listEmptyList3, mapEmptyMap, listEmptyList4, listEmptyList5, listEmptyList6, none, noOp, null, null, null, Collections.emptyList(), null, false, false, false, net.bytebuddy.dynamic.c.f416659a, Collections.emptyList()).N3(bVar), new FieldRegistry.a(), new MethodRegistry.b(), new RecordComponentRegistry.a(), TypeAttributeAppender.ForInstrumentedType.f417509b, AsmVisitorWrapper.NoOp.f415884b, this.f415271a, this.f415273c, this.f415274d, this.f415275e, this.f415276f, this.f415277g, this.f415280j, this.f415281k, this.f415282l, this.f415279i, Collections.emptyList(), r312);
    }

    public final ByteBuddy d() {
        TypeValidation typeValidation = TypeValidation.DISABLED;
        LatentMatcher.f fVar = this.f415279i;
        return new ByteBuddy(this.f415271a, this.f415272b, this.f415273c, this.f415274d, this.f415275e, this.f415276f, this.f415277g, this.f415278h, typeValidation, this.f415281k, this.f415282l, fVar);
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ByteBuddy byteBuddy = (ByteBuddy) obj;
        return this.f415275e.equals(byteBuddy.f415275e) && this.f415280j.equals(byteBuddy.f415280j) && this.f415271a.equals(byteBuddy.f415271a) && this.f415272b.equals(byteBuddy.f415272b) && this.f415273c.equals(byteBuddy.f415273c) && this.f415274d.equals(byteBuddy.f415274d) && this.f415276f.equals(byteBuddy.f415276f) && this.f415277g.equals(byteBuddy.f415277g) && this.f415278h.equals(byteBuddy.f415278h) && this.f415279i.equals(byteBuddy.f415279i) && this.f415281k.equals(byteBuddy.f415281k) && this.f415282l.equals(byteBuddy.f415282l);
    }

    public final int hashCode() {
        return this.f415282l.hashCode() + ((this.f415281k.hashCode() + ((this.f415280j.hashCode() + ((this.f415279i.hashCode() + ((this.f415278h.hashCode() + ((this.f415277g.hashCode() + ((this.f415276f.hashCode() + ((this.f415275e.hashCode() + ((this.f415274d.hashCode() + ((this.f415273c.hashCode() + ((this.f415272b.hashCode() + ((this.f415271a.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ByteBuddy(ClassFileVersion classFileVersion) {
        NamingStrategy.Suffixing suffixing = f415267m;
        NamingStrategy.Suffixing suffixingRandom = suffixing == null ? new NamingStrategy.SuffixingRandom(new net.bytebuddy.utility.g()) : suffixing;
        a.InterfaceC12088a interfaceC12088a = f415268n;
        a.InterfaceC12088a cVar = interfaceC12088a == null ? new a.InterfaceC12088a.c() : interfaceC12088a;
        AnnotationValueFilter.Default r62 = AnnotationValueFilter.Default.f417489b;
        AnnotationRetention annotationRetention = AnnotationRetention.ENABLED;
        Implementation.Context.b bVar = f415269o;
        this(classFileVersion, suffixingRandom, cVar, r62, annotationRetention, bVar == null ? Implementation.Context.Default.Factory.f417303b : bVar, MethodGraph.Compiler.f416866G2, InstrumentedType.Factory.Default.f416838b, TypeValidation.ENABLED, VisibilityBridgeStrategy.Default.f416616b, ClassWriterStrategy.Default.f416813b, new LatentMatcher.f(ModifierMatcher.Mode.SYNTHETIC.f418407d.d(C44411u.m())));
    }

    public ByteBuddy(ClassFileVersion classFileVersion, NamingStrategy.Suffixing suffixing, a.InterfaceC12088a interfaceC12088a, AnnotationValueFilter.Default r42, AnnotationRetention annotationRetention, Implementation.Context.b bVar, MethodGraph.Compiler compiler, InstrumentedType.Factory.Default r82, TypeValidation typeValidation, VisibilityBridgeStrategy.Default r102, ClassWriterStrategy.Default r112, LatentMatcher.f fVar) {
        this.f415271a = classFileVersion;
        this.f415272b = suffixing;
        this.f415273c = interfaceC12088a;
        this.f415274d = r42;
        this.f415275e = annotationRetention;
        this.f415276f = bVar;
        this.f415277g = compiler;
        this.f415278h = r82;
        this.f415280j = typeValidation;
        this.f415281k = r102;
        this.f415282l = r112;
        this.f415279i = fVar;
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF16' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @HashCodeAndEqualsPlugin.Enhance
    public static final class RecordObjectMethod implements Implementation {

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ RecordObjectMethod[] f415285f;

        /* renamed from: b, reason: collision with root package name */
        public final String f415286b;

        /* renamed from: c, reason: collision with root package name */
        public final StackManipulation f415287c;

        /* renamed from: d, reason: collision with root package name */
        public final TypeDescription f415288d;

        /* renamed from: e, reason: collision with root package name */
        public final d.e f415289e;

        /* JADX INFO: Fake field, exist only in values array */
        RecordObjectMethod EF16;

        static {
            StackManipulation.Trivial trivial = StackManipulation.Trivial.f417829b;
            f415285f = new RecordObjectMethod[]{new RecordObjectMethod("HASH_CODE", 0, "hashCode", trivial, Integer.TYPE, new Class[0]), new RecordObjectMethod("EQUALS", 1, "equals", MethodVariableAccess.f418084i.new b(1), Boolean.TYPE, Object.class), new RecordObjectMethod("TO_STRING", 2, "toString", trivial, String.class, new Class[0])};
        }

        public RecordObjectMethod(String str, int i12, String str2, StackManipulation stackManipulation, Class cls, Class... clsArr) {
            this.f415286b = str2;
            this.f415287c = stackManipulation;
            this.f415288d = TypeDescription.d.A0(cls);
            this.f415289e = new d.e(clsArr);
        }

        public static RecordObjectMethod valueOf(String str) {
            return (RecordObjectMethod) Enum.valueOf(RecordObjectMethod.class, str);
        }

        public static RecordObjectMethod[] values() {
            return (RecordObjectMethod[]) f415285f.clone();
        }

        @Override // net.bytebuddy.implementation.Implementation
        public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
            JavaConstant javaConstantB;
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList = new ArrayList(target.a().z().size());
            for (b.c cVar : target.a().z()) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(cVar.R());
                a.c cVar2 = (a.c) target.a().x().P1(C44411u.x(cVar.R())).M2();
                arrayList.add(new JavaConstant.MethodHandle(cVar2.b() ? JavaConstant.MethodHandle.HandleType.f418881j : JavaConstant.MethodHandle.HandleType.f418880i, cVar2.n().f5(), cVar2.V(), cVar2.getType().f5(), Collections.emptyList()));
            }
            StackManipulation stackManipulationC = MethodVariableAccess.c();
            JavaType.a aVar = JavaType.f418909m.f418912b;
            TypeDescription.Generic.d.b bVar = TypeDescription.Generic.f416323x2;
            JavaType.a aVar2 = JavaType.f418904h.f418912b;
            aVar2.getClass();
            TypeDescription.Generic.d.a aVar3 = new TypeDescription.Generic.d.a(aVar2);
            TypeDescription.d dVar = TypeDescription.f416318B2;
            TypeDescription.Generic genericY0 = TypeDescription.Generic.d.b.y0(dVar.f416504e);
            JavaType.a aVar4 = JavaType.f418901e.f418912b;
            aVar4.getClass();
            TypeDescription.Generic.d.a aVar5 = new TypeDescription.Generic.d.a(aVar4);
            TypeDescription.Generic genericY02 = TypeDescription.Generic.d.b.y0(TypeDescription.f416319C2.f416504e);
            TypeDescription.Generic genericY03 = TypeDescription.Generic.d.b.y0(dVar.f416504e);
            JavaType javaType = JavaType.f418902f;
            MethodInvocation.e eVarA = MethodInvocation.a(new a.f(aVar, new a.h("bootstrap", 9, bVar, Arrays.asList(aVar3, genericY0, aVar5, genericY02, genericY03, TypeDescription.c.z0(javaType.f418912b, 1).P0()))));
            List listC = net.bytebuddy.utility.a.c(target.a(), this.f415289e);
            JavaConstant.d.c cVarC = JavaConstant.d.c(target.a());
            String string = sb2.toString();
            if (string != null) {
                javaConstantB = new JavaConstant.d.b(string, dVar);
            } else if (javaType.b(string)) {
                javaConstantB = JavaConstant.MethodHandle.b(string);
            } else {
                if (!JavaType.f418903g.b(string)) {
                    throw new IllegalArgumentException("Not a loaded Java constant value: " + ((Object) string));
                }
                javaConstantB = JavaConstant.c.b(string);
            }
            ArrayList arrayListA = net.bytebuddy.utility.a.a(Arrays.asList(cVarC, javaConstantB), arrayList);
            String str = this.f415286b;
            TypeDescription typeDescription = this.f415288d;
            return new a.b(stackManipulationC, this.f415287c, eVarA.a(str, typeDescription, listC, arrayListA), MethodReturn.c(typeDescription));
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public final InstrumentedType e(InstrumentedType instrumentedType) {
            return instrumentedType;
        }
    }
}
