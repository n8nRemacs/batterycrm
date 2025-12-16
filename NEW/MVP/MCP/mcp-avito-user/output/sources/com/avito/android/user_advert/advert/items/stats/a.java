package com.avito.android.user_advert.advert.items.stats;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertStatsContact;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MyAdvertStatsItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/stats/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f310281b;

    /* renamed from: c, reason: collision with root package name */
    public final int f310282c;

    /* renamed from: d, reason: collision with root package name */
    public final int f310283d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f310284e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f310285f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AdvertStatsContact f310286g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f310287h;

    public a(@k String str, int i12, int i13, @l Integer num, @l DeepLink deepLink, @l AdvertStatsContact advertStatsContact, @k String str2) {
        this.f310281b = str;
        this.f310282c = i12;
        this.f310283d = i13;
        this.f310284e = num;
        this.f310285f = deepLink;
        this.f310286g = advertStatsContact;
        this.f310287h = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f310281b, aVar.f310281b) && this.f310282c == aVar.f310282c && this.f310283d == aVar.f310283d && L.f(this.f310284e, aVar.f310284e) && L.f(this.f310285f, aVar.f310285f) && L.f(this.f310286g, aVar.f310286g) && L.f(this.f310287h, aVar.f310287h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268996b() {
        return getF154460b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154460b() {
        return this.f310281b;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f310283d, r.e(this.f310282c, this.f310281b.hashCode() * 31, 31), 31);
        Integer num = this.f310284e;
        int iHashCode = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        DeepLink deepLink = this.f310285f;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        AdvertStatsContact advertStatsContact = this.f310286g;
        return this.f310287h.hashCode() + ((iHashCode2 + (advertStatsContact != null ? advertStatsContact.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MyAdvertStatsItem(stringId=");
        sb2.append(this.f310281b);
        sb2.append(", total=");
        sb2.append(this.f310282c);
        sb2.append(", today=");
        sb2.append(this.f310283d);
        sb2.append(", favorites=");
        sb2.append(this.f310284e);
        sb2.append(", deepLink=");
        sb2.append(this.f310285f);
        sb2.append(", advertStatsContact=");
        sb2.append(this.f310286g);
        sb2.append(", advertId=");
        return C22026a.c(sb2, this.f310287h, ')');
    }
}
