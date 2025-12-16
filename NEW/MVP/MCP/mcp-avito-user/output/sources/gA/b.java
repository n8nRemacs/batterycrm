package ga;

import Y61.k;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertCoreResourcesProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lga/b;", "Lga/a;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements InterfaceC40639a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Resources f396488a;

    @Inject
    public b(@k Resources resources) {
        this.f396488a = resources;
    }

    @Override // ga.InterfaceC40639a
    @k
    public final String a() {
        return this.f396488a.getString(R.string.advert_details_items_seller_subscription_settings);
    }

    @Override // ga.InterfaceC40639a
    @k
    public final String b() {
        return this.f396488a.getString(R.string.advert_details_items_seller_subscription_subscribe);
    }
}
