package Dp;

import Ip.C14141a;
import com.avito.android.P;
import com.avito.android.util.C;
import com.avito.android.util.C35793f6;
import com.avito.android.util.C35801g6;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DealItemListBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<C13430c> {

    /* renamed from: a, reason: collision with root package name */
    public final C35801g6 f3465a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C14141a> f3466b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C> f3467c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<P> f3468d;

    public d(C35801g6 c35801g6, Provider provider, Provider provider2, Provider provider3) {
        this.f3465a = c35801g6;
        this.f3466b = provider;
        this.f3467c = provider2;
        this.f3468d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f3465a.getClass();
        return new C13430c(new C35793f6(), this.f3466b.get(), this.f3467c.get(), this.f3468d.get());
    }
}
