package com.avito.android.advertising.adapter.items.buzzoola.premium.legal;

import TV0.g;
import Y61.k;
import com.avito.android.R;
import com.avito.android.advertising.ui.buzzoola.premium.n;
import kotlin.Metadata;

/* compiled from: BuzzoolaPremiumLegalItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/premium/legal/c;", "LTV0/b;", "Lcom/avito/android/advertising/ui/buzzoola/premium/n;", "Lcom/avito/android/advertising/adapter/items/buzzoola/premium/legal/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements TV0.b<n, a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f87433a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f87434b;

    public c(@k e eVar, boolean z12) {
        this.f87433a = eVar;
        this.f87434b = new g.a<>(z12 ? R.layout.buzzoola_premium_legal_v2_card : R.layout.buzzoola_premium_legal_card, b.f87432l);
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87433a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f87434b;
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
