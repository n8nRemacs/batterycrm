package com.avito.android.loyalty.ui.quality_service_gray.items.button;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ButtonItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service_gray/items/button/a;", "Lcom/avito/conveyor_item/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f184069b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f184070c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f184071d;

    public a(@k String str, @k String str2, @k DeepLink deepLink) {
        this.f184069b = str;
        this.f184070c = str2;
        this.f184071d = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f184069b, aVar.f184069b) && L.f(this.f184070c, aVar.f184070c) && L.f(this.f184071d, aVar.f184071d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74796b() {
        return getF74797c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF74797c() {
        return this.f184069b;
    }

    public final int hashCode() {
        return this.f184071d.hashCode() + H.d(this.f184069b.hashCode() * 31, 31, this.f184070c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonItem(stringId=");
        sb2.append(this.f184069b);
        sb2.append(", title=");
        sb2.append(this.f184070c);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f184071d, ')');
    }
}
