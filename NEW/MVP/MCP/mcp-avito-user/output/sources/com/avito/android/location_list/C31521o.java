package com.avito.android.location_list;

import kotlin.Metadata;

/* compiled from: LocationItemSingleLinePresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_list/o;", "Lcom/avito/android/location_list/m;", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.location_list.o, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31521o implements InterfaceC31519m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<? extends m0> f182078b;

    public C31521o(@Y61.k h31.e<? extends m0> eVar) {
        this.f182078b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        r rVar = (r) eVar;
        C31518l c31518l = (C31518l) aVar;
        rVar.setTitle(c31518l.f182070c);
        rVar.setChecked(c31518l.f182072e);
        rVar.J0(new C31520n(this, c31518l));
    }
}
