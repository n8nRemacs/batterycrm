package com.avito.android.user_adverts.tab_actions.host.items;

import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserAdvertActionItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/items/h;", "Lcom/avito/android/user_adverts/tab_actions/host/items/e;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final VI0.a f314331b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<a> f314332c = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public h(@Y61.k VI0.a aVar) {
        this.f314331b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        a aVar2 = (a) aVar;
        jVar.X(new f(this, aVar2));
        jVar.yt(aVar2, new g(this, aVar2));
    }

    @Override // com.avito.android.user_adverts.tab_actions.host.items.d
    public final z k() {
        return this.f314332c;
    }
}
