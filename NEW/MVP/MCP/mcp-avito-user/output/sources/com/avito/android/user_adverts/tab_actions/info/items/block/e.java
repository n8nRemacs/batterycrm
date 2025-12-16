package com.avito.android.user_adverts.tab_actions.info.items.block;

import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ActionBlockInfoItemViewPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/info/items/block/e;", "LTV0/d;", "Lcom/avito/android/user_adverts/tab_actions/info/items/block/d;", "Lcom/avito/android/user_adverts/tab_actions/info/items/block/a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements TV0.d<d, a> {
    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        d dVar = (d) eVar;
        a aVar2 = (a) aVar;
        I5.a(dVar.f314669d, dVar.f314667b.c(dVar.itemView.getContext(), aVar2.f314660d), false);
        dVar.f314668c.setText(aVar2.f314659c);
    }
}
