package com.avito.android.publish.di;

import androidx.view.P0;
import com.avito.android.publish.C0;
import com.avito.android.publish.L0;
import com.avito.android.publish.M0;
import com.avito.android.publish.PublishActivity;

/* compiled from: PublishModule_ProvidePublishViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class A implements dagger.internal.h<C0> {

    /* renamed from: a, reason: collision with root package name */
    public final C33824o f235117a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f235118b;

    /* renamed from: c, reason: collision with root package name */
    public final M0 f235119c;

    public A(C33824o c33824o, dagger.internal.l lVar, M0 m02) {
        this.f235117a = c33824o;
        this.f235118b = lVar;
        this.f235119c = m02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        PublishActivity publishActivity = (PublishActivity) this.f235118b.f393949a;
        L0 l02 = (L0) this.f235119c.get();
        this.f235117a.getClass();
        return (C0) new P0(publishActivity, l02).a(C0.class);
    }
}
