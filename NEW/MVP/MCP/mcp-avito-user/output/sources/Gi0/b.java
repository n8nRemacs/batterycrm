package gI0;

import com.avito.android.deep_linking.links.MyDraftAdvertDetailsLink;
import com.avito.android.user_advert.deeplink.I;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: UserAdvertDeepLinkHandlerModule_MakeDraftAdvertDetailsDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C40587a f396431a;

    /* renamed from: b, reason: collision with root package name */
    public final I f396432b;

    public b(C40587a c40587a, I i12) {
        this.f396431a = c40587a;
        this.f396432b = i12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I i12 = this.f396432b;
        this.f396431a.getClass();
        return new C43834a(MyDraftAdvertDetailsLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MyDraftAdvertDetailsLink.class), i12));
    }
}
