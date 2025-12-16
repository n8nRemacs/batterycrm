package com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi;

import BI0.b;
import BI0.c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SearchOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/mvi/y;", "Lcom/avito/android/arch/mvi/t;", "LBI0/b;", "LBI0/c;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class y implements com.avito.android.arch.mvi.t<BI0.b, BI0.c> {
    @Inject
    public y() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final BI0.c b(BI0.b bVar) {
        BI0.b bVar2 = bVar;
        if (!(bVar2 instanceof b.c)) {
            return null;
        }
        b.c cVar = (b.c) bVar2;
        return new c.a(cVar.f1305a, cVar.f1306b);
    }
}
