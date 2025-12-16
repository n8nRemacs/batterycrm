package com.avito.android.mortgage.root.list.items.cta_banner;

import Y61.k;
import Y61.l;
import a10.InterfaceC19664a;
import a10.InterfaceC19665b;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.ActionButton;
import com.avito.android.mortgage.api.model.items.application.BannerAnalyticsType;
import com.avito.android.remote.model.UniversalImage;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CtaBannerItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/cta_banner/c;", "La10/b;", "La10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements InterfaceC19665b, InterfaceC19664a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202520b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalImage f202521c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f202522d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f202523e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ActionButton f202524f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final BannerAnalyticsType f202525g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f202526h;

    public c(@k String str, @l UniversalImage universalImage, @k String str2, @l String str3, @l ActionButton actionButton, @l BannerAnalyticsType bannerAnalyticsType, boolean z12) {
        this.f202520b = str;
        this.f202521c = universalImage;
        this.f202522d = str2;
        this.f202523e = str3;
        this.f202524f = actionButton;
        this.f202525g = bannerAnalyticsType;
        this.f202526h = z12;
    }

    @Override // a10.InterfaceC19664a
    @k
    public final InterfaceC19665b N() {
        return new c(this.f202520b, this.f202521c, this.f202522d, this.f202523e, this.f202524f, this.f202525g, false);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f202520b, cVar.f202520b) && L.f(this.f202521c, cVar.f202521c) && L.f(this.f202522d, cVar.f202522d) && L.f(this.f202523e, cVar.f202523e) && L.f(this.f202524f, cVar.f202524f) && this.f202525g == cVar.f202525g && this.f202526h == cVar.f202526h;
    }

    @Override // a10.InterfaceC19664a
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF202313l() {
        return this.f202526h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74796b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF265059b() {
        return this.f202520b;
    }

    public final int hashCode() {
        int iHashCode = this.f202520b.hashCode() * 31;
        UniversalImage universalImage = this.f202521c;
        int iD2 = H.d((iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31, this.f202522d);
        String str = this.f202523e;
        int iHashCode2 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        ActionButton actionButton = this.f202524f;
        int iHashCode3 = (iHashCode2 + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
        BannerAnalyticsType bannerAnalyticsType = this.f202525g;
        return Boolean.hashCode(this.f202526h) + ((iHashCode3 + (bannerAnalyticsType != null ? bannerAnalyticsType.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CtaBannerItem(stringId=");
        sb2.append(this.f202520b);
        sb2.append(", image=");
        sb2.append(this.f202521c);
        sb2.append(", title=");
        sb2.append(this.f202522d);
        sb2.append(", description=");
        sb2.append(this.f202523e);
        sb2.append(", action=");
        sb2.append(this.f202524f);
        sb2.append(", analyticsType=");
        sb2.append(this.f202525g);
        sb2.append(", enabled=");
        return r.x(sb2, this.f202526h, ')');
    }

    public /* synthetic */ c(String str, UniversalImage universalImage, String str2, String str3, ActionButton actionButton, BannerAnalyticsType bannerAnalyticsType, boolean z12, int i12, C42822w c42822w) {
        this(str, universalImage, str2, str3, actionButton, bannerAnalyticsType, (i12 & 64) != 0 ? true : z12);
    }
}
