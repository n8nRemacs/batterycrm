package net.bytebuddy.dynamic.scaffold;

import I41.g;
import androidx.compose.foundation.H;
import b61.C25418b;
import b61.j;
import com.yandex.div2.D8;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationValue;
import net.bytebuddy.description.annotation.a;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.field.b;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.method.c;
import net.bytebuddy.description.method.d;
import net.bytebuddy.description.modifier.Visibility;
import net.bytebuddy.description.modifier.a;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.b;
import net.bytebuddy.description.type.c;
import net.bytebuddy.description.type.d;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.TypeResolutionStrategy;
import net.bytebuddy.dynamic.a;
import net.bytebuddy.dynamic.scaffold.ClassWriterStrategy;
import net.bytebuddy.dynamic.scaffold.FieldRegistry;
import net.bytebuddy.dynamic.scaffold.MethodRegistry;
import net.bytebuddy.dynamic.scaffold.RecordComponentRegistry;
import net.bytebuddy.dynamic.scaffold.TypeInitializer;
import net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.LoadedTypeInitializer;
import net.bytebuddy.implementation.attribute.AnnotationRetention;
import net.bytebuddy.implementation.attribute.AnnotationValueFilter;
import net.bytebuddy.implementation.attribute.FieldAttributeAppender;
import net.bytebuddy.implementation.attribute.MethodAttributeAppender;
import net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender;
import net.bytebuddy.implementation.attribute.TypeAttributeAppender;
import net.bytebuddy.implementation.auxiliary.a;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.constant.DefaultValue;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.AbstractC44388a;
import net.bytebuddy.jar.asm.B;
import net.bytebuddy.jar.asm.C;
import net.bytebuddy.jar.asm.f;
import net.bytebuddy.jar.asm.h;
import net.bytebuddy.jar.asm.m;
import net.bytebuddy.jar.asm.p;
import net.bytebuddy.jar.asm.r;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.jar.asm.x;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.M;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.e;
import net.bytebuddy.utility.nullability.d;

/* loaded from: classes8.dex */
public interface TypeWriter<T> {

    public interface FieldPool {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Disabled implements FieldPool {

            /* renamed from: b, reason: collision with root package name */
            public static final Disabled f417082b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Disabled[] f417083c;

            static {
                Disabled disabled = new Disabled("INSTANCE", 0);
                f417082b = disabled;
                f417083c = new Disabled[]{disabled};
            }

            public Disabled() {
                throw null;
            }

            public static Disabled valueOf(String str) {
                return (Disabled) Enum.valueOf(Disabled.class, str);
            }

            public static Disabled[] values() {
                return (Disabled[]) f417083c.clone();
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool
            public final a a(net.bytebuddy.description.field.a aVar) {
                throw new IllegalStateException("Cannot look up field from disabled pool");
            }
        }

        public interface a {

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$a$a, reason: collision with other inner class name */
            public static class C12067a implements a {

                /* renamed from: a, reason: collision with root package name */
                public final FieldAttributeAppender f417084a;

                /* renamed from: b, reason: collision with root package name */
                @HashCodeAndEqualsPlugin.ValueHandling
                @net.bytebuddy.utility.nullability.b
                public final Long f417085b;

                /* renamed from: c, reason: collision with root package name */
                public final net.bytebuddy.description.field.a f417086c;

                public C12067a(FieldAttributeAppender fieldAttributeAppender, @net.bytebuddy.utility.nullability.b Long l12, net.bytebuddy.description.field.a aVar) {
                    this.f417084a = fieldAttributeAppender;
                    this.f417085b = l12;
                    this.f417086c = aVar;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.a
                public final net.bytebuddy.description.field.a a() {
                    return this.f417086c;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.a
                public final void b(f fVar, AnnotationValueFilter.b bVar) {
                    net.bytebuddy.description.field.a aVar = this.f417086c;
                    int iD2 = aVar.d();
                    String strV = aVar.V();
                    String descriptor = aVar.getDescriptor();
                    String strH = aVar.h();
                    Long l12 = this.f417085b;
                    if (l12 == null) {
                        l12 = null;
                    }
                    m mVarG = fVar.g(iD2, strV, descriptor, strH, l12);
                    if (mVarG != null) {
                        this.f417084a.a(mVarG, aVar, bVar.d());
                        mVarG.c();
                    }
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.a
                public final boolean c() {
                    return false;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.a
                @net.bytebuddy.utility.nullability.b
                public final Object d(@net.bytebuddy.utility.nullability.b Object obj) {
                    Long l12 = this.f417085b;
                    return l12 == null ? obj : l12;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.a
                public final void e(m mVar, AnnotationValueFilter.b bVar) {
                    this.f417084a.a(mVar, this.f417086c, bVar.d());
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
                
                    if (r2 != null) goto L21;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean equals(@net.bytebuddy.utility.nullability.b java.lang.Object r5) {
                    /*
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$a$a r5 = (net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.a.C12067a) r5
                        net.bytebuddy.implementation.attribute.FieldAttributeAppender r2 = r5.f417084a
                        net.bytebuddy.implementation.attribute.FieldAttributeAppender r3 = r4.f417084a
                        boolean r2 = r3.equals(r2)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        java.lang.Long r2 = r4.f417085b
                        java.lang.Long r3 = r5.f417085b
                        if (r3 == 0) goto L2f
                        if (r2 == 0) goto L31
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L32
                        return r1
                    L2f:
                        if (r2 == 0) goto L32
                    L31:
                        return r1
                    L32:
                        net.bytebuddy.description.field.a r2 = r4.f417086c
                        net.bytebuddy.description.field.a r5 = r5.f417086c
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L3d
                        return r1
                    L3d:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.a.C12067a.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    int iHashCode = (this.f417084a.hashCode() + (getClass().hashCode() * 31)) * 31;
                    Long l12 = this.f417085b;
                    if (l12 != null) {
                        iHashCode += l12.hashCode();
                    }
                    return this.f417086c.hashCode() + (iHashCode * 31);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class b implements a {

                /* renamed from: a, reason: collision with root package name */
                public final net.bytebuddy.description.field.a f417087a;

                public b(net.bytebuddy.description.field.a aVar) {
                    this.f417087a = aVar;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.a
                public final net.bytebuddy.description.field.a a() {
                    return this.f417087a;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.a
                public final void b(f fVar, AnnotationValueFilter.b bVar) {
                    net.bytebuddy.description.field.a aVar = this.f417087a;
                    m mVarG = fVar.g(aVar.d(), aVar.V(), aVar.getDescriptor(), aVar.h(), null);
                    if (mVarG != null) {
                        FieldAttributeAppender.ForInstrumentedField.f417491b.a(mVarG, aVar, bVar.d());
                        mVarG.c();
                    }
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.a
                public final boolean c() {
                    return true;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.a
                public final Object d(@net.bytebuddy.utility.nullability.b Object obj) {
                    throw new IllegalStateException("An implicit field record does not expose a default value: " + this);
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.a
                public final void e(m mVar, AnnotationValueFilter.b bVar) {
                    throw new IllegalStateException("An implicit field record is not intended for partial application: " + this);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f417087a.equals(((b) obj).f417087a);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f417087a.hashCode() + (getClass().hashCode() * 31);
                }
            }

            net.bytebuddy.description.field.a a();

            void b(f fVar, AnnotationValueFilter.b bVar);

            boolean c();

            @net.bytebuddy.utility.nullability.b
            Object d(@net.bytebuddy.utility.nullability.b Object obj);

            void e(m mVar, AnnotationValueFilter.b bVar);
        }

        a a(net.bytebuddy.description.field.a aVar);
    }

    public interface RecordComponentPool {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Disabled implements RecordComponentPool {

            /* renamed from: b, reason: collision with root package name */
            public static final Disabled f417120b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Disabled[] f417121c;

            static {
                Disabled disabled = new Disabled("INSTANCE", 0);
                f417120b = disabled;
                f417121c = new Disabled[]{disabled};
            }

            public Disabled() {
                throw null;
            }

            public static Disabled valueOf(String str) {
                return (Disabled) Enum.valueOf(Disabled.class, str);
            }

            public static Disabled[] values() {
                return (Disabled[]) f417121c.clone();
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool
            public final a a(b bVar) {
                throw new IllegalStateException("Cannot look up record component from disabled pool");
            }
        }

        public interface a {

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.dynamic.scaffold.TypeWriter$RecordComponentPool$a$a, reason: collision with other inner class name */
            public static class C12071a implements a {
                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.a
                public final net.bytebuddy.description.type.b a() {
                    return null;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.a
                public final void b(f fVar, AnnotationValueFilter.b bVar) {
                    throw null;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.a
                public final boolean c() {
                    return false;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.a
                public final void d(x xVar, AnnotationValueFilter.b bVar) {
                    bVar.b();
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
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class b implements a {

                /* renamed from: a, reason: collision with root package name */
                public final net.bytebuddy.description.type.b f417122a;

                public b(net.bytebuddy.description.type.b bVar) {
                    this.f417122a = bVar;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.a
                public final net.bytebuddy.description.type.b a() {
                    return this.f417122a;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.a
                public final void b(f fVar, AnnotationValueFilter.b bVar) {
                    net.bytebuddy.description.type.b bVar2 = this.f417122a;
                    x xVarO = fVar.o(bVar2.R(), bVar2.getDescriptor(), bVar2.h());
                    if (xVarO != null) {
                        RecordComponentAttributeAppender.ForInstrumentedRecordComponent.f417506b.a(xVarO, bVar2, bVar.b());
                        xVarO.c();
                    }
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.a
                public final boolean c() {
                    return true;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.RecordComponentPool.a
                public final void d(x xVar, AnnotationValueFilter.b bVar) {
                    throw new IllegalStateException("An implicit field record is not intended for partial application: " + this);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f417122a.equals(((b) obj).f417122a);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f417122a.hashCode() + (getClass().hashCode() * 31);
                }
            }

            net.bytebuddy.description.type.b a();

            void b(f fVar, AnnotationValueFilter.b bVar);

            boolean c();

            void d(x xVar, AnnotationValueFilter.b bVar);
        }

        a a(b bVar);
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static abstract class Default<S> implements TypeWriter<S> {

        /* renamed from: u, reason: collision with root package name */
        @net.bytebuddy.utility.nullability.b
        public static final String f416967u;

        /* renamed from: v, reason: collision with root package name */
        public static final boolean f416968v;

        /* renamed from: a, reason: collision with root package name */
        public final TypeDescription f416969a;

        /* renamed from: b, reason: collision with root package name */
        public final ClassFileVersion f416970b;

        /* renamed from: c, reason: collision with root package name */
        public final FieldPool f416971c;

        /* renamed from: d, reason: collision with root package name */
        public final RecordComponentPool f416972d;

        /* renamed from: e, reason: collision with root package name */
        public final List<? extends net.bytebuddy.dynamic.a> f416973e;

        /* renamed from: f, reason: collision with root package name */
        public final net.bytebuddy.description.field.b<a.c> f416974f;

        /* renamed from: g, reason: collision with root package name */
        public final net.bytebuddy.description.method.b<?> f416975g;

        /* renamed from: h, reason: collision with root package name */
        public final net.bytebuddy.description.method.b<?> f416976h;

        /* renamed from: i, reason: collision with root package name */
        public final c<b.c> f416977i;

        /* renamed from: j, reason: collision with root package name */
        public final LoadedTypeInitializer f416978j;

        /* renamed from: k, reason: collision with root package name */
        public final TypeInitializer f416979k;

        /* renamed from: l, reason: collision with root package name */
        public final TypeAttributeAppender f416980l;

        /* renamed from: m, reason: collision with root package name */
        public final AsmVisitorWrapper f416981m;

        /* renamed from: n, reason: collision with root package name */
        public final AnnotationValueFilter.b f416982n;

        /* renamed from: o, reason: collision with root package name */
        public final AnnotationRetention f416983o;

        /* renamed from: p, reason: collision with root package name */
        public final a.InterfaceC12088a f416984p;

        /* renamed from: q, reason: collision with root package name */
        public final Implementation.Context.b f416985q;

        /* renamed from: r, reason: collision with root package name */
        public final TypeValidation f416986r;

        /* renamed from: s, reason: collision with root package name */
        public final ClassWriterStrategy f416987s;

        /* renamed from: t, reason: collision with root package name */
        public final TypePool f416988t;

        @HashCodeAndEqualsPlugin.Enhance
        public static class a<U> extends Default<U> {

            /* renamed from: w, reason: collision with root package name */
            public final MethodRegistry.a f417078w;

            public a(TypeDescription typeDescription, ClassFileVersion classFileVersion, FieldRegistry.Compiled compiled, MethodRegistry.a aVar, RecordComponentRegistry.Compiled compiled2, List list, net.bytebuddy.description.field.b bVar, net.bytebuddy.description.method.b bVar2, net.bytebuddy.description.method.b bVar3, c cVar, LoadedTypeInitializer loadedTypeInitializer, TypeInitializer typeInitializer, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, AnnotationValueFilter.b bVar4, AnnotationRetention annotationRetention, a.InterfaceC12088a interfaceC12088a, Implementation.Context.b bVar5, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, TypePool typePool) {
                super(typeDescription, classFileVersion, compiled, compiled2, list, bVar, bVar2, bVar3, cVar, loadedTypeInitializer, typeInitializer, typeAttributeAppender, asmVisitorWrapper, bVar4, annotationRetention, interfaceC12088a, bVar5, typeValidation, classWriterStrategy, typePool);
                this.f417078w = aVar;
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default
            @SuppressFBWarnings(justification = "Relying on correlated type properties.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public final Default<U>.b a(TypeInitializer typeInitializer, ClassDumpAction.Dispatcher dispatcher) {
                AsmVisitorWrapper asmVisitorWrapper = this.f416981m;
                int iC2 = asmVisitorWrapper.c(0);
                ClassWriterStrategy.b bVarB = this.f416987s.b(iC2, this.f416988t);
                Implementation.Context.b bVar = this.f416985q;
                TypeDescription typeDescription = this.f416969a;
                a.InterfaceC12088a interfaceC12088a = this.f416984p;
                ClassFileVersion classFileVersion = this.f416970b;
                Implementation.Context.a aVarA = bVar.a(typeDescription, interfaceC12088a, typeInitializer, classFileVersion, classFileVersion);
                f fVarB = this.f416981m.b(this.f416969a, this.f416986r.f416966b ? new ValidatingClassVisitor(e.f418981b, bVarB) : bVarB, aVarA, this.f416988t, this.f416974f, this.f416975g, iC2, asmVisitorWrapper.a(0));
                int i12 = this.f416970b.f415312b;
                TypeDescription typeDescription2 = this.f416969a;
                fVarB.c(i12, typeDescription2.f(!typeDescription2.E()), typeDescription2.V(), typeDescription2.h(), (typeDescription2.C3() == null ? TypeDescription.f416317A2 : typeDescription2.C3().f5()).V(), typeDescription2.J0().f1().t1());
                if (!typeDescription2.y3()) {
                    fVarB.k(typeDescription2.G().V());
                }
                a.d dVarE3 = typeDescription2.e3();
                if (dVarE3 != null) {
                    fVarB.m(dVarE3.n().V(), dVarE3.V(), dVarE3.getDescriptor());
                } else if (typeDescription2.H() || typeDescription2.D5()) {
                    fVarB.m(typeDescription2.H5().V(), null, null);
                }
                AnnotationValueFilter.b bVar2 = this.f416982n;
                this.f416980l.a(fVarB, typeDescription2, bVar2.a());
                if (typeDescription2.y3()) {
                    Iterator<TypeDescription> it = typeDescription2.L().P1(new M(C44411u.f(typeDescription2))).iterator();
                    while (it.hasNext()) {
                        fVarB.l(it.next().V());
                    }
                }
                Iterator<TypeDescription> it2 = typeDescription2.A2().iterator();
                while (it2.hasNext()) {
                    fVarB.n(it2.next().V());
                }
                TypeDescription typeDescriptionN = typeDescription2.n();
                if (typeDescriptionN != null) {
                    fVarB.h(typeDescription2.getModifiers(), typeDescription2.V(), typeDescriptionN.V(), typeDescription2.l0());
                } else if (typeDescription2.H()) {
                    fVarB.h(typeDescription2.getModifiers(), typeDescription2.V(), null, typeDescription2.l0());
                } else if (typeDescription2.D5()) {
                    fVarB.h(typeDescription2.getModifiers(), typeDescription2.V(), null, null);
                }
                for (TypeDescription typeDescription3 : typeDescription2.J2()) {
                    fVarB.h(typeDescription3.getModifiers(), typeDescription3.V(), typeDescription3.N4() ? typeDescription2.V() : null, typeDescription3.D5() ? null : typeDescription3.l0());
                }
                Iterator<b.c> it3 = this.f416977i.iterator();
                while (it3.hasNext()) {
                    this.f416972d.a(it3.next()).b(fVarB, bVar2);
                }
                Iterator<a.c> it4 = this.f416974f.iterator();
                while (it4.hasNext()) {
                    this.f416971c.a(it4.next()).b(fVarB, bVar2);
                }
                Iterator<?> it5 = this.f416976h.iterator();
                while (true) {
                    boolean zHasNext = it5.hasNext();
                    MethodRegistry.a aVar = this.f417078w;
                    if (!zHasNext) {
                        aVarA.d(new TypeInitializer.a.C12062a(typeDescription2, aVar, bVar2), fVarB, bVar2);
                        fVarB.f();
                        return new b(bVarB.v(), aVarA.f());
                    }
                    aVar.a((net.bytebuddy.description.method.a) it5.next()).g(fVarB, aVarA, bVar2);
                }
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default
            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f417078w.equals(((a) obj).f417078w);
                }
                return false;
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default
            public final int hashCode() {
                return this.f417078w.hashCode() + (super.hashCode() * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public class b {

            /* renamed from: a, reason: collision with root package name */
            public final byte[] f417079a;

            /* renamed from: b, reason: collision with root package name */
            public final List<? extends net.bytebuddy.dynamic.a> f417080b;

            public b(byte[] bArr, List<? extends net.bytebuddy.dynamic.a> list) {
                this.f417079a = bArr;
                this.f417080b = list;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                b bVar = (b) obj;
                return Arrays.equals(this.f417079a, bVar.f417079a) && this.f417080b.equals(bVar.f417080b) && Default.this.equals(Default.this);
            }

            public final int hashCode() {
                return Default.this.hashCode() + H.e((Arrays.hashCode(this.f417079a) + (getClass().hashCode() * 31)) * 31, 31, this.f417080b);
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:19|3)|17|7|(1:9)(1:10)|11|12|13|14|(1:(0))) */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[Catch: RuntimeException -> 0x0030, TryCatch #2 {RuntimeException -> 0x0030, blocks: (B:7:0x0019, B:9:0x0024, B:11:0x002d, B:10:0x0029), top: B:17:0x0019 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[Catch: RuntimeException -> 0x0030, TryCatch #2 {RuntimeException -> 0x0030, blocks: (B:7:0x0019, B:9:0x0024, B:11:0x002d, B:10:0x0029), top: B:17:0x0019 }] */
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
                net.bytebuddy.dynamic.scaffold.TypeWriter.Default.f416968v = r2     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.dynamic.scaffold.TypeWriter.Default.f416968v = r0
            L19:
                net.bytebuddy.utility.privilege.b r0 = new net.bytebuddy.utility.privilege.b     // Catch: java.lang.RuntimeException -> L30
                java.lang.String r2 = "net.bytebuddy.dump"
                r0.<init>(r2)     // Catch: java.lang.RuntimeException -> L30
                boolean r3 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.f416968v     // Catch: java.lang.RuntimeException -> L30
                if (r3 == 0) goto L29
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.lang.RuntimeException -> L30
                goto L2d
            L29:
                java.lang.String r0 = java.lang.System.getProperty(r2)     // Catch: java.lang.RuntimeException -> L30
            L2d:
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.RuntimeException -> L30
                r1 = r0
            L30:
                net.bytebuddy.dynamic.scaffold.TypeWriter.Default.f416967u = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.scaffold.TypeWriter.Default.<clinit>():void");
        }

        public Default(TypeDescription typeDescription, ClassFileVersion classFileVersion, FieldPool fieldPool, RecordComponentPool recordComponentPool, List<? extends net.bytebuddy.dynamic.a> list, net.bytebuddy.description.field.b<a.c> bVar, net.bytebuddy.description.method.b<?> bVar2, net.bytebuddy.description.method.b<?> bVar3, c<b.c> cVar, LoadedTypeInitializer loadedTypeInitializer, TypeInitializer typeInitializer, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, AnnotationValueFilter.b bVar4, AnnotationRetention annotationRetention, a.InterfaceC12088a interfaceC12088a, Implementation.Context.b bVar5, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, TypePool typePool) {
            this.f416969a = typeDescription;
            this.f416970b = classFileVersion;
            this.f416971c = fieldPool;
            this.f416972d = recordComponentPool;
            this.f416973e = list;
            this.f416974f = bVar;
            this.f416975g = bVar2;
            this.f416976h = bVar3;
            this.f416977i = cVar;
            this.f416978j = loadedTypeInitializer;
            this.f416979k = typeInitializer;
            this.f416980l = typeAttributeAppender;
            this.f416981m = asmVisitorWrapper;
            this.f416984p = interfaceC12088a;
            this.f416982n = bVar4;
            this.f416983o = annotationRetention;
            this.f416985q = bVar5;
            this.f416986r = typeValidation;
            this.f416987s = classWriterStrategy;
            this.f416988t = typePool;
        }

        public abstract Default<S>.b a(TypeInitializer typeInitializer, ClassDumpAction.Dispatcher dispatcher);

        @SuppressFBWarnings(justification = "Setting a debugging property should never change the program outcome.", value = {"REC_CATCH_EXCEPTION"})
        public final a.b.C12043b b(TypeResolutionStrategy.b bVar) {
            String str = f416967u;
            ClassDumpAction.Dispatcher aVar = str == null ? ClassDumpAction.Dispatcher.Disabled.f416994b : new ClassDumpAction.Dispatcher.a(str, System.currentTimeMillis());
            Default<S>.b bVarA = a(bVar.b(this.f416979k), aVar);
            aVar.a(this.f416969a, false, bVarA.f417079a);
            Default r22 = Default.this;
            return new a.b.C12043b(r22.f416969a, bVarA.f417079a, r22.f416978j, net.bytebuddy.utility.a.a(r22.f416973e, bVarA.f417080b), bVar);
        }

        public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Default r52 = (Default) obj;
            return this.f416983o.equals(r52.f416983o) && this.f416986r.equals(r52.f416986r) && this.f416969a.equals(r52.f416969a) && this.f416970b.equals(r52.f416970b) && this.f416971c.equals(r52.f416971c) && this.f416972d.equals(r52.f416972d) && this.f416973e.equals(r52.f416973e) && this.f416974f.equals(r52.f416974f) && this.f416975g.equals(r52.f416975g) && this.f416976h.equals(r52.f416976h) && this.f416977i.equals(r52.f416977i) && this.f416978j.equals(r52.f416978j) && this.f416979k.equals(r52.f416979k) && this.f416980l.equals(r52.f416980l) && this.f416981m.equals(r52.f416981m) && this.f416982n.equals(r52.f416982n) && this.f416984p.equals(r52.f416984p) && this.f416985q.equals(r52.f416985q) && this.f416987s.equals(r52.f416987s) && this.f416988t.equals(r52.f416988t);
        }

        public int hashCode() {
            return this.f416988t.hashCode() + ((this.f416987s.hashCode() + ((this.f416986r.hashCode() + ((this.f416985q.hashCode() + ((this.f416984p.hashCode() + ((this.f416983o.hashCode() + ((this.f416982n.hashCode() + ((this.f416981m.hashCode() + ((this.f416980l.hashCode() + ((this.f416979k.hashCode() + ((this.f416978j.hashCode() + ((this.f416977i.hashCode() + ((this.f416976h.hashCode() + ((this.f416975g.hashCode() + ((this.f416974f.hashCode() + H.e((this.f416972d.hashCode() + ((this.f416971c.hashCode() + ((this.f416970b.hashCode() + D8.j(this.f416969a, getClass().hashCode() * 31, 31)) * 31)) * 31)) * 31, 31, this.f416973e)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class ForInlining<U> extends Default<U> {

            /* renamed from: y, reason: collision with root package name */
            public static final /* synthetic */ int f416998y = 0;

            /* renamed from: w, reason: collision with root package name */
            public final TypeDescription f416999w;

            /* renamed from: x, reason: collision with root package name */
            public final ClassFileLocator f417000x;

            public static class a {

                /* renamed from: a, reason: collision with root package name */
                @d
                public Implementation.Context.a f417049a;
            }

            public ForInlining(TypeDescription typeDescription, ClassFileVersion classFileVersion, FieldPool fieldPool, RecordComponentPool recordComponentPool, List<? extends net.bytebuddy.dynamic.a> list, net.bytebuddy.description.field.b<a.c> bVar, net.bytebuddy.description.method.b<?> bVar2, net.bytebuddy.description.method.b<?> bVar3, c<b.c> cVar, LoadedTypeInitializer loadedTypeInitializer, TypeInitializer typeInitializer, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, AnnotationValueFilter.b bVar4, AnnotationRetention annotationRetention, a.InterfaceC12088a interfaceC12088a, Implementation.Context.b bVar5, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, TypePool typePool, TypeDescription typeDescription2, ClassFileLocator classFileLocator) {
                super(typeDescription, classFileVersion, fieldPool, recordComponentPool, list, bVar, bVar2, bVar3, cVar, loadedTypeInitializer, typeInitializer, typeAttributeAppender, asmVisitorWrapper, bVar4, annotationRetention, interfaceC12088a, bVar5, typeValidation, classWriterStrategy, typePool);
                this.f416999w = typeDescription2;
                this.f417000x = classFileLocator;
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default
            public final Default<U>.b a(TypeInitializer typeInitializer, ClassDumpAction.Dispatcher dispatcher) {
                AsmVisitorWrapper asmVisitorWrapper = this.f416981m;
                try {
                    int iC2 = asmVisitorWrapper.c(0);
                    int iA2 = asmVisitorWrapper.a(0);
                    byte[] bArrA = this.f417000x.K(this.f416999w.getName()).a();
                    dispatcher.a(this.f416969a, true, bArrA);
                    net.bytebuddy.jar.asm.e eVarA = e.a(bArrA);
                    ClassWriterStrategy.b bVarA = this.f416987s.a(iC2, eVarA, this.f416988t);
                    a aVar = new a();
                    eVarA.a(iA2, c(this.f416986r.f416966b ? new ValidatingClassVisitor(e.f418981b, bVarA) : bVarA, typeInitializer, aVar, iC2, iA2));
                    return new b(bVarA.v(), aVar.f417049a.f());
                } catch (IOException e12) {
                    throw new RuntimeException("The class file could not be written", e12);
                }
            }

            public abstract f c(f fVar, TypeInitializer typeInitializer, a aVar, int i12, int i13);

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default
            public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForInlining forInlining = (ForInlining) obj;
                return this.f416999w.equals(forInlining.f416999w) && this.f417000x.equals(forInlining.f417000x);
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default
            public int hashCode() {
                return this.f417000x.hashCode() + D8.j(this.f416999w, super.hashCode() * 31, 31);
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class WithFullProcessing<V> extends ForInlining<V> {

                /* renamed from: C, reason: collision with root package name */
                public static final Object[] f417001C = new Object[0];

                /* renamed from: A, reason: collision with root package name */
                public final Implementation.Target.a f417002A;

                /* renamed from: B, reason: collision with root package name */
                public final MethodRebaseResolver f417003B;

                /* renamed from: z, reason: collision with root package name */
                public final MethodRegistry.c f417004z;

                public static class a extends C25418b {
                }

                @SuppressFBWarnings(justification = "Field access order is implied by ASM.", value = {"UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR"})
                public class b extends net.bytebuddy.utility.visitor.d {

                    /* renamed from: g, reason: collision with root package name */
                    public final TypeInitializer f417021g;

                    /* renamed from: h, reason: collision with root package name */
                    public final a f417022h;

                    /* renamed from: i, reason: collision with root package name */
                    public final int f417023i;

                    /* renamed from: j, reason: collision with root package name */
                    public final int f417024j;

                    /* renamed from: k, reason: collision with root package name */
                    public final LinkedHashMap<c, net.bytebuddy.description.field.a> f417025k;

                    /* renamed from: l, reason: collision with root package name */
                    public final LinkedHashMap<c, net.bytebuddy.description.method.a> f417026l;

                    /* renamed from: m, reason: collision with root package name */
                    public final LinkedHashMap<String, net.bytebuddy.description.type.b> f417027m;

                    /* renamed from: n, reason: collision with root package name */
                    public final Set<String> f417028n;

                    /* renamed from: o, reason: collision with root package name */
                    public final LinkedHashMap<String, TypeDescription> f417029o;

                    /* renamed from: p, reason: collision with root package name */
                    @net.bytebuddy.utility.nullability.b
                    public final LinkedHashSet f417030p;

                    /* renamed from: q, reason: collision with root package name */
                    @net.bytebuddy.utility.nullability.d
                    public MethodRegistry.a f417031q;

                    /* renamed from: r, reason: collision with root package name */
                    @net.bytebuddy.utility.nullability.d
                    public Object f417032r;

                    /* renamed from: s, reason: collision with root package name */
                    @net.bytebuddy.utility.nullability.d
                    public Implementation.Context.a f417033s;

                    /* renamed from: t, reason: collision with root package name */
                    public boolean f417034t;

                    public class a extends m {

                        /* renamed from: c, reason: collision with root package name */
                        public final FieldPool.a f417036c;

                        public a(m mVar, FieldPool.a aVar) {
                            super(e.f418981b, mVar);
                            this.f417036c = aVar;
                        }

                        @Override // net.bytebuddy.jar.asm.m
                        @net.bytebuddy.utility.nullability.b
                        public final AbstractC44388a a(String str, boolean z12) {
                            if (WithFullProcessing.this.f416983o.f417488b) {
                                return super.a(str, z12);
                            }
                            int i12 = ForInlining.f416998y;
                            return null;
                        }

                        @Override // net.bytebuddy.jar.asm.m
                        public final void c() {
                            this.f417036c.e(this.f418235b, WithFullProcessing.this.f416982n);
                            super.c();
                        }

                        @Override // net.bytebuddy.jar.asm.m
                        @net.bytebuddy.utility.nullability.b
                        public final AbstractC44388a d(int i12, @net.bytebuddy.utility.nullability.b C c12, String str, boolean z12) {
                            if (WithFullProcessing.this.f416983o.f417488b) {
                                return super.d(i12, c12, str, z12);
                            }
                            int i13 = ForInlining.f416998y;
                            return null;
                        }
                    }

                    /* renamed from: net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$b$b, reason: collision with other inner class name */
                    public class C12065b extends s {

                        /* renamed from: d, reason: collision with root package name */
                        public final s f417038d;

                        /* renamed from: e, reason: collision with root package name */
                        public final MethodPool.Record f417039e;

                        public C12065b(s sVar, MethodPool.Record record) {
                            super(e.f418981b, sVar);
                            this.f417038d = sVar;
                            this.f417039e = record;
                            record.e(sVar);
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        @net.bytebuddy.utility.nullability.b
                        public final AbstractC44388a D(int i12, String str, boolean z12) {
                            if (WithFullProcessing.this.f416983o.f417488b) {
                                return super.D(i12, str, z12);
                            }
                            int i13 = ForInlining.f416998y;
                            return null;
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        @net.bytebuddy.utility.nullability.b
                        public final AbstractC44388a H(int i12, @net.bytebuddy.utility.nullability.b C c12, String str, boolean z12) {
                            if (WithFullProcessing.this.f416983o.f417488b) {
                                return super.H(i12, c12, str, z12);
                            }
                            int i13 = ForInlining.f416998y;
                            return null;
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        public final void d(int i12, boolean z12) {
                            if (WithFullProcessing.this.f416983o.f417488b) {
                                super.d(i12, z12);
                            }
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        @net.bytebuddy.utility.nullability.b
                        public final AbstractC44388a e(String str, boolean z12) {
                            if (WithFullProcessing.this.f416983o.f417488b) {
                                return super.e(str, z12);
                            }
                            int i12 = ForInlining.f416998y;
                            return null;
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        @net.bytebuddy.utility.nullability.b
                        public final AbstractC44388a f() {
                            int i12 = ForInlining.f416998y;
                            return null;
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        public final void h() {
                            int i12 = ForInlining.f416998y;
                            this.f418282c = null;
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        public final void i() {
                            b bVar = b.this;
                            Implementation.Context.a aVar = bVar.f417033s;
                            AnnotationValueFilter.b bVar2 = WithFullProcessing.this.f416982n;
                            MethodPool.Record record = this.f417039e;
                            s sVar = this.f417038d;
                            record.f(sVar, aVar, bVar2);
                            sVar.i();
                        }
                    }

                    public class c extends x {

                        /* renamed from: c, reason: collision with root package name */
                        public final RecordComponentPool.a f417041c;

                        public c(x xVar, RecordComponentPool.a aVar) {
                            super(e.f418981b, xVar);
                            this.f417041c = aVar;
                        }

                        @Override // net.bytebuddy.jar.asm.x
                        public final AbstractC44388a a(String str, boolean z12) {
                            if (WithFullProcessing.this.f416983o.f417488b) {
                                return super.a(str, z12);
                            }
                            int i12 = ForInlining.f416998y;
                            return null;
                        }

                        @Override // net.bytebuddy.jar.asm.x
                        public final void c() {
                            this.f417041c.d(this.f418354b, WithFullProcessing.this.f416982n);
                            super.c();
                        }

                        @Override // net.bytebuddy.jar.asm.x
                        public final AbstractC44388a d(int i12, C c12, String str, boolean z12) {
                            if (WithFullProcessing.this.f416983o.f417488b) {
                                return super.d(i12, c12, str, z12);
                            }
                            int i13 = ForInlining.f416998y;
                            return null;
                        }
                    }

                    public class d extends s {

                        /* renamed from: d, reason: collision with root package name */
                        public final s f417043d;

                        /* renamed from: e, reason: collision with root package name */
                        public final MethodPool.Record f417044e;

                        /* renamed from: f, reason: collision with root package name */
                        public final MethodRebaseResolver.b f417045f;

                        public d(s sVar, MethodPool.Record record, MethodRebaseResolver.b bVar) {
                            super(e.f418981b, sVar);
                            this.f417043d = sVar;
                            this.f417044e = record;
                            this.f417045f = bVar;
                            record.e(sVar);
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        @net.bytebuddy.utility.nullability.b
                        public final AbstractC44388a D(int i12, String str, boolean z12) {
                            if (WithFullProcessing.this.f416983o.f417488b) {
                                return super.D(i12, str, z12);
                            }
                            int i13 = ForInlining.f416998y;
                            return null;
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        @net.bytebuddy.utility.nullability.b
                        public final AbstractC44388a H(int i12, @net.bytebuddy.utility.nullability.b C c12, String str, boolean z12) {
                            if (WithFullProcessing.this.f416983o.f417488b) {
                                return super.H(i12, c12, str, z12);
                            }
                            int i13 = ForInlining.f416998y;
                            return null;
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        public final void d(int i12, boolean z12) {
                            if (WithFullProcessing.this.f416983o.f417488b) {
                                super.d(i12, z12);
                            }
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        @net.bytebuddy.utility.nullability.b
                        public final AbstractC44388a e(String str, boolean z12) {
                            if (WithFullProcessing.this.f416983o.f417488b) {
                                return super.e(str, z12);
                            }
                            int i12 = ForInlining.f416998y;
                            return null;
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        @net.bytebuddy.utility.nullability.b
                        public final AbstractC44388a f() {
                            int i12 = ForInlining.f416998y;
                            return null;
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        public final void h() {
                            b bVar = b.this;
                            Implementation.Context.a aVar = bVar.f417033s;
                            AnnotationValueFilter.b bVar2 = WithFullProcessing.this.f416982n;
                            MethodPool.Record record = this.f417044e;
                            s sVar = this.f417043d;
                            record.f(sVar, aVar, bVar2);
                            sVar.i();
                            MethodRebaseResolver.b bVar3 = this.f417045f;
                            if (!bVar3.c()) {
                                int i12 = ForInlining.f416998y;
                                this.f418282c = null;
                                super.h();
                                return;
                            }
                            this.f418282c = bVar.f418175c.i(bVar3.b().d(), bVar3.b().V(), bVar3.b().getDescriptor(), bVar3.b().h(), bVar3.b().N().f1().t1());
                            super.h();
                            if (!bVar3.a().isEmpty() && (bVar.f417023i & 2) == 0 && bVar.f417033s.b().c(ClassFileVersion.f415296h)) {
                                int i13 = bVar.f417024j;
                                if ((i13 & 8) != 0 || bVar3.a().size() >= 4) {
                                    int size = (bVar3.b().getParameters().size() - bVar3.a().size()) + 1;
                                    Object[] objArr = new Object[size];
                                    objArr[0] = 6;
                                    for (int i14 = 1; i14 < size; i14++) {
                                        TypeDescription.Generic type = ((c.InterfaceC11982c) bVar3.b().getParameters().get(i14 - 1)).getType();
                                        if (type.Q2(Boolean.TYPE) || type.Q2(Byte.TYPE) || type.Q2(Short.TYPE) || type.Q2(Character.TYPE) || type.Q2(Integer.TYPE)) {
                                            objArr[i14] = 1;
                                        } else if (type.Q2(Long.TYPE)) {
                                            objArr[i14] = 4;
                                        } else if (type.Q2(Float.TYPE)) {
                                            objArr[i14] = 2;
                                        } else if (type.Q2(Double.TYPE)) {
                                            objArr[i14] = 3;
                                        } else {
                                            objArr[i14] = type.f5().V();
                                        }
                                    }
                                    k(objArr, (i13 & 8) == 0 ? 0 : -1, WithFullProcessing.f417001C, size, 0);
                                } else {
                                    int size2 = bVar3.a().size();
                                    Object[] objArr2 = WithFullProcessing.f417001C;
                                    k(objArr2, 2, objArr2, size2, 0);
                                }
                                m(0);
                            }
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        public final void y(int i12, int i13) {
                            super.y(i12, Math.max(i13, this.f417045f.b().p()));
                        }
                    }

                    public b(f fVar, TypeInitializer typeInitializer, a aVar, int i12, int i13) {
                        super(e.f418981b, fVar);
                        this.f417021g = typeInitializer;
                        this.f417022h = aVar;
                        this.f417023i = i12;
                        this.f417024j = i13;
                        this.f417025k = new LinkedHashMap<>((int) Math.ceil(WithFullProcessing.this.f416974f.size() / 0.75d));
                        for (a.c cVar : WithFullProcessing.this.f416974f) {
                            this.f417025k.put(new c(cVar.V(), cVar.getDescriptor()), cVar);
                        }
                        net.bytebuddy.description.method.b<?> bVar = WithFullProcessing.this.f416976h;
                        this.f417026l = new LinkedHashMap<>((int) Math.ceil(bVar.size() / 0.75d));
                        Iterator<?> it = bVar.iterator();
                        while (it.hasNext()) {
                            net.bytebuddy.description.method.a aVar2 = (net.bytebuddy.description.method.a) it.next();
                            this.f417026l.put(new c(aVar2.V(), aVar2.getDescriptor()), aVar2);
                        }
                        net.bytebuddy.description.type.c<b.c> cVar2 = WithFullProcessing.this.f416977i;
                        this.f417027m = new LinkedHashMap<>((int) Math.ceil(cVar2.size() / 0.75d));
                        for (b.c cVar3 : cVar2) {
                            this.f417027m.put(cVar3.R(), cVar3);
                        }
                        TypeDescription typeDescription = WithFullProcessing.this.f416969a;
                        if (typeDescription.y3()) {
                            this.f417028n = new LinkedHashSet((int) Math.ceil(typeDescription.L().size() / 0.75d));
                            Iterator<TypeDescription> it2 = typeDescription.L().P1(new M(C44411u.f(typeDescription))).iterator();
                            while (it2.hasNext()) {
                                this.f417028n.add(it2.next().V());
                            }
                        } else {
                            this.f417028n = Collections.emptySet();
                        }
                        this.f417029o = new LinkedHashMap<>((int) Math.ceil(typeDescription.J2().size() / 0.75d));
                        for (TypeDescription typeDescription2 : typeDescription.J2()) {
                            this.f417029o.put(typeDescription2.V(), typeDescription2);
                        }
                        if (!typeDescription.B()) {
                            this.f417030p = null;
                            return;
                        }
                        this.f417030p = new LinkedHashSet((int) Math.ceil(typeDescription.A2().size() / 0.75d));
                        Iterator<TypeDescription> it3 = typeDescription.A2().iterator();
                        while (it3.hasNext()) {
                            this.f417030p.add(it3.next().V());
                        }
                    }

                    @Override // net.bytebuddy.utility.visitor.d
                    public final void A(int i12, String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3) {
                        String strV;
                        WithFullProcessing withFullProcessing = WithFullProcessing.this;
                        if (str.equals(withFullProcessing.f416969a.V())) {
                            return;
                        }
                        TypeDescription typeDescriptionRemove = this.f417029o.remove(str);
                        if (typeDescriptionRemove == null) {
                            this.f418175c.h(i12, str, str2, str3);
                            return;
                        }
                        f fVar = this.f418175c;
                        String strL0 = null;
                        if (typeDescriptionRemove.N4() || (str2 != null && str3 == null && typeDescriptionRemove.D5())) {
                            strV = withFullProcessing.f416969a.V();
                        } else {
                            String str4 = Default.f416967u;
                            strV = null;
                        }
                        if (typeDescriptionRemove.D5()) {
                            String str5 = Default.f416967u;
                        } else {
                            strL0 = typeDescriptionRemove.l0();
                        }
                        fVar.h(typeDescriptionRemove.getModifiers(), str, strV, strL0);
                    }

                    @Override // net.bytebuddy.utility.visitor.d
                    @net.bytebuddy.utility.nullability.b
                    public final s B(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String[] strArr) {
                        s aVar;
                        boolean zEquals = str.equals("<clinit>");
                        WithFullProcessing withFullProcessing = WithFullProcessing.this;
                        s dVar = null;
                        if (zEquals) {
                            s sVarI = this.f418175c.i(i12, str, str2, str3, strArr);
                            if (sVarI == null) {
                                int i13 = ForInlining.f416998y;
                            } else {
                                boolean zIsEnabled = this.f417033s.isEnabled();
                                TypeDescription typeDescription = withFullProcessing.f416969a;
                                MethodRegistry.a aVar2 = this.f417031q;
                                boolean z12 = (this.f417023i & 2) == 0 && this.f417033s.b().c(ClassFileVersion.f415296h);
                                boolean z13 = (this.f417024j & 8) != 0;
                                AnnotationValueFilter.b bVar = withFullProcessing.f416982n;
                                if (zIsEnabled) {
                                    MethodPool.Record recordA = aVar2.a(new a.f.C11977a(typeDescription));
                                    aVar = recordA.o().f417093c ? new InitializationHandler.Appending.a.C12063a(sVarI, typeDescription, recordA, bVar, z12, z13) : new InitializationHandler.Appending.a.b(sVarI, typeDescription, recordA, bVar, z12, z13);
                                } else {
                                    MethodPool.Record recordA2 = aVar2.a(new a.f.C11977a(typeDescription));
                                    aVar = recordA2.o().f417093c ? new InitializationHandler.Appending.b.a(sVarI, typeDescription, recordA2, bVar, z12, z13) : new InitializationHandler.Appending.b.C12064b(sVarI, typeDescription, recordA2, bVar, false, false);
                                }
                                dVar = aVar;
                                this.f417032r = dVar;
                            }
                            return dVar;
                        }
                        net.bytebuddy.description.method.a aVarRemove = this.f417026l.remove(new c(str, str2));
                        if (aVarRemove == null) {
                            return this.f418175c.i(i12, str, str2, str3, strArr);
                        }
                        boolean z14 = (i12 & 1024) != 0;
                        MethodPool.Record recordA3 = this.f417031q.a(aVarRemove);
                        if (recordA3.o().f417092b) {
                            net.bytebuddy.description.method.a method = recordA3.getMethod();
                            f fVar = this.f418175c;
                            int iA2 = new a.e(Collections.singleton(recordA3.getVisibility())).a(method.f(recordA3.o().f417093c)) | I(i12);
                            String strV = method.V();
                            String descriptor = method.getDescriptor();
                            boolean z15 = TypeDescription.b.f416496c;
                            s sVarI2 = fVar.i(iA2, strV, descriptor, z15 ? str3 : method.h(), method.N().f1().t1());
                            if (sVarI2 == null) {
                                int i14 = ForInlining.f416998y;
                            } else if (z14) {
                                dVar = new C12065b(sVarI2, recordA3);
                            } else if (aVarRemove.m0()) {
                                MethodRebaseResolver.b bVarA = withFullProcessing.f417003B.a(method.i());
                                if (bVarA.c()) {
                                    s sVarI3 = i(I(i12) | bVarA.b().d(), bVarA.b().V(), bVarA.b().getDescriptor(), z15 ? str3 : method.h(), bVarA.b().N().f1().t1());
                                    if (sVarI3 != null) {
                                        sVarI3.i();
                                    }
                                }
                                dVar = new C12065b(sVarI2, recordA3);
                            } else {
                                dVar = new d(sVarI2, recordA3, withFullProcessing.f417003B.a(method.i()));
                            }
                        } else {
                            dVar = this.f418175c.i(aVarRemove.d() | I(i12), aVarRemove.V(), aVarRemove.getDescriptor(), TypeDescription.b.f416496c ? str3 : aVarRemove.h(), aVarRemove.N().f1().t1());
                        }
                        return dVar;
                    }

                    @Override // net.bytebuddy.utility.visitor.d
                    public final void C(String str) {
                        v();
                    }

                    @Override // net.bytebuddy.utility.visitor.d
                    public final void D(String str) {
                        if (WithFullProcessing.this.f416969a.y3() && this.f417028n.remove(str)) {
                            this.f418175c.l(str);
                        }
                    }

                    @Override // net.bytebuddy.utility.visitor.d
                    public final void E(String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3) {
                        try {
                            w();
                        } catch (Throwable unused) {
                            this.f418175c.m(str, str2, str3);
                        }
                    }

                    @Override // net.bytebuddy.utility.visitor.d
                    public final void F(String str) {
                        LinkedHashSet linkedHashSet = this.f417030p;
                        if (linkedHashSet == null || !linkedHashSet.remove(str)) {
                            return;
                        }
                        this.f418175c.n(str);
                    }

                    @Override // net.bytebuddy.utility.visitor.d
                    @net.bytebuddy.utility.nullability.b
                    public final x G(String str, String str2, @net.bytebuddy.utility.nullability.b String str3) {
                        net.bytebuddy.description.type.b bVarRemove = this.f417027m.remove(str);
                        if (bVarRemove != null) {
                            RecordComponentPool.a aVarA = WithFullProcessing.this.f416972d.a(bVarRemove);
                            if (!aVarA.c()) {
                                net.bytebuddy.description.type.b bVarA = aVarA.a();
                                f fVar = this.f418175c;
                                String strR = bVarA.R();
                                String descriptor = bVarA.getDescriptor();
                                if (!TypeDescription.b.f416496c) {
                                    str3 = bVarA.h();
                                }
                                x xVarO = fVar.o(strR, descriptor, str3);
                                if (xVarO != null) {
                                    return new c(xVarO, aVarA);
                                }
                                int i12 = ForInlining.f416998y;
                                return null;
                            }
                        }
                        return this.f418175c.o(str, str2, str3);
                    }

                    @Override // net.bytebuddy.utility.visitor.d
                    @net.bytebuddy.utility.nullability.b
                    public final AbstractC44388a H(int i12, C c12, String str, boolean z12) {
                        if (WithFullProcessing.this.f416983o.f417488b) {
                            return this.f418175c.q(i12, c12, str, z12);
                        }
                        int i13 = ForInlining.f416998y;
                        return null;
                    }

                    public final int I(int i12) {
                        return (!this.f417034t || (i12 & 131072) == 0) ? 0 : 131072;
                    }

                    @Override // net.bytebuddy.jar.asm.f
                    @SuppressFBWarnings(justification = "Relying on correlated type properties.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public final void c(int i12, int i13, String str, String str2, String str3, String[] strArr) {
                        String strV;
                        ClassFileVersion classFileVersionF = ClassFileVersion.f(i12);
                        WithFullProcessing withFullProcessing = WithFullProcessing.this;
                        MethodRegistry.b.a aVarA = withFullProcessing.f417004z.a(withFullProcessing.f417002A, classFileVersionF);
                        this.f417031q = aVarA;
                        TypeDescription typeDescription = withFullProcessing.f416969a;
                        this.f417032r = new InitializationHandler.a(typeDescription, aVarA, withFullProcessing.f416982n);
                        this.f417033s = withFullProcessing.f416985q.a(typeDescription, withFullProcessing.f416984p, this.f417021g, classFileVersionF, withFullProcessing.f416970b);
                        this.f417034t = classFileVersionF.d(ClassFileVersion.f415295g);
                        Implementation.Context.a aVar = this.f417033s;
                        this.f417022h.f417049a = aVar;
                        f fVarB = withFullProcessing.f416981m.b(withFullProcessing.f416969a, this.f418175c, aVar, withFullProcessing.f416988t, withFullProcessing.f416974f, withFullProcessing.f416975g, this.f417023i, this.f417024j);
                        this.f418175c = fVarB;
                        int i14 = i13 & 32;
                        TypeDescription typeDescription2 = withFullProcessing.f416969a;
                        int i15 = 0;
                        int iF2 = typeDescription2.f((i14 == 0 || typeDescription2.E()) ? false : true) | I(i13);
                        if ((i13 & 16) != 0 && typeDescription2.D5()) {
                            i15 = 16;
                        }
                        int i16 = iF2 | i15;
                        String strV2 = typeDescription2.V();
                        String strH = TypeDescription.b.f416496c ? str2 : typeDescription2.h();
                        if (typeDescription2.C3() != null) {
                            strV = typeDescription2.C3().f5().V();
                        } else if (typeDescription2.E()) {
                            strV = TypeDescription.f416317A2.V();
                        } else {
                            String str4 = Default.f416967u;
                            strV = null;
                        }
                        fVarB.c(i12, i16, strV2, strH, strV, typeDescription2.J0().f1().t1());
                    }

                    @Override // net.bytebuddy.utility.visitor.d
                    public final void u() {
                        WithFullProcessing withFullProcessing = WithFullProcessing.this;
                        withFullProcessing.f416980l.a(this.f418175c, withFullProcessing.f416969a, withFullProcessing.f416982n.a());
                    }

                    @Override // net.bytebuddy.utility.visitor.d
                    public final void v() {
                        WithFullProcessing withFullProcessing = WithFullProcessing.this;
                        if (withFullProcessing.f416969a.y3()) {
                            return;
                        }
                        this.f418175c.k(withFullProcessing.f416969a.G().V());
                    }

                    @Override // net.bytebuddy.utility.visitor.d
                    @SuppressFBWarnings(justification = "Relying on correlated type properties.", value = {"NP_NULL_ON_SOME_PATH"})
                    public final void w() {
                        WithFullProcessing withFullProcessing = WithFullProcessing.this;
                        a.d dVarE3 = withFullProcessing.f416969a.e3();
                        if (dVarE3 != null) {
                            this.f418175c.m(dVarE3.n().V(), dVarE3.V(), dVarE3.getDescriptor());
                            return;
                        }
                        TypeDescription typeDescription = withFullProcessing.f416969a;
                        if (typeDescription.H() || typeDescription.D5()) {
                            f fVar = this.f418175c;
                            String strV = typeDescription.H5().V();
                            String str = Default.f416967u;
                            fVar.m(strV, null, null);
                        }
                    }

                    @Override // net.bytebuddy.utility.visitor.d
                    @net.bytebuddy.utility.nullability.b
                    public final AbstractC44388a x(String str, boolean z12) {
                        if (WithFullProcessing.this.f416983o.f417488b) {
                            return this.f418175c.d(str, z12);
                        }
                        int i12 = ForInlining.f416998y;
                        return null;
                    }

                    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler] */
                    @Override // net.bytebuddy.utility.visitor.d
                    public final void y() {
                        AnnotationValueFilter.b bVar;
                        String strV;
                        String strL0;
                        Iterator<String> it = this.f417028n.iterator();
                        while (it.hasNext()) {
                            this.f418175c.l(it.next());
                        }
                        LinkedHashSet linkedHashSet = this.f417030p;
                        if (linkedHashSet != null) {
                            Iterator it2 = linkedHashSet.iterator();
                            while (it2.hasNext()) {
                                this.f418175c.n((String) it2.next());
                            }
                        }
                        WithFullProcessing withFullProcessing = WithFullProcessing.this;
                        TypeDescription typeDescriptionN = withFullProcessing.f416969a.n();
                        TypeDescription typeDescription = withFullProcessing.f416969a;
                        if (typeDescriptionN != null) {
                            this.f418175c.h(typeDescription.getModifiers(), typeDescription.V(), typeDescriptionN.V(), typeDescription.l0());
                        } else if (typeDescription.H()) {
                            f fVar = this.f418175c;
                            String strV2 = typeDescription.V();
                            String str = Default.f416967u;
                            fVar.h(typeDescription.getModifiers(), strV2, null, typeDescription.l0());
                        } else if (typeDescription.D5()) {
                            f fVar2 = this.f418175c;
                            String strV3 = typeDescription.V();
                            String str2 = Default.f416967u;
                            fVar2.h(typeDescription.getModifiers(), strV3, null, null);
                        }
                        for (TypeDescription typeDescription2 : this.f417029o.values()) {
                            f fVar3 = this.f418175c;
                            String strV4 = typeDescription2.V();
                            if (typeDescription2.N4()) {
                                strV = typeDescription.V();
                            } else {
                                String str3 = Default.f416967u;
                                strV = null;
                            }
                            if (typeDescription2.D5()) {
                                String str4 = Default.f416967u;
                                strL0 = null;
                            } else {
                                strL0 = typeDescription2.l0();
                            }
                            fVar3.h(typeDescription2.getModifiers(), strV4, strV, strL0);
                        }
                        Iterator<net.bytebuddy.description.type.b> it3 = this.f417027m.values().iterator();
                        while (true) {
                            boolean zHasNext = it3.hasNext();
                            bVar = withFullProcessing.f416982n;
                            if (!zHasNext) {
                                break;
                            }
                            withFullProcessing.f416972d.a(it3.next()).b(this.f418175c, bVar);
                        }
                        Iterator<net.bytebuddy.description.field.a> it4 = this.f417025k.values().iterator();
                        while (it4.hasNext()) {
                            withFullProcessing.f416971c.a(it4.next()).b(this.f418175c, bVar);
                        }
                        Iterator<net.bytebuddy.description.method.a> it5 = this.f417026l.values().iterator();
                        while (it5.hasNext()) {
                            this.f417031q.a(it5.next()).g(this.f418175c, this.f417033s, bVar);
                        }
                        this.f417032r.a(this.f418175c, this.f417033s);
                        this.f418175c.f();
                    }

                    @Override // net.bytebuddy.utility.visitor.d
                    @net.bytebuddy.utility.nullability.b
                    public final m z(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b Object obj) {
                        net.bytebuddy.description.field.a aVarRemove = this.f417025k.remove(new c(str, str2));
                        if (aVarRemove != null) {
                            FieldPool.a aVarA = WithFullProcessing.this.f416971c.a(aVarRemove);
                            if (!aVarA.c()) {
                                net.bytebuddy.description.field.a aVarA2 = aVarA.a();
                                f fVar = this.f418175c;
                                int iD2 = aVarA2.d() | I(i12);
                                String strV = aVarA2.V();
                                String descriptor = aVarA2.getDescriptor();
                                if (!TypeDescription.b.f416496c) {
                                    str3 = aVarA2.h();
                                }
                                m mVarG = fVar.g(iD2, strV, descriptor, str3, aVarA.d(obj));
                                if (mVarG != null) {
                                    return new a(mVarG, aVarA);
                                }
                                int i13 = ForInlining.f416998y;
                                return null;
                            }
                        }
                        return this.f418175c.g(i12, str, str2, str3, obj);
                    }
                }

                public static class c {

                    /* renamed from: a, reason: collision with root package name */
                    public final String f417047a;

                    /* renamed from: b, reason: collision with root package name */
                    public final String f417048b;

                    public c(String str, String str2) {
                        this.f417047a = str;
                        this.f417048b = str2;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        c cVar = (c) obj;
                        return this.f417047a.equals(cVar.f417047a) && this.f417048b.equals(cVar.f417048b);
                    }

                    public final int hashCode() {
                        return (this.f417048b.hashCode() * 31) + this.f417047a.hashCode() + 17;
                    }
                }

                public WithFullProcessing(TypeDescription typeDescription, ClassFileVersion classFileVersion, FieldRegistry.Compiled compiled, RecordComponentRegistry.Compiled compiled2, List list, net.bytebuddy.description.field.b bVar, net.bytebuddy.description.method.b bVar2, net.bytebuddy.description.method.b bVar3, net.bytebuddy.description.type.c cVar, LoadedTypeInitializer loadedTypeInitializer, TypeInitializer typeInitializer, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, AnnotationValueFilter.b bVar4, AnnotationRetention annotationRetention, a.InterfaceC12088a interfaceC12088a, Implementation.Context.b bVar5, TypeValidation typeValidation, ClassWriterStrategy classWriterStrategy, TypePool typePool, TypeDescription typeDescription2, ClassFileLocator classFileLocator, MethodRegistry.c cVar2, Implementation.Target.a aVar, MethodRebaseResolver methodRebaseResolver) {
                    super(typeDescription, classFileVersion, compiled, compiled2, list, bVar, bVar2, bVar3, cVar, loadedTypeInitializer, typeInitializer, typeAttributeAppender, asmVisitorWrapper, bVar4, annotationRetention, interfaceC12088a, bVar5, typeValidation, classWriterStrategy, typePool, typeDescription2, classFileLocator);
                    this.f417004z = cVar2;
                    this.f417002A = aVar;
                    this.f417003B = methodRebaseResolver;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining
                public final f c(f fVar, TypeInitializer typeInitializer, a aVar, int i12, int i13) {
                    b bVar = new b(fVar, typeInitializer, aVar, i12, i13);
                    TypeDescription typeDescription = this.f416999w;
                    String name = typeDescription.getName();
                    TypeDescription typeDescription2 = this.f416969a;
                    if (name.equals(typeDescription2.getName())) {
                        return bVar;
                    }
                    return new a(e.f418981b, bVar, new j(typeDescription.V(), typeDescription2.V()));
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining, net.bytebuddy.dynamic.scaffold.TypeWriter.Default
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
                    WithFullProcessing withFullProcessing = (WithFullProcessing) obj;
                    return this.f417004z.equals(withFullProcessing.f417004z) && this.f417002A.equals(withFullProcessing.f417002A) && this.f417003B.equals(withFullProcessing.f417003B);
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining, net.bytebuddy.dynamic.scaffold.TypeWriter.Default
                public final int hashCode() {
                    return this.f417003B.hashCode() + ((this.f417002A.hashCode() + ((this.f417004z.hashCode() + (super.hashCode() * 31)) * 31)) * 31);
                }

                public interface InitializationHandler {

                    public static class a extends TypeInitializer.a.C12062a implements InitializationHandler {
                        @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler
                        public final void a(f fVar, Implementation.Context.a aVar) {
                            aVar.d(this, fVar, this.f416961d);
                        }
                    }

                    void a(f fVar, Implementation.Context.a aVar);

                    public static abstract class Appending extends s implements InitializationHandler, TypeInitializer.a {

                        /* renamed from: d, reason: collision with root package name */
                        public final TypeDescription f417005d;

                        /* renamed from: e, reason: collision with root package name */
                        public final MethodPool.Record f417006e;

                        /* renamed from: f, reason: collision with root package name */
                        public final AnnotationValueFilter.b f417007f;

                        /* renamed from: g, reason: collision with root package name */
                        public final FrameWriter f417008g;

                        /* renamed from: h, reason: collision with root package name */
                        public int f417009h;

                        /* renamed from: i, reason: collision with root package name */
                        public int f417010i;

                        public Appending(s sVar, TypeDescription typeDescription, MethodPool.Record record, AnnotationValueFilter.b bVar, boolean z12, boolean z13) {
                            super(e.f418981b, sVar);
                            this.f417005d = typeDescription;
                            this.f417006e = record;
                            this.f417007f = bVar;
                            if (!z12) {
                                this.f417008g = FrameWriter.NoOp.f417014b;
                            } else if (z13) {
                                this.f417008g = FrameWriter.Expanding.f417012b;
                            } else {
                                this.f417008g = new FrameWriter.a();
                            }
                        }

                        public abstract void K(Implementation.Context.a.AbstractC12078a abstractC12078a);

                        public abstract void L();

                        @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler
                        public final void a(f fVar, Implementation.Context.a aVar) {
                            aVar.d(this, fVar, this.f417007f);
                            this.f418282c.y(this.f417009h, this.f417010i);
                            this.f418282c.i();
                        }

                        @Override // net.bytebuddy.dynamic.scaffold.TypeInitializer.a
                        public final void b(f fVar, TypeInitializer typeInitializer, Implementation.Context.a.AbstractC12078a abstractC12078a) {
                            a.c cVarH = typeInitializer.h(this.f418282c, abstractC12078a, new a.f.C11977a(this.f417005d));
                            this.f417009h = Math.max(this.f417009h, cVarH.f417849a);
                            this.f417010i = Math.max(this.f417010i, cVarH.f417850b);
                            K(abstractC12078a);
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        public final void h() {
                            this.f417006e.c(this.f418282c, this.f417007f);
                            super.h();
                            L();
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        public final void k(@net.bytebuddy.utility.nullability.b Object[] objArr, int i12, @net.bytebuddy.utility.nullability.b Object[] objArr2, int i13, int i14) {
                            super.k(objArr, i12, objArr2, i13, i14);
                            this.f417008g.a(i12, i13);
                        }

                        @Override // net.bytebuddy.jar.asm.s
                        public final void y(int i12, int i13) {
                            this.f417009h = i12;
                            this.f417010i = i13;
                        }

                        public static abstract class b extends Appending {

                            public static class a extends b {

                                /* renamed from: j, reason: collision with root package name */
                                public final r f417020j;

                                public a(s sVar, TypeDescription typeDescription, MethodPool.Record record, AnnotationValueFilter.b bVar, boolean z12, boolean z13) {
                                    super(sVar, typeDescription, record, bVar, z12, z13);
                                    this.f417020j = new r();
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending
                                public final void K(Implementation.Context.a.AbstractC12078a abstractC12078a) {
                                    this.f418282c.s(this.f417020j);
                                    this.f417008g.b(this.f418282c);
                                    a.c cVarI = this.f417006e.i(this.f418282c, abstractC12078a);
                                    this.f417009h = Math.max(this.f417009h, cVarI.f417849a);
                                    this.f417010i = Math.max(this.f417010i, cVarI.f417850b);
                                }

                                @Override // net.bytebuddy.jar.asm.s
                                public final void m(int i12) {
                                    if (i12 == 177) {
                                        this.f418282c.r(167, this.f417020j);
                                    } else {
                                        super.m(i12);
                                    }
                                }
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending
                            public final void L() {
                            }

                            @Override // net.bytebuddy.jar.asm.s
                            public final void i() {
                            }

                            /* renamed from: net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$b$b, reason: collision with other inner class name */
                            public static class C12064b extends b {
                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending
                                public final void K(Implementation.Context.a.AbstractC12078a abstractC12078a) {
                                }
                            }
                        }

                        public interface FrameWriter {

                            /* renamed from: I2, reason: collision with root package name */
                            public static final Object[] f417011I2 = new Object[0];

                            public static class a implements FrameWriter {

                                /* renamed from: b, reason: collision with root package name */
                                public int f417016b;

                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter
                                public final void a(int i12, int i13) {
                                    if (i12 == -1 || i12 == 0) {
                                        this.f417016b = i13;
                                        return;
                                    }
                                    if (i12 == 1) {
                                        this.f417016b += i13;
                                    } else if (i12 == 2) {
                                        this.f417016b -= i13;
                                    } else if (i12 != 3 && i12 != 4) {
                                        throw new IllegalStateException(AK.c.g(i12, "Unexpected frame type: "));
                                    }
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter
                                public final void b(s sVar) {
                                    int i12 = this.f417016b;
                                    Object[] objArr = FrameWriter.f417011I2;
                                    if (i12 == 0) {
                                        sVar.k(objArr, 3, objArr, 0, 0);
                                    } else if (i12 > 3) {
                                        sVar.k(objArr, 0, objArr, 0, 0);
                                    } else {
                                        sVar.k(objArr, 2, objArr, i12, 0);
                                    }
                                    sVar.m(0);
                                    this.f417016b = 0;
                                }
                            }

                            void a(int i12, int i13);

                            void b(s sVar);

                            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                            public static final class NoOp implements FrameWriter {

                                /* renamed from: b, reason: collision with root package name */
                                public static final NoOp f417014b;

                                /* renamed from: c, reason: collision with root package name */
                                public static final /* synthetic */ NoOp[] f417015c;

                                static {
                                    NoOp noOp = new NoOp("INSTANCE", 0);
                                    f417014b = noOp;
                                    f417015c = new NoOp[]{noOp};
                                }

                                public NoOp() {
                                    throw null;
                                }

                                public static NoOp valueOf(String str) {
                                    return (NoOp) Enum.valueOf(NoOp.class, str);
                                }

                                public static NoOp[] values() {
                                    return (NoOp[]) f417015c.clone();
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter
                                public final void b(s sVar) {
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter
                                public final void a(int i12, int i13) {
                                }
                            }

                            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                            public static final class Expanding implements FrameWriter {

                                /* renamed from: b, reason: collision with root package name */
                                public static final Expanding f417012b;

                                /* renamed from: c, reason: collision with root package name */
                                public static final /* synthetic */ Expanding[] f417013c;

                                static {
                                    Expanding expanding = new Expanding("INSTANCE", 0);
                                    f417012b = expanding;
                                    f417013c = new Expanding[]{expanding};
                                }

                                public Expanding() {
                                    throw null;
                                }

                                public static Expanding valueOf(String str) {
                                    return (Expanding) Enum.valueOf(Expanding.class, str);
                                }

                                public static Expanding[] values() {
                                    return (Expanding[]) f417013c.clone();
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter
                                public final void b(s sVar) {
                                    Object[] objArr = FrameWriter.f417011I2;
                                    sVar.k(objArr, -1, objArr, 0, 0);
                                    sVar.m(0);
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.FrameWriter
                                public final void a(int i12, int i13) {
                                }
                            }
                        }

                        public static abstract class a extends Appending {

                            /* renamed from: j, reason: collision with root package name */
                            public final r f417017j;

                            /* renamed from: k, reason: collision with root package name */
                            public final r f417018k;

                            /* renamed from: net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$WithFullProcessing$InitializationHandler$Appending$a$a, reason: collision with other inner class name */
                            public static class C12063a extends a {

                                /* renamed from: l, reason: collision with root package name */
                                public final r f417019l;

                                public C12063a(s sVar, TypeDescription typeDescription, MethodPool.Record record, AnnotationValueFilter.b bVar, boolean z12, boolean z13) {
                                    super(sVar, typeDescription, record, bVar, z12, z13);
                                    this.f417019l = new r();
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.a
                                public final void M(Implementation.Context.a.AbstractC12078a abstractC12078a) {
                                    this.f418282c.s(this.f417019l);
                                    this.f417008g.b(this.f418282c);
                                    a.c cVarI = this.f417006e.i(this.f418282c, abstractC12078a);
                                    this.f417009h = Math.max(this.f417009h, cVarI.f417849a);
                                    this.f417010i = Math.max(this.f417010i, cVarI.f417850b);
                                }

                                @Override // net.bytebuddy.jar.asm.s
                                public final void m(int i12) {
                                    if (i12 == 177) {
                                        this.f418282c.r(167, this.f417019l);
                                    } else {
                                        super.m(i12);
                                    }
                                }
                            }

                            public a(s sVar, TypeDescription typeDescription, MethodPool.Record record, AnnotationValueFilter.b bVar, boolean z12, boolean z13) {
                                super(sVar, typeDescription, record, bVar, z12, z13);
                                this.f417017j = new r();
                                this.f417018k = new r();
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending
                            public final void K(Implementation.Context.a.AbstractC12078a abstractC12078a) {
                                this.f418282c.r(167, this.f417018k);
                                M(abstractC12078a);
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending
                            public final void L() {
                                this.f418282c.r(167, this.f417017j);
                                this.f418282c.s(this.f417018k);
                                this.f417008g.b(this.f418282c);
                            }

                            public abstract void M(Implementation.Context.a.AbstractC12078a abstractC12078a);

                            @Override // net.bytebuddy.jar.asm.s
                            public final void i() {
                                this.f418282c.s(this.f417017j);
                                this.f417008g.b(this.f418282c);
                            }

                            public static class b extends a {
                                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining.WithFullProcessing.InitializationHandler.Appending.a
                                public final void M(Implementation.Context.a.AbstractC12078a abstractC12078a) {
                                }
                            }
                        }
                    }
                }
            }

            public static class b<V> extends ForInlining<V> {

                /* renamed from: net.bytebuddy.dynamic.scaffold.TypeWriter$Default$ForInlining$b$b, reason: collision with other inner class name */
                public static class C12066b extends b.a<a.c> {

                    /* renamed from: b, reason: collision with root package name */
                    public final TypeDescription f417055b;

                    public C12066b(TypeDescription typeDescription) {
                        this.f417055b = typeDescription;
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public final Object get(int i12) {
                        return this.f417055b.x().get(i12);
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public final int size() {
                        return this.f417055b.x().size();
                    }
                }

                public b() {
                    throw null;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ForInlining
                public final f c(f fVar, TypeInitializer typeInitializer, a aVar, int i12, int i13) {
                    if (typeInitializer.a()) {
                        throw new UnsupportedOperationException("Cannot apply a type initializer for a decoration");
                    }
                    return new a(fVar, aVar, i12, i13);
                }

                @SuppressFBWarnings(justification = "Field access order is implied by ASM.", value = {"UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR"})
                public class a extends net.bytebuddy.utility.visitor.d implements TypeInitializer.a {

                    /* renamed from: g, reason: collision with root package name */
                    public final a f417050g;

                    /* renamed from: h, reason: collision with root package name */
                    public final int f417051h;

                    /* renamed from: i, reason: collision with root package name */
                    public final int f417052i;

                    /* renamed from: j, reason: collision with root package name */
                    @d
                    public Implementation.Context.a f417053j;

                    public a(f fVar, a aVar, int i12, int i13) {
                        super(e.f418981b, fVar);
                        this.f417050g = aVar;
                        this.f417051h = i12;
                        this.f417052i = i13;
                    }

                    @Override // net.bytebuddy.utility.visitor.d
                    @net.bytebuddy.utility.nullability.b
                    public final AbstractC44388a H(int i12, C c12, String str, boolean z12) {
                        if (b.this.f416983o.f417488b) {
                            return this.f418175c.q(i12, c12, str, z12);
                        }
                        int i13 = ForInlining.f416998y;
                        return null;
                    }

                    @Override // net.bytebuddy.jar.asm.f
                    public final void c(int i12, int i13, String str, String str2, String str3, String[] strArr) {
                        ClassFileVersion classFileVersionF = ClassFileVersion.f(i12);
                        b bVar = b.this;
                        Implementation.Context.a aVarA = bVar.f416985q.a(bVar.f416969a, bVar.f416984p, bVar.f416979k, classFileVersionF, bVar.f416970b);
                        this.f417053j = aVarA;
                        this.f417050g.f417049a = aVarA;
                        f fVarB = bVar.f416981m.b(bVar.f416969a, this.f418175c, aVarA, bVar.f416988t, bVar.f416974f, bVar.f416975g, this.f417051h, this.f417052i);
                        this.f418175c = fVarB;
                        fVarB.c(i12, i13, str, str2, str3, strArr);
                    }

                    @Override // net.bytebuddy.utility.visitor.d
                    public final void u() {
                        b bVar = b.this;
                        bVar.f416980l.a(this.f418175c, bVar.f416969a, bVar.f416982n.a());
                    }

                    @Override // net.bytebuddy.utility.visitor.d
                    @net.bytebuddy.utility.nullability.b
                    public final AbstractC44388a x(String str, boolean z12) {
                        if (b.this.f416983o.f417488b) {
                            return this.f418175c.d(str, z12);
                        }
                        int i12 = ForInlining.f416998y;
                        return null;
                    }

                    @Override // net.bytebuddy.utility.visitor.d
                    public final void y() {
                        this.f417053j.d(this, this.f418175c, b.this.f416982n);
                        this.f418175c.f();
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeInitializer.a
                    public final void b(f fVar, TypeInitializer typeInitializer, Implementation.Context.a.AbstractC12078a abstractC12078a) {
                    }
                }
            }
        }

        public static class ValidatingClassVisitor extends f {

            /* renamed from: d, reason: collision with root package name */
            @d
            public Constraint.a f417056d;

            public class a extends m {
                public a(m mVar) {
                    super(e.f418981b, mVar);
                }

                @Override // net.bytebuddy.jar.asm.m
                public final AbstractC44388a a(String str, boolean z12) {
                    ValidatingClassVisitor.this.f417056d.f();
                    return super.a(str, z12);
                }
            }

            public class b extends s {

                /* renamed from: d, reason: collision with root package name */
                public final String f417076d;

                public b(s sVar, String str) {
                    super(e.f418981b, sVar);
                    this.f417076d = str;
                }

                @Override // net.bytebuddy.jar.asm.s
                public final void A(String str, String str2, String str3, int i12, boolean z12) {
                    if (z12 && i12 == 183) {
                        ValidatingClassVisitor.this.f417056d.o();
                    }
                    super.A(str, str2, str3, i12, z12);
                }

                @Override // net.bytebuddy.jar.asm.s
                @net.bytebuddy.utility.nullability.b
                public final AbstractC44388a e(String str, boolean z12) {
                    ValidatingClassVisitor.this.f417056d.f();
                    return super.e(str, z12);
                }

                @Override // net.bytebuddy.jar.asm.s
                @net.bytebuddy.utility.nullability.b
                public final AbstractC44388a f() {
                    ValidatingClassVisitor.this.f417056d.b(this.f417076d);
                    return super.f();
                }

                @Override // net.bytebuddy.jar.asm.s
                public final void p(String str, String str2, p pVar, Object... objArr) {
                    ValidatingClassVisitor validatingClassVisitor = ValidatingClassVisitor.this;
                    validatingClassVisitor.f417056d.p();
                    for (Object obj : objArr) {
                        if (obj instanceof h) {
                            validatingClassVisitor.f417056d.d();
                        }
                    }
                    super.p(str, str2, pVar, objArr);
                }

                @Override // net.bytebuddy.jar.asm.s
                public final void r(int i12, r rVar) {
                    if (i12 == 168) {
                        ValidatingClassVisitor.this.f417056d.l();
                    }
                    super.r(i12, rVar);
                }

                @Override // net.bytebuddy.jar.asm.s
                @SuppressFBWarnings(justification = "Fall through to default case is intentional.", value = {"SF_SWITCH_NO_DEFAULT"})
                public final void t(Object obj) {
                    boolean z12 = obj instanceof B;
                    ValidatingClassVisitor validatingClassVisitor = ValidatingClassVisitor.this;
                    if (z12) {
                        switch (((B) obj).t()) {
                            case 9:
                            case 10:
                                validatingClassVisitor.f417056d.k();
                                break;
                            case 11:
                                validatingClassVisitor.f417056d.n();
                                break;
                        }
                    } else if (obj instanceof p) {
                        validatingClassVisitor.f417056d.r();
                    } else if (obj instanceof h) {
                        validatingClassVisitor.f417056d.d();
                    }
                    super.t(obj);
                }
            }

            @Override // net.bytebuddy.jar.asm.f
            public final void c(int i12, int i13, String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String[] strArr) {
                boolean z12;
                ClassFileVersion classFileVersionF = ClassFileVersion.f(i12);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Constraint.b(classFileVersionF));
                if (str.endsWith("/package-info")) {
                    arrayList.add(Constraint.ForPackageType.f417069b);
                } else if ((i13 & 8192) != 0) {
                    if (!classFileVersionF.c(ClassFileVersion.f415295g)) {
                        throw new IllegalStateException("Cannot define an annotation type for class file version " + classFileVersionF);
                    }
                    arrayList.add(classFileVersionF.c(ClassFileVersion.f415298j) ? Constraint.ForAnnotation.JAVA_8 : Constraint.ForAnnotation.CLASSIC);
                } else if ((i13 & 512) != 0) {
                    arrayList.add(classFileVersionF.c(ClassFileVersion.f415298j) ? Constraint.ForInterface.JAVA_8 : Constraint.ForInterface.CLASSIC);
                } else if ((i13 & 1024) != 0) {
                    arrayList.add(Constraint.ForClass.ABSTRACT);
                } else {
                    arrayList.add(Constraint.ForClass.MANIFEST);
                }
                if ((65536 & i13) != 0) {
                    arrayList.add(Constraint.ForRecord.f417071b);
                    z12 = true;
                } else {
                    z12 = false;
                }
                Constraint.a aVar = new Constraint.a(arrayList);
                this.f417056d = aVar;
                aVar.h(i13, strArr != null, str2 != null);
                if (z12) {
                    this.f417056d.e();
                }
                super.c(i12, i13, str, str2, str3, strArr);
            }

            @Override // net.bytebuddy.jar.asm.f
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a d(String str, boolean z12) {
                this.f417056d.f();
                return super.d(str, z12);
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
            @Override // net.bytebuddy.jar.asm.f
            @net.bytebuddy.utility.nullability.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final net.bytebuddy.jar.asm.m g(int r10, java.lang.String r11, java.lang.String r12, @net.bytebuddy.utility.nullability.b java.lang.String r13, @net.bytebuddy.utility.nullability.b java.lang.Object r14) {
                /*
                    Method dump skipped, instructions count: 242
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.g(int, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):net.bytebuddy.jar.asm.m");
            }

            @Override // net.bytebuddy.jar.asm.f
            @net.bytebuddy.utility.nullability.b
            public final s i(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String[] strArr) {
                this.f417056d.c(str, (i12 & 1024) != 0, (i12 & 1) != 0, (i12 & 2) != 0, (i12 & 8) != 0, (str.equals("<init>") || str.equals("<clinit>") || (i12 & 10) != 0) ? false : true, str.equals("<init>"), !str2.startsWith("()") || str2.endsWith("V"), str3 != null);
                s sVarI = super.i(i12, str, str2, str3, strArr);
                if (sVarI == null) {
                    return null;
                }
                return new b(sVarI, str);
            }

            @Override // net.bytebuddy.jar.asm.f
            public final void k(String str) {
                this.f417056d.m();
                super.k(str);
            }

            @Override // net.bytebuddy.jar.asm.f
            public final void l(String str) {
                this.f417056d.m();
                super.l(str);
            }

            @Override // net.bytebuddy.jar.asm.f
            public final void n(String str) {
                this.f417056d.a();
                super.n(str);
            }

            @Override // net.bytebuddy.jar.asm.f
            @net.bytebuddy.utility.nullability.b
            public final AbstractC44388a q(int i12, @net.bytebuddy.utility.nullability.b C c12, String str, boolean z12) {
                this.f417056d.i();
                return super.q(i12, c12, str, z12);
            }

            public interface Constraint {

                @HashCodeAndEqualsPlugin.Enhance
                public static class a implements Constraint {

                    /* renamed from: b, reason: collision with root package name */
                    public final ArrayList f417073b = new ArrayList();

                    public a(ArrayList arrayList) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Constraint constraint = (Constraint) it.next();
                            if (constraint instanceof a) {
                                this.f417073b.addAll(((a) constraint).f417073b);
                            } else {
                                this.f417073b.add(constraint);
                            }
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void a() {
                        Iterator it = this.f417073b.iterator();
                        while (it.hasNext()) {
                            ((Constraint) it.next()).a();
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void b(String str) {
                        Iterator it = this.f417073b.iterator();
                        while (it.hasNext()) {
                            ((Constraint) it.next()).b(str);
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void c(String str, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
                        Iterator it = this.f417073b.iterator();
                        while (it.hasNext()) {
                            ((Constraint) it.next()).c(str, z12, z13, z14, z15, z16, z17, z18, z19);
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void d() {
                        Iterator it = this.f417073b.iterator();
                        while (it.hasNext()) {
                            ((Constraint) it.next()).d();
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void e() {
                        Iterator it = this.f417073b.iterator();
                        while (it.hasNext()) {
                            ((Constraint) it.next()).e();
                        }
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.f417073b.equals(((a) obj).f417073b);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void f() {
                        Iterator it = this.f417073b.iterator();
                        while (it.hasNext()) {
                            ((Constraint) it.next()).f();
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void h(int i12, boolean z12, boolean z13) {
                        Iterator it = this.f417073b.iterator();
                        while (it.hasNext()) {
                            ((Constraint) it.next()).h(i12, z12, z13);
                        }
                    }

                    public final int hashCode() {
                        return this.f417073b.hashCode() + (getClass().hashCode() * 31);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void i() {
                        Iterator it = this.f417073b.iterator();
                        while (it.hasNext()) {
                            ((Constraint) it.next()).i();
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void k() {
                        Iterator it = this.f417073b.iterator();
                        while (it.hasNext()) {
                            ((Constraint) it.next()).k();
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void l() {
                        Iterator it = this.f417073b.iterator();
                        while (it.hasNext()) {
                            ((Constraint) it.next()).l();
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void m() {
                        Iterator it = this.f417073b.iterator();
                        while (it.hasNext()) {
                            ((Constraint) it.next()).m();
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void n() {
                        Iterator it = this.f417073b.iterator();
                        while (it.hasNext()) {
                            ((Constraint) it.next()).n();
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void o() {
                        Iterator it = this.f417073b.iterator();
                        while (it.hasNext()) {
                            ((Constraint) it.next()).o();
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void p() {
                        Iterator it = this.f417073b.iterator();
                        while (it.hasNext()) {
                            ((Constraint) it.next()).p();
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void q(String str, boolean z12, boolean z13, boolean z14, boolean z15) {
                        Iterator it = this.f417073b.iterator();
                        while (it.hasNext()) {
                            ((Constraint) it.next()).q(str, z12, z13, z14, z15);
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void r() {
                        Iterator it = this.f417073b.iterator();
                        while (it.hasNext()) {
                            ((Constraint) it.next()).r();
                        }
                    }
                }

                void a();

                void b(String str);

                void c(String str, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19);

                void d();

                void e();

                void f();

                void h(int i12, boolean z12, boolean z13);

                void i();

                void k();

                void l();

                void m();

                void n();

                void o();

                void p();

                void q(String str, boolean z12, boolean z13, boolean z14, boolean z15);

                void r();

                public enum ForAnnotation implements Constraint {
                    CLASSIC(true),
                    JAVA_8(false);


                    /* renamed from: b, reason: collision with root package name */
                    public final boolean f417060b;

                    ForAnnotation(boolean z12) {
                        this.f417060b = z12;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void c(String str, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
                        if (str.equals("<clinit>")) {
                            return;
                        }
                        if (z17) {
                            throw new IllegalStateException("Cannot define constructor for interface type");
                        }
                        if (this.f417060b && !z16) {
                            throw new IllegalStateException(AK.c.k("Cannot define non-virtual method '", str, "' for a pre-Java 8 annotation type"));
                        }
                        if (!z15 && z18) {
                            throw new IllegalStateException(AK.c.k("Cannot define method '", str, "' with the given signature as an annotation type method"));
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void h(int i12, boolean z12, boolean z13) {
                        if ((i12 & 512) == 0) {
                            throw new IllegalStateException("Cannot define annotation type without interface modifier");
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void q(String str, boolean z12, boolean z13, boolean z14, boolean z15) {
                        if (!z13 || !z12 || !z14) {
                            throw new IllegalStateException(AK.c.k("Cannot only define public, static, final field '", str, "' for interface type"));
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void a() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void d() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void e() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void f() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void i() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void k() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void l() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void m() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void n() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void o() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void p() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void r() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void b(String str) {
                    }
                }

                public enum ForClass implements Constraint {
                    MANIFEST(true),
                    ABSTRACT(false);


                    /* renamed from: b, reason: collision with root package name */
                    public final boolean f417064b;

                    ForClass(boolean z12) {
                        this.f417064b = z12;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void b(String str) {
                        throw new IllegalStateException(AK.c.k("Cannot define default value for '", str, "' for non-annotation type"));
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void c(String str, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
                        if (z12 && this.f417064b) {
                            throw new IllegalStateException(AK.c.k("Cannot define abstract method '", str, "' for non-abstract class"));
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void a() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void d() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void e() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void f() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void i() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void k() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void l() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void m() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void n() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void o() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void p() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void r() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void h(int i12, boolean z12, boolean z13) {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void q(String str, boolean z12, boolean z13, boolean z14, boolean z15) {
                    }
                }

                public enum ForInterface implements Constraint {
                    CLASSIC(true),
                    JAVA_8(false);


                    /* renamed from: b, reason: collision with root package name */
                    public final boolean f417068b;

                    ForInterface(boolean z12) {
                        this.f417068b = z12;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void b(String str) {
                        throw new IllegalStateException(AK.c.k("Cannot define default value for '", str, "' for non-annotation type"));
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void c(String str, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
                        if (str.equals("<clinit>")) {
                            return;
                        }
                        if (z17) {
                            throw new IllegalStateException("Cannot define constructor for interface type");
                        }
                        boolean z22 = this.f417068b;
                        if (z22 && !z13) {
                            throw new IllegalStateException(AK.c.k("Cannot define non-public method '", str, "' for interface type"));
                        }
                        if (z22 && !z16) {
                            throw new IllegalStateException(AK.c.k("Cannot define non-virtual method '", str, "' for a pre-Java 8 interface type"));
                        }
                        if (z22 && !z12) {
                            throw new IllegalStateException(AK.c.k("Cannot define default method '", str, "' for pre-Java 8 interface type"));
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void q(String str, boolean z12, boolean z13, boolean z14, boolean z15) {
                        if (!z13 || !z12 || !z14) {
                            throw new IllegalStateException(AK.c.k("Cannot only define public, static, final field '", str, "' for interface type"));
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void a() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void d() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void e() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void f() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void i() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void k() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void l() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void m() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void n() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void o() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void p() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void r() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void h(int i12, boolean z12, boolean z13) {
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class ForPackageType implements Constraint {

                    /* renamed from: b, reason: collision with root package name */
                    public static final ForPackageType f417069b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ ForPackageType[] f417070c;

                    static {
                        ForPackageType forPackageType = new ForPackageType("INSTANCE", 0);
                        f417069b = forPackageType;
                        f417070c = new ForPackageType[]{forPackageType};
                    }

                    public ForPackageType() {
                        throw null;
                    }

                    public static ForPackageType valueOf(String str) {
                        return (ForPackageType) Enum.valueOf(ForPackageType.class, str);
                    }

                    public static ForPackageType[] values() {
                        return (ForPackageType[]) f417070c.clone();
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void c(String str, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
                        throw new IllegalStateException("Cannot define a method for a package description type");
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void h(int i12, boolean z12, boolean z13) {
                        if (i12 != 5632) {
                            throw new IllegalStateException("A package description type must define 5632 as modifier");
                        }
                        if (z12) {
                            throw new IllegalStateException("Cannot implement interface for package type");
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void q(String str, boolean z12, boolean z13, boolean z14, boolean z15) {
                        throw new IllegalStateException("Cannot define a field for a package description type");
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void a() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void d() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void e() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void f() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void i() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void k() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void l() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void m() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void n() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void o() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void p() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void r() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void b(String str) {
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class ForRecord implements Constraint {

                    /* renamed from: b, reason: collision with root package name */
                    public static final ForRecord f417071b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ ForRecord[] f417072c;

                    static {
                        ForRecord forRecord = new ForRecord("INSTANCE", 0);
                        f417071b = forRecord;
                        f417072c = new ForRecord[]{forRecord};
                    }

                    public ForRecord() {
                        throw null;
                    }

                    public static ForRecord valueOf(String str) {
                        return (ForRecord) Enum.valueOf(ForRecord.class, str);
                    }

                    public static ForRecord[] values() {
                        return (ForRecord[]) f417072c.clone();
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void h(int i12, boolean z12, boolean z13) {
                        if ((i12 & 1024) != 0) {
                            throw new IllegalStateException("Cannot define a record class as abstract");
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void a() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void d() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void e() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void f() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void i() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void k() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void l() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void m() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void n() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void o() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void p() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void r() {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void b(String str) {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void c(String str, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void q(String str, boolean z12, boolean z13, boolean z14, boolean z15) {
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class b implements Constraint {

                    /* renamed from: b, reason: collision with root package name */
                    public final ClassFileVersion f417074b;

                    public b(ClassFileVersion classFileVersion) {
                        this.f417074b = classFileVersion;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void a() {
                        ClassFileVersion classFileVersion = ClassFileVersion.f415307s;
                        ClassFileVersion classFileVersion2 = this.f417074b;
                        if (classFileVersion2.d(classFileVersion)) {
                            throw new IllegalStateException("Cannot define permitted subclasses for class file version " + classFileVersion2);
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void c(String str, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
                        if (z19) {
                            ClassFileVersion classFileVersion = ClassFileVersion.f415294f;
                            ClassFileVersion classFileVersion2 = this.f417074b;
                            if (!classFileVersion2.c(classFileVersion)) {
                                throw new IllegalStateException("Cannot define generic method '" + str + "' for class file version " + classFileVersion2);
                            }
                        }
                        if (!z16 && z12) {
                            throw new IllegalStateException(AK.c.k("Cannot define static or non-virtual method '", str, "' to be abstract"));
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void d() {
                        ClassFileVersion classFileVersion = ClassFileVersion.f415301m;
                        ClassFileVersion classFileVersion2 = this.f417074b;
                        if (classFileVersion2.d(classFileVersion)) {
                            throw new IllegalStateException("Cannot write dynamic constant for class file version " + classFileVersion2);
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void e() {
                        ClassFileVersion classFileVersion = ClassFileVersion.f415304p;
                        ClassFileVersion classFileVersion2 = this.f417074b;
                        if (classFileVersion2.d(classFileVersion)) {
                            throw new IllegalStateException("Cannot define record for class file version " + classFileVersion2);
                        }
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f417074b.equals(((b) obj).f417074b);
                        }
                        return false;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void f() {
                        ClassFileVersion classFileVersion = ClassFileVersion.f415295g;
                        ClassFileVersion classFileVersion2 = this.f417074b;
                        if (classFileVersion2.d(classFileVersion)) {
                            throw new IllegalStateException("Cannot write annotations for class file version " + classFileVersion2);
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void h(int i12, boolean z12, boolean z13) {
                        int i13 = i12 & 8192;
                        ClassFileVersion classFileVersion = this.f417074b;
                        if (i13 != 0 && !classFileVersion.c(ClassFileVersion.f415295g)) {
                            throw new IllegalStateException("Cannot define annotation type for class file version " + classFileVersion);
                        }
                        if (!z13 || classFileVersion.c(ClassFileVersion.f415294f)) {
                            return;
                        }
                        throw new IllegalStateException("Cannot define a generic type for class file version " + classFileVersion);
                    }

                    public final int hashCode() {
                        return this.f417074b.hashCode() + (getClass().hashCode() * 31);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void i() {
                        ClassFileVersion classFileVersion = ClassFileVersion.f415295g;
                        ClassFileVersion classFileVersion2 = this.f417074b;
                        if (classFileVersion2.d(classFileVersion)) {
                            throw new IllegalStateException("Cannot write type annotations for class file version " + classFileVersion2);
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void k() {
                        ClassFileVersion classFileVersion = ClassFileVersion.f415295g;
                        ClassFileVersion classFileVersion2 = this.f417074b;
                        if (classFileVersion2.d(classFileVersion)) {
                            throw new IllegalStateException("Cannot write type to constant pool for class file version " + classFileVersion2);
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void l() {
                        ClassFileVersion classFileVersion = ClassFileVersion.f415295g;
                        ClassFileVersion classFileVersion2 = this.f417074b;
                        if (classFileVersion2.compareTo(classFileVersion) <= 0) {
                            return;
                        }
                        throw new IllegalStateException("Cannot write subroutine for class file version " + classFileVersion2);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void m() {
                        ClassFileVersion classFileVersion = ClassFileVersion.f415301m;
                        ClassFileVersion classFileVersion2 = this.f417074b;
                        if (classFileVersion2.d(classFileVersion)) {
                            throw new IllegalStateException("Cannot define nest mate for class file version " + classFileVersion2);
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void n() {
                        ClassFileVersion classFileVersion = ClassFileVersion.f415297i;
                        ClassFileVersion classFileVersion2 = this.f417074b;
                        if (classFileVersion2.d(classFileVersion)) {
                            throw new IllegalStateException("Cannot write method type to constant pool for class file version " + classFileVersion2);
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void o() {
                        ClassFileVersion classFileVersion = ClassFileVersion.f415298j;
                        ClassFileVersion classFileVersion2 = this.f417074b;
                        if (classFileVersion2.d(classFileVersion)) {
                            throw new IllegalStateException("Cannot invoke default method for class file version " + classFileVersion2);
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void p() {
                        ClassFileVersion classFileVersion = ClassFileVersion.f415297i;
                        ClassFileVersion classFileVersion2 = this.f417074b;
                        if (classFileVersion2.d(classFileVersion)) {
                            throw new IllegalStateException("Cannot write invoke dynamic instruction for class file version " + classFileVersion2);
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void q(String str, boolean z12, boolean z13, boolean z14, boolean z15) {
                        if (z15) {
                            ClassFileVersion classFileVersion = ClassFileVersion.f415294f;
                            ClassFileVersion classFileVersion2 = this.f417074b;
                            if (classFileVersion2.c(classFileVersion)) {
                                return;
                            }
                            throw new IllegalStateException("Cannot define generic field '" + str + "' for class file version " + classFileVersion2);
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void r() {
                        ClassFileVersion classFileVersion = ClassFileVersion.f415297i;
                        ClassFileVersion classFileVersion2 = this.f417074b;
                        if (classFileVersion2.d(classFileVersion)) {
                            throw new IllegalStateException("Cannot write method handle to constant pool for class file version " + classFileVersion2);
                        }
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint
                    public final void b(String str) {
                    }
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ClassDumpAction implements PrivilegedExceptionAction<Void> {

            /* renamed from: a, reason: collision with root package name */
            public final String f416989a;

            /* renamed from: b, reason: collision with root package name */
            public final TypeDescription f416990b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f416991c;

            /* renamed from: d, reason: collision with root package name */
            public final long f416992d;

            /* renamed from: e, reason: collision with root package name */
            public final byte[] f416993e;

            public ClassDumpAction(String str, TypeDescription typeDescription, boolean z12, long j12, byte[] bArr) {
                this.f416989a = str;
                this.f416990b = typeDescription;
                this.f416991c = z12;
                this.f416992d = j12;
                this.f416993e = bArr;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ClassDumpAction classDumpAction = (ClassDumpAction) obj;
                return this.f416991c == classDumpAction.f416991c && this.f416992d == classDumpAction.f416992d && this.f416989a.equals(classDumpAction.f416989a) && this.f416990b.equals(classDumpAction.f416990b) && Arrays.equals(this.f416993e, classDumpAction.f416993e);
            }

            public final int hashCode() {
                int iJ2 = (D8.j(this.f416990b, H.d(getClass().hashCode() * 31, 31, this.f416989a), 31) + (this.f416991c ? 1 : 0)) * 31;
                long j12 = this.f416992d;
                return Arrays.hashCode(this.f416993e) + ((iJ2 + ((int) (j12 ^ (j12 >>> 32)))) * 31);
            }

            @Override // java.security.PrivilegedExceptionAction
            public final Void run() throws IOException {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f416990b.getName());
                sb2.append(this.f416991c ? "-original." : ".");
                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f416989a, AK.c.j(this.f416992d, ".class", sb2)));
                try {
                    fileOutputStream.write(this.f416993e);
                    fileOutputStream.close();
                    return null;
                } catch (Throwable th2) {
                    fileOutputStream.close();
                    throw th2;
                }
            }

            public interface Dispatcher {

                @HashCodeAndEqualsPlugin.Enhance
                public static class a implements Dispatcher {

                    /* renamed from: b, reason: collision with root package name */
                    public final String f416996b;

                    /* renamed from: c, reason: collision with root package name */
                    public final long f416997c;

                    public a(String str, long j12) {
                        this.f416996b = str;
                        this.f416997c = j12;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher
                    public final void a(TypeDescription typeDescription, boolean z12, byte[] bArr) throws PrivilegedActionException {
                        try {
                            ClassDumpAction classDumpAction = new ClassDumpAction(this.f416996b, typeDescription, z12, this.f416997c, bArr);
                            if (Default.f416968v) {
                                AccessController.doPrivileged(classDumpAction);
                            } else {
                                classDumpAction.run();
                            }
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        a aVar = (a) obj;
                        return this.f416997c == aVar.f416997c && this.f416996b.equals(aVar.f416996b);
                    }

                    public final int hashCode() {
                        int iD2 = H.d(getClass().hashCode() * 31, 31, this.f416996b);
                        long j12 = this.f416997c;
                        return iD2 + ((int) (j12 ^ (j12 >>> 32)));
                    }
                }

                void a(TypeDescription typeDescription, boolean z12, byte[] bArr);

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class Disabled implements Dispatcher {

                    /* renamed from: b, reason: collision with root package name */
                    public static final Disabled f416994b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ Disabled[] f416995c;

                    static {
                        Disabled disabled = new Disabled("INSTANCE", 0);
                        f416994b = disabled;
                        f416995c = new Disabled[]{disabled};
                    }

                    public Disabled() {
                        throw null;
                    }

                    public static Disabled valueOf(String str) {
                        return (Disabled) Enum.valueOf(Disabled.class, str);
                    }

                    public static Disabled[] values() {
                        return (Disabled[]) f416995c.clone();
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ClassDumpAction.Dispatcher
                    public final void a(TypeDescription typeDescription, boolean z12, byte[] bArr) {
                    }
                }
            }
        }
    }

    public interface MethodPool {
        Record a(net.bytebuddy.description.method.a aVar);

        public interface Record {

            public enum Sort {
                SKIPPED(false, false),
                DEFINED(true, false),
                IMPLEMENTED(true, true);


                /* renamed from: b, reason: collision with root package name */
                public final boolean f417092b;

                /* renamed from: c, reason: collision with root package name */
                public final boolean f417093c;

                Sort(boolean z12, boolean z13) {
                    this.f417092b = z12;
                    this.f417093c = z13;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements Record {

                /* renamed from: b, reason: collision with root package name */
                public final Record f417094b;

                /* renamed from: c, reason: collision with root package name */
                public final TypeDescription f417095c;

                /* renamed from: d, reason: collision with root package name */
                public final net.bytebuddy.description.method.a f417096d;

                /* renamed from: e, reason: collision with root package name */
                public final HashSet f417097e;

                /* renamed from: f, reason: collision with root package name */
                public final MethodAttributeAppender f417098f;

                /* renamed from: net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$a$a, reason: collision with other inner class name */
                public static class C12068a extends a.d.AbstractC11975a {

                    /* renamed from: c, reason: collision with root package name */
                    public final net.bytebuddy.description.method.a f417099c;

                    /* renamed from: d, reason: collision with root package name */
                    public final a.j f417100d;

                    /* renamed from: e, reason: collision with root package name */
                    public final TypeDescription f417101e;

                    public C12068a(net.bytebuddy.description.method.a aVar, a.j jVar, TypeDescription typeDescription) {
                        this.f417099c = aVar;
                        this.f417100d = jVar;
                        this.f417101e = typeDescription;
                    }

                    @Override // net.bytebuddy.description.method.a
                    public final d.f N() {
                        return this.f417099c.N().h0(TypeDescription.Generic.Visitor.TypeErasing.f416400b);
                    }

                    @Override // net.bytebuddy.description.d.InterfaceC11969d
                    public final String V() {
                        return this.f417099c.V();
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

                    @Override // net.bytebuddy.description.c
                    public final int getModifiers() {
                        return (this.f417099c.getModifiers() | 4160) & (-1281);
                    }

                    @Override // net.bytebuddy.description.method.a
                    public final net.bytebuddy.description.method.d<c.InterfaceC11982c> getParameters() {
                        return new d.c.a(this, this.f417100d.f416207b);
                    }

                    @Override // net.bytebuddy.description.method.a
                    public final TypeDescription.Generic getReturnType() {
                        return this.f417100d.f416206a.P0();
                    }

                    @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                    @g
                    public final TypeDefinition n() {
                        return this.f417101e;
                    }

                    @Override // net.bytebuddy.description.TypeVariableSource
                    public final d.f r() {
                        return new d.f.b();
                    }

                    @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                    @g
                    public final TypeDescription n() {
                        return this.f417101e;
                    }
                }

                public static class b extends a.d.AbstractC11975a {

                    /* renamed from: c, reason: collision with root package name */
                    public final net.bytebuddy.description.method.a f417102c;

                    /* renamed from: d, reason: collision with root package name */
                    public final TypeDescription f417103d;

                    public b(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription) {
                        this.f417102c = aVar;
                        this.f417103d = typeDescription;
                    }

                    @Override // net.bytebuddy.description.method.a
                    public final d.f N() {
                        return this.f417102c.N();
                    }

                    @Override // net.bytebuddy.description.d.InterfaceC11969d
                    public final String V() {
                        return this.f417102c.V();
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                        return this.f417102c.getDeclaredAnnotations();
                    }

                    @Override // net.bytebuddy.description.method.a
                    @net.bytebuddy.utility.nullability.b
                    public final AnnotationValue<?, ?> getDefaultValue() {
                        return this.f417102c.getDefaultValue();
                    }

                    @Override // net.bytebuddy.description.c
                    public final int getModifiers() {
                        return this.f417102c.getModifiers();
                    }

                    @Override // net.bytebuddy.description.method.a
                    public final net.bytebuddy.description.method.d<c.InterfaceC11982c> getParameters() {
                        return new d.e(this, this.f417102c.getParameters().c(C44411u.f(this.f417103d)));
                    }

                    @Override // net.bytebuddy.description.method.a
                    public final TypeDescription.Generic getReturnType() {
                        return this.f417102c.getReturnType();
                    }

                    @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                    @g
                    public final TypeDefinition n() {
                        return this.f417103d;
                    }

                    @Override // net.bytebuddy.description.TypeVariableSource
                    public final d.f r() {
                        return this.f417102c.r();
                    }

                    @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                    @g
                    public final TypeDescription n() {
                        return this.f417103d;
                    }
                }

                public a(Record record, TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, HashSet hashSet, MethodAttributeAppender methodAttributeAppender) {
                    this.f417094b = record;
                    this.f417095c = typeDescription;
                    this.f417096d = aVar;
                    this.f417097e = hashSet;
                    this.f417098f = methodAttributeAppender;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final Record b(net.bytebuddy.implementation.bytecode.a aVar) {
                    return new a(this.f417094b.b(aVar), this.f417095c, this.f417096d, this.f417097e, this.f417098f);
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final void c(s sVar, AnnotationValueFilter.b bVar) {
                    this.f417094b.c(sVar, bVar);
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final void e(s sVar) {
                    this.f417094b.e(sVar);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.f417094b.equals(aVar.f417094b) && this.f417095c.equals(aVar.f417095c) && this.f417096d.equals(aVar.f417096d) && this.f417097e.equals(aVar.f417097e) && this.f417098f.equals(aVar.f417098f);
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final void f(s sVar, Implementation.Context context, AnnotationValueFilter.b bVar) {
                    this.f417094b.f(sVar, context, bVar);
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final void g(f fVar, Implementation.Context context, AnnotationValueFilter.b bVar) {
                    Record record = this.f417094b;
                    record.g(fVar, context, bVar);
                    Iterator it = this.f417097e.iterator();
                    while (it.hasNext()) {
                        a.j jVar = (a.j) it.next();
                        net.bytebuddy.description.method.a aVar = this.f417096d;
                        TypeDescription typeDescription = this.f417095c;
                        C12068a c12068a = new C12068a(aVar, jVar, typeDescription);
                        b bVar2 = new b(aVar, typeDescription);
                        s sVarI = fVar.i(c12068a.b0(true, record.getVisibility()), c12068a.f417099c.V(), c12068a.getDescriptor(), null, c12068a.N().f1().t1());
                        if (sVarI != null) {
                            this.f417098f.c(sVarI, c12068a, bVar.a());
                            sVarI.h();
                            a.c cVarH = new a.b(new MethodVariableAccess.MethodLoading(MethodVariableAccess.a(c12068a).f418090b, new MethodVariableAccess.MethodLoading.TypeCastingHandler.a(bVar2)).g(), MethodInvocation.a(bVar2).i(typeDescription), bVar2.f417102c.getReturnType().f5().m5(c12068a.getReturnType().f5()) ? StackManipulation.Trivial.f417829b : net.bytebuddy.implementation.bytecode.assign.b.g(c12068a.getReturnType().f5()), MethodReturn.c(c12068a.getReturnType())).h(sVarI, context, c12068a);
                            sVarI.y(cVarH.f417849a, cVarH.f417850b);
                            sVarI.i();
                        }
                    }
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final net.bytebuddy.description.method.a getMethod() {
                    return this.f417096d;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final Visibility getVisibility() {
                    return this.f417094b.getVisibility();
                }

                public final int hashCode() {
                    return this.f417098f.hashCode() + ((this.f417097e.hashCode() + D8.h(this.f417096d, D8.j(this.f417095c, (this.f417094b.hashCode() + (getClass().hashCode() * 31)) * 31, 31), 31)) * 31);
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final a.c i(s sVar, Implementation.Context context) {
                    return this.f417094b.i(sVar, context);
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final Sort o() {
                    return this.f417094b.o();
                }
            }

            Record b(net.bytebuddy.implementation.bytecode.a aVar);

            void c(s sVar, AnnotationValueFilter.b bVar);

            void e(s sVar);

            void f(s sVar, Implementation.Context context, AnnotationValueFilter.b bVar);

            void g(f fVar, Implementation.Context context, AnnotationValueFilter.b bVar);

            net.bytebuddy.description.method.a getMethod();

            Visibility getVisibility();

            a.c i(s sVar, Implementation.Context context);

            Sort o();

            public static abstract class b implements Record {

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$b$b, reason: collision with other inner class name */
                public static class C12070b extends b {

                    /* renamed from: b, reason: collision with root package name */
                    public final net.bytebuddy.description.method.a f417110b;

                    /* renamed from: c, reason: collision with root package name */
                    public final MethodAttributeAppender f417111c;

                    public C12070b(net.bytebuddy.description.method.a aVar, MethodAttributeAppender methodAttributeAppender) {
                        this.f417110b = aVar;
                        this.f417111c = methodAttributeAppender;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final Record b(net.bytebuddy.implementation.bytecode.a aVar) {
                        throw new IllegalStateException("Cannot prepend code for default value on " + this.f417110b);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final void c(s sVar, AnnotationValueFilter.b bVar) {
                        throw new IllegalStateException("Cannot apply attributes for default value on " + this.f417110b);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final void e(s sVar) {
                        net.bytebuddy.description.method.a aVar = this.f417110b;
                        if (!aVar.Z(null)) {
                            throw new IllegalStateException(D8.m("Cannot set null as default for ", aVar));
                        }
                        sVar.f();
                        aVar.getReturnType().f5();
                        throw null;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        if (this.f417110b.equals(((C12070b) obj).f417110b)) {
                            throw null;
                        }
                        return false;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final void f(s sVar, Implementation.Context context, AnnotationValueFilter.b bVar) {
                        this.f417111c.c(sVar, this.f417110b, bVar.e());
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final net.bytebuddy.description.method.a getMethod() {
                        return this.f417110b;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final Visibility getVisibility() {
                        return this.f417110b.getVisibility();
                    }

                    public final int hashCode() {
                        getClass().hashCode();
                        this.f417110b.hashCode();
                        throw null;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final a.c i(s sVar, Implementation.Context context) {
                        throw new IllegalStateException("Cannot apply code for default value on " + this.f417110b);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final Sort o() {
                        return Sort.DEFINED;
                    }
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final void g(f fVar, Implementation.Context context, AnnotationValueFilter.b bVar) {
                    s sVarI = fVar.i(getMethod().b0(o().f417093c, getVisibility()), getMethod().V(), getMethod().getDescriptor(), getMethod().h(), getMethod().N().f1().t1());
                    if (sVarI != null) {
                        net.bytebuddy.description.method.d<?> parameters = getMethod().getParameters();
                        if (parameters.U5()) {
                            Iterator<?> it = parameters.iterator();
                            while (it.hasNext()) {
                                net.bytebuddy.description.method.c cVar = (net.bytebuddy.description.method.c) it.next();
                                sVarI.C(cVar.getModifiers(), cVar.getName());
                            }
                        }
                        e(sVarI);
                        f(sVarI, context, bVar);
                        sVarI.i();
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class a extends b implements net.bytebuddy.implementation.bytecode.a {

                    /* renamed from: b, reason: collision with root package name */
                    public final C12069a f417104b;

                    /* renamed from: c, reason: collision with root package name */
                    public final net.bytebuddy.description.method.a f417105c;

                    /* renamed from: d, reason: collision with root package name */
                    public final TypeDescription f417106d;

                    /* renamed from: e, reason: collision with root package name */
                    public final MethodAttributeAppender f417107e;

                    /* renamed from: net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$b$a$a, reason: collision with other inner class name */
                    public static class C12069a extends a.d.AbstractC11975a {

                        /* renamed from: c, reason: collision with root package name */
                        public final TypeDescription f417108c;

                        /* renamed from: d, reason: collision with root package name */
                        public final net.bytebuddy.description.method.a f417109d;

                        public C12069a(net.bytebuddy.description.method.a aVar, TypeDescription typeDescription) {
                            this.f417108c = typeDescription;
                            this.f417109d = aVar;
                        }

                        @Override // net.bytebuddy.description.method.a
                        public final d.f N() {
                            return this.f417109d.N().N1();
                        }

                        @Override // net.bytebuddy.description.d.InterfaceC11969d
                        public final String V() {
                            return this.f417109d.getName();
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                            return this.f417109d.getDeclaredAnnotations();
                        }

                        @Override // net.bytebuddy.description.method.a
                        @net.bytebuddy.utility.nullability.b
                        public final AnnotationValue<?, ?> getDefaultValue() {
                            return null;
                        }

                        @Override // net.bytebuddy.description.c
                        public final int getModifiers() {
                            return (this.f417109d.getModifiers() | 4160) & (-257);
                        }

                        @Override // net.bytebuddy.description.method.a
                        public final net.bytebuddy.description.method.d<c.InterfaceC11982c> getParameters() {
                            return new d.c.a(this, this.f417109d.getParameters().p2().N1());
                        }

                        @Override // net.bytebuddy.description.method.a
                        public final TypeDescription.Generic getReturnType() {
                            return this.f417109d.getReturnType().i5();
                        }

                        @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                        @g
                        public final TypeDefinition n() {
                            return this.f417108c;
                        }

                        @Override // net.bytebuddy.description.TypeVariableSource
                        public final d.f r() {
                            return new d.f.b();
                        }

                        @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                        @g
                        public final TypeDescription n() {
                            return this.f417108c;
                        }
                    }

                    public a(C12069a c12069a, net.bytebuddy.description.method.a aVar, TypeDescription typeDescription, MethodAttributeAppender methodAttributeAppender) {
                        this.f417104b = c12069a;
                        this.f417105c = aVar;
                        this.f417106d = typeDescription;
                        this.f417107e = methodAttributeAppender;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final Record b(net.bytebuddy.implementation.bytecode.a aVar) {
                        return new c(this.f417104b, new a.C12102a(this, aVar), this.f417107e, this.f417105c.getVisibility());
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final void c(s sVar, AnnotationValueFilter.b bVar) {
                        this.f417107e.c(sVar, this.f417104b, bVar.e());
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        a aVar = (a) obj;
                        return this.f417104b.equals(aVar.f417104b) && this.f417105c.equals(aVar.f417105c) && this.f417106d.equals(aVar.f417106d) && this.f417107e.equals(aVar.f417107e);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final void f(s sVar, Implementation.Context context, AnnotationValueFilter.b bVar) {
                        c(sVar, bVar);
                        sVar.h();
                        a.c cVarH = h(sVar, context, this.f417104b);
                        sVar.y(cVarH.f417849a, cVarH.f417850b);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final net.bytebuddy.description.method.a getMethod() {
                        return this.f417104b;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final Visibility getVisibility() {
                        return this.f417105c.getVisibility();
                    }

                    @Override // net.bytebuddy.implementation.bytecode.a
                    public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
                        return new a.b(MethodVariableAccess.a(aVar).g(), MethodInvocation.b(this.f417105c).h(this.f417106d), MethodReturn.c(aVar.getReturnType())).h(sVar, context, aVar);
                    }

                    public final int hashCode() {
                        return this.f417107e.hashCode() + D8.j(this.f417106d, D8.h(this.f417105c, (this.f417104b.hashCode() + (getClass().hashCode() * 31)) * 31, 31), 31);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final a.c i(s sVar, Implementation.Context context) {
                        return h(sVar, context, this.f417104b);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final Sort o() {
                        return Sort.IMPLEMENTED;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final void e(s sVar) {
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class c extends b {

                    /* renamed from: b, reason: collision with root package name */
                    public final net.bytebuddy.description.method.a f417112b;

                    /* renamed from: c, reason: collision with root package name */
                    public final net.bytebuddy.implementation.bytecode.a f417113c;

                    /* renamed from: d, reason: collision with root package name */
                    public final MethodAttributeAppender f417114d;

                    /* renamed from: e, reason: collision with root package name */
                    public final Visibility f417115e;

                    public c(net.bytebuddy.description.method.a aVar, net.bytebuddy.implementation.bytecode.a aVar2, MethodAttributeAppender methodAttributeAppender, Visibility visibility) {
                        this.f417112b = aVar;
                        this.f417113c = aVar2;
                        this.f417114d = methodAttributeAppender;
                        this.f417115e = visibility;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final Record b(net.bytebuddy.implementation.bytecode.a aVar) {
                        return new c(this.f417112b, new a.C12102a(aVar, this.f417113c), this.f417114d, this.f417115e);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final void c(s sVar, AnnotationValueFilter.b bVar) {
                        this.f417114d.c(sVar, this.f417112b, bVar.e());
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        c cVar = (c) obj;
                        return this.f417115e.equals(cVar.f417115e) && this.f417112b.equals(cVar.f417112b) && this.f417113c.equals(cVar.f417113c) && this.f417114d.equals(cVar.f417114d);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final void f(s sVar, Implementation.Context context, AnnotationValueFilter.b bVar) {
                        c(sVar, bVar);
                        sVar.h();
                        a.c cVarI = i(sVar, context);
                        sVar.y(cVarI.f417849a, cVarI.f417850b);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final net.bytebuddy.description.method.a getMethod() {
                        return this.f417112b;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final Visibility getVisibility() {
                        return this.f417115e;
                    }

                    public final int hashCode() {
                        return this.f417115e.hashCode() + ((this.f417114d.hashCode() + ((this.f417113c.hashCode() + D8.h(this.f417112b, getClass().hashCode() * 31, 31)) * 31)) * 31);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final a.c i(s sVar, Implementation.Context context) {
                        return this.f417113c.h(sVar, context, this.f417112b);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final Sort o() {
                        return Sort.IMPLEMENTED;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final void e(s sVar) {
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class d extends b {

                    /* renamed from: b, reason: collision with root package name */
                    public final net.bytebuddy.description.method.a f417116b;

                    /* renamed from: c, reason: collision with root package name */
                    public final MethodAttributeAppender f417117c;

                    /* renamed from: d, reason: collision with root package name */
                    public final Visibility f417118d;

                    public d(net.bytebuddy.description.method.a aVar, MethodAttributeAppender methodAttributeAppender, Visibility visibility) {
                        this.f417116b = aVar;
                        this.f417117c = methodAttributeAppender;
                        this.f417118d = visibility;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final Record b(net.bytebuddy.implementation.bytecode.a aVar) {
                        throw new IllegalStateException("Cannot prepend code for abstract method on " + this.f417116b);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final void c(s sVar, AnnotationValueFilter.b bVar) {
                        this.f417117c.c(sVar, this.f417116b, bVar.e());
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        d dVar = (d) obj;
                        return this.f417118d.equals(dVar.f417118d) && this.f417116b.equals(dVar.f417116b) && this.f417117c.equals(dVar.f417117c);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final void f(s sVar, Implementation.Context context, AnnotationValueFilter.b bVar) {
                        c(sVar, bVar);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final net.bytebuddy.description.method.a getMethod() {
                        return this.f417116b;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final Visibility getVisibility() {
                        return this.f417118d;
                    }

                    public final int hashCode() {
                        return this.f417118d.hashCode() + ((this.f417117c.hashCode() + D8.h(this.f417116b, getClass().hashCode() * 31, 31)) * 31);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final a.c i(s sVar, Implementation.Context context) {
                        throw new IllegalStateException("Cannot apply code for abstract method on " + this.f417116b);
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final Sort o() {
                        return Sort.DEFINED;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                    public final void e(s sVar) {
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class c implements Record {

                /* renamed from: b, reason: collision with root package name */
                public final net.bytebuddy.description.method.a f417119b;

                public c(net.bytebuddy.description.method.a aVar) {
                    this.f417119b = aVar;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final Record b(net.bytebuddy.implementation.bytecode.a aVar) {
                    net.bytebuddy.description.method.a aVar2 = this.f417119b;
                    return new b.c(aVar2, new a.C12102a(aVar, new a.b(DefaultValue.c(aVar2.getReturnType()), MethodReturn.c(aVar2.getReturnType()))), MethodAttributeAppender.NoOp.f417502b, aVar2.getVisibility());
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final void e(s sVar) {
                    throw new IllegalStateException("Cannot apply head for non-implemented method on " + this.f417119b);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f417119b.equals(((c) obj).f417119b);
                    }
                    return false;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final void f(s sVar, Implementation.Context context, AnnotationValueFilter.b bVar) {
                    throw new IllegalStateException("Cannot apply body for non-implemented method on " + this.f417119b);
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final net.bytebuddy.description.method.a getMethod() {
                    return this.f417119b;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final Visibility getVisibility() {
                    return this.f417119b.getVisibility();
                }

                public final int hashCode() {
                    return this.f417119b.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final a.c i(s sVar, Implementation.Context context) {
                    throw new IllegalStateException("Cannot apply code for non-implemented method on " + this.f417119b);
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final Sort o() {
                    return Sort.SKIPPED;
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final void c(s sVar, AnnotationValueFilter.b bVar) {
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public final void g(f fVar, Implementation.Context context, AnnotationValueFilter.b bVar) {
                }
            }
        }
    }
}
