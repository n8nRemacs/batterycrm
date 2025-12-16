package com.avito.android.str_calendar.seller.calandar_parameters.mvi;

import com.avito.android.remote.model.category_parameters.GroupParameter;
import com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrCalendarParametersActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.mvi.StrCalendarParametersActor$startOnboardingIfAllowed$1", f = "StrCalendarParametersActor.kt", i = {0, 0, 1, 1}, l = {253, 254, 255}, m = "invokeSuspend", n = {"$this$flow", "position", "$this$flow", "position"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes4.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrCalendarParametersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public GroupParameter.OnboardingTooltip f287401q;

    /* renamed from: r, reason: collision with root package name */
    public int f287402r;

    /* renamed from: s, reason: collision with root package name */
    public int f287403s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f287404t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Gy0.e f287405u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f287406v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a f287407w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ GroupParameter.OnboardingTooltip f287408x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Gy0.e eVar, String str, a aVar, GroupParameter.OnboardingTooltip onboardingTooltip, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f287405u = eVar;
        this.f287406v = str;
        this.f287407w = aVar;
        this.f287408x = onboardingTooltip;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f287405u, this.f287406v, this.f287407w, this.f287408x, continuation);
        gVar.f287404t = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrCalendarParametersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calandar_parameters.mvi.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
