package com.avito.android.phones_actualization.scenario;

import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.screen.AppbarNavigationIcon;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: ActualizePhonesScenarioBuilder.kt */
@C11.a
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phones_actualization/scenario/m;", "Lcom/avito/android/code_check_public/e;", "_avito_phones-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@com.avito.android.code_check_public.f
/* loaded from: classes15.dex */
public final class m extends com.avito.android.code_check_public.e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final q f216263b;

    @Inject
    public m(@Y61.k q qVar) {
        this.f216263b = qVar;
    }

    @Override // com.avito.android.code_check_public.e
    @Y61.k
    public final com.avito.android.code_check_public.d a() {
        a.InterfaceC3494a.d dVarB;
        CodeCheckLink.Flow.ActualizePhones actualizePhones = (CodeCheckLink.Flow.ActualizePhones) b();
        CodeCheckLink.Flow.ActualizePhones.Scenario.AddPhone addPhone = CodeCheckLink.Flow.ActualizePhones.Scenario.AddPhone.f119248b;
        CodeCheckLink.Flow.ActualizePhones.Scenario scenario = actualizePhones.f119247b;
        boolean zF2 = L.f(scenario, addPhone);
        q qVar = this.f216263b;
        if (zF2) {
            AppbarNavigationIcon appbarNavigationIcon = AppbarNavigationIcon.f119297b;
            dVarB = qVar.c();
        } else {
            if (!(scenario instanceof CodeCheckLink.Flow.ActualizePhones.Scenario.ShowActualizePhones)) {
                throw new NoWhenBranchMatchedException();
            }
            CodeCheckLink.Flow.ActualizePhones.Scenario.ShowActualizePhones showActualizePhones = (CodeCheckLink.Flow.ActualizePhones.Scenario.ShowActualizePhones) scenario;
            boolean z12 = showActualizePhones.f119249b;
            AttributedText attributedText = showActualizePhones.f119251d;
            String str = showActualizePhones.f119250c;
            dVarB = z12 ? qVar.b(attributedText, str) : qVar.a(showActualizePhones.f119252e, str, attributedText);
        }
        return new com.avito.android.code_check_public.d(dVarB);
    }
}
