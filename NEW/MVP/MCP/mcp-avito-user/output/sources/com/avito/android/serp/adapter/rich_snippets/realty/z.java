package com.avito.android.serp.adapter.rich_snippets.realty;

import TV0.g;
import com.avito.android.R;
import com.avito.android.serp.adapter.SerpViewType;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: DevelopmentXlListItemBlueprint.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/realty/z;", "LTV0/b;", "Lcom/avito/android/serp/adapter/rich_snippets/realty/E;", "Lcom/avito/android/serp/adapter/rich_snippets/realty/DevelopmentXlItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class z implements TV0.b<E, DevelopmentXlItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A f271021a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f271022b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<F> f271023c;

    public z(@Y61.k A a12, @Y61.k com.avito.android.server_time.h hVar, @Y61.k Locale locale, @Y61.k com.avito.android.connection_quality.connectivity.a aVar) {
        this.f271021a = a12;
        this.f271022b = aVar;
        this.f271023c = new g.a<>(R.layout.development_xl_item_list, new y(hVar, locale, this));
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<E, DevelopmentXlItem> a() {
        return this.f271021a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<F> b() {
        return this.f271023c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof DevelopmentXlItem) {
            DevelopmentXlItem developmentXlItem = (DevelopmentXlItem) aVar;
            if (developmentXlItem.f270918h == SerpViewType.f268582b && developmentXlItem.f270919i.isList()) {
                return true;
            }
        }
        return false;
    }
}
