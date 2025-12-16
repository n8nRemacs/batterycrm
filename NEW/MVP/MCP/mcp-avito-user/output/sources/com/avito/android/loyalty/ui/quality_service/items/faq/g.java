package com.avito.android.loyalty.ui.quality_service.items.faq;

import com.avito.android.deep_linking.links.w;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import mX.InterfaceC44026a;

/* compiled from: FaqItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f183862a;

    /* renamed from: b, reason: collision with root package name */
    public final l f183863b;

    public g(l lVar, l lVar2) {
        this.f183862a = lVar;
        this.f183863b = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((w) this.f183862a.f393949a, (InterfaceC44026a) this.f183863b.f393949a);
    }
}
