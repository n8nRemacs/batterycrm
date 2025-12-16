package com.avito.android.fakedoor_dialog.mvi;

import com.avito.android.fakedoor_dialog.FakeDoorDialogParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FakeDoorDialogFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f155141a;

    /* renamed from: b, reason: collision with root package name */
    public final c f155142b;

    /* renamed from: c, reason: collision with root package name */
    public final j f155143c;

    /* renamed from: d, reason: collision with root package name */
    public final l f155144d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f155145e;

    public h(e eVar, c cVar, j jVar, l lVar, dagger.internal.l lVar2) {
        this.f155141a = eVar;
        this.f155142b = cVar;
        this.f155143c = jVar;
        this.f155144d = lVar;
        this.f155145e = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f155141a.get();
        b bVar = (b) this.f155142b.get();
        i iVar = (i) this.f155143c.get();
        this.f155144d.getClass();
        return new g("FakeDoorDialog", new mC.d(0, ((FakeDoorDialogParams) this.f155145e.f393949a).f155102d), new f(dVar, bVar, new k(), iVar));
    }
}
