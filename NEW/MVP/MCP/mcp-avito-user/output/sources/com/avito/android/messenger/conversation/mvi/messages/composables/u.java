package com.avito.android.messenger.conversation.mvi.messages.composables;

import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.messenger.conversation.mvi.messages.MessageListScrollEvent;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43189o1;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ScrollEventsHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u {

    /* compiled from: ScrollEventsHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.composables.ScrollEventsHandlerKt$ScrollEventsHandler$1", f = "ScrollEventsHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f192858q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<MessageListScrollEvent> f192859r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<MessageListScrollEvent.a> f192860s;

        /* compiled from: ScrollEventsHandler.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/MessageListScrollEvent;", "event", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/messenger/conversation/mvi/messages/MessageListScrollEvent;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.composables.ScrollEventsHandlerKt$ScrollEventsHandler$1$1", f = "ScrollEventsHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.composables.u$a$a, reason: collision with other inner class name */
        public static final class C5698a extends SuspendLambda implements Y41.p<MessageListScrollEvent, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f192861q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1<MessageListScrollEvent.a> f192862r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5698a(InterfaceC22204y1<MessageListScrollEvent.a> interfaceC22204y1, Continuation<? super C5698a> continuation) {
                super(2, continuation);
                this.f192862r = interfaceC22204y1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C5698a c5698a = new C5698a(this.f192862r, continuation);
                c5698a.f192861q = obj;
                return c5698a;
            }

            @Override // Y41.p
            public final Object invoke(MessageListScrollEvent messageListScrollEvent, Continuation<? super G0> continuation) {
                return ((C5698a) create(messageListScrollEvent, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                MessageListScrollEvent messageListScrollEvent = (MessageListScrollEvent) this.f192861q;
                if (messageListScrollEvent instanceof MessageListScrollEvent.a) {
                    this.f192862r.setValue(messageListScrollEvent);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43160i<? extends MessageListScrollEvent> interfaceC43160i, InterfaceC22204y1<MessageListScrollEvent.a> interfaceC22204y1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f192859r = interfaceC43160i;
            this.f192860s = interfaceC22204y1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f192859r, this.f192860s, continuation);
            aVar.f192858q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C43175k.K(new C43197r1(new C5698a(this.f192860s, null), this.f192859r), (T) this.f192858q);
            return G0.f406611a;
        }
    }

    /* compiled from: ScrollEventsHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.composables.ScrollEventsHandlerKt$ScrollEventsHandler$2$1", f = "ScrollEventsHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f192863q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<MessageListScrollEvent.a> f192864r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ w0 f192865s;

        /* compiled from: ScrollEventsHandler.kt */
        @s0
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/MessageListScrollEvent$a;", "invoke", "()Lcom/avito/android/messenger/conversation/mvi/messages/MessageListScrollEvent$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.a<MessageListScrollEvent.a> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1<MessageListScrollEvent.a> f192866l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ w0 f192867m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC22204y1<MessageListScrollEvent.a> interfaceC22204y1, w0 w0Var) {
                super(0);
                this.f192866l = interfaceC22204y1;
                this.f192867m = w0Var;
            }

            @Override // Y41.a
            public final MessageListScrollEvent.a invoke() {
                MessageListScrollEvent.a f42167b = this.f192866l.getF42167b();
                if (f42167b != null) {
                    if (f42167b.f192087a < this.f192867m.j().getF28948n()) {
                        return f42167b;
                    }
                }
                return null;
            }
        }

        /* compiled from: ScrollEventsHandler.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/MessageListScrollEvent$a;", "event", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/messenger/conversation/mvi/messages/MessageListScrollEvent$a;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.composables.ScrollEventsHandlerKt$ScrollEventsHandler$2$1$2", f = "ScrollEventsHandler.kt", i = {}, l = {43, 44}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.composables.u$b$b, reason: collision with other inner class name */
        public static final class C5699b extends SuspendLambda implements Y41.p<MessageListScrollEvent.a, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f192868q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f192869r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ w0 f192870s;

            /* compiled from: ScrollEventsHandler.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.conversation.mvi.messages.composables.u$b$b$a */
            public /* synthetic */ class a {
                static {
                    int[] iArr = new int[MessageListScrollEvent.ScrollAlignment.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        MessageListScrollEvent.ScrollAlignment scrollAlignment = MessageListScrollEvent.ScrollAlignment.f192083b;
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5699b(w0 w0Var, Continuation<? super C5699b> continuation) {
                super(2, continuation);
                this.f192870s = w0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C5699b c5699b = new C5699b(this.f192870s, continuation);
                c5699b.f192869r = obj;
                return c5699b;
            }

            @Override // Y41.p
            public final Object invoke(MessageListScrollEvent.a aVar, Continuation<? super G0> continuation) {
                return ((C5699b) create(aVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f192868q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    MessageListScrollEvent.a aVar = (MessageListScrollEvent.a) this.f192869r;
                    int iOrdinal = aVar.f192088b.ordinal();
                    w0 w0Var = this.f192870s;
                    int i13 = aVar.f192087a;
                    if (iOrdinal == 0) {
                        this.f192868q = 1;
                        if (u.c(w0Var, i13, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (iOrdinal == 1) {
                        this.f192868q = 2;
                        if (u.b(w0Var, i13, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w0 w0Var, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
            super(2, continuation);
            this.f192864r = interfaceC22204y1;
            this.f192865s = w0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f192865s, this.f192864r, continuation);
            bVar.f192863q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f192863q;
            InterfaceC22204y1<MessageListScrollEvent.a> interfaceC22204y1 = this.f192864r;
            w0 w0Var = this.f192865s;
            C43175k.K(new C43197r1(new C5699b(w0Var, null), new C43189o1(C22126m3.n(new a(interfaceC22204y1, w0Var)))), t12);
            return G0.f406611a;
        }
    }

    /* compiled from: ScrollEventsHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ w0 f192871l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<MessageListScrollEvent> f192872m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(w0 w0Var, InterfaceC43160i<? extends MessageListScrollEvent> interfaceC43160i, int i12) {
            super(2);
            this.f192871l = w0Var;
            this.f192872m = interfaceC43160i;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(65);
            u.a(this.f192871l, this.f192872m, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    public static final void a(@Y61.k w0 w0Var, @Y61.k InterfaceC43160i<? extends MessageListScrollEvent> interfaceC43160i, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-1421061636);
        bE2.C(897889436);
        Object objT = bE2.t();
        A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = C22126m3.g(null);
            bE2.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        bE2.X(false);
        C22187u0.d(new a(interfaceC43160i, interfaceC22204y1, null), bE2, G0.f406611a);
        T f42167b = interfaceC22204y1.getF42167b();
        bE2.C(897900619);
        boolean zB2 = bE2.B(w0Var);
        Object objT2 = bE2.t();
        if (zB2 || objT2 == c1651a) {
            objT2 = new b(w0Var, interfaceC22204y1, null);
            bE2.H(objT2);
        }
        bE2.X(false);
        C22187u0.d((Y41.p) objT2, bE2, f42167b);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(w0Var, interfaceC43160i, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@Y61.k androidx.compose.foundation.lazy.w0 r11, int r12, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.composables.u.b(androidx.compose.foundation.lazy.w0, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@Y61.k androidx.compose.foundation.lazy.w0 r9, int r10, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            boolean r0 = r11 instanceof com.avito.android.messenger.conversation.mvi.messages.composables.w
            if (r0 == 0) goto L13
            r0 = r11
            com.avito.android.messenger.conversation.mvi.messages.composables.w r0 = (com.avito.android.messenger.conversation.mvi.messages.composables.w) r0
            int r1 = r0.f192880t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f192880t = r1
            goto L18
        L13:
            com.avito.android.messenger.conversation.mvi.messages.composables.w r0 = new com.avito.android.messenger.conversation.mvi.messages.composables.w
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f192879s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f192880t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.C42729a0.b(r11)
            goto La1
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            int r10 = r0.f192878r
            androidx.compose.foundation.lazy.w0 r9 = r0.f192877q
            kotlin.C42729a0.b(r11)
            goto L50
        L3d:
            kotlin.C42729a0.b(r11)
            r0.f192877q = r9
            r0.f192878r = r10
            r0.f192880t = r4
            androidx.compose.foundation.lazy.w0$c r11 = androidx.compose.foundation.lazy.w0.f29712w
            r11 = 0
            java.lang.Object r11 = r9.k(r10, r11, r0)
            if (r11 != r1) goto L50
            return r1
        L50:
            androidx.compose.foundation.lazy.Y r11 = r9.j()
            java.util.List r11 = r11.h()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L5e:
            boolean r2 = r11.hasNext()
            r4 = 0
            if (r2 == 0) goto L73
            java.lang.Object r2 = r11.next()
            r5 = r2
            androidx.compose.foundation.lazy.K r5 = (androidx.compose.foundation.lazy.K) r5
            int r5 = r5.getF29645a()
            if (r5 != r10) goto L5e
            goto L74
        L73:
            r2 = r4
        L74:
            androidx.compose.foundation.lazy.K r2 = (androidx.compose.foundation.lazy.K) r2
            if (r2 != 0) goto L7b
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        L7b:
            int r11 = r2.getF28969q()
            androidx.compose.foundation.lazy.Y r2 = r9.j()
            long r5 = r2.c()
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            int r2 = (int) r5
            int r11 = r11 - r2
            r2 = 70
            int r2 = com.avito.android.util.y6.b(r2)
            int r2 = r2 + r11
            r0.f192877q = r4
            r0.f192880t = r3
            java.lang.Object r9 = r9.k(r10, r2, r0)
            if (r9 != r1) goto La1
            return r1
        La1:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.composables.u.c(androidx.compose.foundation.lazy.w0, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(androidx.compose.foundation.lazy.w0 r10, int r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            boolean r0 = r12 instanceof com.avito.android.messenger.conversation.mvi.messages.composables.x
            if (r0 == 0) goto L13
            r0 = r12
            com.avito.android.messenger.conversation.mvi.messages.composables.x r0 = (com.avito.android.messenger.conversation.mvi.messages.composables.x) r0
            int r1 = r0.f192882r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f192882r = r1
            goto L18
        L13:
            com.avito.android.messenger.conversation.mvi.messages.composables.x r0 = new com.avito.android.messenger.conversation.mvi.messages.composables.x
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f192881q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f192882r
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.C42729a0.b(r12)
            goto Lab
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            kotlin.C42729a0.b(r12)
            androidx.compose.foundation.lazy.Y r12 = r10.j()
            java.util.List r12 = r12.h()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L43:
            boolean r2 = r12.hasNext()
            r4 = 0
            if (r2 == 0) goto L58
            java.lang.Object r2 = r12.next()
            r5 = r2
            androidx.compose.foundation.lazy.K r5 = (androidx.compose.foundation.lazy.K) r5
            int r5 = r5.getF29645a()
            if (r5 != r11) goto L43
            goto L59
        L58:
            r2 = r4
        L59:
            androidx.compose.foundation.lazy.K r2 = (androidx.compose.foundation.lazy.K) r2
            r12 = 0
            if (r2 != 0) goto L63
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r12)
            return r10
        L63:
            androidx.compose.foundation.lazy.Y r5 = r10.j()
            long r6 = r5.c()
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            int r6 = (int) r6
            int r7 = r5.d()
            int r6 = r6 - r7
            int r5 = r5.getF28951q()
            int r6 = r6 - r5
            int r5 = r2.getF28969q()
            if (r5 < r6) goto L8e
            int r2 = r2.getF28968p()
            if (r2 != 0) goto L89
            goto L9c
        L89:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            goto L9c
        L8e:
            int r6 = r6 / 2
            int r12 = -r6
            int r2 = r2.getF28969q()
            int r2 = r2 / 2
            int r2 = r2 + r12
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
        L9c:
            if (r4 == 0) goto Lb0
            int r12 = r4.intValue()
            r0.f192882r = r3
            java.lang.Object r10 = r10.f(r11, r12, r0)
            if (r10 != r1) goto Lab
            return r1
        Lab:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r10
        Lb0:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.composables.u.d(androidx.compose.foundation.lazy.w0, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
