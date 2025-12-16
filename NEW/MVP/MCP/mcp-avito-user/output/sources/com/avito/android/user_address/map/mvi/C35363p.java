package com.avito.android.user_address.map.mvi;

import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.user_address.UserAddressActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAddressMapFlowUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapFlowUtilsKt$moveCameraToPositionSellerAddAddressFlow$1", f = "UserAddressMapFlowUtils.kt", i = {0, 1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9, 9, 10, 11, 12, 13, 14, 15, 16}, l = {288, 294, 295, 300, 301, 327, 329, 335, 343, 345, 353, 359, 361, 362, 363, 364, 365, 366}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "response", "$this$flow", "response", "$this$flow", "response", "$this$flow", "response", "$this$flow", "$this$flow", "$this$flow", "response", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0", "L$1", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
/* renamed from: com.avito.android.user_address.map.mvi.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35363p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserAddressMapMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public WG0.a f307898q;

    /* renamed from: r, reason: collision with root package name */
    public int f307899r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f307900s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ UserAddressAddNewAddressMviState f307901t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AvitoMapCameraPosition f307902u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_address.map.domain.d f307903v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow f307904w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35363p(UserAddressAddNewAddressMviState userAddressAddNewAddressMviState, AvitoMapCameraPosition avitoMapCameraPosition, com.avito.android.user_address.map.domain.d dVar, UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow sellerAddressFlow, Continuation<? super C35363p> continuation) {
        super(2, continuation);
        this.f307901t = userAddressAddNewAddressMviState;
        this.f307902u = avitoMapCameraPosition;
        this.f307903v = dVar;
        this.f307904w = sellerAddressFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35363p c35363p = new C35363p(this.f307901t, this.f307902u, this.f307903v, this.f307904w, continuation);
        c35363p.f307900s = obj;
        return c35363p;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserAddressMapMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35363p) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0152 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0224 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0237 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x024a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0292 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0300 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.map.mvi.C35363p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
