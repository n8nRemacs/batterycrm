package com.avito.android.str_calendar.seller.calandar_parameters.mvi;

import Gy0.InterfaceC13931a;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrCalendarParametersActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.mvi.StrCalendarParametersActor$handleWarningDialogDenyClick$1", f = "StrCalendarParametersActor.kt", i = {}, l = {239}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrCalendarParametersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f287336q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f287337r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13931a.C f287338s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Gy0.e f287339t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f287340u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC13931a.C c12, Gy0.e eVar, a aVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f287338s = c12;
        this.f287339t = eVar;
        this.f287340u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f287338s, this.f287339t, this.f287340u, continuation);
        dVar.f287337r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrCalendarParametersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        a aVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f287336q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f287337r;
            String str = this.f287338s.f6808a;
            if (str == null) {
                return G0.f406611a;
            }
            Gy0.e eVar = this.f287339t;
            List<ParameterSlot> list = eVar.f6877d;
            Map mapC = P0.c();
            Iterator<T> it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                aVar = this.f287340u;
                if (!zHasNext) {
                    break;
                }
                ParameterSlot parameterSlot = (ParameterSlot) it.next();
                int i13 = a.f287307d;
                aVar.getClass();
                mapC = P0.k(mapC, a.c(parameterSlot));
            }
            int i14 = a.f287307d;
            aVar.getClass();
            String str2 = null;
            int i15 = 0;
            while (str != null && i15 <= 10) {
                i15++;
                str = (String) mapC.get(str);
                if (str != null) {
                    str2 = str;
                }
            }
            if (str2 == null) {
                return G0.f406611a;
            }
            Integer numD = a.d(str2, eVar);
            if (numD == null) {
                return G0.f406611a;
            }
            StrCalendarParametersInternalAction.ScrollToPosition scrollToPosition = new StrCalendarParametersInternalAction.ScrollToPosition(numD.intValue());
            this.f287336q = 1;
            if (interfaceC43172j.emit(scrollToPosition, this) == coroutine_suspended) {
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
