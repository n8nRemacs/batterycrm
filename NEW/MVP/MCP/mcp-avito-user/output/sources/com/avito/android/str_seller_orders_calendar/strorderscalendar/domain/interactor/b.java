package com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor;

import Iz0.InterfaceC14179a;
import Kz0.C14365a;
import Sz0.C15273b;
import Sz0.C15274c;
import Tz0.C15433g;
import Uz0.C15589a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.usecase.a;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction;
import com.avito.android.util.R0;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: StrOrdersCalendarRedesignInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/domain/interactor/b;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/domain/interactor/a;", "a", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14179a f290715a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f290716b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.usecase.a f290717c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f290718d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.a f290719e;

    /* compiled from: StrOrdersCalendarRedesignInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/domain/interactor/b$a;", "", "<init>", "()V", "", "INIT_LOADING_TRACKER_TYPE", "Ljava/lang/String;", "PAGINATION_LOADING_TRACKER_TYPE", "RANGED_LOADING_TRACKER_TYPE", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrOrdersCalendarRedesignInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.StrOrdersCalendarRedesignInteractorImpl$initialLoadItems$1", f = "StrOrdersCalendarRedesignInteractor.kt", i = {0, 1, 2, 3, 3, 4, 4, 4}, l = {73, 82, YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS, 94, 96, 103, WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "response", "$this$flow", "response", "loadOrdersResult"}, s = {"L$0", "L$0", "L$0", "L$0", "L$4", "L$0", "L$4", "L$5"})
    /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.b$b, reason: collision with other inner class name */
    public static final class C8793b extends SuspendLambda implements p<InterfaceC43172j<? super StrOrdersCalendarInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ Date f290720A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ b f290721B;

        /* renamed from: q, reason: collision with root package name */
        public b f290722q;

        /* renamed from: r, reason: collision with root package name */
        public Date f290723r;

        /* renamed from: s, reason: collision with root package name */
        public Date f290724s;

        /* renamed from: t, reason: collision with root package name */
        public C14365a f290725t;

        /* renamed from: u, reason: collision with root package name */
        public a.C8797a.C8798a f290726u;

        /* renamed from: v, reason: collision with root package name */
        public int f290727v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f290728w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Date f290729x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Date f290730y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Date f290731z;

        /* compiled from: StrOrdersCalendarRedesignInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.StrOrdersCalendarRedesignInteractorImpl$initialLoadItems$1$1$1", f = "StrOrdersCalendarRedesignInteractor.kt", i = {0}, l = {113, 114, 111, 117}, m = "invokeSuspend", n = {"itemIdToCalendarDateInfosMap"}, s = {"L$0"})
        /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.b$b$a */
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public Object f290732q;

            /* renamed from: r, reason: collision with root package name */
            public int f290733r;

            /* renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f290734s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ b f290735t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<StrOrdersCalendarInternalAction> f290736u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Date f290737v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Date f290738w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ Tz0.k f290739x;

            /* compiled from: StrOrdersCalendarRedesignInteractor.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001j\u0002`\u0005*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/T;", "", "", "", "LSz0/b;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/ItemIdToCalendarDayInfosRedesignMap;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.StrOrdersCalendarRedesignInteractorImpl$initialLoadItems$1$1$1$itemIdToCalendarDateInfosMap$1", f = "StrOrdersCalendarRedesignInteractor.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.b$b$a$a, reason: collision with other inner class name */
            public static final class C8794a extends SuspendLambda implements p<T, Continuation<? super Map<String, ? extends List<? extends C15273b>>>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f290740q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ b f290741r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ Tz0.k f290742s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8794a(b bVar, Tz0.k kVar, Continuation<? super C8794a> continuation) {
                    super(2, continuation);
                    this.f290741r = bVar;
                    this.f290742s = kVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C8794a(this.f290741r, this.f290742s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super Map<String, ? extends List<? extends C15273b>>> continuation) {
                    return ((C8794a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f290740q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        b bVar = this.f290741r;
                        ArrayList arrayList = this.f290742s.f16067a;
                        this.f290740q = 1;
                        obj = bVar.f290719e.c(arrayList, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return obj;
                }
            }

            /* compiled from: StrOrdersCalendarRedesignInteractor.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "", "", "LSz0/c;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.StrOrdersCalendarRedesignInteractorImpl$initialLoadItems$1$1$1$itemIdToItemInfoMap$1", f = "StrOrdersCalendarRedesignInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.b$b$a$b, reason: collision with other inner class name */
            public static final class C8795b extends SuspendLambda implements p<T, Continuation<? super Map<String, ? extends C15274c>>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ b f290743q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ Tz0.k f290744r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8795b(b bVar, Tz0.k kVar, Continuation<? super C8795b> continuation) {
                    super(2, continuation);
                    this.f290743q = bVar;
                    this.f290744r = kVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C8795b(this.f290743q, this.f290744r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super Map<String, ? extends C15274c>> continuation) {
                    return ((C8795b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    b bVar = this.f290743q;
                    return bVar.f290719e.a(this.f290744r.f16067a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b bVar, InterfaceC43172j<? super StrOrdersCalendarInternalAction> interfaceC43172j, Date date, Date date2, Tz0.k kVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f290735t = bVar;
                this.f290736u = interfaceC43172j;
                this.f290737v = date;
                this.f290738w = date2;
                this.f290739x = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f290735t, this.f290736u, this.f290737v, this.f290738w, this.f290739x, continuation);
                aVar.f290734s = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x009e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00c0 A[RETURN] */
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
                    int r1 = r13.f290733r
                    r2 = 2
                    kotlinx.coroutines.flow.j<com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction> r3 = r13.f290736u
                    r4 = 4
                    r5 = 3
                    r6 = 1
                    r7 = 0
                    if (r1 == 0) goto L41
                    if (r1 == r6) goto L35
                    if (r1 == r2) goto L29
                    if (r1 == r5) goto L24
                    if (r1 != r4) goto L1c
                    kotlin.C42729a0.b(r14)
                    goto Lc1
                L1c:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                L24:
                    kotlin.C42729a0.b(r14)
                    goto L9f
                L29:
                    java.lang.Object r1 = r13.f290732q
                    java.util.Map r1 = (java.util.Map) r1
                    java.lang.Object r2 = r13.f290734s
                    kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
                    kotlin.C42729a0.b(r14)
                    goto L8b
                L35:
                    java.lang.Object r1 = r13.f290732q
                    kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                    java.lang.Object r6 = r13.f290734s
                    kotlinx.coroutines.a0 r6 = (kotlinx.coroutines.InterfaceC43076a0) r6
                    kotlin.C42729a0.b(r14)
                    goto L78
                L41:
                    kotlin.C42729a0.b(r14)
                    java.lang.Object r14 = r13.f290734s
                    kotlinx.coroutines.T r14 = (kotlinx.coroutines.T) r14
                    com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.b r1 = r13.f290735t
                    com.avito.android.util.R0 r8 = r1.f290718d
                    kotlinx.coroutines.scheduling.c r9 = r8.c()
                    com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.b$b$a$b r10 = new com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.b$b$a$b
                    Tz0.k r11 = r13.f290739x
                    r10.<init>(r1, r11, r7)
                    kotlinx.coroutines.a0 r9 = kotlinx.coroutines.C43259k.b(r14, r9, r10, r2)
                    kotlinx.coroutines.scheduling.c r8 = r8.c()
                    com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.b$b$a$a r10 = new com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.b$b$a$a
                    r10.<init>(r1, r11, r7)
                    kotlinx.coroutines.a0 r14 = kotlinx.coroutines.C43259k.b(r14, r8, r10, r2)
                    r13.f290734s = r14
                    r13.f290732q = r3
                    r13.f290733r = r6
                    java.lang.Object r1 = r9.F(r13)
                    if (r1 != r0) goto L75
                    return r0
                L75:
                    r6 = r14
                    r14 = r1
                    r1 = r3
                L78:
                    java.util.Map r14 = (java.util.Map) r14
                    r13.f290734s = r1
                    r13.f290732q = r14
                    r13.f290733r = r2
                    java.lang.Object r2 = r6.F(r13)
                    if (r2 != r0) goto L87
                    return r0
                L87:
                    r12 = r1
                    r1 = r14
                    r14 = r2
                    r2 = r12
                L8b:
                    java.util.Map r14 = (java.util.Map) r14
                    com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction$RedesignLoadingComplete r6 = new com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction$RedesignLoadingComplete
                    r6.<init>(r1, r14)
                    r13.f290734s = r7
                    r13.f290732q = r7
                    r13.f290733r = r5
                    java.lang.Object r14 = r2.emit(r6, r13)
                    if (r14 != r0) goto L9f
                    return r0
                L9f:
                    com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction$ScrollToHorizontalPosition r14 = new com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction$ScrollToHorizontalPosition
                    java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
                    java.util.Date r2 = r13.f290737v
                    long r5 = r2.getTime()
                    java.util.Date r2 = r13.f290738w
                    long r7 = r2.getTime()
                    long r5 = r5 - r7
                    long r1 = r1.toDays(r5)
                    int r1 = (int) r1
                    r14.<init>(r1)
                    r13.f290733r = r4
                    java.lang.Object r14 = r3.emit(r14, r13)
                    if (r14 != r0) goto Lc1
                    return r0
                Lc1:
                    kotlin.G0 r14 = kotlin.G0.f406611a
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.b.C8793b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8793b(Date date, Date date2, Date date3, Date date4, b bVar, Continuation<? super C8793b> continuation) {
            super(2, continuation);
            this.f290729x = date;
            this.f290730y = date2;
            this.f290731z = date3;
            this.f290720A = date4;
            this.f290721B = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C8793b c8793b = new C8793b(this.f290729x, this.f290730y, this.f290731z, this.f290720A, this.f290721B, continuation);
            c8793b.f290728w = obj;
            return c8793b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrOrdersCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8793b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x009b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0150 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0151  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 422
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.b.C8793b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: StrOrdersCalendarRedesignInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.StrOrdersCalendarRedesignInteractorImpl$loadAdditionalDates$1", f = "StrOrdersCalendarRedesignInteractor.kt", i = {0, 1, 2, 2, 3, 3, 3}, l = {143, 151, 154, 156, 162, 204}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "response", "$this$flow", "response", "loadOrdersResult"}, s = {"L$0", "L$0", "L$0", "L$8", "L$0", "L$8", "L$9"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super StrOrdersCalendarInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public /* synthetic */ Object f290745A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ Date f290746B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ Date f290747C;

        /* renamed from: D, reason: collision with root package name */
        public final /* synthetic */ b f290748D;

        /* renamed from: E, reason: collision with root package name */
        public final /* synthetic */ Date f290749E;

        /* renamed from: F, reason: collision with root package name */
        public final /* synthetic */ Date f290750F;

        /* renamed from: G, reason: collision with root package name */
        public final /* synthetic */ Map<String, List<C15273b>> f290751G;

        /* renamed from: H, reason: collision with root package name */
        public final /* synthetic */ C15589a f290752H;

        /* renamed from: q, reason: collision with root package name */
        public b f290753q;

        /* renamed from: r, reason: collision with root package name */
        public Date f290754r;

        /* renamed from: s, reason: collision with root package name */
        public Date f290755s;

        /* renamed from: t, reason: collision with root package name */
        public Date f290756t;

        /* renamed from: u, reason: collision with root package name */
        public Date f290757u;

        /* renamed from: v, reason: collision with root package name */
        public Map f290758v;

        /* renamed from: w, reason: collision with root package name */
        public C15589a f290759w;

        /* renamed from: x, reason: collision with root package name */
        public C14365a f290760x;

        /* renamed from: y, reason: collision with root package name */
        public a.C8797a.C8798a f290761y;

        /* renamed from: z, reason: collision with root package name */
        public int f290762z;

        /* compiled from: StrOrdersCalendarRedesignInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.StrOrdersCalendarRedesignInteractorImpl$loadAdditionalDates$1$1$1", f = "StrOrdersCalendarRedesignInteractor.kt", i = {0, 1}, l = {191, 187, 195}, m = "invokeSuspend", n = {"scrollToDate", "scrollToDate"}, s = {"L$0", "L$0"})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: A, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<StrOrdersCalendarInternalAction> f290763A;

            /* renamed from: B, reason: collision with root package name */
            public final /* synthetic */ Map<String, List<C15273b>> f290764B;

            /* renamed from: C, reason: collision with root package name */
            public final /* synthetic */ Tz0.k f290765C;

            /* renamed from: D, reason: collision with root package name */
            public final /* synthetic */ C15589a f290766D;

            /* renamed from: q, reason: collision with root package name */
            public InterfaceC43172j f290767q;

            /* renamed from: r, reason: collision with root package name */
            public Date f290768r;

            /* renamed from: s, reason: collision with root package name */
            public Date f290769s;

            /* renamed from: t, reason: collision with root package name */
            public int f290770t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f290771u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ b f290772v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Date f290773w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ Date f290774x;

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ Date f290775y;

            /* renamed from: z, reason: collision with root package name */
            public final /* synthetic */ Date f290776z;

            /* compiled from: StrOrdersCalendarRedesignInteractor.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001j\u0002`\u0005*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/T;", "", "", "", "LSz0/b;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/ItemIdToCalendarDayInfosRedesignMap;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.StrOrdersCalendarRedesignInteractorImpl$loadAdditionalDates$1$1$1$newItemIdToCalendarDayInfosMap$1", f = "StrOrdersCalendarRedesignInteractor.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.b$c$a$a, reason: collision with other inner class name */
            public static final class C8796a extends SuspendLambda implements p<T, Continuation<? super Map<String, ? extends List<? extends C15273b>>>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f290777q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ b f290778r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ Map<String, List<C15273b>> f290779s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ Tz0.k f290780t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ C15589a f290781u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C8796a(b bVar, Map<String, ? extends List<C15273b>> map, Tz0.k kVar, C15589a c15589a, Continuation<? super C8796a> continuation) {
                    super(2, continuation);
                    this.f290778r = bVar;
                    this.f290779s = map;
                    this.f290780t = kVar;
                    this.f290781u = c15589a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    return new C8796a(this.f290778r, this.f290779s, this.f290780t, this.f290781u, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super Map<String, ? extends List<? extends C15273b>>> continuation) {
                    return ((C8796a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f290777q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        b bVar = this.f290778r;
                        ArrayList arrayList = this.f290780t.f16067a;
                        this.f290777q = 1;
                        obj = bVar.f290719e.d(this.f290779s, arrayList, this.f290781u, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b bVar, Date date, Date date2, Date date3, Date date4, InterfaceC43172j<? super StrOrdersCalendarInternalAction> interfaceC43172j, Map<String, ? extends List<C15273b>> map, Tz0.k kVar, C15589a c15589a, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f290772v = bVar;
                this.f290773w = date;
                this.f290774x = date2;
                this.f290775y = date3;
                this.f290776z = date4;
                this.f290763A = interfaceC43172j;
                this.f290764B = map;
                this.f290765C = kVar;
                this.f290766D = c15589a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f290772v, this.f290773w, this.f290774x, this.f290775y, this.f290776z, this.f290763A, this.f290764B, this.f290765C, this.f290766D, continuation);
                aVar.f290771u = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x00bc A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r17) {
                /*
                    r16 = this;
                    r0 = r16
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f290770t
                    r3 = 2
                    kotlinx.coroutines.flow.j<com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction> r4 = r0.f290763A
                    r5 = 3
                    r6 = 1
                    r7 = 0
                    if (r2 == 0) goto L3d
                    if (r2 == r6) goto L2c
                    if (r2 == r3) goto L23
                    if (r2 != r5) goto L1b
                    kotlin.C42729a0.b(r17)
                    goto Lbd
                L1b:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L23:
                    java.lang.Object r2 = r0.f290771u
                    java.util.Date r2 = (java.util.Date) r2
                    kotlin.C42729a0.b(r17)
                    goto La2
                L2c:
                    java.util.Date r2 = r0.f290769s
                    java.util.Date r6 = r0.f290768r
                    kotlinx.coroutines.flow.j r8 = r0.f290767q
                    java.lang.Object r9 = r0.f290771u
                    java.util.Date r9 = (java.util.Date) r9
                    kotlin.C42729a0.b(r17)
                    r10 = r2
                    r2 = r17
                    goto L89
                L3d:
                    kotlin.C42729a0.b(r17)
                    java.lang.Object r2 = r0.f290771u
                    kotlinx.coroutines.T r2 = (kotlinx.coroutines.T) r2
                    com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.b r9 = r0.f290772v
                    com.avito.android.util.R0 r8 = r9.f290718d
                    kotlinx.coroutines.scheduling.c r14 = r8.c()
                    com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.b$c$a$a r15 = new com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.b$c$a$a
                    Tz0.k r11 = r0.f290765C
                    java.util.Map<java.lang.String, java.util.List<Sz0.b>> r10 = r0.f290764B
                    Uz0.a r12 = r0.f290766D
                    r13 = 0
                    r8 = r15
                    r8.<init>(r9, r10, r11, r12, r13)
                    kotlinx.coroutines.a0 r2 = kotlinx.coroutines.C43259k.b(r2, r14, r15, r3)
                    java.util.Date r8 = r0.f290774x
                    java.util.Date r9 = r0.f290773w
                    boolean r10 = r8.before(r9)
                    if (r10 == 0) goto L68
                    goto L69
                L68:
                    r8 = r9
                L69:
                    java.util.Date r10 = r0.f290775y
                    java.util.Date r11 = r0.f290776z
                    boolean r12 = r10.after(r11)
                    if (r12 == 0) goto L75
                    r9 = r11
                    goto L76
                L75:
                    r10 = r11
                L76:
                    r0.f290771u = r9
                    r0.f290767q = r4
                    r0.f290768r = r8
                    r0.f290769s = r10
                    r0.f290770t = r6
                    java.lang.Object r2 = r2.F(r0)
                    if (r2 != r1) goto L87
                    return r1
                L87:
                    r6 = r8
                    r8 = r4
                L89:
                    java.util.Map r2 = (java.util.Map) r2
                    com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction$RedesignPaginationCompleted r11 = new com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction$RedesignPaginationCompleted
                    r11.<init>(r6, r10, r2)
                    r0.f290771u = r9
                    r0.f290767q = r7
                    r0.f290768r = r7
                    r0.f290769s = r7
                    r0.f290770t = r3
                    java.lang.Object r2 = r8.emit(r11, r0)
                    if (r2 != r1) goto La1
                    return r1
                La1:
                    r2 = r9
                La2:
                    com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction$ScrollToHorizontalPosition r3 = new com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction$ScrollToHorizontalPosition
                    java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
                    long r8 = r2.getTime()
                    long r8 = r6.toDays(r8)
                    int r2 = (int) r8
                    r3.<init>(r2)
                    r0.f290771u = r7
                    r0.f290770t = r5
                    java.lang.Object r2 = r4.emit(r3, r0)
                    if (r2 != r1) goto Lbd
                    return r1
                Lbd:
                    kotlin.G0 r1 = kotlin.G0.f406611a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.b.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Date date, Date date2, b bVar, Date date3, Date date4, Map<String, ? extends List<C15273b>> map, C15589a c15589a, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f290746B = date;
            this.f290747C = date2;
            this.f290748D = bVar;
            this.f290749E = date3;
            this.f290750F = date4;
            this.f290751G = map;
            this.f290752H = c15589a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = new c(this.f290746B, this.f290747C, this.f290748D, this.f290749E, this.f290750F, this.f290751G, this.f290752H, continuation);
            cVar.f290745A = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrOrdersCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00ca A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0199 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x019a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 492
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: StrOrdersCalendarRedesignInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$UpdateItemDatesLoadingComplete;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.StrOrdersCalendarRedesignInteractorImpl$reloadUpdatedDateRangeForItem$1", f = "StrOrdersCalendarRedesignInteractor.kt", i = {0, 1}, l = {223, 227, 231}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super StrOrdersCalendarInternalAction.UpdateItemDatesLoadingComplete>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f290782q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f290783r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Date f290785t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Date f290786u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f290787v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Map<String, List<C15273b>> f290788w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Date date, Date date2, String str, Map<String, ? extends List<C15273b>> map, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f290785t = date;
            this.f290786u = date2;
            this.f290787v = str;
            this.f290788w = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            d dVar = b.this.new d(this.f290785t, this.f290786u, this.f290787v, this.f290788w, continuation);
            dVar.f290783r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrOrdersCalendarInternalAction.UpdateItemDatesLoadingComplete> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00b7 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k InterfaceC14179a interfaceC14179a, @k ScreenPerformanceTracker screenPerformanceTracker, @k com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.usecase.a aVar, @k R0 r02, @k com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.a aVar2) {
        this.f290715a = interfaceC14179a;
        this.f290716b = screenPerformanceTracker;
        this.f290717c = aVar;
        this.f290718d = r02;
        this.f290719e = aVar2;
    }

    public static final Tz0.k d(b bVar, Tz0.k kVar, Map map) {
        bVar.getClass();
        ArrayList<C15433g> arrayList = kVar.f16067a;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (C15433g c15433g : arrayList) {
            List list = (List) map.get(c15433g.f16054a);
            if (list == null) {
                list = C42784z0.f406748b;
            }
            arrayList2.add(new C15433g(c15433g.f16054a, c15433g.f16055b, c15433g.f16056c, c15433g.f16057d, list));
        }
        return new Tz0.k(arrayList2);
    }

    @Override // com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.a
    @k
    public final InterfaceC43160i<StrOrdersCalendarInternalAction> a(@k String str, @k Date date, @k Date date2, @k Map<String, ? extends List<C15273b>> map) {
        return C43175k.I(this.f290718d.a(), C43175k.G(new d(date, date2, str, map, null)));
    }

    @Override // com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.a
    @k
    public final InterfaceC43160i<StrOrdersCalendarInternalAction> b(@k Date date, @k Date date2, @k Date date3, @k Date date4) {
        return C43175k.I(this.f290718d.a(), C43175k.G(new C8793b(date2, date3, date, date4, this, null)));
    }

    @Override // com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.a
    @k
    public final InterfaceC43160i<StrOrdersCalendarInternalAction> c(@k Date date, @k Date date2, @k Date date3, @k Date date4, @k Map<String, ? extends List<C15273b>> map, @l C15589a c15589a) {
        return C43175k.I(this.f290718d.a(), C43175k.G(new c(date3, date4, this, date, date2, map, c15589a, null)));
    }
}
