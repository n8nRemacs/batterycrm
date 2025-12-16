package com.avito.android.extended_profile_universal_widget_edit.edit.mvi;

import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalWidgetEditFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final c f153945a;

    /* renamed from: b, reason: collision with root package name */
    public final j f153946b;

    /* renamed from: c, reason: collision with root package name */
    public final o f153947c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f153948d;

    /* renamed from: e, reason: collision with root package name */
    public final e f153949e;

    public h(c cVar, j jVar, o oVar, dagger.internal.l lVar, e eVar) {
        this.f153945a = cVar;
        this.f153946b = jVar;
        this.f153947c = oVar;
        this.f153948d = lVar;
        this.f153949e = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f153945a.get();
        this.f153946b.getClass();
        i iVar = new i();
        n nVar = (n) this.f153947c.get();
        UniversalWidgetEditArguments universalWidgetEditArguments = (UniversalWidgetEditArguments) this.f153948d.f393949a;
        this.f153949e.getClass();
        return new g("UniversalWidgetEdit", new jB.d(false, null, universalWidgetEditArguments.f153654d, universalWidgetEditArguments.f153655e, null, null, null, null, null, 499, null), new f(new d(), aVar, nVar, iVar));
    }
}
