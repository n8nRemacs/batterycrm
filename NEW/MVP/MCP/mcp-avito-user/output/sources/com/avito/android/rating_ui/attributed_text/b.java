package com.avito.android.rating_ui.attributed_text;

import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingAttributedTextClickedItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/attributed_text/b;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final DeepLink f249937a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f249938b;

    public b() {
        this(null, null, 3, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f249937a, bVar.f249937a) && L.f(this.f249938b, bVar.f249938b);
    }

    public final int hashCode() {
        DeepLink deepLink = this.f249937a;
        int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
        String str = this.f249938b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingAttributedTextClickedItem(deepLink=");
        sb2.append(this.f249937a);
        sb2.append(", url=");
        return C22026a.c(sb2, this.f249938b, ')');
    }

    public b(DeepLink deepLink, String str, int i12, C42822w c42822w) {
        deepLink = (i12 & 1) != 0 ? null : deepLink;
        str = (i12 & 2) != 0 ? null : str;
        this.f249937a = deepLink;
        this.f249938b = str;
    }
}
