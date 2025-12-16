package com.avito.android.user_address.map.mvi;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$ProceedDeleteAddressSuccessMap;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapMviActor$processEditAddressAction$7", f = "UserAddressMapMviActor.kt", i = {0}, l = {266, 267}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class M extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserAddressMapMviInternalAction.ProceedDeleteAddressSuccessMap>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f307690q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f307691r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B f307692s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ UserAddressMapFullAddressMviState f307693t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(UserAddressMapFullAddressMviState userAddressMapFullAddressMviState, B b12, Continuation continuation) {
        super(2, continuation);
        this.f307692s = b12;
        this.f307693t = userAddressMapFullAddressMviState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        M m12 = new M(this.f307693t, this.f307692s, continuation);
        m12.f307691r = obj;
        return m12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserAddressMapMviInternalAction.ProceedDeleteAddressSuccessMap> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((M) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f307690q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f307691r;
            com.avito.android.user_address.map.domain.d dVar = this.f307692s.f307643b;
            int i13 = this.f307693t.f307735l;
            this.f307691r = interfaceC43172j;
            this.f307690q = 1;
            obj = dVar.e(i13, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f307691r;
            C42729a0.b(obj);
        }
        aH0.e eVar = (aH0.e) obj;
        UserAddressMapMviInternalAction.ProceedDeleteAddressSuccessMap proceedDeleteAddressSuccessMap = new UserAddressMapMviInternalAction.ProceedDeleteAddressSuccessMap(eVar.getDeleteAddressId(), eVar.getDeleteAddress(), eVar.getDeleteAddressKind().f159426c);
        this.f307691r = null;
        this.f307690q = 2;
        if (interfaceC43172j.emit(proceedDeleteAddressSuccessMap, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
