package com.avito.android.multi_message_send.domain;

import com.avito.android.multi_message_send.mvi.entity.MultiMessageSendInternalAction;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: SendMessagesUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.multi_message_send.domain.SendMessagesUseCase$createChats$2", f = "SendMessagesUseCase.kt", i = {0}, l = {91, 95, 100, 102}, m = "invokeSuspend", n = {"destination$iv$iv"}, s = {"L$0"})
/* loaded from: classes15.dex */
public final class k extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Iterator f206700q;

    /* renamed from: r, reason: collision with root package name */
    public Collection f206701r;

    /* renamed from: s, reason: collision with root package name */
    public int f206702s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f206703t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List<Long> f206704u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l f206705v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j<MultiMessageSendInternalAction> f206706w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f206707x;

    /* compiled from: SendMessagesUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lru/avito/messenger/api/entity/ChatMessage;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lru/avito/messenger/api/entity/ChatMessage;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.multi_message_send.domain.SendMessagesUseCase$createChats$2$createChatResults$1$1", f = "SendMessagesUseCase.kt", i = {1}, l = {62, 67, 83}, m = "invokeSuspend", n = {"userInfo"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super ChatMessage>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public MessengerUserHashInfo f206708q;

        /* renamed from: r, reason: collision with root package name */
        public int f206709r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ l f206710s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f206711t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f206712u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, long j12, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f206710s = lVar;
            this.f206711t = j12;
            this.f206712u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f206710s, this.f206711t, this.f206712u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super ChatMessage> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[Catch: all -> 0x0097, TRY_ENTER, TryCatch #1 {all -> 0x0097, blocks: (B:7:0x0016, B:32:0x0094, B:29:0x0074), top: B:36:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v19 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f206709r
                r3 = 3
                r4 = 2
                r5 = 1
                com.avito.android.multi_message_send.domain.l r6 = r0.f206710s
                r7 = 0
                if (r2 == 0) goto L33
                if (r2 == r5) goto L2d
                if (r2 == r4) goto L25
                if (r2 != r3) goto L1d
                kotlin.C42729a0.b(r19)     // Catch: java.lang.Throwable -> L97
                r2 = r19
                goto L94
            L1d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L25:
                ru.avito.messenger.MessengerUserHashInfo r2 = r0.f206708q
                kotlin.C42729a0.b(r19)     // Catch: java.lang.Throwable -> L67
                r4 = r19
                goto L63
            L2d:
                kotlin.C42729a0.b(r19)
                r2 = r19
                goto L45
            L33:
                kotlin.C42729a0.b(r19)
                ru.avito.messenger.F0 r2 = r6.f206717e
                io.reactivex.rxjava3.internal.operators.observable.T r2 = ru.avito.messenger.G0.a(r2)
                r0.f206709r = r5
                java.lang.Object r2 = kotlinx.coroutines.rx3.C43292o.b(r2, r0)
                if (r2 != r1) goto L45
                return r1
            L45:
                ru.avito.messenger.MessengerUserHashInfo r2 = (ru.avito.messenger.MessengerUserHashInfo) r2
                ru.avito.messenger.A r8 = r6.f206714b     // Catch: java.lang.Throwable -> L67
                long r9 = r0.f206711t     // Catch: java.lang.Throwable -> L67
                java.lang.String r10 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L67
                r11 = 0
                r12 = 0
                r13 = 28
                r9 = r2
                io.reactivex.rxjava3.core.I r5 = ru.avito.messenger.A.a.a(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L67
                r0.f206708q = r2     // Catch: java.lang.Throwable -> L67
                r0.f206709r = r4     // Catch: java.lang.Throwable -> L67
                java.lang.Object r4 = kotlinx.coroutines.rx3.C43292o.b(r5, r0)     // Catch: java.lang.Throwable -> L67
                if (r4 != r1) goto L63
                return r1
            L63:
                ru.avito.messenger.api.entity.Channel r4 = (ru.avito.messenger.api.entity.Channel) r4     // Catch: java.lang.Throwable -> L67
                r9 = r2
                goto L69
            L67:
                r9 = r2
                r4 = r7
            L69:
                if (r4 == 0) goto L71
                java.lang.String r2 = r4.getChannelId()
                r10 = r2
                goto L72
            L71:
                r10 = r7
            L72:
                if (r10 == 0) goto L97
                ru.avito.messenger.A r8 = r6.f206714b     // Catch: java.lang.Throwable -> L97
                com.avito.android.util.o4 r2 = r6.f206715c     // Catch: java.lang.Throwable -> L97
                java.lang.String r11 = r2.a()     // Catch: java.lang.Throwable -> L97
                java.lang.String r12 = r0.f206712u     // Catch: java.lang.Throwable -> L97
                r15 = 0
                r16 = 0
                r17 = 0
                r13 = 0
                r14 = 0
                io.reactivex.rxjava3.core.I r2 = r8.f(r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L97
                r0.f206708q = r7     // Catch: java.lang.Throwable -> L97
                r0.f206709r = r3     // Catch: java.lang.Throwable -> L97
                java.lang.Object r2 = kotlinx.coroutines.rx3.C43292o.b(r2, r0)     // Catch: java.lang.Throwable -> L97
                if (r2 != r1) goto L94
                return r1
            L94:
                ru.avito.messenger.api.entity.ChatMessage r2 = (ru.avito.messenger.api.entity.ChatMessage) r2     // Catch: java.lang.Throwable -> L97
                r7 = r2
            L97:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.multi_message_send.domain.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(List<Long> list, l lVar, InterfaceC43172j<? super MultiMessageSendInternalAction> interfaceC43172j, String str, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f206704u = list;
        this.f206705v = lVar;
        this.f206706w = interfaceC43172j;
        this.f206707x = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f206704u, this.f206705v, this.f206706w, this.f206707x, continuation);
        kVar.f206703t = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a9 -> B:25:0x00ab). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.multi_message_send.domain.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
