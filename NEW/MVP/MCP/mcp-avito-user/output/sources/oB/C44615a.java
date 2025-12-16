package oB;

import android.os.Parcelable;
import com.avito.android.extended_profile_widgets.adapter.about_v2.AboutV2Item;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/a;", "LoB/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oB.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C44615a implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AboutV2Item f419502b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Parcelable f419503c;

    public C44615a(@Y61.k AboutV2Item aboutV2Item, @Y61.k Parcelable parcelable) {
        this.f419502b = aboutV2Item;
        this.f419503c = parcelable;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44615a)) {
            return false;
        }
        C44615a c44615a = (C44615a) obj;
        return L.f(this.f419502b, c44615a.f419502b) && L.f(this.f419503c, c44615a.f419503c);
    }

    public final int hashCode() {
        return this.f419503c.hashCode() + (this.f419502b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AboutV2ChangeGalleryPositionAction(item=");
        sb2.append(this.f419502b);
        sb2.append(", scrollState=");
        return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f419503c, ')');
    }
}
