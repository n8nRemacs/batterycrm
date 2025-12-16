package com.avito.avcalls.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.avcalls.rtc.connecting.IceCandidate;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.d2;

/* compiled from: CallSession.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.call.CallSession$startSendingNewCandidatesToServer$1", f = "CallSession.kt", i = {}, l = {280}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.avcalls.call.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36214u extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f332824q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f332825r;

    /* compiled from: CallSession.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/avcalls/rtc/connecting/IceCandidate;", "newCandidates", "Lkotlin/G0;", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.avcalls.call.u$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r f332826b;

        /* compiled from: CallSession.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.avcalls.call.CallSession$startSendingNewCandidatesToServer$1$1", f = "CallSession.kt", i = {}, l = {282}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.avcalls.call.u$a$a, reason: collision with other inner class name */
        public static final class C10343a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f332827q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ a<T> f332828r;

            /* renamed from: s, reason: collision with root package name */
            public int f332829s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C10343a(a<? super T> aVar, Continuation<? super C10343a> continuation) {
                super(continuation);
                this.f332828r = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f332827q = obj;
                this.f332829s |= BeduinInputModel.MIN_TEXT_VERSION;
                return this.f332828r.emit(null, this);
            }
        }

        public a(r rVar) {
            this.f332826b = rVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@Y61.k java.util.List<com.avito.avcalls.rtc.connecting.IceCandidate> r10, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof com.avito.avcalls.call.C36214u.a.C10343a
                if (r0 == 0) goto L14
                r0 = r11
                com.avito.avcalls.call.u$a$a r0 = (com.avito.avcalls.call.C36214u.a.C10343a) r0
                int r1 = r0.f332829s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.f332829s = r1
            L12:
                r7 = r0
                goto L1a
            L14:
                com.avito.avcalls.call.u$a$a r0 = new com.avito.avcalls.call.u$a$a
                r0.<init>(r9, r11)
                goto L12
            L1a:
                java.lang.Object r11 = r7.f332827q
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f332829s
                java.lang.String r8 = "startSendingNewCandidatesToServer"
                r2 = 1
                if (r1 == 0) goto L35
                if (r1 != r2) goto L2d
                kotlin.C42729a0.b(r11)
                goto L73
            L2d:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L35:
                kotlin.C42729a0.b(r11)
                com.avito.avcalls.utils.logs.a r11 = com.avito.avcalls.call.r.f332790n
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = "new ice candidates: "
                r1.<init>(r3)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r11.c(r1, r8, r3)
                com.avito.avcalls.call.r r11 = r9.f332826b
                com.avito.avcalls.call.A r1 = r11.f332794d
                com.avito.avcalls.call.models.CallState r3 = r11.a()
                java.lang.String r3 = r3.getLocalUserId()
                com.avito.avcalls.call.models.CallState r4 = r11.a()
                com.avito.avcalls.call.models.PeerStatus r4 = r4.getPeerStatus()
                java.lang.String r4 = r4.getUserId()
                r7.f332829s = r2
                r5 = 0
                java.lang.String r2 = r11.f332791a
                r6 = r10
                java.lang.Object r11 = r1.j(r2, r3, r4, r5, r6, r7)
                if (r11 != r0) goto L73
                return r0
            L73:
                com.avito.avcalls.signaling.x r11 = (com.avito.avcalls.signaling.x) r11
                boolean r10 = r11 instanceof com.avito.avcalls.signaling.x.c
                if (r10 != 0) goto L9a
                boolean r10 = r11 instanceof com.avito.avcalls.signaling.x.b
                if (r10 == 0) goto L94
                com.avito.avcalls.signaling.x$b r11 = (com.avito.avcalls.signaling.x.b) r11
                com.avito.avcalls.utils.logs.a r10 = com.avito.avcalls.call.r.f332790n
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "can't send newCandidates, api error="
                r0.<init>(r1)
                r0.append(r11)
                java.lang.String r11 = r0.toString()
                r0 = 0
                r10.a(r8, r11, r0)
                goto L9a
            L94:
                kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                r10.<init>()
                throw r10
            L9a:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.call.C36214u.a.emit(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36214u(r rVar, Continuation<? super C36214u> continuation) {
        super(2, continuation);
        this.f332825r = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C36214u(this.f332825r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C36214u) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f332824q;
        if (i12 == 0) {
            C42729a0.b(obj);
            r rVar = this.f332825r;
            d2<List<IceCandidate>> d2Var = rVar.f332798h.f333215b.f333154r;
            a aVar = new a(rVar);
            this.f332824q = 1;
            if (d2Var.collect(aVar, this) == coroutine_suspended) {
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
