package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42873q;

/* compiled from: NotFoundClasses.kt */
/* loaded from: classes8.dex */
final class J extends kotlin.jvm.internal.N implements Y41.l<kotlin.reflect.jvm.internal.impl.name.c, K> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H f407434l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(H h12) {
        super(1);
        this.f407434l = h12;
    }

    @Override // Y41.l
    public final K invoke(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return new C42873q(this.f407434l.f407425b, cVar);
    }
}
