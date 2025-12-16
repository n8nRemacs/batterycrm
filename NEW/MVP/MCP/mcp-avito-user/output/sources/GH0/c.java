package gH0;

import Y61.k;
import com.avito.android.util.U;
import fH0.AbstractC40291a;
import gH0.AbstractC40584b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AddressPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LgH0/c;", "LfH0/a;", "LgH0/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends AbstractC40291a implements InterfaceC40583a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final U f396419d;

    @Inject
    public c(@k U u12) {
        this.f396419d = u12;
    }

    @Override // gH0.InterfaceC40583a
    public final void U1(@k com.avito.android.user_advert.advert.items.address.a aVar) {
        this.f396419d.a(aVar.f309063c);
        this.f395801b.accept(AbstractC40584b.a.f396413a);
    }

    @Override // gH0.InterfaceC40583a
    public final void Z1(@k com.avito.android.user_advert.advert.items.address.a aVar) {
        this.f395801b.accept(new AbstractC40584b.C11202b(aVar.f309065e, aVar.f309063c, aVar.f309064d, aVar.f309062b, aVar.f309066f));
    }
}
