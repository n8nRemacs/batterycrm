package I5;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: AdvertDetailsHotelOfferModule_ProvideHotelFilterFormatterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<SimpleDateFormat> {

    /* renamed from: a, reason: collision with root package name */
    public final a f7930a;

    /* renamed from: b, reason: collision with root package name */
    public final u f7931b;

    public b(a aVar, u uVar) {
        this.f7930a = aVar;
        this.f7931b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Locale locale = (Locale) this.f7931b.get();
        this.f7930a.getClass();
        return new SimpleDateFormat("dd MMM", locale);
    }
}
