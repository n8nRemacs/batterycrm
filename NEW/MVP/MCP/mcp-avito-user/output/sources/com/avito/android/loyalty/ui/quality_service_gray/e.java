package com.avito.android.loyalty.ui.quality_service_gray;

import com.avito.android.deep_linking.links.w;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: QualityServiceGrayConverter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f184055a;

    /* renamed from: b, reason: collision with root package name */
    public final l f184056b;

    public e(l lVar, l lVar2) {
        this.f184055a = lVar;
        this.f184056b = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((w) this.f184055a.f393949a, (com.avito.android.deep_linking.links.x) this.f184056b.f393949a);
    }
}
