package com.avito.android.extended_profile_selection_create.image;

import androidx.fragment.app.Fragment;
import com.avito.android.extended_profile_image_edit.t;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSetSelectionImageRouterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f151748a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<PhotoPickerIntentFactory> f151749b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<t> f151750c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<String> f151751d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f151752e;

    public k(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f151748a = lVar;
        this.f151749b = provider;
        this.f151750c = provider2;
        this.f151751d = provider3;
        this.f151752e = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((Fragment) this.f151748a.f393949a, this.f151749b.get(), this.f151750c.get(), this.f151751d.get(), (Y41.l) this.f151752e.f393949a);
    }
}
