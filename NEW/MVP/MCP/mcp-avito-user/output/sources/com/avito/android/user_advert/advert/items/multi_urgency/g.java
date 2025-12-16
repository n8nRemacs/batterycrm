package com.avito.android.user_advert.advert.items.multi_urgency;

import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import com.avito.android.user_advert.advert.items.C35403d;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiUrgencyBlockPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multi_urgency/g;", "Lcom/avito/android/user_advert/advert/items/multi_urgency/d;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public MyAdvertDetailsActivity f309650b;

    @Inject
    public g() {
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((i) eVar, (c) aVar);
    }

    @Override // com.avito.android.user_advert.advert.items.multi_urgency.d
    public final void c0() {
        this.f309650b = null;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        c cVar = (c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C35403d) {
                obj = obj2;
            }
        }
        C35403d c35403d = (C35403d) (obj instanceof C35403d ? obj : null);
        if (c35403d == null) {
            k(iVar, cVar);
            return;
        }
        List<l> list2 = c35403d.f309352a;
        if (list2 != null) {
            iVar.qP(list2);
        }
        Boolean bool = c35403d.f309353b;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            iVar.wH(zBooleanValue);
            iVar.DP(zBooleanValue);
        }
        Boolean bool2 = c35403d.f309354c;
        if (bool2 != null) {
            iVar.setLoading(bool2.booleanValue());
        }
    }

    @Override // com.avito.android.user_advert.advert.items.multi_urgency.d
    public final void j2(@Y61.k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309650b = myAdvertDetailsActivity;
    }

    public final void k(@Y61.k i iVar, @Y61.k c cVar) {
        iVar.e(cVar.f309643g);
        AttributedText attributedText = cVar.f309644h;
        iVar.k(attributedText);
        boolean z12 = cVar.f309647k;
        iVar.wH(z12);
        iVar.qP(cVar.f309645i);
        iVar.DP(z12);
        iVar.ul(new e(this));
        iVar.nz(new f(this));
        iVar.setLoading(cVar.f309646j);
        attributedText.setOnDeepLinkClickListener(new com.avito.android.tariff.cpa.configure_info.items.feature.e(this, 11));
    }
}
