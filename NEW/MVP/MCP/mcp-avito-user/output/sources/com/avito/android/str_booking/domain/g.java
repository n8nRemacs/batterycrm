package com.avito.android.str_booking.domain;

import Nx0.InterfaceC14622b;
import Px0.InterfaceC14851a;
import Wx0.C15807a;
import Y41.p;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.d1;
import com.avito.android.str_booking.mvi.entity.StrBookingInternalAction;
import com.avito.android.str_booking.network.models.sections.UpdatedTimeContent;
import com.avito.android.str_booking.network.models.sections.UpdatedTimeSection;
import com.avito.android.util.R0;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import lE.C43624b;

/* compiled from: StrBookingInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/domain/g;", "Lcom/avito/android/str_booking/domain/f;", "a", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f285578l = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14851a f285579a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14622b f285580b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final d1 f285581c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f285582d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f285583e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C43624b f285584f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.provider.a f285585g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C15807a f285586h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_booking.domain.a f285587i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f285588j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f285589k = new AtomicBoolean(false);

    /* compiled from: StrBookingInteractor.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/str_booking/domain/g$a;", "", "<init>", "()V", "", "DEFAULT_DEBOUNCE_MILLIS", "J", "", "DEFAULT_TOOLTIPS", "I", "", "ORDER_ID_PARSE_ERROR_MESSAGE", "Ljava/lang/String;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrBookingInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_booking.domain.StrBookingInteractorImpl$loadBuyerStrBooking$1", f = "StrBookingInteractor.kt", i = {0, 1, 2, 2, 3, 3, 3, 4, 4, 4}, l = {186, 188, 200, 205, JfifUtil.MARKER_SOI, 232, 241}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "response", "$this$flow", "response", "isEventBusUpdateEnabled", "$this$flow", "response", "isEventBusUpdateEnabled"}, s = {"L$0", "L$0", "L$0", "L$3", "L$0", "L$3", "I$0", "L$0", "L$3", "I$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super StrBookingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public g f285590q;

        /* renamed from: r, reason: collision with root package name */
        public String f285591r;

        /* renamed from: s, reason: collision with root package name */
        public Ux0.c f285592s;

        /* renamed from: t, reason: collision with root package name */
        public int f285593t;

        /* renamed from: u, reason: collision with root package name */
        public int f285594u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f285595v;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f285597x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f285598y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f285597x = str;
            this.f285598y = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = g.this.new b(this.f285597x, this.f285598y, continuation);
            bVar.f285595v = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x017f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01be  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01c3  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01d9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 538
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_booking.domain.g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: StrBookingInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_booking.domain.StrBookingInteractorImpl$makeGetRequest$1", f = "StrBookingInteractor.kt", i = {0}, l = {249, 251, 250}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super StrBookingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f285599q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f285600r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f285602t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f285602t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = g.this.new c(this.f285602t, continuation);
            cVar.f285600r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[RETURN] */
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
                int r1 = r5.f285599q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.C42729a0.b(r6)
                goto L8c
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                java.lang.Object r1 = r5.f285600r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L57
            L26:
                java.lang.Object r1 = r5.f285600r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L46
            L2e:
                kotlin.C42729a0.b(r6)
                java.lang.Object r6 = r5.f285600r
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
                com.avito.android.str_booking.mvi.entity.StrBookingInternalAction$StartLoading r1 = new com.avito.android.str_booking.mvi.entity.StrBookingInternalAction$StartLoading
                r1.<init>()
                r5.f285600r = r6
                r5.f285599q = r4
                java.lang.Object r1 = r6.emit(r1, r5)
                if (r1 != r0) goto L45
                return r0
            L45:
                r1 = r6
            L46:
                com.avito.android.str_booking.domain.g r6 = com.avito.android.str_booking.domain.g.this
                com.avito.android.remote.d1 r6 = r6.f285581c
                r5.f285600r = r1
                r5.f285599q = r3
                java.lang.String r3 = r5.f285602t
                java.lang.Object r6 = r6.i(r3, r5)
                if (r6 != r0) goto L57
                return r0
            L57:
                com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
                boolean r3 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r3 == 0) goto L68
                com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
                java.lang.Object r6 = r6.getResult()
                Ux0.b r6 = (Ux0.b) r6
                com.avito.android.str_booking.mvi.entity.StrBookingInternalAction$GetRequestSuccess r6 = com.avito.android.str_booking.mvi.entity.StrBookingInternalAction.GetRequestSuccess.f285752b
                goto L80
            L68:
                boolean r3 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L8f
                com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
                com.avito.android.remote.error.ApiError r3 = r6.getError()
                java.lang.Throwable r6 = r6.getCause()
                com.avito.android.util.ApiException r6 = com.avito.android.util.C35936s.a(r3, r6)
                com.avito.android.str_booking.mvi.entity.StrBookingInternalAction$Error r3 = new com.avito.android.str_booking.mvi.entity.StrBookingInternalAction$Error
                r3.<init>(r6)
                r6 = r3
            L80:
                r3 = 0
                r5.f285600r = r3
                r5.f285599q = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L8c
                return r0
            L8c:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            L8f:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_booking.domain.g.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: StrBookingInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_booking.domain.StrBookingInteractorImpl$makePostRequest$1", f = "StrBookingInteractor.kt", i = {0}, l = {264, 266, 265}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super StrBookingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f285603q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f285604r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f285606t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f285607u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Map<String, String> map, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f285606t = str;
            this.f285607u = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = g.this.new d(this.f285606t, this.f285607u, continuation);
            dVar.f285604r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[RETURN] */
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
                int r1 = r5.f285603q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.C42729a0.b(r6)
                goto L8e
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                java.lang.Object r1 = r5.f285604r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L59
            L26:
                java.lang.Object r1 = r5.f285604r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L46
            L2e:
                kotlin.C42729a0.b(r6)
                java.lang.Object r6 = r5.f285604r
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
                com.avito.android.str_booking.mvi.entity.StrBookingInternalAction$StartLoading r1 = new com.avito.android.str_booking.mvi.entity.StrBookingInternalAction$StartLoading
                r1.<init>()
                r5.f285604r = r6
                r5.f285603q = r4
                java.lang.Object r1 = r6.emit(r1, r5)
                if (r1 != r0) goto L45
                return r0
            L45:
                r1 = r6
            L46:
                com.avito.android.str_booking.domain.g r6 = com.avito.android.str_booking.domain.g.this
                com.avito.android.remote.d1 r6 = r6.f285581c
                r5.f285604r = r1
                r5.f285603q = r3
                java.lang.String r3 = r5.f285606t
                java.util.Map<java.lang.String, java.lang.String> r4 = r5.f285607u
                java.lang.Object r6 = r6.n(r3, r4, r5)
                if (r6 != r0) goto L59
                return r0
            L59:
                com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
                boolean r3 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r3 == 0) goto L6a
                com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
                java.lang.Object r6 = r6.getResult()
                Ux0.b r6 = (Ux0.b) r6
                com.avito.android.str_booking.mvi.entity.StrBookingInternalAction$PostRequestSuccess r6 = com.avito.android.str_booking.mvi.entity.StrBookingInternalAction.PostRequestSuccess.f285766b
                goto L82
            L6a:
                boolean r3 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L91
                com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
                com.avito.android.remote.error.ApiError r3 = r6.getError()
                java.lang.Throwable r6 = r6.getCause()
                com.avito.android.util.ApiException r6 = com.avito.android.util.C35936s.a(r3, r6)
                com.avito.android.str_booking.mvi.entity.StrBookingInternalAction$Error r3 = new com.avito.android.str_booking.mvi.entity.StrBookingInternalAction$Error
                r3.<init>(r6)
                r6 = r3
            L82:
                r3 = 0
                r5.f285604r = r3
                r5.f285603q = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L8e
                return r0
            L8e:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            L91:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_booking.domain.g.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    @Inject
    public g(@Y61.k InterfaceC14851a interfaceC14851a, @Y61.k InterfaceC14622b interfaceC14622b, @Y61.k d1 d1Var, @Y61.k R0 r02, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C43624b c43624b, @Y61.k com.avito.android.analytics.provider.a aVar, @Y61.k C15807a c15807a, @Y61.k com.avito.android.str_booking.domain.a aVar2, @Y61.k @Named("order_id") String str) {
        this.f285579a = interfaceC14851a;
        this.f285580b = interfaceC14622b;
        this.f285581c = d1Var;
        this.f285582d = r02;
        this.f285583e = interfaceC28373a;
        this.f285584f = c43624b;
        this.f285585g = aVar;
        this.f285586h = c15807a;
        this.f285587i = aVar2;
        this.f285588j = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(com.avito.android.str_booking.domain.g r3, Ux0.c r4) {
        /*
            r3.getClass()
            java.util.List r4 = r4.a()
            if (r4 == 0) goto L33
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r4.next()
            boolean r2 = r1 instanceof com.avito.android.str_booking.network.models.sections.ClickStreamSection
            if (r2 == 0) goto L14
            r0.add(r1)
            goto L14
        L26:
            java.lang.Object r4 = kotlin.collections.C42745f0.G(r0)
            com.avito.android.str_booking.network.models.sections.ClickStreamSection r4 = (com.avito.android.str_booking.network.models.sections.ClickStreamSection) r4
            if (r4 == 0) goto L33
            com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent r4 = r4.getContent()
            goto L34
        L33:
            r4 = 0
        L34:
            if (r4 == 0) goto L4d
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f285589k
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto L4d
            Jx0.a$a r0 = Jx0.C14258a.f9179c
            r0.getClass()
            Jx0.a r4 = Jx0.C14258a.C0546a.a(r4)
            com.avito.android.analytics.a r3 = r3.f285583e
            r3.c(r4)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_booking.domain.g.e(com.avito.android.str_booking.domain.g, Ux0.c):void");
    }

    public static final UpdatedTimeContent f(g gVar, Ux0.c cVar) {
        gVar.getClass();
        List<Ux0.d> listA = cVar.a();
        if (listA != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (obj instanceof UpdatedTimeSection) {
                    arrayList.add(obj);
                }
            }
            UpdatedTimeSection updatedTimeSection = (UpdatedTimeSection) C42745f0.G(arrayList);
            if (updatedTimeSection != null) {
                return updatedTimeSection.getContent();
            }
        }
        return null;
    }

    @Override // com.avito.android.str_booking.domain.f
    @Y61.k
    public final InterfaceC43160i<StrBookingInternalAction> a(@Y61.k String str, @Y61.k Map<String, String> map) {
        return C43175k.I(this.f285582d.a(), C43175k.G(new d(str, map, null)));
    }

    @Override // com.avito.android.str_booking.domain.f
    @Y61.k
    public final C0 b(@Y61.k String str) {
        return C43175k.B(new k(this, null), C43175k.n(new C43137a0(new j(2, null), new h(C43175k.G(new i(this, str, null)))), 300L));
    }

    @Override // com.avito.android.str_booking.domain.f
    @Y61.k
    public final InterfaceC43160i<StrBookingInternalAction> c(@Y61.k String str) {
        return C43175k.I(this.f285582d.a(), C43175k.G(new c(str, null)));
    }

    @Override // com.avito.android.str_booking.domain.f
    @Y61.k
    public final InterfaceC43160i<StrBookingInternalAction> d(@Y61.k String str, @Y61.l String str2) {
        return C43175k.I(this.f285582d.a(), C43175k.G(new b(str, str2, null)));
    }
}
