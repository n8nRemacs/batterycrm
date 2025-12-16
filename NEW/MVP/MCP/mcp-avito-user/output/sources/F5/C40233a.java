package f5;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.remote.delivery_suggests.DeliverySuggests;
import com.avito.android.remote.model.text.AttributedText;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;

/* compiled from: PriceWithDeliveryStickyBlockManager.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf5/a;", "Lcom/avito/android/advert_core/price_with_delivery/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* renamed from: f5.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C40233a implements com.avito.android.advert_core.price_with_delivery.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.price_with_delivery.a f395650a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public Map<String, DeliverySuggests.SelectionSettings.DeliveryOption> f395651b = P0.c();

    /* renamed from: c, reason: collision with root package name */
    @l
    public String f395652c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f395653d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<List<ContactBar.InfoStickyBlock>> f395654e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C41981q0 f395655f;

    @Inject
    public C40233a(@k com.avito.android.advert_core.price_with_delivery.a aVar) {
        this.f395650a = aVar;
        com.jakewharton.rxrelay3.c<List<ContactBar.InfoStickyBlock>> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f395654e = cVar;
        this.f395655f = new C41981q0(cVar);
    }

    @Override // com.avito.android.advert_core.price_with_delivery.c
    @l
    /* renamed from: a, reason: from getter */
    public final String getF395652c() {
        return this.f395652c;
    }

    @Override // com.avito.android.advert_core.price_with_delivery.c
    public final void b(@l String str) {
        this.f395652c = str;
        this.f395654e.accept(e(this.f395651b));
    }

    @Override // com.avito.android.advert_core.price_with_delivery.c
    public final void c(boolean z12) {
        this.f395653d = z12;
        this.f395654e.accept(e(this.f395651b));
    }

    @Override // com.avito.android.advert_core.price_with_delivery.c
    @k
    /* renamed from: d, reason: from getter */
    public final C41981q0 getF395655f() {
        return this.f395655f;
    }

    @Override // com.avito.android.advert_core.price_with_delivery.c
    @k
    public final List<ContactBar.InfoStickyBlock> e(@k Map<String, DeliverySuggests.SelectionSettings.DeliveryOption> map) {
        String str = this.f395652c;
        com.avito.android.advert_core.price_with_delivery.a aVar = this.f395650a;
        if (str == null || this.f395653d) {
            aVar.getClass();
            AttributedText attributedText = null;
            return Collections.singletonList(new ContactBar.InfoStickyBlock.DeliveryPriceInfo(null, attributedText, attributedText, 1, null));
        }
        DeliverySuggests.SelectionSettings.DeliveryOption deliveryOption = map.get(str);
        if (deliveryOption == null) {
            return C42784z0.f406748b;
        }
        aVar.getClass();
        return Collections.singletonList(new ContactBar.InfoStickyBlock.DeliveryPriceInfo(null, deliveryOption.getPrice(), deliveryOption.getTitle(), 1, null));
    }

    @Override // com.avito.android.advert_core.price_with_delivery.c
    public final void f(@k Map<String, DeliverySuggests.SelectionSettings.DeliveryOption> map) {
        this.f395651b = map;
        this.f395654e.accept(e(map));
    }
}
