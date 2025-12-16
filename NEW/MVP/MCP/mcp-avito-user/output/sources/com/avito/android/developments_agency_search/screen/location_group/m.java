package com.avito.android.developments_agency_search.screen.location_group;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.screen.location_group.mvi.entity.LocationGroupInternalAction;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.SearchParameters;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.GroupParameter;
import com.avito.android.remote.model.category_parameters.LocationParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.util.R0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import sw.InterfaceC48423a;

/* compiled from: LocationGroupInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/m;", "Lcom/avito/android/developments_agency_search/screen/location_group/l;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f138125a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48423a f138126b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo_common.interactor.g f138127c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f138128d;

    /* compiled from: LocationGroupInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.location_group.LocationGroupInteractorImpl$load$1", f = "LocationGroupInteractor.kt", i = {0, 1}, l = {40, 43, 47, 52}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f138129q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f138130r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ SearchParams f138132t;

        /* compiled from: LocationGroupInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.location_group.LocationGroupInteractorImpl$load$1$1", f = "LocationGroupInteractor.kt", i = {0}, l = {60, 61, 57, 65}, m = "invokeSuspend", n = {"metroStationsDeferred"}, s = {"L$0"})
        /* renamed from: com.avito.android.developments_agency_search.screen.location_group.m$a$a, reason: collision with other inner class name */
        public static final class C4168a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public Object f138133q;

            /* renamed from: r, reason: collision with root package name */
            public Object f138134r;

            /* renamed from: s, reason: collision with root package name */
            public int f138135s;

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f138136t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<?> f138137u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ SearchParameters f138138v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ m f138139w;

            /* compiled from: LocationGroupInteractor.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "", "Lcom/avito/android/remote/model/District;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.location_group.LocationGroupInteractorImpl$load$1$1$districtsDeferred$1", f = "LocationGroupInteractor.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.developments_agency_search.screen.location_group.m$a$a$a, reason: collision with other inner class name */
            public static final class C4169a extends SuspendLambda implements p<T, Continuation<? super TypedResult<List<? extends District>>>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f138140q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ m f138141r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ SearchParameters f138142s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4169a(m mVar, SearchParameters searchParameters, Continuation<? super C4169a> continuation) {
                    super(2, continuation);
                    this.f138141r = mVar;
                    this.f138142s = searchParameters;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C4169a(this.f138141r, this.f138142s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super TypedResult<List<? extends District>>> continuation) {
                    return ((C4169a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x008d A[RETURN] */
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
                        int r1 = r8.f138140q
                        r2 = 1
                        if (r1 == 0) goto L18
                        if (r1 != r2) goto L10
                        kotlin.C42729a0.b(r9)
                        goto L8e
                    L10:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L18:
                        kotlin.C42729a0.b(r9)
                        r8.f138140q = r2
                        com.avito.android.developments_agency_search.screen.location_group.m r9 = r8.f138141r
                        r9.getClass()
                        com.avito.android.remote.model.SearchParameters r1 = r8.f138142s
                        java.lang.String r3 = com.avito.android.developments_agency_search.screen.location_group.m.b(r1)
                        java.util.List r1 = r1.getParameters()
                        java.lang.Iterable r1 = (java.lang.Iterable) r1
                        java.util.Iterator r1 = r1.iterator()
                    L32:
                        boolean r4 = r1.hasNext()
                        r5 = 0
                        if (r4 == 0) goto L4d
                        java.lang.Object r4 = r1.next()
                        r6 = r4
                        com.avito.android.remote.model.category_parameters.base.ParameterSlot r6 = (com.avito.android.remote.model.category_parameters.base.ParameterSlot) r6
                        java.lang.String r6 = r6.getId()
                        java.lang.String r7 = "locationGroup"
                        boolean r6 = kotlin.jvm.internal.L.f(r6, r7)
                        if (r6 == 0) goto L32
                        goto L4e
                    L4d:
                        r4 = r5
                    L4e:
                        com.avito.android.remote.model.category_parameters.GroupParameter r4 = (com.avito.android.remote.model.category_parameters.GroupParameter) r4
                        java.util.List r1 = r4.getParameters()
                        if (r1 != 0) goto L58
                        kotlin.collections.z0 r1 = kotlin.collections.C42784z0.f406748b
                    L58:
                        java.lang.Iterable r1 = (java.lang.Iterable) r1
                        boolean r4 = r1 instanceof java.util.Collection
                        r6 = 0
                        if (r4 == 0) goto L6a
                        r4 = r1
                        java.util.Collection r4 = (java.util.Collection) r4
                        boolean r4 = r4.isEmpty()
                        if (r4 == 0) goto L6a
                    L68:
                        r2 = r6
                        goto L7e
                    L6a:
                        java.util.Iterator r1 = r1.iterator()
                    L6e:
                        boolean r4 = r1.hasNext()
                        if (r4 == 0) goto L68
                        java.lang.Object r4 = r1.next()
                        com.avito.android.remote.model.category_parameters.base.ParameterSlot r4 = (com.avito.android.remote.model.category_parameters.base.ParameterSlot) r4
                        boolean r4 = r4 instanceof com.avito.android.remote.model.category_parameters.DistrictParameter
                        if (r4 == 0) goto L6e
                    L7e:
                        if (r3 == 0) goto L8a
                        if (r2 != 0) goto L83
                        goto L8a
                    L83:
                        com.avito.android.geo_common.interactor.g r9 = r9.f138127c
                        java.lang.Object r9 = r9.t(r3, r8)
                        goto L8b
                    L8a:
                        r9 = r5
                    L8b:
                        if (r9 != r0) goto L8e
                        return r0
                    L8e:
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.location_group.m.a.C4168a.C4169a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* compiled from: LocationGroupInteractor.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/metro_lines/MetroResponseBody;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.location_group.LocationGroupInteractorImpl$load$1$1$metroStationsDeferred$1", f = "LocationGroupInteractor.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.developments_agency_search.screen.location_group.m$a$a$b */
            public static final class b extends SuspendLambda implements p<T, Continuation<? super TypedResult<MetroResponseBody>>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f138143q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ m f138144r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ SearchParameters f138145s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(m mVar, SearchParameters searchParameters, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f138144r = mVar;
                    this.f138145s = searchParameters;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f138144r, this.f138145s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super TypedResult<MetroResponseBody>> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x008d A[RETURN] */
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
                        int r1 = r8.f138143q
                        r2 = 1
                        if (r1 == 0) goto L18
                        if (r1 != r2) goto L10
                        kotlin.C42729a0.b(r9)
                        goto L8e
                    L10:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L18:
                        kotlin.C42729a0.b(r9)
                        r8.f138143q = r2
                        com.avito.android.developments_agency_search.screen.location_group.m r9 = r8.f138144r
                        r9.getClass()
                        com.avito.android.remote.model.SearchParameters r1 = r8.f138145s
                        java.lang.String r3 = com.avito.android.developments_agency_search.screen.location_group.m.b(r1)
                        java.util.List r1 = r1.getParameters()
                        java.lang.Iterable r1 = (java.lang.Iterable) r1
                        java.util.Iterator r1 = r1.iterator()
                    L32:
                        boolean r4 = r1.hasNext()
                        r5 = 0
                        if (r4 == 0) goto L4d
                        java.lang.Object r4 = r1.next()
                        r6 = r4
                        com.avito.android.remote.model.category_parameters.base.ParameterSlot r6 = (com.avito.android.remote.model.category_parameters.base.ParameterSlot) r6
                        java.lang.String r6 = r6.getId()
                        java.lang.String r7 = "locationGroup"
                        boolean r6 = kotlin.jvm.internal.L.f(r6, r7)
                        if (r6 == 0) goto L32
                        goto L4e
                    L4d:
                        r4 = r5
                    L4e:
                        com.avito.android.remote.model.category_parameters.GroupParameter r4 = (com.avito.android.remote.model.category_parameters.GroupParameter) r4
                        java.util.List r1 = r4.getParameters()
                        if (r1 != 0) goto L58
                        kotlin.collections.z0 r1 = kotlin.collections.C42784z0.f406748b
                    L58:
                        java.lang.Iterable r1 = (java.lang.Iterable) r1
                        boolean r4 = r1 instanceof java.util.Collection
                        r6 = 0
                        if (r4 == 0) goto L6a
                        r4 = r1
                        java.util.Collection r4 = (java.util.Collection) r4
                        boolean r4 = r4.isEmpty()
                        if (r4 == 0) goto L6a
                    L68:
                        r2 = r6
                        goto L7e
                    L6a:
                        java.util.Iterator r1 = r1.iterator()
                    L6e:
                        boolean r4 = r1.hasNext()
                        if (r4 == 0) goto L68
                        java.lang.Object r4 = r1.next()
                        com.avito.android.remote.model.category_parameters.base.ParameterSlot r4 = (com.avito.android.remote.model.category_parameters.base.ParameterSlot) r4
                        boolean r4 = r4 instanceof com.avito.android.remote.model.category_parameters.MetroParameter
                        if (r4 == 0) goto L6e
                    L7e:
                        if (r3 == 0) goto L8a
                        if (r2 != 0) goto L83
                        goto L8a
                    L83:
                        com.avito.android.geo_common.interactor.g r9 = r9.f138127c
                        java.lang.Object r9 = r9.v(r3, r8)
                        goto L8b
                    L8a:
                        r9 = r5
                    L8b:
                        if (r9 != r0) goto L8e
                        return r0
                    L8e:
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.location_group.m.a.C4168a.b.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4168a(InterfaceC43172j<?> interfaceC43172j, SearchParameters searchParameters, m mVar, Continuation<? super C4168a> continuation) {
                super(2, continuation);
                this.f138137u = interfaceC43172j;
                this.f138138v = searchParameters;
                this.f138139w = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C4168a c4168a = new C4168a(this.f138137u, this.f138138v, this.f138139w, continuation);
                c4168a.f138136t = obj;
                return c4168a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C4168a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:44:0x00c0 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:11:0x0024, B:16:0x0038, B:42:0x00bc, B:44:0x00c0, B:46:0x00c4, B:54:0x00ea, B:47:0x00cd, B:49:0x00d1, B:50:0x00e2, B:51:0x00e3, B:52:0x00e8, B:19:0x0049, B:26:0x007b, B:28:0x007f, B:30:0x0083, B:38:0x00a9, B:31:0x008c, B:33:0x0090, B:34:0x00a1, B:35:0x00a2, B:36:0x00a7, B:22:0x006a), top: B:62:0x000d }] */
            /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00fd A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
                /*
                    Method dump skipped, instructions count: 277
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.location_group.m.a.C4168a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SearchParams searchParams, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f138132t = searchParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = m.this.new a(this.f138132t, continuation);
            aVar.f138130r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r14.f138129q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                com.avito.android.developments_agency_search.screen.location_group.m r6 = com.avito.android.developments_agency_search.screen.location_group.m.this
                if (r1 == 0) goto L37
                if (r1 == r5) goto L2f
                if (r1 == r4) goto L27
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                kotlin.C42729a0.b(r15)
                goto L89
            L1a:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L22:
                kotlin.C42729a0.b(r15)
                goto Lae
            L27:
                java.lang.Object r1 = r14.f138130r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r15)
                goto L6a
            L2f:
                java.lang.Object r1 = r14.f138130r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r15)
                goto L4f
            L37:
                kotlin.C42729a0.b(r15)
                java.lang.Object r15 = r14.f138130r
                kotlinx.coroutines.flow.j r15 = (kotlinx.coroutines.flow.InterfaceC43172j) r15
                com.avito.android.developments_agency_search.screen.location_group.mvi.entity.LocationGroupInternalAction$FiltersLoading$StartLoading r1 = new com.avito.android.developments_agency_search.screen.location_group.mvi.entity.LocationGroupInternalAction$FiltersLoading$StartLoading
                r1.<init>()
                r14.f138130r = r15
                r14.f138129q = r5
                java.lang.Object r1 = r15.emit(r1, r14)
                if (r1 != r0) goto L4e
                return r0
            L4e:
                r1 = r15
            L4f:
                com.avito.android.remote.model.SearchParamsConverter r7 = r6.f138125a
                r10 = 0
                r11 = 0
                com.avito.android.remote.model.SearchParams r8 = r14.f138132t
                r9 = 0
                r12 = 14
                r13 = 0
                java.util.Map r15 = com.avito.android.remote.model.SearchParamsConverter.DefaultImpls.convertToMap$default(r7, r8, r9, r10, r11, r12, r13)
                r14.f138130r = r1
                r14.f138129q = r4
                sw.a r4 = r6.f138126b
                java.lang.Object r15 = r4.c(r15, r14)
                if (r15 != r0) goto L6a
                return r0
            L6a:
                com.avito.android.remote.model.TypedResult r15 = (com.avito.android.remote.model.TypedResult) r15
                boolean r4 = r15 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L8c
                com.avito.android.remote.model.TypedResult$Success r15 = (com.avito.android.remote.model.TypedResult.Success) r15
                java.lang.Object r15 = r15.getResult()
                com.avito.android.remote.model.SearchParameters r15 = (com.avito.android.remote.model.SearchParameters) r15
                com.avito.android.developments_agency_search.screen.location_group.m$a$a r3 = new com.avito.android.developments_agency_search.screen.location_group.m$a$a
                r3.<init>(r1, r15, r6, r5)
                r14.f138130r = r5
                r14.f138129q = r2
                java.lang.Object r15 = kotlinx.coroutines.U.c(r3, r14)
                if (r15 != r0) goto L89
                return r0
            L89:
                kotlin.G0 r15 = kotlin.G0.f406611a
                return r15
            L8c:
                boolean r2 = r15 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lb1
                com.avito.android.remote.model.TypedResult$Error r15 = (com.avito.android.remote.model.TypedResult.Error) r15
                com.avito.android.remote.error.ApiError r2 = r15.getError()
                java.lang.Throwable r15 = r15.getCause()
                com.avito.android.util.ApiException r15 = com.avito.android.util.C35936s.a(r2, r15)
                com.avito.android.developments_agency_search.screen.location_group.mvi.entity.LocationGroupInternalAction$FiltersLoading$LoadingError r2 = new com.avito.android.developments_agency_search.screen.location_group.mvi.entity.LocationGroupInternalAction$FiltersLoading$LoadingError
                r2.<init>(r15)
                r14.f138130r = r5
                r14.f138129q = r3
                java.lang.Object r15 = r1.emit(r2, r14)
                if (r15 != r0) goto Lae
                return r0
            Lae:
                kotlin.G0 r15 = kotlin.G0.f406611a
                return r15
            Lb1:
                kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
                r15.<init>()
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.location_group.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public m(@Y61.k SearchParamsConverter searchParamsConverter, @Y61.k InterfaceC48423a interfaceC48423a, @Y61.k com.avito.android.geo_common.interactor.g gVar, @Y61.k R0 r02) {
        this.f138125a = searchParamsConverter;
        this.f138126b = interfaceC48423a;
        this.f138127c = gVar;
        this.f138128d = r02;
    }

    public static String b(SearchParameters searchParameters) {
        Object next;
        Iterator<T> it = searchParameters.getParameters().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((ParameterSlot) next).getId(), "locationGroup")) {
                break;
            }
        }
        List<ParameterSlot> parameters = ((GroupParameter) next).getParameters();
        if (parameters == null) {
            parameters = C42784z0.f406748b;
        }
        for (Object obj : parameters) {
            if (((ParameterSlot) obj) instanceof LocationParameter) {
                Location value = ((LocationParameter) obj).getValue();
                if (value != null) {
                    return value.getId();
                }
                return null;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // com.avito.android.developments_agency_search.screen.location_group.l
    @Y61.k
    public final InterfaceC43160i<LocationGroupInternalAction> a(@Y61.k SearchParams searchParams) {
        return C43175k.I(this.f138128d.a(), C43175k.G(new a(searchParams, null)));
    }
}
