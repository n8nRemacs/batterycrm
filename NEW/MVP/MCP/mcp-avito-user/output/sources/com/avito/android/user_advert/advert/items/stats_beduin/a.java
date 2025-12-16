package com.avito.android.user_advert.advert.items.stats_beduin;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.BeduinV2;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MyAdvertStatsBeduinItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/stats_beduin/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BeduinV2 f310299b;

    public a(@k BeduinV2 beduinV2) {
        this.f310299b = beduinV2;
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
        return L.f(this.f310299b, aVar.f310299b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF301522b() {
        return -151623437;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF310359b() {
        return "BeduinItemStats";
    }

    public final int hashCode() {
        return this.f310299b.hashCode() - 405359251;
    }

    @k
    public final String toString() {
        return "MyAdvertStatsBeduinItem(beduinItemId=BeduinItemStats, beduinContent=" + this.f310299b + ')';
    }
}
