package com.avito.android.profile_settings_extended.di;

import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.promoblock.m;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileSettingsModule_ProvidesPromoBlockSettingsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final l f230250a;

    public g(l lVar) {
        this.f230250a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f230250a.f393949a;
        c.f230246a.getClass();
        return new m(y6.b(20), y6.b(5), Integer.valueOf(C35835l0.j(R.attr.white, fragment.requireContext())));
    }
}
