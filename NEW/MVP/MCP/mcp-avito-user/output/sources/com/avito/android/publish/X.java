package com.avito.android.publish;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;

/* compiled from: PublishActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.PublishActivity$observeRoutingActions$1$2", f = "PublishActivity.kt", i = {}, l = {530}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class X extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f232101q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PublishActivity f232102r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(PublishActivity publishActivity, Continuation<? super X> continuation) {
        super(2, continuation);
        this.f232102r = publishActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new X(this.f232102r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((X) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        com.avito.android.progress_overlay.l lVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f232101q;
        PublishActivity publishActivity = this.f232102r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.progress_overlay.l lVar2 = publishActivity.f231974F;
                if (lVar2 != null) {
                    lVar2.k(null);
                }
                publishActivity.c2();
                this.f232101q = 1;
                if (C43131e0.b(300L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            if (lVar != null) {
                lVar.j();
            }
            return kotlin.G0.f406611a;
        } finally {
            lVar = publishActivity.f231974F;
            if (lVar != null) {
                lVar.j();
            }
        }
    }
}
