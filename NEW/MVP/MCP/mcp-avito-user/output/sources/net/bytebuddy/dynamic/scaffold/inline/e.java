package net.bytebuddy.dynamic.scaffold.inline;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
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
import net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver;
import net.bytebuddy.dynamic.scaffold.inline.d;
import net.bytebuddy.dynamic.scaffold.inline.f;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.MethodAccessorFactory;
import net.bytebuddy.implementation.attribute.AnnotationRetention;
import net.bytebuddy.implementation.attribute.AnnotationValueFilter;
import net.bytebuddy.implementation.attribute.TypeAttributeAppender;
import net.bytebuddy.implementation.auxiliary.TrivialType;
import net.bytebuddy.implementation.auxiliary.a;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.LatentMatcher;
import net.bytebuddy.pool.TypePool;

/* compiled from: RebaseDynamicTypeBuilder.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes8.dex */
public class e<T> extends a<T> {

    /* renamed from: t, reason: collision with root package name */
    public final d.b f417156t;

    public e() {
        throw null;
    }

    public e(InstrumentedType.d dVar, FieldRegistry fieldRegistry, MethodRegistry methodRegistry, RecordComponentRegistry recordComponentRegistry, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, a.InterfaceC12088a interfaceC12088a, AnnotationValueFilter.b bVar, AnnotationRetention annotationRetention, Implementation.Context.b bVar2, MethodGraph.Compiler compiler, TypeValidation typeValidation, VisibilityBridgeStrategy visibilityBridgeStrategy, ClassWriterStrategy classWriterStrategy, LatentMatcher latentMatcher, List list, TypeDescription typeDescription, ClassFileLocator classFileLocator, d.b bVar3) {
        super(dVar, fieldRegistry, methodRegistry, recordComponentRegistry, typeAttributeAppender, asmVisitorWrapper, classFileVersion, interfaceC12088a, bVar, annotationRetention, bVar2, compiler, typeValidation, visibilityBridgeStrategy, classWriterStrategy, latentMatcher, list, typeDescription, classFileLocator);
        this.f417156t = bVar3;
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a.AbstractC12011a
    public final a.InterfaceC12009a<T> K(InstrumentedType.d dVar, FieldRegistry fieldRegistry, MethodRegistry methodRegistry, RecordComponentRegistry recordComponentRegistry, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, a.InterfaceC12088a interfaceC12088a, AnnotationValueFilter.b bVar, AnnotationRetention annotationRetention, Implementation.Context.b bVar2, MethodGraph.Compiler compiler, TypeValidation typeValidation, VisibilityBridgeStrategy visibilityBridgeStrategy, ClassWriterStrategy classWriterStrategy, LatentMatcher<? super net.bytebuddy.description.method.a> latentMatcher, List<? extends net.bytebuddy.dynamic.a> list) {
        return new e(dVar, fieldRegistry, methodRegistry, recordComponentRegistry, typeAttributeAppender, asmVisitorWrapper, classFileVersion, interfaceC12088a, bVar, annotationRetention, bVar2, compiler, typeValidation, visibilityBridgeStrategy, classWriterStrategy, latentMatcher, list, this.f417136r, this.f417137s, this.f417156t);
    }

    @Override // net.bytebuddy.dynamic.scaffold.inline.a, net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a.AbstractC12011a
    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f417156t.equals(((e) obj).f417156t);
        }
        return false;
    }

    @Override // net.bytebuddy.dynamic.scaffold.inline.a, net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a.AbstractC12011a
    public final int hashCode() {
        return this.f417156t.hashCode() + (super.hashCode() * 31);
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
    public final a.d<T> i(TypeResolutionStrategy typeResolutionStrategy, TypePool typePool) {
        MethodRebaseResolver.b c12073b;
        LatentMatcher<? super net.bytebuddy.description.method.a> latentMatcher = this.f416633p;
        TypeDescription typeDescription = this.f417136r;
        MethodRegistry.b.c cVarC = this.f416620c.c(this.f416618a, this.f416629l, this.f416630m, this.f416631n, c.b(latentMatcher, typeDescription));
        HashSet hashSet = new HashSet(typeDescription.q().D2(C44411u.f(typeDescription), this.f416618a));
        hashSet.retainAll(cVarC.b().V3());
        HashMap map = new HashMap();
        TypeDescription typeDescription2 = cVarC.f416944d;
        a.d dVarD = null;
        for (a.d dVar : typeDescription2.q()) {
            if (hashSet.contains(dVar.e())) {
                if (dVar.v0()) {
                    if (dVarD == null) {
                        TrivialType trivialType = TrivialType.SIGNATURE_RELEVANT;
                        dVarD = trivialType.d(this.f416625h.a(typeDescription2, trivialType), this.f416624g, MethodAccessorFactory.Illegal.f417364b);
                    }
                    TypeDescription typeDescriptionT = dVarD.t();
                    c12073b = new MethodRebaseResolver.b.a(new MethodRebaseResolver.b.a.C12072a(dVar, typeDescriptionT), typeDescriptionT);
                } else {
                    c12073b = new MethodRebaseResolver.b.C12073b(new MethodRebaseResolver.b.C12073b.a(typeDescription2, dVar, this.f417156t));
                }
                map.put(dVar, c12073b);
            }
        }
        MethodRebaseResolver.a aVar = dVarD == null ? new MethodRebaseResolver.a(map, Collections.emptyList()) : new MethodRebaseResolver.a(map, Collections.singletonList(dVarD));
        FieldRegistry.a.C12049a c12049aA = this.f416619b.a(typeDescription2);
        RecordComponentRegistry.a.C12060a c12060aA = this.f416621d.a(typeDescription2);
        String str = TypeWriter.Default.f416967u;
        return new TypeWriter.Default.ForInlining.WithFullProcessing(cVarC.f416944d, this.f416624g, c12049aA, c12060aA, net.bytebuddy.utility.a.a(this.f416634q, aVar.f417126c), typeDescription2.x(), cVarC.f416946f, cVarC.b(), typeDescription2.z(), cVarC.f416942b, cVarC.f416943c, this.f416622e, this.f416623f, this.f416626i, this.f416627j, this.f416625h, this.f416628k, this.f416630m, this.f416632o, typePool, this.f417136r, this.f417137s, cVarC, new f.a(aVar), aVar).b(typeResolutionStrategy.a());
    }
}
