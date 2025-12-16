package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi;

import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.entity.CpxPromoGeoInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ts.C48709c;
import ts.InterfaceC48707a;

/* compiled from: CpxPromoGeoActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lts/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "<anonymous>", "(Lts/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.CpxPromoGeoActor$process$1", f = "CpxPromoGeoActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC48707a, Continuation<? super InterfaceC43160i<? extends CpxPromoGeoInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f127860q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f127861r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C48709c> f127862s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Y41.a<C48709c> aVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f127861r = eVar;
        this.f127862s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f127861r, this.f127862s, continuation);
        cVar.f127860q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC48707a interfaceC48707a, Continuation<? super InterfaceC43160i<? extends CpxPromoGeoInternalAction>> continuation) {
        return ((c) create(interfaceC48707a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f127861r.b((InterfaceC48707a) this.f127860q, this.f127862s.invoke());
    }
}
