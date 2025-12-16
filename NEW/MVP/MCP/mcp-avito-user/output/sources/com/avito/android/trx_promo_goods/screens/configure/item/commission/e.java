package com.avito.android.trx_promo_goods.screens.configure.item.commission;

import Y41.l;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoGoodsConfigureCommissionPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/item/commission/e;", "Lcom/avito/android/trx_promo_goods/screens/configure/item/commission/d;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f303494b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<Float, G0> f303495c;

    /* compiled from: TrxPromoGoodsConfigureCommissionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lkotlin/G0;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Float, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f303496l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ e f303497m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, e eVar) {
            super(1);
            this.f303496l = cVar;
            this.f303497m = eVar;
        }

        @Override // Y41.l
        public final G0 invoke(Float f12) {
            float fFloatValue = f12.floatValue();
            if (fFloatValue != this.f303496l.f303488c) {
                this.f303497m.f303495c.invoke(Float.valueOf(fFloatValue));
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super DeepLink, G0> lVar, @k l<? super Float, G0> lVar2) {
        this.f303494b = lVar;
        this.f303495c = lVar2;
    }

    public final void O(@k i iVar, @k c cVar) {
        l<DeepLink, G0> lVar = this.f303494b;
        f fVar = new f(lVar);
        AttributedText attributedText = cVar.f303487b;
        attributedText.setOnDeepLinkClickListener(fVar);
        iVar.e(attributedText);
        iVar.WP(cVar.f303490e, cVar.f303491f, cVar.f303492g);
        iVar.A9(cVar.f303489d);
        Iterator it = cVar.f303493h.iterator();
        while (it.hasNext()) {
            AttributedText attributedText2 = ((KF0.a) it.next()).f9378b;
            if (attributedText2 != null) {
                attributedText2.setOnDeepLinkClickListener(new g(lVar));
            }
        }
        k(iVar, cVar);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        O((i) eVar, (c) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        c cVar = (c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Bundle) {
                obj = obj2;
            }
        }
        Bundle bundle = (Bundle) (obj instanceof Bundle ? obj : null);
        if (bundle == null || !bundle.getBoolean("trx_promo_goods_payload_commission_value_change")) {
            O(iVar, cVar);
        } else {
            k(iVar, cVar);
        }
    }

    public final void k(i iVar, c cVar) {
        Object next;
        iVar.Y5();
        iVar.R6(cVar.f303488c);
        iVar.Q8(new a(cVar, this));
        Iterator it = cVar.f303493h.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((KF0.a) next).f9377a.e(Float.valueOf(cVar.f303488c))) {
                break;
            }
        }
        iVar.RE((KF0.a) next);
    }
}
