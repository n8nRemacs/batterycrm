package t9;

import Y61.k;
import Y61.l;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.remote.model.AdvertDiscounts;
import com.avito.android.remote.model.advert_details.ContactBarData;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import u9.C48865a;

/* compiled from: AdvertDiscountDetailsDialogPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lt9/e;", "Lt9/d;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements InterfaceC48523d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f439170a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f439171b;

    @Inject
    public e(@C48865a.InterfaceC12704a @k com.avito.konveyor.adapter.a aVar, @k g gVar) {
        this.f439170a = aVar;
        this.f439171b = gVar;
    }

    @Override // t9.InterfaceC48523d
    public final void a(@k AdvertDiscounts advertDiscounts, @k List<ContactBar.Button.Action> list, @l ContactBarData contactBarData, boolean z12) {
        this.f439170a.c(new UV0.c(this.f439171b.a(advertDiscounts, list, contactBarData, z12)));
    }
}
