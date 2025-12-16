package pg0;

import Qg0.C14894b;
import com.avito.android.deep_linking.links.UserContactsLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: RatingHandlerModule_ProvideUserContactsLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: pg0.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C47083e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C14894b f428738a;

    public C47083e(C14894b c14894b) {
        this.f428738a = c14894b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C14894b c14894b = this.f428738a;
        C47079a.f428734a.getClass();
        return new C43834a(UserContactsLink.class, null, new C43834a.b.C11809b(c14894b));
    }
}
