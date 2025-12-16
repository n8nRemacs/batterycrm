package com.avito.android.tariff_cpt.info.ui.items.filters_tabs;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptInfoFiltersTabsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/filters_tabs/a;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f298327a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f298328b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f298329c;

    public a(@k String str, @l String str2, boolean z12) {
        this.f298327a = str;
        this.f298328b = str2;
        this.f298329c = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f298327a, aVar.f298327a) && L.f(this.f298328b, aVar.f298328b) && this.f298329c == aVar.f298329c;
    }

    public final int hashCode() {
        int iHashCode = this.f298327a.hashCode() * 31;
        String str = this.f298328b;
        return Boolean.hashCode(this.f298329c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptInfoFilterTabItem(title=");
        sb2.append(this.f298327a);
        sb2.append(", groupSlug=");
        sb2.append(this.f298328b);
        sb2.append(", active=");
        return r.x(sb2, this.f298329c, ')');
    }
}
