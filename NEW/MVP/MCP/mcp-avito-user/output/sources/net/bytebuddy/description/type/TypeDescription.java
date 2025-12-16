package net.bytebuddy.description.type;

import c61.AbstractC26949b;
import c61.C26950c;
import com.yandex.div2.D8;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.build.a;
import net.bytebuddy.build.k;
import net.bytebuddy.description.TypeVariableSource;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.annotation.AnnotationSource;
import net.bytebuddy.description.annotation.a;
import net.bytebuddy.description.c;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.field.b;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.method.b;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.a;
import net.bytebuddy.description.type.b;
import net.bytebuddy.description.type.c;
import net.bytebuddy.description.type.d;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.B;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.utility.FieldComparator;
import net.bytebuddy.utility.GraalImageCode;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;
import okhttp3.HttpUrl;
import shark.AndroidResourceIdNames;

/* loaded from: classes8.dex */
public interface TypeDescription extends TypeDefinition, net.bytebuddy.description.a, TypeVariableSource {

    /* renamed from: A2, reason: collision with root package name */
    public static final d f416317A2 = new d(Object.class);

    /* renamed from: B2, reason: collision with root package name */
    public static final d f416318B2 = new d(String.class);

    /* renamed from: C2, reason: collision with root package name */
    public static final d f416319C2 = new d(Class.class);

    /* renamed from: D2, reason: collision with root package name */
    public static final d f416320D2 = new d(Throwable.class);

    /* renamed from: E2, reason: collision with root package name */
    public static final d f416321E2 = new d(Void.TYPE);

    /* renamed from: F2, reason: collision with root package name */
    public static final d.f.e f416322F2 = new d.f.e(Cloneable.class, Serializable.class);

    public interface Generic extends TypeDefinition, AnnotationSource {

        /* renamed from: x2, reason: collision with root package name */
        public static final d.b f416323x2 = new d.b(Object.class);

        /* renamed from: y2, reason: collision with root package name */
        public static final d.b f416324y2 = new d.b(Class.class);

        /* renamed from: z2, reason: collision with root package name */
        public static final d.b f416325z2 = new d.b(Void.TYPE);

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class Builder {

            /* renamed from: a, reason: collision with root package name */
            public final List<? extends AnnotationDescription> f416359a;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Visitor implements Visitor<Builder> {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ Visitor[] f416360b = {new Visitor("INSTANCE", 0)};

                /* JADX INFO: Fake field, exist only in values array */
                Visitor EF5;

                public Visitor() {
                    throw null;
                }

                public static Visitor valueOf(String str) {
                    return (Visitor) Enum.valueOf(Visitor.class, str);
                }

                public static Visitor[] values() {
                    return (Visitor[]) f416360b.clone();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object a(OfParameterizedType ofParameterizedType) {
                    return new c(ofParameterizedType.f5(), ofParameterizedType.getOwnerType(), ofParameterizedType.J(), ofParameterizedType.getDeclaredAnnotations());
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public final Object b(c cVar) {
                    return new a(cVar.m(), cVar.getDeclaredAnnotations());
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object c(f fVar) {
                    throw new IllegalArgumentException("Cannot resolve wildcard type " + fVar + " to builder");
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public final Object d(a aVar) {
                    return aVar.w2() ? new a(((Builder) aVar.m().h0(this)).a(), net.bytebuddy.utility.a.a(Collections.emptyList(), new ArrayList(aVar.getDeclaredAnnotations()))) : new b(aVar.f5(), aVar.getOwnerType(), aVar.getDeclaredAnnotations());
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object e(a aVar) {
                    return new d(aVar.g0(), aVar.getDeclaredAnnotations());
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a extends Builder {

                /* renamed from: b, reason: collision with root package name */
                public final Generic f416361b;

                public a(Generic generic, List<? extends AnnotationDescription> list) {
                    super(list);
                    this.f416361b = generic;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public final Generic a() {
                    return new c.b(this.f416361b, new AnnotationSource.a(this.f416359a));
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f416361b.equals(((a) obj).f416361b);
                    }
                    return false;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public final int hashCode() {
                    return this.f416361b.hashCode() + (super.hashCode() * 31);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class b extends Builder {

                /* renamed from: b, reason: collision with root package name */
                public final TypeDescription f416362b;

                /* renamed from: c, reason: collision with root package name */
                @HashCodeAndEqualsPlugin.ValueHandling
                @net.bytebuddy.utility.nullability.b
                public final Generic f416363c;

                public b(TypeDescription typeDescription, @net.bytebuddy.utility.nullability.b Generic generic, List<? extends AnnotationDescription> list) {
                    super(list);
                    this.f416363c = generic;
                    this.f416362b = typeDescription;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public final Generic a() {
                    Class cls = Void.TYPE;
                    TypeDescription typeDescription = this.f416362b;
                    boolean zQ2 = typeDescription.Q2(cls);
                    List<? extends AnnotationDescription> list = this.f416359a;
                    if (zQ2 && !list.isEmpty()) {
                        throw new IllegalArgumentException("The void non-type cannot be annotated");
                    }
                    return new d.C11994d(typeDescription, this.f416363c, new AnnotationSource.a(list));
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[RETURN] */
                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean equals(@net.bytebuddy.utility.nullability.b java.lang.Object r5) {
                    /*
                        r4 = this;
                        boolean r0 = super.equals(r5)
                        r1 = 0
                        if (r0 != 0) goto L8
                        return r1
                    L8:
                        r0 = 1
                        if (r4 != r5) goto Lc
                        return r0
                    Lc:
                        if (r5 != 0) goto Lf
                        return r1
                    Lf:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L1a
                        return r1
                    L1a:
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder$b r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Builder.b) r5
                        net.bytebuddy.description.type.TypeDescription r2 = r5.f416362b
                        net.bytebuddy.description.type.TypeDescription r3 = r4.f416362b
                        boolean r2 = r3.equals(r2)
                        if (r2 != 0) goto L27
                        return r1
                    L27:
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.f416363c
                        net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.f416363c
                        if (r5 == 0) goto L36
                        if (r2 == 0) goto L38
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L39
                        return r1
                    L36:
                        if (r2 == 0) goto L39
                    L38:
                        return r1
                    L39:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.description.type.TypeDescription.Generic.Builder.b.equals(java.lang.Object):boolean");
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public final int hashCode() {
                    int iJ2 = D8.j(this.f416362b, super.hashCode() * 31, 31);
                    Generic generic = this.f416363c;
                    return generic != null ? iJ2 + generic.hashCode() : iJ2;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class c extends Builder {

                /* renamed from: b, reason: collision with root package name */
                public final TypeDescription f416364b;

                /* renamed from: c, reason: collision with root package name */
                @HashCodeAndEqualsPlugin.ValueHandling
                @net.bytebuddy.utility.nullability.b
                public final Generic f416365c;

                /* renamed from: d, reason: collision with root package name */
                public final d.f f416366d;

                public c(TypeDescription typeDescription, @net.bytebuddy.utility.nullability.b Generic generic, d.f fVar, List list) {
                    super(list);
                    this.f416364b = typeDescription;
                    this.f416365c = generic;
                    this.f416366d = fVar;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public final Generic a() {
                    AnnotationSource.a aVar = new AnnotationSource.a(this.f416359a);
                    return new OfParameterizedType.d(this.f416364b, this.f416365c, this.f416366d, aVar);
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
                
                    if (r2 != null) goto L23;
                 */
                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean equals(@net.bytebuddy.utility.nullability.b java.lang.Object r5) {
                    /*
                        r4 = this;
                        boolean r0 = super.equals(r5)
                        r1 = 0
                        if (r0 != 0) goto L8
                        return r1
                    L8:
                        r0 = 1
                        if (r4 != r5) goto Lc
                        return r0
                    Lc:
                        if (r5 != 0) goto Lf
                        return r1
                    Lf:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L1a
                        return r1
                    L1a:
                        net.bytebuddy.description.type.TypeDescription$Generic$Builder$c r5 = (net.bytebuddy.description.type.TypeDescription.Generic.Builder.c) r5
                        net.bytebuddy.description.type.TypeDescription r2 = r5.f416364b
                        net.bytebuddy.description.type.TypeDescription r3 = r4.f416364b
                        boolean r2 = r3.equals(r2)
                        if (r2 != 0) goto L27
                        return r1
                    L27:
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.f416365c
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.f416365c
                        if (r3 == 0) goto L36
                        if (r2 == 0) goto L38
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L39
                        return r1
                    L36:
                        if (r2 == 0) goto L39
                    L38:
                        return r1
                    L39:
                        net.bytebuddy.description.type.d$f r2 = r4.f416366d
                        net.bytebuddy.description.type.d$f r5 = r5.f416366d
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L44
                        return r1
                    L44:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.description.type.TypeDescription.Generic.Builder.c.equals(java.lang.Object):boolean");
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public final int hashCode() {
                    int iJ2 = D8.j(this.f416364b, super.hashCode() * 31, 31);
                    Generic generic = this.f416365c;
                    if (generic != null) {
                        iJ2 += generic.hashCode();
                    }
                    return this.f416366d.hashCode() + (iJ2 * 31);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class d extends Builder {

                /* renamed from: b, reason: collision with root package name */
                public final String f416367b;

                public d(String str, List<? extends AnnotationDescription> list) {
                    super(list);
                    this.f416367b = str;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public final Generic a() {
                    return new e.b(this.f416367b, new AnnotationSource.a(this.f416359a));
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f416367b.equals(((d) obj).f416367b);
                    }
                    return false;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Builder
                public final int hashCode() {
                    return this.f416367b.hashCode() + (super.hashCode() * 31);
                }
            }

            public Builder(List<? extends AnnotationDescription> list) {
                this.f416359a = list;
            }

            public abstract Generic a();

            public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f416359a.equals(((Builder) obj).f416359a);
                }
                return false;
            }

            public int hashCode() {
                return this.f416359a.hashCode() + (getClass().hashCode() * 31);
            }
        }

        public static abstract class OfParameterizedType extends a {

            /* renamed from: b, reason: collision with root package name */
            public transient /* synthetic */ int f416368b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static abstract class RenderingDelegate {

                /* renamed from: b, reason: collision with root package name */
                public static final RenderingDelegate f416369b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ RenderingDelegate[] f416370c;

                /* JADX INFO: Fake field, exist only in values array */
                RenderingDelegate EF2;

                public enum a extends RenderingDelegate {
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate
                    public final void a(StringBuilder sb2, TypeDescription typeDescription, @net.bytebuddy.utility.nullability.b Generic generic) {
                        if (generic == null) {
                            sb2.append(typeDescription.getName());
                            return;
                        }
                        sb2.append(generic.getTypeName());
                        sb2.append('.');
                        TypeDefinition.Sort sortO = generic.o();
                        sortO.getClass();
                        sb2.append(sortO == TypeDefinition.Sort.f416309d ? typeDescription.l0() : typeDescription.getName());
                    }
                }

                public enum b extends RenderingDelegate {
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate
                    public final void a(StringBuilder sb2, TypeDescription typeDescription, @net.bytebuddy.utility.nullability.b Generic generic) {
                        if (generic == null) {
                            sb2.append(typeDescription.getName());
                            return;
                        }
                        sb2.append(generic.getTypeName());
                        sb2.append('$');
                        TypeDefinition.Sort sortO = generic.o();
                        sortO.getClass();
                        if (sortO != TypeDefinition.Sort.f416309d) {
                            sb2.append(typeDescription.l0());
                            return;
                        }
                        sb2.append(typeDescription.getName().replace(generic.f5().getName() + "$", ""));
                    }
                }

                static {
                    RenderingDelegate aVar = new a("FOR_LEGACY_VM", 0, null);
                    RenderingDelegate bVar = new b("FOR_JAVA_8_CAPABLE_VM", 1, null);
                    f416370c = new RenderingDelegate[]{aVar, bVar};
                    f416369b = ClassFileVersion.h(ClassFileVersion.f415295g).c(ClassFileVersion.f415298j) ? bVar : aVar;
                }

                public RenderingDelegate() {
                    throw null;
                }

                public RenderingDelegate(String str, int i12, a aVar) {
                }

                public static RenderingDelegate valueOf(String str) {
                    return (RenderingDelegate) Enum.valueOf(RenderingDelegate.class, str);
                }

                public static RenderingDelegate[] values() {
                    return (RenderingDelegate[]) f416370c.clone();
                }

                public abstract void a(StringBuilder sb2, TypeDescription typeDescription, @net.bytebuddy.utility.nullability.b Generic generic);
            }

            public static class a extends OfParameterizedType {

                /* renamed from: c, reason: collision with root package name */
                public final TypeDescription f416371c;

                public a(TypeDescription typeDescription) {
                    this.f416371c = typeDescription;
                }

                public static a y0(TypeDescription typeDescription) {
                    return typeDescription.Q() ? new a(typeDescription) : new d.a(typeDescription);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final d.f J() {
                    return new d.f.C12002d(this.f416371c.r(), Visitor.AnnotationStripper.f416381b);
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDescription f5() {
                    return this.f416371c;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return new a.b();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                @net.bytebuddy.utility.nullability.b
                public final Generic getOwnerType() {
                    TypeDescription typeDescriptionN = this.f416371c.n();
                    if (typeDescriptionN == null) {
                        return null;
                    }
                    return y0(typeDescriptionN);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                public final /* bridge */ /* synthetic */ TypeDefinition m() {
                    m();
                    throw null;
                }
            }

            public static class b extends OfParameterizedType {

                /* renamed from: c, reason: collision with root package name */
                public final ParameterizedType f416372c;

                /* renamed from: d, reason: collision with root package name */
                public final AnnotationReader f416373d;

                public static class a extends d.f.a {

                    /* renamed from: b, reason: collision with root package name */
                    public final Type[] f416374b;

                    /* renamed from: c, reason: collision with root package name */
                    public final AnnotationReader f416375c;

                    public a(Type[] typeArr, AnnotationReader annotationReader) {
                        this.f416374b = typeArr;
                        this.f416375c = annotationReader;
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public final Object get(int i12) {
                        return TypeDefinition.Sort.a(this.f416374b[i12], this.f416375c.i(i12));
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public final int size() {
                        return this.f416374b.length;
                    }
                }

                public b(ParameterizedType parameterizedType, AnnotationReader annotationReader) {
                    this.f416372c = parameterizedType;
                    this.f416373d = annotationReader;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final d.f J() {
                    return new a(this.f416372c.getActualTypeArguments(), this.f416373d);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                public final boolean Q2(Class cls) {
                    return this.f416372c == cls || super.Q2(cls);
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDescription f5() {
                    return d.A0((Class) this.f416372c.getRawType());
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return this.f416373d.d();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                @net.bytebuddy.utility.nullability.b
                public final Generic getOwnerType() {
                    Type ownerType = this.f416372c.getOwnerType();
                    if (ownerType == null) {
                        return null;
                    }
                    return TypeDefinition.Sort.a(ownerType, this.f416373d.b());
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                public final /* bridge */ /* synthetic */ TypeDefinition m() {
                    m();
                    throw null;
                }
            }

            public static class c extends OfParameterizedType {

                /* renamed from: c, reason: collision with root package name */
                public final OfParameterizedType f416376c;

                public c(OfParameterizedType ofParameterizedType) {
                    this.f416376c = ofParameterizedType;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.b
                public final Generic C3() {
                    Generic genericC3 = super.C3();
                    if (genericC3 == null) {
                        return null;
                    }
                    return new b.i(genericC3, Visitor.Reifying.f416398c, genericC3);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final d.f J() {
                    return new d.f.C12002d(this.f416376c.J(), Visitor.TypeErasing.f416400b);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, net.bytebuddy.description.type.TypeDefinition
                public final d.f J0() {
                    return new d.f.C12002d.b(super.J0(), Visitor.Reifying.f416398c);
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDescription f5() {
                    return this.f416376c.f5();
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return new a.b();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                @net.bytebuddy.utility.nullability.b
                public final Generic getOwnerType() {
                    Generic ownerType = this.f416376c.getOwnerType();
                    if (ownerType == null) {
                        return null;
                    }
                    return (Generic) ownerType.h0(Visitor.Reifying.f416398c);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                public final /* bridge */ /* synthetic */ TypeDefinition m() {
                    m();
                    throw null;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                public final net.bytebuddy.description.method.b<a.e> q() {
                    return new b.f(this, super.q(), Visitor.TypeErasing.f416400b);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                public final net.bytebuddy.description.field.b<a.d> x() {
                    return new b.f(this, super.x(), Visitor.TypeErasing.f416400b);
                }
            }

            public static class d extends OfParameterizedType {

                /* renamed from: c, reason: collision with root package name */
                public final TypeDescription f416377c;

                /* renamed from: d, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.b
                public final Generic f416378d;

                /* renamed from: e, reason: collision with root package name */
                public final List<? extends Generic> f416379e;

                /* renamed from: f, reason: collision with root package name */
                public final AnnotationSource f416380f;

                public d(TypeDescription typeDescription, @net.bytebuddy.utility.nullability.b Generic generic, List<? extends Generic> list, AnnotationSource annotationSource) {
                    this.f416377c = typeDescription;
                    this.f416378d = generic;
                    this.f416379e = list;
                    this.f416380f = annotationSource;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final d.f J() {
                    return new d.f.c(this.f416379e);
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDescription f5() {
                    return this.f416377c;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return this.f416380f.getDeclaredAnnotations();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                @net.bytebuddy.utility.nullability.b
                public final Generic getOwnerType() {
                    return this.f416378d;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                public final /* bridge */ /* synthetic */ TypeDefinition m() {
                    m();
                    throw null;
                }
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean A() {
                return f5().A();
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final TypeVariableSource A3() {
                throw new IllegalStateException("A parameterized type does not imply a type variable source: " + this);
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.utility.nullability.b
            public Generic C3() {
                Generic genericC3 = f5().C3();
                if (genericC3 == null) {
                    return null;
                }
                return new b.i(genericC3, new Visitor.d.e(this), genericC3);
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public d.f J0() {
                return new d.f.C12002d.b(f5().J0(), new Visitor.d.e(this));
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
            public boolean Q2(Class cls) {
                return equals(TypeDefinition.Sort.a(cls, AnnotationReader.NoOp.f416326b));
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Generic)) {
                    return false;
                }
                Generic generic = (Generic) obj;
                TypeDefinition.Sort sortO = generic.o();
                sortO.getClass();
                if (sortO != TypeDefinition.Sort.f416309d) {
                    return false;
                }
                Generic ownerType = getOwnerType();
                Generic ownerType2 = generic.getOwnerType();
                return f5().equals(generic.f5()) && (ownerType != null || ownerType2 == null) && ((ownerType == null || ownerType.equals(ownerType2)) && J().equals(generic.J()));
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final String g0() {
                throw new IllegalStateException("A parameterized type does not imply a symbol: " + this);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final d.f getLowerBounds() {
                throw new IllegalStateException("A parameterized type does not imply lower bounds: " + this);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final d.f getUpperBounds() {
                throw new IllegalStateException("A parameterized type does not imply upper bounds: " + this);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final <T> T h0(Visitor<T> visitor) {
                return (T) visitor.a(this);
            }

            @k.c
            public final int hashCode() {
                int iHashCode;
                if (this.f416368b != 0) {
                    iHashCode = 0;
                } else {
                    Iterator<Generic> it = J().iterator();
                    int iHashCode2 = 1;
                    while (it.hasNext()) {
                        iHashCode2 = (iHashCode2 * 31) + it.next().hashCode();
                    }
                    Generic ownerType = getOwnerType();
                    iHashCode = (ownerType == null ? f5().hashCode() : ownerType.hashCode()) ^ iHashCode2;
                }
                if (iHashCode == 0) {
                    return this.f416368b;
                }
                this.f416368b = iHashCode;
                return iHashCode;
            }

            @Override // java.lang.Iterable
            public final Iterator<TypeDefinition> iterator() {
                return new TypeDefinition.a(this);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
            public /* bridge */ /* synthetic */ TypeDefinition m() {
                m();
                throw null;
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final TypeDefinition.Sort o() {
                return TypeDefinition.Sort.f416309d;
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final StackSize p() {
                return StackSize.SINGLE;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.method.b<a.e> q() {
                return new b.f(this, f5().q(), new Visitor.d.e(this));
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder();
                RenderingDelegate.f416369b.a(sb2, f5(), getOwnerType());
                d.f fVarJ = J();
                if (!fVarJ.isEmpty()) {
                    sb2.append('<');
                    boolean z12 = false;
                    for (Generic generic : fVarJ) {
                        if (z12) {
                            sb2.append(", ");
                        }
                        sb2.append(generic.getTypeName());
                        z12 = true;
                    }
                    sb2.append('>');
                }
                return sb2.toString();
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean w2() {
                return false;
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean w5() {
                return false;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.field.b<a.d> x() {
                return new b.f(this, f5().x(), new Visitor.d.e(this));
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
            public final Generic m() {
                throw new IllegalStateException("A parameterized type does not imply a component type: " + this);
            }
        }

        public static abstract class b extends a {

            /* renamed from: b, reason: collision with root package name */
            public transient /* synthetic */ int f416429b;

            public static class a extends g.a {

                /* renamed from: c, reason: collision with root package name */
                public final Field f416430c;

                /* renamed from: d, reason: collision with root package name */
                public transient /* synthetic */ a f416431d;

                public a(Field field) {
                    this.f416430c = field;
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDescription f5() {
                    return d.A0(this.f416430c.getType());
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b
                @k.c
                public final Generic y0() {
                    a aVarA = this.f416431d != null ? null : TypeDefinition.Sort.a(this.f416430c.getGenericType(), z0());
                    if (aVarA == null) {
                        return this.f416431d;
                    }
                    this.f416431d = aVarA;
                    return aVarA;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b.g.a
                public final AnnotationReader z0() {
                    return new AnnotationReader.a.d(this.f416430c);
                }
            }

            /* renamed from: net.bytebuddy.description.type.TypeDescription$Generic$b$b, reason: collision with other inner class name */
            public static class C11992b extends g.a {

                /* renamed from: c, reason: collision with root package name */
                public final Method f416432c;

                /* renamed from: d, reason: collision with root package name */
                public transient /* synthetic */ a f416433d;

                public C11992b(Method method) {
                    this.f416432c = method;
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDescription f5() {
                    return d.A0(this.f416432c.getReturnType());
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b
                @k.c
                public final Generic y0() {
                    a aVarA = this.f416433d != null ? null : TypeDefinition.Sort.a(this.f416432c.getGenericReturnType(), z0());
                    if (aVarA == null) {
                        return this.f416433d;
                    }
                    this.f416433d = aVarA;
                    return aVarA;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b.g.a
                public final AnnotationReader z0() {
                    return new AnnotationReader.a.f(this.f416432c);
                }
            }

            public static class c extends h.d {

                /* renamed from: c, reason: collision with root package name */
                public final Class<?> f416434c;

                /* renamed from: d, reason: collision with root package name */
                public transient /* synthetic */ a f416435d;

                public c(Class<?> cls) {
                    this.f416434c = cls;
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDescription f5() {
                    return d.A0(this.f416434c.getSuperclass());
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b
                @k.c
                public final Generic y0() {
                    a aVarA = this.f416435d != null ? null : TypeDefinition.Sort.a(this.f416434c.getGenericSuperclass(), z0());
                    if (aVarA == null) {
                        return this.f416435d;
                    }
                    this.f416435d = aVarA;
                    return aVarA;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b.h.d
                public final AnnotationReader z0() {
                    return new AnnotationReader.a.h(this.f416434c);
                }
            }

            public static class d extends g.a {

                /* renamed from: c, reason: collision with root package name */
                public final Constructor<?> f416436c;

                /* renamed from: d, reason: collision with root package name */
                public final int f416437d;

                /* renamed from: e, reason: collision with root package name */
                public final Class<?>[] f416438e;

                /* renamed from: f, reason: collision with root package name */
                public transient /* synthetic */ Generic f416439f;

                @SuppressFBWarnings(justification = "The array is not modified by class contract.", value = {"EI_EXPOSE_REP2"})
                public d(Constructor<?> constructor, int i12, Class<?>[] clsArr) {
                    this.f416436c = constructor;
                    this.f416437d = i12;
                    this.f416438e = clsArr;
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDescription f5() {
                    return d.A0(this.f416438e[this.f416437d]);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b
                @k.c
                public final Generic y0() {
                    Generic genericA;
                    if (this.f416439f != null) {
                        genericA = null;
                    } else {
                        Type[] genericParameterTypes = this.f416436c.getGenericParameterTypes();
                        Class<?>[] clsArr = this.f416438e;
                        int length = clsArr.length;
                        int length2 = genericParameterTypes.length;
                        int i12 = this.f416437d;
                        genericA = length == length2 ? TypeDefinition.Sort.a(genericParameterTypes[i12], z0()) : d.b.y0(clsArr[i12]);
                    }
                    if (genericA == null) {
                        return this.f416439f;
                    }
                    this.f416439f = genericA;
                    return genericA;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b.g.a
                public final AnnotationReader z0() {
                    return new AnnotationReader.a.c(this.f416436c, this.f416437d);
                }
            }

            public static class e extends g.a {

                /* renamed from: c, reason: collision with root package name */
                public final Method f416440c;

                /* renamed from: d, reason: collision with root package name */
                public final int f416441d;

                /* renamed from: e, reason: collision with root package name */
                public final Class<?>[] f416442e;

                /* renamed from: f, reason: collision with root package name */
                public transient /* synthetic */ Generic f416443f;

                @SuppressFBWarnings(justification = "The array is not modified by class contract.", value = {"EI_EXPOSE_REP2"})
                public e(Method method, int i12, Class<?>[] clsArr) {
                    this.f416440c = method;
                    this.f416441d = i12;
                    this.f416442e = clsArr;
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDescription f5() {
                    return d.A0(this.f416442e[this.f416441d]);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b
                @k.c
                public final Generic y0() {
                    Generic genericA;
                    if (this.f416443f != null) {
                        genericA = null;
                    } else {
                        Type[] genericParameterTypes = this.f416440c.getGenericParameterTypes();
                        Class<?>[] clsArr = this.f416442e;
                        int length = clsArr.length;
                        int length2 = genericParameterTypes.length;
                        int i12 = this.f416441d;
                        genericA = length == length2 ? TypeDefinition.Sort.a(genericParameterTypes[i12], z0()) : d.b.y0(clsArr[i12]);
                    }
                    if (genericA == null) {
                        return this.f416443f;
                    }
                    this.f416443f = genericA;
                    return genericA;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b.g.a
                public final AnnotationReader z0() {
                    return new AnnotationReader.a.c(this.f416440c, this.f416441d);
                }
            }

            public static class f extends g.a {

                /* renamed from: c, reason: collision with root package name */
                public final Object f416444c;

                /* renamed from: d, reason: collision with root package name */
                public transient /* synthetic */ a f416445d;

                public f(Object obj) {
                    this.f416444c = obj;
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDescription f5() {
                    return d.A0(b.C11999b.f416514c.getType());
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b
                @k.c
                public final Generic y0() {
                    a aVarA = this.f416445d != null ? null : TypeDefinition.Sort.a(b.C11999b.f416514c.b(), z0());
                    if (aVarA == null) {
                        return this.f416445d;
                    }
                    this.f416445d = aVarA;
                    return aVarA;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b.g.a
                public final AnnotationReader z0() {
                    return new AnnotationReader.a.g(this.f416444c);
                }
            }

            public static abstract class g extends b {

                public static abstract class a extends g {
                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                        return ((AnnotationReader.a) z0()).d();
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.b.g, net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                    @net.bytebuddy.utility.nullability.b
                    public final /* bridge */ /* synthetic */ TypeDefinition m() {
                        return m();
                    }

                    public abstract AnnotationReader z0();
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.b
                public final Generic C3() {
                    return y0().C3();
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final d.f J0() {
                    return y0().J0();
                }

                @Override // java.lang.Iterable
                public final Iterator<TypeDefinition> iterator() {
                    return y0().iterator();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.b
                public /* bridge */ /* synthetic */ TypeDefinition m() {
                    return m();
                }
            }

            public static abstract class h extends b {

                public static class a extends d.f.a {

                    /* renamed from: b, reason: collision with root package name */
                    public final h f416446b;

                    /* renamed from: c, reason: collision with root package name */
                    public final d.f f416447c;

                    public a(h hVar, d.f fVar) {
                        this.f416446b = hVar;
                        this.f416447c = fVar;
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public final Object get(int i12) {
                        return new C11993b(this.f416446b, i12, this.f416447c.get(i12));
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public final int size() {
                        return this.f416447c.size();
                    }
                }

                /* renamed from: net.bytebuddy.description.type.TypeDescription$Generic$b$h$b, reason: collision with other inner class name */
                public static class C11993b extends h {

                    /* renamed from: c, reason: collision with root package name */
                    public final h f416448c;

                    /* renamed from: d, reason: collision with root package name */
                    public final int f416449d;

                    /* renamed from: e, reason: collision with root package name */
                    public final Generic f416450e;

                    /* renamed from: f, reason: collision with root package name */
                    public transient /* synthetic */ Generic f416451f;

                    public C11993b(h hVar, int i12, Generic generic) {
                        this.f416448c = hVar;
                        this.f416449d = i12;
                        this.f416450e = generic;
                    }

                    @Override // net.bytebuddy.description.type.TypeDefinition
                    public final TypeDescription f5() {
                        return this.f416450e.f5();
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                        return y0().getDeclaredAnnotations();
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.b.h, net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                    @net.bytebuddy.utility.nullability.b
                    public final /* bridge */ /* synthetic */ TypeDefinition m() {
                        return m();
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.b
                    @k.c
                    public final Generic y0() {
                        Generic generic = this.f416451f != null ? null : this.f416448c.y0().J0().get(this.f416449d);
                        if (generic == null) {
                            return this.f416451f;
                        }
                        this.f416451f = generic;
                        return generic;
                    }
                }

                public static class c extends h {

                    /* renamed from: c, reason: collision with root package name */
                    public final h f416452c;

                    /* renamed from: d, reason: collision with root package name */
                    public transient /* synthetic */ Generic f416453d;

                    public c(h hVar) {
                        this.f416452c = hVar;
                    }

                    @Override // net.bytebuddy.description.type.TypeDefinition
                    @SuppressFBWarnings(justification = "Assuming super class for given instance.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public final TypeDescription f5() {
                        return this.f416452c.f5().C3().f5();
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                        return y0().getDeclaredAnnotations();
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.b.h, net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                    @net.bytebuddy.utility.nullability.b
                    public final /* bridge */ /* synthetic */ TypeDefinition m() {
                        return m();
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.b
                    @k.c
                    @SuppressFBWarnings(justification = "Assuming super class for given instance.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public final Generic y0() {
                        Generic genericC3 = this.f416453d != null ? null : this.f416452c.y0().C3();
                        if (genericC3 == null) {
                            return this.f416453d;
                        }
                        this.f416453d = genericC3;
                        return genericC3;
                    }
                }

                public static abstract class d extends h {
                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                        return ((AnnotationReader.a) z0()).d();
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.b.h, net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                    @net.bytebuddy.utility.nullability.b
                    public final /* bridge */ /* synthetic */ TypeDefinition m() {
                        return m();
                    }

                    public abstract AnnotationReader z0();
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.b
                public final Generic C3() {
                    if (f5().C3() == null) {
                        return null;
                    }
                    return new c(this);
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final d.f J0() {
                    return new a(this, f5().J0());
                }

                @Override // java.lang.Iterable
                public final Iterator<TypeDefinition> iterator() {
                    return new TypeDefinition.a(this);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.b
                public /* bridge */ /* synthetic */ TypeDefinition m() {
                    return m();
                }
            }

            public static class i extends g {

                /* renamed from: c, reason: collision with root package name */
                public final Generic f416454c;

                /* renamed from: d, reason: collision with root package name */
                public final Visitor<? extends Generic> f416455d;

                /* renamed from: e, reason: collision with root package name */
                public final AnnotationSource f416456e;

                /* renamed from: f, reason: collision with root package name */
                public transient /* synthetic */ Generic f416457f;

                public i() {
                    throw null;
                }

                public i(Generic generic, Visitor<? extends Generic> visitor, AnnotationSource annotationSource) {
                    this.f416454c = generic;
                    this.f416455d = visitor;
                    this.f416456e = annotationSource;
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDescription f5() {
                    return this.f416454c.f5();
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return this.f416456e.getDeclaredAnnotations();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b
                @k.c
                public final Generic y0() {
                    Generic generic = this.f416457f != null ? null : (Generic) this.f416454c.h0(this.f416455d);
                    if (generic == null) {
                        return this.f416457f;
                    }
                    this.f416457f = generic;
                    return generic;
                }
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean A() {
                return f5().A();
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final TypeVariableSource A3() {
                return y0().A3();
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final d.f J() {
                return y0().J();
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
            public final boolean Q2(Class cls) {
                return y0().Q2(cls);
            }

            @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.d
            public final String R() {
                return y0().R();
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                return this == obj || ((obj instanceof TypeDefinition) && y0().equals(obj));
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final String g0() {
                return y0().g0();
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final d.f getLowerBounds() {
                return y0().getLowerBounds();
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            @net.bytebuddy.utility.nullability.b
            public final Generic getOwnerType() {
                return y0().getOwnerType();
            }

            @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.type.TypeDefinition
            public final String getTypeName() {
                return y0().getTypeName();
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final d.f getUpperBounds() {
                return y0().getUpperBounds();
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final <T> T h0(Visitor<T> visitor) {
                return (T) y0().h0(visitor);
            }

            @k.c
            public final int hashCode() {
                int iHashCode = this.f416429b != 0 ? 0 : y0().hashCode();
                if (iHashCode == 0) {
                    return this.f416429b;
                }
                this.f416429b = iHashCode;
                return iHashCode;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.utility.nullability.b
            public final Generic m() {
                return y0().m();
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final TypeDefinition.Sort o() {
                return y0().o();
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final StackSize p() {
                return f5().p();
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public final net.bytebuddy.description.method.b<a.e> q() {
                return y0().q();
            }

            public final String toString() {
                return y0().toString();
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean w2() {
                return f5().w2();
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean w5() {
                return f5().w5();
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public final net.bytebuddy.description.field.b<a.d> x() {
                return y0().x();
            }

            public abstract Generic y0();
        }

        public static abstract class c extends a {

            /* renamed from: b, reason: collision with root package name */
            public transient /* synthetic */ int f416458b;

            public static class a extends c {

                /* renamed from: c, reason: collision with root package name */
                public final GenericArrayType f416459c;

                /* renamed from: d, reason: collision with root package name */
                public final AnnotationReader f416460d;

                public a(GenericArrayType genericArrayType, AnnotationReader annotationReader) {
                    this.f416459c = genericArrayType;
                    this.f416460d = annotationReader;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                public final boolean Q2(Class cls) {
                    return this.f416459c == cls || super.Q2(cls);
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return this.f416460d.d();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.b
                public final Generic m() {
                    return TypeDefinition.Sort.a(this.f416459c.getGenericComponentType(), this.f416460d.h());
                }
            }

            public static class b extends c {

                /* renamed from: c, reason: collision with root package name */
                public final Generic f416461c;

                /* renamed from: d, reason: collision with root package name */
                public final AnnotationSource f416462d;

                public b(Generic generic, AnnotationSource annotationSource) {
                    this.f416461c = generic;
                    this.f416462d = annotationSource;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return this.f416462d.getDeclaredAnnotations();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                public final TypeDefinition m() {
                    return this.f416461c;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                public final Generic m() {
                    return this.f416461c;
                }
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean A() {
                return false;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final TypeVariableSource A3() {
                throw new IllegalStateException("A generic array type does not imply a type variable source: " + this);
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.utility.nullability.b
            public final Generic C3() {
                return Generic.f416323x2;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final d.f J() {
                throw new IllegalStateException("A generic array type does not imply type arguments: " + this);
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final d.f J0() {
                return TypeDescription.f416322F2;
            }

            @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.d
            public final String R() {
                return o().b() ? f5().R() : toString();
            }

            @SuppressFBWarnings(justification = "Type check is performed by erasure implementation. Assuming component type for array type.", value = {"EQ_CHECK_FOR_OPERAND_NOT_COMPATIBLE_WITH_THIS", "NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (o().b()) {
                    return f5().equals(obj);
                }
                if (!(obj instanceof Generic)) {
                    return false;
                }
                Generic generic = (Generic) obj;
                TypeDefinition.Sort sortO = generic.o();
                sortO.getClass();
                return sortO == TypeDefinition.Sort.f416308c && m().equals(generic.m());
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public final TypeDescription f5() {
                return c.z0(m().f5(), 1);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final String g0() {
                throw new IllegalStateException("A generic array type does not imply a symbol: " + this);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final d.f getLowerBounds() {
                throw new IllegalStateException("A generic array type does not imply lower type bounds: " + this);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            @net.bytebuddy.utility.nullability.b
            public final Generic getOwnerType() {
                return null;
            }

            @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.type.TypeDefinition
            public final String getTypeName() {
                return o().b() ? f5().getTypeName() : toString();
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final d.f getUpperBounds() {
                throw new IllegalStateException("A generic array type does not imply upper type bounds: " + this);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final <T> T h0(Visitor<T> visitor) {
                return o().b() ? (T) visitor.d(this) : (T) visitor.b(this);
            }

            @k.c
            @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public final int hashCode() {
                int iHashCode = this.f416458b != 0 ? 0 : o().b() ? f5().hashCode() : m().hashCode();
                if (iHashCode == 0) {
                    return this.f416458b;
                }
                this.f416458b = iHashCode;
                return iHashCode;
            }

            @Override // java.lang.Iterable
            public final Iterator<TypeDefinition> iterator() {
                return new TypeDefinition.a(this);
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public final TypeDefinition.Sort o() {
                return m().o().b() ? TypeDefinition.Sort.f416307b : TypeDefinition.Sort.f416308c;
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final StackSize p() {
                return StackSize.SINGLE;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public final net.bytebuddy.description.method.b<a.e> q() {
                return new b.C11978b();
            }

            @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public final String toString() {
                if (o().b()) {
                    return f5().toString();
                }
                return m().getTypeName() + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean w2() {
                return true;
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean w5() {
                return false;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public final net.bytebuddy.description.field.b<a.d> x() {
                return new b.C11973b();
            }
        }

        public static abstract class e extends a {

            /* renamed from: b, reason: collision with root package name */
            public transient /* synthetic */ int f416472b;

            public static class a extends e {

                /* renamed from: c, reason: collision with root package name */
                public final TypeVariable<?> f416473c;

                /* renamed from: d, reason: collision with root package name */
                public final AnnotationReader f416474d;

                /* renamed from: net.bytebuddy.description.type.TypeDescription$Generic$e$a$a, reason: collision with other inner class name */
                public static class C11995a extends d.f.a {

                    /* renamed from: b, reason: collision with root package name */
                    public final Type[] f416475b;

                    /* renamed from: c, reason: collision with root package name */
                    public final AnnotationReader f416476c;

                    public C11995a(Type[] typeArr, AnnotationReader annotationReader) {
                        this.f416475b = typeArr;
                        this.f416476c = annotationReader;
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public final Object get(int i12) {
                        return TypeDefinition.Sort.a(this.f416475b[i12], this.f416476c.e(i12));
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public final int size() {
                        return this.f416475b.length;
                    }
                }

                public a(TypeVariable<?> typeVariable, AnnotationReader annotationReader) {
                    this.f416473c = typeVariable;
                    this.f416474d = annotationReader;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final TypeVariableSource A3() {
                    GenericDeclaration genericDeclaration = this.f416473c.getGenericDeclaration();
                    if (genericDeclaration instanceof Class) {
                        return d.A0((Class) genericDeclaration);
                    }
                    if (genericDeclaration instanceof Method) {
                        return new a.c((Method) genericDeclaration);
                    }
                    if (genericDeclaration instanceof Constructor) {
                        return new a.b((Constructor) genericDeclaration);
                    }
                    throw new IllegalStateException("Unknown declaration: " + genericDeclaration);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.e, net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                public final boolean Q2(Class cls) {
                    return this.f416473c == cls || super.Q2(cls);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final String g0() {
                    return this.f416473c.getName();
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return this.f416474d.d();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final d.f getUpperBounds() {
                    return new C11995a(this.f416473c.getBounds(), this.f416474d);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.e, net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                public final /* bridge */ /* synthetic */ TypeDefinition m() {
                    m();
                    throw null;
                }
            }

            public static class b extends a {

                /* renamed from: b, reason: collision with root package name */
                public final String f416477b;

                /* renamed from: c, reason: collision with root package name */
                public final AnnotationSource f416478c;

                public b(String str, AnnotationSource annotationSource) {
                    this.f416477b = str;
                    this.f416478c = annotationSource;
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final boolean A() {
                    return false;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final TypeVariableSource A3() {
                    throw new IllegalStateException("A symbolic type variable does not imply a variable source: " + this);
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.b
                public final Generic C3() {
                    throw new IllegalStateException("A symbolic type variable does not imply a super type definition: " + this);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final d.f J() {
                    throw new IllegalStateException("A symbolic type variable does not imply type arguments: " + this);
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final d.f J0() {
                    throw new IllegalStateException("A symbolic type variable does not imply an interface type definition: " + this);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                public final boolean Q2(Class cls) {
                    cls.getClass();
                    return false;
                }

                @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.d
                public final String R() {
                    return this.f416477b;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Generic)) {
                        return false;
                    }
                    Generic generic = (Generic) obj;
                    if (generic.o().c()) {
                        if (this.f416477b.equals(generic.g0())) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDescription f5() {
                    throw new IllegalStateException("A symbolic type variable does not imply an erasure: " + this);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final String g0() {
                    return this.f416477b;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return this.f416478c.getDeclaredAnnotations();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final d.f getLowerBounds() {
                    throw new IllegalStateException("A symbolic type variable does not imply lower bounds: " + this);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final Generic getOwnerType() {
                    throw new IllegalStateException("A symbolic type variable does not imply an owner type: " + this);
                }

                @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.type.TypeDefinition
                public final String getTypeName() {
                    return this.f416477b;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final d.f getUpperBounds() {
                    throw new IllegalStateException("A symbolic type variable does not imply an upper type bound: " + this);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final <T> T h0(Visitor<T> visitor) {
                    return (T) visitor.e(this);
                }

                public final int hashCode() {
                    return this.f416477b.hashCode();
                }

                @Override // java.lang.Iterable
                public final Iterator<TypeDefinition> iterator() {
                    throw new IllegalStateException("A symbolic type variable does not imply a super type definition: " + this);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                public final /* bridge */ /* synthetic */ TypeDefinition m() {
                    m();
                    throw null;
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDefinition.Sort o() {
                    return TypeDefinition.Sort.f416312g;
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final StackSize p() {
                    return StackSize.SINGLE;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                public final net.bytebuddy.description.method.b<a.e> q() {
                    throw new IllegalStateException("A symbolic type variable does not imply method definitions: " + this);
                }

                public final String toString() {
                    return this.f416477b;
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final boolean w2() {
                    return false;
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final boolean w5() {
                    return false;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                public final net.bytebuddy.description.field.b<a.d> x() {
                    throw new IllegalStateException("A symbolic type variable does not imply field definitions: " + this);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                public final Generic m() {
                    throw new IllegalStateException("A symbolic type variable does not imply a component type: " + this);
                }
            }

            public static class c extends e {

                /* renamed from: c, reason: collision with root package name */
                public final Generic f416479c;

                /* renamed from: d, reason: collision with root package name */
                public final Generic f416480d;

                public c(Generic generic, Generic generic2) {
                    this.f416479c = generic;
                    this.f416480d = generic2;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final TypeVariableSource A3() {
                    return this.f416479c.A3();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final String g0() {
                    return this.f416479c.g0();
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return this.f416480d.getDeclaredAnnotations();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final d.f getUpperBounds() {
                    return this.f416479c.getUpperBounds();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.e, net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                public final /* bridge */ /* synthetic */ TypeDefinition m() {
                    m();
                    throw null;
                }
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean A() {
                return false;
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.utility.nullability.b
            public final Generic C3() {
                throw new IllegalStateException("A type variable does not imply a super type definition: " + this);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final d.f J() {
                throw new IllegalStateException("A type variable does not imply type arguments: " + this);
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final d.f J0() {
                throw new IllegalStateException("A type variable does not imply an interface type definition: " + this);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
            public boolean Q2(Class cls) {
                return equals(TypeDefinition.Sort.a(cls, AnnotationReader.NoOp.f416326b));
            }

            @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.d
            public final String R() {
                return g0();
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Generic)) {
                    return false;
                }
                Generic generic = (Generic) obj;
                return generic.o().c() && g0().equals(generic.g0()) && A3().equals(generic.A3());
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final TypeDescription f5() {
                d.f upperBounds = getUpperBounds();
                return upperBounds.isEmpty() ? TypeDescription.f416317A2 : upperBounds.get(0).f5();
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final d.f getLowerBounds() {
                throw new IllegalStateException("A type variable does not imply lower bounds: " + this);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final Generic getOwnerType() {
                throw new IllegalStateException("A type variable does not imply an owner type: " + this);
            }

            @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.type.TypeDefinition
            public final String getTypeName() {
                return g0();
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final <T> T h0(Visitor<T> visitor) {
                return (T) visitor.e(this);
            }

            @k.c
            public final int hashCode() {
                int iHashCode = this.f416472b != 0 ? 0 : A3().hashCode() ^ g0().hashCode();
                if (iHashCode == 0) {
                    return this.f416472b;
                }
                this.f416472b = iHashCode;
                return iHashCode;
            }

            @Override // java.lang.Iterable
            public final Iterator<TypeDefinition> iterator() {
                throw new IllegalStateException("A type variable does not imply a super type definition: " + this);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
            public /* bridge */ /* synthetic */ TypeDefinition m() {
                m();
                throw null;
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final TypeDefinition.Sort o() {
                return TypeDefinition.Sort.f416311f;
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final StackSize p() {
                return StackSize.SINGLE;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public final net.bytebuddy.description.method.b<a.e> q() {
                throw new IllegalStateException("A type variable does not imply method definitions: " + this);
            }

            public final String toString() {
                return g0();
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean w2() {
                return false;
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean w5() {
                return false;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public final net.bytebuddy.description.field.b<a.d> x() {
                throw new IllegalStateException("A type variable does not imply field definitions: " + this);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
            public final Generic m() {
                throw new IllegalStateException("A type variable does not imply a component type: " + this);
            }
        }

        public static abstract class f extends a {

            /* renamed from: b, reason: collision with root package name */
            public transient /* synthetic */ int f416481b;

            public static class a extends f {

                /* renamed from: c, reason: collision with root package name */
                public final WildcardType f416482c;

                /* renamed from: d, reason: collision with root package name */
                public final AnnotationReader f416483d;

                /* renamed from: net.bytebuddy.description.type.TypeDescription$Generic$f$a$a, reason: collision with other inner class name */
                public static class C11996a extends d.f.a {

                    /* renamed from: b, reason: collision with root package name */
                    public final Type[] f416484b;

                    /* renamed from: c, reason: collision with root package name */
                    public final AnnotationReader f416485c;

                    public C11996a(Type[] typeArr, AnnotationReader annotationReader) {
                        this.f416484b = typeArr;
                        this.f416485c = annotationReader;
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public final Object get(int i12) {
                        return TypeDefinition.Sort.a(this.f416484b[i12], this.f416485c.f(i12));
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public final int size() {
                        return this.f416484b.length;
                    }
                }

                public static class b extends d.f.a {

                    /* renamed from: b, reason: collision with root package name */
                    public final Type[] f416486b;

                    /* renamed from: c, reason: collision with root package name */
                    public final AnnotationReader f416487c;

                    public b(Type[] typeArr, AnnotationReader annotationReader) {
                        this.f416486b = typeArr;
                        this.f416487c = annotationReader;
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public final Object get(int i12) {
                        return TypeDefinition.Sort.a(this.f416486b[i12], this.f416487c.k(i12));
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public final int size() {
                        return this.f416486b.length;
                    }
                }

                public a(WildcardType wildcardType, AnnotationReader annotationReader) {
                    this.f416482c = wildcardType;
                    this.f416483d = annotationReader;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.f, net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                public final boolean Q2(Class cls) {
                    return this.f416482c == cls || super.Q2(cls);
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return this.f416483d.d();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final d.f getLowerBounds() {
                    return new C11996a(this.f416482c.getLowerBounds(), this.f416483d);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final d.f getUpperBounds() {
                    return new b(this.f416482c.getUpperBounds(), this.f416483d);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.f, net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                public final /* bridge */ /* synthetic */ TypeDefinition m() {
                    m();
                    throw null;
                }
            }

            public static class b extends f {

                /* renamed from: c, reason: collision with root package name */
                public final d.f f416488c;

                /* renamed from: d, reason: collision with root package name */
                public final d.f f416489d;

                /* renamed from: e, reason: collision with root package name */
                public final AnnotationSource f416490e;

                public b(d.f fVar, d.f fVar2, AnnotationSource annotationSource) {
                    this.f416488c = fVar;
                    this.f416489d = fVar2;
                    this.f416490e = annotationSource;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return this.f416490e.getDeclaredAnnotations();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final d.f getLowerBounds() {
                    return new d.f.c(this.f416489d);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                public final d.f getUpperBounds() {
                    return new d.f.c(this.f416488c);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.f, net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                public final /* bridge */ /* synthetic */ TypeDefinition m() {
                    m();
                    throw null;
                }
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean A() {
                return false;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final TypeVariableSource A3() {
                throw new IllegalStateException(D8.n("A wildcard does not imply a type variable source: ", this));
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.utility.nullability.b
            public final Generic C3() {
                throw new IllegalStateException(D8.n("A wildcard does not imply a super type definition: ", this));
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final d.f J() {
                throw new IllegalStateException(D8.n("A wildcard does not imply type arguments: ", this));
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final d.f J0() {
                throw new IllegalStateException(D8.n("A wildcard does not imply an interface type definition: ", this));
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
            public boolean Q2(Class cls) {
                return equals(TypeDefinition.Sort.a(cls, AnnotationReader.NoOp.f416326b));
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Generic)) {
                    return false;
                }
                Generic generic = (Generic) obj;
                TypeDefinition.Sort sortO = generic.o();
                sortO.getClass();
                return sortO == TypeDefinition.Sort.f416310e && getUpperBounds().equals(generic.getUpperBounds()) && getLowerBounds().equals(generic.getLowerBounds());
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final TypeDescription f5() {
                throw new IllegalStateException(D8.n("A wildcard does not represent an erasable type: ", this));
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final String g0() {
                throw new IllegalStateException(D8.n("A wildcard does not imply a symbol: ", this));
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final Generic getOwnerType() {
                throw new IllegalStateException(D8.n("A wildcard does not imply an owner type: ", this));
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final <T> T h0(Visitor<T> visitor) {
                return (T) visitor.c(this);
            }

            @k.c
            public final int hashCode() {
                int i12;
                if (this.f416481b != 0) {
                    i12 = 0;
                } else {
                    Iterator<Generic> it = getLowerBounds().iterator();
                    int iHashCode = 1;
                    int iHashCode2 = 1;
                    while (it.hasNext()) {
                        iHashCode2 = (iHashCode2 * 31) + it.next().hashCode();
                    }
                    Iterator<Generic> it2 = getUpperBounds().iterator();
                    while (it2.hasNext()) {
                        iHashCode = (iHashCode * 31) + it2.next().hashCode();
                    }
                    i12 = iHashCode2 ^ iHashCode;
                }
                if (i12 == 0) {
                    return this.f416481b;
                }
                this.f416481b = i12;
                return i12;
            }

            @Override // java.lang.Iterable
            public final Iterator<TypeDefinition> iterator() {
                throw new IllegalStateException(D8.n("A wildcard does not imply a super type definition: ", this));
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
            public /* bridge */ /* synthetic */ TypeDefinition m() {
                m();
                throw null;
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final TypeDefinition.Sort o() {
                return TypeDefinition.Sort.f416310e;
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final StackSize p() {
                throw new IllegalStateException(D8.n("A wildcard does not imply an operand stack size: ", this));
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public final net.bytebuddy.description.method.b<a.e> q() {
                throw new IllegalStateException(D8.n("A wildcard does not imply method definitions: ", this));
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("?");
                d.f lowerBounds = getLowerBounds();
                if (lowerBounds.isEmpty()) {
                    lowerBounds = getUpperBounds();
                    if (lowerBounds.M2().equals(Generic.f416323x2)) {
                        return "?";
                    }
                    sb2.append(" extends ");
                } else {
                    sb2.append(" super ");
                }
                sb2.append(lowerBounds.M2().getTypeName());
                return sb2.toString();
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean w2() {
                return false;
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean w5() {
                return false;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public final net.bytebuddy.description.field.b<a.d> x() {
                throw new IllegalStateException(D8.n("A wildcard does not imply field definitions: ", this));
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
            public final Generic m() {
                throw new IllegalStateException(D8.n("A wildcard does not imply a component type: ", this));
            }
        }

        static {
            new d.b(Annotation.class);
        }

        TypeVariableSource A3();

        d.f J();

        String g0();

        d.f getLowerBounds();

        @net.bytebuddy.utility.nullability.b
        Generic getOwnerType();

        d.f getUpperBounds();

        <T> T h0(Visitor<T> visitor);

        Generic i5();

        @Override // net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.b
        Generic m();

        @Override // net.bytebuddy.description.type.TypeDefinition
        net.bytebuddy.description.method.b<a.e> q();

        @Override // net.bytebuddy.description.type.TypeDefinition
        net.bytebuddy.description.field.b<a.d> x();

        public static abstract class d extends a {

            /* renamed from: b, reason: collision with root package name */
            public transient /* synthetic */ int f416463b;

            public static class a extends d {

                /* renamed from: c, reason: collision with root package name */
                public final TypeDescription f416464c;

                public a(TypeDescription typeDescription) {
                    this.f416464c = typeDescription;
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDescription f5() {
                    return this.f416464c;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return new a.b();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                @net.bytebuddy.utility.nullability.b
                public final Generic getOwnerType() {
                    TypeDescription typeDescriptionN = this.f416464c.n();
                    if (typeDescriptionN == null) {
                        return null;
                    }
                    return typeDescriptionN.P0();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.b
                public final Generic m() {
                    TypeDescription typeDescriptionM = this.f416464c.m();
                    if (typeDescriptionM == null) {
                        return null;
                    }
                    return typeDescriptionM.P0();
                }
            }

            public static class b extends d {

                /* renamed from: e, reason: collision with root package name */
                public static final HashMap f416465e;

                /* renamed from: c, reason: collision with root package name */
                public final Class<?> f416466c;

                /* renamed from: d, reason: collision with root package name */
                public final AnnotationReader f416467d;

                static {
                    HashMap map = new HashMap();
                    f416465e = map;
                    map.put(net.bytebuddy.dynamic.c.class, new b(net.bytebuddy.dynamic.c.class));
                    map.put(Object.class, new b(Object.class));
                    map.put(String.class, new b(String.class));
                    map.put(Boolean.class, new b(Boolean.class));
                    map.put(Byte.class, new b(Byte.class));
                    map.put(Short.class, new b(Short.class));
                    map.put(Character.class, new b(Character.class));
                    map.put(Integer.class, new b(Integer.class));
                    map.put(Long.class, new b(Long.class));
                    map.put(Float.class, new b(Float.class));
                    map.put(Double.class, new b(Double.class));
                    Class cls = Void.TYPE;
                    map.put(cls, new b(cls));
                    Class cls2 = Boolean.TYPE;
                    map.put(cls2, new b(cls2));
                    Class cls3 = Byte.TYPE;
                    map.put(cls3, new b(cls3));
                    Class cls4 = Short.TYPE;
                    map.put(cls4, new b(cls4));
                    Class cls5 = Character.TYPE;
                    map.put(cls5, new b(cls5));
                    Class cls6 = Integer.TYPE;
                    map.put(cls6, new b(cls6));
                    Class cls7 = Long.TYPE;
                    map.put(cls7, new b(cls7));
                    Class cls8 = Float.TYPE;
                    map.put(cls8, new b(cls8));
                    Class cls9 = Double.TYPE;
                    map.put(cls9, new b(cls9));
                }

                public b(Class<?> cls) {
                    this(cls, AnnotationReader.NoOp.f416326b);
                }

                public static Generic y0(Class<?> cls) {
                    Generic generic = (Generic) f416465e.get(cls);
                    return generic == null ? new b(cls) : generic;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.d, net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                public final boolean Q2(Class cls) {
                    return this.f416466c == cls || super.Q2(cls);
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDescription f5() {
                    return d.A0(this.f416466c);
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return this.f416467d.d();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                @net.bytebuddy.utility.nullability.b
                public final Generic getOwnerType() {
                    Class<?> declaringClass = this.f416466c.getDeclaringClass();
                    if (declaringClass == null) {
                        return null;
                    }
                    return new b(declaringClass, this.f416467d.c());
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.b
                public final Generic m() {
                    Class<?> componentType = this.f416466c.getComponentType();
                    if (componentType == null) {
                        return null;
                    }
                    return new b(componentType, this.f416467d.h());
                }

                public b(Class<?> cls, AnnotationReader annotationReader) {
                    this.f416466c = cls;
                    this.f416467d = annotationReader;
                }
            }

            public static class c extends d {

                /* renamed from: c, reason: collision with root package name */
                public final TypeDescription f416468c;

                public c(TypeDescription typeDescription) {
                    this.f416468c = typeDescription;
                }

                public static d y0(TypeDescription typeDescription) {
                    return typeDescription.Q() ? new c(typeDescription) : new a(typeDescription);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.d, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.b
                public final Generic C3() {
                    Generic genericC3 = this.f416468c.C3();
                    if (genericC3 == null) {
                        return null;
                    }
                    return new b.i(genericC3, Visitor.Reifying.f416398c, genericC3);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.d, net.bytebuddy.description.type.TypeDefinition
                public final d.f J0() {
                    return new d.f.C12002d.b(this.f416468c.J0(), Visitor.Reifying.f416398c);
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDescription f5() {
                    return this.f416468c;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return new a.b();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                @net.bytebuddy.utility.nullability.b
                public final Generic getOwnerType() {
                    TypeDescription typeDescriptionN = this.f416468c.n();
                    if (typeDescriptionN == null) {
                        return null;
                    }
                    return y0(typeDescriptionN);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.b
                public final Generic m() {
                    TypeDescription typeDescriptionM = this.f416468c.m();
                    if (typeDescriptionM == null) {
                        return null;
                    }
                    return y0(typeDescriptionM);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.d, net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                public final net.bytebuddy.description.method.b<a.e> q() {
                    return new b.f(this, this.f416468c.q(), Visitor.TypeErasing.f416400b);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.d, net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                public final net.bytebuddy.description.field.b<a.d> x() {
                    return new b.f(this, this.f416468c.x(), Visitor.TypeErasing.f416400b);
                }
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean A() {
                return f5().A();
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final TypeVariableSource A3() {
                throw new IllegalStateException("A non-generic type does not imply a type variable source: " + this);
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.utility.nullability.b
            public Generic C3() {
                TypeDescription typeDescriptionF5 = f5();
                Generic genericC3 = typeDescriptionF5.C3();
                if (b.f416496c) {
                    return genericC3;
                }
                if (genericC3 == null) {
                    return null;
                }
                return new b.i(genericC3, new Visitor.a(typeDescriptionF5), AnnotationSource.Empty.f416052b);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final d.f J() {
                throw new IllegalStateException("A non-generic type does not imply type arguments: " + this);
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public d.f J0() {
                TypeDescription typeDescriptionF5 = f5();
                return b.f416496c ? typeDescriptionF5.J0() : new d.f.C12002d.b(typeDescriptionF5.J0(), new Visitor.a(typeDescriptionF5));
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
            public boolean Q2(Class cls) {
                return f5().Q2(cls);
            }

            @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.d
            public final String R() {
                return f5().R();
            }

            @SuppressFBWarnings(justification = "Type check is performed by erasure implementation.", value = {"EQ_CHECK_FOR_OPERAND_NOT_COMPATIBLE_WITH_THIS"})
            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                return this == obj || f5().equals(obj);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final String g0() {
                throw new IllegalStateException("A non-generic type does not imply a symbol: " + this);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final d.f getLowerBounds() {
                throw new IllegalStateException("A non-generic type does not imply lower type bounds: " + this);
            }

            @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.type.TypeDefinition
            public final String getTypeName() {
                return f5().getTypeName();
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final d.f getUpperBounds() {
                throw new IllegalStateException("A non-generic type does not imply upper type bounds: " + this);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final <T> T h0(Visitor<T> visitor) {
                return (T) visitor.d(this);
            }

            @k.c
            public final int hashCode() {
                int iHashCode = this.f416463b != 0 ? 0 : f5().hashCode();
                if (iHashCode == 0) {
                    return this.f416463b;
                }
                this.f416463b = iHashCode;
                return iHashCode;
            }

            @Override // java.lang.Iterable
            public final Iterator<TypeDefinition> iterator() {
                return new TypeDefinition.a(this);
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final TypeDefinition.Sort o() {
                return TypeDefinition.Sort.f416307b;
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final StackSize p() {
                return f5().p();
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.method.b<a.e> q() {
                TypeDescription typeDescriptionF5 = f5();
                return new b.f(this, typeDescriptionF5.q(), b.f416496c ? Visitor.NoOp.f416395b : new Visitor.a(typeDescriptionF5));
            }

            public final String toString() {
                return f5().toString();
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean w2() {
                return f5().w2();
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean w5() {
                return f5().w5();
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.field.b<a.d> x() {
                TypeDescription typeDescriptionF5 = f5();
                return new b.f(this, typeDescriptionF5.x(), b.f416496c ? Visitor.NoOp.f416395b : new Visitor.a(typeDescriptionF5));
            }

            /* renamed from: net.bytebuddy.description.type.TypeDescription$Generic$d$d, reason: collision with other inner class name */
            public static class C11994d extends d {

                /* renamed from: c, reason: collision with root package name */
                public final TypeDescription f416469c;

                /* renamed from: d, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.b
                public final Generic f416470d;

                /* renamed from: e, reason: collision with root package name */
                public final AnnotationSource f416471e;

                /* JADX WARN: Illegal instructions before constructor call */
                public C11994d(TypeDescription typeDescription, AnnotationSource annotationSource) {
                    TypeDescription typeDescriptionN = typeDescription.n();
                    this(typeDescription, typeDescriptionN == null ? null : typeDescriptionN.P0(), annotationSource);
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final TypeDescription f5() {
                    return this.f416469c;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return this.f416471e.getDeclaredAnnotations();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic
                @net.bytebuddy.utility.nullability.b
                public final Generic getOwnerType() {
                    return this.f416470d;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.b
                public final Generic m() {
                    TypeDescription typeDescriptionM = this.f416469c.m();
                    if (typeDescriptionM == null) {
                        return null;
                    }
                    return typeDescriptionM.P0();
                }

                public C11994d(TypeDescription typeDescription, @net.bytebuddy.utility.nullability.b Generic generic, AnnotationSource annotationSource) {
                    this.f416469c = typeDescription;
                    this.f416470d = generic;
                    this.f416471e = annotationSource;
                }
            }
        }

        public interface AnnotationReader {

            public static abstract class a implements AnnotationReader {

                /* renamed from: b, reason: collision with root package name */
                public static final boolean f416328b;

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$a$a, reason: collision with other inner class name */
                public static abstract class AbstractC11986a extends a {

                    /* renamed from: c, reason: collision with root package name */
                    public final a f416329c;

                    public AbstractC11986a(a aVar) {
                        this.f416329c = aVar;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public final AnnotatedElement a() {
                        return j(this.f416329c.a());
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f416329c.equals(((AbstractC11986a) obj).f416329c);
                        }
                        return false;
                    }

                    public int hashCode() {
                        return this.f416329c.hashCode() + (getClass().hashCode() * 31);
                    }

                    public abstract AnnotatedElement j(AnnotatedElement annotatedElement);
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class b extends a {

                    /* renamed from: e, reason: collision with root package name */
                    public static final InterfaceC11987a f416330e = (InterfaceC11987a) a.g(JavaDispatcher.a(InterfaceC11987a.class));

                    /* renamed from: c, reason: collision with root package name */
                    public final AccessibleObject f416331c;

                    /* renamed from: d, reason: collision with root package name */
                    public final int f416332d;

                    @JavaDispatcher.i("java.lang.reflect.Executable")
                    /* renamed from: net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$a$b$a, reason: collision with other inner class name */
                    public interface InterfaceC11987a {
                        @JavaDispatcher.i("getAnnotatedExceptionTypes")
                        @JavaDispatcher.c
                        AnnotatedElement[] a();
                    }

                    public b(AccessibleObject accessibleObject, int i12) {
                        this.f416331c = accessibleObject;
                        this.f416332d = i12;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public final AnnotatedElement a() {
                        AnnotatedElement[] annotatedElementArrA = f416330e.a();
                        return annotatedElementArrA.length == 0 ? NoOp.f416326b : annotatedElementArrA[this.f416332d];
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        b bVar = (b) obj;
                        return this.f416332d == bVar.f416332d && this.f416331c.equals(bVar.f416331c);
                    }

                    public final int hashCode() {
                        return ((this.f416331c.hashCode() + (getClass().hashCode() * 31)) * 31) + this.f416332d;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class c extends a {

                    /* renamed from: e, reason: collision with root package name */
                    public static final InterfaceC11988a f416333e = (InterfaceC11988a) a.g(JavaDispatcher.a(InterfaceC11988a.class));

                    /* renamed from: c, reason: collision with root package name */
                    public final Executable f416334c;

                    /* renamed from: d, reason: collision with root package name */
                    public final int f416335d;

                    @JavaDispatcher.i("java.lang.reflect.Executable")
                    /* renamed from: net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$a$c$a, reason: collision with other inner class name */
                    public interface InterfaceC11988a {
                        @JavaDispatcher.i("getAnnotatedParameterTypes")
                        @JavaDispatcher.c
                        AnnotatedElement[] a();
                    }

                    public c(Executable executable, int i12) {
                        this.f416334c = executable;
                        this.f416335d = i12;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public final AnnotatedElement a() {
                        AnnotatedElement[] annotatedElementArrA = f416333e.a();
                        return annotatedElementArrA.length == 0 ? NoOp.f416326b : annotatedElementArrA[this.f416335d];
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        c cVar = (c) obj;
                        return this.f416335d == cVar.f416335d && this.f416334c.equals(cVar.f416334c);
                    }

                    public final int hashCode() {
                        return ((this.f416334c.hashCode() + (getClass().hashCode() * 31)) * 31) + this.f416335d;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class d extends a {

                    /* renamed from: d, reason: collision with root package name */
                    public static final InterfaceC11989a f416336d = (InterfaceC11989a) a.g(JavaDispatcher.a(InterfaceC11989a.class));

                    /* renamed from: c, reason: collision with root package name */
                    public final Field f416337c;

                    @JavaDispatcher.i("java.lang.reflect.Field")
                    /* renamed from: net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$a$d$a, reason: collision with other inner class name */
                    public interface InterfaceC11989a {
                        @JavaDispatcher.i("getAnnotatedType")
                        @JavaDispatcher.c
                        @net.bytebuddy.utility.nullability.b
                        AnnotatedElement a();
                    }

                    public d(Field field) {
                        this.f416337c = field;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public final AnnotatedElement a() {
                        AnnotatedElement annotatedElementA = f416336d.a();
                        return annotatedElementA == null ? NoOp.f416326b : annotatedElementA;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f416337c.equals(((d) obj).f416337c);
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return this.f416337c.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class e extends a {

                    /* renamed from: c, reason: collision with root package name */
                    public final Class<?> f416338c;

                    /* renamed from: d, reason: collision with root package name */
                    public final int f416339d;

                    public e(Class<?> cls, int i12) {
                        this.f416338c = cls;
                        this.f416339d = i12;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public final AnnotatedElement a() {
                        AnnotatedElement[] annotatedElementArrO = d.f416501i.O();
                        return annotatedElementArrO.length == 0 ? NoOp.f416326b : annotatedElementArrO[this.f416339d];
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        e eVar = (e) obj;
                        return this.f416339d == eVar.f416339d && this.f416338c.equals(eVar.f416338c);
                    }

                    public final int hashCode() {
                        return ((this.f416338c.hashCode() + (getClass().hashCode() * 31)) * 31) + this.f416339d;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class f extends a {

                    /* renamed from: d, reason: collision with root package name */
                    public static final InterfaceC11990a f416340d = (InterfaceC11990a) a.g(JavaDispatcher.a(InterfaceC11990a.class));

                    /* renamed from: c, reason: collision with root package name */
                    public final Method f416341c;

                    @JavaDispatcher.i("java.lang.reflect.Method")
                    /* renamed from: net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$a$f$a, reason: collision with other inner class name */
                    public interface InterfaceC11990a {
                        @JavaDispatcher.i("getAnnotatedReturnType")
                        @JavaDispatcher.c
                        @net.bytebuddy.utility.nullability.b
                        AnnotatedElement a();
                    }

                    public f(Method method) {
                        this.f416341c = method;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public final AnnotatedElement a() {
                        AnnotatedElement annotatedElementA = f416340d.a();
                        return annotatedElementA == null ? NoOp.f416326b : annotatedElementA;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f416341c.equals(((f) obj).f416341c);
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return this.f416341c.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                public static class g extends a {

                    /* renamed from: c, reason: collision with root package name */
                    public final Object f416342c;

                    public g(Object obj) {
                        this.f416342c = obj;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public final AnnotatedElement a() {
                        return b.C11999b.f416514c.a();
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class h extends a {

                    /* renamed from: c, reason: collision with root package name */
                    public final Class<?> f416343c;

                    public h(Class<?> cls) {
                        this.f416343c = cls;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public final AnnotatedElement a() {
                        AnnotatedElement annotatedElementP = d.f416501i.P();
                        return annotatedElementP == null ? NoOp.f416326b : annotatedElementP;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f416343c.equals(((h) obj).f416343c);
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return this.f416343c.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class i extends a {

                    /* renamed from: c, reason: collision with root package name */
                    public final TypeVariable<?> f416344c;

                    public i(TypeVariable<?> typeVariable) {
                        this.f416344c = typeVariable;
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.AnnotatedElement, java.lang.reflect.TypeVariable<?>] */
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    @SuppressFBWarnings(justification = "Cast is required for JVMs before Java 8.", value = {"BC_VACUOUS_INSTANCEOF"})
                    public final AnnotatedElement a() {
                        ?? r02 = this.f416344c;
                        return r02 instanceof AnnotatedElement ? r02 : NoOp.f416326b;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.a, net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public final AnnotationReader e(int i12) {
                        return new e.b(this.f416344c, i12);
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f416344c.equals(((i) obj).f416344c);
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return this.f416344c.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class j extends a {

                    /* renamed from: c, reason: collision with root package name */
                    public final AnnotatedElement f416345c;

                    public j(AnnotatedElement annotatedElement) {
                        this.f416345c = annotatedElement;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public final AnnotatedElement a() {
                        return this.f416345c;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f416345c.equals(((j) obj).f416345c);
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return this.f416345c.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                static {
                    boolean z12 = false;
                    try {
                        Class.forName("java.security.AccessController", false, null);
                        f416328b = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
                    } catch (ClassNotFoundException unused) {
                        f416328b = z12;
                    } catch (SecurityException unused2) {
                        z12 = true;
                        f416328b = z12;
                    }
                }

                @a.b
                public static Object g(JavaDispatcher javaDispatcher) {
                    return f416328b ? AccessController.doPrivileged(javaDispatcher) : javaDispatcher.run();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public final AnnotationReader b() {
                    return new c(this);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public final AnnotationReader c() {
                    return new c(this);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public final net.bytebuddy.description.annotation.a d() {
                    return new a.d(a().getDeclaredAnnotations());
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public AnnotationReader e(int i12) {
                    return new e(this, i12);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public final AnnotationReader f(int i12) {
                    return new f(this, i12);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public final AnnotationReader h() {
                    return new b(this);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public final AnnotationReader i(int i12) {
                    return new d(this, i12);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public final AnnotationReader k(int i12) {
                    return new g(this, i12);
                }
            }

            public static class b extends a.AbstractC11986a {

                /* renamed from: d, reason: collision with root package name */
                public static final a f416346d = (a) a.g(JavaDispatcher.a(a.class));

                @JavaDispatcher.i("java.lang.reflect.AnnotatedArrayType")
                public interface a {
                    @JavaDispatcher.e
                    @JavaDispatcher.i("isInstance")
                    boolean a();

                    @JavaDispatcher.i("getAnnotatedGenericComponentType")
                    AnnotatedElement b();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.a.AbstractC11986a
                public final AnnotatedElement j(AnnotatedElement annotatedElement) {
                    a aVar = f416346d;
                    boolean zA2 = aVar.a();
                    NoOp noOp = NoOp.f416326b;
                    if (!zA2) {
                        return noOp;
                    }
                    try {
                        return aVar.b();
                    } catch (ClassCastException unused) {
                        return noOp;
                    }
                }
            }

            public static class c extends a.AbstractC11986a {

                /* renamed from: d, reason: collision with root package name */
                public static final a f416347d = (a) a.g(JavaDispatcher.a(a.class));

                @JavaDispatcher.i("java.lang.reflect.AnnotatedType")
                public interface a {
                    @JavaDispatcher.i("getAnnotatedOwnerType")
                    @JavaDispatcher.c
                    @net.bytebuddy.utility.nullability.b
                    AnnotatedElement a();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.a.AbstractC11986a
                public final AnnotatedElement j(AnnotatedElement annotatedElement) {
                    NoOp noOp = NoOp.f416326b;
                    try {
                        AnnotatedElement annotatedElementA = f416347d.a();
                        return annotatedElementA == null ? noOp : annotatedElementA;
                    } catch (ClassCastException unused) {
                        return noOp;
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class d extends a.AbstractC11986a {

                /* renamed from: e, reason: collision with root package name */
                public static final a f416348e = (a) a.g(JavaDispatcher.a(a.class));

                /* renamed from: d, reason: collision with root package name */
                public final int f416349d;

                @JavaDispatcher.i("java.lang.reflect.AnnotatedParameterizedType")
                public interface a {
                    @JavaDispatcher.e
                    @JavaDispatcher.i("isInstance")
                    boolean a();

                    @JavaDispatcher.i("getAnnotatedActualTypeArguments")
                    AnnotatedElement[] b();
                }

                public d(a aVar, int i12) {
                    super(aVar);
                    this.f416349d = i12;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.a.AbstractC11986a
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f416349d == ((d) obj).f416349d;
                    }
                    return false;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.a.AbstractC11986a
                public final int hashCode() {
                    return (super.hashCode() * 31) + this.f416349d;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.a.AbstractC11986a
                public final AnnotatedElement j(AnnotatedElement annotatedElement) {
                    a aVar = f416348e;
                    boolean zA2 = aVar.a();
                    NoOp noOp = NoOp.f416326b;
                    if (!zA2) {
                        return noOp;
                    }
                    try {
                        return aVar.b()[this.f416349d];
                    } catch (ClassCastException unused) {
                        return noOp;
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class e extends a.AbstractC11986a {

                /* renamed from: e, reason: collision with root package name */
                public static final a f416350e = (a) a.g(JavaDispatcher.a(a.class));

                /* renamed from: d, reason: collision with root package name */
                public final int f416351d;

                @JavaDispatcher.i("java.lang.reflect.AnnotatedTypeVariable")
                public interface a {
                    @JavaDispatcher.e
                    @JavaDispatcher.i("isInstance")
                    boolean a();

                    @JavaDispatcher.i("getAnnotatedBounds")
                    AnnotatedElement[] b();
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class b extends a {

                    /* renamed from: e, reason: collision with root package name */
                    public static final a f416352e = (a) a.g(JavaDispatcher.a(a.class));

                    /* renamed from: c, reason: collision with root package name */
                    public final TypeVariable<?> f416353c;

                    /* renamed from: d, reason: collision with root package name */
                    public final int f416354d;

                    @JavaDispatcher.i("java.lang.reflect.TypeVariable")
                    public interface a {
                        @JavaDispatcher.i("getAnnotatedBounds")
                        @JavaDispatcher.c
                        AnnotatedElement[] b();
                    }

                    public b(TypeVariable<?> typeVariable, int i12) {
                        this.f416353c = typeVariable;
                        this.f416354d = i12;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public final AnnotatedElement a() {
                        NoOp noOp = NoOp.f416326b;
                        try {
                            AnnotatedElement[] annotatedElementArrB = f416352e.b();
                            return annotatedElementArrB.length == 0 ? noOp : annotatedElementArrB[this.f416354d];
                        } catch (ClassCastException unused) {
                            return noOp;
                        }
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        b bVar = (b) obj;
                        return this.f416354d == bVar.f416354d && this.f416353c.equals(bVar.f416353c);
                    }

                    public final int hashCode() {
                        return ((this.f416353c.hashCode() + (getClass().hashCode() * 31)) * 31) + this.f416354d;
                    }
                }

                public e(a aVar, int i12) {
                    super(aVar);
                    this.f416351d = i12;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.a.AbstractC11986a
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f416351d == ((e) obj).f416351d;
                    }
                    return false;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.a.AbstractC11986a
                public final int hashCode() {
                    return (super.hashCode() * 31) + this.f416351d;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.a.AbstractC11986a
                public final AnnotatedElement j(AnnotatedElement annotatedElement) {
                    a aVar = f416350e;
                    boolean zA2 = aVar.a();
                    NoOp noOp = NoOp.f416326b;
                    if (!zA2) {
                        return noOp;
                    }
                    try {
                        return aVar.b()[this.f416351d];
                    } catch (ClassCastException unused) {
                        return noOp;
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class f extends a.AbstractC11986a {

                /* renamed from: e, reason: collision with root package name */
                public static final a f416355e = (a) a.g(JavaDispatcher.a(a.class));

                /* renamed from: d, reason: collision with root package name */
                public final int f416356d;

                @JavaDispatcher.i("java.lang.reflect.AnnotatedWildcardType")
                public interface a {
                    @JavaDispatcher.e
                    @JavaDispatcher.i("isInstance")
                    boolean a();

                    @JavaDispatcher.i("getAnnotatedLowerBounds")
                    AnnotatedElement[] b();
                }

                public f(a aVar, int i12) {
                    super(aVar);
                    this.f416356d = i12;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.a.AbstractC11986a
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f416356d == ((f) obj).f416356d;
                    }
                    return false;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.a.AbstractC11986a
                public final int hashCode() {
                    return (super.hashCode() * 31) + this.f416356d;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.a.AbstractC11986a
                public final AnnotatedElement j(AnnotatedElement annotatedElement) {
                    a aVar = f416355e;
                    boolean zA2 = aVar.a();
                    NoOp noOp = NoOp.f416326b;
                    if (!zA2) {
                        return noOp;
                    }
                    try {
                        return aVar.b()[this.f416356d];
                    } catch (ClassCastException unused) {
                        return noOp;
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class g extends a.AbstractC11986a {

                /* renamed from: e, reason: collision with root package name */
                public static final a f416357e = (a) a.g(JavaDispatcher.a(a.class));

                /* renamed from: d, reason: collision with root package name */
                public final int f416358d;

                @JavaDispatcher.i("java.lang.reflect.AnnotatedWildcardType")
                public interface a {
                    @JavaDispatcher.e
                    @JavaDispatcher.i("isInstance")
                    boolean a();

                    @JavaDispatcher.i("getAnnotatedUpperBounds")
                    AnnotatedElement[] b();
                }

                public g(a aVar, int i12) {
                    super(aVar);
                    this.f416358d = i12;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.a.AbstractC11986a
                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f416358d == ((g) obj).f416358d;
                    }
                    return false;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.a.AbstractC11986a
                public final int hashCode() {
                    return (super.hashCode() * 31) + this.f416358d;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.a.AbstractC11986a
                public final AnnotatedElement j(AnnotatedElement annotatedElement) {
                    a aVar = f416357e;
                    boolean zA2 = aVar.a();
                    NoOp noOp = NoOp.f416326b;
                    if (!zA2) {
                        return noOp;
                    }
                    try {
                        AnnotatedElement[] annotatedElementArrB = aVar.b();
                        return annotatedElementArrB.length == 0 ? noOp : annotatedElementArrB[this.f416358d];
                    } catch (ClassCastException unused) {
                        return noOp;
                    }
                }
            }

            AnnotatedElement a();

            AnnotationReader b();

            AnnotationReader c();

            net.bytebuddy.description.annotation.a d();

            AnnotationReader e(int i12);

            AnnotationReader f(int i12);

            AnnotationReader h();

            AnnotationReader i(int i12);

            AnnotationReader k(int i12);

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class NoOp implements AnnotationReader, AnnotatedElement {

                /* renamed from: b, reason: collision with root package name */
                public static final NoOp f416326b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ NoOp[] f416327c;

                static {
                    NoOp noOp = new NoOp("INSTANCE", 0);
                    f416326b = noOp;
                    f416327c = new NoOp[]{noOp};
                }

                public NoOp() {
                    throw null;
                }

                public static NoOp valueOf(String str) {
                    return (NoOp) Enum.valueOf(NoOp.class, str);
                }

                public static NoOp[] values() {
                    return (NoOp[]) f416327c.clone();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public final net.bytebuddy.description.annotation.a d() {
                    return new a.b();
                }

                @Override // java.lang.reflect.AnnotatedElement
                public final <T extends Annotation> T getAnnotation(Class<T> cls) {
                    throw new IllegalStateException("Cannot resolve annotations for no-op reader: " + this);
                }

                @Override // java.lang.reflect.AnnotatedElement
                public final Annotation[] getAnnotations() {
                    throw new IllegalStateException("Cannot resolve annotations for no-op reader: " + this);
                }

                @Override // java.lang.reflect.AnnotatedElement
                public final Annotation[] getDeclaredAnnotations() {
                    return new Annotation[0];
                }

                @Override // java.lang.reflect.AnnotatedElement
                public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
                    throw new IllegalStateException("Cannot resolve annotations for no-op reader: " + this);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public final AnnotatedElement a() {
                    return this;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public final AnnotationReader b() {
                    return this;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public final AnnotationReader c() {
                    return this;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public final AnnotationReader h() {
                    return this;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public final AnnotationReader e(int i12) {
                    return this;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public final AnnotationReader f(int i12) {
                    return this;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public final AnnotationReader i(int i12) {
                    return this;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public final AnnotationReader k(int i12) {
                    return this;
                }
            }
        }

        public static abstract class a extends c.a implements Generic {
            public boolean Q2(Class cls) {
                return equals(TypeDefinition.Sort.a(cls, AnnotationReader.NoOp.f416326b));
            }

            @Override // net.bytebuddy.description.c
            public final int getModifiers() {
                return f5().getModifiers();
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic
            public final Generic i5() {
                return f5().P0();
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final Generic P0() {
                return this;
            }
        }

        public interface Visitor<T> {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class AnnotationStripper implements Visitor<Generic> {

                /* renamed from: b, reason: collision with root package name */
                public static final AnnotationStripper f416381b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ AnnotationStripper[] f416382c;

                public static class a extends e {

                    /* renamed from: c, reason: collision with root package name */
                    public final a f416383c;

                    public a(a aVar) {
                        this.f416383c = aVar;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic
                    public final TypeVariableSource A3() {
                        return this.f416383c.A3();
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic
                    public final String g0() {
                        return this.f416383c.g0();
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                        return new a.b();
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic
                    public final d.f getUpperBounds() {
                        return this.f416383c.getUpperBounds();
                    }
                }

                static {
                    AnnotationStripper annotationStripper = new AnnotationStripper("INSTANCE", 0);
                    f416381b = annotationStripper;
                    f416382c = new AnnotationStripper[]{annotationStripper};
                }

                public AnnotationStripper() {
                    throw null;
                }

                public static AnnotationStripper valueOf(String str) {
                    return (AnnotationStripper) Enum.valueOf(AnnotationStripper.class, str);
                }

                public static AnnotationStripper[] values() {
                    return (AnnotationStripper[]) f416382c.clone();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object a(OfParameterizedType ofParameterizedType) {
                    Generic generic;
                    Generic ownerType = ofParameterizedType.getOwnerType();
                    TypeDescription typeDescriptionF5 = ofParameterizedType.f5();
                    if (ownerType == null) {
                        d.b bVar = Generic.f416323x2;
                        generic = null;
                    } else {
                        generic = (Generic) ownerType.h0(this);
                    }
                    return new OfParameterizedType.d(typeDescriptionF5, generic, ofParameterizedType.J().h0(this), AnnotationSource.Empty.f416052b);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public final Object b(c cVar) {
                    return new c.b((Generic) cVar.m().h0(this), AnnotationSource.Empty.f416052b);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object c(f fVar) {
                    return new f.b(fVar.getUpperBounds().h0(this), fVar.getLowerBounds().h0(this), AnnotationSource.Empty.f416052b);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object e(a aVar) {
                    return new a(aVar);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public final Generic d(Generic generic) {
                    boolean zW2 = generic.w2();
                    AnnotationSource.Empty empty = AnnotationSource.Empty.f416052b;
                    return zW2 ? new c.b(d(generic.m()), empty) : new d.C11994d(generic.f5(), empty);
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Assigner implements Visitor<Dispatcher> {

                /* renamed from: b, reason: collision with root package name */
                public static final Assigner f416384b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ Assigner[] f416385c;

                public interface Dispatcher {

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class ForParameterizedType extends a {

                        /* renamed from: b, reason: collision with root package name */
                        public final OfParameterizedType f416386b;

                        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                        public static final class ParameterAssigner implements Visitor<Dispatcher> {

                            /* renamed from: b, reason: collision with root package name */
                            public static final ParameterAssigner f416387b;

                            /* renamed from: c, reason: collision with root package name */
                            public static final /* synthetic */ ParameterAssigner[] f416388c;

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class a implements Dispatcher {

                                /* renamed from: b, reason: collision with root package name */
                                public final Generic f416389b;

                                public a(Generic generic) {
                                    this.f416389b = generic;
                                }

                                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj != null && getClass() == obj.getClass()) {
                                        return this.f416389b.equals(((a) obj).f416389b);
                                    }
                                    return false;
                                }

                                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher
                                public final boolean f(Generic generic) {
                                    TypeDefinition.Sort sortO = generic.o();
                                    sortO.getClass();
                                    TypeDefinition.Sort sort = TypeDefinition.Sort.f416310e;
                                    boolean z12 = sortO == sort;
                                    Assigner assigner = Assigner.f416384b;
                                    Generic generic2 = this.f416389b;
                                    if (z12) {
                                        d.f lowerBounds = generic.getLowerBounds();
                                        return !lowerBounds.isEmpty() && ((Dispatcher) lowerBounds.M2().h0(assigner)).f(generic2);
                                    }
                                    TypeDefinition.Sort sortO2 = generic.o();
                                    sortO2.getClass();
                                    return sortO2 == sort || ((Dispatcher) generic.h0(assigner)).f(generic2);
                                }

                                public final int hashCode() {
                                    return this.f416389b.hashCode() + (getClass().hashCode() * 31);
                                }
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class b implements Dispatcher {

                                /* renamed from: b, reason: collision with root package name */
                                public final Generic f416390b;

                                public b(Generic generic) {
                                    this.f416390b = generic;
                                }

                                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj != null && getClass() == obj.getClass()) {
                                        return this.f416390b.equals(((b) obj).f416390b);
                                    }
                                    return false;
                                }

                                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher
                                public final boolean f(Generic generic) {
                                    TypeDefinition.Sort sortO = generic.o();
                                    sortO.getClass();
                                    boolean z12 = sortO == TypeDefinition.Sort.f416310e;
                                    Assigner assigner = Assigner.f416384b;
                                    Generic generic2 = this.f416390b;
                                    return z12 ? generic.getLowerBounds().isEmpty() && ((Dispatcher) generic2.h0(assigner)).f(generic.getUpperBounds().M2()) : ((Dispatcher) generic2.h0(assigner)).f(generic);
                                }

                                public final int hashCode() {
                                    return this.f416390b.hashCode() + (getClass().hashCode() * 31);
                                }
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            public static class c implements Dispatcher {

                                /* renamed from: b, reason: collision with root package name */
                                public final a f416391b;

                                public c(a aVar) {
                                    this.f416391b = aVar;
                                }

                                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj != null && getClass() == obj.getClass()) {
                                        return this.f416391b.equals(((c) obj).f416391b);
                                    }
                                    return false;
                                }

                                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher
                                public final boolean f(Generic generic) {
                                    return generic.equals(this.f416391b);
                                }

                                public final int hashCode() {
                                    return this.f416391b.hashCode() + (getClass().hashCode() * 31);
                                }
                            }

                            static {
                                ParameterAssigner parameterAssigner = new ParameterAssigner("INSTANCE", 0);
                                f416387b = parameterAssigner;
                                f416388c = new ParameterAssigner[]{parameterAssigner};
                            }

                            public ParameterAssigner() {
                                throw null;
                            }

                            public static ParameterAssigner valueOf(String str) {
                                return (ParameterAssigner) Enum.valueOf(ParameterAssigner.class, str);
                            }

                            public static ParameterAssigner[] values() {
                                return (ParameterAssigner[]) f416388c.clone();
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            public final Object a(OfParameterizedType ofParameterizedType) {
                                return new c(ofParameterizedType);
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            public final Object b(c cVar) {
                                return new c(cVar);
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            public final Object c(f fVar) {
                                d.f lowerBounds = fVar.getLowerBounds();
                                return lowerBounds.isEmpty() ? new b(fVar.getUpperBounds().M2()) : new a(lowerBounds.M2());
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            public final Object d(a aVar) {
                                return new c(aVar);
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            public final Object e(a aVar) {
                                return new c(aVar);
                            }
                        }

                        public ForParameterizedType(OfParameterizedType ofParameterizedType) {
                            this.f416386b = ofParameterizedType;
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public final Object a(OfParameterizedType ofParameterizedType) {
                            OfParameterizedType ofParameterizedType2 = this.f416386b;
                            if (!ofParameterizedType2.f5().equals(ofParameterizedType.f5())) {
                                Generic genericC3 = ofParameterizedType.C3();
                                if (genericC3 != null && ((Boolean) genericC3.h0(this)).booleanValue()) {
                                    return Boolean.TRUE;
                                }
                                Iterator<Generic> it = ofParameterizedType.J0().iterator();
                                while (it.hasNext()) {
                                    if (f(it.next())) {
                                        return Boolean.TRUE;
                                    }
                                }
                                return Boolean.FALSE;
                            }
                            Generic ownerType = ofParameterizedType2.getOwnerType();
                            Generic ownerType2 = ofParameterizedType.getOwnerType();
                            if (ownerType != null && ownerType2 != null && !((Dispatcher) ownerType.h0(Assigner.f416384b)).f(ownerType2)) {
                                return Boolean.FALSE;
                            }
                            d.f fVarJ = ofParameterizedType2.J();
                            d.f fVarJ2 = ofParameterizedType.J();
                            if (fVarJ.size() != fVarJ2.size()) {
                                throw new IllegalArgumentException("Incompatible generic types: " + ofParameterizedType + " and " + ofParameterizedType2);
                            }
                            for (int i12 = 0; i12 < fVarJ.size(); i12++) {
                                if (!((Dispatcher) fVarJ.get(i12).h0(ParameterAssigner.f416387b)).f(fVarJ2.get(i12))) {
                                    return Boolean.FALSE;
                                }
                            }
                            return Boolean.TRUE;
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public final /* bridge */ /* synthetic */ Object b(c cVar) {
                            return Boolean.FALSE;
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public final Object c(f fVar) {
                            throw new IllegalArgumentException(D8.n("A wildcard is not a first-level type: ", fVar));
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public final Object d(a aVar) {
                            if (this.f416386b.f5().equals(aVar.f5())) {
                                return Boolean.TRUE;
                            }
                            Generic genericC3 = aVar.C3();
                            if (genericC3 != null && ((Boolean) genericC3.h0(this)).booleanValue()) {
                                return Boolean.TRUE;
                            }
                            Iterator<Generic> it = aVar.J0().iterator();
                            while (it.hasNext()) {
                                if (f(it.next())) {
                                    return Boolean.TRUE;
                                }
                            }
                            return Boolean.FALSE;
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public final Object e(a aVar) {
                            Iterator<Generic> it = aVar.getUpperBounds().iterator();
                            while (it.hasNext()) {
                                if (f(it.next())) {
                                    return Boolean.TRUE;
                                }
                            }
                            return Boolean.FALSE;
                        }

                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj != null && getClass() == obj.getClass()) {
                                return this.f416386b.equals(((ForParameterizedType) obj).f416386b);
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return this.f416386b.hashCode() + (getClass().hashCode() * 31);
                        }
                    }

                    public static abstract class a implements Dispatcher, Visitor<Boolean> {
                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher
                        public final boolean f(Generic generic) {
                            return ((Boolean) generic.h0(this)).booleanValue();
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class b extends a {

                        /* renamed from: b, reason: collision with root package name */
                        public final c f416392b;

                        public b(c cVar) {
                            this.f416392b = cVar;
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public final /* bridge */ /* synthetic */ Object a(OfParameterizedType ofParameterizedType) {
                            return Boolean.FALSE;
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                        public final Object b(c cVar) {
                            return Boolean.valueOf(((Dispatcher) this.f416392b.m().h0(Assigner.f416384b)).f(cVar.m()));
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public final Object c(f fVar) {
                            throw new IllegalArgumentException(D8.n("A wildcard is not a first-level type: ", fVar));
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                        public final Object d(a aVar) {
                            return Boolean.valueOf(aVar.w2() && ((Dispatcher) this.f416392b.m().h0(Assigner.f416384b)).f(aVar.m()));
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public final /* bridge */ /* synthetic */ Object e(a aVar) {
                            return Boolean.FALSE;
                        }

                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj != null && getClass() == obj.getClass()) {
                                return this.f416392b.equals(((b) obj).f416392b);
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return this.f416392b.hashCode() + (getClass().hashCode() * 31);
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class c extends a {

                        /* renamed from: b, reason: collision with root package name */
                        public final TypeDescription f416393b;

                        public c(TypeDescription typeDescription) {
                            this.f416393b = typeDescription;
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public final Object a(OfParameterizedType ofParameterizedType) {
                            TypeDescription typeDescriptionF5 = ofParameterizedType.f5();
                            TypeDescription typeDescription = this.f416393b;
                            if (typeDescription.equals(typeDescriptionF5)) {
                                return Boolean.TRUE;
                            }
                            Generic genericC3 = ofParameterizedType.C3();
                            if (genericC3 != null && ((Boolean) genericC3.h0(this)).booleanValue()) {
                                return Boolean.TRUE;
                            }
                            Iterator<Generic> it = ofParameterizedType.J0().iterator();
                            while (it.hasNext()) {
                                if (f(it.next())) {
                                    return Boolean.TRUE;
                                }
                            }
                            return Boolean.valueOf(typeDescription.Q2(Object.class));
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                        public final Object b(c cVar) {
                            TypeDescription typeDescription = this.f416393b;
                            return Boolean.valueOf(typeDescription.w2() ? ((Boolean) cVar.m().h0(new c(typeDescription.m()))).booleanValue() : typeDescription.Q2(Object.class) || TypeDescription.f416322F2.contains(typeDescription.P0()));
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public final Object c(f fVar) {
                            throw new IllegalArgumentException(D8.n("A wildcard is not a first-level type: ", fVar));
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public final Object d(a aVar) {
                            return Boolean.valueOf(this.f416393b.Z5(aVar.f5()));
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public final Object e(a aVar) {
                            Iterator<Generic> it = aVar.getUpperBounds().iterator();
                            while (it.hasNext()) {
                                if (f(it.next())) {
                                    return Boolean.TRUE;
                                }
                            }
                            return Boolean.FALSE;
                        }

                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj != null && getClass() == obj.getClass()) {
                                return this.f416393b.equals(((c) obj).f416393b);
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return this.f416393b.hashCode() + (getClass().hashCode() * 31);
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class d extends a {

                        /* renamed from: b, reason: collision with root package name */
                        public final a f416394b;

                        public d(a aVar) {
                            this.f416394b = aVar;
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public final /* bridge */ /* synthetic */ Object a(OfParameterizedType ofParameterizedType) {
                            return Boolean.FALSE;
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public final /* bridge */ /* synthetic */ Object b(c cVar) {
                            return Boolean.FALSE;
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public final Object c(f fVar) {
                            throw new IllegalArgumentException(D8.n("A wildcard is not a first-level type: ", fVar));
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public final /* bridge */ /* synthetic */ Object d(a aVar) {
                            return Boolean.FALSE;
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public final Object e(a aVar) {
                            if (aVar.equals(this.f416394b)) {
                                return Boolean.TRUE;
                            }
                            Iterator<Generic> it = aVar.getUpperBounds().iterator();
                            while (it.hasNext()) {
                                if (f(it.next())) {
                                    return Boolean.TRUE;
                                }
                            }
                            return Boolean.FALSE;
                        }

                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj != null && getClass() == obj.getClass()) {
                                return this.f416394b.equals(((d) obj).f416394b);
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return this.f416394b.hashCode() + (getClass().hashCode() * 31);
                        }
                    }

                    boolean f(Generic generic);
                }

                static {
                    Assigner assigner = new Assigner("INSTANCE", 0);
                    f416384b = assigner;
                    f416385c = new Assigner[]{assigner};
                }

                public Assigner() {
                    throw null;
                }

                public static Assigner valueOf(String str) {
                    return (Assigner) Enum.valueOf(Assigner.class, str);
                }

                public static Assigner[] values() {
                    return (Assigner[]) f416385c.clone();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object a(OfParameterizedType ofParameterizedType) {
                    return new Dispatcher.ForParameterizedType(ofParameterizedType);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object b(c cVar) {
                    return new Dispatcher.b(cVar);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object c(f fVar) {
                    throw new IllegalArgumentException("A wildcard is not a first level type: " + this);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object d(a aVar) {
                    return new Dispatcher.c(aVar.f5());
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object e(a aVar) {
                    return new Dispatcher.d(aVar);
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class TypeErasing implements Visitor<Generic> {

                /* renamed from: b, reason: collision with root package name */
                public static final TypeErasing f416400b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ TypeErasing[] f416401c;

                static {
                    TypeErasing typeErasing = new TypeErasing("INSTANCE", 0);
                    f416400b = typeErasing;
                    f416401c = new TypeErasing[]{typeErasing};
                }

                public TypeErasing() {
                    throw null;
                }

                public static TypeErasing valueOf(String str) {
                    return (TypeErasing) Enum.valueOf(TypeErasing.class, str);
                }

                public static TypeErasing[] values() {
                    return (TypeErasing[]) f416401c.clone();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object a(OfParameterizedType ofParameterizedType) {
                    return ofParameterizedType.i5();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object b(c cVar) {
                    return cVar.i5();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object c(f fVar) {
                    throw new IllegalArgumentException(D8.n("Cannot erase a wildcard type: ", fVar));
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object d(a aVar) {
                    return aVar.i5();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object e(a aVar) {
                    return aVar.i5();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static class Validator implements Visitor<Boolean> {

                /* renamed from: f, reason: collision with root package name */
                public static final Validator f416402f;

                /* renamed from: g, reason: collision with root package name */
                public static final Validator f416403g;

                /* renamed from: h, reason: collision with root package name */
                public static final Validator f416404h;

                /* renamed from: i, reason: collision with root package name */
                public static final Validator f416405i;

                /* renamed from: j, reason: collision with root package name */
                public static final Validator f416406j;

                /* renamed from: k, reason: collision with root package name */
                public static final Validator f416407k;

                /* renamed from: l, reason: collision with root package name */
                public static final Validator f416408l;

                /* renamed from: m, reason: collision with root package name */
                public static final Validator f416409m;

                /* renamed from: n, reason: collision with root package name */
                public static final /* synthetic */ Validator[] f416410n;

                /* renamed from: b, reason: collision with root package name */
                public final boolean f416411b;

                /* renamed from: c, reason: collision with root package name */
                public final boolean f416412c;

                /* renamed from: d, reason: collision with root package name */
                public final boolean f416413d;

                /* renamed from: e, reason: collision with root package name */
                public final boolean f416414e;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class ForTypeAnnotations implements Visitor<Boolean> {

                    /* renamed from: b, reason: collision with root package name */
                    public static final ForTypeAnnotations f416415b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ ForTypeAnnotations[] f416416c;

                    static {
                        ForTypeAnnotations forTypeAnnotations = new ForTypeAnnotations("INSTANCE", 0);
                        f416415b = forTypeAnnotations;
                        f416416c = new ForTypeAnnotations[]{forTypeAnnotations};
                    }

                    public ForTypeAnnotations() {
                        throw null;
                    }

                    public static boolean f(a aVar) {
                        HashSet hashSet = new HashSet();
                        for (AnnotationDescription annotationDescription : aVar.getDeclaredAnnotations()) {
                            if (!annotationDescription.f("TYPE_USE") || !hashSet.add(annotationDescription.a())) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public static boolean h(Generic generic) {
                        HashSet hashSet = new HashSet();
                        for (AnnotationDescription annotationDescription : generic.getDeclaredAnnotations()) {
                            if (!annotationDescription.f("TYPE_PARAMETER") || !hashSet.add(annotationDescription.a())) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public static ForTypeAnnotations valueOf(String str) {
                        return (ForTypeAnnotations) Enum.valueOf(ForTypeAnnotations.class, str);
                    }

                    public static ForTypeAnnotations[] values() {
                        return (ForTypeAnnotations[]) f416416c.clone();
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final Object a(OfParameterizedType ofParameterizedType) {
                        if (!f(ofParameterizedType)) {
                            return Boolean.FALSE;
                        }
                        Generic ownerType = ofParameterizedType.getOwnerType();
                        if (ownerType != null && !((Boolean) ownerType.h0(this)).booleanValue()) {
                            return Boolean.FALSE;
                        }
                        Iterator<Generic> it = ofParameterizedType.J().iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next().h0(this)).booleanValue()) {
                                return Boolean.FALSE;
                            }
                        }
                        return Boolean.TRUE;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public final Object b(c cVar) {
                        return Boolean.valueOf(f(cVar) && ((Boolean) cVar.m().h0(this)).booleanValue());
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final Object c(f fVar) {
                        if (!f(fVar)) {
                            return Boolean.FALSE;
                        }
                        d.f lowerBounds = fVar.getLowerBounds();
                        if (lowerBounds.isEmpty()) {
                            lowerBounds = fVar.getUpperBounds();
                        }
                        return (Boolean) lowerBounds.M2().h0(this);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public final Object d(a aVar) {
                        return Boolean.valueOf(f(aVar) && (!aVar.w2() || ((Boolean) aVar.m().h0(this)).booleanValue()));
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final Object e(a aVar) {
                        return Boolean.valueOf(f(aVar));
                    }
                }

                public enum a extends Validator {
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final Object b(c cVar) {
                        return Boolean.valueOf(this.f416411b);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object c(f fVar) {
                        return Boolean.FALSE;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final Object e(a aVar) {
                        return Boolean.valueOf(this.f416413d);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public final Boolean d(Generic generic) {
                        return Boolean.valueOf(super.d(generic).booleanValue() && !((c.a) generic).x0(512));
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public final Boolean a(Generic generic) {
                        return Boolean.valueOf(!((c.a) generic).x0(512));
                    }
                }

                public enum b extends Validator {
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final Object a(OfParameterizedType ofParameterizedType) {
                        return Boolean.valueOf(ofParameterizedType.x0(512));
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final Object b(c cVar) {
                        return Boolean.valueOf(this.f416411b);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object c(f fVar) {
                        return Boolean.FALSE;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final Object e(a aVar) {
                        return Boolean.valueOf(this.f416413d);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* renamed from: f */
                    public final Boolean d(Generic generic) {
                        return Boolean.valueOf(super.d(generic).booleanValue() && ((c.a) generic).x0(512));
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator
                    /* renamed from: h */
                    public final Boolean a(Generic generic) {
                        return Boolean.valueOf(((c.a) generic).x0(512));
                    }
                }

                public enum c extends Validator {
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object a(OfParameterizedType ofParameterizedType) {
                        return Boolean.FALSE;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final Object b(c cVar) {
                        return Boolean.valueOf(this.f416411b);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object c(f fVar) {
                        return Boolean.FALSE;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* renamed from: f */
                    public final Boolean d(Generic generic) {
                        return Boolean.valueOf(generic.f5().e5(Throwable.class));
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator
                    /* renamed from: h */
                    public final Boolean a(Generic generic) {
                        return Boolean.FALSE;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public final Boolean e(Generic generic) {
                        Iterator<Generic> it = generic.getUpperBounds().iterator();
                        while (it.hasNext()) {
                            if (((Boolean) it.next().h0(this)).booleanValue()) {
                                return Boolean.TRUE;
                            }
                        }
                        return Boolean.FALSE;
                    }
                }

                static {
                    a aVar = new a("SUPER_CLASS", 0, false, false, false, false);
                    f416402f = aVar;
                    b bVar = new b("INTERFACE", 1, false, false, false, false);
                    f416403g = bVar;
                    Validator validator = new Validator("TYPE_VARIABLE", 2, false, false, true, false);
                    f416404h = validator;
                    Validator validator2 = new Validator("FIELD", 3, true, true, true, false);
                    f416405i = validator2;
                    Validator validator3 = new Validator("METHOD_RETURN", 4, true, true, true, true);
                    f416406j = validator3;
                    Validator validator4 = new Validator("METHOD_PARAMETER", 5, true, true, true, false);
                    f416407k = validator4;
                    c cVar = new c("EXCEPTION", 6, false, false, true, false);
                    f416408l = cVar;
                    Validator validator5 = new Validator("RECEIVER", 7, false, false, false, false);
                    f416409m = validator5;
                    f416410n = new Validator[]{aVar, bVar, validator, validator2, validator3, validator4, cVar, validator5};
                }

                public static Validator valueOf(String str) {
                    return (Validator) Enum.valueOf(Validator.class, str);
                }

                public static Validator[] values() {
                    return (Validator[]) f416410n.clone();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Object b(c cVar) {
                    return Boolean.valueOf(this.f416411b);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ Object c(f fVar) {
                    return Boolean.FALSE;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* renamed from: f */
                public Boolean d(Generic generic) {
                    return Boolean.valueOf((this.f416411b || !generic.w2()) && (this.f416412c || !generic.w5()) && (this.f416414e || !generic.Q2(Void.TYPE)));
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* renamed from: h */
                public Boolean a(Generic generic) {
                    return Boolean.TRUE;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* renamed from: i */
                public Boolean e(Generic generic) {
                    return Boolean.valueOf(this.f416413d);
                }

                public Validator(String str, int i12, boolean z12, boolean z13, boolean z14, boolean z15) {
                    this.f416411b = z12;
                    this.f416412c = z13;
                    this.f416413d = z14;
                    this.f416414e = z15;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class b implements Visitor<AbstractC26949b> {

                /* renamed from: b, reason: collision with root package name */
                public final AbstractC26949b f416418b;

                public static class a extends b {
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.b, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public final AbstractC26949b b(c cVar) {
                        AbstractC26949b abstractC26949b = this.f416418b;
                        cVar.h0(new b(abstractC26949b.o('=')));
                        return abstractC26949b;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.b, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final AbstractC26949b d(a aVar) {
                        AbstractC26949b abstractC26949b = this.f416418b;
                        aVar.h0(new b(abstractC26949b.o('=')));
                        return abstractC26949b;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.b, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public final AbstractC26949b a(OfParameterizedType ofParameterizedType) {
                        AbstractC26949b abstractC26949b = this.f416418b;
                        new b(abstractC26949b.o('=')).a(ofParameterizedType);
                        return abstractC26949b;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.b, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public final AbstractC26949b e(a aVar) {
                        AbstractC26949b abstractC26949b = this.f416418b;
                        aVar.h0(new b(abstractC26949b.o('=')));
                        return abstractC26949b;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.b, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public final AbstractC26949b c(f fVar) {
                        d.f upperBounds = fVar.getUpperBounds();
                        d.f lowerBounds = fVar.getLowerBounds();
                        boolean zIsEmpty = lowerBounds.isEmpty();
                        AbstractC26949b abstractC26949b = this.f416418b;
                        if (zIsEmpty && upperBounds.M2().Q2(Object.class)) {
                            abstractC26949b.p();
                        } else if (lowerBounds.isEmpty()) {
                            upperBounds.M2().h0(new b(abstractC26949b.o('+')));
                        } else {
                            lowerBounds.M2().h0(new b(abstractC26949b.o('-')));
                        }
                        return abstractC26949b;
                    }
                }

                public b(AbstractC26949b abstractC26949b) {
                    this.f416418b = abstractC26949b;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f416418b.equals(((b) obj).f416418b);
                    }
                    return false;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                /* renamed from: f */
                public AbstractC26949b b(c cVar) {
                    Generic genericM = cVar.m();
                    AbstractC26949b abstractC26949b = this.f416418b;
                    genericM.h0(new b(abstractC26949b.b()));
                    return abstractC26949b;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                /* renamed from: g */
                public AbstractC26949b d(a aVar) {
                    boolean zW2 = aVar.w2();
                    AbstractC26949b abstractC26949b = this.f416418b;
                    if (zW2) {
                        aVar.m().h0(new b(abstractC26949b.b()));
                    } else if (aVar.w5()) {
                        abstractC26949b.c(aVar.f5().getDescriptor().charAt(0));
                    } else {
                        abstractC26949b.e(aVar.f5().V());
                        abstractC26949b.f();
                    }
                    return abstractC26949b;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void h(net.bytebuddy.description.type.TypeDescription.Generic r5) {
                    /*
                        r4 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r5.getOwnerType()
                        c61.b r1 = r4.f416418b
                        if (r0 == 0) goto L22
                        net.bytebuddy.description.type.TypeDefinition$Sort r2 = r0.o()
                        r2.getClass()
                        net.bytebuddy.description.type.TypeDefinition$Sort r3 = net.bytebuddy.description.type.TypeDefinition.Sort.f416309d
                        if (r2 != r3) goto L22
                        r4.h(r0)
                        net.bytebuddy.description.type.TypeDescription r0 = r5.f5()
                        java.lang.String r0 = r0.l0()
                        r1.i(r0)
                        goto L2d
                    L22:
                        net.bytebuddy.description.type.TypeDescription r0 = r5.f5()
                        java.lang.String r0 = r0.V()
                        r1.e(r0)
                    L2d:
                        net.bytebuddy.description.type.d$f r5 = r5.J()
                        java.util.Iterator r5 = r5.iterator()
                    L35:
                        boolean r0 = r5.hasNext()
                        if (r0 == 0) goto L4a
                        java.lang.Object r0 = r5.next()
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                        net.bytebuddy.description.type.TypeDescription$Generic$Visitor$b$a r2 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$b$a
                        r2.<init>(r1)
                        r0.h0(r2)
                        goto L35
                    L4a:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.description.type.TypeDescription.Generic.Visitor.b.h(net.bytebuddy.description.type.TypeDescription$Generic):void");
                }

                public final int hashCode() {
                    return this.f416418b.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* renamed from: i */
                public AbstractC26949b a(OfParameterizedType ofParameterizedType) {
                    h(ofParameterizedType);
                    AbstractC26949b abstractC26949b = this.f416418b;
                    abstractC26949b.f();
                    return abstractC26949b;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* renamed from: j */
                public AbstractC26949b e(a aVar) {
                    String strG0 = aVar.g0();
                    AbstractC26949b abstractC26949b = this.f416418b;
                    abstractC26949b.q(strG0);
                    return abstractC26949b;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* renamed from: k */
                public AbstractC26949b c(f fVar) {
                    throw new IllegalStateException(D8.n("Unexpected wildcard: ", fVar));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class c implements Visitor<TypeDescription> {

                /* renamed from: b, reason: collision with root package name */
                public final TypeDescription f416419b;

                /* renamed from: c, reason: collision with root package name */
                public final List<? extends net.bytebuddy.description.type.e> f416420c;

                public c(TypeDescription typeDescription, List<? extends net.bytebuddy.description.type.e> list) {
                    this.f416419b = typeDescription;
                    this.f416420c = list;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object a(OfParameterizedType ofParameterizedType) {
                    return net.bytebuddy.dynamic.c.a(ofParameterizedType.f5(), this.f416419b);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public final Object b(c cVar) {
                    Generic genericM = cVar;
                    int i12 = 0;
                    do {
                        genericM = genericM.m();
                        i12++;
                    } while (genericM.w2());
                    boolean zC2 = genericM.o().c();
                    TypeDescription typeDescription = this.f416419b;
                    if (!zC2) {
                        return net.bytebuddy.dynamic.c.a(cVar.f5(), typeDescription);
                    }
                    for (net.bytebuddy.description.type.e eVar : this.f416420c) {
                        if (genericM.g0().equals(eVar.f416560a)) {
                            return c.z0((TypeDescription) ((Generic) new d.f.c(eVar.f416561b).get(0)).h0(this), i12);
                        }
                    }
                    return net.bytebuddy.dynamic.c.a(c.z0(typeDescription.Y(genericM.g0()).f5(), i12), typeDescription);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object c(f fVar) {
                    throw new IllegalStateException(D8.n("A wildcard cannot be a top-level type: ", fVar));
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object d(a aVar) {
                    return net.bytebuddy.dynamic.c.a(aVar.f5(), this.f416419b);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object e(a aVar) {
                    for (net.bytebuddy.description.type.e eVar : this.f416420c) {
                        if (aVar.g0().equals(eVar.f416560a)) {
                            return (TypeDescription) ((Generic) new d.f.c(eVar.f416561b).get(0)).h0(this);
                        }
                    }
                    String strG0 = aVar.g0();
                    TypeDescription typeDescription = this.f416419b;
                    return net.bytebuddy.dynamic.c.a(typeDescription.Y(strG0).f5(), typeDescription);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return this.f416419b.equals(cVar.f416419b) && this.f416420c.equals(cVar.f416420c);
                }

                public final int hashCode() {
                    return this.f416420c.hashCode() + D8.j(this.f416419b, getClass().hashCode() * 31, 31);
                }
            }

            Object a(OfParameterizedType ofParameterizedType);

            Object b(c cVar);

            Object c(f fVar);

            Object d(a aVar);

            Object e(a aVar);

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static abstract class Reifying implements Visitor<Generic> {

                /* renamed from: b, reason: collision with root package name */
                public static final Reifying f416397b;

                /* renamed from: c, reason: collision with root package name */
                public static final Reifying f416398c;

                /* renamed from: d, reason: collision with root package name */
                public static final /* synthetic */ Reifying[] f416399d;

                public enum b extends Reifying {
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final Object a(OfParameterizedType ofParameterizedType) {
                        return new OfParameterizedType.c(ofParameterizedType);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object b(c cVar) {
                        f(cVar);
                        throw null;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object c(f fVar) {
                        i(fVar);
                        throw null;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final Object d(a aVar) {
                        TypeDescription typeDescriptionF5 = aVar.f5();
                        return typeDescriptionF5.Q() ? new d.c(typeDescriptionF5) : aVar;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object e(a aVar) {
                        h(aVar);
                        throw null;
                    }
                }

                static {
                    a aVar = new a("INITIATING", 0, null);
                    f416397b = aVar;
                    b bVar = new b("INHERITING", 1, null);
                    f416398c = bVar;
                    f416399d = new Reifying[]{aVar, bVar};
                }

                public Reifying() {
                    throw null;
                }

                public Reifying(String str, int i12, a aVar) {
                }

                public static Reifying valueOf(String str) {
                    return (Reifying) Enum.valueOf(Reifying.class, str);
                }

                public static Reifying[] values() {
                    return (Reifying[]) f416399d.clone();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ Object b(c cVar) {
                    f(cVar);
                    throw null;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ Object c(f fVar) {
                    i(fVar);
                    throw null;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Object d(a aVar) {
                    TypeDescription typeDescriptionF5 = aVar.f5();
                    return typeDescriptionF5.Q() ? new d.c(typeDescriptionF5) : aVar;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ Object e(a aVar) {
                    h(aVar);
                    throw null;
                }

                public final Generic f(Generic generic) {
                    throw new IllegalArgumentException("Cannot reify a generic array: " + generic);
                }

                public final Generic h(Generic generic) {
                    throw new IllegalArgumentException("Cannot reify a type variable: " + generic);
                }

                public final Generic i(Generic generic) {
                    throw new IllegalArgumentException("Cannot reify a wildcard: " + generic);
                }

                public enum a extends Reifying {
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object b(c cVar) {
                        f(cVar);
                        throw null;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object c(f fVar) {
                        i(fVar);
                        throw null;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final Object d(a aVar) {
                        TypeDescription typeDescriptionF5 = aVar.f5();
                        return typeDescriptionF5.Q() ? new d.c(typeDescriptionF5) : aVar;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object e(a aVar) {
                        h(aVar);
                        throw null;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final Object a(OfParameterizedType ofParameterizedType) {
                        return ofParameterizedType;
                    }
                }
            }

            public static abstract class d implements Visitor<Generic> {

                @HashCodeAndEqualsPlugin.Enhance
                public static class a extends d {

                    /* renamed from: b, reason: collision with root package name */
                    public final TypeDescription f416421b;

                    /* renamed from: c, reason: collision with root package name */
                    public final Object f416422c;

                    public a(TypeDefinition typeDefinition, TypeVariableSource typeVariableSource) {
                        this(typeDefinition.f5(), typeVariableSource);
                    }

                    public static a k(a.f fVar) {
                        return new a((TypeDefinition) fVar.f416178c, (TypeVariableSource) fVar);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object a(OfParameterizedType ofParameterizedType) {
                        return a(ofParameterizedType);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public final /* bridge */ /* synthetic */ Object b(c cVar) {
                        return b(cVar);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object c(f fVar) {
                        return c(fVar);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public final /* bridge */ /* synthetic */ Object d(a aVar) {
                        return d(aVar);
                    }

                    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, net.bytebuddy.description.TypeVariableSource] */
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final Object e(a aVar) {
                        return new e.c(this.f416422c.Y(aVar.g0()), aVar);
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        a aVar = (a) obj;
                        return this.f416421b.equals(aVar.f416421b) && this.f416422c.equals(aVar.f416422c);
                    }

                    public final int hashCode() {
                        return this.f416422c.hashCode() + D8.j(this.f416421b, getClass().hashCode() * 31, 31);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d
                    public final Generic i(a aVar) {
                        return aVar.Q2(net.bytebuddy.dynamic.c.class) ? new d.C11994d(this.f416421b, aVar) : aVar;
                    }

                    public a(TypeDescription typeDescription, TypeVariableSource typeVariableSource) {
                        this.f416421b = typeDescription;
                        this.f416422c = typeVariableSource;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class b extends d {

                    /* renamed from: b, reason: collision with root package name */
                    public final InterfaceC44410t.a.AbstractC12113a f416423b;

                    public b(InterfaceC44410t.a.AbstractC12113a abstractC12113a) {
                        this.f416423b = abstractC12113a;
                    }

                    public static b k(TypeDescription typeDescription) {
                        return new b(C44411u.f(typeDescription));
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object a(OfParameterizedType ofParameterizedType) {
                        return a(ofParameterizedType);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public final /* bridge */ /* synthetic */ Object b(c cVar) {
                        return b(cVar);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object c(f fVar) {
                        return c(fVar);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public final /* bridge */ /* synthetic */ Object d(a aVar) {
                        return d(aVar);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final Object e(a aVar) {
                        return new e.b(aVar.g0(), aVar);
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f416423b.equals(((b) obj).f416423b);
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return this.f416423b.hashCode() + (getClass().hashCode() * 31);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d
                    public final Generic i(a aVar) {
                        return this.f416423b.b(aVar.f5()) ? new d.C11994d(net.bytebuddy.dynamic.c.f416659a, aVar.getOwnerType(), aVar) : aVar;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.description.type.TypeDescription$Generic$Visitor$d$d, reason: collision with other inner class name */
                public static class C11991d extends d {
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object a(OfParameterizedType ofParameterizedType) {
                        return a(ofParameterizedType);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public final /* bridge */ /* synthetic */ Object b(c cVar) {
                        return b(cVar);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object c(f fVar) {
                        return c(fVar);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public final /* bridge */ /* synthetic */ Object d(a aVar) {
                        return d(aVar);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final Object e(a aVar) {
                        return new e.b(aVar.g0(), aVar);
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

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d
                    public final Generic i(a aVar) {
                        if (!aVar.Q2(net.bytebuddy.dynamic.c.class)) {
                            return aVar;
                        }
                        new d.C11994d(null, aVar);
                        throw null;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class e extends f {

                    /* renamed from: b, reason: collision with root package name */
                    public final OfParameterizedType f416424b;

                    public class a extends e {

                        /* renamed from: c, reason: collision with root package name */
                        public final a f416425c;

                        public a(a aVar) {
                            this.f416425c = aVar;
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public final TypeVariableSource A3() {
                            return this.f416425c.A3();
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public final String g0() {
                            return this.f416425c.g0();
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                            return this.f416425c.getDeclaredAnnotations();
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public final d.f getUpperBounds() {
                            return this.f416425c.getUpperBounds().h0(e.this);
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public class b implements TypeVariableSource.Visitor<Generic> {

                        /* renamed from: b, reason: collision with root package name */
                        public final a f416427b;

                        public b(a aVar) {
                            this.f416427b = aVar;
                        }

                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            b bVar = (b) obj;
                            return this.f416427b.equals(bVar.f416427b) && e.this.equals(e.this);
                        }

                        public final int hashCode() {
                            return e.this.hashCode() + ((this.f416427b.hashCode() + (getClass().hashCode() * 31)) * 31);
                        }
                    }

                    public e(OfParameterizedType ofParameterizedType) {
                        this.f416424b = ofParameterizedType;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final Object e(a aVar) {
                        return (Generic) aVar.A3().v(new b(aVar));
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f416424b.equals(((e) obj).f416424b);
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return this.f416424b.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public final Generic b(Generic generic) {
                    return new c.b((Generic) generic.m().h0(this), generic);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public Generic d(Generic generic) {
                    return generic.w2() ? new c.b((Generic) generic.m().h0(this), generic) : i((a) generic);
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public final Generic a(Generic generic) {
                    Generic generic2;
                    Generic ownerType = generic.getOwnerType();
                    ArrayList arrayList = new ArrayList(generic.J().size());
                    Iterator<Generic> it = generic.J().iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().h0(this));
                    }
                    TypeDescription typeDescriptionF5 = ((Generic) ((a) generic).i5().h0(this)).f5();
                    if (ownerType == null) {
                        d.b bVar = Generic.f416323x2;
                        generic2 = null;
                    } else {
                        generic2 = (Generic) ownerType.h0(this);
                    }
                    return new OfParameterizedType.d(typeDescriptionF5, generic2, arrayList, generic);
                }

                public abstract Generic i(a aVar);

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public final Generic c(Generic generic) {
                    return new f.b(generic.getUpperBounds().h0(this), generic.getLowerBounds().h0(this), generic);
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class c extends d {
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object a(OfParameterizedType ofParameterizedType) {
                        return a(ofParameterizedType);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public final /* bridge */ /* synthetic */ Object b(c cVar) {
                        return b(cVar);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object c(f fVar) {
                        return c(fVar);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public final /* bridge */ /* synthetic */ Object d(a aVar) {
                        return d(aVar);
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

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d
                    public final Generic i(a aVar) {
                        if (!aVar.f5().equals(null)) {
                            return aVar;
                        }
                        new d.C11994d(null, aVar);
                        throw null;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final Object e(a aVar) {
                        return aVar;
                    }
                }

                public static abstract class f extends d {
                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object a(OfParameterizedType ofParameterizedType) {
                        return a(ofParameterizedType);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public final /* bridge */ /* synthetic */ Object b(c cVar) {
                        return b(cVar);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final /* bridge */ /* synthetic */ Object c(f fVar) {
                        return c(fVar);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d, net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public final Object d(a aVar) {
                        return aVar;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d
                    /* renamed from: g */
                    public final Generic d(Generic generic) {
                        return generic;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d
                    public final Generic i(a aVar) {
                        return aVar;
                    }
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class NoOp implements Visitor<Generic> {

                /* renamed from: b, reason: collision with root package name */
                public static final NoOp f416395b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ NoOp[] f416396c;

                static {
                    NoOp noOp = new NoOp("INSTANCE", 0);
                    f416395b = noOp;
                    f416396c = new NoOp[]{noOp};
                }

                public NoOp() {
                    throw null;
                }

                public static NoOp valueOf(String str) {
                    return (NoOp) Enum.valueOf(NoOp.class, str);
                }

                public static NoOp[] values() {
                    return (NoOp[]) f416396c.clone();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object a(OfParameterizedType ofParameterizedType) {
                    return ofParameterizedType;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object b(c cVar) {
                    return cVar;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object c(f fVar) {
                    return fVar;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object d(a aVar) {
                    return aVar;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object e(a aVar) {
                    return aVar;
                }
            }

            public static class a implements Visitor<Generic> {

                /* renamed from: b, reason: collision with root package name */
                public final TypeDescription f416417b;

                public a(TypeDescription typeDescription) {
                    this.f416417b = typeDescription;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object a(OfParameterizedType ofParameterizedType) {
                    return this.f416417b.Q() ? new d.C11994d(ofParameterizedType.f5(), ofParameterizedType) : ofParameterizedType;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object b(c cVar) {
                    return this.f416417b.Q() ? new d.C11994d(cVar.f5(), cVar) : cVar;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object c(f fVar) {
                    throw new IllegalStateException(D8.n("Did not expect wildcard on top-level: ", fVar));
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object e(a aVar) {
                    return this.f416417b.Q() ? new d.C11994d(aVar.f5(), aVar) : aVar;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public final Object d(a aVar) {
                    return aVar;
                }
            }
        }
    }

    public static class SuperTypeLoading extends b {

        public interface ClassLoadingDelegate {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Simple implements ClassLoadingDelegate {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ Simple[] f416491b = {new Simple("INSTANCE", 0)};

                /* JADX INFO: Fake field, exist only in values array */
                Simple EF5;

                public Simple() {
                    throw null;
                }

                public static Simple valueOf(String str) {
                    return (Simple) Enum.valueOf(Simple.class, str);
                }

                public static Simple[] values() {
                    return (Simple[]) f416491b.clone();
                }
            }
        }

        public static class a extends d.f.a {
            @Override // java.util.AbstractList, java.util.List
            public final Object get(int i12) {
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                throw null;
            }
        }

        public static class b extends Generic.b {

            /* renamed from: c, reason: collision with root package name */
            public final Generic f416492c;

            /* renamed from: d, reason: collision with root package name */
            public transient /* synthetic */ TypeDescription f416493d;

            /* renamed from: e, reason: collision with root package name */
            public transient /* synthetic */ Generic f416494e;

            /* renamed from: f, reason: collision with root package name */
            public transient /* synthetic */ d.f f416495f;

            public b(Generic generic, @net.bytebuddy.utility.nullability.b ClassLoader classLoader) {
                this.f416492c = generic;
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @k.c
            @net.bytebuddy.utility.nullability.b
            public final Generic C3() {
                Generic generic;
                Generic genericC3;
                Generic generic2 = null;
                if (this.f416494e == null && (genericC3 = (generic = this.f416492c).C3()) != null) {
                    try {
                        generic.f5().getName();
                        throw null;
                    } catch (ClassNotFoundException unused) {
                        generic2 = genericC3;
                    }
                }
                if (generic2 == null) {
                    return this.f416494e;
                }
                this.f416494e = generic2;
                return generic2;
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @k.c
            public final d.f J0() {
                d.f fVar = null;
                if (this.f416495f == null) {
                    Generic generic = this.f416492c;
                    d.f fVarJ0 = generic.J0();
                    try {
                        generic.f5().getName();
                        throw null;
                    } catch (ClassNotFoundException unused) {
                        fVar = fVarJ0;
                    }
                }
                if (fVar == null) {
                    return this.f416495f;
                }
                this.f416495f = fVar;
                return fVar;
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @k.c
            public final TypeDescription f5() {
                Generic generic = this.f416492c;
                TypeDescription typeDescriptionF5 = null;
                if (this.f416493d == null) {
                    try {
                        generic.f5().getName();
                        throw null;
                    } catch (ClassNotFoundException unused) {
                        typeDescriptionF5 = generic.f5();
                    }
                }
                if (typeDescriptionF5 == null) {
                    return this.f416493d;
                }
                this.f416493d = typeDescriptionF5;
                return typeDescriptionF5;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationSource
            public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                return this.f416492c.getDeclaredAnnotations();
            }

            @Override // java.lang.Iterable
            public final Iterator<TypeDefinition> iterator() {
                return new TypeDefinition.a(this);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.b
            public final Generic y0() {
                return this.f416492c;
            }
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final boolean A() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d A2() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription
        public final boolean B() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.b
        public final Generic C3() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final boolean D5() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final TypeDescription G() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final boolean H() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription H5() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final d.f J0() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d J2() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d L() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final a.d e3() {
            throw null;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            throw null;
        }

        @Override // net.bytebuddy.description.d.a
        public final String getDescriptor() {
            throw null;
        }

        @Override // net.bytebuddy.description.c
        public final int getModifiers() {
            throw null;
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public final String getName() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final String l0() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.b
        public final TypeDefinition m() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription n() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final StackSize p() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public final net.bytebuddy.description.method.b<a.d> q() {
            throw null;
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public final d.f r() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final String s5() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final boolean w2() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final boolean w5() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public final net.bytebuddy.description.field.b<a.c> x() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final net.bytebuddy.description.type.a y5() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.c<b.c> z() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription m() {
            throw null;
        }
    }

    public static class c extends b {

        /* renamed from: e, reason: collision with root package name */
        public final TypeDescription f416499e;

        /* renamed from: f, reason: collision with root package name */
        public final int f416500f;

        public c(TypeDescription typeDescription, int i12) {
            this.f416499e = typeDescription;
            this.f416500f = i12;
        }

        @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public static TypeDescription z0(TypeDescription typeDescription, int i12) {
            if (i12 < 0) {
                throw new IllegalArgumentException("Arrays cannot have a negative arity");
            }
            while (typeDescription.w2()) {
                typeDescription = typeDescription.m();
                i12++;
            }
            return i12 == 0 ? typeDescription : new c(typeDescription, i12);
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final boolean A() {
            return false;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d A2() {
            return new d.c();
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.b
        public final Generic C3() {
            return Generic.f416323x2;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final boolean D5() {
            return false;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final boolean H() {
            return false;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription H5() {
            return null;
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final d.f J0() {
            return TypeDescription.f416322F2;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d J2() {
            return new d.c();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d L() {
            return new d.C12001d(this);
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription
        public final boolean N4() {
            return false;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final a.d e3() {
            return null;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            return new a.b();
        }

        @Override // net.bytebuddy.description.d.a
        public final String getDescriptor() {
            StringBuilder sb2 = new StringBuilder();
            for (int i12 = 0; i12 < this.f416500f; i12++) {
                sb2.append('[');
            }
            sb2.append(this.f416499e.getDescriptor());
            return sb2.toString();
        }

        @Override // net.bytebuddy.description.c
        @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public final int getModifiers() {
            return (m().getModifiers() & (-8713)) | 1040;
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public final String getName() {
            String descriptor = this.f416499e.getDescriptor();
            int length = descriptor.length();
            int i12 = this.f416500f;
            StringBuilder sb2 = new StringBuilder(length + i12);
            for (int i13 = 0; i13 < i12; i13++) {
                sb2.append('[');
            }
            for (int i14 = 0; i14 < descriptor.length(); i14++) {
                char cCharAt = descriptor.charAt(i14);
                if (cCharAt == '/') {
                    cCharAt = '.';
                }
                sb2.append(cCharAt);
            }
            return sb2.toString();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final String l0() {
            StringBuilder sb2 = new StringBuilder(this.f416499e.l0());
            for (int i12 = 0; i12 < this.f416500f; i12++) {
                sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
            return sb2.toString();
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription m() {
            TypeDescription typeDescription = this.f416499e;
            int i12 = this.f416500f;
            return i12 == 1 ? typeDescription : new c(typeDescription, i12 - 1);
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @net.bytebuddy.utility.nullability.a
        public final /* bridge */ /* synthetic */ TypeDefinition n() {
            return null;
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final StackSize p() {
            return StackSize.SINGLE;
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public final net.bytebuddy.description.method.b<a.d> q() {
            return new b.C11978b();
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public final d.f r() {
            return new d.f.b();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final String s5() {
            String strS5 = this.f416499e.s5();
            if (strS5 == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder(strS5);
            for (int i12 = 0; i12 < this.f416500f; i12++) {
                sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
            return sb2.toString();
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.annotation.a w1() {
            return new a.b();
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final boolean w2() {
            return true;
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final boolean w5() {
            return false;
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public final net.bytebuddy.description.field.b<a.c> x() {
            return new b.C11973b();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final net.bytebuddy.description.type.a y5() {
            return null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.c<b.c> z() {
            return new c.b();
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @net.bytebuddy.utility.nullability.a
        public final TypeDescription n() {
            return null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final TypeDescription G() {
            return this;
        }
    }

    @SuppressFBWarnings(justification = "Field is only used as a cache store and is implicitly recomputed", value = {"SE_TRANSIENT_FIELD_NOT_RESTORED"})
    public static class d extends b implements Serializable {

        /* renamed from: i, reason: collision with root package name */
        public static final a f416501i;

        /* renamed from: j, reason: collision with root package name */
        public static final HashMap f416502j;

        /* renamed from: k, reason: collision with root package name */
        public static final boolean f416503k;
        private static final long serialVersionUID = 1;

        /* renamed from: e, reason: collision with root package name */
        public final Class<?> f416504e;

        /* renamed from: f, reason: collision with root package name */
        public transient /* synthetic */ b.d f416505f;

        /* renamed from: g, reason: collision with root package name */
        public transient /* synthetic */ b.d f416506g;

        /* renamed from: h, reason: collision with root package name */
        public transient /* synthetic */ a.d f416507h;

        @JavaDispatcher.i("java.lang.Class")
        @JavaDispatcher.c
        public interface a {
            @JavaDispatcher.i("isRecord")
            boolean A();

            @JavaDispatcher.i("isSealed")
            boolean B();

            @JavaDispatcher.i("getNestHost")
            @net.bytebuddy.utility.nullability.b
            Class G();

            @JavaDispatcher.i("getNestMembers")
            Class[] L();

            @JavaDispatcher.i("getPermittedSubclasses")
            @net.bytebuddy.utility.nullability.b
            Class[] M();

            @JavaDispatcher.i("isNestmateOf")
            boolean N();

            @JavaDispatcher.i("getAnnotatedInterfaces")
            AnnotatedElement[] O();

            @JavaDispatcher.i("getAnnotatedSuperclass")
            @net.bytebuddy.utility.nullability.b
            AnnotatedElement P();

            @JavaDispatcher.i("getRecordComponents")
            @net.bytebuddy.utility.nullability.b
            Object[] z();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        static {
            /*
                Method dump skipped, instructions count: 256
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.description.type.TypeDescription.d.<clinit>():void");
        }

        public d(Class<?> cls) {
            this.f416504e = cls;
        }

        public static TypeDescription A0(Class<?> cls) {
            TypeDescription typeDescription = (TypeDescription) f416502j.get(cls);
            return typeDescription == null ? new d(cls) : typeDescription;
        }

        public static String z0(Class<?> cls) {
            String name = cls.getName();
            int iIndexOf = name.indexOf(47);
            return iIndexOf == -1 ? name : name.substring(0, iIndexOf);
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final boolean A() {
            return f416501i.A();
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription
        public final boolean A1(Class<?> cls) {
            return this.f416504e.isAssignableFrom(cls) || super.A1(cls);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d A2() {
            Class[] clsArrM = f416501i.M();
            return clsArrM == null ? new d.c() : new d.e(clsArrM);
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription
        public final boolean B() {
            return f416501i.B();
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.b
        public final Generic C3() {
            boolean z12 = b.f416496c;
            Class<?> cls = this.f416504e;
            if (!z12) {
                if (cls.getSuperclass() == null) {
                    return null;
                }
                return new Generic.b.c(cls);
            }
            if (cls.getSuperclass() != null) {
                return Generic.d.b.y0(cls.getSuperclass());
            }
            Generic.d.b bVar = Generic.f416323x2;
            return null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final boolean D5() {
            return this.f416504e.isAnonymousClass();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final TypeDescription G() {
            Class clsG = f416501i.G();
            return clsG == null ? this : A0(clsG);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final boolean H() {
            return this.f416504e.isLocalClass();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final TypeDescription H5() {
            Class<?> enclosingClass = this.f416504e.getEnclosingClass();
            if (enclosingClass == null) {
                return null;
            }
            return A0(enclosingClass);
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final d.f J0() {
            d.f.e eVar = TypeDescription.f416322F2;
            boolean z12 = b.f416496c;
            Class<?> cls = this.f416504e;
            return z12 ? cls.isArray() ? eVar : new d.f.e(cls.getInterfaces()) : cls.isArray() ? eVar : new d.f.g(cls);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d J2() {
            return new d.e(this.f416504e.getDeclaredClasses());
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d L() {
            Class[] clsArrL = f416501i.L();
            if (clsArrL.length == 0) {
                clsArrL = new Class[]{this.f416504e};
            }
            return new d.e(clsArrL);
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription
        public final boolean N4() {
            return this.f416504e.isMemberClass();
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDefinition
        public final Generic P0() {
            return Generic.d.b.y0(this.f416504e);
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDefinition
        public final boolean Q2(Class cls) {
            return cls == this.f416504e || super.Q2(cls);
        }

        @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.c.e
        public final boolean X() {
            return this.f416504e.isAnnotation();
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean Y5(net.bytebuddy.description.type.TypeDescription r2) {
            /*
                r1 = this;
                boolean r0 = r2 instanceof net.bytebuddy.description.type.TypeDescription.d
                if (r0 == 0) goto L11
                r0 = r2
                net.bytebuddy.description.type.TypeDescription$d r0 = (net.bytebuddy.description.type.TypeDescription.d) r0
                java.lang.Class<?> r0 = r0.f416504e
                net.bytebuddy.description.type.TypeDescription$d$a r0 = net.bytebuddy.description.type.TypeDescription.d.f416501i
                boolean r0 = r0.N()
                if (r0 != 0) goto L17
            L11:
                boolean r2 = super.Y5(r2)
                if (r2 == 0) goto L19
            L17:
                r2 = 1
                goto L1a
            L19:
                r2 = 0
            L1a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.description.type.TypeDescription.d.Y5(net.bytebuddy.description.type.TypeDescription):boolean");
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean Z5(net.bytebuddy.description.type.TypeDescription r3) {
            /*
                r2 = this;
                boolean r0 = r3 instanceof net.bytebuddy.description.type.TypeDescription.d
                if (r0 == 0) goto L11
                r0 = r3
                net.bytebuddy.description.type.TypeDescription$d r0 = (net.bytebuddy.description.type.TypeDescription.d) r0
                java.lang.Class<?> r0 = r0.f416504e
                java.lang.Class<?> r1 = r2.f416504e
                boolean r0 = r1.isAssignableFrom(r0)
                if (r0 != 0) goto L17
            L11:
                boolean r3 = super.Z5(r3)
                if (r3 == 0) goto L19
            L17:
                r3 = 1
                goto L1a
            L19:
                r3 = 0
            L1a:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.description.type.TypeDescription.d.Z5(net.bytebuddy.description.type.TypeDescription):boolean");
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final a.d e3() {
            Class<?> cls = this.f416504e;
            Method enclosingMethod = cls.getEnclosingMethod();
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingMethod != null) {
                return new a.c(enclosingMethod);
            }
            if (enclosingConstructor != null) {
                return new a.b(enclosingConstructor);
            }
            return null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription
        public final boolean e5(Class<?> cls) {
            return cls.isAssignableFrom(this.f416504e) || super.e5(cls);
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        @k.c
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            a.d dVar = this.f416507h != null ? null : new a.d(this.f416504e.getDeclaredAnnotations());
            if (dVar == null) {
                return this.f416507h;
            }
            this.f416507h = dVar;
            return dVar;
        }

        @Override // net.bytebuddy.description.d.a
        public final String getDescriptor() {
            Class<?> cls = this.f416504e;
            String name = cls.getName();
            int iIndexOf = name.indexOf(47);
            if (iIndexOf == -1) {
                return B.i(cls);
            }
            return "L" + name.substring(0, iIndexOf).replace('.', '/') + ";";
        }

        @Override // net.bytebuddy.description.c
        public final int getModifiers() {
            return this.f416504e.getModifiers();
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public final String getName() {
            return z0(this.f416504e);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final String l0() {
            Class<?> componentType = this.f416504e;
            String simpleName = componentType.getSimpleName();
            int iIndexOf = simpleName.indexOf(47);
            if (iIndexOf == -1) {
                return simpleName;
            }
            StringBuilder sb2 = new StringBuilder(simpleName.substring(0, iIndexOf));
            while (componentType.isArray()) {
                sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                componentType = componentType.getComponentType();
            }
            return sb2.toString();
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription m() {
            Class<?> componentType = this.f416504e.getComponentType();
            if (componentType == null) {
                return null;
            }
            return A0(componentType);
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription
        public final boolean m5(TypeDescription typeDescription) {
            return ((typeDescription instanceof d) && ((d) typeDescription).f416504e.isAssignableFrom(this.f416504e)) || b.y0(typeDescription, this);
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription n() {
            Class<?> declaringClass = this.f416504e.getDeclaringClass();
            if (declaringClass == null) {
                return null;
            }
            return A0(declaringClass);
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final StackSize p() {
            Class<?> cls = Void.TYPE;
            Class<?> cls2 = this.f416504e;
            return cls2 == cls ? StackSize.ZERO : (cls2 == Double.TYPE || cls2 == Long.TYPE) ? StackSize.DOUBLE : StackSize.SINGLE;
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        @k.c
        public final net.bytebuddy.description.method.b<a.d> q() {
            b.d dVar = this.f416506g != null ? null : new b.d(this.f416504e);
            if (dVar == null) {
                return this.f416506g;
            }
            this.f416506g = dVar;
            return dVar;
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public final d.f r() {
            return b.f416496c ? new d.f.b() : new d.f.e.a(this.f416504e.getTypeParameters());
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final String s5() {
            Class<?> componentType = this.f416504e;
            String canonicalName = componentType.getCanonicalName();
            if (canonicalName == null) {
                return null;
            }
            int iIndexOf = canonicalName.indexOf(47);
            if (iIndexOf == -1) {
                return canonicalName;
            }
            StringBuilder sb2 = new StringBuilder(canonicalName.substring(0, iIndexOf));
            while (componentType.isArray()) {
                sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                componentType = componentType.getComponentType();
            }
            return sb2.toString();
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final boolean w2() {
            return this.f416504e.isArray();
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final boolean w5() {
            return this.f416504e.isPrimitive();
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        @k.c
        public final net.bytebuddy.description.field.b<a.c> x() {
            b.d dVar;
            if (this.f416505f != null) {
                dVar = null;
            } else {
                GraalImageCode graalImageCodeA = GraalImageCode.a();
                Field[] declaredFields = this.f416504e.getDeclaredFields();
                graalImageCodeA.b(declaredFields, FieldComparator.f418851b);
                dVar = new b.d(declaredFields);
            }
            if (dVar == null) {
                return this.f416505f;
            }
            this.f416505f = dVar;
            return dVar;
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription
        public final boolean y3() {
            Class<?> clsG = f416501i.G();
            return clsG == null || clsG == this.f416504e;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final net.bytebuddy.description.type.a y5() {
            Class<?> cls = this.f416504e;
            if (cls.isArray() || cls.isPrimitive()) {
                return null;
            }
            Package r12 = cls.getPackage();
            if (r12 != null) {
                return new a.b(r12);
            }
            String name = cls.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            return iLastIndexOf == -1 ? new a.c("") : new a.c(name.substring(0, iLastIndexOf));
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.c<b.c> z() {
            Object[] objArrZ = f416501i.z();
            return objArrZ == null ? new c.b() : new c.d(objArrZ);
        }
    }

    public static class e extends b.a {
        @Override // net.bytebuddy.description.type.TypeDefinition
        public final boolean A() {
            return false;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d A2() {
            return new d.c();
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.b
        public final Generic C3() {
            return Generic.f416323x2;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final boolean D5() {
            return false;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final boolean H() {
            return false;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription H5() {
            return null;
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final d.f J0() {
            return new d.f.b();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d J2() {
            return new d.c();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d L() {
            return new d.C12001d(this);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final a.d e3() {
            return null;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            throw null;
        }

        @Override // net.bytebuddy.description.c
        public final int getModifiers() {
            return 5632;
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public final String getName() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @net.bytebuddy.utility.nullability.b
        public final /* bridge */ /* synthetic */ TypeDefinition n() {
            return null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public final net.bytebuddy.description.method.b<a.d> q() {
            return new b.C11978b();
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public final d.f r() {
            return new d.f.b();
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public final net.bytebuddy.description.field.b<a.c> x() {
            return new b.C11973b();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.a y5() {
            return null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.c<b.c> z() {
            return new c.b();
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription n() {
            return null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final TypeDescription G() {
            return this;
        }
    }

    public static class f extends b.a {

        /* renamed from: e, reason: collision with root package name */
        public final String f416508e;

        /* renamed from: f, reason: collision with root package name */
        public final int f416509f;

        /* renamed from: g, reason: collision with root package name */
        @net.bytebuddy.utility.nullability.b
        public final Generic f416510g;

        /* renamed from: h, reason: collision with root package name */
        public final d.f f416511h;

        public f(String str, int i12, @net.bytebuddy.utility.nullability.b Generic generic, d.f fVar) {
            this.f416508e = str;
            this.f416509f = i12;
            this.f416510g = generic;
            this.f416511h = fVar;
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final boolean A() {
            throw new IllegalStateException("Cannot resolve record attribute of a latent type description: " + this);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d A2() {
            throw new IllegalStateException("Cannot resolve permitted subclasses of a latent type description: " + this);
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.b
        public final Generic C3() {
            return this.f416510g;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final boolean D5() {
            throw new IllegalStateException("Cannot resolve anonymous type property of a latent type description: " + this);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final TypeDescription G() {
            throw new IllegalStateException("Cannot resolve nest host of a latent type description: " + this);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final boolean H() {
            throw new IllegalStateException("Cannot resolve local class property of a latent type description: " + this);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final TypeDescription H5() {
            throw new IllegalStateException("Cannot resolve enclosing type of a latent type description: " + this);
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final d.f J0() {
            return new d.f.c(this.f416511h);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d J2() {
            throw new IllegalStateException("Cannot resolve inner types of a latent type description: " + this);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.d L() {
            throw new IllegalStateException("Cannot resolve nest mates of a latent type description: " + this);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final a.d e3() {
            throw new IllegalStateException("Cannot resolve enclosing method of a latent type description: " + this);
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            throw new IllegalStateException("Cannot resolve declared annotations of a latent type description: " + this);
        }

        @Override // net.bytebuddy.description.c
        public final int getModifiers() {
            return this.f416509f;
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public final String getName() {
            return this.f416508e;
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        public final /* bridge */ /* synthetic */ TypeDefinition n() {
            n();
            throw null;
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public final net.bytebuddy.description.method.b<a.d> q() {
            throw new IllegalStateException("Cannot resolve declared methods of a latent type description: " + this);
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public final d.f r() {
            throw new IllegalStateException("Cannot resolve type variables of a latent type description: " + this);
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public final net.bytebuddy.description.field.b<a.c> x() {
            throw new IllegalStateException("Cannot resolve declared fields of a latent type description: " + this);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.b
        public final net.bytebuddy.description.type.a y5() {
            String str = this.f416508e;
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                return null;
            }
            return new a.c(str.substring(0, iLastIndexOf));
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final net.bytebuddy.description.type.c<b.c> z() {
            throw new IllegalStateException("Cannot resolve record components of a latent type description: " + this);
        }

        @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        public final TypeDescription n() {
            throw new IllegalStateException("Cannot resolve declared type of a latent type description: " + this);
        }
    }

    boolean A1(Class<?> cls);

    net.bytebuddy.description.type.d A2();

    boolean A4();

    boolean B();

    boolean D5();

    TypeDescription G();

    int G5();

    boolean H();

    @net.bytebuddy.utility.nullability.b
    TypeDescription H5();

    net.bytebuddy.description.type.d J2();

    net.bytebuddy.description.type.d L();

    boolean N4();

    boolean Y1();

    boolean Y3(TypeDescription typeDescription);

    boolean Y5(TypeDescription typeDescription);

    TypeDescription Z1();

    boolean Z5(TypeDescription typeDescription);

    @net.bytebuddy.utility.nullability.b
    a.d e3();

    boolean e5(Class<?> cls);

    int f(boolean z12);

    TypeDescription h3();

    String l0();

    @Override // net.bytebuddy.description.type.TypeDefinition
    @net.bytebuddy.utility.nullability.b
    TypeDescription m();

    boolean m5(TypeDescription typeDescription);

    @Override // net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
    @net.bytebuddy.utility.nullability.b
    TypeDescription n();

    @Override // net.bytebuddy.description.type.TypeDefinition
    net.bytebuddy.description.method.b<a.d> q();

    boolean s0();

    @net.bytebuddy.utility.nullability.b
    String s5();

    net.bytebuddy.description.annotation.a w1();

    @Override // net.bytebuddy.description.type.TypeDefinition
    net.bytebuddy.description.field.b<a.c> x();

    boolean y3();

    @net.bytebuddy.utility.nullability.b
    net.bytebuddy.description.type.a y5();

    net.bytebuddy.description.type.c<b.c> z();

    public static abstract class b extends TypeVariableSource.a implements TypeDescription {

        /* renamed from: c, reason: collision with root package name */
        public static final boolean f416496c;

        /* renamed from: d, reason: collision with root package name */
        public static final boolean f416497d;

        /* renamed from: b, reason: collision with root package name */
        public transient /* synthetic */ int f416498b;

        public static abstract class a extends b {

            /* renamed from: net.bytebuddy.description.type.TypeDescription$b$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC11997a extends a {
                @Override // net.bytebuddy.description.type.TypeDefinition
                public final boolean A() {
                    return z0().A();
                }

                @Override // net.bytebuddy.description.type.TypeDescription
                public final net.bytebuddy.description.type.d A2() {
                    return z0().A2();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription
                public final boolean B() {
                    return z0().B();
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final Generic C3() {
                    return z0().C3();
                }

                @Override // net.bytebuddy.description.type.TypeDescription
                public final boolean D5() {
                    return z0().D5();
                }

                @Override // net.bytebuddy.description.type.TypeDescription
                public final TypeDescription G() {
                    return z0().G();
                }

                @Override // net.bytebuddy.description.type.TypeDescription
                public final boolean H() {
                    return z0().H();
                }

                @Override // net.bytebuddy.description.type.TypeDescription
                @net.bytebuddy.utility.nullability.b
                public final TypeDescription H5() {
                    return z0().H5();
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                public final d.f J0() {
                    return z0().J0();
                }

                @Override // net.bytebuddy.description.type.TypeDescription
                public final net.bytebuddy.description.type.d J2() {
                    return z0().J2();
                }

                @Override // net.bytebuddy.description.type.TypeDescription
                public final net.bytebuddy.description.type.d L() {
                    return z0().L();
                }

                @Override // net.bytebuddy.description.type.TypeDescription
                @net.bytebuddy.utility.nullability.b
                public final a.d e3() {
                    return z0().e3();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription
                public final int f(boolean z12) {
                    return z0().f(z12);
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return z0().getDeclaredAnnotations();
                }

                @Override // net.bytebuddy.description.c
                public final int getModifiers() {
                    return z0().getModifiers();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.d.a
                @net.bytebuddy.utility.nullability.b
                public final String h() {
                    return z0().h();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.b.a, net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.utility.nullability.b
                public final /* bridge */ /* synthetic */ TypeDefinition m() {
                    return null;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                @net.bytebuddy.utility.nullability.b
                public final TypeDescription n() {
                    return z0().n();
                }

                @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
                public final net.bytebuddy.description.method.b<a.d> q() {
                    return z0().q();
                }

                @Override // net.bytebuddy.description.TypeVariableSource
                public final d.f r() {
                    return z0().r();
                }

                @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
                public final net.bytebuddy.description.field.b<a.c> x() {
                    return z0().x();
                }

                @Override // net.bytebuddy.description.type.TypeDescription
                @net.bytebuddy.utility.nullability.b
                public final net.bytebuddy.description.type.a y5() {
                    return z0().y5();
                }

                @Override // net.bytebuddy.description.type.TypeDescription
                public final net.bytebuddy.description.type.c<b.c> z() {
                    return z0().z();
                }

                public abstract TypeDescription z0();
            }

            @Override // net.bytebuddy.description.d.a
            public final String getDescriptor() {
                return "L" + V() + ";";
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0048 -> B:7:0x002d). Please report as a decompilation issue!!! */
            @Override // net.bytebuddy.description.type.TypeDescription
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.String l0() {
                /*
                    r4 = this;
                    java.lang.String r0 = r4.V()
                    net.bytebuddy.description.type.TypeDescription r1 = r4.H5()
                    if (r1 == 0) goto L30
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = r1.V()
                    r2.append(r3)
                    java.lang.String r3 = "$"
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    boolean r2 = r0.startsWith(r2)
                    if (r2 == 0) goto L30
                    java.lang.String r1 = r1.V()
                    int r1 = r1.length()
                L2d:
                    int r1 = r1 + 1
                    goto L3a
                L30:
                    r1 = 47
                    int r1 = r0.lastIndexOf(r1)
                    r2 = -1
                    if (r1 != r2) goto L3a
                    return r0
                L3a:
                    int r2 = r0.length()
                    if (r1 >= r2) goto L4b
                    char r2 = r0.charAt(r1)
                    boolean r2 = java.lang.Character.isLetter(r2)
                    if (r2 != 0) goto L4b
                    goto L2d
                L4b:
                    java.lang.String r0 = r0.substring(r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.description.type.TypeDescription.b.a.l0():java.lang.String");
            }

            @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.utility.nullability.b
            public /* bridge */ /* synthetic */ TypeDefinition m() {
                return null;
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final StackSize p() {
                return StackSize.SINGLE;
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            @net.bytebuddy.utility.nullability.b
            public final String s5() {
                if (D5() || H()) {
                    return null;
                }
                String strV = V();
                TypeDescription typeDescriptionH5 = H5();
                if (typeDescriptionH5 != null) {
                    if (strV.startsWith(typeDescriptionH5.V() + "$")) {
                        return typeDescriptionH5.s5() + "." + strV.substring(typeDescriptionH5.V().length() + 1);
                    }
                }
                return getName();
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean w2() {
                return false;
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean w5() {
                return false;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.utility.nullability.b
            public final TypeDescription m() {
                return null;
            }
        }

        static {
            boolean z12 = false;
            try {
                Class.forName("java.security.AccessController", false, null);
                f416497d = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
            } catch (ClassNotFoundException unused) {
                f416497d = false;
            } catch (SecurityException unused2) {
                f416497d = true;
            }
            try {
                z12 = Boolean.parseBoolean((String) (f416497d ? AccessController.doPrivileged(new net.bytebuddy.utility.privilege.b("net.bytebuddy.raw")) : System.getProperty("net.bytebuddy.raw")));
            } catch (Exception unused3) {
            }
            f416496c = z12;
        }

        @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public static boolean y0(TypeDescription typeDescription, TypeDescription typeDescription2) {
            if (typeDescription.equals(typeDescription2)) {
                return true;
            }
            if (typeDescription2.w2()) {
                return typeDescription.w2() ? y0(typeDescription.m(), typeDescription2.m()) : typeDescription.Q2(Object.class) || TypeDescription.f416322F2.contains(typeDescription.P0());
            }
            if (typeDescription.Q2(Object.class)) {
                return !typeDescription2.w5();
            }
            Generic genericC3 = typeDescription2.C3();
            if (genericC3 != null && typeDescription.Z5(genericC3.f5())) {
                return true;
            }
            if (typeDescription.E()) {
                Iterator<TypeDescription> it = typeDescription2.J0().f1().iterator();
                while (it.hasNext()) {
                    if (typeDescription.Z5(it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean A1(Class<?> cls) {
            return Z5(d.A0(cls));
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final boolean A4() {
            if (!x0(8)) {
                if (n() != null) {
                    return true;
                }
            }
            return false;
        }

        public boolean B() {
            return (w5() || w2() || A2().isEmpty()) ? false : true;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final int G5() {
            TypeDescription typeDescriptionN;
            if (b() || (typeDescriptionN = n()) == null) {
                return 0;
            }
            return typeDescriptionN.G5() + 1;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean N4() {
            return (H() || D5() || n() == null) ? false : true;
        }

        @Override // net.bytebuddy.description.a
        @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public final boolean P(TypeDescription typeDescription) {
            if (w5()) {
                return true;
            }
            if (w2()) {
                if (m().o0(null)) {
                    return true;
                }
            } else if (x0(1) || Y3(null)) {
                return true;
            }
            return false;
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public Generic P0() {
            return new Generic.d.a(this);
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public final boolean Q() {
            TypeDescription typeDescriptionN;
            if (!r().isEmpty()) {
                return true;
            }
            if (!x0(8) && (typeDescriptionN = n()) != null && typeDescriptionN.Q()) {
                return true;
            }
            try {
                a.d dVarE3 = e3();
                if (dVarE3 != null) {
                    if (dVarE3.Q()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @SuppressFBWarnings(justification = "Fits equality contract for type definitions.", value = {"EC_UNRELATED_CLASS_AND_INTERFACE"})
        public boolean Q2(Class cls) {
            return equals(TypeDefinition.Sort.a(cls, Generic.AnnotationReader.NoOp.f416326b));
        }

        @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.d
        @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public final String R() {
            if (!w2()) {
                return getName();
            }
            TypeDescription typeDescriptionM = this;
            int i12 = 0;
            do {
                i12++;
                typeDescriptionM = typeDescriptionM.m();
            } while (typeDescriptionM.w2());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(typeDescriptionM.R());
            for (int i13 = 0; i13 < i12; i13++) {
                sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
            return sb2.toString();
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public final boolean T() {
            return false;
        }

        @Override // net.bytebuddy.description.d.InterfaceC11969d
        public final String V() {
            return getName().replace('.', '/');
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public final boolean Y1() {
            return w5() || Q2(String.class) || (e5(Enum.class) && !Q2(Enum.class)) || ((e5(Annotation.class) && !Q2(Annotation.class)) || Q2(Class.class) || (w2() && !m().w2() && m().Y1()));
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final boolean Y3(TypeDescription typeDescription) {
            net.bytebuddy.description.type.a aVarY5 = y5();
            net.bytebuddy.description.type.a aVarY52 = typeDescription.y5();
            return (aVarY5 == null || aVarY52 == null) ? aVarY5 == aVarY52 : aVarY5.equals(aVarY52);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean Y5(TypeDescription typeDescription) {
            return G().equals(typeDescription.G());
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final TypeDescription Z1() {
            return Q2(Boolean.class) ? d.A0(Boolean.TYPE) : Q2(Byte.class) ? d.A0(Byte.TYPE) : Q2(Short.class) ? d.A0(Short.TYPE) : Q2(Character.class) ? d.A0(Character.TYPE) : Q2(Integer.class) ? d.A0(Integer.TYPE) : Q2(Long.class) ? d.A0(Long.TYPE) : Q2(Float.class) ? d.A0(Float.TYPE) : Q2(Double.class) ? d.A0(Double.TYPE) : this;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean Z5(TypeDescription typeDescription) {
            return y0(this, typeDescription);
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        @net.bytebuddy.utility.nullability.b
        public final TypeVariableSource c0() {
            a.d dVarE3 = e3();
            if (dVarE3 != null) {
                return dVarE3;
            }
            if (x0(8)) {
                return null;
            }
            return H5();
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean e5(Class<?> cls) {
            return m5(d.A0(cls));
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TypeDefinition)) {
                return false;
            }
            TypeDefinition typeDefinition = (TypeDefinition) obj;
            return typeDefinition.o().b() && getName().equals(typeDefinition.f5().getName());
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public int f(boolean z12) {
            int modifiers = getModifiers() | (getDeclaredAnnotations().isAnnotationPresent(Deprecated.class) ? 131072 : 0) | (A() ? AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR : 0) | (z12 ? 32 : 0);
            return x0(2) ? modifiers & (-11) : x0(4) ? (modifiers & (-13)) | 1 : modifiers & (-9);
        }

        @Override // net.bytebuddy.description.c.a, net.bytebuddy.description.type.TypeDefinition
        public final String getTypeName() {
            return getName();
        }

        @Override // net.bytebuddy.description.d.a
        @net.bytebuddy.utility.nullability.b
        public String h() {
            try {
                C26950c c26950c = new C26950c();
                boolean z12 = false;
                for (Generic generic : r()) {
                    c26950c.h(generic.g0());
                    for (Generic generic2 : generic.getUpperBounds()) {
                        if (generic2.f5().E()) {
                            c26950c.k();
                        }
                        generic2.h0(new Generic.Visitor.b(c26950c));
                    }
                    z12 = true;
                }
                Generic genericC3 = C3();
                if (genericC3 == null) {
                    genericC3 = Generic.f416323x2;
                }
                c26950c.r();
                genericC3.h0(new Generic.Visitor.b(c26950c));
                boolean z13 = z12 || !genericC3.o().b();
                for (Generic generic3 : J0()) {
                    generic3.h0(new Generic.Visitor.b(c26950c));
                    z13 = z13 || !generic3.o().b();
                }
                if (z13) {
                    return c26950c.f57665a.toString();
                }
                return null;
            } catch (GenericSignatureFormatError unused) {
                return null;
            }
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final TypeDescription h3() {
            return Q2(Boolean.TYPE) ? d.A0(Boolean.class) : Q2(Byte.TYPE) ? d.A0(Byte.class) : Q2(Short.TYPE) ? d.A0(Short.class) : Q2(Character.TYPE) ? d.A0(Character.class) : Q2(Integer.TYPE) ? d.A0(Integer.class) : Q2(Long.TYPE) ? d.A0(Long.class) : Q2(Float.TYPE) ? d.A0(Float.class) : Q2(Double.TYPE) ? d.A0(Double.class) : this;
        }

        @k.c
        public final int hashCode() {
            int iHashCode = this.f416498b != 0 ? 0 : getName().hashCode();
            if (iHashCode == 0) {
                return this.f416498b;
            }
            this.f416498b = iHashCode;
            return iHashCode;
        }

        @Override // java.lang.Iterable
        public final Iterator<TypeDefinition> iterator() {
            return new TypeDefinition.a(this);
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean m5(TypeDescription typeDescription) {
            return y0(typeDescription, this);
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final TypeDefinition.Sort o() {
            return TypeDefinition.Sort.f416307b;
        }

        @Override // net.bytebuddy.description.a
        @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public final boolean o0(TypeDescription typeDescription) {
            if (w5()) {
                return true;
            }
            if (w2()) {
                if (m().o0(typeDescription)) {
                    return true;
                }
            } else if (x0(1) || x0(4) || Y3(typeDescription)) {
                return true;
            }
            return false;
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public final boolean s0() {
            return Q2(Boolean.class) || Q2(Byte.class) || Q2(Short.class) || Q2(Character.class) || Q2(Integer.class) || Q2(Long.class) || Q2(Float.class) || Q2(Double.class);
        }

        public final String toString() {
            String strConcat;
            StringBuilder sb2 = new StringBuilder();
            if (w5()) {
                strConcat = "";
            } else {
                strConcat = (x0(512) ? "interface" : "class").concat(" ");
            }
            sb2.append(strConcat);
            sb2.append(getName());
            return sb2.toString();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        
            r0 = r0.getOwnerType();
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
        
            if (r0 == null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        
            r1 = r0.o();
            r1.getClass();
         */
        @Override // net.bytebuddy.description.TypeVariableSource
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object v(net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d.e.b r7) {
            /*
                r6 = this;
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$d$e r0 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.d.e.this
                net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType r0 = r0.f416424b
                net.bytebuddy.description.type.TypeDescription$Generic$a r7 = r7.f416427b
                r0.getClass()
            L9:
                net.bytebuddy.description.type.d$f r1 = r0.J()
                net.bytebuddy.description.type.TypeDescription r2 = r0.f5()
                net.bytebuddy.description.type.d$f r2 = r2.r()
                r3 = 0
            L16:
                int r4 = r1.size()
                int r5 = r2.size()
                int r4 = java.lang.Math.min(r4, r5)
                if (r3 >= r4) goto L38
                java.lang.Object r4 = r2.get(r3)
                boolean r4 = r7.equals(r4)
                if (r4 == 0) goto L35
                java.lang.Object r0 = r1.get(r3)
                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                goto L4b
            L35:
                int r3 = r3 + 1
                goto L16
            L38:
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getOwnerType()
                if (r0 == 0) goto L4a
                net.bytebuddy.description.type.TypeDefinition$Sort r1 = r0.o()
                r1.getClass()
                net.bytebuddy.description.type.TypeDefinition$Sort r2 = net.bytebuddy.description.type.TypeDefinition.Sort.f416309d
                if (r1 != r2) goto L4a
                goto L9
            L4a:
                r0 = 0
            L4b:
                if (r0 != 0) goto L51
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r7.i5()
            L51:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.description.type.TypeDescription.b.v(net.bytebuddy.description.type.TypeDescription$Generic$Visitor$d$e$b):java.lang.Object");
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.annotation.a w1() {
            Generic genericC3 = C3();
            net.bytebuddy.description.annotation.a declaredAnnotations = getDeclaredAnnotations();
            if (genericC3 == null) {
                return declaredAnnotations;
            }
            HashSet hashSet = new HashSet();
            Iterator<AnnotationDescription> it = declaredAnnotations.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().a());
            }
            return new a.c(net.bytebuddy.utility.a.a(declaredAnnotations, genericC3.f5().w1().l2(hashSet)));
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean y3() {
            return equals(G());
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public final TypeDescription f5() {
            return this;
        }
    }
}
