package Ld0;

import com.avito.android.publish.deeplink.IacForProInfoSheetShowDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PublishDeepLinkHandlerModule_MakeIacForProInfoSheetShowDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C14382a f10037a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.publish.deeplink.y f10038b;

    public i(C14382a c14382a, com.avito.android.publish.deeplink.y yVar) {
        this.f10037a = c14382a;
        this.f10038b = yVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.deeplink.y yVar = this.f10038b;
        this.f10037a.getClass();
        return new C43834a(IacForProInfoSheetShowDeeplink.class, null, new C43834a.b.C11809b(yVar));
    }
}
