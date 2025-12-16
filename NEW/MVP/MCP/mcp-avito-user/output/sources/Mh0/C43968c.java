package mH0;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.user_advert.advert.items.actions_item.ActionsItem;
import fH0.AbstractC40291a;
import fH0.InterfaceC40292b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import mH0.AbstractC43967b;

/* compiled from: ItemPromotionPresenterDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LmH0/c;", "LfH0/a;", "LmH0/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mH0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43968c extends AbstractC40291a implements InterfaceC43966a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f414446d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f414447e;

    @Inject
    public C43968c(@k InterfaceC28373a interfaceC28373a) {
        this.f414446d = interfaceC28373a;
    }

    @Override // mH0.InterfaceC43966a
    public final void F() {
        if (this.f414447e) {
            return;
        }
        this.f414446d.c(new y.a("app_ver.sbc.seller_card_button_show", 0L, 2, null));
        this.f414447e = true;
    }

    @Override // mH0.InterfaceC43966a
    public final void f(@k ActionsItem.c cVar) {
        this.f414446d.c(new W8.a(cVar.f309023f));
        this.f395801b.accept(new InterfaceC40292b.a(cVar.f309019b));
    }

    @Override // mH0.InterfaceC43966a
    public final void o(@k ActionsItem actionsItem) {
        List<ActionsItem.Action> list = actionsItem.f309006c;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (ActionsItem.Action cVar : list) {
            if (cVar instanceof ActionsItem.c) {
                ActionsItem.c cVar2 = (ActionsItem.c) cVar;
                cVar = new ActionsItem.c(cVar2.f309018a, cVar2.f309019b, cVar2.f309020c, true, cVar2.f309022e, cVar2.f309023f);
            }
            arrayList.add(cVar);
        }
        this.f395801b.accept(new AbstractC43967b.a(new ActionsItem(actionsItem.f309005b, arrayList)));
    }
}
