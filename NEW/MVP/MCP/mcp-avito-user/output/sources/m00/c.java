package M00;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction;
import com.avito.android.mortgage.pre_approval.model.PreApprovalArguments;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PreApprovalFormAnalyticsHandler.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LM00/c;", "LM00/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f10335a;

    @Inject
    public c(@k InterfaceC28373a interfaceC28373a) {
        this.f10335a = interfaceC28373a;
    }

    @Override // M00.b
    public final void a(@k PreApprovalFormInternalAction preApprovalFormInternalAction, @k R00.b bVar) {
        boolean z12 = preApprovalFormInternalAction instanceof PreApprovalFormInternalAction.InitLoadingCompleted ? true : preApprovalFormInternalAction instanceof PreApprovalFormInternalAction.NextStep ? true : preApprovalFormInternalAction instanceof PreApprovalFormInternalAction.PreviousStep;
        InterfaceC28373a interfaceC28373a = this.f10335a;
        if (z12) {
            interfaceC28373a.c(new K00.b(bVar.f14058d.f201851b));
            return;
        }
        if (preApprovalFormInternalAction instanceof PreApprovalFormInternalAction.UpdateInputValue) {
            com.avito.android.analytics.provider.clickstream.b bVarA = a.a(((PreApprovalFormInternalAction.UpdateInputValue) preApprovalFormInternalAction).f201932b, bVar);
            if (bVarA != null) {
                interfaceC28373a.c(bVarA);
                return;
            }
            return;
        }
        if (preApprovalFormInternalAction instanceof PreApprovalFormInternalAction.UpdateSelectValue) {
            com.avito.android.analytics.provider.clickstream.b bVarA2 = a.a(((PreApprovalFormInternalAction.UpdateSelectValue) preApprovalFormInternalAction).f201934b, bVar);
            if (bVarA2 != null) {
                interfaceC28373a.c(bVarA2);
                return;
            }
            return;
        }
        if (preApprovalFormInternalAction instanceof PreApprovalFormInternalAction.UpdateChipsValue) {
            com.avito.android.analytics.provider.clickstream.b bVarA3 = a.a(((PreApprovalFormInternalAction.UpdateChipsValue) preApprovalFormInternalAction).f201926b, bVar);
            if (bVarA3 != null) {
                interfaceC28373a.c(bVarA3);
                return;
            }
            return;
        }
        if (preApprovalFormInternalAction instanceof PreApprovalFormInternalAction.NextScreen) {
            PreApprovalArguments preApprovalArguments = ((PreApprovalFormInternalAction.NextScreen) preApprovalFormInternalAction).f201921b;
            interfaceC28373a.c(new K00.a(preApprovalArguments.f201965b, preApprovalArguments.f201966c, preApprovalArguments.f201967d, preApprovalArguments.f201968e, preApprovalArguments.f201969f, preApprovalArguments.f201970g, preApprovalArguments.f201971h, preApprovalArguments.f201974k, preApprovalArguments.f201975l, preApprovalArguments.f201972i, preApprovalArguments.f201973j, null, 2048, null));
        }
    }
}
