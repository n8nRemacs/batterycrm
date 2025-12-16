package com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.header;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxLevelInfoHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/cpx_level_info/header/a;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f294833a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f294834b;

    /* renamed from: c, reason: collision with root package name */
    public final int f294835c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final DeepLink f294836d;

    public a(@InterfaceC42150f int i12, @Y61.k DeepLink deepLink, @InterfaceC42150f @l Integer num, @l String str) {
        this.f294833a = str;
        this.f294834b = num;
        this.f294835c = i12;
        this.f294836d = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f294833a, aVar.f294833a) && L.f(this.f294834b, aVar.f294834b) && this.f294835c == aVar.f294835c && L.f(this.f294836d, aVar.f294836d);
    }

    public final int hashCode() {
        String str = this.f294833a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f294834b;
        return this.f294836d.hashCode() + r.e(this.f294835c, (iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxLevelInfoButton(title=");
        sb2.append(this.f294833a);
        sb2.append(", iconAttr=");
        sb2.append(this.f294834b);
        sb2.append(", styleAttr=");
        sb2.append(this.f294835c);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f294836d, ')');
    }
}
