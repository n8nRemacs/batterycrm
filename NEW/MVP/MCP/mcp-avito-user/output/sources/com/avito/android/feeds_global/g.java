package com.avito.android.feeds_global;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FeedsItemImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feeds_global/g;", "Lcom/avito/android/feeds_global/f;", "_avito_bx-content_widget_feeds-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class g implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f157922b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f157923c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f157924d = SerpViewType.f268585e;

    public g(@Y61.k String str, @Y61.k String str2) {
        this.f157922b = str;
        this.f157923c = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f157922b, gVar.f157922b) && L.f(this.f157923c, gVar.f157923c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF121506b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount */
    public final int getF271560b() {
        return 6;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF155493b() {
        return this.f157923c;
    }

    @Override // com.avito.android.feeds_global.f
    @Y61.k
    /* renamed from: getTitle, reason: from getter */
    public final String getF157922b() {
        return this.f157922b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF271564f() {
        return this.f157924d;
    }

    public final int hashCode() {
        return this.f157923c.hashCode() + (this.f157922b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeedsItemImpl(title=");
        sb2.append(this.f157922b);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f157923c, ')');
    }
}
