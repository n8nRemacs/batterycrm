package com.avito.android.loyalty.ui.quality_service.items.grade_info;

import com.avito.android.deep_linking.links.w;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GradeInfoItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f183906a;

    /* renamed from: b, reason: collision with root package name */
    public final l f183907b;

    public g(l lVar, l lVar2) {
        this.f183906a = lVar;
        this.f183907b = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((w) this.f183906a.f393949a, (a) this.f183907b.f393949a);
    }
}
