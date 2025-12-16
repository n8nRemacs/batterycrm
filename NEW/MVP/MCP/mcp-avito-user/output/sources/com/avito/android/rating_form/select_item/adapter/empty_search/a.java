package com.avito.android.rating_form.select_item.adapter.empty_search;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EmptySearchItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/select_item/adapter/empty_search/a;", "Lcom/avito/conveyor_item/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f248932b;

    public a() {
        this(null, 1, null);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return getF248932b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF248932b() {
        return this.f248932b;
    }

    public a(String str, int i12, C42822w c42822w) {
        this.f248932b = (i12 & 1) != 0 ? "empty_search_item" : str;
    }
}
