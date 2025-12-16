package com.avito.android.social_management;

import com.avito.android.remote.model.social.SocialNetwork;
import com.avito.android.remote.model.social.SocialNotification;
import com.avito.android.social_management.adapter.SocialItem;
import com.avito.android.social_management.t;
import ix0.C42130c;
import ix0.C42131d;
import ix0.C42132e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SocialManagementPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/social_management/f;", "result", "", "Lcom/avito/android/social_management/adapter/SocialItem;", "apply", "(Lcom/avito/android/social_management/f;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class E<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f284438b;

    public E(t tVar) {
        this.f284438b = tVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        t tVar;
        Collection collectionU;
        C42130c c42130c;
        C42131d value;
        SocialItem.VkGroupItem.Type type;
        C35039f c35039f = (C35039f) obj;
        List<SocialNetwork> list = c35039f.f284673a;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            tVar = this.f284438b;
            if (!zHasNext) {
                break;
            }
            SocialNetwork socialNetwork = (SocialNetwork) it.next();
            int i12 = tVar.f284718v;
            tVar.f284718v = i12 + 1;
            arrayList.add(new SocialItem.Connected(i12, socialNetwork));
        }
        ArrayList arrayList2 = tVar.f284717u;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            SocialNetwork socialNetwork2 = (SocialNetwork) next;
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (kotlin.jvm.internal.L.f(((SocialItem.Connected) it3.next()).f284478c.getType(), socialNetwork2.getType())) {
                        break;
                    }
                }
            }
            arrayList3.add(next);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (kotlin.jvm.internal.L.f(((SocialNetwork) next2).getType(), "vk-id") && !arrayList.isEmpty()) {
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    if (kotlin.jvm.internal.L.f(((SocialItem.Connected) it5.next()).f284478c.getType(), "vk")) {
                        break;
                    }
                }
            }
            arrayList4.add(next2);
        }
        ArrayList arrayList5 = new ArrayList(C42745f0.q(arrayList4, 10));
        Iterator it6 = arrayList4.iterator();
        while (it6.hasNext()) {
            SocialNetwork socialNetwork3 = (SocialNetwork) it6.next();
            int i13 = tVar.f284718v;
            tVar.f284718v = i13 + 1;
            arrayList5.add(new SocialItem.Available(i13, socialNetwork3));
        }
        int i14 = tVar.f284718v;
        tVar.f284718v = i14 + 1;
        SocialItem.Header header = new SocialItem.Header(i14, tVar.f284705i.h());
        List<SocialNotification> list2 = c35039f.f284675c;
        ArrayList arrayList6 = new ArrayList(C42745f0.q(list2, 10));
        for (SocialNotification socialNotification : list2) {
            int i15 = tVar.f284718v;
            tVar.f284718v = i15 + 1;
            arrayList6.add(new SocialItem.Notification(i15, socialNotification.getId(), socialNotification.getNotification(), socialNotification.getProvider()));
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList6);
        arrayList7.addAll(arrayList);
        if (!arrayList5.isEmpty()) {
            arrayList7.add(header);
            arrayList7.addAll(arrayList5);
        }
        List<C42130c> list3 = c35039f.f284674b;
        if (list3 == null || (c42130c = (C42130c) C42745f0.G(list3)) == null || (value = c42130c.getValue()) == null) {
            collectionU = C42784z0.f406748b;
        } else {
            int i16 = tVar.f284718v;
            tVar.f284718v = i16 + 1;
            SocialItem.Header header2 = new SocialItem.Header(i16, value.getTitle());
            C42132e row = value.getRow();
            int i17 = tVar.f284718v;
            tVar.f284718v = i17 + 1;
            long j12 = i17;
            String title = row.getStatus().getTitle();
            String subtitle = row.getStatus().getSubtitle();
            int i18 = t.a.f284719a[row.getStatus().getType().ordinal()];
            if (i18 == 1) {
                type = SocialItem.VkGroupItem.Type.f284492b;
            } else {
                if (i18 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                type = SocialItem.VkGroupItem.Type.f284493c;
            }
            collectionU = C42745f0.U(header2, new SocialItem.VkGroupItem(j12, title, subtitle, type, new SocialItem.VkGroupItem.Action(row.getAction().getTitle(), row.getAction().getDeeplink())));
        }
        arrayList7.addAll(collectionU);
        return arrayList7;
    }
}
