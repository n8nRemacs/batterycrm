package com.avito.android.service_booking_calendar.flexible.header.mvi;

import Y41.p;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderInternalAction;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState;
import it0.C42108c;
import it0.InterfaceC42106a;
import java.util.Iterator;
import jt0.InterfaceC42425a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CalendarHeaderActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.header.mvi.CalendarHeaderActor$process$5", f = "CalendarHeaderActor.kt", i = {0}, l = {97, 99}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class e extends SuspendLambda implements p<InterfaceC43172j<? super CalendarHeaderInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f275976q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f275977r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CalendarHeaderState f275978s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42425a f275979t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f275980u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CalendarHeaderState calendarHeaderState, InterfaceC42425a interfaceC42425a, f fVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f275978s = calendarHeaderState;
        this.f275979t = interfaceC42425a;
        this.f275980u = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f275978s, this.f275979t, this.f275980u, continuation);
        eVar.f275977r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CalendarHeaderInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f275976q;
        InterfaceC42425a interfaceC42425a = this.f275979t;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f275977r;
            Iterator<T> it = this.f275978s.f276018o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                InterfaceC42106a interfaceC42106a = (InterfaceC42106a) next;
                if ((interfaceC42106a instanceof C42108c) && L.f(((C42108c) interfaceC42106a).f405348d, ((InterfaceC42425a.g) interfaceC42425a).f405875b)) {
                    break;
                }
            }
            InterfaceC42106a interfaceC42106a2 = (InterfaceC42106a) next;
            if (interfaceC42106a2 != null) {
                InterfaceC43160i<CalendarHeaderInternalAction> interfaceC43160iE = this.f275980u.f276032a.e(interfaceC42106a2);
                this.f275977r = interfaceC43172j;
                this.f275976q = 1;
                if (C43175k.u(this, interfaceC43160iE, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f275977r;
            C42729a0.b(obj);
        }
        CalendarHeaderInternalAction.LaunchDeepLink launchDeepLink = new CalendarHeaderInternalAction.LaunchDeepLink(((InterfaceC42425a.g) interfaceC42425a).f405874a);
        this.f275977r = null;
        this.f275976q = 2;
        if (interfaceC43172j.emit(launchDeepLink, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
