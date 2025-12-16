package com.avito.android.user_adverts.root_screen.adverts_host.panel_view;

import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.c;
import kotlin.Metadata;

/* compiled from: PanelViewCardSizeResolver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/g;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/d;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f313664a;

    public g(@Y61.k c cVar) {
        this.f313664a = cVar;
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.d
    @Y61.k
    public final c a(int i12, @Y61.k f fVar) {
        c cVar = this.f313664a;
        if (fVar.f313661a || fVar.f313662b) {
            return cVar;
        }
        int i13 = cVar.f313656b;
        return i12 != 1 ? i12 != 2 ? cVar : new c(c.a.C9652a.f313657a, i13) : new c(c.a.b.f313658a, i13);
    }
}
