package com.avito.android.messenger.channels.mvi.list_feature;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ChannelsListActorSubscriptions.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LHY/a;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$subscribeToInterlocutorIdsForLastActivityPolling$5", f = "ChannelsListActorSubscriptions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class C0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super HY.a>, Throwable, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ W f187698q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(W w12, Continuation<? super C0> continuation) {
        super(3, continuation);
        this.f187698q = w12;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super HY.a> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
        return new C0(this.f187698q, continuation).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        W w12 = this.f187698q;
        w12.f187867d.u8(w12.f187878o, kotlin.collections.B0.f406639b);
        return kotlin.G0.f406611a;
    }
}
