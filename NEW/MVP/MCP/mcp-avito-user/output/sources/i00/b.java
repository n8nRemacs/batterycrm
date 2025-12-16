package I00;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.mortgage.phone_confirm.mvi.entity.PhoneConfirmInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhoneConfirmAnalyticsHandler.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI00/b;", "LI00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f7873a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f7873a = interfaceC28373a;
    }

    @Override // I00.a
    public final void a(@k PhoneConfirmInternalAction phoneConfirmInternalAction, @k J00.c cVar) {
        boolean z12 = phoneConfirmInternalAction instanceof PhoneConfirmInternalAction.InitState;
        InterfaceC28373a interfaceC28373a = this.f7873a;
        String str = cVar.f8701b;
        String str2 = cVar.f8703d;
        String str3 = cVar.f8702c;
        if (z12) {
            interfaceC28373a.c(new g(str, cVar.f8705f, str2, str3));
            return;
        }
        if (phoneConfirmInternalAction instanceof PhoneConfirmInternalAction.CodeChanged) {
            if (((PhoneConfirmInternalAction.CodeChanged) phoneConfirmInternalAction).f201638b.length() == cVar.f8708i) {
                interfaceC28373a.c(new e(str, str2, str3));
            }
        } else if (phoneConfirmInternalAction instanceof PhoneConfirmInternalAction.AccessCheckStarted) {
            interfaceC28373a.c(new f(str));
        } else if ((phoneConfirmInternalAction instanceof PhoneConfirmInternalAction.ConfirmationCompleted) && ((PhoneConfirmInternalAction.ConfirmationCompleted) phoneConfirmInternalAction).f201639b) {
            interfaceC28373a.c(new d(str, str2, str3));
        }
    }
}
