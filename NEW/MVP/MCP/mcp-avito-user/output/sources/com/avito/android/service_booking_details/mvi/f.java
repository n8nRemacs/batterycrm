package com.avito.android.service_booking_details.mvi;

import Bt0.InterfaceC13184a;
import Ju.InterfaceC14249c;
import com.avito.android.service_booking.deeplinks.edit.ServiceBookingEditLink;
import com.avito.android.service_booking_common.link.cancel.ServiceBookingCancelLink;
import com.avito.android.service_booking_common.link.confirm.ServiceBookingConfirmLink;
import com.avito.android.service_booking_details.BookingEditFlow;
import com.yandex.metrica.YandexMetricaDefaultValues;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;

/* compiled from: ServiceBookingItemDetailsActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlinx/coroutines/flow/i;", "LBt0/a;", "<anonymous>", "(Lkv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_details.mvi.ServiceBookingItemDetailsActor$observeDeepLinksResult$1", f = "ServiceBookingItemDetailsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class f extends SuspendLambda implements Y41.p<C43501a, Continuation<? super InterfaceC43160i<? extends InterfaceC13184a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f277383q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f277384r;

    /* compiled from: ServiceBookingItemDetailsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LBt0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_details.mvi.ServiceBookingItemDetailsActor$observeDeepLinksResult$1$1", f = "ServiceBookingItemDetailsActor.kt", i = {0, 1}, l = {89, YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS, 91}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC13184a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277385q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277386r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14249c f277387s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC14249c interfaceC14249c, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f277387s = interfaceC14249c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f277387s, continuation);
            aVar.f277386r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC13184a> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[RETURN] */
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
                int r1 = r6.f277385q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.C42729a0.b(r7)
                goto L69
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r1 = r6.f277386r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L58
            L25:
                java.lang.Object r1 = r6.f277386r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L4b
            L2d:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f277386r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                Bt0.a$f r1 = new Bt0.a$f
                Ju.c r5 = r6.f277387s
                com.avito.android.service_booking_common.link.confirm.ServiceBookingConfirmLink$b$b r5 = (com.avito.android.service_booking_common.link.confirm.ServiceBookingConfirmLink.b.C8218b) r5
                java.lang.String r5 = r5.f276596b
                r1.<init>(r5)
                r6.f277386r = r7
                r6.f277385q = r4
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L4a
                return r0
            L4a:
                r1 = r7
            L4b:
                Bt0.a$g r7 = Bt0.InterfaceC13184a.g.f1759a
                r6.f277386r = r1
                r6.f277385q = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L58
                return r0
            L58:
                Bt0.a$h r7 = new Bt0.a$h
                r7.<init>()
                r3 = 0
                r6.f277386r = r3
                r6.f277385q = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L69
                return r0
            L69:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_details.mvi.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ServiceBookingItemDetailsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LBt0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_details.mvi.ServiceBookingItemDetailsActor$observeDeepLinksResult$1$2", f = "ServiceBookingItemDetailsActor.kt", i = {0, 1, 2}, l = {95, 96, 97, 98}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC13184a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277388q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277389r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14249c f277390s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC14249c interfaceC14249c, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f277390s = interfaceC14249c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f277390s, continuation);
            bVar.f277389r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC13184a> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[RETURN] */
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
                int r1 = r7.f277388q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlin.C42729a0.b(r8)
                goto L81
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r1 = r7.f277389r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L73
            L28:
                java.lang.Object r1 = r7.f277389r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L63
            L30:
                java.lang.Object r1 = r7.f277389r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L56
            L38:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f277389r
                r1 = r8
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                Bt0.a$f r8 = new Bt0.a$f
                Ju.c r6 = r7.f277390s
                com.avito.android.service_booking_common.link.cancel.ServiceBookingCancelLink$b$b r6 = (com.avito.android.service_booking_common.link.cancel.ServiceBookingCancelLink.b.C8217b) r6
                java.lang.String r6 = r6.f276571b
                r8.<init>(r6)
                r7.f277389r = r1
                r7.f277388q = r5
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L56
                return r0
            L56:
                Bt0.a$g r8 = Bt0.InterfaceC13184a.g.f1759a
                r7.f277389r = r1
                r7.f277388q = r4
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L63
                return r0
            L63:
                Bt0.a$h r8 = new Bt0.a$h
                r8.<init>()
                r7.f277389r = r1
                r7.f277388q = r3
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L73
                return r0
            L73:
                Bt0.a$b r8 = Bt0.InterfaceC13184a.b.f1754a
                r3 = 0
                r7.f277389r = r3
                r7.f277388q = r2
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L81
                return r0
            L81:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_details.mvi.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ServiceBookingItemDetailsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LBt0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_details.mvi.ServiceBookingItemDetailsActor$observeDeepLinksResult$1$3", f = "ServiceBookingItemDetailsActor.kt", i = {0, 1}, l = {102, 103, 104}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC13184a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277391q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277392r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ h f277393s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h hVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f277393s = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f277393s, continuation);
            cVar.f277392r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC13184a> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f277391q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.C42729a0.b(r6)
                goto L6d
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                java.lang.Object r1 = r5.f277392r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L52
            L25:
                java.lang.Object r1 = r5.f277392r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L42
            L2d:
                kotlin.C42729a0.b(r6)
                java.lang.Object r6 = r5.f277392r
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
                Bt0.a$g r1 = Bt0.InterfaceC13184a.g.f1759a
                r5.f277392r = r6
                r5.f277391q = r4
                java.lang.Object r1 = r6.emit(r1, r5)
                if (r1 != r0) goto L41
                return r0
            L41:
                r1 = r6
            L42:
                Bt0.a$h r6 = new Bt0.a$h
                r6.<init>()
                r5.f277392r = r1
                r5.f277391q = r3
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L52
                return r0
            L52:
                Bt0.a$d r6 = new Bt0.a$d
                com.avito.android.service_booking_details.mvi.h r3 = r5.f277393s
                com.avito.android.service_booking_details.l r3 = r3.f277410e
                com.avito.android.service_booking_details.BookingEditFlow r4 = com.avito.android.service_booking_details.BookingEditFlow.f277170c
                com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink r3 = r3.a(r4)
                r6.<init>(r3)
                r3 = 0
                r5.f277392r = r3
                r5.f277391q = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L6d
                return r0
            L6d:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking_details.mvi.f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ServiceBookingItemDetailsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LBt0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_details.mvi.ServiceBookingItemDetailsActor$observeDeepLinksResult$1$4", f = "ServiceBookingItemDetailsActor.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC13184a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277394q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277395r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ h f277396s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h hVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f277396s = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(this.f277396s, continuation);
            dVar.f277395r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC13184a> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277394q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f277395r;
                InterfaceC13184a.d dVar = new InterfaceC13184a.d(this.f277396s.f277410e.a(BookingEditFlow.f277171d));
                this.f277394q = 1;
                if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
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

    /* compiled from: ServiceBookingItemDetailsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LBt0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_details.mvi.ServiceBookingItemDetailsActor$observeDeepLinksResult$1$5", f = "ServiceBookingItemDetailsActor.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC13184a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277397q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277398r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14249c f277399s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC14249c interfaceC14249c, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f277399s = interfaceC14249c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f277399s, continuation);
            eVar.f277398r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC13184a> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277397q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f277398r;
                InterfaceC13184a.e eVar = new InterfaceC13184a.e(((ServiceBookingConfirmLink.b.a) this.f277399s).f276595b);
                this.f277397q = 1;
                if (interfaceC43172j.emit(eVar, this) == coroutine_suspended) {
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

    /* compiled from: ServiceBookingItemDetailsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LBt0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_details.mvi.ServiceBookingItemDetailsActor$observeDeepLinksResult$1$6", f = "ServiceBookingItemDetailsActor.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.service_booking_details.mvi.f$f, reason: collision with other inner class name */
    public static final class C8239f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC13184a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f277400q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f277401r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14249c f277402s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8239f(InterfaceC14249c interfaceC14249c, Continuation<? super C8239f> continuation) {
            super(2, continuation);
            this.f277402s = interfaceC14249c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C8239f c8239f = new C8239f(this.f277402s, continuation);
            c8239f.f277401r = obj;
            return c8239f;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC13184a> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8239f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f277400q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f277401r;
                InterfaceC13184a.e eVar = new InterfaceC13184a.e(((ServiceBookingCancelLink.b.a) this.f277402s).f276570b);
                this.f277400q = 1;
                if (interfaceC43172j.emit(eVar, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f277384r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f277384r, continuation);
        fVar.f277383q = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC43160i<? extends InterfaceC13184a>> continuation) {
        return ((f) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC14249c interfaceC14249c = ((C43501a) this.f277383q).f413261b;
        if (interfaceC14249c instanceof ServiceBookingConfirmLink.b.C8218b) {
            return C43175k.G(new a(interfaceC14249c, null));
        }
        if (interfaceC14249c instanceof ServiceBookingCancelLink.b.C8217b) {
            return C43175k.G(new b(interfaceC14249c, null));
        }
        boolean z12 = interfaceC14249c instanceof ServiceBookingEditLink.b.c;
        h hVar = this.f277384r;
        if (z12) {
            return C43175k.G(new c(hVar, null));
        }
        return interfaceC14249c instanceof ServiceBookingEditLink.b.a ? true : interfaceC14249c instanceof ServiceBookingEditLink.b.C8143b ? C43175k.G(new d(hVar, null)) : interfaceC14249c instanceof ServiceBookingConfirmLink.b.a ? C43175k.G(new e(interfaceC14249c, null)) : interfaceC14249c instanceof ServiceBookingCancelLink.b.a ? C43175k.G(new C8239f(interfaceC14249c, null)) : C43175k.w();
    }
}
