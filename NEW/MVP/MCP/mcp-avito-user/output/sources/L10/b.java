package l10;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.mortgage.sending_confirm.mvi.entity.SendingConfirmInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import m10.C43861c;

/* compiled from: SendingConfirmAnalyticsHandler.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll10/b;", "Ll10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements InterfaceC43527a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f413405a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f413405a = interfaceC28373a;
    }

    @Override // l10.InterfaceC43527a
    public final void a(@k SendingConfirmInternalAction sendingConfirmInternalAction, @k C43861c c43861c) {
        boolean z12 = sendingConfirmInternalAction instanceof SendingConfirmInternalAction.Init;
        InterfaceC28373a interfaceC28373a = this.f413405a;
        String str = c43861c.f414263b;
        String str2 = c43861c.f414264c;
        if (z12) {
            interfaceC28373a.c(new f(str, str2));
        } else if (sendingConfirmInternalAction instanceof SendingConfirmInternalAction.LegalSendingStarted) {
            interfaceC28373a.c(new d(str, str2));
        } else if (sendingConfirmInternalAction instanceof SendingConfirmInternalAction.CheckClick) {
            interfaceC28373a.c(new e(str));
        }
    }
}
