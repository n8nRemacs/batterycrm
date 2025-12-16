package com.avito.android.advert_stats.item.details;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StatDetailItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/item/details/a;", "Lcom/avito/conveyor_item/a;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f86735b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f86736c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f86737d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Image f86738e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f86739f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f86740g;

    public a(@k String str, @k String str2, @l Integer num, @l Image image, boolean z12, boolean z13) {
        this.f86735b = str;
        this.f86736c = str2;
        this.f86737d = num;
        this.f86738e = image;
        this.f86739f = z12;
        this.f86740g = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f86735b, aVar.f86735b) && L.f(this.f86736c, aVar.f86736c) && L.f(this.f86737d, aVar.f86737d) && L.f(this.f86738e, aVar.f86738e) && this.f86739f == aVar.f86739f && this.f86740g == aVar.f86740g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79541k() {
        return getF79540j().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79540j() {
        return this.f86735b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f86735b.hashCode() * 31, 31, this.f86736c);
        Integer num = this.f86737d;
        int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
        Image image = this.f86738e;
        return Boolean.hashCode(this.f86740g) + r.i((iHashCode + (image != null ? image.hashCode() : 0)) * 31, 31, this.f86739f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatDetailItem(stringId=");
        sb2.append(this.f86735b);
        sb2.append(", text=");
        sb2.append(this.f86736c);
        sb2.append(", drawableId=");
        sb2.append(this.f86737d);
        sb2.append(", icon=");
        sb2.append(this.f86738e);
        sb2.append(", isStatusItem=");
        sb2.append(this.f86739f);
        sb2.append(", isHidden=");
        return r.x(sb2, this.f86740g, ')');
    }

    public /* synthetic */ a(String str, String str2, Integer num, Image image, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? null : image, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? false : z13);
    }
}
