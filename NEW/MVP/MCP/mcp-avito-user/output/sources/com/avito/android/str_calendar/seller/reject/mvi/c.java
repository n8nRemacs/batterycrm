package com.avito.android.str_calendar.seller.reject.mvi;

import Ly0.InterfaceC14455a;
import Ly0.InterfaceC14456b;
import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.str_calendar.seller.reject.mvi.entity.StrCalendarRejectInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrCalendarRejectFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LLy0/a;", "Lcom/avito/android/str_calendar/seller/reject/mvi/entity/StrCalendarRejectInternalAction;", "LLy0/c;", "LLy0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements l<q<InterfaceC14455a, StrCalendarRejectInternalAction, Ly0.c, InterfaceC14456b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f288047l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f288048m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f288049n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f288050o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ScreenPerformanceTracker screenPerformanceTracker, h hVar, f fVar) {
        super(1);
        this.f288047l = aVar;
        this.f288048m = screenPerformanceTracker;
        this.f288049n = hVar;
        this.f288050o = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC14455a, StrCalendarRejectInternalAction, Ly0.c, InterfaceC14456b> qVar) {
        q<InterfaceC14455a, StrCalendarRejectInternalAction, Ly0.c, InterfaceC14456b> qVar2 = qVar;
        qVar2.f92009e = this.f288047l;
        qVar2.f92011g = new o(this.f288048m, this.f288049n);
        qVar2.f92010f = this.f288050o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
