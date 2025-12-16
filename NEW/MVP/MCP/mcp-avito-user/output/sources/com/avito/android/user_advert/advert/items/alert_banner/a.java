package com.avito.android.user_advert.advert.items.alert_banner;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AlertBannerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/alert_banner/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309179b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f309180c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f309181d;

    /* renamed from: e, reason: collision with root package name */
    public final int f309182e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f309183f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f309184g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final DeepLink f309185h;

    public a(@k String str, @k String str2, @l String str3, @InterfaceC42150f int i12, @l DeepLink deepLink, @l String str4, @l DeepLink deepLink2) {
        this.f309179b = str;
        this.f309180c = str2;
        this.f309181d = str3;
        this.f309182e = i12;
        this.f309183f = deepLink;
        this.f309184g = str4;
        this.f309185h = deepLink2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309179b, aVar.f309179b) && L.f(this.f309180c, aVar.f309180c) && L.f(this.f309181d, aVar.f309181d) && this.f309182e == aVar.f309182e && L.f(this.f309183f, aVar.f309183f) && L.f(this.f309184g, aVar.f309184g) && L.f(this.f309185h, aVar.f309185h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272342b() {
        return getF317289b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF317289b() {
        return this.f309179b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f309179b.hashCode() * 31, 31, this.f309180c);
        String str = this.f309181d;
        int iE2 = r.e(this.f309182e, (iD2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        DeepLink deepLink = this.f309183f;
        int iHashCode = (iE2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str2 = this.f309184g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink2 = this.f309185h;
        return iHashCode2 + (deepLink2 != null ? deepLink2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AlertBannerItem(stringId=");
        sb2.append(this.f309179b);
        sb2.append(", title=");
        sb2.append(this.f309180c);
        sb2.append(", body=");
        sb2.append(this.f309181d);
        sb2.append(", styleAttr=");
        sb2.append(this.f309182e);
        sb2.append(", deepLink=");
        sb2.append(this.f309183f);
        sb2.append(", buttonTitle=");
        sb2.append(this.f309184g);
        sb2.append(", buttonDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f309185h, ')');
    }
}
