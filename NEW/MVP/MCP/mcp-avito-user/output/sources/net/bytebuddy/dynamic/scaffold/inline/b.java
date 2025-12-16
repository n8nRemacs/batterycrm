package net.bytebuddy.dynamic.scaffold.inline;

import androidx.compose.foundation.H;
import com.yandex.div2.D8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.method.b;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.c;
import net.bytebuddy.description.type.d;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.TypeResolutionStrategy;
import net.bytebuddy.dynamic.a;
import net.bytebuddy.dynamic.scaffold.ClassWriterStrategy;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import net.bytebuddy.dynamic.scaffold.TypeInitializer;
import net.bytebuddy.dynamic.scaffold.TypeValidation;
import net.bytebuddy.dynamic.scaffold.TypeWriter;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.LoadedTypeInitializer;
import net.bytebuddy.implementation.attribute.AnnotationRetention;
import net.bytebuddy.implementation.attribute.AnnotationValueFilter;
import net.bytebuddy.implementation.attribute.TypeAttributeAppender;
import net.bytebuddy.implementation.auxiliary.a;
import net.bytebuddy.matcher.LatentMatcher;
import net.bytebuddy.matcher.M;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.pool.TypePool;

/* compiled from: DecoratingDynamicTypeBuilder.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes8.dex */
public class b<T> extends a.InterfaceC12009a.AbstractC12010a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final TypeDescription f417138a;

    /* renamed from: b, reason: collision with root package name */
    public final TypeAttributeAppender f417139b;

    /* renamed from: c, reason: collision with root package name */
    public final AsmVisitorWrapper f417140c;

    /* renamed from: d, reason: collision with root package name */
    public final ClassFileVersion f417141d;

    /* renamed from: e, reason: collision with root package name */
    public final a.InterfaceC12088a f417142e;

    /* renamed from: f, reason: collision with root package name */
    public final AnnotationValueFilter.Default f417143f;

    /* renamed from: g, reason: collision with root package name */
    public final AnnotationRetention f417144g;

    /* renamed from: h, reason: collision with root package name */
    public final Implementation.Context.b f417145h;

    /* renamed from: i, reason: collision with root package name */
    public final MethodGraph.Compiler f417146i;

    /* renamed from: j, reason: collision with root package name */
    public final TypeValidation f417147j;

    /* renamed from: k, reason: collision with root package name */
    public final ClassWriterStrategy.Default f417148k;

    /* renamed from: l, reason: collision with root package name */
    public final LatentMatcher<? super net.bytebuddy.description.method.a> f417149l;

    /* renamed from: m, reason: collision with root package name */
    public final List<net.bytebuddy.dynamic.a> f417150m;

    /* renamed from: n, reason: collision with root package name */
    public final ClassFileLocator f417151n;

    public b() {
        throw null;
    }

    public b(TypeDescription typeDescription, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, a.InterfaceC12088a interfaceC12088a, AnnotationValueFilter.Default r62, AnnotationRetention annotationRetention, Implementation.Context.b bVar, MethodGraph.Compiler compiler, TypeValidation typeValidation, ClassWriterStrategy.Default r112, LatentMatcher latentMatcher, List list, ClassFileLocator classFileLocator) {
        this.f417138a = typeDescription;
        this.f417139b = typeAttributeAppender;
        this.f417140c = asmVisitorWrapper;
        this.f417141d = classFileVersion;
        this.f417142e = interfaceC12088a;
        this.f417143f = r62;
        this.f417144g = annotationRetention;
        this.f417145h = bVar;
        this.f417146i = compiler;
        this.f417147j = typeValidation;
        this.f417148k = r112;
        this.f417149l = latentMatcher;
        this.f417150m = list;
        this.f417151n = classFileLocator;
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
    public final a.InterfaceC12009a<T> D(LatentMatcher<? super net.bytebuddy.description.method.a> latentMatcher) {
        return new b(this.f417138a, this.f417139b, this.f417140c, this.f417141d, this.f417142e, this.f417143f, this.f417144g, this.f417145h, this.f417146i, this.f417147j, this.f417148k, new LatentMatcher.b(this.f417149l, latentMatcher), this.f417150m, this.f417151n);
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
    public final a.InterfaceC12009a.d.InterfaceC12026d.c E(String str, TypeDescription.Generic.a aVar, int i12) {
        throw new UnsupportedOperationException("Cannot define method for decorated type: " + this.f417138a);
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
    public final a.InterfaceC12009a<T> I(TypeAttributeAppender typeAttributeAppender) {
        return new b(this.f417138a, new TypeAttributeAppender.a(this.f417139b, typeAttributeAppender), this.f417140c, this.f417141d, this.f417142e, this.f417143f, this.f417144g, this.f417145h, this.f417146i, this.f417147j, this.f417148k, this.f417149l, this.f417150m, this.f417151n);
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
    public final a.InterfaceC12009a.d.InterfaceC12026d.c<T> a(int i12) {
        throw new UnsupportedOperationException("Cannot define constructor for decorated type: " + this.f417138a);
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f417144g.equals(bVar.f417144g) && this.f417147j.equals(bVar.f417147j) && this.f417138a.equals(bVar.f417138a) && this.f417139b.equals(bVar.f417139b) && this.f417140c.equals(bVar.f417140c) && this.f417141d.equals(bVar.f417141d) && this.f417142e.equals(bVar.f417142e) && this.f417143f.equals(bVar.f417143f) && this.f417145h.equals(bVar.f417145h) && this.f417146i.equals(bVar.f417146i) && this.f417148k.equals(bVar.f417148k) && this.f417149l.equals(bVar.f417149l) && this.f417150m.equals(bVar.f417150m) && this.f417151n.equals(bVar.f417151n);
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
    public final a.InterfaceC12009a<T> g(int i12) {
        throw new UnsupportedOperationException("Cannot change modifiers of decorated type: " + this.f417138a);
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
    public final a.InterfaceC12009a.d.c.b h(d.f.e eVar) {
        throw new UnsupportedOperationException("Cannot implement interface for decorated type: " + this.f417138a);
    }

    public final int hashCode() {
        return this.f417151n.hashCode() + H.e((this.f417149l.hashCode() + ((this.f417148k.hashCode() + ((this.f417147j.hashCode() + ((this.f417146i.hashCode() + ((this.f417145h.hashCode() + ((this.f417144g.hashCode() + ((this.f417143f.hashCode() + ((this.f417142e.hashCode() + ((this.f417141d.hashCode() + ((this.f417140c.hashCode() + ((this.f417139b.hashCode() + D8.j(this.f417138a, getClass().hashCode() * 31, 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f417150m);
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
    public final a.d<T> i(TypeResolutionStrategy typeResolutionStrategy, TypePool typePool) {
        MethodGraph.Compiler compiler = this.f417146i;
        TypeDescription typeDescription = this.f417138a;
        MethodGraph.b bVarE = compiler.c(typeDescription).e();
        bVarE.getClass();
        List<? extends MethodGraph.Node> list = bVarE.f416916b;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<? extends MethodGraph.Node> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        b.c cVar = new b.c(arrayList);
        LatentMatcher<? super net.bytebuddy.description.method.a> latentMatcher = this.f417149l;
        TypeDescription typeDescription2 = this.f417138a;
        ArrayList arrayListA = net.bytebuddy.utility.a.a(cVar.P1(new M(latentMatcher.a(typeDescription2))), typeDescription2.q().P1(new M(MethodSortMatcher.Sort.f418389g.f418392c)));
        String str = TypeWriter.Default.f416967u;
        b.c cVar2 = new b.c(arrayListA);
        return new TypeWriter.Default.ForInlining.b(typeDescription, this.f417141d, TypeWriter.FieldPool.Disabled.f417082b, TypeWriter.RecordComponentPool.Disabled.f417120b, this.f417150m, new TypeWriter.Default.ForInlining.b.C12066b(typeDescription), cVar2, new b.C11978b(), new c.b(), LoadedTypeInitializer.NoOp.f417353b, TypeInitializer.None.f416957b, this.f417139b, this.f417140c, this.f417143f, this.f417144g, this.f417142e, this.f417145h, this.f417147j, this.f417148k, typePool, typeDescription, this.f417151n).b(typeResolutionStrategy.a());
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
    public final a.InterfaceC12009a<T> j(Collection<? extends AnnotationDescription> collection) {
        return I(new TypeAttributeAppender.b(new ArrayList(collection)));
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
    public final a.InterfaceC12009a.b.InterfaceC12015a.InterfaceC12017b<T> n(String str, TypeDefinition typeDefinition, int i12) {
        throw new UnsupportedOperationException("Cannot define field for decorated type: " + this.f417138a);
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
    public final a.InterfaceC12009a<T> r(AsmVisitorWrapper asmVisitorWrapper) {
        return new b(this.f417138a, this.f417139b, new AsmVisitorWrapper.b(this.f417140c, asmVisitorWrapper), this.f417141d, this.f417142e, this.f417143f, this.f417144g, this.f417145h, this.f417146i, this.f417147j, this.f417148k, this.f417149l, this.f417150m, this.f417151n);
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
    public final a.d s() {
        return i(TypeResolutionStrategy.Passive.f416611b, TypePool.Empty.f418835b);
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
    public final a.InterfaceC12009a<T> v(net.bytebuddy.implementation.bytecode.a aVar) {
        throw new UnsupportedOperationException("Cannot add initializer of decorated type: " + this.f417138a);
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
    public final a.InterfaceC12009a.d.c w(LatentMatcher.f fVar) {
        throw new UnsupportedOperationException("Cannot intercept method for decorated type: " + this.f417138a);
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
    public final a.InterfaceC12009a<T> x(TypeDescription typeDescription) {
        throw new UnsupportedOperationException("Cannot change type declaration of decorated type: " + this.f417138a);
    }
}
