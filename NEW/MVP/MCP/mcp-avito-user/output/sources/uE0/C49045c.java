package ue0;

import android.content.res.Resources;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.util.C35876q3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: SelectPriceListItemConverterImpl_Factory.java */
@e
@y
@x
/* renamed from: ue0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C49045c implements h<C49044b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.price_list.domain.c> f440209a;

    /* renamed from: b, reason: collision with root package name */
    public final u f440210b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Resources> f440211c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<l<SimpleTestGroupWithNone>> f440212d;

    public C49045c(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f440209a = provider;
        this.f440210b = uVar;
        this.f440211c = provider2;
        this.f440212d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C49044b(this.f440209a.get(), (C35876q3) this.f440210b.get(), this.f440211c.get(), this.f440212d.get());
    }
}
