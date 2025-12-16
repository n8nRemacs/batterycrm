package net.bytebuddy.dynamic.scaffold.subclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.method.b;
import net.bytebuddy.description.method.c;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.d;
import net.bytebuddy.description.type.e;
import net.bytebuddy.dynamic.TypeResolutionStrategy;
import net.bytebuddy.dynamic.VisibilityBridgeStrategy;
import net.bytebuddy.dynamic.a;
import net.bytebuddy.dynamic.scaffold.ClassWriterStrategy;
import net.bytebuddy.dynamic.scaffold.FieldRegistry;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import net.bytebuddy.dynamic.scaffold.MethodRegistry;
import net.bytebuddy.dynamic.scaffold.RecordComponentRegistry;
import net.bytebuddy.dynamic.scaffold.TypeValidation;
import net.bytebuddy.dynamic.scaffold.TypeWriter;
import net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.attribute.AnnotationRetention;
import net.bytebuddy.implementation.attribute.AnnotationValueFilter;
import net.bytebuddy.implementation.attribute.TypeAttributeAppender;
import net.bytebuddy.implementation.auxiliary.a;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.LatentMatcher;
import net.bytebuddy.matcher.M;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.matcher.ModifierMatcher;
import net.bytebuddy.matcher.W;
import net.bytebuddy.pool.TypePool;

/* compiled from: SubclassDynamicTypeBuilder.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes8.dex */
public class a<T> extends a.InterfaceC12009a.AbstractC12010a.AbstractC12011a<T> {

    /* renamed from: r, reason: collision with root package name */
    public final ConstructorStrategy.Default f417176r;

    /* compiled from: SubclassDynamicTypeBuilder.java */
    @HashCodeAndEqualsPlugin.Enhance
    /* renamed from: net.bytebuddy.dynamic.scaffold.subclass.a$a, reason: collision with other inner class name */
    public static class C12074a implements LatentMatcher<net.bytebuddy.description.method.a> {

        /* renamed from: b, reason: collision with root package name */
        public final LatentMatcher<? super net.bytebuddy.description.method.a> f417177b;

        public C12074a(LatentMatcher<? super net.bytebuddy.description.method.a> latentMatcher) {
            this.f417177b = latentMatcher;
        }

        @Override // net.bytebuddy.matcher.LatentMatcher
        public final InterfaceC44410t<? super net.bytebuddy.description.method.a> a(TypeDescription typeDescription) {
            return MethodSortMatcher.Sort.f418389g.f418392c.a(new M(ModifierMatcher.Mode.FINAL.f418407d)).a(new W(typeDescription)).a(new M(this.f417177b.a(typeDescription))).d(C44411u.k(typeDescription));
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f417177b.equals(((C12074a) obj).f417177b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f417177b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    public a() {
        throw null;
    }

    public a(InstrumentedType.d dVar, FieldRegistry fieldRegistry, MethodRegistry methodRegistry, RecordComponentRegistry recordComponentRegistry, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, a.InterfaceC12088a interfaceC12088a, AnnotationValueFilter.b bVar, AnnotationRetention annotationRetention, Implementation.Context.b bVar2, MethodGraph.Compiler compiler, TypeValidation typeValidation, VisibilityBridgeStrategy visibilityBridgeStrategy, ClassWriterStrategy classWriterStrategy, LatentMatcher latentMatcher, List list, ConstructorStrategy.Default r202) {
        super(dVar, fieldRegistry, methodRegistry, recordComponentRegistry, typeAttributeAppender, asmVisitorWrapper, classFileVersion, interfaceC12088a, bVar, annotationRetention, bVar2, compiler, typeValidation, visibilityBridgeStrategy, classWriterStrategy, latentMatcher, list);
        this.f417176r = r202;
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a.AbstractC12011a
    public final a.InterfaceC12009a<T> K(InstrumentedType.d dVar, FieldRegistry fieldRegistry, MethodRegistry methodRegistry, RecordComponentRegistry recordComponentRegistry, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, a.InterfaceC12088a interfaceC12088a, AnnotationValueFilter.b bVar, AnnotationRetention annotationRetention, Implementation.Context.b bVar2, MethodGraph.Compiler compiler, TypeValidation typeValidation, VisibilityBridgeStrategy visibilityBridgeStrategy, ClassWriterStrategy classWriterStrategy, LatentMatcher<? super net.bytebuddy.description.method.a> latentMatcher, List<? extends net.bytebuddy.dynamic.a> list) {
        return new a(dVar, fieldRegistry, methodRegistry, recordComponentRegistry, typeAttributeAppender, asmVisitorWrapper, classFileVersion, interfaceC12088a, bVar, annotationRetention, bVar2, compiler, typeValidation, visibilityBridgeStrategy, classWriterStrategy, latentMatcher, list, this.f417176r);
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a.AbstractC12011a
    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f417176r.equals(((a) obj).f417176r);
        }
        return false;
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a.AbstractC12011a
    public final int hashCode() {
        return this.f417176r.hashCode() + (super.hashCode() * 31);
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
    public final a.d<T> i(TypeResolutionStrategy typeResolutionStrategy, TypePool typePool) {
        ConstructorStrategy.Default r12 = this.f417176r;
        MethodRegistry methodRegistryB = r12.b(this.f416620c);
        InstrumentedType instrumentedTypeN0 = this.f416618a;
        if (!instrumentedTypeN0.E()) {
            List<a.h> listA = r12.a(instrumentedTypeN0);
            ArrayList arrayList = new ArrayList(listA.size());
            for (a.h hVar : listA) {
                String str = hVar.f416193a;
                int iC2 = r12.c(hVar.f416194b);
                a.InterfaceC11963a.C11964a<e> c11964aG = hVar.g();
                a.InterfaceC11963a.C11964a<c.f> c11964aF = hVar.f();
                d.f.c cVarE = hVar.e();
                net.bytebuddy.description.annotation.a aVarD = hVar.d();
                TypeDescription.Generic.d.b bVar = TypeDescription.Generic.f416323x2;
                arrayList.add(new a.h(str, iC2, c11964aG, hVar.f416196d, c11964aF, cVarE, aVarD, hVar.f416200h, null));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                instrumentedTypeN0 = instrumentedTypeN0.n0((a.h) it.next());
            }
        }
        C12074a c12074a = new C12074a(this.f416633p);
        MethodRegistry.b.a aVarA = methodRegistryB.c(instrumentedTypeN0, this.f416629l, this.f416630m, this.f416631n, c12074a).a(SubclassImplementationTarget.Factory.SUPER_CLASS, this.f416624g);
        FieldRegistry fieldRegistry = this.f416619b;
        TypeDescription typeDescription = aVarA.f416925a;
        FieldRegistry.a.C12049a c12049aA = fieldRegistry.a(typeDescription);
        RecordComponentRegistry.a.C12060a c12060aA = this.f416621d.a(typeDescription);
        String str2 = TypeWriter.Default.f416967u;
        TypeDescription typeDescription2 = aVarA.f416925a;
        return new TypeWriter.Default.a(typeDescription2, this.f416624g, c12049aA, aVarA, c12060aA, this.f416634q, typeDescription2.x(), aVarA.f416928d, new b.c(new ArrayList(aVarA.f416929e.keySet())).P1(new M(MethodSortMatcher.Sort.f418388f.f418392c)), typeDescription.z(), aVarA.f416926b, aVarA.f416927c, this.f416622e, this.f416623f, this.f416626i, this.f416627j, this.f416625h, this.f416628k, this.f416630m, this.f416632o, typePool).b(typeResolutionStrategy.a());
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
    public final a.d s() {
        TypeResolutionStrategy.Passive passive = TypeResolutionStrategy.Passive.f416611b;
        int i12 = TypePool.c.f418845g;
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        return i(passive, new TypePool.c(new TypePool.CacheProvider.b(), TypePool.Empty.f418835b, systemClassLoader));
    }
}
