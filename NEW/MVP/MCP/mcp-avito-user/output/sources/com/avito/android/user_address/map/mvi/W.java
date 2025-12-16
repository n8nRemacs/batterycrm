package com.avito.android.user_address.map.mvi;

import com.avito.android.user_address.NavigationController;
import com.avito.android.user_address.UserAddressActivity;
import com.avito.android.user_address.map.domain.UserAddressMultiGeoData;
import com.avito.android.user_address.map.mvi.UserAddressMapMviInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAddressMapMviActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapMviActor$processSaveMultiGeoAddress$1", f = "UserAddressMapMviActor.kt", i = {}, l = {455}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class W extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserAddressMapMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f307802q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f307803r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B f307804s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ UserAddressMapShortAddressMviState f307805t;

    /* compiled from: UserAddressMapMviActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[NavigationController.Mode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                NavigationController.Mode mode = NavigationController.Mode.f307098b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(B b12, UserAddressMapShortAddressMviState userAddressMapShortAddressMviState, Continuation<? super W> continuation) {
        super(2, continuation);
        this.f307804s = b12;
        this.f307805t = userAddressMapShortAddressMviState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        W w12 = new W(this.f307804s, this.f307805t, continuation);
        w12.f307803r = obj;
        return w12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserAddressMapMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((W) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        UserAddressMapMviInternalAction proceedSuccessSave;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f307802q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f307803r;
            UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map = this.f307804s.f307642a;
            if (!(map instanceof UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo)) {
                return G0.f406611a;
            }
            UserAddressMultiGeoData userAddressMultiGeoData = this.f307805t.f307796k;
            if (userAddressMultiGeoData == null) {
                return G0.f406611a;
            }
            Integer num = userAddressMultiGeoData.f307568d;
            if (num == null) {
                return G0.f406611a;
            }
            int iIntValue = num.intValue();
            int iOrdinal = ((UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo) map).f307134h.ordinal();
            double d12 = userAddressMultiGeoData.f307572h;
            double d13 = userAddressMultiGeoData.f307571g;
            if (iOrdinal == 0) {
                Double dBoxDouble = Boxing.boxDouble(d13);
                Double dBoxDouble2 = Boxing.boxDouble(d12);
                proceedSuccessSave = new UserAddressMapMviInternalAction.ProceedSuccessSave(iIntValue, userAddressMultiGeoData.f307569e, userAddressMultiGeoData.f307567c, null, userAddressMultiGeoData.f307566b, dBoxDouble, dBoxDouble2);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                Double dBoxDouble3 = Boxing.boxDouble(d13);
                Double dBoxDouble4 = Boxing.boxDouble(d12);
                proceedSuccessSave = new UserAddressMapMviInternalAction.ProceedUpdateAddressSuccessMap(iIntValue, userAddressMultiGeoData.f307569e, userAddressMultiGeoData.f307567c, null, userAddressMultiGeoData.f307566b, dBoxDouble3, dBoxDouble4);
            }
            this.f307802q = 1;
            if (interfaceC43172j.emit(proceedSuccessSave, this) == coroutine_suspended) {
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
