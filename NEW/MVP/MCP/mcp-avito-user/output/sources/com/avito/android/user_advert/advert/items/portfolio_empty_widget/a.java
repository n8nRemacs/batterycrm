package com.avito.android.user_advert.advert.items.portfolio_empty_widget;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PortfolioEmptyWidgetItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/portfolio_empty_widget/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309787b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final MyAdvertDetails.Portfolio.EmptyPortfolio f309788c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f309789d;

    public a(@k String str, @k MyAdvertDetails.Portfolio.EmptyPortfolio emptyPortfolio, @k String str2) {
        this.f309787b = str;
        this.f309788c = emptyPortfolio;
        this.f309789d = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309787b, aVar.f309787b) && L.f(this.f309788c, aVar.f309788c) && L.f(this.f309789d, aVar.f309789d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return getF309490b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309490b() {
        return this.f309787b;
    }

    public final int hashCode() {
        return this.f309789d.hashCode() + ((this.f309788c.hashCode() + (this.f309787b.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PortfolioEmptyWidgetItem(stringId=");
        sb2.append(this.f309787b);
        sb2.append(", emptyPortfolio=");
        sb2.append(this.f309788c);
        sb2.append(", advertId=");
        return C22026a.c(sb2, this.f309789d, ')');
    }
}
