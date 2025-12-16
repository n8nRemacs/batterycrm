package G4;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.expand_items_button.ExpandItemsButtonItem;
import com.avito.android.advert_core.expand_items_button.f;
import com.avito.android.di.B;
import com.avito.android.di.module.InterfaceC30174s;
import com.jakewharton.rxrelay3.c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TabbedDetailsExpandItemsButtonClickRelay.kt */
@B
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG4/a;", "Lcom/avito/android/advert_core/expand_items_button/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f6274b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.analytics.a f6275c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final c<ExpandItemsButtonItem> f6276d = new c<>();

    @Inject
    public a(@k @InterfaceC30174s String str, @k com.avito.android.advert_core.analytics.a aVar) {
        this.f6274b = str;
        this.f6275c = aVar;
    }

    @Override // com.avito.android.advert_core.expand_items_button.f
    public final void l(@k ExpandItemsButtonItem expandItemsButtonItem) {
        this.f6276d.accept(expandItemsButtonItem);
        this.f6275c.y(this.f6274b, expandItemsButtonItem.f83563g, null);
    }

    @Override // com.avito.android.advert_core.expand_items_button.f
    public final void Y0(@k ExpandItemsButtonItem expandItemsButtonItem) {
    }
}
