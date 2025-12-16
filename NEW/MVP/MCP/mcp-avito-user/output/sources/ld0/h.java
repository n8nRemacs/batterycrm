package Ld0;

import com.avito.android.publish.deeplink.IacAnonymousInfoSheetShowDeeplink;
import com.avito.android.publish.deeplink.v;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PublishDeepLinkHandlerModule_MakeIacAnonymousInfoSheetShowDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C14382a f10035a;

    /* renamed from: b, reason: collision with root package name */
    public final v f10036b;

    public h(C14382a c14382a, v vVar) {
        this.f10035a = c14382a;
        this.f10036b = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        v vVar = this.f10036b;
        this.f10035a.getClass();
        return new C43834a(IacAnonymousInfoSheetShowDeeplink.class, null, new C43834a.b.C11809b(vVar));
    }
}
