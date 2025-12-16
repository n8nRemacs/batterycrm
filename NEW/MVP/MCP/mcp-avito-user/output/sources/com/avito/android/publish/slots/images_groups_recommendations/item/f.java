package com.avito.android.publish.slots.images_groups_recommendations.item;

import com.avito.android.Q1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImagesGroupsRecommendationsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f244219a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.publish.photo_picker.a> f244220b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.photo_list_view_groups.h> f244221c;

    /* renamed from: d, reason: collision with root package name */
    public final u f244222d;

    public f(u uVar, u uVar2, Provider provider, Provider provider2) {
        this.f244219a = uVar;
        this.f244220b = provider;
        this.f244221c = provider2;
        this.f244222d = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((g) this.f244219a.get(), this.f244220b.get(), this.f244221c.get(), (Q1) this.f244222d.get());
    }
}
