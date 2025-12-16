package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import k51.InterfaceC42518c;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42895g extends AbstractC42894f implements InterfaceC42518c {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Annotation f407858c;

    public C42895g(@Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k Annotation annotation) {
        super(fVar, null);
        this.f407858c = annotation;
    }

    @Override // k51.InterfaceC42518c
    @Y61.k
    public final C42893e b() {
        return new C42893e(this.f407858c);
    }
}
