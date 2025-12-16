package com.avito.android.wallet.pin.impl.verification.mvi.component;

import com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationInternalAction;
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
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.verification.mvi.component.WalletPinVerificationInteractor$verifyPin$1", f = "WalletPinVerificationInteractor.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class t extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WalletPinVerificationInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f329234q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f329235r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f329236s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f329237t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C47583b f329238u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f329239v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f329240w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(m mVar, String str, C47583b c47583b, int i12, boolean z12, Continuation<? super t> continuation) {
        super(2, continuation);
        this.f329236s = mVar;
        this.f329237t = str;
        this.f329238u = c47583b;
        this.f329239v = i12;
        this.f329240w = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        t tVar = new t(this.f329236s, this.f329237t, this.f329238u, this.f329239v, this.f329240w, continuation);
        tVar.f329235r = obj;
        return tVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super WalletPinVerificationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((t) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f329234q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f329235r;
            this.f329234q = 1;
            int i13 = m.f329179h;
            if (this.f329236s.f(interfaceC43172j, this.f329237t, this.f329238u, this.f329239v, this.f329240w, false, this) == coroutine_suspended) {
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
