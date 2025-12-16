package com.avito.android.extended_profile.di;

import android.content.res.Resources;
import com.avito.android.R;

/* compiled from: ExtendedProfileModule_ProvideIsTabletFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class I implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f149533a;

    public I(dagger.internal.l lVar) {
        this.f149533a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f149533a.f393949a;
        r.f149945a.getClass();
        return Boolean.valueOf(resources.getBoolean(R.bool.is_tablet));
    }
}
