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

/* compiled from: PositionInSearchCurrentPosition.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.position_in_search.ui.PositionInSearchCurrentPositionKt$PositionInSearchCurrentPosition$1$1", f = "PositionInSearchCurrentPosition.kt", i = {}, l = {55, 57}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.ui.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C33286j extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f221691q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.tooltip.t f221692r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f221693s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33286j(com.akita.compose.component.tooltip.t tVar, InterfaceC22192v1 interfaceC22192v1, Continuation<? super C33286j> continuation) {
        super(2, continuation);
        this.f221692r = tVar;
        this.f221693s = interfaceC22192v1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C33286j(this.f221692r, this.f221693s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C33286j) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f221691q;
        InterfaceC22192v1 interfaceC22192v1 = this.f221693s;
        com.akita.compose.component.tooltip.t tVar = this.f221692r;
        if (i12 == 0) {
            C42729a0.b(obj);
            if (tVar.f63548a.isVisible()) {
                interfaceC22192v1.S6(1.0f);
                this.f221691q = 1;
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
        this.f221691q = 2;
        if (C43131e0.b(300L, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        tVar.dismiss();
        return G0.f406611a;
    }
}
