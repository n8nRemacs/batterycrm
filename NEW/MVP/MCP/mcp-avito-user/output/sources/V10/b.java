package V10;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientField;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientFullName;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import f20.C40220a;
import f20.C40221b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ClientSearchResponseMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV10/b;", "LV10/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35945t1<String> f16894a;

    @Inject
    public b(@N3.c @k InterfaceC35945t1<String> interfaceC35945t1) {
        this.f16894a = interfaceC35945t1;
    }

    @Override // V10.a
    @k
    public final ArrayList a(@k C40220a c40220a) {
        List<C40221b> listA = c40220a.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        for (C40221b c40221b : listA) {
            String id2 = c40221b.getId();
            MortgageClientFullName mortgageClientFullName = new MortgageClientFullName(c40221b.getFullName().getData().getFirstName(), c40221b.getFullName().getData().getMiddleName(), c40221b.getFullName().getData().getLastName(), c40221b.getFullName().getValue());
            String value = c40221b.getPhone().getValue();
            InterfaceC35945t1<String> interfaceC35945t1 = this.f16894a;
            arrayList.add(new MortgageClient(id2, mortgageClientFullName, new MortgageClientField(interfaceC35945t1.a(value), C43066x.q(c40221b.getPhone().getMaskedValue(), "*", false) ? c40221b.getPhone().getMaskedValue() : interfaceC35945t1.a(c40221b.getPhone().getMaskedValue())), new MortgageClientField(c40221b.getEmail().getValue(), c40221b.getEmail().getMaskedValue())));
        }
        return arrayList;
    }
}
