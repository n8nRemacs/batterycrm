package com.avito.android.location_list;

import kotlin.Metadata;

/* compiled from: LocationItemTwoLinesPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_list/u;", "Lcom/avito/android/location_list/s;", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.location_list.u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31526u implements InterfaceC31524s {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<? extends m0> f182084b;

    public C31526u(@Y61.k h31.e<? extends m0> eVar) {
        this.f182084b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        InterfaceC31529x interfaceC31529x = (InterfaceC31529x) eVar;
        C31518l c31518l = (C31518l) aVar;
        interfaceC31529x.setTitle(c31518l.f182070c);
        interfaceC31529x.f(c31518l.f182071d);
        interfaceC31529x.setChecked(c31518l.f182072e);
        interfaceC31529x.J0(new C31525t(this, c31518l));
    }
}
