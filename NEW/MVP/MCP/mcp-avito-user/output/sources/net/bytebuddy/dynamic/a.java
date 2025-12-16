package net.bytebuddy.dynamic;

import com.yandex.div2.D8;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.annotation.a;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.method.c;
import net.bytebuddy.description.modifier.FieldManifestation;
import net.bytebuddy.description.modifier.Ownership;
import net.bytebuddy.description.modifier.Visibility;
import net.bytebuddy.description.modifier.a;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.d;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.Transformer;
import net.bytebuddy.dynamic.TypeResolutionStrategy;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.dynamic.scaffold.ClassWriterStrategy;
import net.bytebuddy.dynamic.scaffold.FieldRegistry;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import net.bytebuddy.dynamic.scaffold.MethodRegistry;
import net.bytebuddy.dynamic.scaffold.RecordComponentRegistry;
import net.bytebuddy.dynamic.scaffold.TypeValidation;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.LoadedTypeInitializer;
import net.bytebuddy.implementation.attribute.AnnotationRetention;
import net.bytebuddy.implementation.attribute.AnnotationValueFilter;
import net.bytebuddy.implementation.attribute.FieldAttributeAppender;
import net.bytebuddy.implementation.attribute.MethodAttributeAppender;
import net.bytebuddy.implementation.attribute.TypeAttributeAppender;
import net.bytebuddy.implementation.auxiliary.a;
import net.bytebuddy.matcher.C44396e;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.LatentMatcher;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.matcher.ModifierMatcher;
import net.bytebuddy.matcher.U;
import net.bytebuddy.pool.TypePool;

/* compiled from: DynamicType.java */
/* loaded from: classes8.dex */
public interface a extends ClassFileLocator {

    /* compiled from: DynamicType.java */
    /* renamed from: net.bytebuddy.dynamic.a$a, reason: collision with other inner class name */
    public interface InterfaceC12009a<T> {

        /* compiled from: DynamicType.java */
        /* renamed from: net.bytebuddy.dynamic.a$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC12010a<S> implements InterfaceC12009a<S> {

            /* compiled from: DynamicType.java */
            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.dynamic.a$a$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC12011a<U> extends AbstractC12010a<U> {

                /* renamed from: a, reason: collision with root package name */
                public final InstrumentedType.d f416618a;

                /* renamed from: b, reason: collision with root package name */
                public final FieldRegistry f416619b;

                /* renamed from: c, reason: collision with root package name */
                public final MethodRegistry f416620c;

                /* renamed from: d, reason: collision with root package name */
                public final RecordComponentRegistry f416621d;

                /* renamed from: e, reason: collision with root package name */
                public final TypeAttributeAppender f416622e;

                /* renamed from: f, reason: collision with root package name */
                public final AsmVisitorWrapper f416623f;

                /* renamed from: g, reason: collision with root package name */
                public final ClassFileVersion f416624g;

                /* renamed from: h, reason: collision with root package name */
                public final a.InterfaceC12088a f416625h;

                /* renamed from: i, reason: collision with root package name */
                public final AnnotationValueFilter.b f416626i;

                /* renamed from: j, reason: collision with root package name */
                public final AnnotationRetention f416627j;

                /* renamed from: k, reason: collision with root package name */
                public final Implementation.Context.b f416628k;

                /* renamed from: l, reason: collision with root package name */
                public final MethodGraph.Compiler f416629l;

                /* renamed from: m, reason: collision with root package name */
                public final TypeValidation f416630m;

                /* renamed from: n, reason: collision with root package name */
                public final VisibilityBridgeStrategy f416631n;

                /* renamed from: o, reason: collision with root package name */
                public final ClassWriterStrategy f416632o;

                /* renamed from: p, reason: collision with root package name */
                public final LatentMatcher<? super net.bytebuddy.description.method.a> f416633p;

                /* renamed from: q, reason: collision with root package name */
                public final List<? extends a> f416634q;

                /* compiled from: DynamicType.java */
                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.dynamic.a$a$a$a$a, reason: collision with other inner class name */
                public class C12012a extends b.InterfaceC12015a.InterfaceC12017b.AbstractC12018a.AbstractC12019a<U> {

                    /* renamed from: d, reason: collision with root package name */
                    public final a.g f416635d;

                    public C12012a(FieldAttributeAppender.ForInstrumentedField forInstrumentedField, Transformer.NoOp noOp, @net.bytebuddy.utility.nullability.b Long l12, a.g gVar) {
                        super(forInstrumentedField, noOp, l12);
                        this.f416635d = gVar;
                    }

                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a.b
                    public final InterfaceC12009a<U> K() {
                        AbstractC12011a abstractC12011a = AbstractC12011a.this;
                        InstrumentedType.d dVar = abstractC12011a.f416618a;
                        a.g gVar = this.f416635d;
                        return abstractC12011a.K(dVar.W(gVar), abstractC12011a.f416619b.b(new LatentMatcher.c(gVar), this.f416647a, this.f416649c, this.f416648b), abstractC12011a.f416620c, abstractC12011a.f416621d, abstractC12011a.f416622e, abstractC12011a.f416623f, abstractC12011a.f416624g, abstractC12011a.f416625h, abstractC12011a.f416626i, abstractC12011a.f416627j, abstractC12011a.f416628k, abstractC12011a.f416629l, abstractC12011a.f416630m, abstractC12011a.f416631n, abstractC12011a.f416632o, abstractC12011a.f416633p, abstractC12011a.f416634q);
                    }

                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.b.InterfaceC12015a.InterfaceC12017b.AbstractC12018a.AbstractC12019a
                    public final b.InterfaceC12015a M(FieldAttributeAppender.ForInstrumentedField forInstrumentedField, Transformer.NoOp noOp, @net.bytebuddy.utility.nullability.b Long l12) {
                        return new C12012a(forInstrumentedField, noOp, l12, this.f416635d);
                    }

                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.b.InterfaceC12015a.InterfaceC12017b.AbstractC12018a.AbstractC12019a
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
                        C12012a c12012a = (C12012a) obj;
                        return this.f416635d.equals(c12012a.f416635d) && AbstractC12011a.this.equals(AbstractC12011a.this);
                    }

                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.b.InterfaceC12015a.InterfaceC12017b.AbstractC12018a.AbstractC12019a
                    public final int hashCode() {
                        return AbstractC12011a.this.hashCode() + ((this.f416635d.hashCode() + (super.hashCode() * 31)) * 31);
                    }
                }

                /* compiled from: DynamicType.java */
                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.dynamic.a$a$a$a$b */
                public class b extends b.InterfaceC12015a.InterfaceC12017b.AbstractC12018a.AbstractC12019a<U> {
                    public b() {
                        throw null;
                    }

                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a.b
                    public final InterfaceC12009a<U> K() {
                        throw null;
                    }

                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.b.InterfaceC12015a.InterfaceC12017b.AbstractC12018a.AbstractC12019a
                    public final b.InterfaceC12015a M(FieldAttributeAppender.ForInstrumentedField forInstrumentedField, Transformer.NoOp noOp, @net.bytebuddy.utility.nullability.b Long l12) {
                        throw null;
                    }

                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.b.InterfaceC12015a.InterfaceC12017b.AbstractC12018a.AbstractC12019a
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

                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.b.InterfaceC12015a.InterfaceC12017b.AbstractC12018a.AbstractC12019a
                    public final int hashCode() {
                        super.hashCode();
                        throw null;
                    }
                }

                /* compiled from: DynamicType.java */
                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.dynamic.a$a$a$a$c */
                public class c extends b<U> implements c<U> {
                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a.b
                    public final InterfaceC12009a<U> K() {
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

                /* compiled from: DynamicType.java */
                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.dynamic.a$a$a$a$d */
                public class d extends b<U> implements c.InterfaceC12021a<U> {
                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a.b
                    public final InterfaceC12009a<U> K() {
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

                /* compiled from: DynamicType.java */
                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.dynamic.a$a$a$a$e */
                public class e extends d.InterfaceC12026d.c.AbstractC12030a<U> {

                    /* renamed from: a, reason: collision with root package name */
                    public final a.h f416637a;

                    /* compiled from: DynamicType.java */
                    @HashCodeAndEqualsPlugin.Enhance
                    /* renamed from: net.bytebuddy.dynamic.a$a$a$a$e$a, reason: collision with other inner class name */
                    public class C12013a extends d.AbstractC12022a.AbstractC12023a<U> {
                        public C12013a(MethodRegistry.Handler.c cVar, MethodAttributeAppender.c cVar2, Transformer transformer) {
                            super(cVar, cVar2, transformer);
                        }

                        @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a.b
                        public final InterfaceC12009a<U> K() {
                            e eVar = e.this;
                            AbstractC12011a abstractC12011a = AbstractC12011a.this;
                            InstrumentedType.d dVar = abstractC12011a.f416618a;
                            a.h hVar = eVar.f416637a;
                            InstrumentedType.d dVarN0 = dVar.n0(hVar);
                            AbstractC12011a abstractC12011a2 = AbstractC12011a.this;
                            return abstractC12011a.K(dVarN0, abstractC12011a2.f416619b, abstractC12011a2.f416620c.b(new LatentMatcher.d(hVar), this.f416650a, this.f416651b, this.f416652c), abstractC12011a2.f416621d, abstractC12011a2.f416622e, abstractC12011a2.f416623f, abstractC12011a2.f416624g, abstractC12011a2.f416625h, abstractC12011a2.f416626i, abstractC12011a2.f416627j, abstractC12011a2.f416628k, abstractC12011a2.f416629l, abstractC12011a2.f416630m, abstractC12011a2.f416631n, abstractC12011a2.f416632o, abstractC12011a2.f416633p, abstractC12011a2.f416634q);
                        }

                        @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.AbstractC12022a.AbstractC12023a
                        public final d L(MethodRegistry.Handler.c cVar, MethodAttributeAppender.c cVar2, Transformer transformer) {
                            return e.this.new C12013a(cVar, cVar2, transformer);
                        }

                        @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.AbstractC12022a.AbstractC12023a
                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (!super.equals(obj)) {
                                return false;
                            }
                            if (this == obj) {
                                return true;
                            }
                            if (obj != null && getClass() == obj.getClass()) {
                                return e.this.equals(e.this);
                            }
                            return false;
                        }

                        @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.AbstractC12022a.AbstractC12023a
                        public final int hashCode() {
                            return e.this.hashCode() + (super.hashCode() * 31);
                        }
                    }

                    /* compiled from: DynamicType.java */
                    @HashCodeAndEqualsPlugin.Enhance
                    /* renamed from: net.bytebuddy.dynamic.a$a$a$a$e$b */
                    public class b extends d.InterfaceC12026d.b.AbstractC12028a.AbstractC12029a<U> {
                        @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.InterfaceC12026d.b.AbstractC12028a.AbstractC12029a
                        public final d.InterfaceC12026d<U> a() {
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

                    /* compiled from: DynamicType.java */
                    @HashCodeAndEqualsPlugin.Enhance
                    /* renamed from: net.bytebuddy.dynamic.a$a$a$a$e$c */
                    public class c extends d.InterfaceC12026d.InterfaceC12031d.b.AbstractC12033a.AbstractC12034a<U> {

                        /* renamed from: a, reason: collision with root package name */
                        public final c.f f416640a;

                        public c(c.f fVar) {
                            this.f416640a = fVar;
                        }

                        @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.InterfaceC12026d.InterfaceC12031d.b.AbstractC12033a.AbstractC12034a
                        public final e a() {
                            e eVar = e.this;
                            AbstractC12011a abstractC12011a = AbstractC12011a.this;
                            a.h hVar = eVar.f416637a;
                            return new e(new a.h(hVar.f416193a, hVar.f416194b, hVar.g(), hVar.f416196d, net.bytebuddy.utility.a.d(hVar.f(), this.f416640a), hVar.e(), hVar.d(), hVar.f416200h, hVar.f416201i));
                        }

                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            c cVar = (c) obj;
                            return this.f416640a.equals(cVar.f416640a) && e.this.equals(e.this);
                        }

                        public final int hashCode() {
                            return e.this.hashCode() + ((this.f416640a.hashCode() + (getClass().hashCode() * 31)) * 31);
                        }
                    }

                    /* compiled from: DynamicType.java */
                    @HashCodeAndEqualsPlugin.Enhance
                    /* renamed from: net.bytebuddy.dynamic.a$a$a$a$e$d */
                    public class d extends d.f.b.AbstractC12037a.AbstractC12038a<U> {
                        @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.f.b.AbstractC12037a.AbstractC12038a
                        public final d.InterfaceC12026d<U> a() {
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

                    public e(a.h hVar) {
                        this.f416637a = hVar;
                    }

                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.InterfaceC12026d.InterfaceC12031d
                    public final d.InterfaceC12026d.InterfaceC12031d.b<U> b(TypeDefinition typeDefinition) {
                        return new c(new c.f(typeDefinition.P0()));
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        e eVar = (e) obj;
                        return this.f416637a.equals(eVar.f416637a) && AbstractC12011a.this.equals(AbstractC12011a.this);
                    }

                    public final int hashCode() {
                        return AbstractC12011a.this.hashCode() + ((this.f416637a.hashCode() + (getClass().hashCode() * 31)) * 31);
                    }

                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.b
                    public final d.b t(d.f.e eVar) {
                        a.h hVar = this.f416637a;
                        return new e(new a.h(hVar.f416193a, hVar.f416194b, hVar.g(), hVar.f416196d, hVar.f(), net.bytebuddy.utility.a.a(hVar.e(), new d.f.c(new ArrayList(eVar))), hVar.d(), hVar.f416200h, hVar.f416201i));
                    }

                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.c
                    public final d.e<U> z(Implementation implementation) {
                        return new C12013a(new MethodRegistry.Handler.c(implementation), MethodAttributeAppender.ForInstrumentedMethod.f417500b, Transformer.NoOp.f416594b);
                    }
                }

                /* compiled from: DynamicType.java */
                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.dynamic.a$a$a$a$f */
                public class f extends d.c.AbstractC12025a<U> {

                    /* renamed from: a, reason: collision with root package name */
                    public final LatentMatcher.f f416642a;

                    /* compiled from: DynamicType.java */
                    @HashCodeAndEqualsPlugin.Enhance
                    /* renamed from: net.bytebuddy.dynamic.a$a$a$a$f$a, reason: collision with other inner class name */
                    public class C12014a extends d.AbstractC12022a.AbstractC12023a<U> {
                        public C12014a(MethodRegistry.Handler.c cVar, MethodAttributeAppender.c cVar2, Transformer transformer) {
                            super(cVar, cVar2, transformer);
                        }

                        @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a.b
                        public final InterfaceC12009a<U> K() {
                            f fVar = f.this;
                            AbstractC12011a abstractC12011a = AbstractC12011a.this;
                            InstrumentedType.d dVar = abstractC12011a.f416618a;
                            MethodRegistry.b bVarB = abstractC12011a.f416620c.b(fVar.f416642a, this.f416650a, this.f416651b, this.f416652c);
                            AbstractC12011a abstractC12011a2 = AbstractC12011a.this;
                            return abstractC12011a.K(dVar, abstractC12011a.f416619b, bVarB, abstractC12011a2.f416621d, abstractC12011a2.f416622e, abstractC12011a2.f416623f, abstractC12011a2.f416624g, abstractC12011a2.f416625h, abstractC12011a2.f416626i, abstractC12011a2.f416627j, abstractC12011a2.f416628k, abstractC12011a2.f416629l, abstractC12011a2.f416630m, abstractC12011a2.f416631n, abstractC12011a2.f416632o, abstractC12011a2.f416633p, abstractC12011a2.f416634q);
                        }

                        @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.AbstractC12022a.AbstractC12023a
                        public final d L(MethodRegistry.Handler.c cVar, MethodAttributeAppender.c cVar2, Transformer transformer) {
                            return f.this.new C12014a(cVar, cVar2, transformer);
                        }

                        @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.AbstractC12022a.AbstractC12023a
                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (!super.equals(obj)) {
                                return false;
                            }
                            if (this == obj) {
                                return true;
                            }
                            if (obj != null && getClass() == obj.getClass()) {
                                return f.this.equals(f.this);
                            }
                            return false;
                        }

                        @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.AbstractC12022a.AbstractC12023a
                        public final int hashCode() {
                            return f.this.hashCode() + (super.hashCode() * 31);
                        }
                    }

                    public f(LatentMatcher.f fVar) {
                        this.f416642a = fVar;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        f fVar = (f) obj;
                        return this.f416642a.equals(fVar.f416642a) && AbstractC12011a.this.equals(AbstractC12011a.this);
                    }

                    public final int hashCode() {
                        return AbstractC12011a.this.hashCode() + ((this.f416642a.hashCode() + (getClass().hashCode() * 31)) * 31);
                    }

                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.c
                    public final d.e<U> z(Implementation implementation) {
                        return new C12014a(new MethodRegistry.Handler.c(implementation), MethodAttributeAppender.NoOp.f417502b, Transformer.NoOp.f416594b);
                    }
                }

                /* compiled from: DynamicType.java */
                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.dynamic.a$a$a$a$g */
                public class g extends b<U> implements d.c.b<U> {

                    /* renamed from: a, reason: collision with root package name */
                    public final d.f.c f416645a;

                    public g(d.f.c cVar) {
                        this.f416645a = cVar;
                    }

                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a.b
                    public final InterfaceC12009a<U> K() {
                        AbstractC12011a abstractC12011a = AbstractC12011a.this;
                        return abstractC12011a.K(abstractC12011a.f416618a.N3(this.f416645a), abstractC12011a.f416619b, abstractC12011a.f416620c, abstractC12011a.f416621d, abstractC12011a.f416622e, abstractC12011a.f416623f, abstractC12011a.f416624g, abstractC12011a.f416625h, abstractC12011a.f416626i, abstractC12011a.f416627j, abstractC12011a.f416628k, abstractC12011a.f416629l, abstractC12011a.f416630m, abstractC12011a.f416631n, abstractC12011a.f416632o, abstractC12011a.f416633p, abstractC12011a.f416634q);
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        g gVar = (g) obj;
                        return this.f416645a.equals(gVar.f416645a) && AbstractC12011a.this.equals(AbstractC12011a.this);
                    }

                    public final int hashCode() {
                        return AbstractC12011a.this.hashCode() + ((this.f416645a.hashCode() + (getClass().hashCode() * 31)) * 31);
                    }

                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.c
                    public final d.e<U> z(Implementation implementation) {
                        InterfaceC44410t.a aVarD = C44396e.f418423d;
                        Iterator it = ((AbstractList) this.f416645a.f1()).iterator();
                        while (it.hasNext()) {
                            aVarD = aVarD.d(new U((TypeDescription) it.next()));
                        }
                        return ((AbstractC12010a) K()).J(C44411u.l(ModifierMatcher.Mode.INTERFACE.f418407d.a(aVarD))).z(implementation);
                    }
                }

                /* compiled from: DynamicType.java */
                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.dynamic.a$a$a$a$h */
                public class h extends e.InterfaceC12039a.AbstractC12040a<U> {
                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a.b
                    public final InterfaceC12009a<U> K() {
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

                /* compiled from: DynamicType.java */
                /* renamed from: net.bytebuddy.dynamic.a$a$a$a$i */
                public class i extends e.InterfaceC12039a.AbstractC12040a<U> {
                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a.b
                    public final InterfaceC12009a<U> K() {
                        throw null;
                    }
                }

                /* compiled from: DynamicType.java */
                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.dynamic.a$a$a$a$j */
                public class j extends f.AbstractC12041a<U> {
                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a.b
                    public final InterfaceC12009a<U> K() {
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

                public AbstractC12011a(InstrumentedType.d dVar, FieldRegistry fieldRegistry, MethodRegistry methodRegistry, RecordComponentRegistry recordComponentRegistry, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, a.InterfaceC12088a interfaceC12088a, AnnotationValueFilter.b bVar, AnnotationRetention annotationRetention, Implementation.Context.b bVar2, MethodGraph.Compiler compiler, TypeValidation typeValidation, VisibilityBridgeStrategy visibilityBridgeStrategy, ClassWriterStrategy classWriterStrategy, LatentMatcher<? super net.bytebuddy.description.method.a> latentMatcher, List<? extends a> list) {
                    this.f416618a = dVar;
                    this.f416619b = fieldRegistry;
                    this.f416620c = methodRegistry;
                    this.f416621d = recordComponentRegistry;
                    this.f416622e = typeAttributeAppender;
                    this.f416623f = asmVisitorWrapper;
                    this.f416624g = classFileVersion;
                    this.f416625h = interfaceC12088a;
                    this.f416626i = bVar;
                    this.f416627j = annotationRetention;
                    this.f416628k = bVar2;
                    this.f416629l = compiler;
                    this.f416630m = typeValidation;
                    this.f416631n = visibilityBridgeStrategy;
                    this.f416632o = classWriterStrategy;
                    this.f416633p = latentMatcher;
                    this.f416634q = list;
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final InterfaceC12009a<U> D(LatentMatcher<? super net.bytebuddy.description.method.a> latentMatcher) {
                    return K(this.f416618a, this.f416619b, this.f416620c, this.f416621d, this.f416622e, this.f416623f, this.f416624g, this.f416625h, this.f416626i, this.f416627j, this.f416628k, this.f416629l, this.f416630m, this.f416631n, this.f416632o, new LatentMatcher.b(this.f416633p, latentMatcher), this.f416634q);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final d.InterfaceC12026d.c E(String str, TypeDescription.Generic.a aVar, int i12) {
                    return new e(new a.h(str, i12, aVar));
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final InterfaceC12009a<U> I(TypeAttributeAppender typeAttributeAppender) {
                    return K(this.f416618a, this.f416619b, this.f416620c, this.f416621d, new TypeAttributeAppender.a(this.f416622e, typeAttributeAppender), this.f416623f, this.f416624g, this.f416625h, this.f416626i, this.f416627j, this.f416628k, this.f416629l, this.f416630m, this.f416631n, this.f416632o, this.f416633p, this.f416634q);
                }

                public abstract InterfaceC12009a<U> K(InstrumentedType.d dVar, FieldRegistry fieldRegistry, MethodRegistry methodRegistry, RecordComponentRegistry recordComponentRegistry, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, a.InterfaceC12088a interfaceC12088a, AnnotationValueFilter.b bVar, AnnotationRetention annotationRetention, Implementation.Context.b bVar2, MethodGraph.Compiler compiler, TypeValidation typeValidation, VisibilityBridgeStrategy visibilityBridgeStrategy, ClassWriterStrategy classWriterStrategy, LatentMatcher<? super net.bytebuddy.description.method.a> latentMatcher, List<? extends a> list);

                public final InterfaceC12009a<U> L(String str) {
                    return K(this.f416618a.R3(str), this.f416619b, this.f416620c, this.f416621d, this.f416622e, this.f416623f, this.f416624g, this.f416625h, this.f416626i, this.f416627j, this.f416628k, this.f416629l, this.f416630m, this.f416631n, this.f416632o, this.f416633p, this.f416634q);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final d.InterfaceC12026d.c<U> a(int i12) {
                    return new e(new a.h(i12));
                }

                public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    AbstractC12011a abstractC12011a = (AbstractC12011a) obj;
                    return this.f416627j.equals(abstractC12011a.f416627j) && this.f416630m.equals(abstractC12011a.f416630m) && this.f416618a.equals(abstractC12011a.f416618a) && this.f416619b.equals(abstractC12011a.f416619b) && this.f416620c.equals(abstractC12011a.f416620c) && this.f416621d.equals(abstractC12011a.f416621d) && this.f416622e.equals(abstractC12011a.f416622e) && this.f416623f.equals(abstractC12011a.f416623f) && this.f416624g.equals(abstractC12011a.f416624g) && this.f416625h.equals(abstractC12011a.f416625h) && this.f416626i.equals(abstractC12011a.f416626i) && this.f416628k.equals(abstractC12011a.f416628k) && this.f416629l.equals(abstractC12011a.f416629l) && this.f416631n.equals(abstractC12011a.f416631n) && this.f416632o.equals(abstractC12011a.f416632o) && this.f416633p.equals(abstractC12011a.f416633p) && this.f416634q.equals(abstractC12011a.f416634q);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final InterfaceC12009a<U> g(int i12) {
                    return K(this.f416618a.n3(i12), this.f416619b, this.f416620c, this.f416621d, this.f416622e, this.f416623f, this.f416624g, this.f416625h, this.f416626i, this.f416627j, this.f416628k, this.f416629l, this.f416630m, this.f416631n, this.f416632o, this.f416633p, this.f416634q);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final d.c.b h(d.f.e eVar) {
                    return new g(new d.f.c(new ArrayList(eVar)));
                }

                public int hashCode() {
                    return this.f416634q.hashCode() + ((this.f416633p.hashCode() + ((this.f416632o.hashCode() + ((this.f416631n.hashCode() + ((this.f416630m.hashCode() + ((this.f416629l.hashCode() + ((this.f416628k.hashCode() + ((this.f416627j.hashCode() + ((this.f416626i.hashCode() + ((this.f416625h.hashCode() + ((this.f416624g.hashCode() + ((this.f416623f.hashCode() + ((this.f416622e.hashCode() + ((this.f416621d.hashCode() + ((this.f416620c.hashCode() + ((this.f416619b.hashCode() + ((this.f416618a.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final InterfaceC12009a<U> j(Collection<? extends AnnotationDescription> collection) {
                    return K(this.f416618a.B0(new ArrayList(collection)), this.f416619b, this.f416620c, this.f416621d, this.f416622e, this.f416623f, this.f416624g, this.f416625h, this.f416626i, this.f416627j, this.f416628k, this.f416629l, this.f416630m, this.f416631n, this.f416632o, this.f416633p, this.f416634q);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final b.InterfaceC12015a.InterfaceC12017b<U> n(String str, TypeDefinition typeDefinition, int i12) {
                    return new C12012a(FieldAttributeAppender.ForInstrumentedField.f417491b, Transformer.NoOp.f416594b, null, new a.g(str, i12, typeDefinition.P0()));
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final InterfaceC12009a<U> r(AsmVisitorWrapper asmVisitorWrapper) {
                    return K(this.f416618a, this.f416619b, this.f416620c, this.f416621d, this.f416622e, new AsmVisitorWrapper.b(this.f416623f, asmVisitorWrapper), this.f416624g, this.f416625h, this.f416626i, this.f416627j, this.f416628k, this.f416629l, this.f416630m, this.f416631n, this.f416632o, this.f416633p, this.f416634q);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final InterfaceC12009a<U> v(net.bytebuddy.implementation.bytecode.a aVar) {
                    return K(this.f416618a.U2(aVar), this.f416619b, this.f416620c, this.f416621d, this.f416622e, this.f416623f, this.f416624g, this.f416625h, this.f416626i, this.f416627j, this.f416628k, this.f416629l, this.f416630m, this.f416631n, this.f416632o, this.f416633p, this.f416634q);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final d.c w(LatentMatcher.f fVar) {
                    return new f(fVar);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final InterfaceC12009a<U> x(TypeDescription typeDescription) {
                    return K(this.f416618a.o5(typeDescription), this.f416619b, this.f416620c, this.f416621d, this.f416622e, this.f416623f, this.f416624g, this.f416625h, this.f416626i, this.f416627j, this.f416628k, this.f416629l, this.f416630m, this.f416631n, this.f416632o, this.f416633p, this.f416634q);
                }
            }

            /* compiled from: DynamicType.java */
            /* renamed from: net.bytebuddy.dynamic.a$a$a$b */
            public static abstract class b<U> extends AbstractC12010a<U> {
                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final InterfaceC12009a<U> D(LatentMatcher<? super net.bytebuddy.description.method.a> latentMatcher) {
                    return K().D(latentMatcher);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final d.InterfaceC12026d.c E(String str, TypeDescription.Generic.a aVar, int i12) {
                    return K().E(str, aVar, i12);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final InterfaceC12009a<U> I(TypeAttributeAppender typeAttributeAppender) {
                    return K().I(typeAttributeAppender);
                }

                public abstract InterfaceC12009a<U> K();

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final d.InterfaceC12026d.c<U> a(int i12) {
                    return K().a(i12);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final InterfaceC12009a<U> g(int i12) {
                    return K().g(i12);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final d.c.b h(d.f.e eVar) {
                    return K().h(eVar);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final d<U> i(TypeResolutionStrategy typeResolutionStrategy, TypePool typePool) {
                    return K().i(typeResolutionStrategy, typePool);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final InterfaceC12009a<U> j(Collection<? extends AnnotationDescription> collection) {
                    return K().j(collection);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a, net.bytebuddy.dynamic.a.InterfaceC12009a
                public final InterfaceC12009a k(InterfaceC44410t.a aVar) {
                    return K().k(aVar);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final b.InterfaceC12015a.InterfaceC12017b<U> n(String str, TypeDefinition typeDefinition, int i12) {
                    return K().n(str, typeDefinition, i12);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a, net.bytebuddy.dynamic.a.InterfaceC12009a
                public final d<U> p() {
                    return K().p();
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final InterfaceC12009a<U> r(AsmVisitorWrapper asmVisitorWrapper) {
                    return K().r(asmVisitorWrapper);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final d s() {
                    return K().s();
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final InterfaceC12009a<U> v(net.bytebuddy.implementation.bytecode.a aVar) {
                    return K().v(aVar);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final d.c w(LatentMatcher.f fVar) {
                    return K().w(fVar);
                }

                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
                public final InterfaceC12009a<U> x(TypeDescription typeDescription) {
                    return K().x(typeDescription);
                }
            }

            @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
            public final d.InterfaceC12026d.c B(String str, Class cls, a.b... bVarArr) {
                return E(str, TypeDefinition.Sort.a(cls, TypeDescription.Generic.AnnotationReader.NoOp.f416326b), new a.e(Arrays.asList(bVarArr)).a(0));
            }

            @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
            public final b.InterfaceC12015a H() {
                return e("serialVersionUID", Long.TYPE, Visibility.PRIVATE, FieldManifestation.FINAL, Ownership.STATIC).value();
            }

            public final d.c<S> J(InterfaceC44410t<? super net.bytebuddy.description.method.a> interfaceC44410t) {
                return w(new LatentMatcher.f(interfaceC44410t));
            }

            @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
            public final d.c.b<S> c(List<? extends Type> list) {
                return h(new d.f.e(list));
            }

            @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
            public final b.InterfaceC12015a.InterfaceC12017b<S> d(String str, TypeDefinition typeDefinition, a.InterfaceC11985a... interfaceC11985aArr) {
                return n(str, typeDefinition, new a.e(Arrays.asList(interfaceC11985aArr)).a(0));
            }

            @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
            public final b.InterfaceC12015a.InterfaceC12017b<S> e(String str, Type type, a.InterfaceC11985a... interfaceC11985aArr) {
                return n(str, TypeDefinition.Sort.a(type, TypeDescription.Generic.AnnotationReader.NoOp.f416326b), new a.e(Arrays.asList(interfaceC11985aArr)).a(0));
            }

            @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
            public final d.InterfaceC12026d.c<S> f(a.b... bVarArr) {
                return a(new a.e(Arrays.asList(bVarArr)).a(0));
            }

            @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
            public InterfaceC12009a k(InterfaceC44410t.a aVar) {
                return D(new LatentMatcher.f(aVar));
            }

            @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
            public final d.c.b<S> m(Type... typeArr) {
                return c(Arrays.asList(typeArr));
            }

            @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
            public d<S> p() {
                return s();
            }

            @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
            public final InterfaceC12009a<S> q(Annotation... annotationArr) {
                return j(new a.d((List<? extends Annotation>) Arrays.asList(annotationArr)));
            }

            @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
            public final d.c u(InterfaceC44410t.a aVar) {
                return J(MethodSortMatcher.Sort.f418386d.f418392c.a(aVar));
            }

            @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
            public final InterfaceC12009a<S> y(a.d... dVarArr) {
                return g(new a.e(Arrays.asList(dVarArr)).a(0));
            }
        }

        /* compiled from: DynamicType.java */
        /* renamed from: net.bytebuddy.dynamic.a$a$b */
        public interface b<S> {

            /* compiled from: DynamicType.java */
            /* renamed from: net.bytebuddy.dynamic.a$a$b$a, reason: collision with other inner class name */
            public interface InterfaceC12015a<U> extends b<U>, InterfaceC12009a<U> {

                /* compiled from: DynamicType.java */
                /* renamed from: net.bytebuddy.dynamic.a$a$b$a$a, reason: collision with other inner class name */
                public static abstract class AbstractC12016a<U> extends AbstractC12010a.b<U> implements InterfaceC12015a<U> {
                }

                /* compiled from: DynamicType.java */
                /* renamed from: net.bytebuddy.dynamic.a$a$b$a$b, reason: collision with other inner class name */
                public interface InterfaceC12017b<V> extends InterfaceC12020b<V>, InterfaceC12015a<V> {

                    /* compiled from: DynamicType.java */
                    /* renamed from: net.bytebuddy.dynamic.a$a$b$a$b$a, reason: collision with other inner class name */
                    public static abstract class AbstractC12018a<U> extends AbstractC12016a<U> implements InterfaceC12017b<U> {

                        /* compiled from: DynamicType.java */
                        @HashCodeAndEqualsPlugin.Enhance
                        /* renamed from: net.bytebuddy.dynamic.a$a$b$a$b$a$a, reason: collision with other inner class name */
                        public static abstract class AbstractC12019a<V> extends AbstractC12018a<V> {

                            /* renamed from: a, reason: collision with root package name */
                            public final FieldAttributeAppender.ForInstrumentedField f416647a;

                            /* renamed from: b, reason: collision with root package name */
                            public final Transformer.NoOp f416648b;

                            /* renamed from: c, reason: collision with root package name */
                            @HashCodeAndEqualsPlugin.ValueHandling
                            @net.bytebuddy.utility.nullability.b
                            public final Long f416649c;

                            public AbstractC12019a(FieldAttributeAppender.ForInstrumentedField forInstrumentedField, Transformer.NoOp noOp, @net.bytebuddy.utility.nullability.b Long l12) {
                                this.f416647a = forInstrumentedField;
                                this.f416648b = noOp;
                                this.f416649c = l12;
                            }

                            @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.b.InterfaceC12015a.InterfaceC12017b.AbstractC12018a
                            public final InterfaceC12015a L(Long l12) {
                                return M(this.f416647a, this.f416648b, l12);
                            }

                            public abstract InterfaceC12015a M(FieldAttributeAppender.ForInstrumentedField forInstrumentedField, Transformer.NoOp noOp, @net.bytebuddy.utility.nullability.b Long l12);

                            /* JADX WARN: Removed duplicated region for block: B:25:0x003d A[RETURN] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public boolean equals(@net.bytebuddy.utility.nullability.b java.lang.Object r5) {
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
                                    net.bytebuddy.dynamic.a$a$b$a$b$a$a r5 = (net.bytebuddy.dynamic.a.InterfaceC12009a.b.InterfaceC12015a.InterfaceC12017b.AbstractC12018a.AbstractC12019a) r5
                                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$ForInstrumentedField r2 = r5.f416647a
                                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$ForInstrumentedField r3 = r4.f416647a
                                    boolean r2 = r3.equals(r2)
                                    if (r2 != 0) goto L20
                                    return r1
                                L20:
                                    net.bytebuddy.dynamic.Transformer$NoOp r2 = r4.f416648b
                                    net.bytebuddy.dynamic.Transformer$NoOp r3 = r5.f416648b
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L2b
                                    return r1
                                L2b:
                                    java.lang.Long r2 = r4.f416649c
                                    java.lang.Long r5 = r5.f416649c
                                    if (r5 == 0) goto L3a
                                    if (r2 == 0) goto L3c
                                    boolean r5 = r2.equals(r5)
                                    if (r5 != 0) goto L3d
                                    return r1
                                L3a:
                                    if (r2 == 0) goto L3d
                                L3c:
                                    return r1
                                L3d:
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.a.InterfaceC12009a.b.InterfaceC12015a.InterfaceC12017b.AbstractC12018a.AbstractC12019a.equals(java.lang.Object):boolean");
                            }

                            public int hashCode() {
                                int iHashCode = (this.f416648b.hashCode() + ((this.f416647a.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31;
                                Long l12 = this.f416649c;
                                return l12 != null ? iHashCode + l12.hashCode() : iHashCode;
                            }
                        }

                        public abstract InterfaceC12015a L(Long l12);

                        @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.b.InterfaceC12020b
                        public final InterfaceC12015a value() {
                            return L(42L);
                        }
                    }
                }
            }

            /* compiled from: DynamicType.java */
            /* renamed from: net.bytebuddy.dynamic.a$a$b$b, reason: collision with other inner class name */
            public interface InterfaceC12020b<U> extends b<U> {
                InterfaceC12015a value();
            }
        }

        /* compiled from: DynamicType.java */
        /* renamed from: net.bytebuddy.dynamic.a$a$c */
        public interface c<S> extends InterfaceC12009a<S> {

            /* compiled from: DynamicType.java */
            /* renamed from: net.bytebuddy.dynamic.a$a$c$a, reason: collision with other inner class name */
            public interface InterfaceC12021a<U> extends c<U> {
            }
        }

        /* compiled from: DynamicType.java */
        /* renamed from: net.bytebuddy.dynamic.a$a$d */
        public interface d<S> extends InterfaceC12009a<S> {

            /* compiled from: DynamicType.java */
            /* renamed from: net.bytebuddy.dynamic.a$a$d$a, reason: collision with other inner class name */
            public static abstract class AbstractC12022a<U> extends AbstractC12010a.b<U> implements d<U> {

                /* compiled from: DynamicType.java */
                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.dynamic.a$a$d$a$a, reason: collision with other inner class name */
                public static abstract class AbstractC12023a<V> extends e.AbstractC12035a<V> {

                    /* renamed from: a, reason: collision with root package name */
                    public final MethodRegistry.Handler.c f416650a;

                    /* renamed from: b, reason: collision with root package name */
                    public final MethodAttributeAppender.c f416651b;

                    /* renamed from: c, reason: collision with root package name */
                    public final Transformer<net.bytebuddy.description.method.a> f416652c;

                    public AbstractC12023a(MethodRegistry.Handler.c cVar, MethodAttributeAppender.c cVar2, Transformer transformer) {
                        this.f416650a = cVar;
                        this.f416651b = cVar2;
                        this.f416652c = transformer;
                    }

                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d
                    public final d<V> C(MethodAttributeAppender.c cVar) {
                        return L(this.f416650a, new MethodAttributeAppender.c.a(this.f416651b, cVar), this.f416652c);
                    }

                    public abstract d L(MethodRegistry.Handler.c cVar, MethodAttributeAppender.c cVar2, Transformer transformer);

                    public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        AbstractC12023a abstractC12023a = (AbstractC12023a) obj;
                        return this.f416650a.equals(abstractC12023a.f416650a) && this.f416651b.equals(abstractC12023a.f416651b) && this.f416652c.equals(abstractC12023a.f416652c);
                    }

                    public int hashCode() {
                        return this.f416652c.hashCode() + ((this.f416651b.hashCode() + ((this.f416650a.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31);
                    }

                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d
                    public final d l(Transformer.c cVar) {
                        return L(this.f416650a, this.f416651b, new Transformer.a(this.f416652c, cVar));
                    }
                }
            }

            /* compiled from: DynamicType.java */
            /* renamed from: net.bytebuddy.dynamic.a$a$d$b */
            public interface b<U> extends f<U> {

                /* compiled from: DynamicType.java */
                /* renamed from: net.bytebuddy.dynamic.a$a$d$b$a, reason: collision with other inner class name */
                public static abstract class AbstractC12024a<V> extends f.AbstractC12036a<V> implements b<V> {
                    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.b
                    public final b<V> F(Type... typeArr) {
                        return t(new d.f.e((List<? extends Type>) Arrays.asList(typeArr)));
                    }
                }

                b<U> F(Type... typeArr);

                b t(d.f.e eVar);
            }

            /* compiled from: DynamicType.java */
            /* renamed from: net.bytebuddy.dynamic.a$a$d$c */
            public interface c<U> {

                /* compiled from: DynamicType.java */
                /* renamed from: net.bytebuddy.dynamic.a$a$d$c$a, reason: collision with other inner class name */
                public static abstract class AbstractC12025a<V> implements c<V> {
                }

                /* compiled from: DynamicType.java */
                /* renamed from: net.bytebuddy.dynamic.a$a$d$c$b */
                public interface b<V> extends c<V>, InterfaceC12009a<V> {
                }

                e<U> z(Implementation implementation);
            }

            /* compiled from: DynamicType.java */
            /* renamed from: net.bytebuddy.dynamic.a$a$d$d, reason: collision with other inner class name */
            public interface InterfaceC12026d<U> extends b<U> {

                /* compiled from: DynamicType.java */
                /* renamed from: net.bytebuddy.dynamic.a$a$d$d$a, reason: collision with other inner class name */
                public static abstract class AbstractC12027a<V> extends b.AbstractC12024a<V> implements InterfaceC12026d<V> {
                }

                /* compiled from: DynamicType.java */
                /* renamed from: net.bytebuddy.dynamic.a$a$d$d$b */
                public interface b<V> extends InterfaceC12026d<V> {

                    /* compiled from: DynamicType.java */
                    /* renamed from: net.bytebuddy.dynamic.a$a$d$d$b$a, reason: collision with other inner class name */
                    public static abstract class AbstractC12028a<W> extends AbstractC12027a<W> implements b<W> {

                        /* compiled from: DynamicType.java */
                        /* renamed from: net.bytebuddy.dynamic.a$a$d$d$b$a$a, reason: collision with other inner class name */
                        public static abstract class AbstractC12029a<X> extends AbstractC12028a<X> {
                            public abstract InterfaceC12026d<X> a();

                            @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.b
                            public final b t(d.f.e eVar) {
                                a();
                                throw null;
                            }

                            @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.c
                            public final e<X> z(Implementation implementation) {
                                a();
                                throw null;
                            }
                        }
                    }
                }

                /* compiled from: DynamicType.java */
                /* renamed from: net.bytebuddy.dynamic.a$a$d$d$c */
                public interface c<V> extends InterfaceC12026d<V>, InterfaceC12031d<V> {

                    /* compiled from: DynamicType.java */
                    /* renamed from: net.bytebuddy.dynamic.a$a$d$d$c$a, reason: collision with other inner class name */
                    public static abstract class AbstractC12030a<W> extends AbstractC12027a<W> implements c<W> {
                        @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.InterfaceC12026d.c
                        public final InterfaceC12031d A(Type... typeArr) {
                            return o(Arrays.asList(typeArr));
                        }

                        @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.InterfaceC12026d.c
                        public final InterfaceC12031d G(Collection collection) {
                            Iterator it = collection.iterator();
                            InterfaceC12031d interfaceC12031dB = this;
                            while (it.hasNext()) {
                                interfaceC12031dB = interfaceC12031dB.b((TypeDefinition) it.next());
                            }
                            return interfaceC12031dB;
                        }

                        @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.InterfaceC12026d.c
                        public final InterfaceC12031d o(List list) {
                            return G(new d.f.e((List<? extends Type>) list));
                        }
                    }

                    InterfaceC12031d A(Type... typeArr);

                    InterfaceC12031d G(Collection collection);

                    InterfaceC12031d o(List list);
                }

                /* compiled from: DynamicType.java */
                /* renamed from: net.bytebuddy.dynamic.a$a$d$d$d, reason: collision with other inner class name */
                public interface InterfaceC12031d<V> extends b<V> {

                    /* compiled from: DynamicType.java */
                    /* renamed from: net.bytebuddy.dynamic.a$a$d$d$d$a, reason: collision with other inner class name */
                    public static abstract class AbstractC12032a<W> extends b.AbstractC12024a<W> implements InterfaceC12031d<W> {
                    }

                    /* compiled from: DynamicType.java */
                    /* renamed from: net.bytebuddy.dynamic.a$a$d$d$d$b */
                    public interface b<V> extends InterfaceC12031d<V> {

                        /* compiled from: DynamicType.java */
                        /* renamed from: net.bytebuddy.dynamic.a$a$d$d$d$b$a, reason: collision with other inner class name */
                        public static abstract class AbstractC12033a<W> extends AbstractC12032a<W> implements b<W> {

                            /* compiled from: DynamicType.java */
                            /* renamed from: net.bytebuddy.dynamic.a$a$d$d$d$b$a$a, reason: collision with other inner class name */
                            public static abstract class AbstractC12034a<X> extends AbstractC12033a<X> {
                                public abstract AbstractC12010a.AbstractC12011a.e a();

                                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.InterfaceC12026d.InterfaceC12031d
                                public final b<X> b(TypeDefinition typeDefinition) {
                                    return a().b(typeDefinition);
                                }

                                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.b
                                public final b t(d.f.e eVar) {
                                    return a().t(eVar);
                                }

                                @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.c
                                public final e<X> z(Implementation implementation) {
                                    return a().z(implementation);
                                }
                            }
                        }
                    }

                    b<V> b(TypeDefinition typeDefinition);
                }
            }

            /* compiled from: DynamicType.java */
            /* renamed from: net.bytebuddy.dynamic.a$a$d$e */
            public interface e<U> extends d<U> {

                /* compiled from: DynamicType.java */
                /* renamed from: net.bytebuddy.dynamic.a$a$d$e$a, reason: collision with other inner class name */
                public static abstract class AbstractC12035a<V> extends AbstractC12022a<V> implements e<V> {
                }
            }

            /* compiled from: DynamicType.java */
            /* renamed from: net.bytebuddy.dynamic.a$a$d$f */
            public interface f<U> extends c<U> {

                /* compiled from: DynamicType.java */
                /* renamed from: net.bytebuddy.dynamic.a$a$d$f$a, reason: collision with other inner class name */
                public static abstract class AbstractC12036a<V> extends c.AbstractC12025a<V> implements f<V> {
                }

                /* compiled from: DynamicType.java */
                /* renamed from: net.bytebuddy.dynamic.a$a$d$f$b */
                public interface b<V> extends f<V> {

                    /* compiled from: DynamicType.java */
                    /* renamed from: net.bytebuddy.dynamic.a$a$d$f$b$a, reason: collision with other inner class name */
                    public static abstract class AbstractC12037a<W> extends AbstractC12036a<W> implements b<W> {

                        /* compiled from: DynamicType.java */
                        /* renamed from: net.bytebuddy.dynamic.a$a$d$f$b$a$a, reason: collision with other inner class name */
                        public static abstract class AbstractC12038a<X> extends AbstractC12037a<X> {
                            public abstract InterfaceC12026d<X> a();

                            @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.d.c
                            public final e<X> z(Implementation implementation) {
                                a();
                                throw null;
                            }
                        }
                    }
                }
            }

            d<S> C(MethodAttributeAppender.c cVar);

            d l(Transformer.c cVar);
        }

        /* compiled from: DynamicType.java */
        /* renamed from: net.bytebuddy.dynamic.a$a$e */
        public interface e<S> {

            /* compiled from: DynamicType.java */
            /* renamed from: net.bytebuddy.dynamic.a$a$e$a, reason: collision with other inner class name */
            public interface InterfaceC12039a<U> extends e<U>, InterfaceC12009a<U> {

                /* compiled from: DynamicType.java */
                /* renamed from: net.bytebuddy.dynamic.a$a$e$a$a, reason: collision with other inner class name */
                public static abstract class AbstractC12040a<U> extends AbstractC12010a.b<U> implements InterfaceC12039a<U> {
                }
            }
        }

        /* compiled from: DynamicType.java */
        /* renamed from: net.bytebuddy.dynamic.a$a$f */
        public interface f<S> extends InterfaceC12009a<S> {

            /* compiled from: DynamicType.java */
            /* renamed from: net.bytebuddy.dynamic.a$a$f$a, reason: collision with other inner class name */
            public static abstract class AbstractC12041a<U> extends AbstractC12010a.b<U> implements f<U> {
            }
        }

        d.InterfaceC12026d.c B(String str, Class cls, a.b... bVarArr);

        InterfaceC12009a<T> D(LatentMatcher<? super net.bytebuddy.description.method.a> latentMatcher);

        d.InterfaceC12026d.c E(String str, TypeDescription.Generic.a aVar, int i12);

        b.InterfaceC12015a H();

        InterfaceC12009a<T> I(TypeAttributeAppender typeAttributeAppender);

        d.InterfaceC12026d.c<T> a(int i12);

        d.c.b<T> c(List<? extends Type> list);

        b.InterfaceC12015a.InterfaceC12017b<T> d(String str, TypeDefinition typeDefinition, a.InterfaceC11985a... interfaceC11985aArr);

        b.InterfaceC12015a.InterfaceC12017b<T> e(String str, Type type, a.InterfaceC11985a... interfaceC11985aArr);

        d.InterfaceC12026d.c<T> f(a.b... bVarArr);

        InterfaceC12009a<T> g(int i12);

        d.c.b h(d.f.e eVar);

        d<T> i(TypeResolutionStrategy typeResolutionStrategy, TypePool typePool);

        InterfaceC12009a<T> j(Collection<? extends AnnotationDescription> collection);

        InterfaceC12009a k(InterfaceC44410t.a aVar);

        d.c.b<T> m(Type... typeArr);

        b.InterfaceC12015a.InterfaceC12017b<T> n(String str, TypeDefinition typeDefinition, int i12);

        d<T> p();

        InterfaceC12009a<T> q(Annotation... annotationArr);

        InterfaceC12009a<T> r(AsmVisitorWrapper asmVisitorWrapper);

        d s();

        d.c u(InterfaceC44410t.a aVar);

        InterfaceC12009a<T> v(net.bytebuddy.implementation.bytecode.a aVar);

        d.c w(LatentMatcher.f fVar);

        InterfaceC12009a<T> x(TypeDescription typeDescription);

        InterfaceC12009a<T> y(a.d... dVarArr);
    }

    /* compiled from: DynamicType.java */
    public interface c<T> extends a {
    }

    /* compiled from: DynamicType.java */
    public interface d<T> extends a {
        b.C12042a l6(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, ClassLoadingStrategy classLoadingStrategy);
    }

    LinkedHashMap I0();

    HashMap J3();

    TypeDescription t();

    /* compiled from: DynamicType.java */
    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements a {

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription f416653b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f416654c;

        /* renamed from: d, reason: collision with root package name */
        public final LoadedTypeInitializer f416655d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f416656e;

        /* compiled from: DynamicType.java */
        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.dynamic.a$b$a, reason: collision with other inner class name */
        public static class C12042a<T> extends b implements c<T> {

            /* renamed from: f, reason: collision with root package name */
            public final Map<TypeDescription, Class<?>> f416657f;

            public C12042a(TypeDescription typeDescription, byte[] bArr, LoadedTypeInitializer loadedTypeInitializer, ArrayList arrayList, Map map) {
                super(typeDescription, bArr, loadedTypeInitializer, arrayList);
                this.f416657f = map;
            }

            public final Class<? extends T> a() {
                return (Class) this.f416657f.get(this.f416653b);
            }

            @Override // net.bytebuddy.dynamic.a.b
            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f416657f.equals(((C12042a) obj).f416657f);
                }
                return false;
            }

            @Override // net.bytebuddy.dynamic.a.b
            public final int hashCode() {
                return this.f416657f.hashCode() + (super.hashCode() * 31);
            }
        }

        /* compiled from: DynamicType.java */
        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.dynamic.a$b$b, reason: collision with other inner class name */
        public static class C12043b<T> extends b implements d<T> {

            /* renamed from: f, reason: collision with root package name */
            public final TypeResolutionStrategy.b f416658f;

            public C12043b(TypeDescription typeDescription, byte[] bArr, LoadedTypeInitializer loadedTypeInitializer, ArrayList arrayList, TypeResolutionStrategy.b bVar) {
                super(typeDescription, bArr, loadedTypeInitializer, arrayList);
                this.f416658f = bVar;
            }

            @Override // net.bytebuddy.dynamic.a.b
            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f416658f.equals(((C12043b) obj).f416658f);
                }
                return false;
            }

            @Override // net.bytebuddy.dynamic.a.b
            public final int hashCode() {
                return this.f416658f.hashCode() + (super.hashCode() * 31);
            }

            @Override // net.bytebuddy.dynamic.a.d
            public final C12042a l6(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, ClassLoadingStrategy classLoadingStrategy) {
                Map mapC = this.f416658f.c(this, classLoader, classLoadingStrategy);
                return new C12042a(this.f416653b, this.f416654c, this.f416655d, this.f416656e, mapC);
            }
        }

        @SuppressFBWarnings(justification = "The array is not modified by class contract.", value = {"EI_EXPOSE_REP2"})
        public b(TypeDescription typeDescription, byte[] bArr, LoadedTypeInitializer loadedTypeInitializer, ArrayList arrayList) {
            this.f416653b = typeDescription;
            this.f416654c = bArr;
            this.f416655d = loadedTypeInitializer;
            this.f416656e = arrayList;
        }

        @Override // net.bytebuddy.dynamic.a
        public final LinkedHashMap I0() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(this.f416653b, this.f416654c);
            Iterator it = this.f416656e.iterator();
            while (it.hasNext()) {
                linkedHashMap.putAll(((a) it.next()).I0());
            }
            return linkedHashMap;
        }

        @Override // net.bytebuddy.dynamic.a
        public final HashMap J3() {
            HashMap map = new HashMap();
            Iterator it = this.f416656e.iterator();
            while (it.hasNext()) {
                map.putAll(((a) it.next()).J3());
            }
            map.put(this.f416653b, this.f416655d);
            return map;
        }

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public final ClassFileLocator.h K(String str) {
            if (this.f416653b.getName().equals(str)) {
                return new ClassFileLocator.h.a(this.f416654c);
            }
            Iterator it = this.f416656e.iterator();
            while (it.hasNext()) {
                ClassFileLocator.h hVarK = ((a) it.next()).K(str);
                if (hVarK.b()) {
                    return hVarK;
                }
            }
            return new ClassFileLocator.h.b(str);
        }

        public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f416653b.equals(bVar.f416653b) && Arrays.equals(this.f416654c, bVar.f416654c) && this.f416655d.equals(bVar.f416655d) && this.f416656e.equals(bVar.f416656e);
        }

        public int hashCode() {
            return this.f416656e.hashCode() + ((this.f416655d.hashCode() + ((Arrays.hashCode(this.f416654c) + D8.j(this.f416653b, getClass().hashCode() * 31, 31)) * 31)) * 31);
        }

        @Override // net.bytebuddy.dynamic.a
        public final TypeDescription t() {
            return this.f416653b;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
