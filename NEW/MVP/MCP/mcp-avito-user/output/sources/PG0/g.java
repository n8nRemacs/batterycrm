package pg0;

import Ag0.C13030b;
import Ag0.C13031c;
import com.avito.android.deep_linking.UserReviewsLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: RatingHandlerModule_ProvideUserReviewsDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C13030b f428740a;

    public g(C13030b c13030b) {
        this.f428740a = c13030b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C13030b c13030b = this.f428740a;
        C47079a.f428734a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(UserReviewsLink.class, new C13031c(), new C43834a.b.C11809b(c13030b));
    }
}
