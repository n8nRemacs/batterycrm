package oB;

import android.os.Parcelable;
import com.avito.android.extended_profile_widgets.adapter.gallery.GalleryItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/m;", "LoB/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class m implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GalleryItem f419518b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Parcelable f419519c;

    public m(@Y61.k GalleryItem galleryItem, @Y61.k Parcelable parcelable) {
        this.f419518b = galleryItem;
        this.f419519c = parcelable;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f419518b, mVar.f419518b) && L.f(this.f419519c, mVar.f419519c);
    }

    public final int hashCode() {
        return this.f419519c.hashCode() + (this.f419518b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryChangeScrollPositionAction(item=");
        sb2.append(this.f419518b);
        sb2.append(", scrollState=");
        return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f419519c, ')');
    }
}
