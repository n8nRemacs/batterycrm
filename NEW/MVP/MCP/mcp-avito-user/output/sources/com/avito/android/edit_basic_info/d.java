package com.avito.android.edit_basic_info;

import androidx.fragment.app.Fragment;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditBasicInfoAvatarPickerRouterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f146040a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<PhotoPickerIntentFactory> f146041b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f146042c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f146043d;

    public d(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.u uVar, Provider provider) {
        this.f146040a = lVar;
        this.f146041b = provider;
        this.f146042c = lVar2;
        this.f146043d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Y41.l) this.f146042c.f393949a, (Fragment) this.f146040a.f393949a, this.f146041b.get(), (String) this.f146043d.get());
    }
}
