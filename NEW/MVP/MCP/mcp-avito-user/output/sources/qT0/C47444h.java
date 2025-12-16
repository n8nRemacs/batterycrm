package qt0;

import Y61.l;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SbPartnerLogoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqt0/h;", "Lcom/avito/conveyor_item/a;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qt0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C47444h implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f429445b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalImage f429446c;

    public C47444h(@Y61.k String str, @l UniversalImage universalImage) {
        this.f429445b = str;
        this.f429446c = universalImage;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47444h)) {
            return false;
        }
        C47444h c47444h = (C47444h) obj;
        return L.f(this.f429445b, c47444h.f429445b) && L.f(this.f429446c, c47444h.f429446c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return getF276220b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF276220b() {
        return this.f429445b;
    }

    public final int hashCode() {
        int iHashCode = this.f429445b.hashCode() * 31;
        UniversalImage universalImage = this.f429446c;
        return iHashCode + (universalImage == null ? 0 : universalImage.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbPartnerLogoItem(stringId=");
        sb2.append(this.f429445b);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f429446c, ')');
    }
}
