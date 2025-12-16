package com.avito.android.search.filter.adapter.category_group;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CategoryGroupSelectPayload.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/category_group/B;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f262034a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f262035b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<SelectParameter.Value> f262036c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f262037d;

    public B(@Y61.k String str, @Y61.k String str2, @Y61.k List<SelectParameter.Value> list, boolean z12) {
        this.f262034a = str;
        this.f262035b = str2;
        this.f262036c = list;
        this.f262037d = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b12 = (B) obj;
        return L.f(this.f262034a, b12.f262034a) && L.f(this.f262035b, b12.f262035b) && L.f(this.f262036c, b12.f262036c) && this.f262037d == b12.f262037d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f262037d) + H.e(H.d(this.f262034a.hashCode() * 31, 31, this.f262035b), 31, this.f262036c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryGroupSelectPayload(requestId=");
        sb2.append(this.f262034a);
        sb2.append(", title=");
        sb2.append(this.f262035b);
        sb2.append(", options=");
        sb2.append(this.f262036c);
        sb2.append(", hideSearch=");
        return androidx.appcompat.app.r.x(sb2, this.f262037d, ')');
    }

    public /* synthetic */ B(String str, String str2, List list, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, list, (i12 & 8) != 0 ? false : z12);
    }
}
