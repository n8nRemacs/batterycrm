package oB;

import android.os.Parcelable;
import com.avito.android.extended_profile_widgets.adapter.categorizer.CategorizerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/i;", "LoB/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class i implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CategorizerItem f419514b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Parcelable f419515c;

    public i(@Y61.k CategorizerItem categorizerItem, @Y61.l Parcelable parcelable) {
        this.f419514b = categorizerItem;
        this.f419515c = parcelable;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f419514b, iVar.f419514b) && L.f(this.f419515c, iVar.f419515c);
    }

    public final int hashCode() {
        int iHashCode = this.f419514b.hashCode() * 31;
        Parcelable parcelable = this.f419515c;
        return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategorizerScrollStateAction(item=");
        sb2.append(this.f419514b);
        sb2.append(", scrollState=");
        return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f419515c, ')');
    }
}
