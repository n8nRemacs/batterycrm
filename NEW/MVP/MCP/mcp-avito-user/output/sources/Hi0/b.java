package Hi0;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RecommendationBlocksLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<com.avito.android.recommendation_items_loader_impl.deep_linking.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f7634a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f7635b;

    public b(C30102l3 c30102l3, dv.b bVar) {
        this.f7634a = bVar;
        this.f7635b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.recommendation_items_loader_impl.deep_linking.a((Context) this.f7635b.get(), (a.InterfaceC4053a) this.f7634a.get());
    }
}
