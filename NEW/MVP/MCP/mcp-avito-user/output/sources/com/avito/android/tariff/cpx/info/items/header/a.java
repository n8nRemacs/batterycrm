package com.avito.android.tariff.cpx.info.items.header;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/header/a;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Boolean f296497a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f296498b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f296499c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final DeepLink f296500d;

    public a(@Y61.l Boolean bool, boolean z12, @Y61.k String str, @Y61.k DeepLink deepLink) {
        this.f296497a = bool;
        this.f296498b = z12;
        this.f296499c = str;
        this.f296500d = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f296497a, aVar.f296497a) && this.f296498b == aVar.f296498b && L.f(this.f296499c, aVar.f296499c) && L.f(this.f296500d, aVar.f296500d);
    }

    public final int hashCode() {
        Boolean bool = this.f296497a;
        return this.f296500d.hashCode() + H.d(r.i((bool == null ? 0 : bool.hashCode()) * 31, 31, this.f296498b), 31, this.f296499c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabEntity(hasDotNotification=");
        sb2.append(this.f296497a);
        sb2.append(", isSelected=");
        sb2.append(this.f296498b);
        sb2.append(", title=");
        sb2.append(this.f296499c);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f296500d, ')');
    }
}
