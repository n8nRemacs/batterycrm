package com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title;

import com.avito.android.user_adverts.model.UserAdvertsGroupSelectedState;
import com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.d;
import com.avito.android.user_adverts_views_pub.UserAdvertItem;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import wJ0.g;

/* compiled from: ShortcutTitleItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/shortcut_title/h;", "Lcom/avito/android/user_adverts/tab_screens/advert_list/shortcut_title/g;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f314784b;

    /* compiled from: ShortcutTitleItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f314785a;

        static {
            int[] iArr = new int[UserAdvertsGroupSelectedState.values().length];
            try {
                UserAdvertsGroupSelectedState userAdvertsGroupSelectedState = UserAdvertsGroupSelectedState.f312187b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UserAdvertsGroupSelectedState userAdvertsGroupSelectedState2 = UserAdvertsGroupSelectedState.f312187b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UserAdvertsGroupSelectedState userAdvertsGroupSelectedState3 = UserAdvertsGroupSelectedState.f312187b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f314785a = iArr;
        }
    }

    @Inject
    public h(@Y61.k b bVar) {
        this.f314784b = bVar;
    }

    public static void k(l lVar, d dVar) {
        UserAdvertsGroupSelectedState userAdvertsGroupSelectedState = dVar.f314770d;
        int i12 = userAdvertsGroupSelectedState == null ? -1 : a.f314785a[userAdvertsGroupSelectedState.ordinal()];
        if (i12 == 1) {
            lVar.D80();
            return;
        }
        if (i12 == 2) {
            lVar.E80();
        } else if (i12 != 3) {
            lVar.F80();
        } else {
            lVar.G80();
        }
    }

    public final void O(@Y61.k l lVar, @Y61.k d dVar) {
        Object next;
        String str = dVar.f314768b;
        if (str != null) {
            lVar.I80(str);
        } else {
            Integer num = dVar.f314771e;
            if (num != null) {
                lVar.H80(num.intValue());
            }
        }
        k(lVar, dVar);
        lVar.C80(new i(this, dVar));
        Iterator<T> it = dVar.f314773g.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((wJ0.g) next).getF314777d()) {
                    break;
                }
            }
        }
        wJ0.g gVar = (wJ0.g) next;
        if (!(gVar instanceof d.a)) {
            lVar.B80();
            return;
        }
        d.a aVar = (d.a) gVar;
        int i12 = aVar.f314774a;
        g.a<Integer> aVar2 = aVar.f314776c;
        Integer num2 = aVar2 != null ? aVar2.f441373a : null;
        j jVar = new j(this, dVar);
        int i13 = l.f314790b;
        lVar.J80(i12, aVar.f314775b, num2, jVar);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        O((l) eVar, (d) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        l lVar = (l) eVar;
        d dVar = (d) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof UserAdvertItem.n) {
                obj = obj2;
            }
        }
        if (((UserAdvertItem.n) (obj instanceof UserAdvertItem.n ? obj : null)) == null) {
            O(lVar, dVar);
        } else {
            k(lVar, dVar);
        }
    }
}
