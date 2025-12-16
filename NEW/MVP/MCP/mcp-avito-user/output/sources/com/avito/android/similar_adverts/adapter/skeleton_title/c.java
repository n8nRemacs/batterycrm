package com.avito.android.similar_adverts.adapter.skeleton_title;

import Y61.k;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: SimilarSkeletonTitleItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/similar_adverts/adapter/skeleton_title/c;", "Lcom/avito/android/serp/adapter/l1;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements l1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f283822b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SerpViewType f283823c = SerpViewType.f268585e;

    public c(int i12) {
        this.f283822b = i12;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222246b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270756b() {
        return this.f283822b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF279212b() {
        return "title";
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270758d() {
        return this.f283823c;
    }
}
