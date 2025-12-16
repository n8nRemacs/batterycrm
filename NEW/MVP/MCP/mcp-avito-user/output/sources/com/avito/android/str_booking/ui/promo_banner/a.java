package com.avito.android.str_booking.ui.promo_banner;

import Y61.k;
import Y61.l;
import com.avito.android.str_booking.network.models.sections.PromoBannerContent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingPromoBannerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/promo_banner/a;", "Lcom/avito/conveyor_item/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f286149b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PromoBannerContent f286150c;

    public a(@k String str, @k PromoBannerContent promoBannerContent) {
        this.f286149b = str;
        this.f286150c = promoBannerContent;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f286149b, aVar.f286149b) && L.f(this.f286150c, aVar.f286150c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF282186b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF286082f() {
        return this.f286149b;
    }

    public final int hashCode() {
        return this.f286150c.hashCode() + (this.f286149b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "StrBookingPromoBannerItem(stringId=" + this.f286149b + ", bannerContent=" + this.f286150c + ')';
    }
}
