package com.avito.android.user_advert.advert.items.machinery_rental_banner;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MachineryRentalBannerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/machinery_rental_banner/e;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class e implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f309582b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f309583c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final MyAdvertDetails.MachineryRentalBanner f309584d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f309585e;

    public e(@Y61.k String str, @Y61.k String str2, @Y61.k MyAdvertDetails.MachineryRentalBanner machineryRentalBanner, boolean z12) {
        this.f309582b = str;
        this.f309583c = str2;
        this.f309584d = machineryRentalBanner;
        this.f309585e = z12;
    }

    public static e a(e eVar, boolean z12) {
        String str = eVar.f309582b;
        String str2 = eVar.f309583c;
        MyAdvertDetails.MachineryRentalBanner machineryRentalBanner = eVar.f309584d;
        eVar.getClass();
        return new e(str, str2, machineryRentalBanner, z12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f309582b, eVar.f309582b) && L.f(this.f309583c, eVar.f309583c) && L.f(this.f309584d, eVar.f309584d) && this.f309585e == eVar.f309585e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207385b() {
        return getF309582b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309582b() {
        return this.f309582b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f309585e) + ((this.f309584d.hashCode() + H.d(this.f309582b.hashCode() * 31, 31, this.f309583c)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MachineryRentalBannerItem(stringId=");
        sb2.append(this.f309582b);
        sb2.append(", advertId=");
        sb2.append(this.f309583c);
        sb2.append(", banner=");
        sb2.append(this.f309584d);
        sb2.append(", isActionButtonLoading=");
        return r.x(sb2, this.f309585e, ')');
    }
}
