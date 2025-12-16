package com.avito.android.comparison.menu_bottom_sheet;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BottomSheetButtonModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/menu_bottom_sheet/a;", "", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f124094a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ActionType f124095b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f124096c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f124097d;

    public a(@k String str, @k ActionType actionType, @l DeepLink deepLink, @k String str2) {
        this.f124094a = str;
        this.f124095b = actionType;
        this.f124096c = deepLink;
        this.f124097d = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f124094a, aVar.f124094a) && this.f124095b == aVar.f124095b && L.f(this.f124096c, aVar.f124096c) && L.f(this.f124097d, aVar.f124097d);
    }

    public final int hashCode() {
        int iHashCode = (this.f124095b.hashCode() + (this.f124094a.hashCode() * 31)) * 31;
        DeepLink deepLink = this.f124096c;
        return this.f124097d.hashCode() + ((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BottomSheetButtonModel(text=");
        sb2.append(this.f124094a);
        sb2.append(", actionType=");
        sb2.append(this.f124095b);
        sb2.append(", link=");
        sb2.append(this.f124096c);
        sb2.append(", comparisonId=");
        return C22026a.c(sb2, this.f124097d, ')');
    }
}
