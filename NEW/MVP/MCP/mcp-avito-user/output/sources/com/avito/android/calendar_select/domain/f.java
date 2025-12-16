package com.avito.android.calendar_select.domain;

import Wl.InterfaceC15773a;
import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.calendar_select.CalendarSettings;
import com.avito.android.calendar_select.presentation.mvicalendarselect.mvi.entity.CalendarSelectInternalAction;
import com.avito.android.util.R0;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LoadCalendarUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/domain/f;", "Lcom/avito/android/calendar_select/domain/e;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC15773a f113363a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.calendar_select.domain.b f113364b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f113365c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CalendarSettings f113366d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC28373a f113367e;

    /* compiled from: LoadCalendarUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.calendar_select.domain.LoadCalendarUseCaseImpl$invoke$1", f = "LoadCalendarUseCase.kt", i = {0, 1}, l = {34, 35, 37}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super CalendarSelectInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f113368q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f113369r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ CalendarSelectInternalAction.LoadingType f113370s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ f f113371t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CalendarSelectInternalAction.LoadingType loadingType, f fVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f113370s = loadingType;
            this.f113371t = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f113370s, this.f113371t, continuation);
            aVar.f113369r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CalendarSelectInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[RETURN] */
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
                int r1 = r7.f113368q
                com.avito.android.calendar_select.domain.f r2 = r7.f113371t
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2f
                if (r1 == r5) goto L27
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                kotlin.C42729a0.b(r8)
                goto L6e
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                java.lang.Object r1 = r7.f113369r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5a
            L27:
                java.lang.Object r1 = r7.f113369r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L49
            L2f:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f113369r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.calendar_select.presentation.mvicalendarselect.mvi.entity.CalendarSelectInternalAction$LoadingStarted r1 = new com.avito.android.calendar_select.presentation.mvicalendarselect.mvi.entity.CalendarSelectInternalAction$LoadingStarted
                com.avito.android.calendar_select.presentation.mvicalendarselect.mvi.entity.CalendarSelectInternalAction$LoadingType r6 = r7.f113370s
                r1.<init>(r6)
                r7.f113369r = r8
                r7.f113368q = r5
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L48
                return r0
            L48:
                r1 = r8
            L49:
                Wl.a r8 = r2.f113363a
                com.avito.android.calendar_select.CalendarSettings r5 = r2.f113366d
                java.lang.String r5 = r5.f113319h
                r7.f113369r = r1
                r7.f113368q = r4
                java.lang.Object r8 = r8.a(r5, r7)
                if (r8 != r0) goto L5a
                return r0
            L5a:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                com.avito.android.calendar_select.domain.b r2 = r2.f113364b
                com.avito.android.calendar_select.presentation.mvicalendarselect.mvi.entity.CalendarSelectInternalAction r8 = r2.a(r8)
                r2 = 0
                r7.f113369r = r2
                r7.f113368q = r3
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L6e
                return r0
            L6e:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.calendar_select.domain.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: LoadCalendarUseCase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/calendar_select/presentation/mvicalendarselect/mvi/entity/CalendarSelectInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.calendar_select.domain.LoadCalendarUseCaseImpl$invoke$2", f = "LoadCalendarUseCase.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super CalendarSelectInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f113372q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f113373r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f113374s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super CalendarSelectInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f113373r = interfaceC43172j;
            bVar.f113374s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f113372q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f113373r;
                CalendarSelectInternalAction.CalendarLoadFailed calendarLoadFailed = new CalendarSelectInternalAction.CalendarLoadFailed(this.f113374s);
                this.f113373r = null;
                this.f113372q = 1;
                if (interfaceC43172j.emit(calendarLoadFailed, this) == coroutine_suspended) {
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
    public f(@k InterfaceC15773a interfaceC15773a, @k com.avito.android.calendar_select.domain.b bVar, @k R0 r02, @k CalendarSettings calendarSettings, @k InterfaceC28373a interfaceC28373a) {
        this.f113363a = interfaceC15773a;
        this.f113364b = bVar;
        this.f113365c = r02;
        this.f113366d = calendarSettings;
        this.f113367e = interfaceC28373a;
    }

    @Override // com.avito.android.calendar_select.domain.e
    @k
    public final InterfaceC43160i<CalendarSelectInternalAction> a(@k CalendarSelectInternalAction.LoadingType loadingType) {
        String str = this.f113366d.f113319h;
        if (str == null) {
            return C43175k.w();
        }
        this.f113367e.c(new ParametrizedClickStreamEvent(13415, 0, Collections.singletonMap("api_path", str), null, 8, null));
        return C43175k.I(this.f113365c.a(), new C43152f0(C43175k.G(new a(loadingType, this, null)), new b(3, null)));
    }
}
