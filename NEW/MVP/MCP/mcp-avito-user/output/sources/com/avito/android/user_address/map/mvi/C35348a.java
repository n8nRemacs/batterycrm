package com.avito.android.user_address.map.mvi;

import com.avito.android.user_address.UserAddressActivity;
import com.avito.android.user_address.map.mvi.UserAddressMapMviInternalAction;
import com.avito.android.user_address.model.ValidateByCoordsResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAddressMapBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapBootstrap$proceedAddSellerAddressFlow$1", f = "UserAddressMapBootstrap.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_address.map.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35348a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserAddressMapMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f307843q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f307844r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow f307845s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35348a(UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow sellerAddressFlow, Continuation<? super C35348a> continuation) {
        super(2, continuation);
        this.f307845s = sellerAddressFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35348a c35348a = new C35348a(this.f307845s, continuation);
        c35348a.f307844r = obj;
        return c35348a;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserAddressMapMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35348a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f307843q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f307844r;
            UserAddressMapMviInternalAction.SetAddressMap setAddressMap = new UserAddressMapMviInternalAction.SetAddressMap(new ValidateByCoordsResult.Address("", this.f307845s.f307138d));
            this.f307843q = 1;
            if (interfaceC43172j.emit(setAddressMap, this) == coroutine_suspended) {
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
