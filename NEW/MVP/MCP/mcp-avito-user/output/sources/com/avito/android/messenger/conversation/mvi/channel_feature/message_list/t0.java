package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43202t0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$subscribeToOpenKeyboardUpdates$$inlined$transform$1", f = "MessageListActorSubscriptions.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
public final class t0 extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MY.a>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f190087q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f190088r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C43202t0 f190089s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ G0 f190090t;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<MY.a> f190091b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ G0 f190092c;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$subscribeToOpenKeyboardUpdates$$inlined$transform$1$1", f = "MessageListActorSubscriptions.kt", i = {}, l = {229}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.t0$a$a, reason: collision with other inner class name */
        public static final class C5622a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f190093q;

            /* renamed from: r, reason: collision with root package name */
            public int f190094r;

            public C5622a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f190093q = obj;
                this.f190094r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, G0 g02) {
            this.f190092c = g02;
            this.f190091b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.avito.android.messenger.conversation.mvi.channel_feature.message_list.t0.a.C5622a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.messenger.conversation.mvi.channel_feature.message_list.t0$a$a r0 = (com.avito.android.messenger.conversation.mvi.channel_feature.message_list.t0.a.C5622a) r0
                int r1 = r0.f190094r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f190094r = r1
                goto L18
            L13:
                com.avito.android.messenger.conversation.mvi.channel_feature.message_list.t0$a$a r0 = new com.avito.android.messenger.conversation.mvi.channel_feature.message_list.t0$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f190093q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f190094r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r7)
                goto L97
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                kotlin.C42729a0.b(r7)
                com.avito.android.messenger.conversation.mvi.context.a$a r6 = (com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a.C5631a) r6
                com.avito.android.mvi.b<com.avito.android.remote.model.messenger.Channel> r7 = r6.f190237b
                boolean r2 = r7 instanceof com.avito.android.mvi.b.d
                r4 = 0
                if (r2 == 0) goto L41
                com.avito.android.mvi.b$d r7 = (com.avito.android.mvi.b.d) r7
                goto L42
            L41:
                r7 = r4
            L42:
                if (r7 == 0) goto L46
                T r4 = r7.f207035a
            L46:
                com.avito.android.remote.model.messenger.Channel r4 = (com.avito.android.remote.model.messenger.Channel) r4
                if (r4 == 0) goto L97
                com.avito.android.remote.model.messenger.InputState r7 = r4.getInputState()
                if (r7 == 0) goto L57
                boolean r7 = r7.isDisabled()
                if (r7 != r3) goto L57
                goto L97
            L57:
                com.avito.android.remote.model.messenger.InputState r7 = r4.getInputState()
                if (r7 != 0) goto L64
                com.avito.android.remote.model.messenger.ReadOnlyState r7 = r4.getReadOnlyState()
                if (r7 == 0) goto L64
                goto L97
            L64:
                ru.avito.messenger.MessengerUserHashInfo r6 = r6.f190236a
                java.lang.String r6 = r6.f430682d
                boolean r6 = com.avito.android.remote.model.messenger.ChannelKt.hasItemContextAndUserIsSeller(r4, r6)
                if (r6 != 0) goto L97
                com.avito.android.remote.model.messenger.message.LocalMessage r6 = r4.getLastMessage()
                if (r6 != 0) goto L97
                com.avito.android.messenger.conversation.mvi.channel_feature.message_list.G0 r6 = r5.f190092c
                u3.l<com.avito.android.ab_tests.configs.MessengerEmptyBuyerChatKeyboardTestGroup> r7 = r6.f189793s
                r7.b()
                u3.l<com.avito.android.ab_tests.configs.MessengerEmptyBuyerChatKeyboardTestGroup> r6 = r6.f189793s
                u3.m<T> r6 = r6.f439745a
                T r6 = r6.f439749b
                com.avito.android.ab_tests.configs.MessengerEmptyBuyerChatKeyboardTestGroup r6 = (com.avito.android.ab_tests.configs.MessengerEmptyBuyerChatKeyboardTestGroup) r6
                r6.getClass()
                com.avito.android.ab_tests.configs.MessengerEmptyBuyerChatKeyboardTestGroup r7 = com.avito.android.ab_tests.configs.MessengerEmptyBuyerChatKeyboardTestGroup.f67872d
                if (r6 != r7) goto L97
                MY.d$i r6 = MY.d.i.f10732a
                r0.f190094r = r3
                kotlinx.coroutines.flow.j<MY.a> r7 = r5.f190091b
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L97
                return r1
            L97:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.t0.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(C43202t0 c43202t0, Continuation continuation, G0 g02) {
        super(2, continuation);
        this.f190089s = c43202t0;
        this.f190090t = g02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        t0 t0Var = new t0(this.f190089s, continuation, this.f190090t);
        t0Var.f190088r = obj;
        return t0Var;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MY.a> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((t0) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f190087q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f190088r, this.f190090t);
            this.f190087q = 1;
            if (this.f190089s.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
