package com.avito.android.serp.adapter.rich_snippets.realty;

import TV0.g;
import com.avito.android.R;
import com.avito.android.serp.adapter.SerpViewType;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: DevelopmentListItemBlueprint.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/realty/b;", "LTV0/b;", "Lcom/avito/android/serp/adapter/rich_snippets/realty/f;", "Lcom/avito/android/serp/adapter/rich_snippets/realty/DevelopmentItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.rich_snippets.realty.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34757b implements TV0.b<InterfaceC34761f, DevelopmentItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34758c f270973a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f270974b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<C34762g> f270975c;

    public C34757b(@Y61.k InterfaceC34758c interfaceC34758c, @Y61.k com.avito.android.server_time.h hVar, @Y61.k Locale locale, @Y61.k com.avito.android.connection_quality.connectivity.a aVar) {
        this.f270973a = interfaceC34758c;
        this.f270974b = aVar;
        this.f270975c = new g.a<>(R.layout.development_item_list, new C34756a(hVar, locale, this));
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<InterfaceC34761f, DevelopmentItem> a() {
        return this.f270973a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<C34762g> b() {
        return this.f270975c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof DevelopmentItem) {
            DevelopmentItem developmentItem = (DevelopmentItem) aVar;
            if (developmentItem.f270900i == SerpViewType.f268582b && developmentItem.f270901j.isList()) {
                return true;
            }
        }
        return false;
    }
}
