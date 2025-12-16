package com.avito.android.service_booking.mvi.domain.interactors;

import Ks0.InterfaceC14347a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction;
import com.avito.android.service_booking.remote.timeslots.ServiceBookingTimeslotsResult;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import qt0.C47440d;

/* compiled from: ServiceBookingCoroutinesInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking.mvi.domain.interactors.ServiceBookingCoroutinesInteractorImpl$loadTimestamps$1", f = "ServiceBookingCoroutinesInteractor.kt", i = {0}, l = {275, 276, 281}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super ServiceBookingMviStepInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f274387q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f274388r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f274389s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f274390t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C47440d.a f274391u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f274392v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, String str, C47440d.a aVar, Map<String, String> map, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f274389s = bVar;
        this.f274390t = str;
        this.f274391u = aVar;
        this.f274392v = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        d dVar = new d(this.f274389s, this.f274390t, this.f274391u, this.f274392v, continuation);
        dVar.f274388r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ServiceBookingMviStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f274387q;
        b bVar = this.f274389s;
        C47440d.a aVar = this.f274391u;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f274388r;
            InterfaceC14347a interfaceC14347a = bVar.f274358a.get();
            String strValueOf = String.valueOf(TimeUnit.MILLISECONDS.toSeconds(aVar.f429417d.getTime()));
            this.f274388r = interfaceC43172j;
            this.f274387q = 1;
            obj = interfaceC14347a.a(this.f274390t, strValueOf, this.f274392v, this);
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
            interfaceC43172j = (InterfaceC43172j) this.f274388r;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Error) {
            ServiceBookingMviStepInternalAction.TimeSlotsInternalAction.TimeslotsError timeslotsError = new ServiceBookingMviStepInternalAction.TimeSlotsInternalAction.TimeslotsError(new Q(aVar, new C47440d.c.b(((TypedResult.Error) typedResult).getCause())));
            this.f274388r = null;
            this.f274387q = 2;
            if (interfaceC43172j.emit(timeslotsError, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (typedResult instanceof TypedResult.Success) {
            ServiceBookingMviStepInternalAction.TimeSlotsInternalAction.TimeslotsLoaded timeslotsLoaded = new ServiceBookingMviStepInternalAction.TimeSlotsInternalAction.TimeslotsLoaded(bVar.f274364g.a(aVar, ((ServiceBookingTimeslotsResult) ((TypedResult.Success) typedResult).getResult()).c()));
            this.f274388r = null;
            this.f274387q = 3;
            if (interfaceC43172j.emit(timeslotsLoaded, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
