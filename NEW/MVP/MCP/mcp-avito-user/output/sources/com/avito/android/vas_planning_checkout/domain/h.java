package com.avito.android.vas_planning_checkout.domain;

import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.vas_planning_checkout.item.checkout.PlanCheckoutItem;
import com.avito.android.vas_planning_checkout.item.disclaimer.VasPlanningDisclaimerItem;
import com.avito.android.vas_planning_checkout.item.header.VasPlanningHeaderItem;
import com.avito.android.vas_planning_checkout.item.price.PriceItem;
import com.avito.android.vas_planning_checkout.model.VasPlanCheckoutContent;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import lM0.C43657b;
import lM0.C43658c;
import lM0.InterfaceC43656a;

/* compiled from: VasPlanCheckoutConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/domain/h;", "Lcom/avito/android/vas_planning_checkout/domain/g;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning_checkout.item.price.k f322885a;

    /* compiled from: VasPlanCheckoutConverter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LlM0/a;", "element", "Lcom/avito/conveyor_item/ParcelableItem;", "invoke", "(LlM0/a;)Lcom/avito/conveyor_item/ParcelableItem;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<InterfaceC43656a, ParcelableItem> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final ParcelableItem invoke(InterfaceC43656a interfaceC43656a) {
            InterfaceC43656a interfaceC43656a2 = interfaceC43656a;
            h.this.getClass();
            if (!(interfaceC43656a2 instanceof C43657b)) {
                return null;
            }
            C43657b c43657b = (C43657b) interfaceC43656a2;
            String id2 = c43657b.getId();
            AttributedText title = c43657b.getTitle();
            String price = c43657b.getPrice();
            Integer priceValue = c43657b.getPriceValue();
            AttributedText oldPrice = c43657b.getOldPrice();
            Boolean cancellable = c43657b.getCancellable();
            return new PlanCheckoutItem(id2, title, price, oldPrice, c43657b.getIcon(), c43657b.getProlongation() != null, cancellable != null ? cancellable.booleanValue() : false, true, priceValue, c43657b.getJobBadge());
        }
    }

    @Inject
    public h(@Y61.k com.avito.android.vas_planning_checkout.item.price.k kVar) {
        this.f322885a = kVar;
    }

    @Override // com.avito.android.vas_planning_checkout.domain.g
    @Y61.k
    public final VasPlanCheckoutContent.Data a(@Y61.k C43658c c43658c) {
        Integer priceValue;
        ArrayList arrayListE0 = C42745f0.e0(new VasPlanningHeaderItem("header", c43658c.getTitle(), c43658c.getDescription()));
        C42745f0.h(C43033p.D(C43033p.y(new C42770s0(c43658c.f()), new a())), arrayListE0);
        List<InterfaceC43656a> listF = c43658c.f();
        ArrayList arrayList = new ArrayList(C42745f0.q(listF, 10));
        for (InterfaceC43656a interfaceC43656a : listF) {
            C43657b c43657b = interfaceC43656a instanceof C43657b ? (C43657b) interfaceC43656a : null;
            arrayList.add(Integer.valueOf((c43657b == null || (priceValue = c43657b.getPriceValue()) == null) ? 0 : priceValue.intValue()));
        }
        PriceItem priceItemA = this.f322885a.a(C42745f0.D0(arrayList), c43658c.getPrice());
        if (priceItemA != null) {
            arrayListE0.add(priceItemA);
        }
        AttributedText offer = c43658c.getOffer();
        if (offer != null) {
            arrayListE0.add(new VasPlanningDisclaimerItem("offer", offer, null, null, 12, null));
        }
        return new VasPlanCheckoutContent.Data(c43658c.getActionTitle(), c43658c.getCloseButtonTitle(), c43658c.getEmptyActionTitle(), arrayListE0, c43658c.getPrice(), c43658c.getDelayedAction());
    }
}
