package com.avito.android.travel_guest_profile.items.extended_plan;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedPlanItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_guest_profile/items/extended_plan/a;", "Lcom/avito/conveyor_item/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UniversalImage f302062b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f302063c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<AttributedText> f302064d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final PE0.e f302065e;

    public a(@k UniversalImage universalImage, @k AttributedText attributedText, @k List list, @k PE0.e eVar) {
        this.f302062b = universalImage;
        this.f302063c = attributedText;
        this.f302064d = list;
        this.f302065e = eVar;
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
        return this.f302062b.equals(aVar.f302062b) && L.f(this.f302063c, aVar.f302063c) && L.f(this.f302064d, aVar.f302064d) && this.f302065e.equals(aVar.f302065e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79636b() {
        return -1812886955;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF138457b() {
        return "ExtendedPlanItem";
    }

    public final int hashCode() {
        return this.f302065e.hashCode() + H.e(com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.a(-364920757, 31, this.f302062b), 31, this.f302063c), 31, this.f302064d);
    }

    @k
    public final String toString() {
        return "ExtendedPlanItem(stringId=ExtendedPlanItem, promoImage=" + this.f302062b + ", title=" + this.f302063c + ", benefits=" + this.f302064d + ", button=" + this.f302065e + ')';
    }
}
