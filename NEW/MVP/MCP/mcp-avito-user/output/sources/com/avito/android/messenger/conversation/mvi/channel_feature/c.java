package com.avito.android.messenger.conversation.mvi.channel_feature;

import Y41.p;
import com.avito.android.util.X2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ChannelActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMY/a;", "action", "Lkotlin/G0;", "<anonymous>", "(LMY/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.ChannelActor$process$2", f = "ChannelActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements p<MY.a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f189699q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f189700r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f189700r = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f189700r, continuation);
        cVar.f189699q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(MY.a aVar, Continuation<? super G0> continuation) {
        return ((c) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        MY.a aVar = (MY.a) this.f189699q;
        if (aVar instanceof MY.f) {
            X2.f318778a.i(this.f189700r.f189692d, "privateAction > " + aVar, null);
        }
        return G0.f406611a;
    }
}
