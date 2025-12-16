package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$subscribeToPaginationStateUpdates$$inlined$transform$1", f = "MessageListActorSubscriptions.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
public final class w0 extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MY.a>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f190114q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f190115r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f190116s;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<MY.a> f190117b;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$subscribeToPaginationStateUpdates$$inlined$transform$1$1", f = "MessageListActorSubscriptions.kt", i = {0, 0}, l = {220, JfifUtil.MARKER_APP1, 228, 232}, m = "emit", n = {"interactorState", "$this$subscribeToPaginationStateUpdates_u24lambda_u2429"}, s = {"L$0", "L$1"})
        /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.w0$a$a, reason: collision with other inner class name */
        public static final class C5624a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f190118q;

            /* renamed from: r, reason: collision with root package name */
            public int f190119r;

            /* renamed from: t, reason: collision with root package name */
            public InterfaceC32129a.c.C5680c f190121t;

            /* renamed from: u, reason: collision with root package name */
            public InterfaceC43172j f190122u;

            public C5624a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f190118q = obj;
                this.f190119r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f190117b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r11, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof com.avito.android.messenger.conversation.mvi.channel_feature.message_list.w0.a.C5624a
                if (r0 == 0) goto L13
                r0 = r12
                com.avito.android.messenger.conversation.mvi.channel_feature.message_list.w0$a$a r0 = (com.avito.android.messenger.conversation.mvi.channel_feature.message_list.w0.a.C5624a) r0
                int r1 = r0.f190119r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f190119r = r1
                goto L18
            L13:
                com.avito.android.messenger.conversation.mvi.channel_feature.message_list.w0$a$a r0 = new com.avito.android.messenger.conversation.mvi.channel_feature.message_list.w0$a$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f190118q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f190119r
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r2 == 0) goto L45
                if (r2 == r6) goto L3d
                if (r2 == r5) goto L38
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                goto L38
            L30:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L38:
                kotlin.C42729a0.b(r12)
                goto Lc0
            L3d:
                kotlinx.coroutines.flow.j r11 = r0.f190122u
                com.avito.android.messenger.conversation.mvi.messages.a$c$c r2 = r0.f190121t
                kotlin.C42729a0.b(r12)
                goto L79
            L45:
                kotlin.C42729a0.b(r12)
                r2 = r11
                com.avito.android.messenger.conversation.mvi.messages.a$c$c r2 = (com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a.c.C5680c) r2
                com.avito.android.messenger.conversation.mvi.messages.a$b r11 = r2.f192128b
                java.lang.Boolean r11 = r11.getF192124b()
                java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
                boolean r11 = kotlin.jvm.internal.L.f(r11, r12)
                kotlinx.coroutines.flow.j<MY.a> r12 = r10.f190117b
                if (r11 == 0) goto L7a
                MY.d$l r11 = new MY.d$l
                r8 = 2131955181(0x7f130ded, float:1.9546882E38)
                java.io.Serializable[] r9 = new java.io.Serializable[r7]
                com.avito.android.printable_text.PrintableText r8 = com.avito.android.printable_text.b.c(r8, r9)
                r11.<init>(r8)
                r0.f190121t = r2
                r0.f190122u = r12
                r0.f190119r = r6
                java.lang.Object r11 = r12.emit(r11, r0)
                if (r11 != r1) goto L78
                return r1
            L78:
                r11 = r12
            L79:
                r12 = r11
            L7a:
                com.avito.android.messenger.conversation.mvi.messages.a$b r11 = r2.f192128b
                boolean r2 = r11 instanceof com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a.b.C5678b
                r6 = 0
                if (r2 == 0) goto L93
                MY.l$k r11 = new MY.l$k
                r11.<init>(r7)
                r0.f190121t = r6
                r0.f190122u = r6
                r0.f190119r = r5
                java.lang.Object r11 = r12.emit(r11, r0)
                if (r11 != r1) goto Lc0
                return r1
            L93:
                boolean r2 = r11 instanceof com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a.b.C5677a
                if (r2 == 0) goto La6
                MY.l$j r11 = MY.l.j.f10807a
                r0.f190121t = r6
                r0.f190122u = r6
                r0.f190119r = r4
                java.lang.Object r11 = r12.emit(r11, r0)
                if (r11 != r1) goto Lc0
                return r1
            La6:
                boolean r2 = r11 instanceof com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a.b.c
                if (r2 == 0) goto Lc0
                MY.l$l r2 = new MY.l$l
                com.avito.android.messenger.conversation.mvi.messages.a$b$c r11 = (com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a.b.c) r11
                boolean r11 = r11.f192123a
                r2.<init>(r11)
                r0.f190121t = r6
                r0.f190122u = r6
                r0.f190119r = r3
                java.lang.Object r11 = r12.emit(r2, r0)
                if (r11 != r1) goto Lc0
                return r1
            Lc0:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.w0.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(InterfaceC43160i interfaceC43160i, Continuation continuation) {
        super(2, continuation);
        this.f190116s = interfaceC43160i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        w0 w0Var = new w0(this.f190116s, continuation);
        w0Var.f190115r = obj;
        return w0Var;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MY.a> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((w0) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f190114q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f190115r);
            this.f190114q = 1;
            if (this.f190116s.collect(aVar, this) == coroutine_suspended) {
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
