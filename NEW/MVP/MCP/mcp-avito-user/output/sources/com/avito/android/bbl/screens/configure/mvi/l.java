package com.avito.android.bbl.screens.configure.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.bbl.screens.configure.mvi.entity.BblConfigureInternalAction;
import com.avito.android.bbl.screens.configure.ui.items.configs.BblConfigureConfigsItem;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.mnz_common.data.MnzFloatingFooterContacts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import lh.InterfaceC43770a;
import xh.C49943a;
import xh.C49944b;
import yh.C50251c;

/* compiled from: BblConfigureReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/configure/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction;", "Lyh/c;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l implements u<BblConfigureInternalAction, C50251c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43770a f99237b;

    @Inject
    public l(@Y61.k InterfaceC43770a interfaceC43770a) {
        this.f99237b = interfaceC43770a;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C50251c a(BblConfigureInternalAction bblConfigureInternalAction, C50251c c50251c) {
        Object next;
        MnzFloatingFooterContact delta;
        MnzFloatingFooterContact delta2;
        BblConfigureInternalAction bblConfigureInternalAction2 = bblConfigureInternalAction;
        C50251c c50251c2 = c50251c;
        boolean z12 = bblConfigureInternalAction2 instanceof BblConfigureInternalAction.Content;
        InterfaceC43770a interfaceC43770a = this.f99237b;
        if (!z12) {
            if (!(bblConfigureInternalAction2 instanceof BblConfigureInternalAction.HandleConfig)) {
                if (bblConfigureInternalAction2 instanceof BblConfigureInternalAction.Error.ScreenError) {
                    return C50251c.a(c50251c2, null, null, null, ((BblConfigureInternalAction.Error.ScreenError) bblConfigureInternalAction2).f99218b, false, false, null, 1663);
                }
                if (bblConfigureInternalAction2 instanceof BblConfigureInternalAction.Loading) {
                    return C50251c.a(c50251c2, null, null, null, null, true, false, null, 1663);
                }
                if (!(bblConfigureInternalAction2 instanceof BblConfigureInternalAction.ChangeOnScreenLoading)) {
                    return c50251c2;
                }
                BblConfigureInternalAction.ChangeOnScreenLoading changeOnScreenLoading = (BblConfigureInternalAction.ChangeOnScreenLoading) bblConfigureInternalAction2;
                return C50251c.a(c50251c2, null, null, null, null, false, changeOnScreenLoading.f99215b, changeOnScreenLoading.f99216c, 511);
            }
            MnzFloatingFooterContact mnzFloatingFooterContact = c50251c2.f443460d;
            int count = mnzFloatingFooterContact != null ? mnzFloatingFooterContact.getCount() : 0;
            BblConfigureConfigsItem.Config config = ((BblConfigureInternalAction.HandleConfig) bblConfigureInternalAction2).f99220b;
            MnzFloatingFooterContact mnzFloatingFooterContact2 = new MnzFloatingFooterContact(count + (config != null ? config.f99244d : 0), (mnzFloatingFooterContact != null ? mnzFloatingFooterContact.getProgress() : 0.0f) + (config != null ? config.f99245e : 0.0f), null, null, null, 28, null);
            List<com.avito.conveyor_item.a> list = c50251c2.f443464h;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (com.avito.conveyor_item.a bblConfigureConfigsItem : list) {
                if (bblConfigureConfigsItem instanceof BblConfigureConfigsItem) {
                    BblConfigureConfigsItem bblConfigureConfigsItem2 = (BblConfigureConfigsItem) bblConfigureConfigsItem;
                    bblConfigureConfigsItem = new BblConfigureConfigsItem(bblConfigureConfigsItem2.f99239b, config, bblConfigureConfigsItem2.f99241d);
                }
                arrayList.add(bblConfigureConfigsItem);
            }
            interfaceC43770a.b(config != null ? config.f99243c : null, wZ.h.a(mnzFloatingFooterContact2));
            return C50251c.a(c50251c2, mnzFloatingFooterContact2, config != null ? Long.valueOf(config.f99242b) : null, arrayList, null, false, false, null, 1959);
        }
        ArrayList arrayList2 = new ArrayList();
        C49944b c49944b = ((BblConfigureInternalAction.Content) bblConfigureInternalAction2).f99217b;
        arrayList2.add(new com.avito.android.bbl.screens.configure.ui.items.header.a(c49944b.getTitle()));
        Iterator<T> it = c49944b.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C49943a) next).getIsSelected()) {
                break;
            }
        }
        C49943a c49943a = (C49943a) next;
        if (c49943a == null) {
            c49943a = (C49943a) C42745f0.G(c49944b.b());
        }
        if (c49943a != null) {
            BblConfigureConfigsItem.Config config2 = new BblConfigureConfigsItem.Config(c49943a.getId(), c49943a.getText(), c49943a.getDelta().getCount(), c49943a.getDelta().getProgress());
            List<C49943a> listB = c49944b.b();
            ArrayList arrayList3 = new ArrayList(C42745f0.q(listB, 10));
            for (C49943a c49943a2 : listB) {
                arrayList3.add(new BblConfigureConfigsItem.Config(c49943a2.getId(), c49943a2.getText(), c49943a2.getDelta().getCount(), c49943a2.getDelta().getProgress()));
            }
            arrayList2.add(new BblConfigureConfigsItem("configs_item", config2, arrayList3));
        }
        MnzFloatingFooterContacts contacts = c49944b.getBblFooter().getContacts();
        MnzFloatingFooterContact current = contacts != null ? contacts.getCurrent() : null;
        int count2 = current != null ? current.getCount() : 0;
        if (c49943a != null && (delta2 = c49943a.getDelta()) != null) {
            count = delta2.getCount();
        }
        MnzFloatingFooterContact mnzFloatingFooterContact3 = new MnzFloatingFooterContact(count2 + count, (current != null ? current.getProgress() : 0.0f) + ((c49943a == null || (delta = c49943a.getDelta()) == null) ? 0.0f : delta.getProgress()), null, null, null, 28, null);
        interfaceC43770a.clear();
        interfaceC43770a.b(c49943a != null ? c49943a.getText() : null, wZ.h.a(mnzFloatingFooterContact3));
        return new C50251c(c49944b.getNavBar(), c49944b.getBblFooter(), current, mnzFloatingFooterContact3, c49943a != null ? Long.valueOf(c49943a.getId()) : null, c49944b.getImage(), arrayList2, null, false, false, null);
    }
}
