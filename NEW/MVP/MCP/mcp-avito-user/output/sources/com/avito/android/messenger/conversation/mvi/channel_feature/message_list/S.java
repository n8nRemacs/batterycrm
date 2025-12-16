package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import com.avito.android.util.X2;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MessageListActorSubscriptions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMY/a;", "action", "Lkotlin/G0;", "<anonymous>", "(LMY/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$subscribe$1", f = "MessageListActorSubscriptions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class S extends SuspendLambda implements Y41.p<MY.a, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f189883q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ G0 f189884r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(G0 g02, Continuation<? super S> continuation) {
        super(2, continuation);
        this.f189884r = g02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        S s5 = new S(this.f189884r, continuation);
        s5.f189883q = obj;
        return s5;
    }

    @Override // Y41.p
    public final Object invoke(MY.a aVar, Continuation<? super kotlin.G0> continuation) {
        return ((S) create(aVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        MY.a aVar = (MY.a) this.f189883q;
        X2.f318778a.c(this.f189884r.f189794t, aVar + " emmited from subscription", null);
        return kotlin.G0.f406611a;
    }
}
