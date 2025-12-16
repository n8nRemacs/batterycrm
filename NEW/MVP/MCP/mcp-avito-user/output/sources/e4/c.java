package E4;

import com.avito.android.util.C35794g;
import com.avito.android.util.C35802h;
import com.avito.android.util.C35842m;
import com.avito.android.util.C35850n;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsShortTermRentItemDiscountItemFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f3728a;

    /* renamed from: b, reason: collision with root package name */
    public final C35802h f3729b;

    /* renamed from: c, reason: collision with root package name */
    public final C35850n f3730c;

    public c(Provider provider, C35802h c35802h, C35850n c35850n) {
        this.f3728a = provider;
        this.f3729b = c35802h;
        this.f3730c = c35850n;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f3728a.get(), (C35794g) this.f3729b.get(), (C35842m) this.f3730c.get());
    }
}
