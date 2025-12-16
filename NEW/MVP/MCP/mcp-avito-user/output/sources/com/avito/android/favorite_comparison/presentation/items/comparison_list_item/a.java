package com.avito.android.favorite_comparison.presentation.items.comparison_list_item;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComparisonListItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/items/comparison_list_item/a;", "LTV0/a;", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f155325b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f155326c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f155327d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<Image> f155328e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DeepLink f155329f;

    public a(long j12, @l List list, @k DeepLink deepLink, @k String str, @l String str2) {
        this.f155325b = j12;
        this.f155326c = str;
        this.f155327d = str2;
        this.f155328e = list;
        this.f155329f = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f155325b == aVar.f155325b && L.f(this.f155326c, aVar.f155326c) && L.f(this.f155327d, aVar.f155327d) && L.f(this.f155328e, aVar.f155328e) && L.f(this.f155329f, aVar.f155329f);
    }

    @Override // TV0.a
    public final long getId() {
        return this.f155325b;
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f155325b) * 31, 31, this.f155326c);
        String str = this.f155327d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        List<Image> list = this.f155328e;
        return this.f155329f.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComparisonListItem(id=");
        sb2.append(this.f155325b);
        sb2.append(", title=");
        sb2.append(this.f155326c);
        sb2.append(", subtitle=");
        sb2.append(this.f155327d);
        sb2.append(", images=");
        sb2.append(this.f155328e);
        sb2.append(", link=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f155329f, ')');
    }
}
