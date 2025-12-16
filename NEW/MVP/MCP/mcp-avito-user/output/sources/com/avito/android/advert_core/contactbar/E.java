package com.avito.android.advert_core.contactbar;

import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ContactBarActionsFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class E extends N implements Y41.l<List<? extends ContactBar.InfoStickyBlock>, List<? extends ContactBar.InfoStickyBlock>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<ContactBar.InfoStickyBlock> f83127l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C f83128m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E(List<? extends ContactBar.InfoStickyBlock> list, C c12) {
        super(1);
        this.f83127l = list;
        this.f83128m = c12;
    }

    @Override // Y41.l
    public final List<? extends ContactBar.InfoStickyBlock> invoke(List<? extends ContactBar.InfoStickyBlock> list) {
        Object next;
        DeepLink deepLink;
        List<? extends ContactBar.InfoStickyBlock> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof ContactBar.InfoStickyBlock.InstallmentsActionToggle) {
                break;
            }
        }
        if (!(next instanceof ContactBar.InfoStickyBlock.InstallmentsActionToggle)) {
            next = null;
        }
        ContactBar.InfoStickyBlock.InstallmentsActionToggle installmentsActionToggle = (ContactBar.InfoStickyBlock.InstallmentsActionToggle) next;
        List<? extends ContactBar.InfoStickyBlock> list3 = list2;
        int iF2 = P0.f(C42745f0.q(list3, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : list3) {
            linkedHashMap.put(((ContactBar.InfoStickyBlock) obj).getF125123b(), obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (ContactBar.InfoStickyBlock infoStickyBlock : this.f83127l) {
            if (!linkedHashMap2.containsKey(infoStickyBlock.getF125123b())) {
                linkedHashMap2.put(infoStickyBlock.getF125123b(), infoStickyBlock);
            } else if (!(infoStickyBlock instanceof ContactBar.InfoStickyBlock.InstallmentsActionToggle) || installmentsActionToggle == null) {
                linkedHashMap2.put(infoStickyBlock.getF125123b(), infoStickyBlock);
            } else {
                ContactBar.InfoStickyBlock.InstallmentsActionToggle installmentsActionToggle2 = (ContactBar.InfoStickyBlock.InstallmentsActionToggle) infoStickyBlock;
                String str = installmentsActionToggle2.f125127f;
                if (str != null && (deepLink = installmentsActionToggle2.f125128g) != null) {
                    com.avito.android.advert_core.safedeal.trust_factors.a aVar = this.f83128m.f83111b;
                    D d12 = new D(str, deepLink);
                    ContactBar.Button.Target target = aVar.f84279d;
                    aVar.f84279d = target != null ? (ContactBar.Button.Target) d12.invoke(target) : null;
                    linkedHashMap2.put(infoStickyBlock.getF125123b(), ContactBar.InfoStickyBlock.InstallmentsActionToggle.a(installmentsActionToggle2, installmentsActionToggle.f125126e));
                }
            }
        }
        return C42745f0.M0(linkedHashMap2.values());
    }
}
