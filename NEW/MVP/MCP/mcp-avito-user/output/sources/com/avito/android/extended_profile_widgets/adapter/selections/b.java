package com.avito.android.extended_profile_widgets.adapter.selections;

import TV0.g;
import Y61.k;
import ZB.a;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SelectionsItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/selections/b;", "LTV0/b;", "Lcom/avito/android/extended_profile_widgets/adapter/selections/h;", "Lcom/avito/android/extended_profile_widgets/adapter/selections/SelectionsItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements TV0.b<h, SelectionsItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f154899a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ZB.b f154900b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f154901c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<i> f154902d = new g.a<>(R.layout.extended_profile_selections_item, new a(this));

    @Inject
    public b(@k d dVar, @k @a.b ZB.b bVar, @k @a.b com.avito.konveyor.a aVar) {
        this.f154899a = dVar;
        this.f154900b = bVar;
        this.f154901c = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f154899a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f154902d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof SelectionsItem;
    }
}
