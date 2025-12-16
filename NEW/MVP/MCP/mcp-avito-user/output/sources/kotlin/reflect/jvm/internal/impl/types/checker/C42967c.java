package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.E0;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import u51.InterfaceC48806h;

/* compiled from: ClassicTypeSystemContext.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42967c extends TypeCheckerState.b.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42966b f410095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E0 f410096b;

    public C42967c(InterfaceC42966b interfaceC42966b, E0 e02) {
        this.f410095a = interfaceC42966b;
        this.f410096b = e02;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b
    @Y61.k
    public final u51.i a(@Y61.k TypeCheckerState typeCheckerState, @Y61.k InterfaceC48806h interfaceC48806h) {
        InterfaceC42966b interfaceC42966b = this.f410095a;
        return interfaceC42966b.L(this.f410096b.h(interfaceC42966b.i(interfaceC48806h), Variance.f410069d));
    }
}
