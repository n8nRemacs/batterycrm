package com.avito.android.support_bottom_sheet.mvi;

import dagger.internal.x;
import dagger.internal.y;
import xA0.C49806d;

/* compiled from: SupportDialogFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f292485a;

    /* renamed from: b, reason: collision with root package name */
    public final k f292486b;

    /* renamed from: c, reason: collision with root package name */
    public final m f292487c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f292488d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f292489e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f292490f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f292491g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f292492h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f292493i;

    public i(f fVar, k kVar, m mVar, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, dagger.internal.l lVar5, dagger.internal.l lVar6) {
        this.f292485a = fVar;
        this.f292486b = kVar;
        this.f292487c = mVar;
        this.f292488d = lVar;
        this.f292489e = lVar2;
        this.f292490f = lVar3;
        this.f292491g = lVar4;
        this.f292492h = lVar5;
        this.f292493i = lVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f292485a.get();
        this.f292486b.getClass();
        j jVar = new j();
        this.f292487c.getClass();
        l lVar = new l();
        String str = (String) this.f292488d.f393949a;
        String str2 = (String) this.f292489e.f393949a;
        String str3 = (String) this.f292490f.f393949a;
        String str4 = (String) this.f292491g.f393949a;
        return new h("SupportDialogBottomSheet", new C49806d(new UU.a(str, str2, false, false, false, (Y41.a) this.f292492h.f393949a, null, null, null, false, 988, null), new UU.a(str3, str4, false, false, false, (Y41.a) this.f292493i.f393949a, null, null, null, false, 988, null)), new g(eVar, jVar, lVar));
    }
}
