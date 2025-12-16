package com.avito.android.map.mvi;

import aY.InterfaceC19840d;
import com.avito.android.map.mvi.entity.MapErrorType;
import com.avito.android.map.mvi.entity.MapInternalAction;
import com.avito.android.map.mvi.entity.a;
import com.avito.android.map_core.view.draw_button.DrawingState;
import com.avito.android.remote.InterfaceC34323k;
import com.avito.android.remote.InterfaceC34333n0;
import com.avito.android.remote.model.MarkersResponse;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import com.avito.android.util.R0;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MapInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/C;", "Lcom/avito/android/map/mvi/y;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class C implements InterfaceC31635y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34333n0 f184891a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34323k f184892b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f184893c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f184894d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map.analytics.e f184895e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.view.e f184896f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Set<String> f184897g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19840d f184898h;

    /* compiled from: MapInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.map.mvi.MapInteractorImpl$loadMapOnboarding$1", f = "MapInteractor.kt", i = {0, 1}, l = {358, 363, 365, 368}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f184899q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f184900r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ SearchParams f184902t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ PresentationType f184903u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SearchParams searchParams, PresentationType presentationType, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f184902t = searchParams;
            this.f184903u = presentationType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = C.this.new a(this.f184902t, this.f184903u, continuation);
            aVar.f184900r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super MapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.f184899q
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
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1d:
                kotlin.C42729a0.b(r13)
                goto Lab
            L22:
                java.lang.Object r1 = r12.f184900r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r13)
                goto L64
            L2a:
                java.lang.Object r1 = r12.f184900r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r13)
                goto L47
            L32:
                kotlin.C42729a0.b(r13)
                java.lang.Object r13 = r12.f184900r
                kotlinx.coroutines.flow.j r13 = (kotlinx.coroutines.flow.InterfaceC43172j) r13
                com.avito.android.map.mvi.entity.MapInternalAction$MapOnboardingLoading r1 = com.avito.android.map.mvi.entity.MapInternalAction.MapOnboardingLoading.f185092b
                r12.f184900r = r13
                r12.f184899q = r5
                java.lang.Object r1 = r13.emit(r1, r12)
                if (r1 != r0) goto L46
                return r0
            L46:
                r1 = r13
            L47:
                com.avito.android.map.mvi.C r13 = com.avito.android.map.mvi.C.this
                com.avito.android.remote.model.SearchParamsConverter r5 = r13.f184893c
                r8 = 0
                com.avito.android.remote.model.PresentationType r9 = r12.f184903u
                com.avito.android.remote.model.SearchParams r6 = r12.f184902t
                r7 = 0
                r10 = 6
                r11 = 0
                java.util.Map r5 = com.avito.android.remote.model.SearchParamsConverter.DefaultImpls.convertToMap$default(r5, r6, r7, r8, r9, r10, r11)
                r12.f184900r = r1
                r12.f184899q = r4
                com.avito.android.remote.n0 r13 = r13.f184891a
                java.lang.Object r13 = r13.d(r5, r12)
                if (r13 != r0) goto L64
                return r0
            L64:
                com.avito.android.remote.model.TypedResult r13 = (com.avito.android.remote.model.TypedResult) r13
                boolean r4 = r13 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L87
                com.avito.android.remote.model.TypedResult$Success r13 = (com.avito.android.remote.model.TypedResult.Success) r13
                java.lang.Object r13 = r13.getResult()
                com.avito.android.remote.model.MapOnboardingResponse r13 = (com.avito.android.remote.model.MapOnboardingResponse) r13
                com.avito.android.map.mvi.entity.MapInternalAction$MapOnboardingLoaded r2 = new com.avito.android.map.mvi.entity.MapInternalAction$MapOnboardingLoaded
                com.avito.android.remote.model.MapOnboarding r13 = r13.getMapOnboarding()
                r2.<init>(r13)
                r12.f184900r = r5
                r12.f184899q = r3
                java.lang.Object r13 = r1.emit(r2, r12)
                if (r13 != r0) goto Lab
                return r0
            L87:
                boolean r3 = r13 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto Lae
                com.avito.android.remote.model.TypedResult$Error r13 = (com.avito.android.remote.model.TypedResult.Error) r13
                com.avito.android.remote.error.ApiError r3 = r13.getError()
                java.lang.Throwable r13 = r13.getCause()
                com.avito.android.util.ApiException r13 = com.avito.android.util.C35936s.a(r3, r13)
                com.avito.android.map.mvi.entity.MapInternalAction$Error r3 = new com.avito.android.map.mvi.entity.MapInternalAction$Error
                com.avito.android.map.mvi.entity.MapErrorType r4 = com.avito.android.map.mvi.entity.MapErrorType.f185058g
                r3.<init>(r13, r4)
                r12.f184900r = r5
                r12.f184899q = r2
                java.lang.Object r13 = r1.emit(r3, r12)
                if (r13 != r0) goto Lab
                return r0
            Lab:
                kotlin.G0 r13 = kotlin.G0.f406611a
                return r13
            Lae:
                kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
                r13.<init>()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.map.mvi.C.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: MapInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.map.mvi.MapInteractorImpl$loadMapOnboarding$2", f = "MapInteractor.kt", i = {}, l = {373}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super MapInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f184904q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f184905r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f184906s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super MapInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f184905r = interfaceC43172j;
            bVar.f184906s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f184904q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f184905r;
                MapInternalAction.Error error = new MapInternalAction.Error(this.f184906s, MapErrorType.f185058g);
                this.f184905r = null;
                this.f184904q = 1;
                if (interfaceC43172j.emit(error, this) == coroutine_suspended) {
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

    /* compiled from: MapInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.map.mvi.MapInteractorImpl$loadMarkers$1", f = "MapInteractor.kt", i = {0, 1, 1, 1}, l = {112, 118, 150, 172}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "it", "subscriptionState"}, s = {"L$0", "L$0", "L$6", "L$7"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public int f184907A;

        /* renamed from: B, reason: collision with root package name */
        public /* synthetic */ Object f184908B;

        /* renamed from: D, reason: collision with root package name */
        public final /* synthetic */ SearchParams f184910D;

        /* renamed from: E, reason: collision with root package name */
        public final /* synthetic */ PresentationType f184911E;

        /* renamed from: F, reason: collision with root package name */
        public final /* synthetic */ Area f184912F;

        /* renamed from: G, reason: collision with root package name */
        public final /* synthetic */ String f184913G;

        /* renamed from: H, reason: collision with root package name */
        public final /* synthetic */ boolean f184914H;

        /* renamed from: I, reason: collision with root package name */
        public final /* synthetic */ DrawingState f184915I;

        /* renamed from: J, reason: collision with root package name */
        public final /* synthetic */ boolean f184916J;

        /* renamed from: K, reason: collision with root package name */
        public final /* synthetic */ Float f184917K;

        /* renamed from: L, reason: collision with root package name */
        public final /* synthetic */ boolean f184918L;

        /* renamed from: M, reason: collision with root package name */
        public final /* synthetic */ boolean f184919M;

        /* renamed from: q, reason: collision with root package name */
        public C f184920q;

        /* renamed from: r, reason: collision with root package name */
        public DrawingState f184921r;

        /* renamed from: s, reason: collision with root package name */
        public Area f184922s;

        /* renamed from: t, reason: collision with root package name */
        public Float f184923t;

        /* renamed from: u, reason: collision with root package name */
        public SearchParams f184924u;

        /* renamed from: v, reason: collision with root package name */
        public MarkersResponse f184925v;

        /* renamed from: w, reason: collision with root package name */
        public InlineAction.Predefined.State f184926w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f184927x;

        /* renamed from: y, reason: collision with root package name */
        public boolean f184928y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f184929z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SearchParams searchParams, PresentationType presentationType, Area area, String str, boolean z12, DrawingState drawingState, boolean z13, Float f12, boolean z14, boolean z15, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f184910D = searchParams;
            this.f184911E = presentationType;
            this.f184912F = area;
            this.f184913G = str;
            this.f184914H = z12;
            this.f184915I = drawingState;
            this.f184916J = z13;
            this.f184917K = f12;
            this.f184918L = z14;
            this.f184919M = z15;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = C.this.new c(this.f184910D, this.f184911E, this.f184912F, this.f184913G, this.f184914H, this.f184915I, this.f184916J, this.f184917K, this.f184918L, this.f184919M, continuation);
            cVar.f184908B = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super MapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0198  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x019a  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01e6 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r37) {
            /*
                Method dump skipped, instructions count: 533
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.map.mvi.C.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: MapInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.map.mvi.MapInteractorImpl$loadMarkers$2", f = "MapInteractor.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f184930q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f184931r;

        public d() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(2, continuation);
            dVar.f184931r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super MapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f184930q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f184931r;
                MapInternalAction.MarkersLoading markersLoading = new MapInternalAction.MarkersLoading();
                this.f184930q = 1;
                if (interfaceC43172j.emit(markersLoading, this) == coroutine_suspended) {
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

    /* compiled from: MapInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.map.mvi.MapInteractorImpl$loadMarkers$3", f = "MapInteractor.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.q<InterfaceC43172j<? super MapInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f184932q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f184933r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f184934s;

        public e() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super MapInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            e eVar = new e(3, continuation);
            eVar.f184933r = interfaceC43172j;
            eVar.f184934s = th2;
            return eVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f184932q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f184933r;
                MapInternalAction.Error error = new MapInternalAction.Error(this.f184934s, MapErrorType.f185054c);
                this.f184933r = null;
                this.f184932q = 1;
                if (interfaceC43172j.emit(error, this) == coroutine_suspended) {
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
    public C(@Y61.k InterfaceC34333n0 interfaceC34333n0, @Y61.k InterfaceC34323k interfaceC34323k, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k R0 r02, @Y61.k com.avito.android.map.analytics.e eVar, @Y61.k com.avito.android.map_core.view.e eVar2, @Y61.k Set<String> set, @Y61.k InterfaceC19840d interfaceC19840d) {
        this.f184891a = interfaceC34333n0;
        this.f184892b = interfaceC34323k;
        this.f184893c = searchParamsConverter;
        this.f184894d = r02;
        this.f184895e = eVar;
        this.f184896f = eVar2;
        this.f184897g = set;
        this.f184898h = interfaceC19840d;
    }

    public static final String f(C c12, List list, int i12) {
        c12.getClass();
        return C43033p.w(C43033p.C(C43033p.f(new C42770s0(list), i12), 20), ",", null, 62);
    }

    @Override // com.avito.android.map.mvi.InterfaceC31635y
    @Y61.k
    public final InterfaceC43160i<MapInternalAction> a(@Y61.k SearchParams searchParams, @Y61.k PresentationType presentationType) {
        return C43175k.I(this.f184894d.a(), new C43152f0(C43175k.G(new a(searchParams, presentationType, null)), new b(3, null)));
    }

    @Override // com.avito.android.map.mvi.InterfaceC31635y
    @Y61.k
    public final InterfaceC43160i<MapInternalAction> b(@Y61.l Area area, @Y61.l String str, @Y61.k DrawingState drawingState, @Y61.k PresentationType presentationType, @Y61.k SearchParams searchParams, @Y61.l Float f12, boolean z12, boolean z13, boolean z14, boolean z15) {
        return C43175k.I(this.f184894d.a(), new C43152f0(new C43137a0(new d(2, null), C43175k.G(new c(searchParams, presentationType, area, str, z13, drawingState, z14, f12, z12, z15, null))), new e(3, null)));
    }

    @Override // com.avito.android.map.mvi.InterfaceC31635y
    @Y61.k
    public final InterfaceC43160i c(@Y61.l List list) {
        return C43175k.I(this.f184894d.a(), new C43152f0(new C43137a0(new H(2, null), C43175k.G(new G(this, list, null))), new I(3, null)));
    }

    @Override // com.avito.android.map.mvi.InterfaceC31635y
    @Y61.k
    public final InterfaceC43160i d(@Y61.l a.C5436a.C5437a c5437a, boolean z12, @Y61.k SearchParams searchParams, int i12) {
        return C43175k.I(this.f184894d.a(), new C43152f0(new C43137a0(new A(c5437a, z12, null), C43175k.G(new C31636z(this, searchParams, c5437a, i12, z12, null))), new B(3, null)));
    }

    @Override // com.avito.android.map.mvi.InterfaceC31635y
    @Y61.k
    public final InterfaceC43160i e(@Y61.l a.C5436a.C5437a c5437a, boolean z12, @Y61.k SearchParams searchParams, int i12, @Y61.k PresentationType presentationType) {
        return C43175k.I(this.f184894d.a(), new C43152f0(new C43137a0(new E(c5437a, z12, null), C43175k.G(new D(this, searchParams, c5437a, presentationType, i12, z12, null))), new F(3, null)));
    }
}
