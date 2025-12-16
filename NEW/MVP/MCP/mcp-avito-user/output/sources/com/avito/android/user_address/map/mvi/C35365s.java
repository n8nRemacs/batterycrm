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

/* compiled from: UserAddressMapFlowUtils.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapFlowUtilsKt$moveMapToCameraPositionFlow$2", f = "UserAddressMapFlowUtils.kt", i = {0}, l = {155, 156}, m = "invokeSuspend", n = {"$this$catch"}, s = {"L$0"})
/* renamed from: com.avito.android.user_address.map.mvi.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35365s extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserAddressMapMviInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f307915q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f307916r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_address.map.view.e f307917s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35365s(com.avito.android.user_address.map.view.e eVar, Continuation<? super C35365s> continuation) {
        super(3, continuation);
        this.f307917s = eVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super UserAddressMapMviInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        C35365s c35365s = new C35365s(this.f307917s, continuation);
        c35365s.f307916r = interfaceC43172j;
        return c35365s.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f307915q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = this.f307916r;
            UserAddressMapMviInternalAction.ShowToastBar showToastBar = new UserAddressMapMviInternalAction.ShowToastBar(this.f307917s.getF307959a(), false, null, 6, null);
            this.f307916r = interfaceC43172j;
            this.f307915q = 1;
            if (interfaceC43172j.emit(showToastBar, this) == coroutine_suspended) {
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
            interfaceC43172j = this.f307916r;
            C42729a0.b(obj);
        }
        UserAddressMapMviInternalAction.MoveMapToPreviousCoordinates moveMapToPreviousCoordinates = new UserAddressMapMviInternalAction.MoveMapToPreviousCoordinates(true);
        this.f307916r = null;
        this.f307915q = 2;
        if (interfaceC43172j.emit(moveMapToPreviousCoordinates, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
