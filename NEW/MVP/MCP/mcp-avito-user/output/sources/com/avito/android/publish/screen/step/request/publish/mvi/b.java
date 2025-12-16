package com.avito.android.publish.screen.step.request.publish.mvi;

import com.avito.android.remote.model.PretendResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: PublishRequestActor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Z"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.request.publish.mvi.PublishRequestActor$handlePretendError$errorIsShown$1", f = "PublishRequestActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements Y41.p<T, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j f241897q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PretendResult f241898r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, PretendResult pretendResult, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f241897q = jVar;
        this.f241898r = pretendResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f241897q, this.f241898r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Boolean> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return Boxing.boxBoolean(this.f241897q.f241921a.ze(this.f241898r.getErrors()));
    }
}
