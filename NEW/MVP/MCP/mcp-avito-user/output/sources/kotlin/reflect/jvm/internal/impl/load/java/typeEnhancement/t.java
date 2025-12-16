package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.load.java.A;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.C42911d;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.B;
import kotlin.reflect.jvm.internal.impl.types.I0;
import kotlin.reflect.jvm.internal.impl.types.O;
import u51.InterfaceC48806h;

/* compiled from: signatureEnhancement.kt */
@s0
/* loaded from: classes8.dex */
final class t extends a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.a f408399a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f408400b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.h f408401c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AnnotationQualifierApplicabilityType f408402d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f408403e;

    public /* synthetic */ t(kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z12, kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z13, int i12, C42822w c42822w) {
        this(aVar, z12, hVar, annotationQualifierApplicabilityType, (i12 & 16) != 0 ? false : z13);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g c(@Y61.k InterfaceC48806h interfaceC48806h) {
        return ((O) interfaceC48806h).getAnnotations();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    @Y61.l
    public final A e() {
        return (A) this.f408401c.f408256d.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public final O f(InterfaceC48806h interfaceC48806h) {
        return I0.a((O) interfaceC48806h);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public final boolean h() {
        return this.f408403e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public final kotlin.reflect.jvm.internal.impl.types.checker.u i() {
        return kotlin.reflect.jvm.internal.impl.types.checker.u.f410124a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    public final boolean j(@Y61.k u51.n nVar) {
        return nVar instanceof B;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
    @Y61.k
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final C42911d b() {
        return this.f408401c.f408253a.f408092q;
    }

    public t(@Y61.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z12, @Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, @Y61.k AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z13) {
        this.f408399a = aVar;
        this.f408400b = z12;
        this.f408401c = hVar;
        this.f408402d = annotationQualifierApplicabilityType;
        this.f408403e = z13;
    }
}
