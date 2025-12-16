package com.avito.android.comfortable_deal.clients.mvi;

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
@DebugMetadata(c = "com.avito.android.comfortable_deal.clients.mvi.ClientsActor$process$5", f = "ClientsActor.kt", i = {0, 1, 1}, l = {104, 108, 109}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "query"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes12.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ClientsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f120334q;

    /* renamed from: r, reason: collision with root package name */
    public int f120335r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f120336s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C43481g f120337t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43475a f120338u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f120339v;

    /* compiled from: ClientsActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.clients.mvi.ClientsActor$process$5$1", f = "ClientsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<ClientsInternalAction, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f120340q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43475a f120341r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ g f120342s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC43475a interfaceC43475a, g gVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f120341r = interfaceC43475a;
            this.f120342s = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f120341r, this.f120342s, continuation);
            aVar.f120340q = obj;
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
            if (((ClientsInternalAction) this.f120340q) instanceof ClientsInternalAction.NewPage) {
                boolean z12 = ((InterfaceC43475a.l) this.f120341r).f413190a;
                g gVar = this.f120342s;
                if (z12) {
                    gVar.f120345c.e();
                } else {
                    gVar.f120345c.f();
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C43481g c43481g, InterfaceC43475a interfaceC43475a, g gVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f120337t = c43481g;
        this.f120338u = interfaceC43475a;
        this.f120339v = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f120337t, this.f120338u, this.f120339v, continuation);
        fVar.f120336s = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ClientsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r1.f413194b == ((kp.InterfaceC43475a.l) r7).f413190a) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2 A[RETURN] */
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
            int r1 = r10.f120335r
            kp.g r2 = r10.f120337t
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            kp.a r7 = r10.f120338u
            if (r1 == 0) goto L36
            if (r1 == r5) goto L2d
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            kotlin.C42729a0.b(r11)
            goto La3
        L1b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L23:
            java.lang.String r1 = r10.f120334q
            java.lang.Object r4 = r10.f120336s
            kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.InterfaceC43172j) r4
            kotlin.C42729a0.b(r11)
            goto L76
        L2d:
            java.lang.Object r1 = r10.f120336s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            r11 = r1
            goto L4a
        L36:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f120336s
            kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
            com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction$CloseArchivingFilterDialog r1 = com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction.CloseArchivingFilterDialog.f120314b
            r10.f120336s = r11
            r10.f120335r = r5
            java.lang.Object r1 = r11.emit(r1, r10)
            if (r1 != r0) goto L4a
            return r0
        L4a:
            kp.c r1 = r2.f413210d
            if (r1 == 0) goto L58
            r5 = r7
            kp.a$l r5 = (kp.InterfaceC43475a.l) r5
            boolean r5 = r5.f413190a
            boolean r8 = r1.f413194b
            if (r8 != r5) goto L58
            goto La3
        L58:
            if (r1 == 0) goto L5d
            java.lang.String r1 = r1.f413193a
            goto L5e
        L5d:
            r1 = r6
        L5e:
            com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction$UpdateClientsFilterArchived r5 = new com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction$UpdateClientsFilterArchived
            r8 = r7
            kp.a$l r8 = (kp.InterfaceC43475a.l) r8
            boolean r8 = r8.f413190a
            r5.<init>(r8)
            r10.f120336s = r11
            r10.f120334q = r1
            r10.f120335r = r4
            java.lang.Object r4 = r11.emit(r5, r10)
            if (r4 != r0) goto L75
            return r0
        L75:
            r4 = r11
        L76:
            com.avito.android.comfortable_deal.clients.mvi.g r11 = r10.f120339v
            com.avito.android.comfortable_deal.clients.interactor.a r5 = r11.f120343a
            com.avito.android.comfortable_deal.clients.model.RequestType r2 = r2.c()
            r8 = r7
            kp.a$l r8 = (kp.InterfaceC43475a.l) r8
            boolean r8 = r8.f413190a
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
            r9 = 0
            kotlinx.coroutines.flow.i r1 = r5.a(r9, r2, r1, r8)
            com.avito.android.comfortable_deal.clients.mvi.f$a r2 = new com.avito.android.comfortable_deal.clients.mvi.f$a
            r2.<init>(r7, r11, r6)
            kotlinx.coroutines.flow.r1 r11 = new kotlinx.coroutines.flow.r1
            r11.<init>(r2, r1)
            r10.f120336s = r6
            r10.f120334q = r6
            r10.f120335r = r3
            java.lang.Object r11 = kotlinx.coroutines.flow.C43175k.u(r10, r11, r4)
            if (r11 != r0) goto La3
            return r0
        La3:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.clients.mvi.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
