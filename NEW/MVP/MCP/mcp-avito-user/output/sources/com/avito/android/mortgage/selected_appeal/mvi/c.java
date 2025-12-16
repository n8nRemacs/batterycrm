package com.avito.android.mortgage.selected_appeal.mvi;

import dagger.internal.x;
import dagger.internal.y;
import i10.C41210c;
import i10.InterfaceC41208a;

/* compiled from: SelectedAppealActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.selected_appeal.mvi.domain.b f203458a;

    /* renamed from: b, reason: collision with root package name */
    public final C41210c f203459b;

    public c(com.avito.android.mortgage.selected_appeal.mvi.domain.b bVar, C41210c c41210c) {
        this.f203458a = bVar;
        this.f203459b = c41210c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.mortgage.selected_appeal.mvi.domain.a) this.f203458a.get(), (InterfaceC41208a) this.f203459b.get());
    }
}
