package kotlin.reflect.jvm.internal;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42872p;

/* compiled from: util.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/g;", "Lkotlin/reflect/jvm/internal/impl/descriptors/impl/p;", "Lkotlin/reflect/jvm/internal/l;", "Lkotlin/G0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/x;", "descriptor", "data", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/G0;)Lkotlin/reflect/jvm/internal/l;", "Lkotlin/reflect/jvm/internal/impl/descriptors/U;", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/G0;)Lkotlin/reflect/jvm/internal/l;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.reflect.jvm.internal.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42845g extends C42872p<AbstractC43003l<?>, G0> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final KDeclarationContainerImpl f407155a;

    public C42845g(@Y61.k KDeclarationContainerImpl kDeclarationContainerImpl) {
        this.f407155a = kDeclarationContainerImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.C42872p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m
    public final Object a(kotlin.reflect.jvm.internal.impl.descriptors.impl.L l12, Object obj) {
        int i12 = (l12.f407594u != null ? 1 : 0) + (l12.f407595v != null ? 1 : 0);
        boolean z12 = l12.f407639g;
        KDeclarationContainerImpl kDeclarationContainerImpl = this.f407155a;
        if (z12) {
            if (i12 == 0) {
                return new B(kDeclarationContainerImpl, l12);
            }
            if (i12 == 1) {
                return new D(kDeclarationContainerImpl, l12);
            }
            if (i12 == 2) {
                return new E(kDeclarationContainerImpl, l12);
            }
        } else {
            if (i12 == 0) {
                return new I(kDeclarationContainerImpl, l12);
            }
            if (i12 == 1) {
                return new L(kDeclarationContainerImpl, l12);
            }
            if (i12 == 2) {
                return new M(kDeclarationContainerImpl, l12);
            }
        }
        throw new X("Unsupported property: " + l12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.C42872p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m
    public final Object h(InterfaceC42905x interfaceC42905x, Object obj) {
        return new A(this.f407155a, interfaceC42905x);
    }
}
