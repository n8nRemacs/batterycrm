package com.avito.android.tariff.cpx.info.items.header;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/header/b;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Integer f296501a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeepLink f296502b;

    public b(@InterfaceC42150f @Y61.l Integer num, @Y61.k DeepLink deepLink) {
        this.f296501a = num;
        this.f296502b = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f296501a, bVar.f296501a) && L.f(this.f296502b, bVar.f296502b);
    }

    public final int hashCode() {
        Integer num = this.f296501a;
        return this.f296502b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxInfoHeaderIconButton(iconAttr=");
        sb2.append(this.f296501a);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f296502b, ')');
    }
}
