package net.bytebuddy.dynamic.scaffold.inline;

import com.yandex.div2.D8;
import java.util.List;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
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
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.attribute.AnnotationRetention;
import net.bytebuddy.implementation.attribute.AnnotationValueFilter;
import net.bytebuddy.implementation.attribute.TypeAttributeAppender;
import net.bytebuddy.implementation.auxiliary.a;
import net.bytebuddy.matcher.LatentMatcher;
import net.bytebuddy.pool.TypePool;

/* compiled from: AbstractInliningDynamicTypeBuilder.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes8.dex */
public abstract class a<T> extends a.InterfaceC12009a.AbstractC12010a.AbstractC12011a<T> {

    /* renamed from: r, reason: collision with root package name */
    public final TypeDescription f417136r;

    /* renamed from: s, reason: collision with root package name */
    public final ClassFileLocator f417137s;

    public a(InstrumentedType.d dVar, FieldRegistry fieldRegistry, MethodRegistry methodRegistry, RecordComponentRegistry recordComponentRegistry, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, a.InterfaceC12088a interfaceC12088a, AnnotationValueFilter.b bVar, AnnotationRetention annotationRetention, Implementation.Context.b bVar2, MethodGraph.Compiler compiler, TypeValidation typeValidation, VisibilityBridgeStrategy visibilityBridgeStrategy, ClassWriterStrategy classWriterStrategy, LatentMatcher<? super net.bytebuddy.description.method.a> latentMatcher, List<? extends net.bytebuddy.dynamic.a> list, TypeDescription typeDescription, ClassFileLocator classFileLocator) {
        super(dVar, fieldRegistry, methodRegistry, recordComponentRegistry, typeAttributeAppender, asmVisitorWrapper, classFileVersion, interfaceC12088a, bVar, annotationRetention, bVar2, compiler, typeValidation, visibilityBridgeStrategy, classWriterStrategy, latentMatcher, list);
        this.f417136r = typeDescription;
        this.f417137s = classFileLocator;
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a.AbstractC12011a
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
        a aVar = (a) obj;
        return this.f417136r.equals(aVar.f417136r) && this.f417137s.equals(aVar.f417137s);
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a.AbstractC12010a.AbstractC12011a
    public int hashCode() {
        return this.f417137s.hashCode() + D8.j(this.f417136r, super.hashCode() * 31, 31);
    }

    @Override // net.bytebuddy.dynamic.a.InterfaceC12009a
    public final a.d s() {
        return i(TypeResolutionStrategy.Passive.f416611b, new TypePool.Default(new TypePool.CacheProvider.b(), this.f417137s, TypePool.Default.ReaderMode.FAST));
    }
}
