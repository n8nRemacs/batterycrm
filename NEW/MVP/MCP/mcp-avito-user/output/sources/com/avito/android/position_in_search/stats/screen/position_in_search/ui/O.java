package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import androidx.compose.runtime.InterfaceC22192v1;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;

/* compiled from: PositionInSearchQueryItems.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.position_in_search.ui.PositionInSearchQueryItemsKt$PositionInSearchQueryItems$1$2$1$1", f = "PositionInSearchQueryItems.kt", i = {}, l = {103, 105}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class O extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f221602q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.tooltip.t f221603r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f221604s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(com.akita.compose.component.tooltip.t tVar, InterfaceC22192v1 interfaceC22192v1, Continuation<? super O> continuation) {
        super(2, continuation);
        this.f221603r = tVar;
        this.f221604s = interfaceC22192v1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new O(this.f221603r, this.f221604s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((O) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f221602q;
        InterfaceC22192v1 interfaceC22192v1 = this.f221604s;
        com.akita.compose.component.tooltip.t tVar = this.f221603r;
        if (i12 == 0) {
            C42729a0.b(obj);
            if (tVar.f63548a.isVisible()) {
                interfaceC22192v1.S6(1.0f);
                this.f221602q = 1;
                if (C43131e0.b(2700L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            tVar.dismiss();
            return G0.f406611a;
        }
        C42729a0.b(obj);
        interfaceC22192v1.S6(0.0f);
        this.f221602q = 2;
        if (C43131e0.b(300L, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        tVar.dismiss();
        return G0.f406611a;
    }
}
