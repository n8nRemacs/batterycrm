package com.avito.android.developments_agency_search.screen.deal_cabinet.mvi;

import Qw.InterfaceC14939a;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.domain.GetClientListRequestStage;
import com.avito.android.developments_agency_search.domain.GetMortgageListRequestStatus;
import com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import sw.InterfaceC48423a;

/* compiled from: DealCabinetInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/l;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/k;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48423a f137125a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14939a f137126b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f137127c;

    /* compiled from: DealCabinetInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetInteractorImpl$loadClientList$1", f = "DealCabinetInteractor.kt", i = {0, 1}, l = {85, 87, 94, 97}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f137128q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f137129r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ GetClientListRequestStage f137131t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f137132u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f137133v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GetClientListRequestStage getClientListRequestStage, int i12, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f137131t = getClientListRequestStage;
            this.f137132u = i12;
            this.f137133v = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = l.this.new a(this.f137131t, this.f137132u, this.f137133v, continuation);
            aVar.f137129r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
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
                int r1 = r11.f137128q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1d:
                kotlin.C42729a0.b(r12)
                goto La5
            L22:
                java.lang.Object r1 = r11.f137129r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto L64
            L2a:
                java.lang.Object r1 = r11.f137129r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto L4a
            L32:
                kotlin.C42729a0.b(r12)
                java.lang.Object r12 = r11.f137129r
                kotlinx.coroutines.flow.j r12 = (kotlinx.coroutines.flow.InterfaceC43172j) r12
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$ClientsLoading$StartLoading r1 = new com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$ClientsLoading$StartLoading
                r1.<init>()
                r11.f137129r = r12
                r11.f137128q = r5
                java.lang.Object r1 = r12.emit(r1, r11)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r12
            L4a:
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.l r12 = com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.l.this
                sw.a r5 = r12.f137125a
                com.avito.android.developments_agency_search.domain.GetClientListRequestStage r12 = r11.f137131t
                java.lang.String r9 = r12.f136500b
                r11.f137129r = r1
                r11.f137128q = r4
                int r7 = r11.f137132u
                java.lang.String r8 = r11.f137133v
                r6 = 30
                r10 = r11
                java.lang.Object r12 = r5.f(r6, r7, r8, r9, r10)
                if (r12 != r0) goto L64
                return r0
            L64:
                com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
                boolean r4 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L83
                com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
                java.lang.Object r12 = r12.getResult()
                com.avito.android.developments_agency_search.domain.GetClientListResponse r12 = (com.avito.android.developments_agency_search.domain.GetClientListResponse) r12
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$ClientsLoading$Loaded r2 = new com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$ClientsLoading$Loaded
                r2.<init>(r12)
                r11.f137129r = r5
                r11.f137128q = r3
                java.lang.Object r12 = r1.emit(r2, r11)
                if (r12 != r0) goto La5
                return r0
            L83:
                boolean r3 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto La8
                com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
                com.avito.android.remote.error.ApiError r3 = r12.getError()
                java.lang.Throwable r12 = r12.getCause()
                com.avito.android.util.ApiException r12 = com.avito.android.util.C35936s.a(r3, r12)
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$ClientsLoading$LoadingError r3 = new com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$ClientsLoading$LoadingError
                r3.<init>(r12)
                r11.f137129r = r5
                r11.f137128q = r2
                java.lang.Object r12 = r1.emit(r3, r11)
                if (r12 != r0) goto La5
                return r0
            La5:
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            La8:
                kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DealCabinetInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetInteractorImpl$loadDealUpdates$1", f = "DealCabinetInteractor.kt", i = {0, 1}, l = {66, 68, 71, 74}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f137134q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f137135r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = l.this.new b(continuation);
            bVar.f137135r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f137134q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                kotlin.C42729a0.b(r7)
                goto L9a
            L22:
                java.lang.Object r1 = r6.f137135r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L59
            L2a:
                java.lang.Object r1 = r6.f137135r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L4a
            L32:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f137135r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$DealUpdatesLoading$StartLoading r1 = new com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$DealUpdatesLoading$StartLoading
                r1.<init>()
                r6.f137135r = r7
                r6.f137134q = r5
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r7
            L4a:
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.l r7 = com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.l.this
                sw.a r7 = r7.f137125a
                r6.f137135r = r1
                r6.f137134q = r4
                java.lang.Object r7 = r7.b(r6)
                if (r7 != r0) goto L59
                return r0
            L59:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L78
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r7 = r7.getResult()
                com.avito.android.developments_agency_search.domain.GetDealUpdatesResponse r7 = (com.avito.android.developments_agency_search.domain.GetDealUpdatesResponse) r7
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$DealUpdatesLoading$Loaded r2 = new com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$DealUpdatesLoading$Loaded
                r2.<init>(r7)
                r6.f137135r = r5
                r6.f137134q = r3
                java.lang.Object r7 = r1.emit(r2, r6)
                if (r7 != r0) goto L9a
                return r0
            L78:
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L9d
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r3 = r7.getError()
                java.lang.Throwable r7 = r7.getCause()
                com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r3, r7)
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$DealUpdatesLoading$LoadingError r3 = new com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$DealUpdatesLoading$LoadingError
                r3.<init>(r7)
                r6.f137135r = r5
                r6.f137134q = r2
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto L9a
                return r0
            L9a:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            L9d:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DealCabinetInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetInteractorImpl$loadHeaderBanners$1", f = "DealCabinetInteractor.kt", i = {0, 1}, l = {52, 54, 57, 60}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealCabinetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f137137q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f137138r;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = l.this.new c(continuation);
            cVar.f137138r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DealCabinetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f137137q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                kotlin.C42729a0.b(r7)
                goto L9a
            L22:
                java.lang.Object r1 = r6.f137138r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L59
            L2a:
                java.lang.Object r1 = r6.f137138r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L4a
            L32:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f137138r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$BannersLoading$StartLoading r1 = new com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$BannersLoading$StartLoading
                r1.<init>()
                r6.f137138r = r7
                r6.f137137q = r5
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r7
            L4a:
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.l r7 = com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.l.this
                sw.a r7 = r7.f137125a
                r6.f137138r = r1
                r6.f137137q = r4
                java.lang.Object r7 = r7.i(r6)
                if (r7 != r0) goto L59
                return r0
            L59:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L78
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r7 = r7.getResult()
                com.avito.android.developments_agency_search.domain.GetDealCabinetHeader r7 = (com.avito.android.developments_agency_search.domain.GetDealCabinetHeader) r7
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$BannersLoading$Loaded r2 = new com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$BannersLoading$Loaded
                r2.<init>(r7)
                r6.f137138r = r5
                r6.f137137q = r3
                java.lang.Object r7 = r1.emit(r2, r6)
                if (r7 != r0) goto L9a
                return r0
            L78:
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L9d
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r3 = r7.getError()
                java.lang.Throwable r7 = r7.getCause()
                com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r3, r7)
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$BannersLoading$LoadingError r3 = new com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$BannersLoading$LoadingError
                r3.<init>(r7)
                r6.f137138r = r5
                r6.f137137q = r2
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto L9a
                return r0
            L9a:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            L9d:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.l.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DealCabinetInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.DealCabinetInteractorImpl$loadMortgageList$1", f = "DealCabinetInteractor.kt", i = {0, 1}, l = {108, 110, 117, 120}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f137140q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f137141r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f137143t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f137144u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ GetMortgageListRequestStatus f137145v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i12, String str, GetMortgageListRequestStatus getMortgageListRequestStatus, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f137143t = i12;
            this.f137144u = str;
            this.f137145v = getMortgageListRequestStatus;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = l.this.new d(this.f137143t, this.f137144u, this.f137145v, continuation);
            dVar.f137141r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.f137140q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1d:
                kotlin.C42729a0.b(r14)
                goto La6
            L22:
                java.lang.Object r1 = r13.f137141r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L65
            L2a:
                java.lang.Object r1 = r13.f137141r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L4a
            L32:
                kotlin.C42729a0.b(r14)
                java.lang.Object r14 = r13.f137141r
                kotlinx.coroutines.flow.j r14 = (kotlinx.coroutines.flow.InterfaceC43172j) r14
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$MortgageLoading$StartLoading r1 = new com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$MortgageLoading$StartLoading
                r1.<init>()
                r13.f137141r = r14
                r13.f137140q = r5
                java.lang.Object r1 = r14.emit(r1, r13)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r14
            L4a:
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.l r14 = com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.l.this
                Qw.a r5 = r14.f137126b
                int r14 = r13.f137143t
                long r6 = (long) r14
                com.avito.android.developments_agency_search.domain.GetMortgageListRequestStatus r14 = r13.f137145v
                java.lang.String r11 = r14.f136532b
                r13.f137141r = r1
                r13.f137140q = r4
                r8 = 20
                java.lang.String r10 = r13.f137144u
                r12 = r13
                java.lang.Object r14 = r5.l(r6, r8, r10, r11, r12)
                if (r14 != r0) goto L65
                return r0
            L65:
                com.avito.android.remote.model.TypedResult r14 = (com.avito.android.remote.model.TypedResult) r14
                boolean r4 = r14 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L84
                com.avito.android.remote.model.TypedResult$Success r14 = (com.avito.android.remote.model.TypedResult.Success) r14
                java.lang.Object r14 = r14.getResult()
                Xw.a r14 = (Xw.C17054a) r14
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$MortgageLoading$Loaded r2 = new com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$MortgageLoading$Loaded
                r2.<init>(r14)
                r13.f137141r = r5
                r13.f137140q = r3
                java.lang.Object r14 = r1.emit(r2, r13)
                if (r14 != r0) goto La6
                return r0
            L84:
                boolean r3 = r14 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto La9
                com.avito.android.remote.model.TypedResult$Error r14 = (com.avito.android.remote.model.TypedResult.Error) r14
                com.avito.android.remote.error.ApiError r3 = r14.getError()
                java.lang.Throwable r14 = r14.getCause()
                com.avito.android.util.ApiException r14 = com.avito.android.util.C35936s.a(r3, r14)
                com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$MortgageLoading$LoadingError r3 = new com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction$MortgageLoading$LoadingError
                r3.<init>(r14)
                r13.f137141r = r5
                r13.f137140q = r2
                java.lang.Object r14 = r1.emit(r3, r13)
                if (r14 != r0) goto La6
                return r0
            La6:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            La9:
                kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
                r14.<init>()
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.l.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public l(@Y61.k InterfaceC48423a interfaceC48423a, @Y61.k InterfaceC14939a interfaceC14939a, @Y61.k R0 r02) {
        this.f137125a = interfaceC48423a;
        this.f137126b = interfaceC14939a;
        this.f137127c = r02;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.k
    @Y61.k
    public final InterfaceC43160i<DealCabinetInternalAction> a(int i12, @Y61.k String str, @Y61.k GetMortgageListRequestStatus getMortgageListRequestStatus) {
        return C43175k.I(this.f137127c.a(), C43175k.G(new d(i12, str, getMortgageListRequestStatus, null)));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.k
    @Y61.l
    public final Object b(@Y61.k String str, @Y61.k Continuation continuation) {
        return C43259k.g(this.f137127c.a(), new m(this, str, null), continuation);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.k
    @Y61.k
    public final InterfaceC43160i<DealCabinetInternalAction> c() {
        return C43175k.G(new c(null));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.k
    @Y61.k
    public final InterfaceC43160i<DealCabinetInternalAction> d(int i12, @Y61.k String str, @Y61.k GetClientListRequestStage getClientListRequestStage) {
        return C43175k.I(this.f137127c.a(), C43175k.G(new a(getClientListRequestStage, i12, str, null)));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.k
    @Y61.k
    public final InterfaceC43160i<DealCabinetInternalAction> e() {
        return C43175k.I(this.f137127c.a(), C43175k.G(new b(null)));
    }
}
