package pg0;

import com.avito.android.deep_linking.UserRatingDetailsLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import zg0.C50564b;
import zg0.C50565c;

/* compiled from: RatingHandlerModule_ProvideUserRatingDetailsDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: pg0.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C47084f implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C50564b f428739a;

    public C47084f(C50564b c50564b) {
        this.f428739a = c50564b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C50564b c50564b = this.f428739a;
        C47079a.f428734a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(UserRatingDetailsLink.class, new C50565c(), new C43834a.b.C11809b(c50564b));
    }
}
