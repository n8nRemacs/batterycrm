package com.avito.avcalls;

import Y41.l;
import Y41.p;
import androidx.media3.common.C23088b;
import com.avito.avcalls.a;
import com.avito.avcalls.call.C36199e;
import com.avito.avcalls.call.models.CallState;
import com.avito.avcalls.call.models.CameraPosition;
import com.avito.avcalls.call.models.CreateCallMetaInfo;
import com.avito.avcalls.call.models.MessageChannel;
import com.avito.avcalls.call.models.TerminateReason;
import com.avito.avcalls.config.Config;
import com.avito.avcalls.logger.b;
import com.avito.avcalls.utils.AvCallsException;
import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.N;
import kotlinx.coroutines.T;
import kotlinx.coroutines.internal.K;
import uQ0.C48937a;

/* compiled from: AvCallsImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/e;", "Lcom/avito/avcalls/a;", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements a {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final com.avito.avcalls.utils.logs.a f332888g = new com.avito.avcalls.utils.logs.a("AvCallsImpl");

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.utils.coroutines.c f332889a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C36199e f332890b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.signaling.transport.external.a f332891c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.f f332892d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC10303a f332893e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.config.f f332894f;

    /* compiled from: AvCallsImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.AvCallsImpl$acceptIncomingCall$1", f = "AvCallsImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements l<Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f332896r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f332896r = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return e.this.new b(this.f332896r, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((b) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws AvCallsException.InvalidCallStateException, AvCallsException.CallNotFoundException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            e.this.f332890b.a(this.f332896r);
            return G0.f406611a;
        }
    }

    /* compiled from: AvCallsImpl.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/avito/avcalls/call/models/CallState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.avcalls.AvCallsImpl$createOutgoingCall$1", f = "AvCallsImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements l<Continuation<? super CallState>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f332898r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f332899s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f332900t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f332901u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ CreateCallMetaInfo f332902v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, boolean z12, CreateCallMetaInfo createCallMetaInfo, Continuation<? super c> continuation) {
            super(1, continuation);
            this.f332898r = str;
            this.f332899s = str2;
            this.f332900t = str3;
            this.f332901u = z12;
            this.f332902v = createCallMetaInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return e.this.new c(this.f332898r, this.f332899s, this.f332900t, this.f332901u, this.f332902v, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super CallState> continuation) {
            return ((c) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C36199e c36199e = e.this.f332890b;
            CreateCallMetaInfo createCallMetaInfo = this.f332902v;
            return c36199e.e(this.f332898r, this.f332899s, this.f332900t, this.f332901u, createCallMetaInfo);
        }
    }

    /* compiled from: AvCallsImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.AvCallsImpl$onPushNotification$1", f = "AvCallsImpl.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f332903q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f332905s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Continuation<? super d> continuation) {
            super(1, continuation);
            this.f332905s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return e.this.new d(this.f332905s, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((d) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f332903q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.avcalls.signaling.transport.external.a aVar = e.this.f332891c;
                MessageChannel messageChannel = MessageChannel.PUSH;
                this.f332903q = 1;
                if (aVar.a(this.f332905s, messageChannel, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/O", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/N;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.e$e, reason: collision with other inner class name */
    public static final class C10345e extends AbstractCoroutineContextElement implements N {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.c f332906b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10345e(N.b bVar, a.c cVar) {
            super(bVar);
            this.f332906b = cVar;
        }

        @Override // kotlinx.coroutines.N
        public final void handleException(@Y61.k CoroutineContext coroutineContext, @Y61.k Throwable th2) {
            this.f332906b.a(th2);
        }
    }

    /* compiled from: AvCallsImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.AvCallsImpl$safeLaunchCompletable$2", f = "AvCallsImpl.kt", i = {}, l = {JfifUtil.MARKER_EOI, JfifUtil.MARKER_SOS}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f332907q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f332908r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a.c f332909s;

        /* compiled from: AvCallsImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.avcalls.AvCallsImpl$safeLaunchCompletable$2$1", f = "AvCallsImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ a.c f332910q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a.c cVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f332910q = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f332910q, continuation);
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
                this.f332910q.onComplete();
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(l<? super Continuation<? super G0>, ? extends Object> lVar, a.c cVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f332908r = (SuspendLambda) lVar;
            this.f332909s = cVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new f(this.f332908r, this.f332909s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r6v1, types: [Y41.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f332907q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f332907q = 1;
                if (this.f332908r.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                C42729a0.b(obj);
            }
            kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
            AbstractC43129d1 abstractC43129d1 = K.f411877a;
            a aVar = new a(this.f332909s, null);
            this.f332907q = 2;
            if (C43259k.g(abstractC43129d1, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AvCallsImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.AvCallsImpl$sendRingingForIncomingCall$1", f = "AvCallsImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements l<Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f332912r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Continuation<? super g> continuation) {
            super(1, continuation);
            this.f332912r = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return e.this.new g(this.f332912r, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((g) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws AvCallsException.InvalidCallStateException, AvCallsException.CallNotFoundException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            e.this.f332890b.l(this.f332912r);
            return G0.f406611a;
        }
    }

    /* compiled from: AvCallsImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.AvCallsImpl$startOutgoingCall$1", f = "AvCallsImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements l<Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f332914r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Continuation<? super h> continuation) {
            super(1, continuation);
            this.f332914r = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return e.this.new h(this.f332914r, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((h) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws AvCallsException.InvalidCallStateException, AvCallsException.CallNotFoundException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            e.this.f332890b.m(this.f332914r);
            return G0.f406611a;
        }
    }

    /* compiled from: AvCallsImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.AvCallsImpl$terminateCall$1", f = "AvCallsImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements l<Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f332916r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ TerminateReason f332917s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, TerminateReason terminateReason, Continuation<? super i> continuation) {
            super(1, continuation);
            this.f332916r = str;
            this.f332917s = terminateReason;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return e.this.new i(this.f332916r, this.f332917s, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((i) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws AvCallsException.CallNotFoundException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            e.this.f332890b.n(this.f332916r, this.f332917s, true);
            return G0.f406611a;
        }
    }

    public e(@Y61.k com.avito.avcalls.utils.coroutines.c cVar, @Y61.k C36199e c36199e, @Y61.k com.avito.avcalls.signaling.transport.external.a aVar, @Y61.k a.f fVar, @Y61.k com.avito.avcalls.logger.a aVar2, @Y61.k a.InterfaceC10303a interfaceC10303a, @Y61.l com.avito.avcalls.config.d dVar, @Y61.k com.avito.avcalls.config.f fVar2) {
        this.f332889a = cVar;
        this.f332890b = c36199e;
        this.f332891c = aVar;
        this.f332892d = fVar;
        this.f332893e = interfaceC10303a;
        this.f332894f = fVar2;
        b.Companion companion = com.avito.avcalls.logger.b.INSTANCE;
        kotlinx.coroutines.scheduling.c cVar2 = C43262l0.f411945a;
        com.avito.avcalls.logger.f fVar3 = new com.avito.avcalls.logger.f(aVar2, fVar, K.f411877a, cVar);
        companion.getClass();
        b.Companion.f332946b = fVar3;
        C48937a.b.INSTANCE.getClass();
        C48937a.f439931a = interfaceC10303a;
        f332888g.b("init", "config=" + fVar2.getF332870b());
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.avito.avcalls.a
    public final void a(@Y61.k String str, boolean z12) {
        f332888g.b("enableSendingVideo", "callId=" + str + ", isEnabled=" + z12);
        this.f332890b.h(str, z12);
    }

    @Override // com.avito.avcalls.a
    public final boolean b(@Y61.k String str, @Y61.k String str2) {
        f332888g.b("sendDtmf", androidx.compose.ui.graphics.colorspace.e.n("callId=", str, ", tone=", str2));
        return this.f332890b.k(str, str2);
    }

    @Override // com.avito.avcalls.a
    public final void c(@Y61.k String str, boolean z12) {
        f332888g.b("enableSendingAudio", "callId=" + str + ", isEnabled=" + z12);
        this.f332890b.g(str, z12);
    }

    @Override // com.avito.avcalls.a
    public final void d(@Y61.k CameraPosition cameraPosition) {
        f332888g.b("switchCamera", cameraPosition);
        C36199e c36199e = this.f332890b;
        C36199e.f332652k.b("switchCamera", cameraPosition);
        ((com.avito.avcalls.rtc.device.video.capturing.d) c36199e.f332658f.f333119a.getValue()).d(cameraPosition);
    }

    @Override // com.avito.avcalls.a
    public final void e(@Y61.k String str, @Y61.k a.c cVar) {
        f332888g.b("sendRingingForIncomingCall", "callId=".concat(str));
        n(cVar, new g(str, null));
    }

    @Override // com.avito.avcalls.a
    public final void f(@Y61.k String str, boolean z12, @Y61.k DQ0.a aVar) {
        f332888g.b("attachVideoRenderer", "callId=" + str + ", videoRenderer=" + aVar);
        this.f332890b.d(str, z12, aVar);
    }

    @Override // com.avito.avcalls.a
    public final void g(@Y61.k String str, @Y61.k a.c cVar) {
        f332888g.b("acceptIncomingCall", "callId=".concat(str));
        n(cVar, new b(str, null));
    }

    @Override // com.avito.avcalls.a
    @Y61.k
    public final Config getConfig() {
        return this.f332894f.getF332870b();
    }

    @Override // com.avito.avcalls.a
    public final void h(@Y61.k String str, @Y61.k TerminateReason terminateReason, @Y61.k a.c cVar) {
        f332888g.b("terminateCall", "callId=" + str + ", reason=" + terminateReason);
        n(cVar, new i(str, terminateReason, null));
    }

    @Override // com.avito.avcalls.a
    public final void i(@Y61.k String str, boolean z12, @Y61.k DQ0.a aVar) {
        f332888g.b("detachVideoRenderer", "callId=" + str + ", videoRenderer=" + aVar);
        this.f332890b.f(str, z12, aVar);
    }

    @Override // com.avito.avcalls.a
    public final void j(@Y61.k String str, @Y61.k a.c cVar) {
        f332888g.b("startOutgoingCall", "callId=".concat(str));
        n(cVar, new h(str, null));
    }

    @Override // com.avito.avcalls.a
    public final void k(@Y61.k String str, @Y61.k a.c cVar) {
        f332888g.b("onPushNotification", "jsonParameters=" + com.avito.avcalls.utils.l.c(str));
        n(cVar, new d(str, null));
    }

    @Override // com.avito.avcalls.a
    public final void l(@Y61.k String str, @Y61.k a.c cVar) {
        f332888g.b("onExternalSignalingTransportEvent", "event=".concat(""), "jsonParameters=" + com.avito.avcalls.utils.l.c(str));
        n(cVar, new com.avito.avcalls.g(this, str, null));
    }

    @Override // com.avito.avcalls.a
    public final void m(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12, @Y61.k CreateCallMetaInfo createCallMetaInfo, @Y61.k a.h hVar) {
        StringBuilder sbB = C23088b.b("callId=", str, ", from=", str2, ", to=");
        sbB.append(str3);
        sbB.append(", isVideo=");
        sbB.append(z12);
        sbB.append(", metaInfo=");
        sbB.append(createCallMetaInfo);
        f332888g.b("createOutgoingCall", sbB.toString());
        c cVar = new c(str, str2, str3, z12, createCallMetaInfo, null);
        C43259k.d(this.f332889a, new com.avito.avcalls.h(N.f410714t2, hVar), null, new com.avito.avcalls.i(cVar, hVar, null), 2);
    }

    public final void n(a.c cVar, l<? super Continuation<? super G0>, ? extends Object> lVar) {
        C43259k.d(this.f332889a, new C10345e(N.f410714t2, cVar), null, new f(lVar, cVar, null), 2);
    }
}
