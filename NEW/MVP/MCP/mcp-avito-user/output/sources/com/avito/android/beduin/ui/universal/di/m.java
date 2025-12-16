package com.avito.android.beduin.ui.universal.di;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.UniversalBeduinScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalBeduinFragmentTrackerModule_ProvideScreenFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class m implements dagger.internal.h<Screen> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f104482a;

    public m(dagger.internal.l lVar) {
        this.f104482a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f104482a.f393949a;
        k.f104479a.getClass();
        if (str != null) {
            return new UniversalBeduinScreen(str);
        }
        return null;
    }
}
