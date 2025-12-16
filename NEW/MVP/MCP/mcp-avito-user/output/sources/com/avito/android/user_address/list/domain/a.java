package com.avito.android.user_address.list.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.user_address.list.mvi.entity.UserAddressListMviInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAddressGetListUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.list.domain.UserAddressGetListUseCase$invoke$1", f = "UserAddressGetListUseCase.kt", i = {0, 1, 3}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_NO_ACTIVITY, 33, 35, 43}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super UserAddressListMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f307346q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f307347r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f307348s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f307349t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, boolean z12, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f307348s = cVar;
        this.f307349t = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f307348s, this.f307349t, continuation);
        aVar.f307347r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserAddressListMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0158  */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) throws com.avito.android.util.ApiException {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.list.domain.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
