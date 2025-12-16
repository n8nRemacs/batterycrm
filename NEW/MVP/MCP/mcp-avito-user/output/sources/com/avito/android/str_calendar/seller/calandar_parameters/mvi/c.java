package com.avito.android.str_calendar.seller.calandar_parameters.mvi;

import com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrCalendarParametersActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.mvi.StrCalendarParametersActor$handleWarningDialogAcceptClick$1", f = "StrCalendarParametersActor.kt", i = {0, 0}, l = {211, 212}, m = "invokeSuspend", n = {"$this$flow", "advertId"}, s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrCalendarParametersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f287331q;

    /* renamed from: r, reason: collision with root package name */
    public int f287332r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f287333s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Gy0.e f287334t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f287335u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Gy0.e eVar, a aVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f287334t = eVar;
        this.f287335u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f287334t, this.f287335u, continuation);
        cVar.f287333s = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrCalendarParametersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f287332r;
        Gy0.e eVar = this.f287334t;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f287333s;
            str = eVar.f6885l;
            if (str == null) {
                return G0.f406611a;
            }
            StrCalendarParametersInternalAction.WarningAcceptedChange warningAcceptedChange = new StrCalendarParametersInternalAction.WarningAcceptedChange(true);
            this.f287333s = interfaceC43172j;
            this.f287331q = str;
            this.f287332r = 1;
            if (interfaceC43172j.emit(warningAcceptedChange, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            str = this.f287331q;
            interfaceC43172j = (InterfaceC43172j) this.f287333s;
            C42729a0.b(obj);
        }
        String str2 = str;
        InterfaceC43160i<StrCalendarParametersInternalAction> interfaceC43160iE = this.f287335u.f287308a.e(eVar.f6876c, str2, eVar.f6886m, eVar.f6887n, Boxing.boxBoolean(true), false, eVar.f6890q, eVar.f6892s);
        this.f287333s = null;
        this.f287331q = null;
        this.f287332r = 2;
        if (C43175k.u(this, interfaceC43160iE, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
