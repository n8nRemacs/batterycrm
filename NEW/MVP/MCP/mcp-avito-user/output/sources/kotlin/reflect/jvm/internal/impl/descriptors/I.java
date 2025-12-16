package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.reflect.jvm.internal.impl.descriptors.H;

/* compiled from: NotFoundClasses.kt */
/* loaded from: classes8.dex */
final class I extends kotlin.jvm.internal.N implements Y41.l<H.a, InterfaceC42851d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H f407433l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(H h12) {
        super(1);
        this.f407433l = h12;
    }

    @Override // Y41.l
    public final InterfaceC42851d invoke(H.a aVar) {
        K kInvoke;
        H.a aVar2 = aVar;
        kotlin.reflect.jvm.internal.impl.name.b bVar = aVar2.f407428a;
        if (bVar.f409241c) {
            throw new UnsupportedOperationException("Unresolved local class: " + bVar);
        }
        kotlin.reflect.jvm.internal.impl.name.b bVarF = bVar.f();
        H h12 = this.f407433l;
        List<Integer> list = aVar2.f407429b;
        if (bVarF == null || (kInvoke = h12.a(bVarF, C42745f0.w(list, 1))) == null) {
            kInvoke = h12.f407426c.invoke(bVar.g());
        }
        InterfaceC42852e interfaceC42852e = kInvoke;
        boolean z12 = !bVar.f409240b.e().d();
        kotlin.reflect.jvm.internal.impl.storage.f fVar = h12.f407424a;
        kotlin.reflect.jvm.internal.impl.name.f fVarI = bVar.i();
        Integer num = (Integer) C42745f0.G(list);
        return new H.b(fVar, interfaceC42852e, fVarI, z12, num != null ? num.intValue() : 0);
    }
}
