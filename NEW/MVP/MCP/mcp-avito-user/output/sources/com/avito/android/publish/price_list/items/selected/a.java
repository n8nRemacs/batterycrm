package com.avito.android.publish.price_list.items.selected;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectedPriceListItems.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/items/selected/a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f238710a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f238711b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f238712c;

    public a(int i12, @Y61.l String str, boolean z12) {
        this.f238710a = i12;
        this.f238711b = str;
        this.f238712c = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f238710a == aVar.f238710a && L.f(this.f238711b, aVar.f238711b) && this.f238712c == aVar.f238712c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f238710a) * 31;
        String str = this.f238711b;
        return Boolean.hashCode(this.f238712c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectedItemInfo(position=");
        sb2.append(this.f238710a);
        sb2.append(", title=");
        sb2.append(this.f238711b);
        sb2.append(", isError=");
        return androidx.appcompat.app.r.x(sb2, this.f238712c, ')');
    }

    public /* synthetic */ a(int i12, String str, boolean z12, int i13, C42822w c42822w) {
        this(i12, str, (i13 & 4) != 0 ? false : z12);
    }
}
