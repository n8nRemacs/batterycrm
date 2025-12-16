package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import MY.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MessageListActorSubscriptions.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LMY/d$k;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$subscribeToGetOnboardingLink$1", f = "MessageListActorSubscriptions.kt", i = {0}, l = {153, 159}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.b0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31957b0 extends SuspendLambda implements Y41.p<InterfaceC43172j<? super d.k>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public G0 f189926q;

    /* renamed from: r, reason: collision with root package name */
    public int f189927r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f189928s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ G0 f189929t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31957b0(G0 g02, Continuation<? super C31957b0> continuation) {
        super(2, continuation);
        this.f189929t = g02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31957b0 c31957b0 = new C31957b0(this.f189929t, continuation);
        c31957b0.f189928s = obj;
        return c31957b0;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super d.k> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C31957b0) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.C31957b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
