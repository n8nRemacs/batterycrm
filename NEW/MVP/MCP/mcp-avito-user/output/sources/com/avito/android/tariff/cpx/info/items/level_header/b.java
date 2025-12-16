package com.avito.android.tariff.cpx.info.items.level_header;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoLevelHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/level_header/b;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DeepLink f296530a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f296531b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f296532c;

    /* renamed from: d, reason: collision with root package name */
    public final int f296533d;

    public b(@InterfaceC42150f int i12, @Y61.k DeepLink deepLink, @InterfaceC42150f @Y61.l Integer num, @Y61.l String str) {
        this.f296530a = deepLink;
        this.f296531b = str;
        this.f296532c = num;
        this.f296533d = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f296530a, bVar.f296530a) && L.f(this.f296531b, bVar.f296531b) && L.f(this.f296532c, bVar.f296532c) && this.f296533d == bVar.f296533d;
    }

    public final int hashCode() {
        int iHashCode = this.f296530a.hashCode() * 31;
        String str = this.f296531b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f296532c;
        return Integer.hashCode(this.f296533d) + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxInfoLevelHeaderButton(deeplink=");
        sb2.append(this.f296530a);
        sb2.append(", title=");
        sb2.append(this.f296531b);
        sb2.append(", iconAttr=");
        sb2.append(this.f296532c);
        sb2.append(", styleAttr=");
        return r.t(sb2, this.f296533d, ')');
    }
}
