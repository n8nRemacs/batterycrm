package com.avito.android.profile_settings.di;

import android.content.res.Resources;
import com.avito.android.R;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileSettingsModule_ProvideIsTabletFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final l f228427a;

    public f(l lVar) {
        this.f228427a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f228427a.f393949a;
        c.f228422a.getClass();
        return Boolean.valueOf(resources.getBoolean(R.bool.is_tablet));
    }
}
