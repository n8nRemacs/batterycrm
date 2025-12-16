package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Qw.InterfaceC14939a;
import com.avito.android.developments_agency_search.domain.GetMapMarkersResponse;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.DevelopmentSort;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.LotSort;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import com.avito.android.util.R0;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ri0.InterfaceC47661a;
import sw.InterfaceC48423a;

/* compiled from: RealtyAgencySearchInteractor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/I;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/E;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class I implements E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48423a f138725a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14939a f138726b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f138727c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.screen.realty_agency_search.a f138728d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.screen.shared.a f138729e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Kw.e f138730f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47661a f138731g;

    /* compiled from: RealtyAgencySearchInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchInteractorImpl$loadMapDevelopmentTooltip$1", f = "RealtyAgencySearchInteractor.kt", i = {0, 1}, l = {176, 178, 181, 184}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RealtyAgencySearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f138732q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f138733r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f138735t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f138735t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = I.this.new a(this.f138735t, continuation);
            aVar.f138733r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RealtyAgencySearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f138732q
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
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                kotlin.C42729a0.b(r8)
                goto L9c
            L23:
                java.lang.Object r1 = r7.f138733r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5c
            L2b:
                java.lang.Object r1 = r7.f138733r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4b
            L33:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f138733r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading$StartLoading r1 = new com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading$StartLoading
                r1.<init>(r6, r5, r6)
                r7.f138733r = r8
                r7.f138732q = r5
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L4a
                return r0
            L4a:
                r1 = r8
            L4b:
                com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.I r8 = com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.I.this
                sw.a r8 = r8.f138725a
                r7.f138733r = r1
                r7.f138732q = r4
                java.lang.String r4 = r7.f138735t
                java.lang.Object r8 = r8.h(r4, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r4 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r4 == 0) goto L7a
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                com.avito.android.developments_agency_search.domain.GetDevelopmentTooltipInfo r8 = (com.avito.android.developments_agency_search.domain.GetDevelopmentTooltipInfo) r8
                com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading$Loaded r2 = new com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading$Loaded
                r2.<init>(r8)
                r7.f138733r = r6
                r7.f138732q = r3
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto L9c
                return r0
            L7a:
                boolean r3 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L9f
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r3 = r8.getError()
                java.lang.Throwable r8 = r8.getCause()
                com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r3, r8)
                com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading$LoadingError r3 = new com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading$LoadingError
                r3.<init>(r8)
                r7.f138733r = r6
                r7.f138732q = r2
                java.lang.Object r8 = r1.emit(r3, r7)
                if (r8 != r0) goto L9c
                return r0
            L9c:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            L9f:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.I.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: RealtyAgencySearchInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchInteractorImpl$loadMapMarkers$1", f = "RealtyAgencySearchInteractor.kt", i = {0}, l = {161, 167}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RealtyAgencySearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f138736q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f138737r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ SearchParams f138739t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f138740u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SearchParams searchParams, int i12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f138739t = searchParams;
            this.f138740u = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = I.this.new b(this.f138739t, this.f138740u, continuation);
            bVar.f138737r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RealtyAgencySearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f138736q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f138737r;
                I i13 = I.this;
                InterfaceC48423a interfaceC48423a = i13.f138725a;
                Map<String, String> mapB = i13.f138729e.b(this.f138739t);
                this.f138737r = interfaceC43172j;
                this.f138736q = 1;
                obj = interfaceC48423a.d(mapB, this.f138740u, false, this);
                if (obj == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f138737r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                RealtyAgencySearchInternalAction.Map.UpdateLastLoadedMarkers updateLastLoadedMarkers = new RealtyAgencySearchInternalAction.Map.UpdateLastLoadedMarkers((GetMapMarkersResponse) ((TypedResult.Success) typedResult).getResult());
                this.f138737r = null;
                this.f138736q = 2;
                if (interfaceC43172j.emit(updateLastLoadedMarkers, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                C35936s.a(error.getError(), error.getCause());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyAgencySearchInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchInteractorImpl$loadSearchResult$1", f = "RealtyAgencySearchInteractor.kt", i = {0}, l = {128, 133, 144}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RealtyAgencySearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f138741q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f138742r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f138743s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Tab f138744t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ I f138745u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SearchParams f138746v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f138747w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ DevelopmentSort f138748x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ LotSort f138749y;

        /* compiled from: RealtyAgencySearchInteractor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[Tab.values().length];
                try {
                    iArr[Tab.f138450c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Tab.f138451d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, Tab tab, I i13, SearchParams searchParams, boolean z12, DevelopmentSort developmentSort, LotSort lotSort, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f138743s = i12;
            this.f138744t = tab;
            this.f138745u = i13;
            this.f138746v = searchParams;
            this.f138747w = z12;
            this.f138748x = developmentSort;
            this.f138749y = lotSort;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f138743s, this.f138744t, this.f138745u, this.f138746v, this.f138747w, this.f138748x, this.f138749y, continuation);
            cVar.f138742r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RealtyAgencySearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f138741q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f138742r;
                if (this.f138743s == 1) {
                    RealtyAgencySearchInternalAction.ScrollToTop scrollToTop = RealtyAgencySearchInternalAction.ScrollToTop.f138861b;
                    this.f138742r = interfaceC43172j;
                    this.f138741q = 1;
                    if (interfaceC43172j.emit(scrollToTop, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f138742r;
                C42729a0.b(obj);
            }
            int iOrdinal = this.f138744t.ordinal();
            I i13 = this.f138745u;
            if (iOrdinal == 0) {
                i13.getClass();
                InterfaceC43160i interfaceC43160iI = C43175k.I(i13.f138727c.a(), C43175k.G(new G(this.f138743s, i13, this.f138746v, this.f138747w, this.f138748x, null)));
                this.f138742r = null;
                this.f138741q = 2;
                if (C43175k.u(this, interfaceC43160iI, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (iOrdinal == 1) {
                i13.getClass();
                InterfaceC43160i interfaceC43160iI2 = C43175k.I(i13.f138727c.a(), C43175k.G(new H(this.f138743s, i13, this.f138746v, this.f138747w, this.f138749y, null)));
                this.f138742r = null;
                this.f138741q = 3;
                if (C43175k.u(this, interfaceC43160iI2, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public I(@Y61.k InterfaceC48423a interfaceC48423a, @Y61.k InterfaceC14939a interfaceC14939a, @Y61.k R0 r02, @Y61.k com.avito.android.developments_agency_search.screen.realty_agency_search.a aVar, @Y61.k com.avito.android.developments_agency_search.screen.shared.a aVar2, @Y61.k Kw.e eVar, @Y61.k InterfaceC47661a interfaceC47661a) {
        this.f138725a = interfaceC48423a;
        this.f138726b = interfaceC14939a;
        this.f138727c = r02;
        this.f138728d = aVar;
        this.f138729e = aVar2;
        this.f138730f = eVar;
        this.f138731g = interfaceC47661a;
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.E
    @Y61.k
    public final InterfaceC43160i<RealtyAgencySearchInternalAction> a(@Y61.k String str) {
        return C43175k.G(new a(str, null));
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.E
    @Y61.k
    public final InterfaceC43160i<RealtyAgencySearchInternalAction> b(@Y61.k SearchParams searchParams, int i12) {
        return C43175k.G(new b(searchParams, i12, null));
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.E
    @Y61.k
    public final InterfaceC43160i c(@Y61.k RealtyAgencySearchArguments.MapArguments mapArguments, @Y61.l RealtyAgencySearchArguments.CommissionPromoBanner commissionPromoBanner) {
        return C43175k.G(new F(this, commissionPromoBanner, mapArguments, null));
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.E
    @Y61.k
    public final InterfaceC43160i d(int i12, @Y61.k Tab tab, @Y61.k DevelopmentSort developmentSort, @Y61.k LotSort lotSort, @Y61.k SearchParams searchParams, boolean z12) {
        return C43175k.G(new c(i12, tab, this, searchParams, z12, developmentSort, lotSort, null));
    }
}
