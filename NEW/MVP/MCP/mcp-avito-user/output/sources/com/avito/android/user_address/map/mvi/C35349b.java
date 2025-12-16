package com.avito.android.user_address.map.mvi;

import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.user_address.UserAddressActivity;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAddressMapBootstrap.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapBootstrap$proceedAddSellerAddressFlow$2", f = "UserAddressMapBootstrap.kt", i = {}, l = {192}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_address.map.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35349b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserAddressMapMviInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f307847q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f307848r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow f307849s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C35358k f307850t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35349b(UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow sellerAddressFlow, C35358k c35358k, Continuation<? super C35349b> continuation) {
        super(3, continuation);
        this.f307849s = sellerAddressFlow;
        this.f307850t = c35358k;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super UserAddressMapMviInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        C35349b c35349b = new C35349b(this.f307849s, this.f307850t, continuation);
        c35349b.f307848r = interfaceC43172j;
        return c35349b.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f307847q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f307848r;
            UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow sellerAddressFlow = this.f307849s;
            AvitoMapPoint avitoMapPoint = new AvitoMapPoint(sellerAddressFlow.f307140f, sellerAddressFlow.f307139e, null, 4, null);
            C35358k c35358k = this.f307850t;
            com.avito.android.user_address.map.domain.d dVar = c35358k.f307882b;
            AvitoMapCameraPosition avitoMapCameraPosition = new AvitoMapCameraPosition(avitoMapPoint, 17.0f, 0.0f, null, null, 28, null);
            UserAddressMapShortAddressMviState.f307785m.getClass();
            C43152f0 c43152f0 = new C43152f0(C43175k.G(new C35363p(UserAddressMapShortAddressMviState.f307786n, avitoMapCameraPosition, dVar, sellerAddressFlow, null)), new C35364q(c35358k.f307883c, null));
            this.f307847q = 1;
            if (C43175k.u(this, c43152f0, interfaceC43172j) == coroutine_suspended) {
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
