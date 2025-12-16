package com.avito.android.avito_finance_user_profile.view.item;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoFinanceItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/item/h;", "", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f98008a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final UniversalColor f98009b;

    public h(@l String str, @l UniversalColor universalColor) {
        this.f98008a = str;
        this.f98009b = universalColor;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f98008a, hVar.f98008a) && L.f(this.f98009b, hVar.f98009b);
    }

    public final int hashCode() {
        String str = this.f98008a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UniversalColor universalColor = this.f98009b;
        return iHashCode + (universalColor != null ? universalColor.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoFinanceItemBackground(gradient=");
        sb2.append(this.f98008a);
        sb2.append(", color=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f98009b, ')');
    }
}
