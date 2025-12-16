package com.avito.android.advert.item.address_centrity;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.Z0;
import com.avito.android.component.toast.util.c;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UserAddressLink;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;

/* compiled from: AdvertDetailsAddressCentrityPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/address_centrity/j;", "Lcom/avito/android/advert/item/address_centrity/i;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.component.toast.util.c f72658a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f72659b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Z0 f72660c;

    @Inject
    public j(@Y61.k com.avito.android.component.toast.util.c cVar, @Y61.k l lVar) {
        this.f72658a = cVar;
        this.f72659b = lVar;
    }

    @Override // com.avito.android.advert.item.address_centrity.f.b
    public final void a(@Y61.k DeepLink deepLink) {
        Z0 z02 = this.f72660c;
        if (z02 != null) {
            z02.g(null, deepLink, null);
        }
    }

    @Override // com.avito.android.advert.item.address_centrity.i
    public final void b(@Y61.k UserAddressLink.Result result) {
        String str;
        if (result instanceof UserAddressLink.Result.Success) {
            UserAddressLink.Result.Success success = (UserAddressLink.Result.Success) result;
            if (success instanceof UserAddressLink.Result.Success.Added) {
                str = ((UserAddressLink.Result.Success.Added) result).f133811e;
            } else if (success instanceof UserAddressLink.Result.Success.Modified) {
                str = ((UserAddressLink.Result.Success.Modified) result).f133824e;
            } else if (success instanceof UserAddressLink.Result.Success.DefaultChanged) {
                str = "";
            } else {
                if (!(success instanceof UserAddressLink.Result.Success.Delete)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = null;
            }
            if (str == null) {
                return;
            }
            boolean zK2 = C43066x.K(str);
            l lVar = this.f72659b;
            c.a.a(this.f72658a, com.avito.android.printable_text.b.f(zK2 ? lVar.a() : lVar.b(str)), 0, null, null, null, null, 254);
        }
    }

    @Override // com.avito.android.advert.item.address_centrity.i
    public final void c0() {
        this.f72660c = null;
    }

    @Override // com.avito.android.advert.item.address_centrity.i
    public final void j0(@Y61.k Z0 z02) {
        this.f72660c = z02;
    }
}
