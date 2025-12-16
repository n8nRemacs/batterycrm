package uH0;

import Y61.k;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_advert.event.SalesContractFromPage;
import fH0.AbstractC40291a;
import fH0.InterfaceC40292b;
import iI0.C41291A;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SalesContractDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LuH0/b;", "LfH0/a;", "LuH0/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends AbstractC40291a implements InterfaceC48899a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f439873d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final E f439874e;

    @Inject
    public b(@k E e12, @k InterfaceC28373a interfaceC28373a) {
        this.f439873d = interfaceC28373a;
        this.f439874e = e12;
    }

    @Override // uH0.InterfaceC48899a
    public final void v1(@k com.avito.android.user_advert.advert.items.sales_contract.a aVar) {
        String strA = this.f439874e.a();
        if (strA != null) {
            String str = aVar.f310101c;
            SalesContractFromPage salesContractFromPage = SalesContractFromPage.f311817b;
            this.f439873d.c(new C41291A(strA, str));
        }
        DeepLink deepLink = aVar.f310104f;
        com.jakewharton.rxrelay3.c<InterfaceC40292b> cVar = this.f395801b;
        if (deepLink != null) {
            cVar.accept(new InterfaceC40292b.a(deepLink));
        } else {
            cVar.accept(new InterfaceC40292b.C11136b(aVar.f310105g));
        }
    }
}
