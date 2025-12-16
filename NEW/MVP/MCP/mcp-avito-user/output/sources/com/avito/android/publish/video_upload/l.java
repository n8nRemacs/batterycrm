package com.avito.android.publish.video_upload;

import androidx.fragment.app.Fragment;
import androidx.view.P0;

/* compiled from: VideoUploadModule_ProvideHistoricalSuggestViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final k f245552a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f245553b;

    /* renamed from: c, reason: collision with root package name */
    public final A f245554c;

    public l(k kVar, dagger.internal.l lVar, A a12) {
        this.f245552a = kVar;
        this.f245553b = lVar;
        this.f245554c = a12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f245553b.f393949a;
        z zVar = (z) this.f245554c.get();
        this.f245552a.getClass();
        return (s) new P0(fragment, zVar).a(s.class);
    }
}
