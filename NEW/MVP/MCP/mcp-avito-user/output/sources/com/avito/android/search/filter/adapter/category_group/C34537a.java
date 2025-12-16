package com.avito.android.search.filter.adapter.category_group;

import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryGroupItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/category_group/a;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.search.filter.adapter.category_group.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C34537a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DeepLink f262051a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final List<String> f262052b;

    public C34537a(@Y61.k DeepLink deepLink, @Y61.l List<String> list) {
        this.f262051a = deepLink;
        this.f262052b = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34537a)) {
            return false;
        }
        C34537a c34537a = (C34537a) obj;
        return L.f(this.f262051a, c34537a.f262051a) && L.f(this.f262052b, c34537a.f262052b);
    }

    public final int hashCode() {
        int iHashCode = this.f262051a.hashCode() * 31;
        List<String> list = this.f262052b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackNavigation(link=");
        sb2.append(this.f262051a);
        sb2.append(", unsetParams=");
        return H.p(sb2, this.f262052b, ')');
    }
}
