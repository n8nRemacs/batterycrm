package net.bytebuddy.dynamic.scaffold.inline;

import java.util.List;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.method.b;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.b;
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
import net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.attribute.AnnotationRetention;
import net.bytebuddy.implementation.attribute.AnnotationValueFilter;
import net.bytebuddy.implementation.attribute.TypeAttributeAppender;
import net.bytebuddy.implementation.auxiliary.a;
import net.bytebuddy.matcher.LatentMatcher;
import net.bytebuddy.pool.TypePool;

/* compiled from: RedefinitionDynamicTypeBuilder.java */
/* loaded from: classes8.dex */
public class g<T> extends a<T> {
    public g() {
        throw null;
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a.AbstractC12011a
    public final a.InterfaceC12009a<T> K(InstrumentedType.d dVar, FieldRegistry fieldRegistry, MethodRegistry methodRegistry, RecordComponentRegistry recordComponentRegistry, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, a.InterfaceC12088a interfaceC12088a, AnnotationValueFilter.b bVar, AnnotationRetention annotationRetention, Implementation.Context.b bVar2, MethodGraph.Compiler compiler, TypeValidation typeValidation, VisibilityBridgeStrategy visibilityBridgeStrategy, ClassWriterStrategy classWriterStrategy, LatentMatcher<? super net.bytebuddy.description.method.a> latentMatcher, List<? extends net.bytebuddy.dynamic.a> list) {
        return new g(dVar, fieldRegistry, methodRegistry, recordComponentRegistry, typeAttributeAppender, asmVisitorWrapper, classFileVersion, interfaceC12088a, bVar, annotationRetention, bVar2, compiler, typeValidation, visibilityBridgeStrategy, classWriterStrategy, latentMatcher, list, this.f417136r, this.f417137s);
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
    public final a.d<T> i(TypeResolutionStrategy typeResolutionStrategy, TypePool typePool) {
        c cVarB = c.b(this.f416633p, this.f417136r);
        MethodRegistry.b.c cVarC = this.f416620c.c(this.f416618a, this.f416629l, this.f416630m, this.f416631n, cVarB);
        FieldRegistry fieldRegistry = this.f416619b;
        TypeDescription typeDescription = cVarC.f416944d;
        FieldRegistry.a.C12049a c12049aA = fieldRegistry.a(typeDescription);
        RecordComponentRegistry.a.C12060a c12060aA = this.f416621d.a(typeDescription);
        String str = TypeWriter.Default.f416967u;
        TypeDescription typeDescription2 = cVarC.f416944d;
        net.bytebuddy.description.field.b<a.c> bVarX = typeDescription2.x();
        b.c cVar = cVarC.f416946f;
        net.bytebuddy.description.method.b<?> bVarB = cVarC.b();
        net.bytebuddy.description.type.c<b.c> cVarZ = typeDescription.z();
        SubclassImplementationTarget.Factory factory = SubclassImplementationTarget.Factory.LEVEL_TYPE;
        MethodRebaseResolver.Disabled disabled = MethodRebaseResolver.Disabled.f417123b;
        return new TypeWriter.Default.ForInlining.WithFullProcessing(typeDescription2, this.f416624g, c12049aA, c12060aA, this.f416634q, bVarX, cVar, bVarB, cVarZ, cVarC.f416942b, cVarC.f416943c, this.f416622e, this.f416623f, this.f416626i, this.f416627j, this.f416625h, this.f416628k, this.f416630m, this.f416632o, typePool, this.f417136r, this.f417137s, cVarC, factory, disabled).b(typeResolutionStrategy.a());
    }
}
