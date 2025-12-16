package com.avito.android.loyalty.ui.quality_service.items.effects;

import TV0.g;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.loyalty.di.quality_service.j;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EffectsItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/effects/c;", "LTV0/b;", "Lcom/avito/android/loyalty/ui/quality_service/items/effects/i;", "Lcom/avito/android/loyalty/ui/quality_service/items/effects/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements TV0.b<i, a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f183833a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final j f183834b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<i> f183835c = new g.a<>(R.layout.item_effects, new b(this));

    @Inject
    public c(@k e eVar, @k j jVar) {
        this.f183833a = eVar;
        this.f183834b = jVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f183833a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f183835c;
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
