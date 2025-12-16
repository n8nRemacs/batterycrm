package com.avito.android.das_date_picker.mvi;

import bu.C25712a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.das_date_picker.mvi.entity.DasCalendarInternalAction;
import com.avito.android.util.R0;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.util.Calendar;
import java.util.Date;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DasCalendarInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/o;", "Lcom/avito/android/das_date_picker/mvi/n;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f132430a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g f132431b;

    /* compiled from: DasCalendarInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.das_date_picker.mvi.DasCalendarInteractorImpl$getDefaultCalendarData$1", f = "DasCalendarInteractor.kt", i = {0, 1, 1, 2, 2}, l = {65, 67, 73, 85}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "calendarItems", "$this$flow", "calendarData"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DasCalendarInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f132432q;

        /* renamed from: r, reason: collision with root package name */
        public int f132433r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f132434s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Date f132436u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Date f132437v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Date f132438w;

        /* compiled from: DasCalendarInteractor.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Ljava/util/Date;", "kotlin.jvm.PlatformType", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.das_date_picker.mvi.DasCalendarInteractorImpl$getDefaultCalendarData$1$calendarItems$1", f = "DasCalendarInteractor.kt", i = {0}, l = {54}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
        /* renamed from: com.avito.android.das_date_picker.mvi.o$a$a, reason: collision with other inner class name */
        public static final class C3962a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Date>, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f132439q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f132440r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Calendar f132441s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Calendar f132442t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3962a(Calendar calendar, Calendar calendar2, Continuation<? super C3962a> continuation) {
                super(2, continuation);
                this.f132441s = calendar;
                this.f132442t = calendar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C3962a c3962a = new C3962a(this.f132441s, this.f132442t, continuation);
                c3962a.f132440r = obj;
                return c3962a;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC43172j<? super Date> interfaceC43172j, Continuation<? super G0> continuation) {
                return ((C3962a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003f -> B:14:0x0042). Please report as a decompilation issue!!! */
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
                    int r1 = r8.f132439q
                    java.util.Calendar r2 = r8.f132441s
                    r3 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r3) goto L15
                    java.lang.Object r1 = r8.f132440r
                    kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                    kotlin.C42729a0.b(r9)
                    goto L42
                L15:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1d:
                    kotlin.C42729a0.b(r9)
                    java.lang.Object r9 = r8.f132440r
                    kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                    r1 = r9
                L25:
                    long r4 = r2.getTimeInMillis()
                    java.util.Calendar r9 = r8.f132442t
                    long r6 = r9.getTimeInMillis()
                    int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r9 > 0) goto L47
                    java.util.Date r9 = r2.getTime()
                    r8.f132440r = r1
                    r8.f132439q = r3
                    java.lang.Object r9 = r1.emit(r9, r8)
                    if (r9 != r0) goto L42
                    return r0
                L42:
                    r9 = 6
                    r2.add(r9, r3)
                    goto L25
                L47:
                    kotlin.G0 r9 = kotlin.G0.f406611a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.das_date_picker.mvi.o.a.C3962a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements InterfaceC43160i<C25712a> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f132443b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Date f132444c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Date f132445d;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.das_date_picker.mvi.o$a$b$a, reason: collision with other inner class name */
            public static final class C3963a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f132446b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Date f132447c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Date f132448d;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.das_date_picker.mvi.DasCalendarInteractorImpl$getDefaultCalendarData$1$invokeSuspend$$inlined$map$1$2", f = "DasCalendarInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.das_date_picker.mvi.o$a$b$a$a, reason: collision with other inner class name */
                public static final class C3964a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f132449q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f132450r;

                    public C3964a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f132449q = obj;
                        this.f132450r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C3963a.this.emit(null, this);
                    }
                }

                public C3963a(InterfaceC43172j interfaceC43172j, Date date, Date date2) {
                    this.f132446b = interfaceC43172j;
                    this.f132447c = date;
                    this.f132448d = date2;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                @Y61.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.avito.android.das_date_picker.mvi.o.a.b.C3963a.C3964a
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.avito.android.das_date_picker.mvi.o$a$b$a$a r0 = (com.avito.android.das_date_picker.mvi.o.a.b.C3963a.C3964a) r0
                        int r1 = r0.f132450r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f132450r = r1
                        goto L18
                    L13:
                        com.avito.android.das_date_picker.mvi.o$a$b$a$a r0 = new com.avito.android.das_date_picker.mvi.o$a$b$a$a
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f132449q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f132450r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r7)
                        goto L5f
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.C42729a0.b(r7)
                        java.util.Date r6 = (java.util.Date) r6
                        bu.a r7 = new bu.a
                        java.util.Date r2 = r5.f132447c
                        boolean r4 = du.C39803a.b(r2, r6)
                        if (r4 != 0) goto L46
                        boolean r2 = du.C39803a.c(r2, r6)
                        if (r2 == 0) goto L50
                    L46:
                        java.util.Date r2 = r5.f132448d
                        boolean r2 = du.C39803a.a(r2, r6)
                        if (r2 == 0) goto L50
                        r2 = r3
                        goto L51
                    L50:
                        r2 = 0
                    L51:
                        r7.<init>(r6, r2)
                        r0.f132450r = r3
                        kotlinx.coroutines.flow.j r6 = r5.f132446b
                        java.lang.Object r6 = r6.emit(r7, r0)
                        if (r6 != r1) goto L5f
                        return r1
                    L5f:
                        kotlin.G0 r6 = kotlin.G0.f406611a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.das_date_picker.mvi.o.a.b.C3963a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public b(InterfaceC43160i interfaceC43160i, Date date, Date date2) {
                this.f132443b = interfaceC43160i;
                this.f132444c = date;
                this.f132445d = date2;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super C25712a> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f132443b.collect(new C3963a(interfaceC43172j, this.f132444c, this.f132445d), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Date date, Date date2, Date date3, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f132436u = date;
            this.f132437v = date2;
            this.f132438w = date3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = o.this.new a(this.f132436u, this.f132437v, this.f132438w, continuation);
            aVar.f132434s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DasCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00b5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.das_date_picker.mvi.o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DasCalendarInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.das_date_picker.mvi.DasCalendarInteractorImpl$getDefaultCalendarData$2", f = "DasCalendarInteractor.kt", i = {}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DasCalendarInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f132452q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f132453r;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(2, continuation);
            bVar.f132453r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DasCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f132452q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f132453r;
                DasCalendarInternalAction.ShowLoading showLoading = new DasCalendarInternalAction.ShowLoading(null, 1, null);
                this.f132452q = 1;
                if (interfaceC43172j.emit(showLoading, this) == coroutine_suspended) {
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
    public o(@Y61.k R0 r02, @Y61.k g gVar) {
        this.f132430a = r02;
        this.f132431b = gVar;
    }

    @Override // com.avito.android.das_date_picker.mvi.n
    @Y61.k
    public final InterfaceC43160i<DasCalendarInternalAction> a(@Y61.k Date date, @Y61.k Date date2, @Y61.k Date date3) {
        return C43175k.I(this.f132430a.c(), new C43137a0(new b(2, null), C43175k.G(new a(date2, date3, date, null))));
    }
}
