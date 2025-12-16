package nI0;

import Y61.k;
import cJ0.InterfaceC27050d;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertItemDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertsBaseItemDomain;
import eJ0.InterfaceC40015b;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import pI0.C46966b;

/* compiled from: UserAdvertsListToastHelper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnI0/g;", "LnI0/f;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC27050d f414991a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f414992b;

    @Inject
    public g(@k InterfaceC27050d interfaceC27050d, @k InterfaceC28373a interfaceC28373a) {
        this.f414991a = interfaceC27050d;
        this.f414992b = interfaceC28373a;
    }

    @Override // nI0.f
    public final boolean a(@k InterfaceC40015b.C11066b c11066b) {
        String str;
        InterfaceC27050d interfaceC27050d = this.f414991a;
        boolean z12 = false;
        if (interfaceC27050d.b()) {
            return false;
        }
        ArrayList arrayList = c11066b.f395104a;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                UserAdvertsBaseItemDomain userAdvertsBaseItemDomain = (UserAdvertsBaseItemDomain) it.next();
                if ((userAdvertsBaseItemDomain instanceof UserAdvertItemDomain) && (str = ((UserAdvertItemDomain) userAdvertsBaseItemDomain).f315018D) != null && str.length() != 0) {
                    z12 = true;
                    break;
                }
            }
        }
        if (z12) {
            this.f414992b.c(new C46966b());
            interfaceC27050d.a();
        }
        return z12;
    }
}
