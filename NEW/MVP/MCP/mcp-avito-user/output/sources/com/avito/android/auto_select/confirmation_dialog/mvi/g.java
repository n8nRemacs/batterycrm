package com.avito.android.auto_select.confirmation_dialog.mvi;

import com.avito.android.auto_select.confirmation_dialog.mvi.entity.AutoSelectConfirmationBottomSheetState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoSelectConfirmationBottomSheetFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f95910a;

    /* renamed from: b, reason: collision with root package name */
    public final b f95911b;

    /* renamed from: c, reason: collision with root package name */
    public final i f95912c;

    /* renamed from: d, reason: collision with root package name */
    public final k f95913d;

    public g(d dVar, b bVar, i iVar, k kVar) {
        this.f95910a = dVar;
        this.f95911b = bVar;
        this.f95912c = iVar;
        this.f95913d = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f95910a.get();
        this.f95911b.getClass();
        a aVar = new a();
        this.f95912c.getClass();
        h hVar = new h();
        this.f95913d.getClass();
        j jVar = new j();
        AutoSelectConfirmationBottomSheetState.f95903e.getClass();
        return new f("AutoSelectConfirmationBottomSheet", AutoSelectConfirmationBottomSheetState.f95904f, new e(cVar, aVar, jVar, hVar));
    }
}
