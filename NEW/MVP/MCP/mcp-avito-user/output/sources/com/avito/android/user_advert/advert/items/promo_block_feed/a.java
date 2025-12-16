package com.avito.android.user_advert.advert.items.promo_block_feed;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.lib.util.groupable_item.GroupingOutput;
import com.avito.android.remote.model.adverts.PromoBlockData;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PromoBlockItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/promo_block_feed/a;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/lib/util/groupable_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a, com.avito.android.lib.util.groupable_item.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f309849b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f309850c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PromoBlockData f309851d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f309852e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final GroupingOutput f309853f;

    public a(long j12, String str, PromoBlockData promoBlockData, boolean z12, GroupingOutput groupingOutput, int i12, C42822w c42822w) {
        z12 = (i12 & 8) != 0 ? false : z12;
        groupingOutput = (i12 & 16) != 0 ? new GroupingOutput() : groupingOutput;
        this.f309849b = j12;
        this.f309850c = str;
        this.f309851d = promoBlockData;
        this.f309852e = z12;
        this.f309853f = groupingOutput;
    }

    @Override // com.avito.android.lib.util.groupable_item.a
    /* renamed from: W, reason: from getter */
    public final boolean getF309852e() {
        return this.f309852e;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f309849b == aVar.f309849b && L.f(this.f309850c, aVar.f309850c) && L.f(this.f309851d, aVar.f309851d) && this.f309852e == aVar.f309852e && L.f(this.f309853f, aVar.f309853f);
    }

    @Override // com.avito.android.lib.util.groupable_item.a
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final GroupingOutput getF272526d() {
        return this.f309853f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222258b() {
        return getF309273b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309273b() {
        return this.f309850c;
    }

    public final int hashCode() {
        return this.f309853f.hashCode() + r.i((this.f309851d.hashCode() + H.d(Long.hashCode(this.f309849b) * 31, 31, this.f309850c)) * 31, 31, this.f309852e);
    }

    @Y61.k
    public final String toString() {
        return "PromoBlockItem(bannerId=" + this.f309849b + ", stringId=" + this.f309850c + ", data=" + this.f309851d + ", closeable=" + this.f309852e + ", output=" + this.f309853f + ')';
    }
}
