package com.avito.android.serp.adapter;

import TV0.g;
import com.avito.android.R;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: AdvertItemListBlueprint.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/s;", "LTV0/b;", "Lcom/avito/android/serp/adapter/E;", "Lcom/avito/android/serp/adapter/AdvertItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34820s implements TV0.b<E, AdvertItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34901y f271465a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f271466b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<F> f271467c;

    public C34820s(@Y61.k InterfaceC34901y interfaceC34901y, @Y61.k com.avito.android.server_time.h hVar, @Y61.k Locale locale, @Y61.k com.avito.android.connection_quality.connectivity.a aVar) {
        this.f271465a = interfaceC34901y;
        this.f271466b = aVar;
        this.f271467c = new g.a<>(R.layout.advert_item_list, new r(hVar, locale, this));
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<E, AdvertItem> a() {
        return this.f271465a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<F> b() {
        return this.f271467c;
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
            if (advertItem.f268374D == SerpViewType.f268582b && advertItem.f268378F.isList() && advertItem.f268469w0 == null) {
                return true;
            }
        }
        return false;
    }
}
