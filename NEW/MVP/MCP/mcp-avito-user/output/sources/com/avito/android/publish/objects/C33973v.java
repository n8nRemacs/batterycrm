package com.avito.android.publish.objects;

import androidx.fragment.app.FragmentManager;
import com.avito.android.Q1;
import javax.inject.Provider;

/* compiled from: ObjectFillFormRouterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.objects.v, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33973v implements dagger.internal.h<C33972u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<FragmentManager> f238104a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Q1> f238105b;

    public C33973v(Provider<FragmentManager> provider, Provider<Q1> provider2) {
        this.f238104a = provider;
        this.f238105b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33972u(this.f238104a.get(), this.f238105b.get());
    }
}
