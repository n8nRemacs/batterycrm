package com.avito.android.location_list;

import TV0.g;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: LocationItemTwoLinesRadioButtonBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/location_list/w;", "LTV0/b;", "Lcom/avito/android/location_list/x;", "Lcom/avito/android/location_list/l;", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.location_list.w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31528w implements TV0.b<InterfaceC31529x, C31518l> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C31526u f182086a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<n0> f182087b = new g.a<>(R.layout.radio_item, C31527v.f182085l);

    public C31528w(@Y61.k C31526u c31526u) {
        this.f182086a = c31526u;
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<InterfaceC31529x, C31518l> a() {
        return this.f182086a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<n0> b() {
        return this.f182087b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof C31518l) && ((C31518l) aVar).f182073f;
    }
}
