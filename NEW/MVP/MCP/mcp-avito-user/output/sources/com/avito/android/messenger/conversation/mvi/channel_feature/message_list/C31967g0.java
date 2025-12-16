package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import MY.d;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: Emitters.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$subscribeToMessageListInteractorStateUpdates$$inlined$transform$2", f = "MessageListActorSubscriptions.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.g0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31967g0 extends SuspendLambda implements Y41.p<InterfaceC43172j<? super d.l>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f189971q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f189972r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f189973s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ G0 f189974t;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.g0$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<d.l> f189975b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ G0 f189976c;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$subscribeToMessageListInteractorStateUpdates$$inlined$transform$2$1", f = "MessageListActorSubscriptions.kt", i = {}, l = {221}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.g0$a$a, reason: collision with other inner class name */
        public static final class C5615a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f189977q;

            /* renamed from: r, reason: collision with root package name */
            public int f189978r;

            public C5615a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f189977q = obj;
                this.f189978r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, G0 g02) {
            this.f189976c = g02;
            this.f189975b = interfaceC43172j;
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
                boolean r0 = r7 instanceof com.avito.android.messenger.conversation.mvi.channel_feature.message_list.C31967g0.a.C5615a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.messenger.conversation.mvi.channel_feature.message_list.g0$a$a r0 = (com.avito.android.messenger.conversation.mvi.channel_feature.message_list.C31967g0.a.C5615a) r0
                int r1 = r0.f189978r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f189978r = r1
                goto L18
            L13:
                com.avito.android.messenger.conversation.mvi.channel_feature.message_list.g0$a$a r0 = new com.avito.android.messenger.conversation.mvi.channel_feature.message_list.g0$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f189977q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f189978r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r7)
                goto L54
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C42729a0.b(r7)
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                com.avito.android.messenger.conversation.mvi.channel_feature.message_list.G0 r7 = r5.f189976c
                com.avito.android.util.a1 r7 = r7.f189779e
                java.lang.Throwable r6 = com.avito.android.messenger.util.q.a(r6)
                r2 = 6
                r4 = 0
                com.avito.android.printable_text.PrintableText r6 = com.avito.android.util.InterfaceC35741a1.a.a(r7, r6, r4, r4, r2)
                MY.d$l r7 = new MY.d$l
                r7.<init>(r6)
                r0.f189978r = r3
                kotlinx.coroutines.flow.j<MY.d$l> r6 = r5.f189975b
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L54
                return r1
            L54:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.C31967g0.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31967g0(InterfaceC43160i interfaceC43160i, Continuation continuation, G0 g02) {
        super(2, continuation);
        this.f189973s = interfaceC43160i;
        this.f189974t = g02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31967g0 c31967g0 = new C31967g0(this.f189973s, continuation, this.f189974t);
        c31967g0.f189972r = obj;
        return c31967g0;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super d.l> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C31967g0) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f189971q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f189972r, this.f189974t);
            this.f189971q = 1;
            if (((AbstractC43168f) this.f189973s).collect(aVar, this) == coroutine_suspended) {
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
