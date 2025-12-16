package com.avito.android.extended_profile_adverts.adapter.loading_item;

import TV0.g;
import Y61.k;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: PageLoadingItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_adverts/adapter/loading_item/c;", "LTV0/b;", "Lcom/avito/android/extended_profile_adverts/adapter/loading_item/f;", "Lcom/avito/android/extended_profile_adverts/adapter/loading_item/a;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements TV0.b<f, a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f150586a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f150587b = new g.a<>(R.layout.pending_view, b.f150585l);

    public c(@k d dVar) {
        this.f150586a = dVar;
    }

    @Override // TV0.b
    @k
    public final TV0.d<f, a> a() {
        return this.f150586a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f150587b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof a;
    }
}
