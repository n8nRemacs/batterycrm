package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: Actor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class C0 extends kotlin.jvm.internal.H implements Y41.q<D0<?>, kotlinx.coroutines.selects.r<?>, Object, kotlin.G0> {
    static {
        new C0();
    }

    public C0() {
        super(3, D0.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(D0<?> d02, kotlinx.coroutines.selects.r<?> rVar, Object obj) {
        D0<?> d03 = d02;
        int i12 = D0.f410784f;
        d03.w0();
        C43108m c43108m = d03.f411033e;
        c43108m.getClass();
        C43108m.g gVar = C43108m.g.f410955b;
        kotlin.jvm.internal.v0.e(3, gVar);
        C43108m.g gVar2 = gVar;
        C43108m.h hVar = C43108m.h.f410956b;
        kotlin.jvm.internal.v0.e(3, hVar);
        new kotlinx.coroutines.selects.m(c43108m, gVar2, hVar, null, 8, null).f412211b.invoke(d03, rVar, obj);
        return kotlin.G0.f406611a;
    }
}
