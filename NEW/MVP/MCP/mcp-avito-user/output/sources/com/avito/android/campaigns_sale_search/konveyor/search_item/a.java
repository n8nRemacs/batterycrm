package com.avito.android.campaigns_sale_search.konveyor.search_item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.campaigns_sale.network.remote.model.SearchBonusInfo;
import com.avito.android.campaigns_sale.network.remote.model.SearchItemValidate;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/konveyor/search_item/a;", "Lcom/avito/conveyor_item/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f114598b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f114599c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f114600d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Image f114601e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final SearchItemButton f114602f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SearchItemValidate f114603g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f114604h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final SearchBonusInfo f114605i;

    public a(@k String str, @k AttributedText attributedText, @k AttributedText attributedText2, @k Image image, @l SearchItemButton searchItemButton, @k SearchItemValidate searchItemValidate, boolean z12, @l SearchBonusInfo searchBonusInfo) {
        this.f114598b = str;
        this.f114599c = attributedText;
        this.f114600d = attributedText2;
        this.f114601e = image;
        this.f114602f = searchItemButton;
        this.f114603g = searchItemValidate;
        this.f114604h = z12;
        this.f114605i = searchBonusInfo;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f114598b, aVar.f114598b) && L.f(this.f114599c, aVar.f114599c) && L.f(this.f114600d, aVar.f114600d) && L.f(this.f114601e, aVar.f114601e) && this.f114602f == aVar.f114602f && L.f(this.f114603g, aVar.f114603g) && this.f114604h == aVar.f114604h && L.f(this.f114605i, aVar.f114605i);
    }

    @Override // TV0.a
    public final long getId() {
        return getStringId().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    public final String getStringId() {
        return this.f114598b;
    }

    public final int hashCode() {
        int iG2 = com.avito.android.actions_sheet.a.g(this.f114601e, com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b(this.f114598b.hashCode() * 31, 31, this.f114599c), 31, this.f114600d), 31);
        SearchItemButton searchItemButton = this.f114602f;
        int i12 = r.i((this.f114603g.hashCode() + ((iG2 + (searchItemButton == null ? 0 : searchItemButton.hashCode())) * 31)) * 31, 31, this.f114604h);
        SearchBonusInfo searchBonusInfo = this.f114605i;
        return i12 + (searchBonusInfo != null ? searchBonusInfo.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "SearchItem(stringId=" + this.f114598b + ", title=" + this.f114599c + ", price=" + this.f114600d + ", image=" + this.f114601e + ", button=" + this.f114602f + ", validate=" + this.f114603g + ", isBanned=" + this.f114604h + ", bonusInfo=" + this.f114605i + ')';
    }
}
