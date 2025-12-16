package com.avito.android.extended_profile_universal_widget_edit.edit_block.mvi;

import com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalWidgetEditBlockFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final e f154101a;

    /* renamed from: b, reason: collision with root package name */
    public final l f154102b;

    /* renamed from: c, reason: collision with root package name */
    public final n f154103c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f154104d;

    /* renamed from: e, reason: collision with root package name */
    public final g f154105e;

    public j(e eVar, l lVar, n nVar, dagger.internal.l lVar2, g gVar) {
        this.f154101a = eVar;
        this.f154102b = lVar;
        this.f154103c = nVar;
        this.f154104d = lVar2;
        this.f154105e = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f154101a.get();
        this.f154102b.getClass();
        k kVar = new k();
        m mVar = (m) this.f154103c.get();
        UniversalWidgetEditBlockArguments universalWidgetEditBlockArguments = (UniversalWidgetEditBlockArguments) this.f154104d.f393949a;
        this.f154105e.getClass();
        return new i("UniversalWidgetEditBlock", new kB.d(universalWidgetEditBlockArguments.f153962b.c().get(universalWidgetEditBlockArguments.f153963c), null, null, null, null, null, null, null, null, null, 1022, null), new h(new f(), dVar, mVar, kVar));
    }
}
