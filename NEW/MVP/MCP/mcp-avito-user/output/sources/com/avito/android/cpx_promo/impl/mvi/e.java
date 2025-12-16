package com.avito.android.cpx_promo.impl.mvi;

import com.avito.android.cpx_promo.analytics.clickstream.events.ClickStreamButtonClickEvent;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromo;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromoButton;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CpxPromoActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction$OpenDeeplink;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo.impl.mvi.CpxPromoActor$processButtonClick$1", f = "CpxPromoActor.kt", i = {}, l = {349}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CpxPromoInternalAction.OpenDeeplink>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f127070q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f127071r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CpxPromoButton f127072s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CpxPromoState f127073t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f127074u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CpxPromoButton cpxPromoButton, CpxPromoState cpxPromoState, k kVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f127072s = cpxPromoButton;
        this.f127073t = cpxPromoState;
        this.f127074u = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f127072s, this.f127073t, this.f127074u, continuation);
        eVar.f127071r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CpxPromoInternalAction.OpenDeeplink> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        DeepLink uri;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f127070q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f127071r;
            CpxPromoButton cpxPromoButton = this.f127072s;
            if (cpxPromoButton != null && (uri = cpxPromoButton.getUri()) != null) {
                CpxPromoState cpxPromoState = this.f127073t;
                if (cpxPromoState != null) {
                    CpxPromo cpxPromo = cpxPromoState.f127111d;
                    if (cpxPromoButton.equals(cpxPromo != null ? cpxPromo.f127003e : null)) {
                        k.d(this.f127074u, cpxPromoState, ClickStreamButtonClickEvent.ButtonName.f126793c);
                    }
                }
                CpxPromoInternalAction.OpenDeeplink openDeeplink = new CpxPromoInternalAction.OpenDeeplink(uri, null, 2, null);
                this.f127070q = 1;
                if (interfaceC43172j.emit(openDeeplink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
