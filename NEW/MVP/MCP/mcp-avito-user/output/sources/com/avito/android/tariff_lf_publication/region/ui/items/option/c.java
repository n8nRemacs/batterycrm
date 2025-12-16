package com.avito.android.tariff_lf_publication.region.ui.items.option;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffLfPublicationRegionOptionItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_publication/region/ui/items/option/c;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f301123b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f301124c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f301125d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f301126e;

    public c(@k String str, @k String str2, @k String str3, boolean z12) {
        this.f301123b = str;
        this.f301124c = str2;
        this.f301125d = str3;
        this.f301126e = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f301123b, cVar.f301123b) && L.f(this.f301124c, cVar.f301124c) && L.f(this.f301125d, cVar.f301125d) && this.f301126e == cVar.f301126e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return getF297177b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF297177b() {
        return this.f301123b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f301126e) + H.d(H.d(this.f301123b.hashCode() * 31, 31, this.f301124c), 31, this.f301125d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffLfPublicationRegionOptionItem(stringId=");
        sb2.append(this.f301123b);
        sb2.append(", regionId=");
        sb2.append(this.f301124c);
        sb2.append(", title=");
        sb2.append(this.f301125d);
        sb2.append(", isChecked=");
        return r.x(sb2, this.f301126e, ')');
    }
}
