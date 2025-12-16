package net.bytebuddy.dynamic.scaffold;

import com.yandex.div2.D8;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.modifier.Visibility;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.d;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.M;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.matcher.ModifierMatcher;
import net.bytebuddy.matcher.W;
import net.bytebuddy.matcher.z;

/* loaded from: classes8.dex */
public interface MethodGraph {

    @SuppressFBWarnings(justification = "Safe initialization is implied.", value = {"IC_SUPERCLASS_USES_SUBCLASS_DURING_INITIALIZATION"})
    public interface Compiler {

        /* renamed from: G2, reason: collision with root package name */
        public static final Default f416866G2 = Default.b();

        @HashCodeAndEqualsPlugin.Enhance
        public static class Default<T> extends a {

            /* renamed from: b, reason: collision with root package name */
            public final Harmonizer.ForJavaMethod f416867b;

            /* renamed from: c, reason: collision with root package name */
            public final Merger.Directional f416868c;

            /* renamed from: d, reason: collision with root package name */
            public final TypeDescription.Generic.Visitor.Reifying f416869d;

            public interface Harmonizer<S> {

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class ForJVMMethod implements Harmonizer<a> {

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ ForJVMMethod[] f416870b = {new ForJVMMethod("INSTANCE", 0)};

                    /* JADX INFO: Fake field, exist only in values array */
                    ForJVMMethod EF5;

                    public static class a {
                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof a)) {
                                return false;
                            }
                            throw null;
                        }

                        public final int hashCode() {
                            return 0;
                        }

                        public final String toString() {
                            throw null;
                        }
                    }

                    public ForJVMMethod() {
                        throw null;
                    }

                    public static ForJVMMethod valueOf(String str) {
                        return (ForJVMMethod) Enum.valueOf(ForJVMMethod.class, str);
                    }

                    public static ForJVMMethod[] values() {
                        return (ForJVMMethod[]) f416870b.clone();
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class ForJavaMethod implements Harmonizer<a> {

                    /* renamed from: b, reason: collision with root package name */
                    public static final ForJavaMethod f416871b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ ForJavaMethod[] f416872c;

                    public static class a {

                        /* renamed from: a, reason: collision with root package name */
                        public final a.j f416873a;

                        /* renamed from: b, reason: collision with root package name */
                        public final int f416874b;

                        public a(a.j jVar) {
                            this.f416873a = jVar;
                            this.f416874b = jVar.f416207b.hashCode();
                        }

                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            return this == obj || ((obj instanceof a) && this.f416873a.f416207b.equals(((a) obj).f416873a.f416207b));
                        }

                        public final int hashCode() {
                            return this.f416874b;
                        }

                        public final String toString() {
                            return this.f416873a.f416207b.toString();
                        }
                    }

                    static {
                        ForJavaMethod forJavaMethod = new ForJavaMethod("INSTANCE", 0);
                        f416871b = forJavaMethod;
                        f416872c = new ForJavaMethod[]{forJavaMethod};
                    }

                    public ForJavaMethod() {
                        throw null;
                    }

                    public static ForJavaMethod valueOf(String str) {
                        return (ForJavaMethod) Enum.valueOf(ForJavaMethod.class, str);
                    }

                    public static ForJavaMethod[] values() {
                        return (ForJavaMethod[]) f416872c.clone();
                    }
                }
            }

            public interface Merger {

                public enum Directional implements Merger {
                    LEFT(true),
                    /* JADX INFO: Fake field, exist only in values array */
                    RIGHT(false);


                    /* renamed from: b, reason: collision with root package name */
                    public final boolean f416877b;

                    Directional(boolean z12) {
                        this.f416877b = z12;
                    }
                }
            }

            public static abstract class a<S> {

                /* renamed from: a, reason: collision with root package name */
                public final String f416878a;

                /* renamed from: b, reason: collision with root package name */
                public final int f416879b;

                /* renamed from: net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$a$a, reason: collision with other inner class name */
                public static class C12051a extends a<a.j> {

                    /* renamed from: c, reason: collision with root package name */
                    public final Set<a.j> f416880c;

                    public C12051a(String str, int i12, Set<a.j> set) {
                        super(str, i12);
                        this.f416880c = set;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a
                    public final Set<a.j> a() {
                        return this.f416880c;
                    }
                }

                public static class b<V> extends a<V> {

                    /* renamed from: c, reason: collision with root package name */
                    public final Map<V, Set<a.j>> f416881c;

                    public b(int i12, String str, Map map) {
                        super(str, i12);
                        this.f416881c = map;
                    }

                    @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a
                    public final Set<V> a() {
                        return this.f416881c.keySet();
                    }

                    public final b<V> b(b<V> bVar) {
                        HashMap map = new HashMap(this.f416881c);
                        for (Map.Entry<V, Set<a.j>> entry : bVar.f416881c.entrySet()) {
                            Set set = (Set) map.get(entry.getKey());
                            if (set == null) {
                                map.put(entry.getKey(), entry.getValue());
                            } else {
                                HashSet hashSet = new HashSet(set);
                                hashSet.addAll(entry.getValue());
                                map.put(entry.getKey(), hashSet);
                            }
                        }
                        return new b<>(this.f416879b, this.f416878a, map);
                    }

                    public final C12051a c(a.j jVar) {
                        HashSet hashSet = new HashSet();
                        Iterator<Set<a.j>> it = this.f416881c.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll(it.next());
                        }
                        hashSet.add(jVar);
                        return new C12051a(this.f416878a, this.f416879b, hashSet);
                    }

                    public final b d(a.d dVar, Harmonizer.ForJavaMethod forJavaMethod) {
                        HashMap map = new HashMap(this.f416881c);
                        a.j jVarF0 = dVar.f0();
                        forJavaMethod.getClass();
                        Harmonizer.ForJavaMethod.a aVar = new Harmonizer.ForJavaMethod.a(jVarF0);
                        Set set = (Set) map.get(aVar);
                        if (set == null) {
                            map.put(aVar, Collections.singleton(jVarF0));
                        } else {
                            HashSet hashSet = new HashSet(set);
                            hashSet.add(jVarF0);
                            map.put(aVar, hashSet);
                        }
                        return new b(this.f416879b, this.f416878a, map);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class c<V> {

                    /* renamed from: a, reason: collision with root package name */
                    public final LinkedHashMap<b<V>, InterfaceC12052a<V>> f416882a;

                    /* renamed from: net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$a$c$a, reason: collision with other inner class name */
                    public interface InterfaceC12052a<W> {

                        @HashCodeAndEqualsPlugin.Enhance
                        /* renamed from: net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$a$c$a$a, reason: collision with other inner class name */
                        public static class C12053a<U> implements InterfaceC12052a<U> {

                            /* renamed from: a, reason: collision with root package name */
                            public final b<U> f416883a;

                            /* renamed from: b, reason: collision with root package name */
                            public final LinkedHashSet<net.bytebuddy.description.method.a> f416884b;

                            /* renamed from: c, reason: collision with root package name */
                            public final Visibility f416885c;

                            @HashCodeAndEqualsPlugin.Enhance
                            /* renamed from: net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$a$c$a$a$a, reason: collision with other inner class name */
                            public static class C12054a implements Node {

                                /* renamed from: b, reason: collision with root package name */
                                public final C12051a f416886b;

                                /* renamed from: c, reason: collision with root package name */
                                public final net.bytebuddy.description.method.a f416887c;

                                /* renamed from: d, reason: collision with root package name */
                                public final Visibility f416888d;

                                public C12054a(C12051a c12051a, net.bytebuddy.description.method.a aVar, Visibility visibility) {
                                    this.f416886b = c12051a;
                                    this.f416887c = aVar;
                                    this.f416888d = visibility;
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public final Set<a.j> a() {
                                    return this.f416886b.f416880c;
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public final net.bytebuddy.description.method.a b() {
                                    return this.f416887c;
                                }

                                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    C12054a c12054a = (C12054a) obj;
                                    return this.f416888d.equals(c12054a.f416888d) && this.f416886b.equals(c12054a.f416886b) && this.f416887c.equals(c12054a.f416887c);
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public final Visibility getVisibility() {
                                    return this.f416888d;
                                }

                                public final int hashCode() {
                                    return this.f416888d.hashCode() + D8.h(this.f416887c, (this.f416886b.hashCode() + (getClass().hashCode() * 31)) * 31, 31);
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public final Node.Sort o() {
                                    return Node.Sort.f416904g;
                                }
                            }

                            public C12053a(b<U> bVar, LinkedHashSet<net.bytebuddy.description.method.a> linkedHashSet, Visibility visibility) {
                                this.f416883a = bVar;
                                this.f416884b = linkedHashSet;
                                this.f416885c = visibility;
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a.c.InterfaceC12052a
                            public final InterfaceC12052a a(net.bytebuddy.description.method.a aVar, Harmonizer.ForJavaMethod forJavaMethod) {
                                b bVarD = this.f416883a.d(aVar.i(), forJavaMethod);
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                TypeDescription typeDescriptionF5 = aVar.n().f5();
                                boolean zY2 = aVar.y();
                                Iterator<net.bytebuddy.description.method.a> it = this.f416884b.iterator();
                                Visibility visibilityC = this.f416885c;
                                while (it.hasNext()) {
                                    net.bytebuddy.description.method.a next = it.next();
                                    if (next.n().f5().equals(typeDescriptionF5)) {
                                        if (next.y() ^ zY2) {
                                            linkedHashSet.add(zY2 ? next : aVar);
                                        } else {
                                            linkedHashSet.add(aVar);
                                            linkedHashSet.add(next);
                                        }
                                    }
                                    visibilityC = visibilityC.c(next.getVisibility());
                                }
                                return linkedHashSet.isEmpty() ? new C12055c(bVarD, aVar, visibilityC, zY2) : linkedHashSet.size() == 1 ? new C12055c(bVarD, (net.bytebuddy.description.method.a) linkedHashSet.iterator().next(), visibilityC, false) : new C12053a(bVarD, linkedHashSet, visibilityC);
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a.c.InterfaceC12052a
                            public final Set<net.bytebuddy.description.method.a> b() {
                                return this.f416884b;
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a.c.InterfaceC12052a
                            public final InterfaceC12052a<U> c(InterfaceC12052a<U> interfaceC12052a) {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                LinkedHashSet<net.bytebuddy.description.method.a> linkedHashSet2 = this.f416884b;
                                Iterator<net.bytebuddy.description.method.a> it = linkedHashSet2.iterator();
                                while (it.hasNext()) {
                                    net.bytebuddy.description.method.a next = it.next();
                                    TypeDescription typeDescriptionF5 = next.n().f5();
                                    Iterator<net.bytebuddy.description.method.a> it2 = interfaceC12052a.b().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            linkedHashSet.add(next);
                                            break;
                                        }
                                        TypeDescription typeDescriptionF52 = it2.next().n().f5();
                                        if (typeDescriptionF52.equals(typeDescriptionF5) || !typeDescriptionF52.m5(typeDescriptionF5)) {
                                        }
                                    }
                                }
                                for (net.bytebuddy.description.method.a aVar : interfaceC12052a.b()) {
                                    TypeDescription typeDescriptionF53 = aVar.n().f5();
                                    Iterator<net.bytebuddy.description.method.a> it3 = linkedHashSet2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            linkedHashSet.add(aVar);
                                            break;
                                        }
                                        if (it3.next().n().f5().m5(typeDescriptionF53)) {
                                            break;
                                        }
                                    }
                                }
                                int size = linkedHashSet.size();
                                b<U> bVar = this.f416883a;
                                Visibility visibility = this.f416885c;
                                return size == 1 ? new C12055c(bVar.b(interfaceC12052a.getKey()), (net.bytebuddy.description.method.a) linkedHashSet.iterator().next(), visibility.c(interfaceC12052a.getVisibility()), false) : new C12053a(bVar.b(interfaceC12052a.getKey()), linkedHashSet, visibility.c(interfaceC12052a.getVisibility()));
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a.c.InterfaceC12052a
                            public final Node d(Merger.Directional directional) {
                                Iterator<net.bytebuddy.description.method.a> it = this.f416884b.iterator();
                                net.bytebuddy.description.method.a next = it.next();
                                while (it.hasNext()) {
                                    net.bytebuddy.description.method.a next2 = it.next();
                                    if (!directional.f416877b) {
                                        next = next2;
                                    }
                                }
                                return new C12054a(this.f416883a.c(next.f0()), next, this.f416885c);
                            }

                            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj == null || getClass() != obj.getClass()) {
                                    return false;
                                }
                                C12053a c12053a = (C12053a) obj;
                                return this.f416885c.equals(c12053a.f416885c) && this.f416883a.equals(c12053a.f416883a) && this.f416884b.equals(c12053a.f416884b);
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a.c.InterfaceC12052a
                            public final b<U> getKey() {
                                return this.f416883a;
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a.c.InterfaceC12052a
                            public final Visibility getVisibility() {
                                return this.f416885c;
                            }

                            public final int hashCode() {
                                return this.f416885c.hashCode() + ((this.f416884b.hashCode() + ((this.f416883a.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31);
                            }
                        }

                        /* renamed from: net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$a$c$a$b */
                        public static class b<U> implements InterfaceC12052a<U> {

                            /* renamed from: a, reason: collision with root package name */
                            public final b<U> f416889a;

                            public b(b<U> bVar) {
                                this.f416889a = bVar;
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a.c.InterfaceC12052a
                            public final InterfaceC12052a a(net.bytebuddy.description.method.a aVar, Harmonizer.ForJavaMethod forJavaMethod) {
                                return new C12055c(this.f416889a.d(aVar.i(), forJavaMethod), aVar, aVar.getVisibility(), false);
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a.c.InterfaceC12052a
                            public final Set<net.bytebuddy.description.method.a> b() {
                                throw new IllegalStateException("Cannot extract method from initial entry:" + this);
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a.c.InterfaceC12052a
                            public final InterfaceC12052a<U> c(InterfaceC12052a<U> interfaceC12052a) {
                                throw new IllegalStateException("Cannot inject into initial entry without a registered method: " + this);
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a.c.InterfaceC12052a
                            public final Node d(Merger.Directional directional) {
                                throw new IllegalStateException("Cannot transform initial entry without a registered method: " + this);
                            }

                            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj == null || getClass() != obj.getClass()) {
                                    return false;
                                }
                                return this.f416889a.equals(((b) obj).f416889a);
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a.c.InterfaceC12052a
                            public final b<U> getKey() {
                                throw new IllegalStateException("Cannot extract key from initial entry:" + this);
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a.c.InterfaceC12052a
                            public final Visibility getVisibility() {
                                throw new IllegalStateException("Cannot extract visibility from initial entry:" + this);
                            }

                            public final int hashCode() {
                                return this.f416889a.hashCode();
                            }
                        }

                        @HashCodeAndEqualsPlugin.Enhance
                        /* renamed from: net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$a$c$a$c, reason: collision with other inner class name */
                        public static class C12055c<U> implements InterfaceC12052a<U> {

                            /* renamed from: a, reason: collision with root package name */
                            public final b<U> f416890a;

                            /* renamed from: b, reason: collision with root package name */
                            public final net.bytebuddy.description.method.a f416891b;

                            /* renamed from: c, reason: collision with root package name */
                            public final Visibility f416892c;

                            /* renamed from: d, reason: collision with root package name */
                            public final boolean f416893d;

                            @HashCodeAndEqualsPlugin.Enhance
                            /* renamed from: net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler$Default$a$c$a$c$a, reason: collision with other inner class name */
                            public static class C12056a implements Node {

                                /* renamed from: b, reason: collision with root package name */
                                public final C12051a f416894b;

                                /* renamed from: c, reason: collision with root package name */
                                public final net.bytebuddy.description.method.a f416895c;

                                /* renamed from: d, reason: collision with root package name */
                                public final Visibility f416896d;

                                /* renamed from: e, reason: collision with root package name */
                                public final boolean f416897e;

                                public C12056a(C12051a c12051a, net.bytebuddy.description.method.a aVar, Visibility visibility, boolean z12) {
                                    this.f416894b = c12051a;
                                    this.f416895c = aVar;
                                    this.f416896d = visibility;
                                    this.f416897e = z12;
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public final Set<a.j> a() {
                                    return this.f416894b.f416880c;
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public final net.bytebuddy.description.method.a b() {
                                    return this.f416895c;
                                }

                                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    C12056a c12056a = (C12056a) obj;
                                    return this.f416897e == c12056a.f416897e && this.f416896d.equals(c12056a.f416896d) && this.f416894b.equals(c12056a.f416894b) && this.f416895c.equals(c12056a.f416895c);
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public final Visibility getVisibility() {
                                    return this.f416896d;
                                }

                                public final int hashCode() {
                                    return ((this.f416896d.hashCode() + D8.h(this.f416895c, (this.f416894b.hashCode() + (getClass().hashCode() * 31)) * 31, 31)) * 31) + (this.f416897e ? 1 : 0);
                                }

                                @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public final Node.Sort o() {
                                    return this.f416897e ? Node.Sort.f416902e : Node.Sort.f416903f;
                                }
                            }

                            public C12055c() {
                                throw null;
                            }

                            public C12055c(b<U> bVar, net.bytebuddy.description.method.a aVar, Visibility visibility, boolean z12) {
                                this.f416890a = bVar;
                                this.f416891b = aVar;
                                this.f416892c = visibility;
                                this.f416893d = z12;
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a.c.InterfaceC12052a
                            public final InterfaceC12052a a(net.bytebuddy.description.method.a aVar, Harmonizer.ForJavaMethod forJavaMethod) {
                                b bVarD = this.f416890a.d(aVar.i(), forJavaMethod);
                                Visibility visibilityC = this.f416892c.c(aVar.getVisibility());
                                TypeDefinition typeDefinitionN = aVar.n();
                                net.bytebuddy.description.method.a aVar2 = this.f416891b;
                                if (!typeDefinitionN.equals(aVar2.n())) {
                                    Visibility visibilityC2 = visibilityC.c(aVar2.getVisibility()).c(aVar.getVisibility());
                                    if (aVar.y()) {
                                        return new C12055c(bVarD, aVar2, visibilityC2, (aVar2.n().getModifiers() & 5) == 0);
                                    }
                                    return new C12055c(bVarD, aVar, visibilityC2, false);
                                }
                                Visibility visibilityC3 = visibilityC.c(aVar.getVisibility()).c(aVar2.getVisibility());
                                if (!(aVar.y() ^ aVar2.y())) {
                                    return new C12053a(bVarD, new LinkedHashSet(Arrays.asList(aVar, aVar2)), visibilityC3);
                                }
                                if (aVar.y()) {
                                    aVar = aVar2;
                                }
                                return new C12055c(bVarD, aVar, visibilityC3, false);
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a.c.InterfaceC12052a
                            public final Set<net.bytebuddy.description.method.a> b() {
                                return Collections.singleton(this.f416891b);
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a.c.InterfaceC12052a
                            public final InterfaceC12052a<U> c(InterfaceC12052a<U> interfaceC12052a) {
                                net.bytebuddy.description.method.a aVar = this.f416891b;
                                boolean zE2 = aVar.n().E();
                                boolean z12 = this.f416893d;
                                Visibility visibility = this.f416892c;
                                b<U> bVar = this.f416890a;
                                if (!zE2) {
                                    return new C12055c(bVar.b(interfaceC12052a.getKey()), aVar, visibility.c(interfaceC12052a.getVisibility()), z12);
                                }
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                linkedHashSet.add(aVar);
                                TypeDescription typeDescriptionF5 = aVar.n().f5();
                                for (net.bytebuddy.description.method.a aVar2 : interfaceC12052a.b()) {
                                    if (aVar2.n().f5().m5(typeDescriptionF5)) {
                                        linkedHashSet.remove(aVar);
                                        linkedHashSet.add(aVar2);
                                    } else if (!aVar2.n().f5().Z5(typeDescriptionF5)) {
                                        linkedHashSet.add(aVar2);
                                    }
                                }
                                return linkedHashSet.size() == 1 ? new C12055c(bVar.b(interfaceC12052a.getKey()), (net.bytebuddy.description.method.a) linkedHashSet.iterator().next(), visibility.c(interfaceC12052a.getVisibility()), z12) : new C12053a(bVar.b(interfaceC12052a.getKey()), linkedHashSet, visibility.c(interfaceC12052a.getVisibility()));
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a.c.InterfaceC12052a
                            public final Node d(Merger.Directional directional) {
                                net.bytebuddy.description.method.a aVar = this.f416891b;
                                return new C12056a(this.f416890a.c(aVar.f0()), aVar, this.f416892c, this.f416893d);
                            }

                            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj == null || getClass() != obj.getClass()) {
                                    return false;
                                }
                                C12055c c12055c = (C12055c) obj;
                                return this.f416893d == c12055c.f416893d && this.f416892c.equals(c12055c.f416892c) && this.f416890a.equals(c12055c.f416890a) && this.f416891b.equals(c12055c.f416891b);
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a.c.InterfaceC12052a
                            public final b<U> getKey() {
                                return this.f416890a;
                            }

                            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.a.c.InterfaceC12052a
                            public final Visibility getVisibility() {
                                return this.f416892c;
                            }

                            public final int hashCode() {
                                return ((this.f416892c.hashCode() + D8.h(this.f416891b, (this.f416890a.hashCode() + (getClass().hashCode() * 31)) * 31, 31)) * 31) + (this.f416893d ? 1 : 0);
                            }
                        }

                        InterfaceC12052a a(net.bytebuddy.description.method.a aVar, Harmonizer.ForJavaMethod forJavaMethod);

                        Set<net.bytebuddy.description.method.a> b();

                        InterfaceC12052a<W> c(InterfaceC12052a<W> interfaceC12052a);

                        Node d(Merger.Directional directional);

                        b<W> getKey();

                        Visibility getVisibility();
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class b implements MethodGraph {

                        /* renamed from: b, reason: collision with root package name */
                        public final LinkedHashMap<a<a.j>, Node> f416898b;

                        public b(LinkedHashMap<a<a.j>, Node> linkedHashMap) {
                            this.f416898b = linkedHashMap;
                        }

                        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph
                        public final Node d(a.g gVar) {
                            String str = gVar.f416189a;
                            List<? extends TypeDescription> list = gVar.f416191c;
                            Node node = this.f416898b.get(new C12051a(str, list.size(), Collections.singleton(new a.j(gVar.f416190b, list))));
                            return node == null ? Node.Unresolved.f416910b : node;
                        }

                        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph
                        public final b e() {
                            return new b(new ArrayList(this.f416898b.values()));
                        }

                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj != null && getClass() == obj.getClass()) {
                                return this.f416898b.equals(((b) obj).f416898b);
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return this.f416898b.hashCode() + (getClass().hashCode() * 31);
                        }
                    }

                    public c() {
                        this(new LinkedHashMap());
                    }

                    public final b a(Merger.Directional directional) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (InterfaceC12052a<V> interfaceC12052a : this.f416882a.values()) {
                            Node nodeD = interfaceC12052a.d(directional);
                            linkedHashMap.put(interfaceC12052a.getKey().c(nodeD.b().f0()), nodeD);
                        }
                        return new b(linkedHashMap);
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f416882a.equals(((c) obj).f416882a);
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return this.f416882a.hashCode() + (getClass().hashCode() * 31);
                    }

                    public c(LinkedHashMap<b<V>, InterfaceC12052a<V>> linkedHashMap) {
                        this.f416882a = linkedHashMap;
                    }
                }

                public a(String str, int i12) {
                    this.f416878a = str;
                    this.f416879b = i12;
                }

                public abstract Set<S> a();

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.f416878a.equals(aVar.f416878a) && this.f416879b == aVar.f416879b && !Collections.disjoint(a(), aVar.a());
                }

                public final int hashCode() {
                    return (this.f416879b * 31) + this.f416878a.hashCode();
                }
            }

            public Default(TypeDescription.Generic.Visitor.Reifying reifying) {
                Harmonizer.ForJavaMethod forJavaMethod = Harmonizer.ForJavaMethod.f416871b;
                Merger.Directional directional = Merger.Directional.LEFT;
                this.f416867b = forJavaMethod;
                this.f416868c = directional;
                this.f416869d = reifying;
            }

            public static Default b() {
                return new Default(TypeDescription.Generic.Visitor.Reifying.f416397b);
            }

            public final a.c a(TypeDefinition typeDefinition, HashMap map, InterfaceC44410t.a aVar) {
                a.c cVar;
                LinkedHashMap<a.b<V>, a.c.InterfaceC12052a<V>> linkedHashMap;
                TypeDescription.Generic.Visitor.Reifying reifying;
                TypeDescription.Generic.Visitor.Reifying reifying2;
                TypeDescription.Generic.Visitor.Reifying reifying3;
                HashMap map2 = map;
                TypeDescription.Generic genericC3 = typeDefinition.C3();
                TypeDescription.Generic.Visitor.Reifying reifying4 = this.f416869d;
                if (genericC3 == null) {
                    cVar = new a.c();
                } else {
                    TypeDefinition typeDefinition2 = (TypeDefinition) genericC3.h0(reifying4);
                    a.c cVar2 = (a.c) map2.get(genericC3);
                    if (cVar2 == null) {
                        a.c cVarA = a(typeDefinition2, map2, aVar);
                        map2.put(genericC3, cVarA);
                        cVar = cVarA;
                    } else {
                        cVar = cVar2;
                    }
                }
                a.c cVar3 = new a.c();
                Iterator<TypeDescription.Generic> it = typeDefinition.J0().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    linkedHashMap = cVar3.f416882a;
                    if (!zHasNext) {
                        break;
                    }
                    TypeDescription.Generic next = it.next();
                    TypeDefinition typeDefinition3 = (TypeDefinition) next.h0(reifying4);
                    a.c cVarA2 = (a.c) map2.get(next);
                    if (cVarA2 == null) {
                        cVarA2 = a(typeDefinition3, map2, aVar);
                        map2.put(next, cVarA2);
                    }
                    if (linkedHashMap.isEmpty()) {
                        reifying = reifying4;
                        cVar3 = cVarA2;
                    } else {
                        LinkedHashMap<a.b<V>, a.c.InterfaceC12052a<V>> linkedHashMap2 = cVarA2.f416882a;
                        if (linkedHashMap2.isEmpty()) {
                            reifying = reifying4;
                        } else {
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap);
                            for (a.c.InterfaceC12052a c12055c : linkedHashMap2.values()) {
                                a.c.InterfaceC12052a interfaceC12052a = (a.c.InterfaceC12052a) linkedHashMap3.remove(c12055c.getKey());
                                if (interfaceC12052a == null) {
                                    reifying2 = reifying4;
                                } else {
                                    Set<net.bytebuddy.description.method.a> setB = interfaceC12052a.b();
                                    Set<net.bytebuddy.description.method.a> setB2 = c12055c.b();
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    linkedHashSet.addAll(setB);
                                    linkedHashSet.addAll(setB2);
                                    for (net.bytebuddy.description.method.a aVar2 : setB) {
                                        TypeDescription typeDescriptionF5 = aVar2.n().f5();
                                        Iterator<net.bytebuddy.description.method.a> it2 = setB2.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                reifying3 = reifying4;
                                                break;
                                            }
                                            net.bytebuddy.description.method.a next2 = it2.next();
                                            reifying3 = reifying4;
                                            TypeDescription typeDescriptionF52 = next2.n().f5();
                                            if (!typeDescriptionF5.equals(typeDescriptionF52)) {
                                                if (typeDescriptionF5.m5(typeDescriptionF52)) {
                                                    linkedHashSet.remove(next2);
                                                    break;
                                                }
                                                if (typeDescriptionF5.Z5(typeDescriptionF52)) {
                                                    linkedHashSet.remove(aVar2);
                                                    break;
                                                }
                                                reifying4 = reifying3;
                                            }
                                        }
                                        reifying4 = reifying3;
                                    }
                                    reifying2 = reifying4;
                                    a.b bVarB = interfaceC12052a.getKey().b(c12055c.getKey());
                                    Visibility visibilityC = interfaceC12052a.getVisibility().c(c12055c.getVisibility());
                                    c12055c = linkedHashSet.size() == 1 ? new a.c.InterfaceC12052a.C12055c(bVarB, (net.bytebuddy.description.method.a) linkedHashSet.iterator().next(), visibilityC, false) : new a.c.InterfaceC12052a.C12053a(bVarB, linkedHashSet, visibilityC);
                                }
                                linkedHashMap3.put(c12055c.getKey(), c12055c);
                                reifying4 = reifying2;
                            }
                            reifying = reifying4;
                            cVar3 = new a.c(linkedHashMap3);
                        }
                    }
                    map2 = map;
                    reifying4 = reifying;
                }
                AbstractMap abstractMap = cVar.f416882a;
                if (abstractMap.isEmpty()) {
                    cVar = cVar3;
                } else if (!linkedHashMap.isEmpty()) {
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(abstractMap);
                    for (a.c.InterfaceC12052a interfaceC12052aC : linkedHashMap.values()) {
                        a.c.InterfaceC12052a interfaceC12052a2 = (a.c.InterfaceC12052a) linkedHashMap4.remove(interfaceC12052aC.getKey());
                        if (interfaceC12052a2 != null) {
                            interfaceC12052aC = interfaceC12052a2.c(interfaceC12052aC);
                        }
                        linkedHashMap4.put(interfaceC12052aC.getKey(), interfaceC12052aC);
                    }
                    cVar = new a.c(linkedHashMap4);
                }
                net.bytebuddy.description.method.b<T> bVarP1 = typeDefinition.q().P1(aVar);
                if (bVarP1.isEmpty()) {
                    return cVar;
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(cVar.f416882a);
                for (T t12 : bVarP1) {
                    a.j jVarF0 = t12.f0();
                    String strV = t12.V();
                    int size = t12.getParameters().size();
                    Harmonizer.ForJavaMethod forJavaMethod = this.f416867b;
                    forJavaMethod.getClass();
                    a.b bVar = new a.b(size, strV, Collections.singletonMap(new Harmonizer.ForJavaMethod.a(jVarF0), Collections.emptySet()));
                    a.c.InterfaceC12052a bVar2 = (a.c.InterfaceC12052a) linkedHashMap5.remove(bVar);
                    if (bVar2 == null) {
                        bVar2 = new a.c.InterfaceC12052a.b(bVar);
                    }
                    a.c.InterfaceC12052a interfaceC12052aA = bVar2.a(t12, forJavaMethod);
                    linkedHashMap5.put(interfaceC12052aA.getKey(), interfaceC12052aA);
                }
                return new a.c(linkedHashMap5);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Default r52 = (Default) obj;
                return this.f416867b.equals(r52.f416867b) && this.f416868c.equals(r52.f416868c) && this.f416869d.equals(r52.f416869d);
            }

            public final int hashCode() {
                return this.f416869d.hashCode() + ((this.f416868c.hashCode() + ((this.f416867b.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ForDeclaredMethods implements Compiler {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ ForDeclaredMethods[] f416899b = {new ForDeclaredMethods("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            ForDeclaredMethods EF5;

            public ForDeclaredMethods() {
                throw null;
            }

            public static ForDeclaredMethods valueOf(String str) {
                return (ForDeclaredMethods) Enum.valueOf(ForDeclaredMethods.class, str);
            }

            public static ForDeclaredMethods[] values() {
                return (ForDeclaredMethods[]) f416899b.clone();
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
            public final a c(TypeDefinition typeDefinition) {
                TypeDescription typeDescriptionF5 = typeDefinition.f5();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (net.bytebuddy.description.method.a aVar : typeDefinition.q().P1(MethodSortMatcher.Sort.f418389g.f418392c.a(new M(ModifierMatcher.Mode.BRIDGE.f418407d)).a(new W(typeDescriptionF5)))) {
                    linkedHashMap.put(aVar.e(), new Node.a(aVar));
                }
                return new a.C12057a(new c(linkedHashMap), Empty.f416900b, Collections.emptyMap());
            }
        }

        public static abstract class a implements Compiler {
            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
            public final a c(TypeDefinition typeDefinition) {
                Default.a.c cVar;
                TypeDescription typeDescriptionF5 = typeDefinition.f5();
                Default r12 = (Default) this;
                HashMap map = new HashMap();
                Default.a.c cVarA = r12.a(typeDefinition, map, MethodSortMatcher.Sort.f418389g.f418392c.a(new W(typeDescriptionF5)));
                TypeDescription.Generic genericC3 = typeDefinition.C3();
                d.f fVarJ0 = typeDefinition.J0();
                HashMap map2 = new HashMap();
                Iterator<TypeDescription.Generic> it = fVarJ0.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    Default.Merger.Directional directional = r12.f416868c;
                    if (!zHasNext) {
                        if (genericC3 == null) {
                            cVar = null;
                        } else {
                            cVar = (Default.a.c) map.get(genericC3);
                            if (cVar == null) {
                                throw new IllegalStateException("Failed to resolve super class " + genericC3 + " from " + map.keySet());
                            }
                        }
                        return new a.C12057a(cVarA.a(directional), cVar == null ? Empty.f416900b : cVar.a(directional), map2);
                    }
                    TypeDescription.Generic next = it.next();
                    Default.a.c cVar2 = (Default.a.c) map.get(next);
                    if (cVar2 == null) {
                        throw new IllegalStateException("Failed to resolve interface type " + next + " from " + map.keySet());
                    }
                    map2.put(next.f5(), cVar2.a(directional));
                }
            }
        }

        a c(TypeDefinition typeDefinition);
    }

    public interface Node {

        public enum Sort {
            f416902e(true, true, true),
            f416903f(true, true, false),
            f416904g(true, false, false),
            f416905h(false, false, false);


            /* renamed from: b, reason: collision with root package name */
            public final boolean f416907b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f416908c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f416909d;

            Sort(boolean z12, boolean z13, boolean z14) {
                this.f416907b = z12;
                this.f416908c = z13;
                this.f416909d = z14;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Unresolved implements Node {

            /* renamed from: b, reason: collision with root package name */
            public static final Unresolved f416910b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Unresolved[] f416911c;

            static {
                Unresolved unresolved = new Unresolved("INSTANCE", 0);
                f416910b = unresolved;
                f416911c = new Unresolved[]{unresolved};
            }

            public Unresolved() {
                throw null;
            }

            public static Unresolved valueOf(String str) {
                return (Unresolved) Enum.valueOf(Unresolved.class, str);
            }

            public static Unresolved[] values() {
                return (Unresolved[]) f416911c.clone();
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public final Set<a.j> a() {
                throw new IllegalStateException("Cannot resolve bridge method of an illegal node");
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public final net.bytebuddy.description.method.a b() {
                throw new IllegalStateException("Cannot resolve the method of an illegal node");
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public final Visibility getVisibility() {
                throw new IllegalStateException("Cannot resolve visibility of an illegal node");
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public final Sort o() {
                return Sort.f416905h;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements Node {

            /* renamed from: b, reason: collision with root package name */
            public final net.bytebuddy.description.method.a f416912b;

            public a(net.bytebuddy.description.method.a aVar) {
                this.f416912b = aVar;
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public final Set<a.j> a() {
                return Collections.emptySet();
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public final net.bytebuddy.description.method.a b() {
                return this.f416912b;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f416912b.equals(((a) obj).f416912b);
                }
                return false;
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public final Visibility getVisibility() {
                return this.f416912b.getVisibility();
            }

            public final int hashCode() {
                return this.f416912b.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public final Sort o() {
                return Sort.f416903f;
            }
        }

        Set<a.j> a();

        net.bytebuddy.description.method.a b();

        Visibility getVisibility();

        Sort o();
    }

    public interface a extends MethodGraph {

        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.dynamic.scaffold.MethodGraph$a$a, reason: collision with other inner class name */
        public static class C12057a implements a {

            /* renamed from: b, reason: collision with root package name */
            public final MethodGraph f416913b;

            /* renamed from: c, reason: collision with root package name */
            public final MethodGraph f416914c;

            /* renamed from: d, reason: collision with root package name */
            public final Map<TypeDescription, MethodGraph> f416915d;

            public C12057a(MethodGraph methodGraph, MethodGraph methodGraph2, Map<TypeDescription, MethodGraph> map) {
                this.f416913b = methodGraph;
                this.f416914c = methodGraph2;
                this.f416915d = map;
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.a
            public final MethodGraph a() {
                return this.f416914c;
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.a
            public final MethodGraph b(TypeDescription typeDescription) {
                MethodGraph methodGraph = this.f416915d.get(typeDescription);
                return methodGraph == null ? Empty.f416900b : methodGraph;
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph
            public final Node d(a.g gVar) {
                return this.f416913b.d(gVar);
            }

            @Override // net.bytebuddy.dynamic.scaffold.MethodGraph
            public final b e() {
                return this.f416913b.e();
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C12057a c12057a = (C12057a) obj;
                return this.f416913b.equals(c12057a.f416913b) && this.f416914c.equals(c12057a.f416914c) && this.f416915d.equals(c12057a.f416915d);
            }

            public final int hashCode() {
                return this.f416915d.hashCode() + ((this.f416914c.hashCode() + ((this.f416913b.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31);
            }
        }

        MethodGraph a();

        MethodGraph b(TypeDescription typeDescription);
    }

    public static class b extends z.a<Node, b> {

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends Node> f416916b;

        public b(List<? extends Node> list) {
            this.f416916b = list;
        }

        @Override // net.bytebuddy.matcher.z.a
        public final z a(List<Node> list) {
            return new b(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i12) {
            return this.f416916b.get(i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f416916b.size();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class c implements MethodGraph {

        /* renamed from: b, reason: collision with root package name */
        public final LinkedHashMap<a.g, Node> f416917b;

        public c(LinkedHashMap<a.g, Node> linkedHashMap) {
            this.f416917b = linkedHashMap;
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph
        public final Node d(a.g gVar) {
            Node node = this.f416917b.get(gVar);
            return node == null ? Node.Unresolved.f416910b : node;
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph
        public final b e() {
            return new b(new ArrayList(this.f416917b.values()));
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f416917b.equals(((c) obj).f416917b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f416917b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    Node d(a.g gVar);

    b e();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Empty implements a, Compiler {

        /* renamed from: b, reason: collision with root package name */
        public static final Empty f416900b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Empty[] f416901c;

        static {
            Empty empty = new Empty("INSTANCE", 0);
            f416900b = empty;
            f416901c = new Empty[]{empty};
        }

        public Empty() {
            throw null;
        }

        public static Empty valueOf(String str) {
            return (Empty) Enum.valueOf(Empty.class, str);
        }

        public static Empty[] values() {
            return (Empty[]) f416901c.clone();
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph
        public final Node d(a.g gVar) {
            return Node.Unresolved.f416910b;
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph
        public final b e() {
            return new b(Collections.emptyList());
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.a
        public final MethodGraph a() {
            return this;
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.a
        public final MethodGraph b(TypeDescription typeDescription) {
            return this;
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
        public final a c(TypeDefinition typeDefinition) {
            return this;
        }
    }
}
