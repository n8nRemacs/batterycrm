package com.avito.android.beduin.common.component.photo_picker;

import Ui.InterfaceC15523b;
import android.content.res.Resources;

/* compiled from: BeduinPhotoPickerModelPreparer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final v f102033a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f102034b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.beduin.context.di.e f102035c;

    public n(v vVar, dagger.internal.f fVar, com.avito.android.beduin.context.di.e eVar) {
        this.f102033a = vVar;
        this.f102034b = fVar;
        this.f102035c = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((s) this.f102033a.get(), (InterfaceC15523b) this.f102034b.get(), (Resources) this.f102035c.get());
    }
}
