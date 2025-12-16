package com.avito.android.authorization.gorelkin.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ParsingPermissionModule_ProvideResourcesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements h<Resources> {

    /* renamed from: a, reason: collision with root package name */
    public final l f93916a;

    public e(l lVar) {
        this.f93916a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f93916a.f393949a;
        d.f93915a.getClass();
        return fragment.getResources();
    }
}
