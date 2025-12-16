package com.avito.android.short_term_rent.bookingform.mvi.interactor;

import aw0.C24186b;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.component.toast.f;
import com.avito.android.short_term_rent.bookingform.BookingFormOpenParams;
import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import com.avito.android.short_term_rent.bookingform.mvi.interactor.u;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;

/* compiled from: CreateBookingRequestInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/interactor/s;", "Lcom/avito/android/short_term_rent/bookingform/mvi/interactor/r;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f281927a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.short_term_rent.bookingform.mvi.interactor.a f281928b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.short_term_rent.bookingform.domain.b f281929c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final BookingFormOpenParams f281930d;

    /* compiled from: CreateBookingRequestInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.interactor.CreateBookingRequestInteractorImpl$createBookingRequest$1", f = "CreateBookingRequestInteractor.kt", i = {0}, l = {36, 40, 55}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BookingFormInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f281931q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f281932r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C24186b f281934t;

        /* compiled from: CreateBookingRequestInteractor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "orderId", "promoCode", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.short_term_rent.bookingform.mvi.interactor.s$a$a, reason: collision with other inner class name */
        public static final class C8406a extends N implements Y41.p<String, String, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ s f281935l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ C24186b f281936m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8406a(s sVar, C24186b c24186b) {
                super(2);
                this.f281935l = sVar;
                this.f281936m = c24186b;
            }

            @Override // Y41.p
            public final G0 invoke(String str, String str2) {
                s sVar = this.f281935l;
                com.avito.android.short_term_rent.bookingform.mvi.interactor.a aVar = sVar.f281928b;
                C24186b c24186b = this.f281936m;
                String str3 = sVar.f281930d.f281224l;
                aVar.k(c24186b.f56777a, str3, str, str2);
                return G0.f406611a;
            }
        }

        /* compiled from: CreateBookingRequestInteractor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.interactor.CreateBookingRequestInteractorImpl$createBookingRequest$1$3", f = "CreateBookingRequestInteractor.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BookingFormInternalAction>, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f281937q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f281938r;

            public b() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                b bVar = new b(2, continuation);
                bVar.f281938r = obj;
                return bVar;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
                return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f281937q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f281938r;
                    BookingFormInternalAction.Progress.Show show = BookingFormInternalAction.Progress.Show.f281809b;
                    this.f281937q = 1;
                    if (interfaceC43172j.emit(show, this) == coroutine_suspended) {
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

        /* compiled from: CreateBookingRequestInteractor.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.interactor.CreateBookingRequestInteractorImpl$createBookingRequest$1$4", f = "CreateBookingRequestInteractor.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BookingFormInternalAction>, Throwable, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f281939q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ InterfaceC43172j f281940r;

            public c() {
                throw null;
            }

            @Override // Y41.q
            public final Object invoke(InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
                c cVar = new c(3, continuation);
                cVar.f281940r = interfaceC43172j;
                return cVar.invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f281939q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43172j interfaceC43172j = this.f281940r;
                    BookingFormInternalAction.Progress.Hide hide = BookingFormInternalAction.Progress.Hide.f281808b;
                    this.f281939q = 1;
                    if (interfaceC43172j.emit(hide, this) == coroutine_suspended) {
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

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d implements InterfaceC43160i<BookingFormInternalAction> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C43152f0 f281941b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.short_term_rent.bookingform.mvi.interactor.s$a$d$a, reason: collision with other inner class name */
            public static final class C8407a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f281942b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.interactor.CreateBookingRequestInteractorImpl$createBookingRequest$1$invokeSuspend$$inlined$map$1$2", f = "CreateBookingRequestInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.short_term_rent.bookingform.mvi.interactor.s$a$d$a$a, reason: collision with other inner class name */
                public static final class C8408a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f281943q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f281944r;

                    public C8408a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f281943q = obj;
                        this.f281944r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C8407a.this.emit(null, this);
                    }
                }

                public C8407a(InterfaceC43172j interfaceC43172j) {
                    this.f281942b = interfaceC43172j;
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
                        boolean r0 = r7 instanceof com.avito.android.short_term_rent.bookingform.mvi.interactor.s.a.d.C8407a.C8408a
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.avito.android.short_term_rent.bookingform.mvi.interactor.s$a$d$a$a r0 = (com.avito.android.short_term_rent.bookingform.mvi.interactor.s.a.d.C8407a.C8408a) r0
                        int r1 = r0.f281944r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f281944r = r1
                        goto L18
                    L13:
                        com.avito.android.short_term_rent.bookingform.mvi.interactor.s$a$d$a$a r0 = new com.avito.android.short_term_rent.bookingform.mvi.interactor.s$a$d$a$a
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f281943q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f281944r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r7)
                        goto L91
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.C42729a0.b(r7)
                        com.avito.android.short_term_rent.bookingform.domain.a r6 = (com.avito.android.short_term_rent.bookingform.domain.a) r6
                        boolean r7 = r6 instanceof com.avito.android.short_term_rent.bookingform.domain.a.InterfaceC8380a.b
                        if (r7 == 0) goto L53
                        com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction$ShowErrorInSnackbar r7 = new com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction$ShowErrorInSnackbar
                        r2 = 0
                        java.io.Serializable[] r2 = new java.io.Serializable[r2]
                        r4 = 2131957400(0x7f131698, float:1.9551383E38)
                        com.avito.android.printable_text.PrintableText r2 = com.avito.android.printable_text.b.c(r4, r2)
                        com.avito.android.short_term_rent.bookingform.domain.a$a$b r6 = (com.avito.android.short_term_rent.bookingform.domain.a.InterfaceC8380a.b) r6
                        java.lang.String r6 = r6.f281329a
                        r4 = 2
                        com.avito.android.remote.error.ApiError$UnknownError r6 = com.avito.android.remote.error.j.d(r4, r6)
                        r7.<init>(r2, r6)
                        goto L86
                    L53:
                        boolean r7 = r6 instanceof com.avito.android.short_term_rent.bookingform.domain.a.InterfaceC8380a.C8381a
                        if (r7 == 0) goto L6b
                        com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction$ShowErrorInSnackbar r7 = new com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction$ShowErrorInSnackbar
                        com.avito.android.short_term_rent.bookingform.domain.a$a$a r6 = (com.avito.android.short_term_rent.bookingform.domain.a.InterfaceC8380a.C8381a) r6
                        com.avito.android.remote.error.ApiError r2 = r6.f281328a
                        java.lang.String r2 = r2.getF244063c()
                        com.avito.android.printable_text.PrintableText r2 = com.avito.android.printable_text.b.f(r2)
                        com.avito.android.remote.error.ApiError r6 = r6.f281328a
                        r7.<init>(r2, r6)
                        goto L86
                    L6b:
                        boolean r7 = r6 instanceof com.avito.android.short_term_rent.bookingform.domain.a.b.C8382a
                        if (r7 == 0) goto L79
                        com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction$PaymentByUrl r7 = new com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction$PaymentByUrl
                        com.avito.android.short_term_rent.bookingform.domain.a$b$a r6 = (com.avito.android.short_term_rent.bookingform.domain.a.b.C8382a) r6
                        java.lang.String r6 = r6.f281330a
                        r7.<init>(r6)
                        goto L86
                    L79:
                        boolean r7 = r6 instanceof com.avito.android.short_term_rent.bookingform.domain.a.b.C8383b
                        if (r7 == 0) goto L94
                        com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction$PerformBookingRedirect r7 = new com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction$PerformBookingRedirect
                        com.avito.android.short_term_rent.bookingform.domain.a$b$b r6 = (com.avito.android.short_term_rent.bookingform.domain.a.b.C8383b) r6
                        com.avito.android.deep_linking.links.DeepLink r6 = r6.f281331a
                        r7.<init>(r6)
                    L86:
                        r0.f281944r = r3
                        kotlinx.coroutines.flow.j r6 = r5.f281942b
                        java.lang.Object r6 = r6.emit(r7, r0)
                        if (r6 != r1) goto L91
                        return r1
                    L91:
                        kotlin.G0 r6 = kotlin.G0.f406611a
                        return r6
                    L94:
                        kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                        r6.<init>()
                        throw r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.bookingform.mvi.interactor.s.a.d.C8407a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public d(C43152f0 c43152f0) {
                this.f281941b = c43152f0;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, @Y61.k Continuation continuation) throws Throwable {
                Object objCollect = this.f281941b.collect(new C8407a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C24186b c24186b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f281934t = c24186b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = s.this.new a(this.f281934t, continuation);
            aVar.f281932r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f281931q;
            C24186b c24186b = this.f281934t;
            s sVar = s.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f281932r;
                u uVar = sVar.f281927a;
                this.f281932r = interfaceC43172j;
                this.f281931q = 1;
                obj = uVar.a(c24186b.f56780d, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f281932r;
                C42729a0.b(obj);
            }
            u.a aVar = (u.a) obj;
            if (aVar instanceof u.a.C8409a) {
                BookingFormInternalAction.ShowSnackbar showSnackbar = new BookingFormInternalAction.ShowSnackbar(com.avito.android.printable_text.b.c(R.string.soft_booking_request_error_try_later, new Serializable[0]), f.a.f125253a, false, 4, null);
                this.f281932r = null;
                this.f281931q = 2;
                if (interfaceC43172j.emit(showSnackbar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (aVar instanceof u.a.b) {
                sVar.f281928b.e(c24186b.f56777a, sVar.f281930d.f281224l, c24186b.f56783g);
                X x12 = new X(new C43137a0(new b(2, null), new d(sVar.f281929c.b(c24186b, new C8406a(sVar, c24186b)))), new c(3, null));
                this.f281932r = null;
                this.f281931q = 3;
                if (C43175k.u(this, x12, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public s(@Y61.k u uVar, @Y61.k com.avito.android.short_term_rent.bookingform.mvi.interactor.a aVar, @Y61.k com.avito.android.short_term_rent.bookingform.domain.b bVar, @Y61.k BookingFormOpenParams bookingFormOpenParams) {
        this.f281927a = uVar;
        this.f281928b = aVar;
        this.f281929c = bVar;
        this.f281930d = bookingFormOpenParams;
    }

    @Override // com.avito.android.short_term_rent.bookingform.mvi.interactor.r
    @Y61.k
    public final InterfaceC43160i<BookingFormInternalAction> a(@Y61.k C24186b c24186b) {
        return C43175k.G(new a(c24186b, null));
    }
}
