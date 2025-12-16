package com.avito.android.extended_profile_widgets.adapter.categorizer;

import TV0.g;
import Y61.k;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import xB.C49807a;
import xB.C49808b;

/* compiled from: CategorizerItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/categorizer/b;", "LTV0/b;", "Lcom/avito/android/extended_profile_widgets/adapter/categorizer/h;", "Lcom/avito/android/extended_profile_widgets/adapter/categorizer/CategorizerItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements TV0.b<h, CategorizerItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f154333a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C49808b f154334b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f154335c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<i> f154336d = new g.a<>(R.layout.extended_profile_categorizer_item, new a(this));

    @Inject
    public b(@k d dVar, @C49807a.b @k C49808b c49808b, @C49807a.b @k com.avito.konveyor.a aVar) {
        this.f154333a = dVar;
        this.f154334b = c49808b;
        this.f154335c = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f154333a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f154336d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof CategorizerItem;
    }
}
