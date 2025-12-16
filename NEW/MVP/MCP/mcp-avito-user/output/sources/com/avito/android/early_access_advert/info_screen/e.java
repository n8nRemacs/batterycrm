package com.avito.android.early_access_advert.info_screen;

import com.avito.android.early_access_advert.info_screen.mvi.f;
import com.avito.android.early_access_advert.info_screen.mvi.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EarlyAccessAdvertInfoViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final g f145726a;

    public e(g gVar) {
        this.f145726a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((f) this.f145726a.get(), null, 2, null);
    }
}
