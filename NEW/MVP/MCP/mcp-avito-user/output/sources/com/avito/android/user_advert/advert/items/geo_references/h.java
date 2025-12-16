package com.avito.android.user_advert.advert.items.geo_references;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import os0.f;

/* compiled from: GeoReferenceItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/geo_references/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/geo_references/g;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewGroup f309456b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final os0.g f309457c;

    public h(@k View view) {
        super(view);
        ViewGroup viewGroup = (ViewGroup) view;
        this.f309456b = viewGroup;
        this.f309457c = new os0.g(viewGroup, false, 2, null);
    }

    @Override // com.avito.android.user_advert.advert.items.geo_references.g
    public final void Jy(@l String str, @l String str2, @k List list) {
        this.f309456b.removeAllViews();
        f.a.a(this.f309457c, list, str, str2, null, 24);
    }
}
