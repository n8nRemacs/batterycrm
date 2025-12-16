package com.avito.android.vas_performance.ui.visual_legacy;

import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.mnz_common.data.MnzFloatingFooterContacts;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.L;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;
import uZ.C49006c;

/* compiled from: VisualVasViewModelImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/visual_vas_item_legacy/a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/vas_performance/ui/items/visual_vas_item_legacy/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class y<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f322175b;

    public y(p pVar) {
        this.f322175b = pVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a aVar;
        Object next;
        MnzFloatingFooterContacts contacts;
        MnzFloatingFooterContact current;
        AttributedText text;
        String iconName;
        UniversalColor progressColor;
        com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a aVar2 = (com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a) obj;
        p pVar = this.f322175b;
        C43025h.a aVar3 = new C43025h.a(C43033p.i(new C42770s0(pVar.f322150d0), x.f322174l));
        while (true) {
            aVar = null;
            if (!aVar3.hasNext()) {
                next = null;
                break;
            } else {
                next = aVar3.next();
                if (L.f(((com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a) next).f321816b, aVar2.f321816b)) {
                    break;
                }
            }
        }
        com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a aVar4 = (com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a) next;
        if (aVar4 != null) {
            aVar4.f321824j = !aVar4.f321824j;
        }
        List<? extends com.avito.conveyor_item.a> listD = C43033p.D(C43033p.i(C43033p.i(new C42770s0(pVar.f322150d0), q.f322169l), r.f322170b));
        pVar.f322152f0 = listD;
        boolean zIsEmpty = listD.isEmpty();
        pVar.f322142V.setValue(new com.avito.android.vas_performance.ui.a(!zIsEmpty ? pVar.f322154h0 : pVar.f322153g0, !zIsEmpty));
        if (aVar4 != null && aVar4.f321824j) {
            aVar = aVar4;
        }
        if (pVar.f322159m0 != null) {
            List<? extends com.avito.conveyor_item.a> list = listD;
            Iterator<T> it = list.iterator();
            int iIntValue = 0;
            while (it.hasNext()) {
                Integer num = ((com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a) it.next()).f321828n;
                iIntValue += num != null ? num.intValue() : 0;
            }
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                Float f12 = ((com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a) it2.next()).f321827m;
                arrayList.add(Float.valueOf(f12 != null ? f12.floatValue() : 0.0f));
            }
            float fC02 = C42745f0.C0(arrayList);
            MnzFloatingFooter mnzFloatingFooter = pVar.f322159m0;
            if (mnzFloatingFooter == null || (contacts = mnzFloatingFooter.getContacts()) == null || (current = contacts.getCurrent()) == null) {
                return;
            }
            int count = current.getCount() + iIntValue;
            float progress = current.getProgress() + fC02;
            if (aVar == null || (text = aVar.f321829o) == null) {
                text = current.getText();
            }
            AttributedText attributedText = text;
            if (aVar == null || (iconName = aVar.f321830p) == null) {
                iconName = current.getIconName();
            }
            String str = iconName;
            if (aVar == null || (progressColor = aVar.f321831q) == null) {
                progressColor = current.getProgressColor();
            }
            pVar.f322145Y.setValue(C49006c.a(pVar.f322159m0, new MnzFloatingFooterContact(count, progress, attributedText, str, progressColor), false));
        }
    }
}
