package com.avito.android.developments_agency_search.screen.big_filters;

import Qw.InterfaceC14939a;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.screen.big_filters.mvi.entity.BigFiltersInternalAction;
import com.avito.android.remote.model.SearchParams;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import sw.InterfaceC48423a;

/* compiled from: BigFiltersInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/g;", "Lcom/avito/android/developments_agency_search/screen/big_filters/f;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.screen.shared.a f136652a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48423a f136653b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14939a f136654c;

    /* compiled from: BigFiltersInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.big_filters.BigFiltersInteractorImpl$loadFilteredLotsCount$1", f = "BigFiltersInteractor.kt", i = {0, 1}, l = {46, 48, 51}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BigFiltersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f136655q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f136656r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ SearchParams f136658t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SearchParams searchParams, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f136658t = searchParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = g.this.new a(this.f136658t, continuation);
            aVar.f136656r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BigFiltersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0157  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r27) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 370
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.big_filters.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BigFiltersInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.big_filters.BigFiltersInteractorImpl$loadFilters$1", f = "BigFiltersInteractor.kt", i = {0, 1}, l = {30, 33, 35, 38}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BigFiltersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f136659q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f136660r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ SearchParams f136662t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SearchParams searchParams, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f136662t = searchParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = g.this.new b(this.f136662t, continuation);
            bVar.f136660r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BigFiltersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f136659q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L33
                if (r1 == r5) goto L2b
                if (r1 == r4) goto L23
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                kotlin.C42729a0.b(r9)
                goto La2
            L23:
                java.lang.Object r1 = r8.f136660r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L62
            L2b:
                java.lang.Object r1 = r8.f136660r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L4b
            L33:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f136660r
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                com.avito.android.developments_agency_search.screen.big_filters.mvi.entity.BigFiltersInternalAction$FiltersLoading$StartLoading r1 = new com.avito.android.developments_agency_search.screen.big_filters.mvi.entity.BigFiltersInternalAction$FiltersLoading$StartLoading
                r1.<init>(r6, r5, r6)
                r8.f136660r = r9
                r8.f136659q = r5
                java.lang.Object r1 = r9.emit(r1, r8)
                if (r1 != r0) goto L4a
                return r0
            L4a:
                r1 = r9
            L4b:
                com.avito.android.developments_agency_search.screen.big_filters.g r9 = com.avito.android.developments_agency_search.screen.big_filters.g.this
                com.avito.android.developments_agency_search.screen.shared.a r5 = r9.f136652a
                com.avito.android.remote.model.SearchParams r7 = r8.f136662t
                java.util.Map r5 = r5.b(r7)
                r8.f136660r = r1
                r8.f136659q = r4
                sw.a r9 = r9.f136653b
                java.lang.Object r9 = r9.c(r5, r8)
                if (r9 != r0) goto L62
                return r0
            L62:
                com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
                boolean r4 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r4 == 0) goto L80
                com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
                java.lang.Object r9 = r9.getResult()
                com.avito.android.remote.model.SearchParameters r9 = (com.avito.android.remote.model.SearchParameters) r9
                com.avito.android.developments_agency_search.screen.big_filters.mvi.entity.BigFiltersInternalAction$FiltersLoading$Loaded r2 = new com.avito.android.developments_agency_search.screen.big_filters.mvi.entity.BigFiltersInternalAction$FiltersLoading$Loaded
                r2.<init>(r9)
                r8.f136660r = r6
                r8.f136659q = r3
                java.lang.Object r9 = r1.emit(r2, r8)
                if (r9 != r0) goto La2
                return r0
            L80:
                boolean r3 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto La5
                com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
                com.avito.android.remote.error.ApiError r3 = r9.getError()
                java.lang.Throwable r9 = r9.getCause()
                com.avito.android.util.ApiException r9 = com.avito.android.util.C35936s.a(r3, r9)
                com.avito.android.developments_agency_search.screen.big_filters.mvi.entity.BigFiltersInternalAction$FiltersLoading$LoadingError r3 = new com.avito.android.developments_agency_search.screen.big_filters.mvi.entity.BigFiltersInternalAction$FiltersLoading$LoadingError
                r3.<init>(r9)
                r8.f136660r = r6
                r8.f136659q = r2
                java.lang.Object r9 = r1.emit(r3, r8)
                if (r9 != r0) goto La2
                return r0
            La2:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            La5:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.big_filters.g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public g(@Y61.k com.avito.android.developments_agency_search.screen.shared.a aVar, @Y61.k InterfaceC48423a interfaceC48423a, @Y61.k InterfaceC14939a interfaceC14939a) {
        this.f136652a = aVar;
        this.f136653b = interfaceC48423a;
        this.f136654c = interfaceC14939a;
    }

    @Override // com.avito.android.developments_agency_search.screen.big_filters.f
    @Y61.k
    public final InterfaceC43160i<BigFiltersInternalAction> a(@Y61.k SearchParams searchParams) {
        return C43175k.G(new a(searchParams, null));
    }

    @Override // com.avito.android.developments_agency_search.screen.big_filters.f
    @Y61.k
    public final InterfaceC43160i<BigFiltersInternalAction> b(@Y61.k SearchParams searchParams) {
        return C43175k.G(new b(searchParams, null));
    }
}
