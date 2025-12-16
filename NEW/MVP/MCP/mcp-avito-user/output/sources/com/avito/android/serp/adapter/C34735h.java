package com.avito.android.serp.adapter;

import TV0.g;
import com.avito.android.R;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: AdvertItemDoubleBlueprint.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/h;", "LTV0/b;", "Lcom/avito/android/serp/adapter/video_snippet/c;", "Lcom/avito/android/serp/adapter/AdvertItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34735h implements TV0.b<com.avito.android.serp.adapter.video_snippet.c, AdvertItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.video_snippet.a f270125a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.e f270126b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.android.serp.adapter.video_snippet.d> f270127c;

    public C34735h(@Y61.k com.avito.android.serp.adapter.video_snippet.a aVar, @Y61.k com.avito.android.server_time.h hVar, @Y61.k Locale locale, @Y61.k com.avito.android.serp.e eVar, @Y61.l com.avito.android.video_snippets.g gVar) {
        this.f270125a = aVar;
        this.f270126b = eVar;
        this.f270127c = new g.a<>(R.layout.advert_item_grid, new C34733g(hVar, locale, gVar, this));
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<com.avito.android.serp.adapter.video_snippet.c, AdvertItem> a() {
        return this.f270125a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.android.serp.adapter.video_snippet.d> b() {
        return this.f270127c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof AdvertItem) {
            AdvertItem advertItem = (AdvertItem) aVar;
            if (advertItem.f268374D == SerpViewType.f268584d && (advertItem.f268378F.isGrid() || advertItem.f268378F.isList())) {
                return true;
            }
        }
        return false;
    }
}
