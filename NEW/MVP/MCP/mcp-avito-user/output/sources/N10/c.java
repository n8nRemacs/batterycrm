package n10;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.mortgage.sign.mvi.entity.SignInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SignAnalyticsHandler.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ln10/c;", "Ln10/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f414844a;

    @Inject
    public c(@k InterfaceC28373a interfaceC28373a) {
        this.f414844a = interfaceC28373a;
    }

    @Override // n10.b
    public final void a(@k SignInternalAction signInternalAction, @k o10.d dVar) {
        String str;
        String str2 = dVar.f419313j;
        if (str2 == null || (str = dVar.f419312i) == null) {
            return;
        }
        boolean z12 = signInternalAction instanceof SignInternalAction.Init;
        InterfaceC28373a interfaceC28373a = this.f414844a;
        String str3 = dVar.f419311h;
        if (z12) {
            interfaceC28373a.c(new g(str2, str, str3));
            return;
        }
        if (signInternalAction instanceof SignInternalAction.EmptySvgCreated) {
            interfaceC28373a.c(new f(str2, str, str3));
        } else if (signInternalAction instanceof SignInternalAction.SvgFileUploadingStarted) {
            interfaceC28373a.c(new f(str2, str, str3));
        } else if (signInternalAction instanceof SignInternalAction.SignCleared) {
            interfaceC28373a.c(new e(str2, str, str3));
        }
    }
}
