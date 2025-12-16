package Zg0;

import com.avito.android.rating_form.deep_link.RatingFormLink;
import com.avito.android.rating_form.deep_link.rating_form.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: RatingFormDeeplinkHandlerModule_ProvideRatingFormDeeplinkMappingFactory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f20373a;

    public b(d dVar) {
        this.f20373a = dVar;
    }

    public static C43834a a(d dVar) {
        C19554a.f20372a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(RatingFormLink.class, new com.avito.android.rating_form.deep_link.rating_form.e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(RatingFormLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f20373a);
    }
}
