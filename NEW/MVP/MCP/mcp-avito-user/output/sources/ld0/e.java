package Ld0;

import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.publish.deeplink.C33554i;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PublishDeepLinkHandlerModule_MakeAdvertPublicationLocalDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C14382a f10029a;

    /* renamed from: b, reason: collision with root package name */
    public final C33554i f10030b;

    public e(C14382a c14382a, C33554i c33554i) {
        this.f10029a = c14382a;
        this.f10030b = c33554i;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C33554i c33554i = this.f10030b;
        this.f10029a.getClass();
        return new C43834a(AdvertPublicationLink.Local.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AdvertPublicationLink.Local.class), c33554i));
    }
}
