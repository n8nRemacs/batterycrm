package HN;

import com.avito.android.inline_filters.calendar.FiltersCalendarPickerConfig;
import com.avito.android.inline_filters.calendar.SelectedDateRange;
import com.avito.android.inline_filters.dialog.calendar.models.CalendarPickerConstraints;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RestrictionsDataSourceProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f7070a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<CalendarPickerConstraints> f7071b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f7072c;

    public m(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f7070a = lVar;
        this.f7071b = provider;
        this.f7072c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((SelectedDateRange) this.f7070a.f393949a, this.f7071b.get(), (FiltersCalendarPickerConfig) this.f7072c.f393949a);
    }
}
