package com.avito.android.horizontal_list;

import TV0.g;
import Y61.k;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: HorizontalListWidgetItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/horizontal_list/c;", "LTV0/b;", "Lcom/avito/android/horizontal_list/f;", "Lcom/avito/android/horizontal_list/HorizontalListWidgetItem;", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements TV0.b<f, HorizontalListWidgetItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f162562a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f162563b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f162564c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<h> f162565d = new g.a<>(R.layout.serp_horizontal_list_widget_item, new b(this));

    public c(@k e eVar, @k com.avito.konveyor.a aVar, @k com.avito.konveyor.adapter.h hVar) {
        this.f162562a = eVar;
        this.f162563b = aVar;
        this.f162564c = hVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f162562a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f162565d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof HorizontalListWidgetItem;
    }
}
