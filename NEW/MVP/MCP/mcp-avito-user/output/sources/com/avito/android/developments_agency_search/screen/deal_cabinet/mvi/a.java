package com.avito.android.developments_agency_search.screen.deal_cabinet.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.developments_agency_search.domain.GetClientListRequestStage;
import com.avito.android.developments_agency_search.domain.GetClientListResponse;
import com.avito.android.developments_agency_search.domain.GetMortgageListRequestStatus;
import com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.tabs.Tab;
import com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction;
import com.avito.android.util.P2;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import okhttp3.internal.http.StatusLine;
import xw.InterfaceC50010b;
import zw.C50636a;
import zw.b;

/* compiled from: DealCabinetActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lzw/b;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lzw/d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<zw.b, DealCabinetInternalAction, zw.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.k f137004a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.screen.deal_cabinet.a f137005b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50010b f137006c;

    /* compiled from: DealCabinetActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C4126a {
        static {
            int[] iArr = new int[GetMortgageListRequestStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                GetMortgageListRequestStatus.a aVar = GetMortgageListRequestStatus.f136527c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: DealCabinetActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetActor$process$10", f = "DealCabinetActor.kt", i = {0, 2}, l = {166, 168, 180, 182}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealCabinetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f137007q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f137008r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ zw.d f137009s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ zw.b f137010t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ a f137011u;

        /* compiled from: DealCabinetActor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.a$b$a, reason: collision with other inner class name */
        public /* synthetic */ class C4127a {
            static {
                int[] iArr = new int[Tab.values().length];
                try {
                    iArr[Tab.f136879c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Tab.f136880d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, Continuation continuation, zw.b bVar, zw.d dVar) {
            super(2, continuation);
            this.f137009s = dVar;
            this.f137010t = bVar;
            this.f137011u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f137011u, continuation, this.f137010t, this.f137009s);
            bVar.f137008r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealCabinetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ce A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f137007q
                r2 = 0
                r3 = 4
                r4 = 3
                r5 = 2
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.a r6 = r11.f137011u
                r7 = 1
                zw.d r8 = r11.f137009s
                zw.b r9 = r11.f137010t
                if (r1 == 0) goto L39
                if (r1 == r7) goto L30
                if (r1 == r5) goto L1b
                if (r1 == r4) goto L28
                if (r1 != r3) goto L20
            L1b:
                kotlin.C42729a0.b(r12)
                goto Lcf
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                java.lang.Object r1 = r11.f137008r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto L71
            L30:
                java.lang.Object r1 = r11.f137008r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto Lb5
            L39:
                kotlin.C42729a0.b(r12)
                java.lang.Object r12 = r11.f137008r
                r1 = r12
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.tabs.Tab r12 = r8.f444383d
                int r12 = r12.ordinal()
                if (r12 == 0) goto L8a
                if (r12 == r7) goto L4d
                goto Lcf
            L4d:
                zw.f r12 = r8.f444385f
                java.lang.String r12 = r12.f444393c
                r5 = r9
                zw.b$q r5 = (zw.b.q) r5
                java.lang.String r10 = r5.f444369a
                boolean r12 = kotlin.jvm.internal.L.f(r12, r10)
                if (r12 == 0) goto L5f
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            L5f:
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$UpdateMortgageLastSearchQuery r12 = new com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$UpdateMortgageLastSearchQuery
                java.lang.String r5 = r5.f444369a
                r12.<init>(r5)
                r11.f137008r = r1
                r11.f137007q = r4
                java.lang.Object r12 = r1.emit(r12, r11)
                if (r12 != r0) goto L71
                return r0
            L71:
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.k r12 = r6.f137004a
                zw.b$q r9 = (zw.b.q) r9
                java.lang.String r4 = r9.f444369a
                zw.f r5 = r8.f444385f
                com.avito.android.developments_agency_search.domain.GetMortgageListRequestStatus r5 = r5.f444395e
                kotlinx.coroutines.flow.i r12 = r12.a(r7, r4, r5)
                r11.f137008r = r2
                r11.f137007q = r3
                java.lang.Object r12 = kotlinx.coroutines.flow.C43175k.u(r11, r12, r1)
                if (r12 != r0) goto Lcf
                return r0
            L8a:
                zw.a r12 = r8.f444384e
                java.lang.String r12 = r12.f444344c
                r3 = r9
                zw.b$q r3 = (zw.b.q) r3
                java.lang.String r4 = r3.f444369a
                boolean r12 = kotlin.jvm.internal.L.f(r12, r4)
                if (r12 == 0) goto L9c
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            L9c:
                xw.b r12 = r6.f137006c
                java.lang.String r4 = r3.f444369a
                r12.f(r4)
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$UpdateClientsLastSearchQuery r12 = new com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$UpdateClientsLastSearchQuery
                java.lang.String r3 = r3.f444369a
                r12.<init>(r3)
                r11.f137008r = r1
                r11.f137007q = r7
                java.lang.Object r12 = r1.emit(r12, r11)
                if (r12 != r0) goto Lb5
                return r0
            Lb5:
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.k r12 = r6.f137004a
                zw.b$q r9 = (zw.b.q) r9
                java.lang.String r3 = r9.f444369a
                zw.a r4 = r8.f444384e
                com.avito.android.developments_agency_search.domain.GetClientListRequestStage r4 = r4.f444346e
                r6 = 0
                kotlinx.coroutines.flow.i r12 = r12.d(r6, r3, r4)
                r11.f137008r = r2
                r11.f137007q = r5
                java.lang.Object r12 = kotlinx.coroutines.flow.C43175k.u(r11, r12, r1)
                if (r12 != r0) goto Lcf
                return r0
            Lcf:
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DealCabinetActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetActor$process$11", f = "DealCabinetActor.kt", i = {}, l = {201, 212}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealCabinetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f137012q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f137013r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ zw.d f137014s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f137015t;

        /* compiled from: DealCabinetActor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.a$c$a, reason: collision with other inner class name */
        public /* synthetic */ class C4128a {
            static {
                int[] iArr = new int[Tab.values().length];
                try {
                    iArr[Tab.f136879c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Tab.f136880d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(zw.d dVar, a aVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f137014s = dVar;
            this.f137015t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f137014s, this.f137015t, continuation);
            cVar.f137013r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealCabinetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f137012q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f137013r;
                zw.d dVar = this.f137014s;
                int iOrdinal = dVar.f444383d.ordinal();
                a aVar = this.f137015t;
                if (iOrdinal == 0) {
                    DealCabinetInternalAction.ShowClientsFilterSelectorScreen showClientsFilterSelectorScreen = new DealCabinetInternalAction.ShowClientsFilterSelectorScreen(aVar.f137005b.i(GetClientListRequestStage.f136499e, dVar.f444384e.f444346e));
                    this.f137012q = 1;
                    if (interfaceC43172j.emit(showClientsFilterSelectorScreen, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (iOrdinal == 1) {
                    DealCabinetInternalAction.ShowMortgageFilterSelectorScreen showMortgageFilterSelectorScreen = new DealCabinetInternalAction.ShowMortgageFilterSelectorScreen(aVar.f137005b.f(GetMortgageListRequestStatus.f136531g, dVar.f444385f.f444395e));
                    this.f137012q = 2;
                    if (interfaceC43172j.emit(showMortgageFilterSelectorScreen, this) == coroutine_suspended) {
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

    /* compiled from: DealCabinetActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetActor$process$12", f = "DealCabinetActor.kt", i = {0}, l = {221, 229}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealCabinetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f137016q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f137017r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ zw.b f137019t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Continuation continuation, zw.b bVar) {
            super(2, continuation);
            this.f137019t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = a.this.new d(continuation, this.f137019t);
            dVar.f137017r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealCabinetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f137016q;
            zw.b bVar = this.f137019t;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f137017r;
                b.f fVar = (b.f) bVar;
                DealCabinetInternalAction.OpenDealRoomScreen openDealRoomScreen = new DealCabinetInternalAction.OpenDealRoomScreen(fVar.f444355a, a.this.f137005b.g(fVar.f444356b), "agent_cabinet_deal_update");
                this.f137017r = interfaceC43172j;
                this.f137016q = 1;
                if (interfaceC43172j.emit(openDealRoomScreen, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f137017r;
                C42729a0.b(obj);
            }
            b.f fVar2 = (b.f) bVar;
            DealCabinetInternalAction.RemoveDealUpdateItem removeDealUpdateItem = new DealCabinetInternalAction.RemoveDealUpdateItem(fVar2.f444356b.getId(), fVar2.f444356b.getDealId());
            this.f137017r = null;
            this.f137016q = 2;
            if (interfaceC43172j.emit(removeDealUpdateItem, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DealCabinetActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetActor$process$13", f = "DealCabinetActor.kt", i = {}, l = {239}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealCabinetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f137020q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f137021r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ zw.b f137023t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Continuation continuation, zw.b bVar) {
            super(2, continuation);
            this.f137023t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = a.this.new e(continuation, this.f137023t);
            eVar.f137021r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealCabinetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f137020q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f137021r;
                com.avito.android.developments_agency_search.screen.deal_cabinet.a aVar = a.this.f137005b;
                b.c cVar = (b.c) this.f137023t;
                DealCabinetInternalAction.OpenDealRoomScreen openDealRoomScreen = new DealCabinetInternalAction.OpenDealRoomScreen(cVar.f444351a, aVar.b(cVar.f444352b), "agent_cabinet_client_name");
                this.f137020q = 1;
                if (interfaceC43172j.emit(openDealRoomScreen, this) == coroutine_suspended) {
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

    /* compiled from: DealCabinetActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetActor$process$14", f = "DealCabinetActor.kt", i = {0, 0}, l = {266, 268}, m = "invokeSuspend", n = {"$this$flow", "newFilter"}, s = {"L$0", "L$1"})
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealCabinetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public GetClientListRequestStage f137024q;

        /* renamed from: r, reason: collision with root package name */
        public int f137025r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f137026s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ zw.b f137028u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ zw.d f137029v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Continuation continuation, zw.b bVar, zw.d dVar) {
            super(2, continuation);
            this.f137028u = bVar;
            this.f137029v = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = a.this.new f(continuation, this.f137028u, this.f137029v);
            fVar.f137026s = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealCabinetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            GetClientListRequestStage getClientListRequestStageE;
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f137025r;
            zw.d dVar = this.f137029v;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f137026s;
                getClientListRequestStageE = aVar.f137005b.e(((b.d) this.f137028u).f444353a);
                if (dVar.f444384e.f444346e == getClientListRequestStageE) {
                    return G0.f406611a;
                }
                aVar.f137006c.d(getClientListRequestStageE);
                DealCabinetInternalAction.UpdateClientListFilter updateClientListFilter = new DealCabinetInternalAction.UpdateClientListFilter(getClientListRequestStageE);
                this.f137026s = interfaceC43172j2;
                this.f137024q = getClientListRequestStageE;
                this.f137025r = 1;
                if (interfaceC43172j2.emit(updateClientListFilter, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                getClientListRequestStageE = this.f137024q;
                interfaceC43172j = (InterfaceC43172j) this.f137026s;
                C42729a0.b(obj);
            }
            InterfaceC43160i<DealCabinetInternalAction> interfaceC43160iD = aVar.f137004a.d(0, dVar.f444384e.f444344c, getClientListRequestStageE);
            this.f137026s = null;
            this.f137024q = null;
            this.f137025r = 2;
            if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DealCabinetActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetActor$process$15", f = "DealCabinetActor.kt", i = {0, 0}, l = {281, 283}, m = "invokeSuspend", n = {"$this$flow", "newFilter"}, s = {"L$0", "L$1"})
    public static final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealCabinetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public GetMortgageListRequestStatus f137030q;

        /* renamed from: r, reason: collision with root package name */
        public int f137031r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f137032s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ zw.b f137034u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ zw.d f137035v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Continuation continuation, zw.b bVar, zw.d dVar) {
            super(2, continuation);
            this.f137034u = bVar;
            this.f137035v = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = a.this.new g(continuation, this.f137034u, this.f137035v);
            gVar.f137032s = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealCabinetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            GetMortgageListRequestStatus getMortgageListRequestStatusC;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f137031r;
            zw.d dVar = this.f137035v;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f137032s;
                getMortgageListRequestStatusC = aVar.f137005b.c(((b.l) this.f137034u).f444364a);
                if (dVar.f444385f.f444395e == getMortgageListRequestStatusC) {
                    return G0.f406611a;
                }
                DealCabinetInternalAction.UpdateMortgageListFilter updateMortgageListFilter = new DealCabinetInternalAction.UpdateMortgageListFilter(getMortgageListRequestStatusC);
                this.f137032s = interfaceC43172j;
                this.f137030q = getMortgageListRequestStatusC;
                this.f137031r = 1;
                if (interfaceC43172j.emit(updateMortgageListFilter, this) == coroutine_suspended) {
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
                getMortgageListRequestStatusC = this.f137030q;
                interfaceC43172j = (InterfaceC43172j) this.f137032s;
                C42729a0.b(obj);
            }
            InterfaceC43160i<DealCabinetInternalAction> interfaceC43160iA = aVar.f137004a.a(1, dVar.f444385f.f444393c, getMortgageListRequestStatusC);
            this.f137032s = null;
            this.f137030q = null;
            this.f137031r = 2;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DealCabinetActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetActor$process$16", f = "DealCabinetActor.kt", i = {}, l = {296, StatusLine.HTTP_PERM_REDIRECT}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealCabinetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f137036q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f137037r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ zw.d f137038s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f137039t;

        /* compiled from: DealCabinetActor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.a$h$a, reason: collision with other inner class name */
        public /* synthetic */ class C4129a {
            static {
                int[] iArr = new int[Tab.values().length];
                try {
                    iArr[Tab.f136879c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Tab.f136880d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(zw.d dVar, a aVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f137038s = dVar;
            this.f137039t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = new h(this.f137038s, this.f137039t, continuation);
            hVar.f137037r = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealCabinetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f137036q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f137037r;
                zw.d dVar = this.f137038s;
                int iOrdinal = dVar.f444383d.ordinal();
                a aVar = this.f137039t;
                if (iOrdinal == 0) {
                    aVar.getClass();
                    C50636a c50636a = dVar.f444384e;
                    if (!(c50636a.f444342a instanceof P2.c)) {
                        GetClientListResponse.Counters counters = c50636a.f444347f;
                        if ((counters != null ? counters.getFiltered() : 0) > c50636a.f444348g.size()) {
                            InterfaceC43160i<DealCabinetInternalAction> interfaceC43160iD = aVar.f137004a.d(c50636a.f444348g.size(), c50636a.f444344c, c50636a.f444346e);
                            this.f137036q = 1;
                            if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                } else if (iOrdinal == 1) {
                    aVar.getClass();
                    zw.f fVar = dVar.f444385f;
                    if (!(fVar.f444391a instanceof P2.c)) {
                        Integer num = fVar.f444396f;
                        if ((num != null ? num.intValue() : 0) > fVar.f444397g.size()) {
                            InterfaceC43160i<DealCabinetInternalAction> interfaceC43160iA = aVar.f137004a.a(fVar.f444392b.size() + 1, fVar.f444393c, fVar.f444395e);
                            this.f137036q = 2;
                            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
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

    /* compiled from: DealCabinetActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetActor$process$1", f = "DealCabinetActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealCabinetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ zw.d f137040q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ a f137041r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(zw.d dVar, a aVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f137040q = dVar;
            this.f137041r = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new i(this.f137040q, this.f137041r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealCabinetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            zw.d dVar = this.f137040q;
            if (dVar.f444386g) {
                return G0.f406611a;
            }
            dVar.f444386g = true;
            this.f137041r.f137006c.c();
            return G0.f406611a;
        }
    }

    /* compiled from: DealCabinetActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetActor$process$2", f = "DealCabinetActor.kt", i = {0, 2}, l = {47, 48, 58, 59}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealCabinetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f137042q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f137043r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ zw.d f137044s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f137045t;

        /* compiled from: DealCabinetActor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.a$j$a, reason: collision with other inner class name */
        public /* synthetic */ class C4130a {
            static {
                int[] iArr = new int[Tab.values().length];
                try {
                    iArr[Tab.f136879c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Tab.f136880d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(zw.d dVar, a aVar, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f137044s = dVar;
            this.f137045t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            j jVar = new j(this.f137044s, this.f137045t, continuation);
            jVar.f137043r = obj;
            return jVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealCabinetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f137042q
                r2 = 0
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.a r3 = r9.f137045t
                r4 = 4
                r5 = 3
                r6 = 2
                zw.d r7 = r9.f137044s
                r8 = 1
                if (r1 == 0) goto L36
                if (r1 == r8) goto L2e
                if (r1 == r6) goto L19
                if (r1 == r5) goto L26
                if (r1 != r4) goto L1e
            L19:
                kotlin.C42729a0.b(r10)
                goto L92
            L1e:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L26:
                java.lang.Object r1 = r9.f137043r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L56
            L2e:
                java.lang.Object r1 = r9.f137043r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L7a
            L36:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f137043r
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.tabs.Tab r10 = r7.f444383d
                int r10 = r10.ordinal()
                if (r10 == 0) goto L6d
                if (r10 == r8) goto L49
                goto L92
            L49:
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$ClearMortgageListLoadedPages r10 = com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction.ClearMortgageListLoadedPages.f137080b
                r9.f137043r = r1
                r9.f137042q = r5
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L56
                return r0
            L56:
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.k r10 = r3.f137004a
                zw.f r3 = r7.f444385f
                java.lang.String r5 = r3.f444393c
                com.avito.android.developments_agency_search.domain.GetMortgageListRequestStatus r3 = r3.f444395e
                kotlinx.coroutines.flow.i r10 = r10.a(r8, r5, r3)
                r9.f137043r = r2
                r9.f137042q = r4
                java.lang.Object r10 = kotlinx.coroutines.flow.C43175k.u(r9, r10, r1)
                if (r10 != r0) goto L92
                return r0
            L6d:
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$ClearClientListLoadedPages r10 = com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction.ClearClientListLoadedPages.f137079b
                r9.f137043r = r1
                r9.f137042q = r8
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7a
                return r0
            L7a:
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.k r10 = r3.f137004a
                zw.a r3 = r7.f444384e
                java.lang.String r4 = r3.f444344c
                r5 = 0
                com.avito.android.developments_agency_search.domain.GetClientListRequestStage r3 = r3.f444346e
                kotlinx.coroutines.flow.i r10 = r10.d(r5, r4, r3)
                r9.f137043r = r2
                r9.f137042q = r6
                java.lang.Object r10 = kotlinx.coroutines.flow.C43175k.u(r9, r10, r1)
                if (r10 != r0) goto L92
                return r0
            L92:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.a.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DealCabinetActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetActor$process$3", f = "DealCabinetActor.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealCabinetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f137046q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f137047r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ zw.d f137048s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f137049t;

        /* compiled from: DealCabinetActor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.a$k$a, reason: collision with other inner class name */
        public /* synthetic */ class C4131a {
            static {
                int[] iArr = new int[Tab.values().length];
                try {
                    iArr[Tab.f136879c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Tab.f136880d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(zw.d dVar, a aVar, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f137048s = dVar;
            this.f137049t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            k kVar = new k(this.f137048s, this.f137049t, continuation);
            kVar.f137047r = obj;
            return kVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealCabinetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43160i<DealCabinetInternalAction> interfaceC43160iD;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f137046q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f137047r;
                zw.d dVar = this.f137048s;
                int iOrdinal = dVar.f444383d.ordinal();
                a aVar = this.f137049t;
                if (iOrdinal == 0) {
                    com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.k kVar = aVar.f137004a;
                    C50636a c50636a = dVar.f444384e;
                    interfaceC43160iD = kVar.d(0, c50636a.f444344c, c50636a.f444346e);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.k kVar2 = aVar.f137004a;
                    zw.f fVar = dVar.f444385f;
                    interfaceC43160iD = kVar2.a(1, fVar.f444393c, fVar.f444395e);
                }
                this.f137046q = 1;
                if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: DealCabinetActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetActor$process$4", f = "DealCabinetActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealCabinetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ zw.d f137050q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ a f137051r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(zw.d dVar, a aVar, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f137050q = dVar;
            this.f137051r = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new l(this.f137050q, this.f137051r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealCabinetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            if (this.f137050q.f444383d == Tab.f136880d) {
                this.f137051r.f137006c.e("nd-mortgage-list");
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DealCabinetActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetActor$process$5", f = "DealCabinetActor.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealCabinetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f137052q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f137053r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ zw.d f137054s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f137055t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(zw.d dVar, a aVar, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f137054s = dVar;
            this.f137055t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            m mVar = new m(this.f137054s, this.f137055t, continuation);
            mVar.f137053r = obj;
            return mVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealCabinetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f137052q;
            a aVar = this.f137055t;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f137053r;
                if (this.f137054s.f444383d == Tab.f136880d) {
                    aVar.f137006c.b("nd-mortgage-list");
                    DealCabinetInternalAction.OpenMortgageProApplicationLink openMortgageProApplicationLink = DealCabinetInternalAction.OpenMortgageProApplicationLink.f137096b;
                    this.f137052q = 1;
                    if (interfaceC43172j.emit(openMortgageProApplicationLink, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return G0.f406611a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            aVar.f137006c.a("nd-mortgage-list");
            return G0.f406611a;
        }
    }

    /* compiled from: DealCabinetActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetActor$process$6", f = "DealCabinetActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealCabinetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ zw.b f137056q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ a f137057r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(a aVar, Continuation continuation, zw.b bVar) {
            super(2, continuation);
            this.f137056q = bVar;
            this.f137057r = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new n(this.f137057r, continuation, this.f137056q);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealCabinetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((n) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            if (L.f(((b.C12980b) this.f137056q).f444350a, "MORTGAGE")) {
                this.f137057r.f137006c.e("nd-clients-mortgage");
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DealCabinetActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetActor$process$7", f = "DealCabinetActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealCabinetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ zw.b f137058q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ a f137059r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(a aVar, Continuation continuation, zw.b bVar) {
            super(2, continuation);
            this.f137058q = bVar;
            this.f137059r = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new o(this.f137059r, continuation, this.f137058q);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealCabinetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((o) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            if (L.f(((b.a) this.f137058q).f444349a, "MORTGAGE")) {
                a aVar = this.f137059r;
                aVar.f137006c.b("nd-clients-mortgage");
                aVar.f137006c.a("nd-clients-mortgage");
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DealCabinetActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetActor$process$8", f = "DealCabinetActor.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealCabinetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f137060q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f137061r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ zw.d f137062s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f137063t;

        /* compiled from: DealCabinetActor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.a$p$a, reason: collision with other inner class name */
        public /* synthetic */ class C4132a {
            static {
                int[] iArr = new int[Tab.values().length];
                try {
                    iArr[Tab.f136879c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Tab.f136880d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(zw.d dVar, a aVar, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f137062s = dVar;
            this.f137063t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            p pVar = new p(this.f137062s, this.f137063t, continuation);
            pVar.f137061r = obj;
            return pVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealCabinetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((p) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43160i<DealCabinetInternalAction> interfaceC43160iD;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f137060q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f137061r;
                zw.d dVar = this.f137062s;
                int iOrdinal = dVar.f444383d.ordinal();
                a aVar = this.f137063t;
                if (iOrdinal == 0) {
                    com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.k kVar = aVar.f137004a;
                    C50636a c50636a = dVar.f444384e;
                    interfaceC43160iD = kVar.d(0, c50636a.f444344c, c50636a.f444346e);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.k kVar2 = aVar.f137004a;
                    zw.f fVar = dVar.f444385f;
                    interfaceC43160iD = kVar2.a(1, fVar.f444393c, fVar.f444395e);
                }
                this.f137060q = 1;
                if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: DealCabinetActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetActor$process$9", f = "DealCabinetActor.kt", i = {0}, l = {138, 140}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealCabinetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f137064q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f137065r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ zw.d f137066s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ zw.b f137067t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ a f137068u;

        /* compiled from: DealCabinetActor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.a$q$a, reason: collision with other inner class name */
        public /* synthetic */ class C4133a {
            static {
                int[] iArr = new int[Tab.values().length];
                try {
                    iArr[Tab.f136879c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Tab.f136880d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(a aVar, Continuation continuation, zw.b bVar, zw.d dVar) {
            super(2, continuation);
            this.f137066s = dVar;
            this.f137067t = bVar;
            this.f137068u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            q qVar = new q(this.f137068u, continuation, this.f137067t, this.f137066s);
            qVar.f137065r = obj;
            return qVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealCabinetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((q) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            InterfaceC43160i<DealCabinetInternalAction> interfaceC43160iD;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f137064q;
            zw.b bVar = this.f137067t;
            zw.d dVar = this.f137066s;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f137065r;
                Tab tab = dVar.f444383d;
                Tab tab2 = ((b.s) bVar).f444371a;
                if (tab == tab2) {
                    return G0.f406611a;
                }
                DealCabinetInternalAction.UpdateTab updateTab = new DealCabinetInternalAction.UpdateTab(tab2);
                this.f137065r = interfaceC43172j;
                this.f137064q = 1;
                if (interfaceC43172j.emit(updateTab, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f137065r;
                C42729a0.b(obj);
            }
            int iOrdinal = ((b.s) bVar).f444371a.ordinal();
            a aVar = this.f137068u;
            if (iOrdinal == 0) {
                interfaceC43160iD = aVar.f137004a.d(0, "", dVar.f444384e.f444346e);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC43160iD = aVar.f137004a.a(1, "", dVar.f444385f.f444395e);
            }
            this.f137065r = null;
            this.f137064q = 2;
            if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.k kVar, @Y61.k com.avito.android.developments_agency_search.screen.deal_cabinet.a aVar, @Y61.k InterfaceC50010b interfaceC50010b) {
        this.f137004a = kVar;
        this.f137005b = aVar;
        this.f137006c = interfaceC50010b;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.c(this, aVar, null), C43175k.o(c43197r1, com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.b.f137069l));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<DealCabinetInternalAction> b(@Y61.k zw.b bVar, @Y61.k zw.d dVar) {
        C43210w c43210w;
        if (bVar instanceof b.n) {
            return C43175k.G(new i(dVar, this, null));
        }
        if (bVar instanceof b.g) {
            return C43175k.G(new j(dVar, this, null));
        }
        if (bVar instanceof b.m) {
            return C43175k.G(new k(dVar, this, null));
        }
        if (bVar instanceof b.t) {
            c43210w = new C43210w(DealCabinetInternalAction.CloseScreen.f137084b);
        } else {
            if (bVar instanceof b.i) {
                return C43175k.G(new l(dVar, this, null));
            }
            if (bVar instanceof b.h) {
                return C43175k.G(new m(dVar, this, null));
            }
            if (bVar instanceof b.C12980b) {
                return C43175k.G(new n(this, null, bVar));
            }
            if (bVar instanceof b.a) {
                return C43175k.G(new o(this, null, bVar));
            }
            if (bVar instanceof b.j) {
                return C43175k.G(new p(dVar, this, null));
            }
            if (bVar instanceof b.s) {
                return C43175k.G(new q(this, null, bVar, dVar));
            }
            if (bVar instanceof b.q) {
                return C43175k.G(new b(this, null, bVar, dVar));
            }
            if (bVar instanceof b.p) {
                return C43175k.G(new c(dVar, this, null));
            }
            if (bVar instanceof b.f) {
                return C43175k.G(new d(null, bVar));
            }
            if (bVar instanceof b.c) {
                return C43175k.G(new e(null, bVar));
            }
            if (bVar instanceof b.k) {
                b.k kVar = (b.k) bVar;
                int iOrdinal = kVar.f444362b.ordinal();
                DeepLink deepLink = kVar.f444363c;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        return new C43210w(new DealCabinetInternalAction.ReturnToWork(kVar.f444361a, deepLink));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(new DealCabinetInternalAction.OpenMortgageDeeplink(deepLink));
            } else {
                if (bVar instanceof b.u) {
                    return new C43210w(new DealCabinetInternalAction.OpenMortgageDeeplink(((b.u) bVar).f444373a.f137205b));
                }
                if (bVar instanceof b.d) {
                    return C43175k.G(new f(null, bVar, dVar));
                }
                if (bVar instanceof b.l) {
                    return C43175k.G(new g(null, bVar, dVar));
                }
                if (bVar instanceof b.o) {
                    return C43175k.G(new h(dVar, this, null));
                }
                if (!(bVar instanceof b.e)) {
                    if (bVar instanceof b.r) {
                        return new C43210w(new DealCabinetInternalAction.OpenWebView(((b.r) bVar).f444370a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(DealCabinetInternalAction.HideCommissionPromoBanner.f137088b);
            }
        }
        return c43210w;
    }
}
