package com.avito.android.advertising.adapter.items.buzzoola.premium_v2.title;

import TV0.g;
import Y61.k;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: BuzzoolaPremiumV2TitleItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/premium_v2/title/c;", "LTV0/b;", "Lcom/avito/android/advertising/ui/buzzoola/premium_v2/a;", "Lcom/avito/android/advertising/adapter/items/buzzoola/premium_v2/title/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements TV0.b<com.avito.android.advertising.ui.buzzoola.premium_v2.a, a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f87496a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f87497b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f87498c = new g.a<>(R.layout.buzzoola_premium_title_card, new b(this));

    public c(@k f fVar, boolean z12) {
        this.f87496a = fVar;
        this.f87497b = z12;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87496a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f87498c;
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
