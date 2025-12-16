package com.avito.android.comfortable_deal.clients.interactor;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.clients.model.ClientsInfo;
import com.avito.android.comfortable_deal.clients.model.RequestType;
import com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kp.C43477c;

/* compiled from: ClientsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/interactor/a;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.comfortable_deal.repository.a f120231a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.comfortable_deal.clients.use_case.c f120232b;

    /* compiled from: ClientsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comfortable_deal.clients.interactor.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3531a {
        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RequestType requestType = RequestType.f120269c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RequestType requestType2 = RequestType.f120269c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RequestType requestType3 = RequestType.f120269c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: ClientsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.clients.interactor.ClientsInteractor$loadNewPage$1", f = "ClientsInteractor.kt", i = {0, 1}, l = {30, 31, 33, 36}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super ClientsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f120233q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f120234r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ RequestType f120236t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f120237u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f120238v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Boolean f120239w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RequestType requestType, int i12, String str, Boolean bool, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f120236t = requestType;
            this.f120237u = i12;
            this.f120238v = str;
            this.f120239w = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = a.this.new b(this.f120236t, this.f120237u, this.f120238v, this.f120239w, continuation);
            bVar.f120234r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ClientsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.clients.interactor.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ClientsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.clients.interactor.ClientsInteractor$reloadScreen$1", f = "ClientsInteractor.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super ClientsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f120240q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f120241r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ RequestType f120243t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C43477c f120244u;

        /* compiled from: ClientsInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.comfortable_deal.clients.interactor.ClientsInteractor$reloadScreen$1$1", f = "ClientsInteractor.kt", i = {3}, l = {43, 44, 45, 46, 48, 50}, m = "invokeSuspend", n = {RequestReviewResultKt.INFO_TYPE}, s = {"L$0"})
        /* renamed from: com.avito.android.comfortable_deal.clients.interactor.a$c$a, reason: collision with other inner class name */
        public static final class C3532a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public ClientsInfo f120245q;

            /* renamed from: r, reason: collision with root package name */
            public int f120246r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<ClientsInternalAction> f120247s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ a f120248t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ RequestType f120249u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ C43477c f120250v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3532a(InterfaceC43172j<? super ClientsInternalAction> interfaceC43172j, a aVar, RequestType requestType, C43477c c43477c, Continuation<? super C3532a> continuation) {
                super(2, continuation);
                this.f120247s = interfaceC43172j;
                this.f120248t = aVar;
                this.f120249u = requestType;
                this.f120250v = c43477c;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C3532a(this.f120247s, this.f120248t, this.f120249u, this.f120250v, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C3532a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
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
                    int r1 = r10.f120246r
                    r2 = 1
                    kotlinx.coroutines.flow.j<com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction> r3 = r10.f120247s
                    switch(r1) {
                        case 0: goto L2b;
                        case 1: goto L27;
                        case 2: goto L23;
                        case 3: goto L1f;
                        case 4: goto L19;
                        case 5: goto L14;
                        case 6: goto L14;
                        default: goto Lc;
                    }
                Lc:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L14:
                    kotlin.C42729a0.b(r11)
                    goto Lb9
                L19:
                    com.avito.android.comfortable_deal.clients.model.ClientsInfo r1 = r10.f120245q
                    kotlin.C42729a0.b(r11)
                    goto L73
                L1f:
                    kotlin.C42729a0.b(r11)
                    goto L5d
                L23:
                    kotlin.C42729a0.b(r11)
                    goto L4b
                L27:
                    kotlin.C42729a0.b(r11)
                    goto L3c
                L2b:
                    kotlin.C42729a0.b(r11)
                    com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction$Loading r11 = new com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction$Loading
                    r11.<init>()
                    r10.f120246r = r2
                    java.lang.Object r11 = r3.emit(r11, r10)
                    if (r11 != r0) goto L3c
                    return r0
                L3c:
                    com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction$ClearData r11 = new com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction$ClearData
                    r11.<init>(r2)
                    r1 = 2
                    r10.f120246r = r1
                    java.lang.Object r11 = r3.emit(r11, r10)
                    if (r11 != r0) goto L4b
                    return r0
                L4b:
                    com.avito.android.comfortable_deal.clients.interactor.a r11 = r10.f120248t
                    com.avito.android.comfortable_deal.clients.use_case.c r11 = r11.f120232b
                    r1 = 3
                    r10.f120246r = r1
                    com.avito.android.comfortable_deal.clients.model.RequestType r1 = r10.f120249u
                    kp.c r2 = r10.f120250v
                    java.lang.Object r11 = r11.a(r1, r2, r10)
                    if (r11 != r0) goto L5d
                    return r0
                L5d:
                    r1 = r11
                    com.avito.android.comfortable_deal.clients.model.ClientsInfo r1 = (com.avito.android.comfortable_deal.clients.model.ClientsInfo) r1
                    com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction$UpdateTabsCounters r11 = new com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction$UpdateTabsCounters
                    java.util.Map<com.avito.android.comfortable_deal.clients.model.RequestType, java.lang.Integer> r2 = r1.f120268d
                    r11.<init>(r2)
                    r10.f120245q = r1
                    r2 = 4
                    r10.f120246r = r2
                    java.lang.Object r11 = r3.emit(r11, r10)
                    if (r11 != r0) goto L73
                    return r0
                L73:
                    java.util.List<com.avito.android.comfortable_deal.common.view.client.ClientCardData> r11 = r1.f120266b
                    r2 = 0
                    if (r11 == 0) goto L8c
                    com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction$NewPage r4 = new com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction$NewPage
                    r5 = 0
                    com.avito.android.deep_linking.links.DeepLink r1 = r1.f120267c
                    r4.<init>(r11, r5, r1)
                    r10.f120245q = r2
                    r11 = 5
                    r10.f120246r = r11
                    java.lang.Object r11 = r3.emit(r4, r10)
                    if (r11 != r0) goto Lb9
                    return r0
                L8c:
                    com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction$Error r11 = new com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction$Error
                    com.avito.android.remote.error.ApiError$UnknownError r1 = new com.avito.android.remote.error.ApiError$UnknownError
                    com.avito.android.s$a r4 = com.avito.android.AbstractApplicationC34428s.f256016b
                    r4.getClass()
                    com.avito.android.s r4 = com.avito.android.AbstractApplicationC34428s.f256017c
                    if (r4 == 0) goto L9a
                    goto L9b
                L9a:
                    r4 = r2
                L9b:
                    r5 = 2131957798(0x7f131826, float:1.955219E38)
                    java.lang.String r5 = r4.getString(r5)
                    r6 = 0
                    r7 = 0
                    r8 = 6
                    r9 = 0
                    r4 = r1
                    r4.<init>(r5, r6, r7, r8, r9)
                    r11.<init>(r1)
                    r10.f120245q = r2
                    r1 = 6
                    r10.f120246r = r1
                    java.lang.Object r11 = r3.emit(r11, r10)
                    if (r11 != r0) goto Lb9
                    return r0
                Lb9:
                    kotlin.G0 r11 = kotlin.G0.f406611a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.clients.interactor.a.c.C3532a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RequestType requestType, C43477c c43477c, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f120243t = requestType;
            this.f120244u = c43477c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = a.this.new c(this.f120243t, this.f120244u, continuation);
            cVar.f120241r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ClientsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f120240q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C3532a c3532a = new C3532a((InterfaceC43172j) this.f120241r, a.this, this.f120243t, this.f120244u, null);
                this.f120240q = 1;
                if (U.c(c3532a, this) == coroutine_suspended) {
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

    @Inject
    public a(@k com.avito.android.comfortable_deal.repository.a aVar, @k com.avito.android.comfortable_deal.clients.use_case.c cVar) {
        this.f120231a = aVar;
        this.f120232b = cVar;
    }

    @k
    public final InterfaceC43160i<ClientsInternalAction> a(int i12, @k RequestType requestType, @l String str, @l Boolean bool) {
        return C43175k.G(new b(requestType, i12, str, bool, null));
    }

    @k
    public final InterfaceC43160i<ClientsInternalAction> b(@k RequestType requestType, @l C43477c c43477c) {
        return C43175k.G(new c(requestType, c43477c, null));
    }
}
