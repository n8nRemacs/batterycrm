package com.avito.android.str_booking.ui.banner;

import Y61.k;
import Y61.l;
import com.avito.android.str_booking.network.models.sections.BannerContent;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingBannerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/banner/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final BannerContent f285926b;

    public c(@l BannerContent bannerContent) {
        this.f285926b = bannerContent;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f285926b, cVar.f285926b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return -1396342996;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF286082f() {
        return AdFormat.BANNER;
    }

    public final int hashCode() {
        BannerContent bannerContent = this.f285926b;
        return (-336959916) + (bannerContent == null ? 0 : bannerContent.hashCode());
    }

    @k
    public final String toString() {
        return "StrBookingBannerItem(stringId=banner, bannerContent=" + this.f285926b + ')';
    }
}
