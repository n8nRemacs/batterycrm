package com.avito.android.advert.item.compatibility.v3;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import j.k0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: GarageCompatibilityV3Analytics.kt */
@P
@k0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v3/p;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class p implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f74486b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f74487c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f74488d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f74489e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f74490f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f74491g;

    /* renamed from: h, reason: collision with root package name */
    public final int f74492h;

    /* renamed from: i, reason: collision with root package name */
    public final int f74493i;

    /* renamed from: j, reason: collision with root package name */
    public final int f74494j;

    /* renamed from: k, reason: collision with root package name */
    public final int f74495k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f74496l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f74497m;

    public p(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5, @Y61.k String str6, int i12, int i13, int i14, int i15, boolean z12) {
        this.f74486b = str;
        this.f74487c = str2;
        this.f74488d = str3;
        this.f74489e = str4;
        this.f74490f = str5;
        this.f74491g = str6;
        this.f74492h = i12;
        this.f74493i = i13;
        this.f74494j = i14;
        this.f74495k = i15;
        this.f74496l = z12;
        this.f74497m = new ParametrizedClickStreamEvent(13239, 0, P0.g(new Q("item_id", str), new Q("landing_action", "compatibilities_view"), new Q("spareparts_compatibilities_title", str2), new Q("spareparts_compatibilities_subtitle", str3), new Q("spareparts_compatibilities_status", str4), new Q("spareparts_compatibilities_primarybutton", str5), new Q("spareparts_compatibilities_secondarybutton", str6), new Q("brand_id", Integer.valueOf(i12)), new Q("model_id", Integer.valueOf(i13)), new Q("generation_id", Integer.valueOf(i14)), new Q("modification_id", Integer.valueOf(i15)), new Q("spareparts_has_compatibilities", Boolean.valueOf(z12))), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return L.f(this.f74486b, pVar.f74486b) && L.f(this.f74487c, pVar.f74487c) && L.f(this.f74488d, pVar.f74488d) && L.f(this.f74489e, pVar.f74489e) && L.f(this.f74490f, pVar.f74490f) && L.f(this.f74491g, pVar.f74491g) && this.f74492h == pVar.f74492h && this.f74493i == pVar.f74493i && this.f74494j == pVar.f74494j && this.f74495k == pVar.f74495k && this.f74496l == pVar.f74496l;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f74497m.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f74497m.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f74497m.f90248c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f74496l) + androidx.appcompat.app.r.e(this.f74495k, androidx.appcompat.app.r.e(this.f74494j, androidx.appcompat.app.r.e(this.f74493i, androidx.appcompat.app.r.e(this.f74492h, H.d(H.d(H.d(H.d(H.d(this.f74486b.hashCode() * 31, 31, this.f74487c), 31, this.f74488d), 31, this.f74489e), 31, this.f74490f), 31, this.f74491g), 31), 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GarageCompatibilityV3ShownEvent(advertId=");
        sb2.append(this.f74486b);
        sb2.append(", compatibilitiesTitle=");
        sb2.append(this.f74487c);
        sb2.append(", compatibilitiesSubtitle=");
        sb2.append(this.f74488d);
        sb2.append(", compatibilitiesStatus=");
        sb2.append(this.f74489e);
        sb2.append(", compatibilitiesPrimaryButton=");
        sb2.append(this.f74490f);
        sb2.append(", compatibilitiesSecondaryButton=");
        sb2.append(this.f74491g);
        sb2.append(", brandId=");
        sb2.append(this.f74492h);
        sb2.append(", modelId=");
        sb2.append(this.f74493i);
        sb2.append(", generationId=");
        sb2.append(this.f74494j);
        sb2.append(", modificationId=");
        sb2.append(this.f74495k);
        sb2.append(", hasCompatibilities=");
        return androidx.appcompat.app.r.x(sb2, this.f74496l, ')');
    }
}
