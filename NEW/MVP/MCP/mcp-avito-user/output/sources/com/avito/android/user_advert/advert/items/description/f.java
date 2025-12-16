package com.avito.android.user_advert.advert.items.description;

import Y61.k;
import Y61.l;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import com.avito.android.user_advert.advert.items.C35412m;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MyAdvertDescriptionItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/description/f;", "Lcom/avito/android/user_advert/advert/items/description/d;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f309364b;

    @Inject
    public f() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        if (aVar2.f309357d) {
            hVar.C00();
        } else {
            hVar.hi();
        }
        hVar.Ku(new e(this, aVar2));
        hVar.r5(aVar2.f309356c);
    }

    @Override // com.avito.android.user_advert.advert.items.description.d
    public final void c0() {
        this.f309364b = null;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        Iterator it = list.iterator();
        Object obj = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null ? next instanceof C35412m : true) {
                obj = next;
            }
        }
        C35412m c35412m = (C35412m) (obj instanceof C35412m ? obj : null);
        if (c35412m != null) {
            if (c35412m.f309564a) {
                hVar.C00();
                return;
            } else {
                hVar.hi();
                return;
            }
        }
        if (aVar2.f309357d) {
            hVar.C00();
        } else {
            hVar.hi();
        }
        hVar.Ku(new e(this, aVar2));
        hVar.r5(aVar2.f309356c);
    }

    @Override // com.avito.android.user_advert.advert.items.description.d
    public final void p1(@k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309364b = myAdvertDetailsActivity;
    }
}
