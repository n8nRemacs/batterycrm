package com.avito.android.user_adverts.tab_screens.advert_list.progress;

import com.avito.android.user_adverts.tab_screens.advert_list.progress.d;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProgressOverlayItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f314760a;

    public f(u uVar) {
        this.f314760a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((d.a) this.f314760a.get());
    }
}
