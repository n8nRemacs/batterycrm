package kotlin.reflect.jvm.internal.impl.types;

import u51.InterfaceC48806h;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes8.dex */
final class S extends kotlin.jvm.internal.N implements Y41.a<O> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.checker.i f410046l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T f410047m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(kotlin.reflect.jvm.internal.impl.types.checker.i iVar, T t12) {
        super(0);
        this.f410046l = iVar;
        this.f410047m = t12;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.a
    public final O invoke() {
        return this.f410046l.c((InterfaceC48806h) this.f410047m.f410049d.invoke());
    }
}
