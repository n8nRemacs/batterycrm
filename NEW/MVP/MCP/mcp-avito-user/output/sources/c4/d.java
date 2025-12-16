package C4;

import com.avito.android.advert.item.similars.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsGapItemFactoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<j> f1905a;

    public d(Provider<j> provider) {
        this.f1905a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f1905a.get());
    }
}
