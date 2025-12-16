package com.avito.android.messenger.map.search.adapter;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: GeoSearchSuggestItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/search/adapter/a;", "Lcom/avito/conveyor_item/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    public final double f196515b;

    /* renamed from: c, reason: collision with root package name */
    public final double f196516c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f196517d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f196518e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f196519f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f196520g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f196521h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f196522i = String.valueOf(hashCode());

    /* renamed from: j, reason: collision with root package name */
    public final boolean f196523j;

    public a(double d12, double d13, @k String str, @k String str2, @k String str3, @l String str4, @k String str5) {
        this.f196515b = d12;
        this.f196516c = d13;
        this.f196517d = str;
        this.f196518e = str2;
        this.f196519f = str3;
        this.f196520g = str4;
        this.f196521h = str5;
        this.f196523j = !(L.f(str, "street") ? true : L.f(str, "country"));
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f196515b == aVar.f196515b && this.f196516c == aVar.f196516c && L.f(this.f196517d, aVar.f196517d) && L.f(this.f196518e, aVar.f196518e) && L.f(this.f196520g, aVar.f196520g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return getF4060b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF4060b() {
        return this.f196522i;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(androidx.compose.ui.graphics.colorspace.e.d(Double.hashCode(this.f196515b) * 31, 31, this.f196516c), 31, this.f196517d), 31, this.f196518e);
        String str = this.f196520g;
        return iD2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        return C43066x.F0("GeoSearchSuggestItem(\n            |   latitude=" + this.f196515b + ",\n            |   longitude=" + this.f196516c + ",\n            |   kind='" + this.f196517d + "',\n            |   title='" + this.f196518e + "',\n            |   name='" + this.f196519f + "',\n            |   description=" + this.f196520g + ",\n            |   addressType=" + this.f196521h + ",\n            |   stringId='" + this.f196522i + "',\n            |   isSendable=" + this.f196523j + "\n            |)");
    }
}
