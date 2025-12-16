package com.avito.android.comparison.items.add_more_item;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddMoreItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/items/add_more_item/a;", "LTV0/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f123912b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f123913c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f123914d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f123915e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f123916f;

    public a(long j12, @k String str, @k DeepLink deepLink, @l Integer num, @l String str2) {
        this.f123912b = j12;
        this.f123913c = str;
        this.f123914d = deepLink;
        this.f123915e = num;
        this.f123916f = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f123912b == aVar.f123912b && L.f(this.f123913c, aVar.f123913c) && L.f(this.f123914d, aVar.f123914d) && L.f(this.f123915e, aVar.f123915e) && L.f(this.f123916f, aVar.f123916f);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF80676b() {
        return this.f123912b;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f123914d, H.d(Long.hashCode(this.f123912b) * 31, 31, this.f123913c), 31);
        Integer num = this.f123915e;
        int iHashCode = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f123916f;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddMoreItem(id=");
        sb2.append(this.f123912b);
        sb2.append(", text=");
        sb2.append(this.f123913c);
        sb2.append(", link=");
        sb2.append(this.f123914d);
        sb2.append(", itemsLimit=");
        sb2.append(this.f123915e);
        sb2.append(", limitedErrorText=");
        return C22026a.c(sb2, this.f123916f, ')');
    }
}
