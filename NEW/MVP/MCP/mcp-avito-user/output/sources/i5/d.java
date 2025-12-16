package I5;

import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;

/* compiled from: AdvertDetailsHotelOfferModule_ProvideHotelLocaleFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements dagger.internal.h<Locale> {

    /* renamed from: a, reason: collision with root package name */
    public final a f7934a;

    public d(a aVar) {
        this.f7934a = aVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f7934a.getClass();
        return new Locale("ru", "RU");
    }
}
