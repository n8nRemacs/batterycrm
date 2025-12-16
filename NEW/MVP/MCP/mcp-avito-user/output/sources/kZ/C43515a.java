package kz;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.EmployeeOffLimitLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.employee_stub_public.EmployeeStubData;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EmployeeOffLimitLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkz/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/EmployeeOffLimitLink;", "_avito_employee-stub_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kz.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C43515a extends AbstractC40162b<EmployeeOffLimitLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f413342d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.employee_stub_public.a f413343e;

    @Inject
    public C43515a(@k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.employee_stub_public.a aVar) {
        this.f413342d = interfaceC4053a;
        this.f413343e = aVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        EmployeeOffLimitLink employeeOffLimitLink = (EmployeeOffLimitLink) deepLink;
        this.f413342d.R(this.f413343e.a(new EmployeeStubData.FromDeeplink(null, employeeOffLimitLink.f133318f, employeeOffLimitLink.f133317e, employeeOffLimitLink.f133314b, employeeOffLimitLink.f133315c, employeeOffLimitLink.f133316d)), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
