package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QueryLinkItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/query_link/a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/f;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a implements com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f221130b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f221131c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f221132d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final p<String, DeepLink, G0> f221133e;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k String str, @k String str2, @l AttributedText attributedText, @k p<? super String, ? super DeepLink, G0> pVar) {
        this.f221130b = str;
        this.f221131c = str2;
        this.f221132d = attributedText;
        this.f221133e = pVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f221130b, aVar.f221130b) && L.f(this.f221131c, aVar.f221131c) && L.f(this.f221132d, aVar.f221132d) && L.f(this.f221133e, aVar.f221133e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74860b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF155493b() {
        return this.f221130b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f221130b.hashCode() * 31, 31, this.f221131c);
        AttributedText attributedText = this.f221132d;
        return this.f221133e.hashCode() + ((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "QueryLinkItem(stringId=" + this.f221130b + ", linkToQueryId=" + this.f221131c + ", text=" + this.f221132d + ", onLinkClicked=" + this.f221133e + ')';
    }
}
