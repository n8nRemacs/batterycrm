package r10;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.mortgage.verification_flow.mvi.entity.VerificationFlowInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VerificationFlowAnalyticsHandler.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr10/d;", "Lr10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f429565a;

    @Inject
    public d(@k InterfaceC28373a interfaceC28373a) {
        this.f429565a = interfaceC28373a;
    }

    @Override // r10.c
    public final void a(@k VerificationFlowInternalAction verificationFlowInternalAction) {
        boolean z12 = verificationFlowInternalAction instanceof VerificationFlowInternalAction.Init;
        InterfaceC28373a interfaceC28373a = this.f429565a;
        if (z12) {
            interfaceC28373a.c(new f());
            return;
        }
        if (verificationFlowInternalAction instanceof VerificationFlowInternalAction.PrimaryActionClicked) {
            interfaceC28373a.c(new C47477a());
        } else if (verificationFlowInternalAction instanceof VerificationFlowInternalAction.SecondaryActionClicked) {
            interfaceC28373a.c(new b());
        } else {
            boolean z13 = verificationFlowInternalAction instanceof VerificationFlowInternalAction.BackClick;
        }
    }
}
