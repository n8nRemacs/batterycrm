package com.avito.android.loyalty.ui.badge_details;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BadgeDetailsArgs.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details/a;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f183247a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f183248b;

    public a(@k String str, @k DeepLink deepLink) {
        this.f183247a = str;
        this.f183248b = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f183247a, aVar.f183247a) && L.f(this.f183248b, aVar.f183248b);
    }

    public final int hashCode() {
        return this.f183248b.hashCode() + (this.f183247a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BadgeDetailsAction(title=");
        sb2.append(this.f183247a);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f183248b, ')');
    }
}
