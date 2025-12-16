package com.avito.android.serp.adapter;

import TV0.g;
import com.avito.android.R;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: RdsAdvertGridItemBlueprint.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/m0;", "LTV0/b;", "Lcom/avito/android/serp/adapter/t0;", "Lcom/avito/android/serp/adapter/AdvertItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34746m0 implements TV0.b<InterfaceC34860t0, AdvertItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34748n0 f270282a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<C34862u0> f270283b;

    public C34746m0(@Y61.k InterfaceC34748n0 interfaceC34748n0, @Y61.k com.avito.android.server_time.h hVar, @Y61.k Locale locale, @Y61.k com.avito.android.connection_quality.connectivity.a aVar) {
        this.f270282a = interfaceC34748n0;
        this.f270283b = new g.a<>(R.layout.rds_advert_item_grid, new C34744l0(hVar, locale, aVar));
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<InterfaceC34860t0, AdvertItem> a() {
        return this.f270282a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<C34862u0> b() {
        return this.f270283b;
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
            if (advertItem.f268374D == SerpViewType.f268583c && !advertItem.f268405S0) {
                return true;
            }
        }
        return false;
    }
}
