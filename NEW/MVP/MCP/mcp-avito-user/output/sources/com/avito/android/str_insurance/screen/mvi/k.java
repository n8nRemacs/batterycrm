package com.avito.android.str_insurance.screen.mvi;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.C28484f;
import com.avito.android.analytics.screens.tracker.InterfaceC28483e;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrInsuranceTrackerWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_insurance/screen/mvi/k;", "Lcom/avito/android/str_insurance/screen/mvi/A;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k extends A {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.o f288754b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public InterfaceC28483e f288755c;

    @Inject
    public k(@Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.analytics.screens.o oVar) {
        super(screenPerformanceTracker);
        this.f288754b = oVar;
    }

    @Override // com.avito.android.str_insurance.screen.mvi.A
    public final void a() {
        C28484f c28484fH = this.f288754b.h("strInsuranceForm");
        c28484fH.start();
        this.f288755c = c28484fH;
    }

    @Override // com.avito.android.str_insurance.screen.mvi.A
    public final void b() {
        InterfaceC28483e interfaceC28483e = this.f288755c;
        if (interfaceC28483e != null) {
            interfaceC28483e.d(null, J.b.f90385a);
        }
        this.f288755c = null;
    }
}
