package com.avito.android.gig_shift_start.mvi;

import com.avito.android.gig_shift_start.ui.GigShiftStartOpenParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigShiftStartFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f160800a;

    /* renamed from: b, reason: collision with root package name */
    public final l f160801b;

    /* renamed from: c, reason: collision with root package name */
    public final n f160802c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f160803d;

    /* renamed from: e, reason: collision with root package name */
    public final EH.b f160804e;

    public h(e eVar, l lVar, n nVar, dagger.internal.l lVar2, EH.b bVar) {
        this.f160800a = eVar;
        this.f160801b = lVar;
        this.f160802c = nVar;
        this.f160803d = lVar2;
        this.f160804e = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f160800a.get();
        this.f160801b.getClass();
        k kVar = new k();
        m mVar = (m) this.f160802c.get();
        GigShiftStartOpenParams gigShiftStartOpenParams = (GigShiftStartOpenParams) this.f160803d.f393949a;
        EH.a aVar = (EH.a) this.f160804e.get();
        return new g("GigShiftStart", gigShiftStartOpenParams.f160838b != null ? new o(aVar.f3913g, aVar.f3914h, aVar.f3915i, null, false, 16, null) : new o(aVar.f3907a, aVar.f3908b, aVar.f3911e, aVar.f3912f, false, 16, null), new f(dVar, kVar, mVar));
    }
}
