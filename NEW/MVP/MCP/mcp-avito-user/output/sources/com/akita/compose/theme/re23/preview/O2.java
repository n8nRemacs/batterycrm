package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;

/* compiled from: PullToRefreshPreview.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.akita.compose.theme.re23.preview.PullToRefreshPreviewKt$PullToRefreshPreviewImpl$onRefresh$1$1", f = "PullToRefreshPreview.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class O2 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f65456q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f65457r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O2(InterfaceC22204y1<Boolean> interfaceC22204y1, Continuation<? super O2> continuation) {
        super(2, continuation);
        this.f65457r = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new O2(this.f65457r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((O2) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f65456q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f65456q = 1;
            if (C43131e0.b(1500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        this.f65457r.setValue(Boolean.FALSE);
        return kotlin.G0.f406611a;
    }
}
