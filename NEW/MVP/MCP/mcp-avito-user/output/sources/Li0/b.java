package LI0;

import Y61.k;
import Y61.l;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.j;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: PanelSoaLoadingItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLI0/b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/j;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements j {
    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        ((b) obj).getClass();
        return true;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322716b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF327254b() {
        return "panel-soa-loading-item-id";
    }

    public final int hashCode() {
        return -839751437;
    }

    @k
    public final String toString() {
        return "PanelSoaLoadingItem(stringId=panel-soa-loading-item-id)";
    }
}
