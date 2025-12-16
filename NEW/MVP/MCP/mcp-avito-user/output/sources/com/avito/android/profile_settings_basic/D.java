package com.avito.android.profile_settings_basic;

import androidx.fragment.app.Fragment;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import javax.inject.Provider;

/* compiled from: BasicProfileSettingsRouterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f228538a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<PhotoPickerIntentFactory> f228539b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<String> f228540c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f228541d;

    public D(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2) {
        this.f228538a = lVar;
        this.f228539b = provider;
        this.f228540c = provider2;
        this.f228541d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C((Y41.l) this.f228541d.f393949a, (Fragment) this.f228538a.f393949a, this.f228539b.get(), this.f228540c.get());
    }
}
