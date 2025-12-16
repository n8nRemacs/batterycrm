package Ld0;

import com.avito.android.deep_linking.links.PublishLimitsHistoryLink;
import com.avito.android.publish.deeplink.K;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PublishDeepLinkHandlerModule_MakePublishLimitsDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C14382a f10041a;

    /* renamed from: b, reason: collision with root package name */
    public final K f10042b;

    public k(C14382a c14382a, K k12) {
        this.f10041a = c14382a;
        this.f10042b = k12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        K k12 = this.f10042b;
        this.f10041a.getClass();
        return new C43834a(PublishLimitsHistoryLink.class, null, new C43834a.b.C11809b(k12));
    }
}
