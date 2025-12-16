package com.avito.android.str_insurance.screen.mvi;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.InterfaceC28489k;
import com.avito.android.analytics.screens.tracker.P;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrInsuranceTrackerWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_insurance/screen/mvi/f;", "Lcom/avito/android/str_insurance/screen/mvi/e;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.o f288741a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public InterfaceC28489k f288742b;

    @Inject
    public f(@Y61.k com.avito.android.analytics.screens.o oVar) {
        this.f288741a = oVar;
    }

    @Override // com.avito.android.str_insurance.screen.mvi.e
    public final void a() {
        InterfaceC28489k interfaceC28489k = this.f288742b;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, J.b.f90385a, 0L, 5);
        }
        this.f288742b = null;
    }

    @Override // com.avito.android.str_insurance.screen.mvi.e
    public final void b(@Y61.k ApiError apiError) {
        InterfaceC28489k interfaceC28489k = this.f288742b;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, new J.a(apiError), 0L, 5);
        }
        this.f288742b = null;
    }

    @Override // com.avito.android.str_insurance.screen.mvi.e
    public final void c() {
        P pE2 = this.f288741a.e("insuranceConfirmation");
        pE2.start();
        this.f288742b = pE2;
    }
}
