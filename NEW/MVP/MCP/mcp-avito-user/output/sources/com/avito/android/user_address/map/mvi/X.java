package com.avito.android.user_address.map.mvi;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.user_address.UserAddressActivity;
import com.avito.android.user_address.map.domain.SellerAddNewAddressData;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapMviActor$processSellerAddAddress$1", f = "UserAddressMapMviActor.kt", i = {}, l = {503}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class X extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserAddressMapMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f307806q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f307807r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B f307808s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ UserAddressMapShortAddressMviState f307809t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(B b12, UserAddressMapShortAddressMviState userAddressMapShortAddressMviState, Continuation<? super X> continuation) {
        super(2, continuation);
        this.f307808s = b12;
        this.f307809t = userAddressMapShortAddressMviState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        X x12 = new X(this.f307808s, this.f307809t, continuation);
        x12.f307807r = obj;
        return x12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserAddressMapMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((X) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f307806q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f307807r;
            UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map = this.f307808s.f307642a;
            if (!(map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow)) {
                return G0.f406611a;
            }
            UserAddressMapShortAddressMviState userAddressMapShortAddressMviState = this.f307809t;
            if (userAddressMapShortAddressMviState.f307797l == null) {
                return G0.f406611a;
            }
            UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow sellerAddressFlow = (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow) map;
            String str = sellerAddressFlow.f307136b;
            AvitoMapPoint mapPoint = userAddressMapShortAddressMviState.f307788c.getMapPoint();
            SellerAddNewAddressData sellerAddNewAddressData = userAddressMapShortAddressMviState.f307797l;
            long j12 = sellerAddNewAddressData.f307558d;
            SellerAddNewAddressData.Components components = sellerAddNewAddressData.f307559e;
            UserAddressMapMviInternalAction.ProceedSellerAddAddressSuccess proceedSellerAddAddressSuccess = new UserAddressMapMviInternalAction.ProceedSellerAddAddressSuccess(new SellerAddNewAddressData(str, sellerAddNewAddressData.f307557c, j12, new SellerAddNewAddressData.Components(components.f307564b, components.f307565c), mapPoint, sellerAddressFlow.f307141g, sellerAddressFlow.f307142h, sellerAddressFlow.f307143i));
            this.f307806q = 1;
            if (interfaceC43172j.emit(proceedSellerAddAddressSuccess, this) == coroutine_suspended) {
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
