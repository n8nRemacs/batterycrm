package com.avito.android.user_advert.di;

import Tv0.C15416b;
import Tv0.InterfaceC15415a;
import android.content.res.Resources;
import com.avito.android.util.L0;

/* compiled from: BaseAdvertDetailsModule_ProvideSupportEmailResourceProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_advert.di.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35483j implements dagger.internal.h<InterfaceC15415a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f310910a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f310911b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f310912c;

    public C35483j(dagger.internal.l lVar, dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f310910a = lVar;
        this.f310911b = uVar;
        this.f310912c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f310910a.f393949a;
        L0 l02 = (L0) this.f310911b.get();
        l90.n nVar = (l90.n) this.f310912c.get();
        C35479f c35479f = C35479f.f310904a;
        return new C15416b(resources, nVar, l02.getF318655a());
    }
}
