package com.avito.android.travel_guest_profile.items.statistics_item;

import PE0.j;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatisticsItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_guest_profile/items/statistics_item/a;", "Lcom/avito/conveyor_item/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f302134b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<j> f302135c;

    public a(@k AttributedText attributedText, @k List list) {
        this.f302134b = attributedText;
        this.f302135c = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return L.f(this.f302134b, aVar.f302134b) && L.f(this.f302135c, aVar.f302135c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85702c() {
        return -252501258;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF270728b() {
        return "StatisticsItem";
    }

    public final int hashCode() {
        return this.f302135c.hashCode() + com.avito.android.actions_sheet.a.b(762395594, 31, this.f302134b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatisticsItem(stringId=StatisticsItem, title=");
        sb2.append(this.f302134b);
        sb2.append(", statistics=");
        return H.p(sb2, this.f302135c, ')');
    }
}
