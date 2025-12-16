package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MessageListActorSubscriptions.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LNY/l;", "<name for destructuring parameter 0>", "Lkotlinx/coroutines/flow/i;", "LMY/l;", "<anonymous>", "(LNY/l;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$subscribeToMessageUpdates$7", f = "MessageListActorSubscriptions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class s0 extends SuspendLambda implements Y41.p<NY.l, Continuation<? super InterfaceC43160i<? extends MY.l>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f190079q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ G0 f190080r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f190081s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f190082t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(G0 g02, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, Continuation<? super s0> continuation) {
        super(2, continuation);
        this.f190080r = g02;
        this.f190081s = atomicBoolean;
        this.f190082t = atomicInteger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        s0 s0Var = new s0(this.f190080r, this.f190081s, this.f190082t, continuation);
        s0Var.f190079q = obj;
        return s0Var;
    }

    @Override // Y41.p
    public final Object invoke(NY.l lVar, Continuation<? super InterfaceC43160i<? extends MY.l>> continuation) {
        return ((s0) create(lVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
