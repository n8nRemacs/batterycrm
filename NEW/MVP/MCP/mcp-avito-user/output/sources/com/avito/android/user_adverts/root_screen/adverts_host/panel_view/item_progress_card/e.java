package com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card;

import android.content.Context;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import kotlin.Metadata;
import xV.C49888a;
import xV.C49890c;

/* compiled from: PanelProgressCardItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_progress_card/e;", "LTV0/d;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_progress_card/g;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_progress_card/a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements TV0.d<g, a> {
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        PrintableText title = aVar2.getF313319c();
        Context context = gVar.f313752b;
        gVar.f313753c.setText(title.k0(context));
        gVar.f313754d.setText(aVar2.getF313320d().k0(context));
        ArrayList arrayList = new ArrayList();
        int iS2 = aVar2.getF313322f();
        int i13 = 0;
        while (i13 < iS2) {
            arrayList.add(new C49890c(1.0f, i13 < aVar2.getF313321e() ? gVar.f313757g : gVar.f313756f));
            i13++;
        }
        gVar.f313755e.setState(new C49888a(new xV.d(arrayList)));
        gVar.f313758h = aVar2;
    }
}
