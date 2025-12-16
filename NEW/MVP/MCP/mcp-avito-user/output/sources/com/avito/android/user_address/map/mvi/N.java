package com.avito.android.user_address.map.mvi;

import com.avito.android.R;
import com.avito.android.user_address.map.mvi.UserAddressMapMviInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAddressMapMviActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$ProceedDeleteAddressSuccessMap;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapMviActor$processEditAddressAction$8", f = "UserAddressMapMviActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class N extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserAddressMapMviInternalAction.ProceedDeleteAddressSuccessMap>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ B f307694q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(B b12, Continuation<? super N> continuation) {
        super(3, continuation);
        this.f307694q = b12;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super UserAddressMapMviInternalAction.ProceedDeleteAddressSuccessMap> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        return new N(this.f307694q, continuation).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        new UserAddressMapMviInternalAction.ShowToastBar(this.f307694q.f307645d.getResources().getString(R.string.delete_address_error), false, null, 6, null);
        return G0.f406611a;
    }
}
