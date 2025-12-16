package com.avito.android.user_advert.advert.items.portfolio_filled_widget;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PortfolioFilledWidgetItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/portfolio_filled_widget/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309804b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final MyAdvertDetails.Portfolio.FilledPortfolio f309805c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f309806d;

    public a(@k String str, @k MyAdvertDetails.Portfolio.FilledPortfolio filledPortfolio, @k String str2) {
        this.f309804b = str;
        this.f309805c = filledPortfolio;
        this.f309806d = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309804b, aVar.f309804b) && L.f(this.f309805c, aVar.f309805c) && L.f(this.f309806d, aVar.f309806d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF284485b() {
        return getF306970b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF306970b() {
        return this.f309804b;
    }

    public final int hashCode() {
        return this.f309806d.hashCode() + ((this.f309805c.hashCode() + (this.f309804b.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PortfolioFilledWidgetItem(stringId=");
        sb2.append(this.f309804b);
        sb2.append(", filledPortfolio=");
        sb2.append(this.f309805c);
        sb2.append(", advertId=");
        return C22026a.c(sb2, this.f309806d, ')');
    }
}
