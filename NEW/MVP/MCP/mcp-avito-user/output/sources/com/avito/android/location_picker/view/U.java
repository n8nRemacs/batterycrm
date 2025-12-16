package com.avito.android.location_picker.view;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.location_picker.K0;
import com.avito.android.location_picker.N0;
import javax.inject.Provider;

/* compiled from: LocationPickerViewImplRedesign_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class U implements dagger.internal.h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f182532a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f182533b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f182534c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f182535d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f182536e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f182537f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f182538g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<AvitoMapAttachHelper> f182539h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f182540i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.location_picker.providers.z> f182541j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.l f182542k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<K0> f182543l;

    /* renamed from: m, reason: collision with root package name */
    public final dagger.internal.l f182544m;

    public U(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, dagger.internal.l lVar5, dagger.internal.l lVar6, dagger.internal.l lVar7, Provider provider, dagger.internal.l lVar8, Provider provider2, dagger.internal.l lVar9, Provider provider3, dagger.internal.l lVar10) {
        this.f182532a = lVar;
        this.f182533b = lVar2;
        this.f182534c = lVar3;
        this.f182535d = lVar4;
        this.f182536e = lVar5;
        this.f182537f = lVar6;
        this.f182538g = lVar7;
        this.f182539h = provider;
        this.f182540i = lVar8;
        this.f182541j = provider2;
        this.f182542k = lVar9;
        this.f182543l = provider3;
        this.f182544m = lVar10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new T((View) this.f182532a.f393949a, (Fragment) this.f182533b.f393949a, (N0) this.f182534c.f393949a, ((Boolean) this.f182535d.f393949a).booleanValue(), ((Boolean) this.f182536e.f393949a).booleanValue(), (com.avito.android.location_picker.job.f) this.f182537f.f393949a, (LocationPickerChooseButtonLocation) this.f182538g.f393949a, this.f182539h.get(), (AvitoMapTarget) this.f182540i.f393949a, this.f182541j.get(), ((Boolean) this.f182542k.f393949a).booleanValue(), this.f182543l.get(), (String) this.f182544m.f393949a);
    }
}
