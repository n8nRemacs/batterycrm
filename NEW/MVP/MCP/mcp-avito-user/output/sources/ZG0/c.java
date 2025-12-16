package Zg0;

import com.avito.android.rating_form.deep_link.RatingModelLink;
import com.avito.android.rating_form.deep_link.rating_model.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: RatingFormDeeplinkHandlerModule_ProvideRatingModelDeeplinkMappingFactory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.rating_form.deep_link.rating_model.c f20374a;

    public c(com.avito.android.rating_form.deep_link.rating_model.c cVar) {
        this.f20374a = cVar;
    }

    public static C43834a a(com.avito.android.rating_form.deep_link.rating_model.c cVar) {
        C19554a.f20372a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(RatingModelLink.class, new d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(RatingModelLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f20374a);
    }
}
