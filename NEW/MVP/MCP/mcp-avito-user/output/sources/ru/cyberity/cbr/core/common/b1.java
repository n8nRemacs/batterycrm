package ru.cyberity.cbr.core.common;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import ru.cyberity.log.logger.Logger;

/* compiled from: WebSocketFlow.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/OkHttpClient;", "httpClient", "", "baseUrl", "Lru/cyberity/cbr/core/c;", "tokenProvider", "Lkotlinx/coroutines/flow/i;", "a", "(Lokhttp3/OkHttpClient;Ljava/lang/String;Lru/cyberity/cbr/core/c;)Lkotlinx/coroutines/flow/i;", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b1 {

    /* compiled from: WebSocketFlow.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.WebSocketFlowKt$webSocketFlow$1", f = "WebSocketFlow.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {107, 94}, m = "invokeSuspend", n = {"failureContinuation", "socket", VoiceInfo.STATE, "listener", "failureContinuation", "socket", VoiceInfo.STATE, "listener"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class a extends SuspendLambda implements Y41.p<I0<? super String>, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f432640a;

        /* renamed from: b, reason: collision with root package name */
        Object f432641b;

        /* renamed from: c, reason: collision with root package name */
        Object f432642c;

        /* renamed from: d, reason: collision with root package name */
        int f432643d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f432644e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f432645f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ru.cyberity.cbr.core.c<String> f432646g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OkHttpClient f432647h;

        /* compiled from: WebSocketFlow.kt */
        @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/common/b1$a$a", "Lokhttp3/WebSocketListener;", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/Response;", "response", "Lkotlin/G0;", "onOpen", "(Lokhttp3/WebSocket;Lokhttp3/Response;)V", "", "t", "onFailure", "(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V", "", "text", "onMessage", "(Lokhttp3/WebSocket;Ljava/lang/String;)V", "", "code", "reason", "onClosed", "(Lokhttp3/WebSocket;ILjava/lang/String;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.common.b1$a$a, reason: collision with other inner class name */
        public static final class C12433a extends WebSocketListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ l0.h<State> f432648a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l0.h<Continuation<G0>> f432649b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ I0<String> f432650c;

            /* JADX WARN: Multi-variable type inference failed */
            public C12433a(l0.h<State> hVar, l0.h<Continuation<G0>> hVar2, I0<? super String> i02) {
                this.f432648a = hVar;
                this.f432649b = hVar2;
                this.f432650c = i02;
            }

            @Override // okhttp3.WebSocketListener
            public void onClosed(@Y61.k WebSocket webSocket, int code, @Y61.k String reason) {
                ru.cyberity.cbr.core.a.b(ru.cyberity.cbr.core.a.f432517a, "webSocketFlow", "WebSocketListener.onClosed: code=" + code + " reason=" + reason, null, 4, null);
                this.f432650c.r().h(null);
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
            /* JADX WARN: Type inference failed for: r9v7, types: [T, ru.cyberity.cbr.core.common.State] */
            @Override // okhttp3.WebSocketListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onFailure(@Y61.k okhttp3.WebSocket r8, @Y61.k java.lang.Throwable r9, @Y61.l okhttp3.Response r10) {
                /*
                    r7 = this;
                    ru.cyberity.log.a r0 = ru.cyberity.log.a.f436064a
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    java.lang.String r1 = "WebSocketListener.onFailure: \n"
                    r8.<init>(r1)
                    r8.append(r9)
                    r1 = 10
                    r8.append(r1)
                    r8.append(r10)
                    java.lang.String r2 = r8.toString()
                    java.lang.String r1 = "webSocketFlow"
                    r3 = 0
                    r4 = 4
                    r5 = 0
                    ru.cyberity.log.logger.Logger.e$default(r0, r1, r2, r3, r4, r5)
                    kotlin.jvm.internal.l0$h<kotlin.coroutines.Continuation<kotlin.G0>> r8 = r7.f432649b
                    T r8 = r8.f406842b
                    kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                    if (r8 == 0) goto L36
                    kotlin.coroutines.CoroutineContext r8 = r8.getF411447c()
                    if (r8 == 0) goto L36
                    boolean r8 = kotlinx.coroutines.Q0.h(r8)
                    r0 = 1
                    if (r8 != r0) goto L36
                    goto L37
                L36:
                    r0 = 0
                L37:
                    kotlin.jvm.internal.l0$h<ru.cyberity.cbr.core.common.State> r8 = r7.f432648a
                    T r8 = r8.f406842b
                    ru.cyberity.cbr.core.common.State r8 = (ru.cyberity.cbr.core.common.State) r8
                    boolean r8 = r8.isDisconnected()
                    if (r8 != 0) goto L71
                    ru.cyberity.cbr.core.a r1 = ru.cyberity.cbr.core.a.f432517a
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    java.lang.String r2 = "WebSocketListener.onFailure: n"
                    r8.<init>(r2)
                    r8.append(r9)
                    java.lang.String r9 = "\n isActive="
                    r8.append(r9)
                    r8.append(r0)
                    java.lang.String r9 = ",  "
                    r8.append(r9)
                    r8.append(r10)
                    java.lang.String r3 = r8.toString()
                    java.lang.String r2 = "webSocketFlow"
                    r4 = 0
                    r5 = 4
                    r6 = 0
                    ru.cyberity.cbr.core.a.b(r1, r2, r3, r4, r5, r6)
                    kotlin.jvm.internal.l0$h<ru.cyberity.cbr.core.common.State> r8 = r7.f432648a
                    ru.cyberity.cbr.core.common.State r9 = ru.cyberity.cbr.core.common.State.DISCONNECTING
                    r8.f406842b = r9
                L71:
                    if (r0 == 0) goto L94
                    kotlin.jvm.internal.l0$h<kotlin.coroutines.Continuation<kotlin.G0>> r8 = r7.f432649b     // Catch: java.lang.Exception -> L83
                    T r8 = r8.f406842b     // Catch: java.lang.Exception -> L83
                    kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8     // Catch: java.lang.Exception -> L83
                    if (r8 == 0) goto L8d
                    int r9 = kotlin.Z.f406624c     // Catch: java.lang.Exception -> L83
                    kotlin.G0 r9 = kotlin.G0.f406611a     // Catch: java.lang.Exception -> L83
                    r8.resumeWith(r9)     // Catch: java.lang.Exception -> L83
                    goto L8d
                L83:
                    r8 = move-exception
                    ru.cyberity.log.a r9 = ru.cyberity.log.a.f436064a
                    java.lang.String r10 = "webSocketFlow"
                    java.lang.String r0 = "Failed to resume"
                    ru.cyberity.log.b.b(r9, r10, r0, r8)
                L8d:
                    kotlinx.coroutines.channels.I0<java.lang.String> r8 = r7.f432650c
                    java.lang.String r9 = ""
                    r8.w(r9)
                L94:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.common.b1.a.C12433a.onFailure(okhttp3.WebSocket, java.lang.Throwable, okhttp3.Response):void");
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(@Y61.k WebSocket webSocket, @Y61.k String text) {
                Logger.d$default(ru.cyberity.log.a.f436064a, "webSocketFlow", "WebSocketListener.onMessage: text=".concat(text), null, 4, null);
                ru.cyberity.cbr.core.a.b(ru.cyberity.cbr.core.a.f432517a, "webSocketFlow", "onMessage: size=" + text.length(), null, 4, null);
                this.f432650c.w(text);
            }

            /* JADX WARN: Type inference failed for: r8v1, types: [T, ru.cyberity.cbr.core.common.State] */
            @Override // okhttp3.WebSocketListener
            public void onOpen(@Y61.k WebSocket webSocket, @Y61.k Response response) {
                ru.cyberity.cbr.core.a.b(ru.cyberity.cbr.core.a.f432517a, "webSocketFlow", "WebSocketListener.onOpen", null, 4, null);
                this.f432648a.f406842b = State.CONNECTED;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ru.cyberity.cbr.core.c<String> cVar, OkHttpClient okHttpClient, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f432645f = str;
            this.f432646g = cVar;
            this.f432647h = okHttpClient;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k I0<? super String> i02, @Y61.l Continuation<? super G0> continuation) {
            return ((a) create(i02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f432645f, this.f432646g, this.f432647h, continuation);
            aVar.f432644e = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:17:0x006c, B:19:0x0076, B:22:0x0088, B:24:0x008e, B:25:0x0092, B:27:0x00e0), top: B:42:0x006c }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008e A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:17:0x006c, B:19:0x0076, B:22:0x0088, B:24:0x008e, B:25:0x0092, B:27:0x00e0), top: B:42:0x006c }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00e0 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:17:0x006c, B:19:0x0076, B:22:0x0088, B:24:0x008e, B:25:0x0092, B:27:0x00e0), top: B:42:0x006c }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00e5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00f3 A[Catch: all -> 0x0025, TryCatch #1 {all -> 0x0025, blocks: (B:7:0x001e, B:31:0x00e9, B:33:0x00f3, B:34:0x00ff, B:14:0x0040), top: B:44:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0111 A[RETURN] */
        /* JADX WARN: Type inference failed for: r5v2, types: [T, ru.cyberity.cbr.core.common.State] */
        /* JADX WARN: Type inference failed for: r6v12, types: [T, kotlinx.coroutines.r] */
        /* JADX WARN: Type inference failed for: r6v15, types: [T, ru.cyberity.cbr.core.common.State] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x010f -> B:8:0x0021). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 312
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.common.b1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Y61.k
    public static final InterfaceC43160i<String> a(@Y61.k OkHttpClient okHttpClient, @Y61.k String str, @Y61.k ru.cyberity.cbr.core.c<String> cVar) {
        return C43175k.d(new a(str, cVar, okHttpClient, null));
    }
}
