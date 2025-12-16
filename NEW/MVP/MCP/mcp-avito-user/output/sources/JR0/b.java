package Jr0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SellerElement;
import com.avito.android.serp.adapter.N0;
import com.avito.android.serp.adapter.seller_element.SellerPinItem;
import kotlin.Metadata;

/* compiled from: SellerElementConverter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJr0/b;", "LJr0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements InterfaceC14241a {
    @Override // Jr0.InterfaceC14241a
    @k
    public final SellerPinItem a(@k SellerElement sellerElement) {
        return new SellerPinItem(N0.a(sellerElement.getUniqueId(), sellerElement.getTitle()), String.valueOf(N0.a(sellerElement.getUniqueId(), sellerElement.getTitle())), sellerElement.getTitle(), sellerElement.getBadgeBar(), sellerElement.getUri(), sellerElement.getPreview(), sellerElement.getDeveloper(), 6);
    }
}
