package com.avito.android.user_address.map.mvi;

import com.avito.android.user_address.map.mvi.UserAddressMapMviInternalAction;
import com.facebook.imageutils.JfifUtil;
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
@DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapFlowUtilsKt$moveMapToCameraPositionFlowDelme$2", f = "UserAddressMapFlowUtils.kt", i = {0}, l = {224, JfifUtil.MARKER_APP1}, m = "invokeSuspend", n = {"$this$catch"}, s = {"L$0"})
/* renamed from: com.avito.android.user_address.map.mvi.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35367u extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserAddressMapMviInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f307918q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f307919r;

    public C35367u() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super UserAddressMapMviInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f307918q;
        if (i12 == 0) {
            C42729a0.b(obj);
            throw null;
        }
        if (i12 == 1) {
            InterfaceC43172j interfaceC43172j = this.f307919r;
            C42729a0.b(obj);
            UserAddressMapMviInternalAction.MoveMapToPreviousCoordinates moveMapToPreviousCoordinates = new UserAddressMapMviInternalAction.MoveMapToPreviousCoordinates(true);
            this.f307919r = null;
            this.f307918q = 2;
            if (interfaceC43172j.emit(moveMapToPreviousCoordinates, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
