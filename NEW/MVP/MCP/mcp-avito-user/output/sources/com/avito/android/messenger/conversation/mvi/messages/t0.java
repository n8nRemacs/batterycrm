package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.messenger.conversation.mvi.messages.MessageListScrollEvent;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e2;

/* compiled from: MessageListView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.MessageListViewImpl$scrollTo$1", f = "MessageListView.kt", i = {}, l = {412}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class t0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f193549q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q0 f193550r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f193551s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(q0 q0Var, int i12, Continuation<? super t0> continuation) {
        super(2, continuation);
        this.f193550r = q0Var;
        this.f193551s = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new t0(this.f193550r, this.f193551s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((t0) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f193549q;
        if (i12 == 0) {
            C42729a0.b(obj);
            e2 e2Var = this.f193550r.f193116n;
            MessageListScrollEvent.a aVar = new MessageListScrollEvent.a(this.f193551s, null, 2, null);
            this.f193549q = 1;
            if (e2Var.emit(aVar, this) == coroutine_suspended) {
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
