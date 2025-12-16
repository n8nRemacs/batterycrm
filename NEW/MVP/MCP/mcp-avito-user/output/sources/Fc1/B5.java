package Fc1;

import com.huawei.hms.adapter.internal.AvailableCode;
import feedback.shared.sdk.api.network.entities.GetTogglesResponse;
import feedback.shared.sdk.api.network.entities.RequestType;
import kotlin.C42729a0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@DebugMetadata(c = "feedback.shared.sdk.api.toggles.ToggleManager$check$1", f = "ToggleManager.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY, 30, 35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class B5 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f4826q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ T5 f4827r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B5(T5 t52, Continuation<? super B5> continuation) {
        super(2, continuation);
        this.f4827r = t52;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new B5(this.f4827r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((B5) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f4826q;
        T5 t52 = this.f4827r;
        U3 u32 = t52.f5194b;
        C13611f5 c13611f5 = t52.f5195c;
        try {
        } catch (Exception unused) {
            c13611f5.b(xyz.n.a.j2.DEVICE_FEATURE_TOGGLE_CHECK_FAILURE);
            RequestType requestType = RequestType.GET_CAMPAIGNS;
            this.f4826q = 3;
            if (u32.a(requestType, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (i12 == 0) {
            C42729a0.b(obj);
            C13607f1 c13607f1 = t52.f5193a;
            this.f4826q = 1;
            obj = c13607f1.c(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return kotlin.G0.f406611a;
            }
            C42729a0.b(obj);
        }
        boolean togglesStatus = ((GetTogglesResponse) obj).getTogglesStatus();
        if (togglesStatus) {
            c13611f5.b(xyz.n.a.j2.DEVICE_BLOCKED_BY_FEATURE_TOGGLE);
        } else if (!togglesStatus) {
            c13611f5.b(xyz.n.a.j2.DEVICE_FEATURE_TOGGLE_CHECK_SUCCESSFULLY);
            RequestType requestType2 = RequestType.GET_CAMPAIGNS;
            this.f4826q = 2;
            if (u32.a(requestType2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.G0.f406611a;
    }
}
