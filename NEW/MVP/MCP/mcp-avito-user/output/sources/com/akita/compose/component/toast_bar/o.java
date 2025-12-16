package com.akita.compose.component.toast_bar;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;

/* compiled from: ToastBarHost.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.akita.compose.component.toast_bar.ToastBarHostKt$ToastBarHost$1$1", f = "ToastBarHost.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class o extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f63266q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC27357f f63267r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(InterfaceC27357f interfaceC27357f, Continuation<? super o> continuation) {
        super(2, continuation);
        this.f63267r = interfaceC27357f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new o(this.f63267r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((o) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        long j12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f63266q;
        InterfaceC27357f interfaceC27357f = this.f63267r;
        if (i12 == 0) {
            C42729a0.b(obj);
            if (interfaceC27357f != null) {
                ToastBarDuration f167348c = interfaceC27357f.getF167348c();
                float f12 = q.f63273a;
                int iOrdinal = f167348c.ordinal();
                if (iOrdinal == 0) {
                    j12 = 1500;
                } else if (iOrdinal == 1) {
                    j12 = 2750;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j12 = Long.MAX_VALUE;
                }
                this.f63266q = 1;
                if (C43131e0.b(j12, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        interfaceC27357f.dismiss();
        return G0.f406611a;
    }
}
