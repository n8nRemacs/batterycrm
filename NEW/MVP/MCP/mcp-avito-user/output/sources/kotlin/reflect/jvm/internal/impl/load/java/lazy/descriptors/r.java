package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.L;

/* compiled from: LazyJavaScope.kt */
/* loaded from: classes8.dex */
final class r extends N implements Y41.a<kotlin.reflect.jvm.internal.impl.storage.l<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f408229l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k51.n f408230m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.h<L> f408231n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, k51.n nVar, l0.h<L> hVar) {
        super(0);
        this.f408229l = pVar;
        this.f408230m = nVar;
        this.f408231n = hVar;
    }

    @Override // Y41.a
    public final kotlin.reflect.jvm.internal.impl.storage.l<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> invoke() {
        p pVar = this.f408229l;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = pVar.f408200b.f408253a;
        return cVar.f408076a.f(new q(pVar, this.f408230m, this.f408231n));
    }
}
