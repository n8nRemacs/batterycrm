package com.avito.android.user_address.map.mvi;

import com.avito.android.geo_common.model.location_picker.LocationPickerAddressType;
import com.avito.android.user_address.UserAddressActivity;
import com.avito.android.user_address.map.mvi.UserAddressMapMviInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import nF.C44245a;

/* compiled from: UserAddressMapMviActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapMviActor$processSaveButton$1", f = "UserAddressMapMviActor.kt", i = {0, 1}, l = {358, 363, 368}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes4.dex */
final class S extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserAddressMapMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f307711q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f307712r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UserAddressAddNewAddressMviState f307713s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B f307714t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(UserAddressAddNewAddressMviState userAddressAddNewAddressMviState, B b12, Continuation<? super S> continuation) {
        super(2, continuation);
        this.f307713s = userAddressAddNewAddressMviState;
        this.f307714t = b12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        S s5 = new S(this.f307713s, this.f307714t, continuation);
        s5.f307712r = obj;
        return s5;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserAddressMapMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((S) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        com.avito.android.user_address.map.domain.a aVar;
        Object objC;
        Object objC2;
        int addressId;
        String str;
        String strE;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f307711q;
        UserAddressAddNewAddressMviState userAddressAddNewAddressMviState = this.f307713s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f307712r;
            String str2 = LocationPickerAddressType.OTHER.f159425b;
            String strE2 = userAddressAddNewAddressMviState.getF307729f().e();
            com.avito.android.user_address.map.domain.b bVar = new com.avito.android.user_address.map.domain.b(userAddressAddNewAddressMviState.getF307726c().getMapPoint().getLatitude(), userAddressAddNewAddressMviState.getF307726c().getMapPoint().getLongitude());
            B b12 = this.f307714t;
            UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map = b12.f307642a;
            UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.Short r82 = map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.Short ? (UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.Short) map : null;
            com.avito.android.user_address.map.domain.a aVar2 = new com.avito.android.user_address.map.domain.a(null, str2, strE2, bVar, null, r82 != null && r82.f307156g, 17, null);
            if (userAddressAddNewAddressMviState instanceof UserAddressMapFullAddressMviState) {
                UserAddressMapFullAddressMviState userAddressMapFullAddressMviState = (UserAddressMapFullAddressMviState) userAddressAddNewAddressMviState;
                aVar = new com.avito.android.user_address.map.domain.a(aVar2.f307574a, aVar2.f307575b, aVar2.f307576c, aVar2.f307577d, new aH0.g(userAddressMapFullAddressMviState.f307736m, userAddressMapFullAddressMviState.f307738o, userAddressMapFullAddressMviState.f307737n, userAddressMapFullAddressMviState.f307739p), aVar2.f307579f);
            } else {
                if (!(userAddressAddNewAddressMviState instanceof UserAddressMapShortAddressMviState)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = aVar2;
            }
            C44245a c44245a = b12.f307649h;
            c44245a.getClass();
            kotlin.reflect.n<Object> nVar = C44245a.f414956i[1];
            boolean zBooleanValue = ((Boolean) c44245a.f414958c.a().invoke()).booleanValue();
            com.avito.android.user_address.map.domain.d dVar = b12.f307643b;
            if (zBooleanValue) {
                this.f307712r = interfaceC43172j;
                this.f307711q = 1;
                objC2 = dVar.c(aVar, this);
                if (objC2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aH0.b bVar2 = (aH0.b) objC2;
                addressId = bVar2.getAddressId();
                String address = bVar2.getAddress();
                str = bVar2.getAddressKind().f159426c;
                strE = address;
            } else {
                this.f307712r = interfaceC43172j;
                this.f307711q = 2;
                objC = dVar.c(aVar, this);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
                addressId = ((aH0.b) objC).getAddressId();
                strE = userAddressAddNewAddressMviState.getF307729f().e();
                str = null;
            }
        } else if (i12 == 1) {
            interfaceC43172j = (InterfaceC43172j) this.f307712r;
            C42729a0.b(obj);
            objC2 = obj;
            aH0.b bVar22 = (aH0.b) objC2;
            addressId = bVar22.getAddressId();
            String address2 = bVar22.getAddress();
            str = bVar22.getAddressKind().f159426c;
            strE = address2;
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f307712r;
            C42729a0.b(obj);
            objC = obj;
            addressId = ((aH0.b) objC).getAddressId();
            strE = userAddressAddNewAddressMviState.getF307729f().e();
            str = null;
        }
        UserAddressMapMviInternalAction.ProceedSuccessSave proceedSuccessSave = new UserAddressMapMviInternalAction.ProceedSuccessSave(addressId, null, strE, str, null, null, null);
        this.f307712r = null;
        this.f307711q = 3;
        if (interfaceC43172j.emit(proceedSuccessSave, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
