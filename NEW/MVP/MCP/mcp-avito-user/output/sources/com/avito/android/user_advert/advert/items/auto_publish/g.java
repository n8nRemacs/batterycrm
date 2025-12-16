package com.avito.android.user_advert.advert.items.auto_publish;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import com.avito.android.user_advert.advert.items.C35400a;
import iI0.C41302g;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AutoPublishItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/auto_publish/g;", "Lcom/avito/android/user_advert/advert/items/auto_publish/d;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f309253b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f309254c;

    @Inject
    public g(@k InterfaceC28373a interfaceC28373a) {
        this.f309253b = interfaceC28373a;
    }

    @Override // com.avito.android.user_advert.advert.items.auto_publish.d
    public final void N2(@k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309254c = myAdvertDetailsActivity;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) throws NumberFormatException {
        k((i) eVar, (a) aVar);
    }

    @Override // com.avito.android.user_advert.advert.items.auto_publish.d
    public final void c0() {
        this.f309254c = null;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) throws NumberFormatException {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        Iterator it = list.iterator();
        Object obj = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null ? next instanceof C35400a : true) {
                obj = next;
            }
        }
        if (!(obj instanceof C35400a)) {
            obj = null;
        }
        C35400a c35400a = (C35400a) obj;
        if (c35400a == null) {
            k(iVar, aVar2);
            return;
        }
        iVar.FV(c35400a.f309003a);
        e eVar2 = new e(this, aVar2);
        iVar.s40(null);
        iVar.Oi(c35400a.f309004b);
        iVar.s40(eVar2);
    }

    public final void k(@k i iVar, @k a aVar) throws NumberFormatException {
        long j12 = Long.parseLong(aVar.f309237c);
        String str = aVar.f309243i;
        boolean z12 = aVar.f309241g;
        this.f309253b.c(new C41302g(str, z12, j12));
        iVar.CI(aVar.f309239e);
        AttributedText attributedText = aVar.f309240f;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new com.avito.android.advert_details_items.buyer_bonuses.g(8, this, aVar));
        }
        iVar.p60(attributedText);
        iVar.FV(aVar.f309242h);
        f fVar = new f(this, aVar);
        iVar.s40(null);
        iVar.Oi(z12);
        iVar.s40(fVar);
    }
}
