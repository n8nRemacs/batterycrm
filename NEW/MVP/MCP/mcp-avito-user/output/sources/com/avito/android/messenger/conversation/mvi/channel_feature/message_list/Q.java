package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: MessageListActorSubscriptions.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LMY/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$observeEmptyChatStateAndMarkItAsRead$1", f = "MessageListActorSubscriptions.kt", i = {}, l = {440, 450}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class Q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MY.a>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public G0 f189877q;

    /* renamed from: r, reason: collision with root package name */
    public int f189878r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n2<NY.h> f189879s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ G0 f189880t;

    /* compiled from: MessageListActorSubscriptions.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LNY/h;", "it", "", "<anonymous>", "(LNY/h;)Z"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$observeEmptyChatStateAndMarkItAsRead$1$1$currentUserInfo$1", f = "MessageListActorSubscriptions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<NY.h, Continuation<? super Boolean>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f189881q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ G0 f189882r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(G0 g02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f189882r = g02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f189882r, continuation);
            aVar.f189881q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(NY.h hVar, Continuation<? super Boolean> continuation) {
            return ((a) create(hVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r3) {
            /*
                r2 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                kotlin.C42729a0.b(r3)
                java.lang.Object r3 = r2.f189881q
                NY.h r3 = (NY.h) r3
                com.avito.android.messenger.conversation.mvi.channel_feature.message_list.G0 r0 = r2.f189882r
                r0.getClass()
                NY.f$a r0 = r3.f11577b
                boolean r1 = r0 instanceof NY.f.a.b
                if (r1 == 0) goto L38
                NY.f$b$b r3 = r3.f11579d
                boolean r3 = r3 instanceof NY.f.b.AbstractC0740b.a
                if (r3 == 0) goto L38
                boolean r3 = r0 instanceof NY.b
                r1 = 0
                if (r3 != 0) goto L21
                r0 = r1
            L21:
                NY.b r0 = (NY.b) r0
                if (r0 == 0) goto L2d
                ru.avito.messenger.MessengerUserHashInfo r3 = r0.getF11554a()
                if (r3 == 0) goto L2d
                java.lang.String r1 = r3.f430682d
            L2d:
                if (r1 == 0) goto L38
                boolean r3 = kotlin.text.C43066x.K(r1)
                if (r3 == 0) goto L36
                goto L38
            L36:
                r3 = 1
                goto L39
            L38:
                r3 = 0
            L39:
                java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.Q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(n2<NY.h> n2Var, G0 g02, Continuation<? super Q> continuation) {
        super(2, continuation);
        this.f189879s = n2Var;
        this.f189880t = g02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new Q(this.f189879s, this.f189880t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MY.a> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((Q) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f189878r
            com.avito.android.messenger.conversation.mvi.channel_feature.message_list.G0 r2 = r6.f189880t
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L27
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            com.avito.android.messenger.conversation.mvi.channel_feature.message_list.G0 r0 = r6.f189877q
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L17
            goto L64
        L17:
            r7 = move-exception
            goto L7a
        L19:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L21:
            com.avito.android.messenger.conversation.mvi.channel_feature.message_list.G0 r1 = r6.f189877q
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L17
            goto L3d
        L27:
            kotlin.C42729a0.b(r7)
            kotlinx.coroutines.flow.n2<NY.h> r7 = r6.f189879s
            com.avito.android.messenger.conversation.mvi.channel_feature.message_list.Q$a r1 = new com.avito.android.messenger.conversation.mvi.channel_feature.message_list.Q$a     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L17
            r6.f189877q = r2     // Catch: java.lang.Throwable -> L17
            r6.f189878r = r4     // Catch: java.lang.Throwable -> L17
            java.lang.Object r7 = kotlinx.coroutines.flow.C43175k.x(r7, r1, r6)     // Catch: java.lang.Throwable -> L17
            if (r7 != r0) goto L3c
            return r0
        L3c:
            r1 = r2
        L3d:
            NY.h r7 = (NY.h) r7     // Catch: java.lang.Throwable -> L17
            NY.f$a r7 = r7.f11577b     // Catch: java.lang.Throwable -> L17
            boolean r4 = r7 instanceof NY.b     // Catch: java.lang.Throwable -> L17
            if (r4 != 0) goto L46
            r7 = r5
        L46:
            NY.b r7 = (NY.b) r7     // Catch: java.lang.Throwable -> L17
            if (r7 == 0) goto L4e
            ru.avito.messenger.MessengerUserHashInfo r5 = r7.getF11554a()     // Catch: java.lang.Throwable -> L17
        L4e:
            if (r5 == 0) goto L72
            com.avito.android.messenger.channels.mvi.sync.E0 r7 = r1.f189790p     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = r1.f189775a     // Catch: java.lang.Throwable -> L17
            io.reactivex.rxjava3.core.a r7 = r7.c(r4, r5)     // Catch: java.lang.Throwable -> L17
            r6.f189877q = r1     // Catch: java.lang.Throwable -> L17
            r6.f189878r = r3     // Catch: java.lang.Throwable -> L17
            java.lang.Object r7 = kotlinx.coroutines.rx3.C43292o.a(r7, r6)     // Catch: java.lang.Throwable -> L17
            if (r7 != r0) goto L63
            return r0
        L63:
            r0 = r1
        L64:
            com.avito.android.analytics.a r7 = r0.f189780f     // Catch: java.lang.Throwable -> L17
            com.avito.android.messenger.analytics.MessengerMarkChatAsReadEvent r1 = new com.avito.android.messenger.analytics.MessengerMarkChatAsReadEvent     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = r0.f189775a     // Catch: java.lang.Throwable -> L17
            com.avito.android.messenger.analytics.MessengerMarkChatAsReadEvent$Screen r3 = com.avito.android.messenger.analytics.MessengerMarkChatAsReadEvent.Screen.f186224c     // Catch: java.lang.Throwable -> L17
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L17
            r7.c(r1)     // Catch: java.lang.Throwable -> L17
        L72:
            kotlin.G0 r7 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L17
            com.avito.android.arch.mvi.utils.c$c r0 = new com.avito.android.arch.mvi.utils.c$c     // Catch: java.lang.Throwable -> L17
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L17
            goto L86
        L7a:
            kotlin.coroutines.CoroutineContext r0 = r6.getF411447c()
            kotlinx.coroutines.Q0.e(r0)
            com.avito.android.arch.mvi.utils.c$b r0 = new com.avito.android.arch.mvi.utils.c$b
            r0.<init>(r7)
        L86:
            boolean r7 = r0 instanceof com.avito.android.arch.mvi.utils.c.C2712c
            if (r7 == 0) goto L8b
            goto L9e
        L8b:
            boolean r7 = r0 instanceof com.avito.android.arch.mvi.utils.c.b
            if (r7 == 0) goto La1
            com.avito.android.arch.mvi.utils.c$b r0 = (com.avito.android.arch.mvi.utils.c.b) r0
            A r7 = r0.f92027b
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            com.avito.android.util.X2 r0 = com.avito.android.util.X2.f318778a
            java.lang.String r1 = r2.f189794t
            java.lang.String r2 = "Error. Couldn't mark empty chat as read"
            r0.a(r1, r2, r7)
        L9e:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        La1:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.Q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
