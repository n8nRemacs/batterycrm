package com.avito.android.advertising.loaders.beduin;

import com.avito.android.advertising.CommercialItem;
import com.avito.android.advertising.loaders.beduin.H;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CommercialBDUITrackPixelInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advertising.loaders.beduin.CommercialBDUITrackPixelInteractionHandler$handle$1", f = "CommercialBDUITrackPixelInteractionHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class B extends SuspendLambda implements Y41.p<InterfaceC43172j<? super dU0.f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C f88063q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ A f88064r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C c12, A a12, Continuation<? super B> continuation) {
        super(2, continuation);
        this.f88063q = c12;
        this.f88064r = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new B(this.f88063q, this.f88064r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super dU0.f> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((B) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C c12 = this.f88063q;
        H h12 = (H) ((r) c12.f88065c).invoke();
        A a12 = this.f88064r;
        H.c cVar = h12.get(a12.f88060a);
        if (cVar != null && (cVar instanceof H.c.C2608c)) {
            CommercialItem commercialItem = ((H.c.C2608c) cVar).f88086a;
            if (commercialItem instanceof com.avito.android.advertising.h) {
                com.avito.android.advertising.b banner = ((com.avito.android.advertising.h) commercialItem).getBanner();
                String str = a12.f88061b;
                boolean zEquals = str.equals("click");
                Y41.a<com.avito.android.advertising.loaders.event_service.c> aVar = c12.f88066d;
                if (zEquals && (banner instanceof com.avito.android.advertising.loaders.event_service.b)) {
                    ((com.avito.android.advertising.loaders.event_service.c) ((s) aVar).invoke()).d((com.avito.android.advertising.loaders.event_service.b) banner);
                } else if (str.equals("impression") && (banner instanceof com.avito.android.advertising.loaders.event_service.i)) {
                    ((com.avito.android.advertising.loaders.event_service.c) ((s) aVar).invoke()).h((com.avito.android.advertising.loaders.event_service.i) banner);
                }
            }
        }
        return G0.f406611a;
    }
}
