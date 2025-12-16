package com.avito.android.location_list;

import com.avito.android.remote.model.Location;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class J implements l41.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f181869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P f181870c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f181871d;

    public /* synthetic */ J(P p12, Object obj, int i12) {
        this.f181869b = i12;
        this.f181870c = p12;
        this.f181871d = obj;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f181869b) {
            case 0:
                P p12 = this.f181870c;
                com.avito.android.geo_common.interactor.g gVar = p12.f181888a;
                String str = (String) this.f181871d;
                return p12.h(gVar.d(str).K(new L(p12, str)).d0(M.f181885b).x0(p12.f181891d.a()));
            case 1:
                P p13 = this.f181870c;
                return p13.h(p13.f181889b.b((String) this.f181871d).x0(p13.f181891d.a()));
            default:
                P p14 = this.f181870c;
                return p14.h(p14.f181888a.i(((Location) this.f181871d).getId()).x0(p14.f181891d.a()));
        }
    }
}
