package com.avito.android.location_picker.view.publish;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.location_picker.K0;
import com.avito.android.location_picker.N0;
import com.avito.android.location_picker.providers.z;
import com.avito.android.location_picker.view.LocationPickerChooseButtonLocation;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishLocationPickerView_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f182767a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f182768b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f182769c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f182770d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f182771e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f182772f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f182773g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<AvitoMapAttachHelper> f182774h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f182775i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<z> f182776j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.l f182777k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<K0> f182778l;

    /* renamed from: m, reason: collision with root package name */
    public final dagger.internal.l f182779m;

    public m(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, dagger.internal.l lVar5, dagger.internal.l lVar6, dagger.internal.l lVar7, Provider provider, dagger.internal.l lVar8, Provider provider2, dagger.internal.l lVar9, Provider provider3, dagger.internal.l lVar10) {
        this.f182767a = lVar;
        this.f182768b = lVar2;
        this.f182769c = lVar3;
        this.f182770d = lVar4;
        this.f182771e = lVar5;
        this.f182772f = lVar6;
        this.f182773g = lVar7;
        this.f182774h = provider;
        this.f182775i = lVar8;
        this.f182776j = provider2;
        this.f182777k = lVar9;
        this.f182778l = provider3;
        this.f182779m = lVar10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((View) this.f182767a.f393949a, (Fragment) this.f182768b.f393949a, (N0) this.f182769c.f393949a, ((Boolean) this.f182770d.f393949a).booleanValue(), ((Boolean) this.f182771e.f393949a).booleanValue(), (com.avito.android.location_picker.job.f) this.f182772f.f393949a, (LocationPickerChooseButtonLocation) this.f182773g.f393949a, this.f182774h.get(), (AvitoMapTarget) this.f182775i.f393949a, this.f182776j.get(), ((Boolean) this.f182777k.f393949a).booleanValue(), this.f182778l.get(), (String) this.f182779m.f393949a);
    }
}
