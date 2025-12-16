package BZ;

import com.avito.android.deep_linking.links.ModelCardLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ModelCardDeeplinkHandlerModule_ProvideSomeDeeplinkMappingFactory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.model_card.routing.c f1473a;

    public d(com.avito.android.model_card.routing.c cVar) {
        this.f1473a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.model_card.routing.c cVar = this.f1473a;
        b.f1471a.getClass();
        return new C43834a(ModelCardLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ModelCardLink.class), cVar));
    }
}
