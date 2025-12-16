package ty0;

import com.avito.android.deep_linking.links.CalendarLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CalendarLinkHandlerModule_ProvideCalendarLinkHandlerFactory.java */
@e
@y
@x
/* renamed from: ty0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48741b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.str_calendar.common.domain.b f439697a;

    public C48741b(com.avito.android.str_calendar.common.domain.b bVar) {
        this.f439697a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.str_calendar.common.domain.b bVar = this.f439697a;
        C48740a.f439696a.getClass();
        return new C43834a(CalendarLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CalendarLink.class), bVar));
    }
}
