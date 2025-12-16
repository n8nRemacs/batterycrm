package Ld0;

import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.publish.deeplink.C33552g;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PublishDeepLinkHandlerModule_MakeAdvertPublicationDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C14382a f10027a;

    /* renamed from: b, reason: collision with root package name */
    public final C33552g f10028b;

    public d(C14382a c14382a, C33552g c33552g) {
        this.f10027a = c14382a;
        this.f10028b = c33552g;
    }

    public static C43834a a(C14382a c14382a, C33552g c33552g) {
        c14382a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AdvertPublicationLink.Public.class, new Md0.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AdvertPublicationLink.Public.class), c33552g));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f10027a, this.f10028b);
    }
}
