package JN;

import com.avito.android.inline_filters.calendar.deeplink.FiltersCalendarPickerDeepLink;
import com.avito.android.inline_filters.dialog.calendar.deeplink.c;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: FiltersCalendarPickerDeepLinkModule_ProvideFiltersCalendarPickerMappingFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f8930a;

    public b(c cVar) {
        this.f8930a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = this.f8930a;
        a.f8929a.getClass();
        return new C43834a(FiltersCalendarPickerDeepLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(FiltersCalendarPickerDeepLink.class), cVar));
    }
}
