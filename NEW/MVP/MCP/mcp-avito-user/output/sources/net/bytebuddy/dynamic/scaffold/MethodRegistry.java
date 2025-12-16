package net.bytebuddy.dynamic.scaffold;

import androidx.media3.exoplayer.analytics.m;
import com.yandex.div2.D8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.method.b;
import net.bytebuddy.description.modifier.Visibility;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.Transformer;
import net.bytebuddy.dynamic.VisibilityBridgeStrategy;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import net.bytebuddy.dynamic.scaffold.TypeWriter;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.LoadedTypeInitializer;
import net.bytebuddy.implementation.attribute.MethodAttributeAppender;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.LatentMatcher;
import net.bytebuddy.matcher.M;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.matcher.T;

/* loaded from: classes8.dex */
public interface MethodRegistry {

    public interface a extends TypeWriter.MethodPool {
    }

    public interface c {
        b.a a(Implementation.Target.a aVar, ClassFileVersion classFileVersion);
    }

    b a(LatentMatcher.f fVar, Handler.c cVar, MethodAttributeAppender.NoOp noOp);

    b b(LatentMatcher latentMatcher, Handler.c cVar, MethodAttributeAppender.c cVar2, Transformer transformer);

    b.c c(InstrumentedType instrumentedType, MethodGraph.Compiler compiler, TypeValidation typeValidation, VisibilityBridgeStrategy visibilityBridgeStrategy, LatentMatcher latentMatcher);

    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements MethodRegistry {

        /* renamed from: a, reason: collision with root package name */
        public final List<C12059b> f416924a;

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements a {

            /* renamed from: a, reason: collision with root package name */
            public final TypeDescription f416925a;

            /* renamed from: b, reason: collision with root package name */
            public final LoadedTypeInitializer f416926b;

            /* renamed from: c, reason: collision with root package name */
            public final TypeInitializer f416927c;

            /* renamed from: d, reason: collision with root package name */
            public final b.c f416928d;

            /* renamed from: e, reason: collision with root package name */
            public final LinkedHashMap<net.bytebuddy.description.method.a, C12058a> f416929e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f416930f;

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.dynamic.scaffold.MethodRegistry$b$a$a, reason: collision with other inner class name */
            public static class C12058a {

                /* renamed from: a, reason: collision with root package name */
                public final Handler.a f416931a;

                /* renamed from: b, reason: collision with root package name */
                public final MethodAttributeAppender f416932b;

                /* renamed from: c, reason: collision with root package name */
                public final net.bytebuddy.description.method.a f416933c;

                /* renamed from: d, reason: collision with root package name */
                public final HashSet f416934d;

                /* renamed from: e, reason: collision with root package name */
                public final Visibility f416935e;

                /* renamed from: f, reason: collision with root package name */
                public final boolean f416936f;

                public C12058a(Handler.a aVar, MethodAttributeAppender methodAttributeAppender, net.bytebuddy.description.method.a aVar2, HashSet hashSet, Visibility visibility, boolean z12) {
                    this.f416931a = aVar;
                    this.f416932b = methodAttributeAppender;
                    this.f416933c = aVar2;
                    this.f416934d = hashSet;
                    this.f416935e = visibility;
                    this.f416936f = z12;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    C12058a c12058a = (C12058a) obj;
                    return this.f416936f == c12058a.f416936f && this.f416935e.equals(c12058a.f416935e) && this.f416931a.equals(c12058a.f416931a) && this.f416932b.equals(c12058a.f416932b) && this.f416933c.equals(c12058a.f416933c) && this.f416934d.equals(c12058a.f416934d);
                }

                public final int hashCode() {
                    return ((this.f416935e.hashCode() + ((this.f416934d.hashCode() + D8.h(this.f416933c, (this.f416932b.hashCode() + ((this.f416931a.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31, 31)) * 31)) * 31) + (this.f416936f ? 1 : 0);
                }
            }

            public a(TypeDescription typeDescription, LoadedTypeInitializer loadedTypeInitializer, TypeInitializer typeInitializer, b.c cVar, LinkedHashMap linkedHashMap, boolean z12) {
                this.f416925a = typeDescription;
                this.f416926b = loadedTypeInitializer;
                this.f416927c = typeInitializer;
                this.f416928d = cVar;
                this.f416929e = linkedHashMap;
                this.f416930f = z12;
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool
            public final TypeWriter.MethodPool.Record a(net.bytebuddy.description.method.a aVar) {
                net.bytebuddy.description.method.a aVar2;
                C12058a c12058a = this.f416929e.get(aVar);
                if (c12058a == null) {
                    return new TypeWriter.MethodPool.Record.c(aVar);
                }
                boolean z12 = this.f416930f;
                boolean z13 = c12058a.f416936f;
                net.bytebuddy.description.method.a aVar3 = c12058a.f416933c;
                if (z13 && !z12) {
                    return new TypeWriter.MethodPool.Record.c(aVar3);
                }
                TypeWriter.MethodPool.Record recordA = c12058a.f416931a.a(aVar3, c12058a.f416932b, c12058a.f416935e);
                if (z12) {
                    HashSet hashSet = new HashSet();
                    Iterator it = c12058a.f416934d.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        aVar2 = c12058a.f416933c;
                        if (!zHasNext) {
                            break;
                        }
                        a.j jVar = (a.j) it.next();
                        if (aVar2.K(jVar)) {
                            hashSet.add(jVar);
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        TypeDescription typeDescription = this.f416925a;
                        if (!typeDescription.E() || recordA.o().f417093c) {
                            recordA = new TypeWriter.MethodPool.Record.a(recordA, typeDescription, aVar2, hashSet, c12058a.f416932b);
                        }
                    }
                }
                return recordA;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f416930f == aVar.f416930f && this.f416925a.equals(aVar.f416925a) && this.f416926b.equals(aVar.f416926b) && this.f416927c.equals(aVar.f416927c) && this.f416928d.equals(aVar.f416928d) && this.f416929e.equals(aVar.f416929e);
            }

            public final int hashCode() {
                return ((this.f416929e.hashCode() + ((this.f416928d.hashCode() + ((this.f416927c.hashCode() + ((this.f416926b.hashCode() + D8.j(this.f416925a, getClass().hashCode() * 31, 31)) * 31)) * 31)) * 31)) * 31) + (this.f416930f ? 1 : 0);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.dynamic.scaffold.MethodRegistry$b$b, reason: collision with other inner class name */
        public static class C12059b implements LatentMatcher<net.bytebuddy.description.method.a> {

            /* renamed from: b, reason: collision with root package name */
            public final LatentMatcher<? super net.bytebuddy.description.method.a> f416937b;

            /* renamed from: c, reason: collision with root package name */
            public final Handler.c f416938c;

            /* renamed from: d, reason: collision with root package name */
            public final MethodAttributeAppender.c f416939d;

            /* renamed from: e, reason: collision with root package name */
            public final Transformer<net.bytebuddy.description.method.a> f416940e;

            public C12059b(LatentMatcher latentMatcher, Handler.c cVar, MethodAttributeAppender.c cVar2, Transformer transformer) {
                this.f416937b = latentMatcher;
                this.f416938c = cVar;
                this.f416939d = cVar2;
                this.f416940e = transformer;
            }

            @Override // net.bytebuddy.matcher.LatentMatcher
            public final InterfaceC44410t<? super net.bytebuddy.description.method.a> a(TypeDescription typeDescription) {
                return this.f416937b.a(typeDescription);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C12059b c12059b = (C12059b) obj;
                return this.f416937b.equals(c12059b.f416937b) && this.f416938c.equals(c12059b.f416938c) && this.f416939d.equals(c12059b.f416939d) && this.f416940e.equals(c12059b.f416940e);
            }

            public final int hashCode() {
                return this.f416940e.hashCode() + ((this.f416939d.hashCode() + ((this.f416938c.hashCode() + ((this.f416937b.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31)) * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class c implements c {

            /* renamed from: a, reason: collision with root package name */
            public final LinkedHashMap<net.bytebuddy.description.method.a, a> f416941a;

            /* renamed from: b, reason: collision with root package name */
            public final LoadedTypeInitializer f416942b;

            /* renamed from: c, reason: collision with root package name */
            public final TypeInitializer f416943c;

            /* renamed from: d, reason: collision with root package name */
            public final TypeDescription f416944d;

            /* renamed from: e, reason: collision with root package name */
            public final MethodGraph.a f416945e;

            /* renamed from: f, reason: collision with root package name */
            public final b.c f416946f;

            @HashCodeAndEqualsPlugin.Enhance
            public static class a {

                /* renamed from: a, reason: collision with root package name */
                public final Handler f416947a;

                /* renamed from: b, reason: collision with root package name */
                public final MethodAttributeAppender.c f416948b;

                /* renamed from: c, reason: collision with root package name */
                public final net.bytebuddy.description.method.a f416949c;

                /* renamed from: d, reason: collision with root package name */
                public final Set<a.j> f416950d;

                /* renamed from: e, reason: collision with root package name */
                public final Visibility f416951e;

                /* renamed from: f, reason: collision with root package name */
                public final boolean f416952f;

                public a(Handler handler, MethodAttributeAppender.c cVar, net.bytebuddy.description.method.a aVar, Set<a.j> set, Visibility visibility, boolean z12) {
                    this.f416947a = handler;
                    this.f416948b = cVar;
                    this.f416949c = aVar;
                    this.f416950d = set;
                    this.f416951e = visibility;
                    this.f416952f = z12;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.f416952f == aVar.f416952f && this.f416951e.equals(aVar.f416951e) && this.f416947a.equals(aVar.f416947a) && this.f416948b.equals(aVar.f416948b) && this.f416949c.equals(aVar.f416949c) && this.f416950d.equals(aVar.f416950d);
                }

                public final int hashCode() {
                    return ((this.f416951e.hashCode() + m.g(this.f416950d, D8.h(this.f416949c, (this.f416948b.hashCode() + ((this.f416947a.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31, 31), 31)) * 31) + (this.f416952f ? 1 : 0);
                }
            }

            public c(LinkedHashMap linkedHashMap, LoadedTypeInitializer loadedTypeInitializer, TypeInitializer typeInitializer, TypeDescription typeDescription, MethodGraph.a aVar, b.c cVar) {
                this.f416941a = linkedHashMap;
                this.f416942b = loadedTypeInitializer;
                this.f416943c = typeInitializer;
                this.f416944d = typeDescription;
                this.f416945e = aVar;
                this.f416946f = cVar;
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.c
            public final a a(Implementation.Target.a aVar, ClassFileVersion classFileVersion) {
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                MethodGraph.a aVar2 = this.f416945e;
                TypeDescription typeDescription = this.f416944d;
                Implementation.Target targetA = aVar.a(typeDescription, aVar2, classFileVersion);
                for (Map.Entry<net.bytebuddy.description.method.a, a> entry : this.f416941a.entrySet()) {
                    Handler.a aVarF = (Handler.a) map.get(entry.getValue().f416947a);
                    if (aVarF == null) {
                        aVarF = entry.getValue().f416947a.f(targetA);
                        map.put(entry.getValue().f416947a, aVarF);
                    }
                    Handler.a aVar3 = aVarF;
                    MethodAttributeAppender methodAttributeAppenderA = (MethodAttributeAppender) map2.get(entry.getValue().f416948b);
                    if (methodAttributeAppenderA == null) {
                        methodAttributeAppenderA = entry.getValue().f416948b.a(typeDescription);
                        map2.put(entry.getValue().f416948b, methodAttributeAppenderA);
                    }
                    MethodAttributeAppender methodAttributeAppender = methodAttributeAppenderA;
                    net.bytebuddy.description.method.a key = entry.getKey();
                    net.bytebuddy.description.method.a aVar4 = entry.getValue().f416949c;
                    a value = entry.getValue();
                    value.getClass();
                    HashSet hashSet = new HashSet(value.f416950d);
                    hashSet.remove(value.f416949c.f0());
                    linkedHashMap.put(key, new a.C12058a(aVar3, methodAttributeAppender, aVar4, hashSet, entry.getValue().f416951e, entry.getValue().f416952f));
                    map = map;
                }
                boolean zC2 = classFileVersion.c(ClassFileVersion.f415295g);
                return new a(this.f416944d, this.f416942b, this.f416943c, this.f416946f, linkedHashMap, zC2);
            }

            public final net.bytebuddy.description.method.b<?> b() {
                return (net.bytebuddy.description.method.b) new b.c(new ArrayList(this.f416941a.keySet())).P1(new M(MethodSortMatcher.Sort.f418388f.f418392c));
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f416941a.equals(cVar.f416941a) && this.f416942b.equals(cVar.f416942b) && this.f416943c.equals(cVar.f416943c) && this.f416944d.equals(cVar.f416944d) && this.f416945e.equals(cVar.f416945e) && this.f416946f.equals(cVar.f416946f);
            }

            public final int hashCode() {
                return this.f416946f.hashCode() + ((this.f416945e.hashCode() + D8.j(this.f416944d, (this.f416943c.hashCode() + ((this.f416942b.hashCode() + ((this.f416941a.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31);
            }
        }

        public b() {
            this.f416924a = Collections.emptyList();
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry
        public final b a(LatentMatcher.f fVar, Handler.c cVar, MethodAttributeAppender.NoOp noOp) {
            return new b(net.bytebuddy.utility.a.d(this.f416924a, new C12059b(fVar, cVar, noOp, Transformer.NoOp.f416594b)));
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry
        public final b b(LatentMatcher latentMatcher, Handler.c cVar, MethodAttributeAppender.c cVar2, Transformer transformer) {
            return new b(net.bytebuddy.utility.a.c(new C12059b(latentMatcher, cVar, cVar2, transformer), this.f416924a));
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
        @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final net.bytebuddy.dynamic.scaffold.MethodRegistry.b.c c(net.bytebuddy.dynamic.scaffold.InstrumentedType r25, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r26, net.bytebuddy.dynamic.scaffold.TypeValidation r27, net.bytebuddy.dynamic.VisibilityBridgeStrategy r28, net.bytebuddy.matcher.LatentMatcher r29) {
            /*
                Method dump skipped, instructions count: 592
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.scaffold.MethodRegistry.b.c(net.bytebuddy.dynamic.scaffold.InstrumentedType, net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler, net.bytebuddy.dynamic.scaffold.TypeValidation, net.bytebuddy.dynamic.VisibilityBridgeStrategy, net.bytebuddy.matcher.LatentMatcher):net.bytebuddy.dynamic.scaffold.MethodRegistry$b$c");
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f416924a.equals(((b) obj).f416924a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f416924a.hashCode() + (getClass().hashCode() * 31);
        }

        public b(List<C12059b> list) {
            this.f416924a = list;
        }
    }

    public interface Handler extends InstrumentedType.Prepareable {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForVisibilityBridge implements Handler {

            /* renamed from: b, reason: collision with root package name */
            public static final ForVisibilityBridge f416919b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ ForVisibilityBridge[] f416920c;

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements a {

                /* renamed from: b, reason: collision with root package name */
                public final TypeDescription f416921b;

                public a(TypeDescription typeDescription) {
                    this.f416921b = typeDescription;
                }

                @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.a
                public final TypeWriter.MethodPool.Record a(net.bytebuddy.description.method.a aVar, MethodAttributeAppender methodAttributeAppender, Visibility visibility) {
                    boolean zI02 = aVar.i0();
                    TypeDescription typeDescription = this.f416921b;
                    TypeDefinition typeDefinitionC3 = null;
                    if (zI02) {
                        TypeDescription typeDescriptionF5 = aVar.n().f5();
                        for (TypeDescription typeDescription2 : typeDescription.J0().f1().P1(new T(typeDescriptionF5))) {
                            if (typeDefinitionC3 == null || typeDescriptionF5.m5(typeDefinitionC3.f5())) {
                                typeDefinitionC3 = typeDescription2;
                            }
                        }
                    }
                    if (typeDefinitionC3 == null && (typeDefinitionC3 = typeDescription.C3()) == null) {
                        typeDefinitionC3 = TypeDescription.f416317A2;
                    }
                    return new TypeWriter.MethodPool.Record.b.a(new TypeWriter.MethodPool.Record.b.a.C12069a(aVar, typeDescription), aVar, typeDefinitionC3.f5(), methodAttributeAppender);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f416921b.equals(((a) obj).f416921b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f416921b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            static {
                ForVisibilityBridge forVisibilityBridge = new ForVisibilityBridge("INSTANCE", 0);
                f416919b = forVisibilityBridge;
                f416920c = new ForVisibilityBridge[]{forVisibilityBridge};
            }

            public ForVisibilityBridge() {
                throw null;
            }

            public static ForVisibilityBridge valueOf(String str) {
                return (ForVisibilityBridge) Enum.valueOf(ForVisibilityBridge.class, str);
            }

            public static ForVisibilityBridge[] values() {
                return (ForVisibilityBridge[]) f416920c.clone();
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                throw new IllegalStateException("A visibility bridge handler must not apply any preparations");
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler
            public final a f(Implementation.Target target) {
                return new a(target.a());
            }
        }

        public interface a {
            TypeWriter.MethodPool.Record a(net.bytebuddy.description.method.a aVar, MethodAttributeAppender methodAttributeAppender, Visibility visibility);
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class c implements Handler {

            /* renamed from: b, reason: collision with root package name */
            public final Implementation f416922b;

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements a {

                /* renamed from: b, reason: collision with root package name */
                public final net.bytebuddy.implementation.bytecode.a f416923b;

                public a(net.bytebuddy.implementation.bytecode.a aVar) {
                    this.f416923b = aVar;
                }

                @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.a
                public final TypeWriter.MethodPool.Record a(net.bytebuddy.description.method.a aVar, MethodAttributeAppender methodAttributeAppender, Visibility visibility) {
                    return new TypeWriter.MethodPool.Record.b.c(aVar, this.f416923b, methodAttributeAppender, visibility);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f416923b.equals(((a) obj).f416923b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f416923b.hashCode() + (getClass().hashCode() * 31);
                }
            }

            public c(Implementation implementation) {
                this.f416922b = implementation;
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                return this.f416922b.e(instrumentedType);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f416922b.equals(((c) obj).f416922b);
                }
                return false;
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler
            public final a f(Implementation.Target target) {
                return new a(this.f416922b.i(target));
            }

            public final int hashCode() {
                return this.f416922b.hashCode() + (getClass().hashCode() * 31);
            }
        }

        a f(Implementation.Target target);

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForAbstractMethod implements Handler, a {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ ForAbstractMethod[] f416918b = {new ForAbstractMethod("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            ForAbstractMethod EF5;

            public ForAbstractMethod() {
                throw null;
            }

            public static ForAbstractMethod valueOf(String str) {
                return (ForAbstractMethod) Enum.valueOf(ForAbstractMethod.class, str);
            }

            public static ForAbstractMethod[] values() {
                return (ForAbstractMethod[]) f416918b.clone();
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.a
            public final TypeWriter.MethodPool.Record a(net.bytebuddy.description.method.a aVar, MethodAttributeAppender methodAttributeAppender, Visibility visibility) {
                return new TypeWriter.MethodPool.Record.b.d(aVar, methodAttributeAppender, visibility);
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                return instrumentedType;
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler
            public final a f(Implementation.Target target) {
                return this;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements Handler, a {
            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.a
            public final TypeWriter.MethodPool.Record a(net.bytebuddy.description.method.a aVar, MethodAttributeAppender methodAttributeAppender, Visibility visibility) {
                return new TypeWriter.MethodPool.Record.b.C12070b(aVar, methodAttributeAppender);
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

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public final InstrumentedType e(InstrumentedType instrumentedType) {
                return instrumentedType;
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler
            public final a f(Implementation.Target target) {
                return this;
            }
        }
    }
}
