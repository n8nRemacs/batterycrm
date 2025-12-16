package com.avito.android.wallet.pin.impl.verification.mvi.component;

import com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationInternalAction;
import com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pP0.InterfaceC46989a;

/* compiled from: WalletPinVerificationActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.verification.mvi.component.WalletPinVerificationActor$processPinSymbolEntered$1", f = "WalletPinVerificationActor.kt", i = {0, 1, 1}, l = {106, 112, 124}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "pinLength"}, s = {"L$0", "L$0", "I$0"})
/* loaded from: classes5.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WalletPinVerificationInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f329156q;

    /* renamed from: r, reason: collision with root package name */
    public int f329157r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f329158s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ WalletPinVerificationState f329159t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC46989a.d f329160u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C36145a f329161v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WalletPinVerificationState walletPinVerificationState, InterfaceC46989a.d dVar, C36145a c36145a, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f329159t = walletPinVerificationState;
        this.f329160u = dVar;
        this.f329161v = c36145a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f329159t, this.f329160u, this.f329161v, continuation);
        fVar.f329158s = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super WalletPinVerificationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.pin.impl.verification.mvi.component.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
