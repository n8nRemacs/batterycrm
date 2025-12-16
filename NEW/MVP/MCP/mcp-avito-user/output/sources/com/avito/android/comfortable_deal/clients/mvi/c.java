package com.avito.android.comfortable_deal.clients.mvi;

import com.avito.android.comfortable_deal.clients.model.RequestType;
import com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kp.C43481g;
import kp.InterfaceC43475a;

/* compiled from: ClientsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.clients.mvi.ClientsActor$process$2", f = "ClientsActor.kt", i = {0, 0, 1, 1}, l = {49, 50, 51}, m = "invokeSuspend", n = {"$this$flow", "requestedTab", "$this$flow", "requestedTab"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes12.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ClientsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public RequestType f120293q;

    /* renamed from: r, reason: collision with root package name */
    public int f120294r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f120295s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C43481g f120296t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43475a f120297u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f120298v;

    /* compiled from: ClientsActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.clients.mvi.ClientsActor$process$2$1", f = "ClientsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<ClientsInternalAction, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f120299q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ g f120300r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f120300r = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f120300r, continuation);
            aVar.f120299q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(ClientsInternalAction clientsInternalAction, Continuation<? super G0> continuation) {
            return ((a) create(clientsInternalAction, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            if (((ClientsInternalAction) this.f120299q) instanceof ClientsInternalAction.NewPage) {
                this.f120300r.f120345c.f();
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C43481g c43481g, InterfaceC43475a interfaceC43475a, g gVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f120296t = c43481g;
        this.f120297u = interfaceC43475a;
        this.f120298v = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f120296t, this.f120297u, this.f120298v, continuation);
        cVar.f120295s = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ClientsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f120294r
            r2 = 0
            kp.a r3 = r10.f120297u
            r4 = 3
            r5 = 2
            com.avito.android.comfortable_deal.clients.mvi.g r6 = r10.f120298v
            r7 = 1
            r8 = 0
            if (r1 == 0) goto L39
            if (r1 == r7) goto L2e
            if (r1 == r5) goto L24
            if (r1 != r4) goto L1c
            kotlin.C42729a0.b(r11)
            goto La5
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            com.avito.android.comfortable_deal.clients.model.RequestType r1 = r10.f120293q
            java.lang.Object r3 = r10.f120295s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r11)
            goto L88
        L2e:
            com.avito.android.comfortable_deal.clients.model.RequestType r1 = r10.f120293q
            java.lang.Object r7 = r10.f120295s
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            kotlin.C42729a0.b(r11)
            r11 = r7
            goto L71
        L39:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f120295s
            kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
            kp.g r1 = r10.f120296t
            int r1 = r1.f413216j
            r9 = r3
            kp.a$k r9 = (kp.InterfaceC43475a.k) r9
            int r9 = r9.f413189a
            if (r1 != r9) goto L4e
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        L4e:
            kotlin.enums.a r1 = com.avito.android.comfortable_deal.clients.model.RequestType.f120272f
            java.lang.Object r1 = r1.get(r9)
            com.avito.android.comfortable_deal.clients.model.RequestType r1 = (com.avito.android.comfortable_deal.clients.model.RequestType) r1
            com.avito.android.comfortable_deal.clients.model.RequestType r9 = com.avito.android.comfortable_deal.clients.model.RequestType.f120270d
            if (r1 != r9) goto L5f
            ap.b r9 = r6.f120345c
            r9.c()
        L5f:
            com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction$ClearData r9 = new com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction$ClearData
            r9.<init>(r2, r7, r8)
            r10.f120295s = r11
            r10.f120293q = r1
            r10.f120294r = r7
            java.lang.Object r7 = r11.emit(r9, r10)
            if (r7 != r0) goto L71
            return r0
        L71:
            com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction$TabChange r7 = new com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction$TabChange
            kp.a$k r3 = (kp.InterfaceC43475a.k) r3
            int r3 = r3.f413189a
            r7.<init>(r3)
            r10.f120295s = r11
            r10.f120293q = r1
            r10.f120294r = r5
            java.lang.Object r3 = r11.emit(r7, r10)
            if (r3 != r0) goto L87
            return r0
        L87:
            r3 = r11
        L88:
            com.avito.android.comfortable_deal.clients.interactor.a r11 = r6.f120343a
            kotlinx.coroutines.flow.i r11 = r11.a(r2, r1, r8, r8)
            com.avito.android.comfortable_deal.clients.mvi.c$a r1 = new com.avito.android.comfortable_deal.clients.mvi.c$a
            r1.<init>(r6, r8)
            kotlinx.coroutines.flow.r1 r2 = new kotlinx.coroutines.flow.r1
            r2.<init>(r1, r11)
            r10.f120295s = r8
            r10.f120293q = r8
            r10.f120294r = r4
            java.lang.Object r11 = kotlinx.coroutines.flow.C43175k.u(r10, r2, r3)
            if (r11 != r0) goto La5
            return r0
        La5:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.clients.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
