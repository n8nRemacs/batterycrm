package com.avito.android.advert.item;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.AdvertDetails;
import java.util.Iterator;
import java.util.List;
import k4.InterfaceC42497a;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class K0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28136i0 f71767b;

    public K0(C28136i0 c28136i0) {
        this.f71767b = c28136i0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AdvertActions contacts;
        List<AdvertAction> actions;
        T next;
        DeepLink deepLink;
        C28136i0 c28136i0 = this.f71767b;
        AdvertDetails advertDetailsN2 = c28136i0.n2();
        if (advertDetailsN2 == null || !advertDetailsN2.getRenderByBeduin()) {
            S sO2 = c28136i0.o2(c28136i0.n2());
            if (sO2 != null) {
                sO2.r();
                return;
            }
            return;
        }
        AdvertDetails advertDetailsN22 = c28136i0.n2();
        if (advertDetailsN22 == null || (contacts = advertDetailsN22.getContacts()) == null || (actions = contacts.getActions()) == null) {
            return;
        }
        Iterator<T> it = actions.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = (T) null;
                break;
            } else {
                next = it.next();
                if (((AdvertAction) next) instanceof AdvertAction.Messenger) {
                    break;
                }
            }
        }
        AdvertAction advertAction = next;
        if (advertAction == null || (deepLink = advertAction.getDeepLink()) == null) {
            return;
        }
        c28136i0.f76275B0.invoke(new InterfaceC42497a.o(deepLink));
    }
}
