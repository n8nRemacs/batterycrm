package com.avito.android.travel_guest_profile.items.empty_state_banner;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EmptyStateBannerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_guest_profile/items/empty_state_banner/a;", "", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PrintableText f302041a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PE0.c f302042b;

    public a(@k PrintableText printableText, @k PE0.c cVar) {
        this.f302041a = printableText;
        this.f302042b = cVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f302041a, aVar.f302041a) && L.f(this.f302042b, aVar.f302042b);
    }

    public final int hashCode() {
        return this.f302042b.hashCode() + (this.f302041a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "BannerItemButtonState(title=" + this.f302041a + ", action=" + this.f302042b + ')';
    }
}
