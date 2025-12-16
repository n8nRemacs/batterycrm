package com.avito.android.home.appending_item.empty;

import TV0.g;
import Y61.k;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: AppendingEmptyItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/home/appending_item/empty/b;", "LTV0/b;", "Lcom/avito/android/home/appending_item/empty/d;", "Lcom/avito/android/home/appending_item/empty/AppendingEmptyItem;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements TV0.b<d, AppendingEmptyItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f162207a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f162208b = new g.a<>(R.layout.appending_empty_item, a.f162206l);

    public b(@k c cVar) {
        this.f162207a = cVar;
    }

    @Override // TV0.b
    @k
    public final TV0.d<d, AppendingEmptyItem> a() {
        return this.f162207a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f162208b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof AppendingEmptyItem;
    }
}
