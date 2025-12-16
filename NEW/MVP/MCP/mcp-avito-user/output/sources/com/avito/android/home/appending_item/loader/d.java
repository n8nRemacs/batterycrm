package com.avito.android.home.appending_item.loader;

import TV0.g;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: AppendingLoaderItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/home/appending_item/loader/d;", "LTV0/b;", "Lcom/avito/android/home/appending_item/loader/g;", "Lcom/avito/android/home/appending_item/loader/AppendingLoaderItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements TV0.b<g, AppendingLoaderItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f162221a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f162222b = new g.a<>(R.layout.appending_loader, c.f162220l);

    public d(@k f fVar) {
        this.f162221a = fVar;
    }

    @Override // TV0.b
    @k
    public final TV0.d<g, AppendingLoaderItem> a() {
        return this.f162221a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f162222b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof AppendingLoaderItem) && !((AppendingLoaderItem) aVar).f162215f;
    }
}
