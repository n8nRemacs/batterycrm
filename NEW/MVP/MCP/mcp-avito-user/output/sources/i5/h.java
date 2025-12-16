package I5;

import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import dagger.internal.x;
import dagger.internal.y;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertDetailsHotelOfferModule_ProvideHotelParamsFormatterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<SimpleDateFormat> {

    /* renamed from: a, reason: collision with root package name */
    public final a f7942a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Locale> f7943b;

    public h(a aVar, Provider<Locale> provider) {
        this.f7942a = aVar;
        this.f7943b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Locale locale = this.f7943b.get();
        this.f7942a.getClass();
        return new SimpleDateFormat(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, locale);
    }
}
