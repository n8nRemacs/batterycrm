package fY;

import android.content.res.Resources;
import com.avito.android.U0;
import com.avito.android.bxcontent.di.module.K;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SerpListResourcesProviderImpl_Factory.java */
@e
@y
@x
/* renamed from: fY.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40374c implements h<C40373b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f395909a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<U0> f395910b;

    /* renamed from: c, reason: collision with root package name */
    public final K f395911c;

    public C40374c(l lVar, Provider provider, K k12) {
        this.f395909a = lVar;
        this.f395910b = provider;
        this.f395911c = k12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f395909a.f393949a;
        this.f395910b.get();
        return new C40373b(resources, ((Integer) this.f395911c.get()).intValue());
    }
}
