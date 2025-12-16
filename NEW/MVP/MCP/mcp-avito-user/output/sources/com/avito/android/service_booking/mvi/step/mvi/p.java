package com.avito.android.service_booking.mvi.step.mvi;

import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import qt0.C47440d;

/* compiled from: ServiceBookingMviStepReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqt0/d$a;", "slot", "invoke", "(Lqt0/d$a;)Lqt0/d$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class p extends N implements Y41.l<C47440d.a, C47440d.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.a f274787l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingMviStepInternalAction f274788m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(l0.a aVar, ServiceBookingMviStepInternalAction serviceBookingMviStepInternalAction) {
        super(1);
        this.f274787l = aVar;
        this.f274788m = serviceBookingMviStepInternalAction;
    }

    @Override // Y41.l
    public final C47440d.a invoke(C47440d.a aVar) {
        C47440d.a aVar2 = aVar;
        l0.a aVar3 = this.f274787l;
        boolean z12 = aVar3.f406838b;
        String str = aVar2.f429415b;
        ServiceBookingMviStepInternalAction serviceBookingMviStepInternalAction = this.f274788m;
        aVar3.f406838b = z12 || L.f(str, ((ServiceBookingMviStepInternalAction.OnSlotSelected) serviceBookingMviStepInternalAction).f274687b.f429415b);
        return C47440d.a.a(aVar2, L.f(str, ((ServiceBookingMviStepInternalAction.OnSlotSelected) serviceBookingMviStepInternalAction).f274687b.f429415b));
    }
}
