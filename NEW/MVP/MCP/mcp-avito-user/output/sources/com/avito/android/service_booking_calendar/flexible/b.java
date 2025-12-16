package com.avito.android.service_booking_calendar.flexible;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.arch.mvi.q;
import com.avito.android.service_booking_calendar.flexible.data.mvi.entity.CalendarDataInternalAction;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderInternalAction;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState;
import gt0.InterfaceC40733a;
import gt0.InterfaceC40734b;
import gt0.InterfaceC40735c;
import ht0.InterfaceC40984a;
import ht0.InterfaceC40985b;
import javax.inject.Inject;
import jt0.InterfaceC42425a;
import jt0.InterfaceC42426b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;

/* compiled from: CalendarFlexibleViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/b;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/service_booking_calendar/flexible/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends M0 implements com.avito.android.service_booking_calendar.flexible.a {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final com.avito.android.arch.mvi.c<InterfaceC42425a, CalendarHeaderInternalAction, CalendarHeaderState, InterfaceC42426b> f275622E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final com.avito.android.arch.mvi.c<InterfaceC40733a, InterfaceC40734b, gt0.d, InterfaceC40735c> f275623J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final com.avito.android.arch.mvi.c<InterfaceC40984a, CalendarDataInternalAction, com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a, InterfaceC40985b> f275624K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final n2<com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a> f275625L;

    /* renamed from: M, reason: collision with root package name */
    @k
    public final n2<CalendarHeaderState> f275626M;

    /* renamed from: N, reason: collision with root package name */
    @k
    public final n2<gt0.d> f275627N;

    /* compiled from: CalendarFlexibleViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.CalendarFlexibleViewModelImpl$accept$1", f = "CalendarFlexibleViewModel.kt", i = {}, l = {48, 49, 50}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f275628q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ d f275629r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ b f275630s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f275629r = dVar;
            this.f275630s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f275629r, this.f275630s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f275628q;
            if (i12 == 0) {
                C42729a0.b(obj);
                d dVar = this.f275629r;
                boolean z12 = dVar instanceof InterfaceC42425a;
                b bVar = this.f275630s;
                if (z12) {
                    com.avito.android.arch.mvi.c<InterfaceC42425a, CalendarHeaderInternalAction, CalendarHeaderState, InterfaceC42426b> cVar = bVar.f275622E;
                    this.f275628q = 1;
                    if (cVar.ya(dVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (dVar instanceof InterfaceC40733a) {
                    com.avito.android.arch.mvi.c<InterfaceC40733a, InterfaceC40734b, gt0.d, InterfaceC40735c> cVar2 = bVar.f275623J;
                    this.f275628q = 2;
                    if (cVar2.ya(dVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (dVar instanceof InterfaceC40984a) {
                    com.avito.android.arch.mvi.c<InterfaceC40984a, CalendarDataInternalAction, com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a, InterfaceC40985b> cVar3 = bVar.f275624K;
                    this.f275628q = 3;
                    if (cVar3.ya(dVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k com.avito.android.service_booking_calendar.flexible.data.mvi.g gVar, @k com.avito.android.service_booking_calendar.flexible.header.mvi.i iVar, @k com.avito.android.service_booking_calendar.flexible.content.mvi.g gVar2) {
        com.avito.android.arch.mvi.c<InterfaceC42425a, CalendarHeaderInternalAction, CalendarHeaderState, InterfaceC42426b> cVarB = q.b(iVar, null, N0.a(this), 1);
        this.f275622E = cVarB;
        com.avito.android.arch.mvi.c<InterfaceC40733a, InterfaceC40734b, gt0.d, InterfaceC40735c> cVarB2 = q.b(gVar2, null, N0.a(this), 1);
        this.f275623J = cVarB2;
        com.avito.android.arch.mvi.c<InterfaceC40984a, CalendarDataInternalAction, com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a, InterfaceC40985b> cVarB3 = q.b(gVar, null, N0.a(this), 1);
        this.f275624K = cVarB3;
        A1.a aVarA = N0.a(this);
        i2.f411430a.getClass();
        i2 i2Var = i2.a.f411433c;
        this.f275625L = C43175k.U(cVarB3, aVarA, i2Var, cVarB3.f91929r.get());
        this.f275626M = C43175k.U(cVarB, N0.a(this), i2Var, cVarB.f91929r.get());
        this.f275627N = C43175k.U(cVarB2, N0.a(this), i2Var, cVarB2.f91929r.get());
    }

    @Override // com.avito.android.service_booking_calendar.b
    public final void P2(int i12) {
        accept(new InterfaceC40733a.f(i12));
    }

    @Override // com.avito.android.service_booking_calendar.b
    public final void Y4(@k com.avito.android.service_booking_calendar.domain.b bVar) {
        accept(new InterfaceC42425a.l(bVar));
    }

    @Override // com.avito.android.arch.mvi.android.m
    @k
    public final InterfaceC43160i<Object> getEvents() {
        return C43175k.N(this.f275622E.f91928q, this.f275623J.f91928q, this.f275624K.f91928q);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @k
    public final n2<com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a> getState() {
        return this.f275625L;
    }

    @Override // com.avito.android.arch.mvi.android.l
    /* renamed from: ke, reason: merged with bridge method [inline-methods] */
    public final void accept(@k d dVar) {
        C43259k.d(N0.a(this), null, null, new a(dVar, this, null), 3);
    }

    @Override // com.avito.android.service_booking_calendar.flexible.a
    @k
    public final n2<gt0.d> od() {
        return this.f275627N;
    }

    @Override // com.avito.android.service_booking_calendar.flexible.a
    @k
    public final n2<CalendarHeaderState> y4() {
        return this.f275626M;
    }
}
