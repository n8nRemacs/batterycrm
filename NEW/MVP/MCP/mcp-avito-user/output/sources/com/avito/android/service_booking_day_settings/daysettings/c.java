package com.avito.android.service_booking_day_settings.daysettings;

import Ju.InterfaceC14249c;
import com.avito.android.service_booking_day_settings.daysettings.DaySettingsFragment;
import com.avito.android.service_booking_schedule_repetition_public.ServiceBookingScheduleRepetitionLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kv.C43501a;
import yt0.InterfaceC50300a;

/* compiled from: DaySettingsFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_day_settings.daysettings.DaySettingsFragment$observeDeeplinkResult$1", f = "DaySettingsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class c extends SuspendLambda implements Y41.p<C43501a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f276752q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC50300a, G0> f276753r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Y41.l<? super InterfaceC50300a, G0> lVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f276753r = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f276753r, continuation);
        cVar.f276752q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
        return ((c) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC14249c interfaceC14249c = ((C43501a) this.f276752q).f413261b;
        boolean z12 = interfaceC14249c instanceof ServiceBookingScheduleRepetitionLink.b.C8246b;
        Y41.l<InterfaceC50300a, G0> lVar = this.f276753r;
        if (z12) {
            ((DaySettingsFragment.e) lVar).invoke(new InterfaceC50300a.l(((ServiceBookingScheduleRepetitionLink.b.C8246b) interfaceC14249c).f277767b));
        } else if (interfaceC14249c instanceof ServiceBookingScheduleRepetitionLink.b.a) {
            ((DaySettingsFragment.e) lVar).invoke(new InterfaceC50300a.k(((ServiceBookingScheduleRepetitionLink.b.a) interfaceC14249c).f277766b));
        }
        return G0.f406611a;
    }
}
