package com.avito.android.certificate_pinning.mvi;

import Y41.p;
import com.avito.android.certificate_pinning.mvi.entity.UnsafeNetworkInternalAction;
import com.avito.android.certificate_pinning.mvi.entity.UnsafeNetworkState;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UnsafeNetworkActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.certificate_pinning.mvi.UnsafeNetworkActor$process$2", f = "UnsafeNetworkActor.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 30}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super UnsafeNetworkInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f117800q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f117801r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UnsafeNetworkState f117802s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(UnsafeNetworkState unsafeNetworkState, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f117802s = unsafeNetworkState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f117802s, continuation);
        cVar.f117801r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UnsafeNetworkInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f117800q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f117801r;
            UnsafeNetworkState unsafeNetworkState = this.f117802s;
            String str = unsafeNetworkState.f117816b;
            if (str == null || str.length() == 0) {
                UnsafeNetworkInternalAction.Idle idle = UnsafeNetworkInternalAction.Idle.f117806b;
                this.f117800q = 2;
                if (interfaceC43172j.emit(idle, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                UnsafeNetworkInternalAction.ProcessAuthorization processAuthorization = new UnsafeNetworkInternalAction.ProcessAuthorization(unsafeNetworkState.f117816b);
                this.f117800q = 1;
                if (interfaceC43172j.emit(processAuthorization, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
