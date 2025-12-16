package BZ;

import com.avito.android.model_card.routing.ModelCardNonTabLink;
import com.avito.android.model_card.routing.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ModelCardDeeplinkHandlerModule_ProvideNonTabDeepLinkHandlerFactory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.model_card.routing.e f1472a;

    public c(com.avito.android.model_card.routing.e eVar) {
        this.f1472a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.model_card.routing.e eVar = this.f1472a;
        b.f1471a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ModelCardNonTabLink.class, new f(), new C43834a.b.C11809b(eVar));
    }
}
