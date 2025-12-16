package com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card;

import TV0.g;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: TariffCptConfigureLevelsCardBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/ui/items/level_cards/level_card/b;", "LTV0/b;", "Lcom/avito/android/tariff_cpt/configure/levels/ui/items/level_cards/level_card/d;", "Lcom/avito/android/tariff_cpt/configure/levels/ui/items/level_cards/level_card/c;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements TV0.b<d, c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final i f297963a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<e> f297964b;

    public b(@k i iVar, @k com.avito.android.util.text.a aVar) {
        this.f297963a = iVar;
        this.f297964b = new g.a<>(R.layout.tariff_cpt_configure_levels_card_layout, new a(aVar));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f297963a;
    }

    @Override // TV0.b
    @k
    public final g.a<e> b() {
        return this.f297964b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof c;
    }
}
