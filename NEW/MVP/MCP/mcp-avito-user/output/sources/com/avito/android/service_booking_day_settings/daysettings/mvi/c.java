package com.avito.android.service_booking_day_settings.daysettings.mvi;

import Y41.p;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsInternalAction;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.SaveDayInternalAction;
import com.avito.android.service_booking_utils.events.ActionStatusEvent;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import yt0.InterfaceC50300a;

/* compiled from: DaySettingsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_day_settings.daysettings.mvi.DaySettingsActor$process$5", f = "DaySettingsActor.kt", i = {0}, l = {169, 176}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super DaySettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f276914q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f276915r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC50300a f276916s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f276917t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC50300a interfaceC50300a, d dVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f276916s = interfaceC50300a;
        this.f276917t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f276916s, this.f276917t, continuation);
        cVar.f276915r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DaySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f276914q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f276915r;
            String str = ((InterfaceC50300a.l) this.f276916s).f443579a;
            if (str != null) {
                SaveDayInternalAction.SaveShowSuccess saveShowSuccess = new SaveDayInternalAction.SaveShowSuccess(str, ActionStatusEvent.Action.f278312d);
                this.f276915r = interfaceC43172j;
                this.f276914q = 1;
                if (interfaceC43172j.emit(saveShowSuccess, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f276915r;
            C42729a0.b(obj);
        }
        DaySettingsInternalAction.OpenDeepLink openDeepLink = new DaySettingsInternalAction.OpenDeepLink((DeepLink) this.f276917t.f276924g.getValue());
        this.f276915r = null;
        this.f276914q = 2;
        if (interfaceC43172j.emit(openDeepLink, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
