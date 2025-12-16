package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43194q0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$subscribeToMessageListInteractorStateUpdates$$inlined$transform$1", f = "MessageListActorSubscriptions.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.f0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31965f0 extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MY.l>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f189960q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f189961r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C43194q0 f189962s;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.f0$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<MY.l> f189963b;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$subscribeToMessageListInteractorStateUpdates$$inlined$transform$1$1", f = "MessageListActorSubscriptions.kt", i = {}, l = {220, 221, 222}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.f0$a$a, reason: collision with other inner class name */
        public static final class C5614a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f189964q;

            /* renamed from: r, reason: collision with root package name */
            public int f189965r;

            public C5614a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f189964q = obj;
                this.f189965r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f189963b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.avito.android.messenger.conversation.mvi.channel_feature.message_list.C31965f0.a.C5614a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.messenger.conversation.mvi.channel_feature.message_list.f0$a$a r0 = (com.avito.android.messenger.conversation.mvi.channel_feature.message_list.C31965f0.a.C5614a) r0
                int r1 = r0.f189965r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f189965r = r1
                goto L18
            L13:
                com.avito.android.messenger.conversation.mvi.channel_feature.message_list.f0$a$a r0 = new com.avito.android.messenger.conversation.mvi.channel_feature.message_list.f0$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f189964q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f189965r
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L38
                if (r2 == r5) goto L34
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                goto L34
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                kotlin.C42729a0.b(r8)
                goto L72
            L38:
                kotlin.C42729a0.b(r8)
                com.avito.android.messenger.conversation.mvi.messages.a$c r7 = (com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a.c) r7
                boolean r8 = r7 instanceof com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a.c.C5679a
                kotlinx.coroutines.flow.j<MY.l> r2 = r6.f189963b
                if (r8 == 0) goto L4e
                MY.l$f r7 = MY.l.f.f10802a
                r0.f189965r = r5
                java.lang.Object r7 = r2.emit(r7, r0)
                if (r7 != r1) goto L72
                return r1
            L4e:
                boolean r8 = r7 instanceof com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a.c.b
                if (r8 == 0) goto L5d
                MY.l$h r7 = MY.l.h.f10805a
                r0.f189965r = r4
                java.lang.Object r7 = r2.emit(r7, r0)
                if (r7 != r1) goto L72
                return r1
            L5d:
                boolean r8 = r7 instanceof com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a.c.d
                if (r8 == 0) goto L70
                MY.l$i r7 = new MY.l$i
                r8 = 0
                r7.<init>(r8)
                r0.f189965r = r3
                java.lang.Object r7 = r2.emit(r7, r0)
                if (r7 != r1) goto L72
                return r1
            L70:
                boolean r7 = r7 instanceof com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a.c.C5680c
            L72:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.C31965f0.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31965f0(C43194q0 c43194q0, Continuation continuation) {
        super(2, continuation);
        this.f189962s = c43194q0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31965f0 c31965f0 = new C31965f0(this.f189962s, continuation);
        c31965f0.f189961r = obj;
        return c31965f0;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MY.l> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C31965f0) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f189960q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f189961r);
            this.f189960q = 1;
            if (this.f189962s.collect(aVar, this) == coroutine_suspended) {
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
