package com.avito.android.wallet.pin.impl.verification.mvi.component;

import com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationInternalAction;
import com.yandex.metrica.YandexMetricaDefaultValues;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rP0.C47583b;

/* compiled from: WalletPinVerificationInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.verification.mvi.component.WalletPinVerificationInteractor$verifyBiometry$1", f = "WalletPinVerificationInteractor.kt", i = {}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class s extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WalletPinVerificationInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f329228q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f329229r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f329230s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CP0.d f329231t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C47583b f329232u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f329233v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(m mVar, CP0.d dVar, C47583b c47583b, int i12, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f329230s = mVar;
        this.f329231t = dVar;
        this.f329232u = c47583b;
        this.f329233v = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        s sVar = new s(this.f329230s, this.f329231t, this.f329232u, this.f329233v, continuation);
        sVar.f329229r = obj;
        return sVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super WalletPinVerificationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((s) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f329228q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f329229r;
            C47583b c47583b = this.f329232u;
            rP0.h events = c47583b.getEvents();
            this.f329228q = 1;
            if (m.a(this.f329230s, interfaceC43172j, this.f329231t, c47583b, this.f329233v, events, this) == coroutine_suspended) {
                return coroutine_suspended;
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
