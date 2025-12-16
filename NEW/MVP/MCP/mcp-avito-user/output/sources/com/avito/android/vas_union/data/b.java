package com.avito.android.vas_union.data;

import Y61.k;
import Y61.l;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.vas_union.remote.model.VasPerformanceItem;
import com.avito.android.vas_union.ui.items.tabs.c;
import com.avito.android.vas_union.ui.items.vas_bundle.c;
import com.avito.android.vas_union.ui.items.vas_performance_select.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import tM0.C48577a;
import tM0.C48578b;
import tM0.C48579c;
import tM0.e;
import tM0.f;
import tM0.g;
import tM0.h;

/* compiled from: VasUnionV2Mapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_union/data/b;", "Lcom/avito/android/vas_union/data/a;", "<init>", "()V", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.vas_union.data.a {

    /* compiled from: VasUnionV2Mapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f323118a;

        static {
            int[] iArr = new int[VasPerformanceItem.Type.values().length];
            try {
                iArr[VasPerformanceItem.Type.CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VasPerformanceItem.Type.SELECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f323118a = iArr;
        }
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.vas_union.data.a
    @l
    public final String a(@k g gVar) {
        Object next;
        Iterator<T> it = gVar.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((h) next).getSelected()) {
                break;
            }
        }
        h hVar = (h) next;
        if (hVar != null) {
            return hVar.getType();
        }
        return null;
    }

    @Override // com.avito.android.vas_union.data.a
    @k
    public final LinkedHashMap b(@k g gVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (h hVar : gVar.c()) {
            if (hVar.getContent().getVasPerformance() != null) {
                tM0.d vasPerformance = hVar.getContent().getVasPerformance();
                ArrayList arrayList = new ArrayList();
                List<e> listA = vasPerformance.a();
                ArrayList arrayList2 = new ArrayList(C42745f0.q(listA, 10));
                for (e eVar : listA) {
                    arrayList2.add(new ItemChipable(eVar.getId(), null, null, null, eVar.getSelected(), null, eVar.getTitle(), false, false, 430, null));
                }
                arrayList.add(new com.avito.android.vas_union.ui.items.vas_performance_chips.c("key_vas_union_performance_chips", arrayList2));
                for (e eVar2 : vasPerformance.a()) {
                    ArrayList arrayList3 = new ArrayList();
                    for (VasPerformanceItem vasPerformanceItem : eVar2.b()) {
                        int i12 = a.f323118a[vasPerformanceItem.getType().ordinal()];
                        if (i12 == 1) {
                            arrayList.add(new com.avito.android.vas_union.ui.items.vas_performance_click.a("key_vas_union_performance_click_" + eVar2.getId(), vasPerformanceItem.getSlug(), vasPerformanceItem.getPrice(), vasPerformanceItem.getTitle(), vasPerformanceItem.getIcon(), vasPerformanceItem.getUri(), eVar2.getId()));
                        } else if (i12 == 2) {
                            f discount = vasPerformanceItem.getDiscount();
                            arrayList3.add(new c.a(vasPerformanceItem.getSlug(), vasPerformanceItem.getSelected(), discount != null ? new c.a.C9995a(discount.getText(), discount.getStyle()) : null, vasPerformanceItem.getPrice(), vasPerformanceItem.getOldPrice(), vasPerformanceItem.getTitle(), vasPerformanceItem.getIcon(), vasPerformanceItem.getBblContacts()));
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        arrayList.add(new com.avito.android.vas_union.ui.items.vas_performance_select.c("key_vas_union_performance_select_" + eVar2.getId(), arrayList3, eVar2.getId()));
                    }
                }
                linkedHashMap.put(hVar.getType(), arrayList);
            } else if (hVar.getContent().getBundles() != null) {
                C48579c bundles = hVar.getContent().getBundles();
                ArrayList arrayList4 = new ArrayList();
                AttributedText description = bundles.getDescription();
                List<C48578b> listB = bundles.b();
                ArrayList arrayList5 = new ArrayList(C42745f0.q(listB, 10));
                for (C48578b c48578b : listB) {
                    f discount2 = c48578b.getDiscount();
                    c.a.b bVar = discount2 != null ? new c.a.b(discount2.getText(), discount2.getStyle()) : null;
                    List<C48577a> listB2 = c48578b.b();
                    ArrayList arrayList6 = new ArrayList(C42745f0.q(listB2, 10));
                    for (C48577a c48577a : listB2) {
                        arrayList6.add(new c.a.C9993a(c48577a.getText(), c48577a.getIcon()));
                    }
                    arrayList5.add(new c.a(c48578b.getBundleId(), c48578b.getSelected(), c48578b.getPriceHint(), bVar, c48578b.getImage(), c48578b.getTitle(), arrayList6, c48578b.getPrice(), c48578b.getOldPrice(), c48578b.getBblContacts()));
                }
                arrayList4.add(new com.avito.android.vas_union.ui.items.vas_bundle.c("key_vas_union_bundle", description, arrayList5));
                linkedHashMap.put(hVar.getType(), arrayList4);
            }
        }
        return linkedHashMap;
    }

    @Override // com.avito.android.vas_union.data.a
    @k
    public final ArrayList c(@k g gVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.avito.android.vas_union.ui.items.title.c(gVar.getTitle()));
        List<h> listC = gVar.c();
        if (listC.size() <= 1) {
            listC = null;
        }
        if (listC != null) {
            List<h> list = listC;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (h hVar : list) {
                arrayList2.add(new c.a(com.avito.android.printable_text.b.f(hVar.getTitle()), hVar.getType(), hVar.getSelected()));
            }
            arrayList.add(new com.avito.android.vas_union.ui.items.tabs.c("key_vas_union_tabs", arrayList2));
        }
        return arrayList;
    }

    @Override // com.avito.android.vas_union.data.a
    @l
    public final MnzFloatingFooterContact d(@l MnzFloatingFooterContact mnzFloatingFooterContact, @l MnzFloatingFooterContact mnzFloatingFooterContact2) {
        AttributedText text = null;
        if (mnzFloatingFooterContact == null) {
            return null;
        }
        UniversalColor progressColor = mnzFloatingFooterContact.getProgressColor();
        if (progressColor == null) {
            progressColor = mnzFloatingFooterContact2 != null ? mnzFloatingFooterContact2.getProgressColor() : null;
        }
        String iconName = mnzFloatingFooterContact.getIconName();
        if (iconName == null) {
            iconName = mnzFloatingFooterContact2 != null ? mnzFloatingFooterContact2.getIconName() : null;
        }
        AttributedText text2 = mnzFloatingFooterContact.getText();
        if (text2 != null) {
            text = text2;
        } else if (mnzFloatingFooterContact2 != null) {
            text = mnzFloatingFooterContact2.getText();
        }
        return MnzFloatingFooterContact.a(mnzFloatingFooterContact, text, iconName, progressColor);
    }
}
