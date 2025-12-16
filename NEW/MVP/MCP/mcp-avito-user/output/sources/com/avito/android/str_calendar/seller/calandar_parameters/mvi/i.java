package com.avito.android.str_calendar.seller.calandar_parameters.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Date;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import uy0.InterfaceC49128a;
import uy0.InterfaceC49130c;

/* compiled from: StrCalendarParametersBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/i;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements com.avito.android.arch.mvi.b<StrCalendarParametersInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calandar_parameters.domain.b f287413a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f287414b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Date f287415c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Date f287416d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f287417e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f287418f;

    /* compiled from: StrCalendarParametersBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.mvi.StrCalendarParametersBootstrap$produce$1", f = "StrCalendarParametersBootstrap.kt", i = {0, 1}, l = {AvailableCode.HMS_IS_SPOOF, 30, 31}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrCalendarParametersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f287419q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f287420r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = i.this.new a(continuation);
            aVar.f287420r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrCalendarParametersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0083 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f287419q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.C42729a0.b(r10)
                goto L84
            L15:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1d:
                java.lang.Object r1 = r9.f287420r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L6e
            L25:
                java.lang.Object r1 = r9.f287420r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L55
            L2d:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f287420r
                kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
                com.avito.android.str_calendar.seller.calandar_parameters.mvi.i r1 = com.avito.android.str_calendar.seller.calandar_parameters.mvi.i.this
                boolean r1 = r1.f287418f
                if (r1 != 0) goto L88
                com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction$Init r1 = new com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction$Init
                com.avito.android.str_calendar.seller.calandar_parameters.mvi.i r5 = com.avito.android.str_calendar.seller.calandar_parameters.mvi.i.this
                java.lang.String r6 = r5.f287414b
                java.util.Date r7 = r5.f287415c
                java.util.Date r8 = r5.f287416d
                boolean r5 = r5.f287417e
                r1.<init>(r6, r7, r8, r5)
                r9.f287420r = r10
                r9.f287419q = r4
                java.lang.Object r1 = r10.emit(r1, r9)
                if (r1 != r0) goto L54
                return r0
            L54:
                r1 = r10
            L55:
                com.avito.android.str_calendar.seller.calandar_parameters.mvi.i r10 = com.avito.android.str_calendar.seller.calandar_parameters.mvi.i.this
                com.avito.android.str_calendar.seller.calandar_parameters.domain.b r5 = r10.f287413a
                java.lang.String r6 = r10.f287414b
                java.util.Date r7 = r10.f287415c
                java.util.Date r10 = r10.f287416d
                kotlinx.coroutines.flow.f0 r10 = r5.c(r6, r7, r10)
                r9.f287420r = r1
                r9.f287419q = r3
                java.lang.Object r10 = kotlinx.coroutines.flow.C43175k.u(r9, r10, r1)
                if (r10 != r0) goto L6e
                return r0
            L6e:
                com.avito.android.str_calendar.seller.calandar_parameters.mvi.i r10 = com.avito.android.str_calendar.seller.calandar_parameters.mvi.i.this
                com.avito.android.str_calendar.seller.calandar_parameters.domain.b r3 = r10.f287413a
                java.lang.String r10 = r10.f287414b
                kotlinx.coroutines.flow.i r10 = r3.d(r10)
                r3 = 0
                r9.f287420r = r3
                r9.f287419q = r2
                java.lang.Object r10 = kotlinx.coroutines.flow.C43175k.u(r9, r10, r1)
                if (r10 != r0) goto L84
                return r0
            L84:
                com.avito.android.str_calendar.seller.calandar_parameters.mvi.i r10 = com.avito.android.str_calendar.seller.calandar_parameters.mvi.i.this
                r10.f287418f = r4
            L88:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calandar_parameters.mvi.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public i(@Y61.k com.avito.android.str_calendar.seller.calandar_parameters.domain.b bVar, @InterfaceC49128a @Y61.k String str, @uy0.f @Y61.l Date date, @Y61.l @InterfaceC49130c Date date2, @uy0.e boolean z12) {
        this.f287413a = bVar;
        this.f287414b = str;
        this.f287415c = date;
        this.f287416d = date2;
        this.f287417e = z12;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<StrCalendarParametersInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
