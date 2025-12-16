package QZ;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.api.model.ApplicationsItemModel;
import com.avito.android.mortgage.applications_list.mvi.entity.ApplicationsListInternalAction;
import com.avito.android.mortgage.deeplink.MortgageApplicationLink;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ApplicationsListAnalyticsHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQZ/c;", "LQZ/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f13756a;

    @Inject
    public c(@k InterfaceC28373a interfaceC28373a) {
        this.f13756a = interfaceC28373a;
    }

    @Override // QZ.b
    public final void a(@k ApplicationsListInternalAction applicationsListInternalAction) {
        String str;
        boolean z12 = applicationsListInternalAction instanceof ApplicationsListInternalAction.ContentLoaded;
        InterfaceC28373a interfaceC28373a = this.f13756a;
        if (z12) {
            ApplicationsListInternalAction.ContentLoaded contentLoaded = (ApplicationsListInternalAction.ContentLoaded) applicationsListInternalAction;
            if (contentLoaded.f198446c) {
                interfaceC28373a.c(new h());
            }
            Iterator<T> it = contentLoaded.f198445b.iterator();
            while (it.hasNext()) {
                interfaceC28373a.c(new f(((ApplicationsItemModel) it.next()).getId()));
            }
            return;
        }
        if (applicationsListInternalAction instanceof ApplicationsListInternalAction.OpenDeeplink) {
            DeepLink deepLink = ((ApplicationsListInternalAction.OpenDeeplink) applicationsListInternalAction).f198448b;
            if (!(deepLink instanceof MortgageApplicationLink) || (str = ((MortgageApplicationLink) deepLink).f198693b) == null) {
                return;
            }
            interfaceC28373a.c(new a(str, "continue"));
            return;
        }
        if (applicationsListInternalAction instanceof ApplicationsListInternalAction.ShowMoreDialog) {
            interfaceC28373a.c(new g(((ApplicationsListInternalAction.ShowMoreDialog) applicationsListInternalAction).f198450b));
        } else if (applicationsListInternalAction instanceof ApplicationsListInternalAction.ApplicationDeleteClicked) {
            interfaceC28373a.c(new a(((ApplicationsListInternalAction.ApplicationDeleteClicked) applicationsListInternalAction).f198442b, "delete"));
        }
    }
}
