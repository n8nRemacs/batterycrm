package com.avito.android.gig_motivations_list.ui;

import com.avito.android.gig_motivations_list.ui.mvi.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MotivationsListViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.gig_motivations_list.ui.mvi.h f160351a;

    public f(com.avito.android.gig_motivations_list.ui.mvi.h hVar) {
        this.f160351a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((g) this.f160351a.get(), null, 2, null);
    }
}
