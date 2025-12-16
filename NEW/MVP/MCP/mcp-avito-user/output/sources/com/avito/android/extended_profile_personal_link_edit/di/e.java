package com.avito.android.extended_profile_personal_link_edit.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PersonalLinkEditModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f151490a;

    /* renamed from: b, reason: collision with root package name */
    public final l f151491b;

    public e(l lVar, l lVar2) {
        this.f151490a = lVar;
        this.f151491b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Screen screen = (Screen) this.f151490a.f393949a;
        r rVar = (r) this.f151491b.f393949a;
        d.f151489a.getClass();
        return new C28478k(screen, rVar, null, 4, null);
    }
}
