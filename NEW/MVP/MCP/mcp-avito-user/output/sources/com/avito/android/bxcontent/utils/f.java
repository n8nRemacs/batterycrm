package com.avito.android.bxcontent.utils;

import android.content.res.Resources;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.util.Kundle;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BxContentPaddingStatePresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f113033a;

    /* renamed from: b, reason: collision with root package name */
    public final l f113034b;

    /* renamed from: c, reason: collision with root package name */
    public final l f113035c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.floating_views.f> f113036d;

    public f(l lVar, l lVar2, l lVar3, Provider provider) {
        this.f113033a = lVar;
        this.f113034b = lVar2;
        this.f113035c = lVar3;
        this.f113036d = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Kundle) this.f113033a.f393949a, (Resources) this.f113034b.f393949a, (PresentationType) this.f113035c.f393949a, this.f113036d.get());
    }
}
