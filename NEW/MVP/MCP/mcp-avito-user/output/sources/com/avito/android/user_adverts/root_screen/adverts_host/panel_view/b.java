package com.avito.android.user_adverts.root_screen.adverts_host.panel_view;

import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.c;
import kotlin.Metadata;

/* compiled from: PanelViewCardSizeResolver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/d;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f313653a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f313654b;

    public b(@Y61.k c cVar, @Y61.k c cVar2) {
        this.f313653a = cVar;
        this.f313654b = cVar2;
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.d
    @Y61.k
    public final c a(int i12, @Y61.k f fVar) {
        c cVar = this.f313653a;
        int i13 = cVar.f313656b;
        if (i12 == 1) {
            return new c(c.a.b.f313658a, i13);
        }
        c cVar2 = this.f313654b;
        boolean z12 = fVar.f313663c;
        if (i12 != 2) {
            if (!z12) {
                return cVar;
            }
        } else if (!z12) {
            return new c(c.a.C9652a.f313657a, i13);
        }
        return cVar2;
    }
}
