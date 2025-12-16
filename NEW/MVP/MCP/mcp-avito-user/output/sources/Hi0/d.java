package Hi0;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RecommendationItemsLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<com.avito.android.recommendation_items_loader_impl.deep_linking.b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f7636a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f7637b;

    public d(C30102l3 c30102l3, dv.b bVar) {
        this.f7636a = bVar;
        this.f7637b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.recommendation_items_loader_impl.deep_linking.b((Context) this.f7637b.get(), (a.InterfaceC4053a) this.f7636a.get());
    }
}
