package com.avito.android.user_advert.advert.items.realty.reliable_owner;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReliableOwnerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/realty/reliable_owner/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309927b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final MyAdvertDetails.ReliableOwner f309928c;

    public a(@k String str, @k MyAdvertDetails.ReliableOwner reliableOwner) {
        this.f309927b = str;
        this.f309928c = reliableOwner;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309927b, aVar.f309927b) && L.f(this.f309928c, aVar.f309928c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF270893b() {
        return getF309927b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309927b() {
        return this.f309927b;
    }

    public final int hashCode() {
        return this.f309928c.hashCode() + (this.f309927b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ReliableOwnerItem(stringId=" + this.f309927b + ", data=" + this.f309928c + ')';
    }
}
