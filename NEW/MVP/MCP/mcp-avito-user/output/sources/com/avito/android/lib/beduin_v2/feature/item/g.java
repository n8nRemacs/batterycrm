package com.avito.android.lib.beduin_v2.feature.item;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.x;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.AbstractC40048c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: BeduinItemViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.item.BeduinItemViewModel$accept$1", f = "BeduinItemViewModel.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f176188q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f176189r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40047a f176190s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, InterfaceC40047a interfaceC40047a, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f176189r = hVar;
        this.f176190s = interfaceC40047a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new g(this.f176189r, this.f176190s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f176188q;
        if (i12 == 0) {
            C42729a0.b(obj);
            x<InterfaceC40047a, AbstractC40048c, BeduinOneTimeEvent> xVar = this.f176189r.f176192c;
            this.f176188q = 1;
            if (xVar.ya(this.f176190s, this) == coroutine_suspended) {
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
