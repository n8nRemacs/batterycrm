package com.avito.android.user_adverts_views.advert_item;

import Zx.C19616a;
import bW.InterfaceC25571b;
import com.avito.android.user_adverts_views_pub.UserAdvertItem;
import com.avito.android.user_adverts_views_pub.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import wJ0.InterfaceC49522c;
import wJ0.InterfaceC49523d;

/* compiled from: UserAdvertItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views/advert_item/m;", "LwJ0/c;", "_avito_user-adverts-views_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m implements InterfaceC49522c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<? extends com.avito.android.user_adverts_views_pub.a> f316516b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<? extends InterfaceC49523d> f316517c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25571b f316518d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C19616a f316519e;

    public m(@Y61.k h31.e<? extends com.avito.android.user_adverts_views_pub.a> eVar, @Y61.k h31.e<? extends InterfaceC49523d> eVar2, @Y61.k InterfaceC25571b interfaceC25571b, @Y61.k C19616a c19616a) {
        this.f316516b = eVar;
        this.f316517c = eVar2;
        this.f316518d = interfaceC25571b;
        this.f316519e = c19616a;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((com.avito.android.user_adverts_views_pub.c) eVar, (UserAdvertItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        com.avito.android.user_adverts_views_pub.c cVar = (com.avito.android.user_adverts_views_pub.c) eVar;
        UserAdvertItem userAdvertItem = (UserAdvertItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof UserAdvertItem.n) {
                obj = obj2;
            }
        }
        if (((UserAdvertItem.n) (obj instanceof UserAdvertItem.n ? obj : null)) == null) {
            k(cVar, userAdvertItem);
        } else if (cVar instanceof c.b) {
            c.b bVar = (c.b) cVar;
            bVar.C80(userAdvertItem.getF393785D(), new e(this, userAdvertItem));
            bVar.O80(userAdvertItem.getF393795N(), userAdvertItem.getF419712B(), new c(this, userAdvertItem), new d(this, userAdvertItem));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(@Y61.k com.avito.android.user_adverts_views_pub.c r12, @Y61.k com.avito.android.user_adverts_views_pub.UserAdvertItem r13) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts_views.advert_item.m.k(com.avito.android.user_adverts_views_pub.c, com.avito.android.user_adverts_views_pub.UserAdvertItem):void");
    }
}
