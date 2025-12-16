package OZ;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.mortgage.applicant_type.mvi.entity.ApplicantTypeSelectorInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ApplicantTypeSelectorAnalyticsHandler.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOZ/c;", "LOZ/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f12320a;

    @Inject
    public c(@k InterfaceC28373a interfaceC28373a) {
        this.f12320a = interfaceC28373a;
    }

    @Override // OZ.b
    public final void a(@k ApplicantTypeSelectorInternalAction applicantTypeSelectorInternalAction, @k PZ.c cVar) {
        String str = cVar.f13142d.f198308b;
        boolean z12 = applicantTypeSelectorInternalAction instanceof ApplicantTypeSelectorInternalAction.SelectApplicantType;
        InterfaceC28373a interfaceC28373a = this.f12320a;
        String str2 = cVar.f13140b;
        if (z12) {
            interfaceC28373a.c(new a(str2));
        } else if (applicantTypeSelectorInternalAction instanceof ApplicantTypeSelectorInternalAction.CloseDialogWithResult) {
            interfaceC28373a.c(new e(str2, cVar.f13141c, str));
        }
    }
}
