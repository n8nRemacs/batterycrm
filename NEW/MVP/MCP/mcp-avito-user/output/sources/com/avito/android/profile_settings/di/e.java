package com.avito.android.profile_settings.di;

import com.avito.android.R;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileSettingsModule_ProvideFragmentContainerIdFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<Integer> {

    /* compiled from: ProfileSettingsModule_ProvideFragmentContainerIdFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f228426a = new e();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c.f228422a.getClass();
        return Integer.valueOf(R.id.profile_settings_root);
    }
}
