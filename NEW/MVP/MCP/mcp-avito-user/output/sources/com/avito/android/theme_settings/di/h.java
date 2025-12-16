package com.avito.android.theme_settings.di;

import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.e1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ThemeSettingsModule_ProvideSpanLookup$_avito_settings_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<GridLayoutManager.c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f301332a;

    public h(u uVar) {
        this.f301332a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y0 y02 = (Y0) this.f301332a.get();
        int i12 = d.f301328a;
        return new e1(y02);
    }
}
