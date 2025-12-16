package com.avito.android.extended_profile_universal_widget_edit.edit_block;

import androidx.fragment.app.Fragment;
import com.avito.android.extended_profile_image_edit.t;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalWidgetImageRouterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f154120a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<PhotoPickerIntentFactory> f154121b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<t> f154122c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<String> f154123d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f154124e;

    public q(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f154120a = lVar;
        this.f154121b = provider;
        this.f154122c = provider2;
        this.f154123d = provider3;
        this.f154124e = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new p((Fragment) this.f154120a.f393949a, this.f154121b.get(), this.f154122c.get(), this.f154123d.get(), (Y41.l) this.f154124e.f393949a);
    }
}
