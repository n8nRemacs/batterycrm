package com.avito.android.service_booking_common.blueprints.check_price_list;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.util.I5;
import com.avito.android.util.p6;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import qt0.C47439c;

/* compiled from: SbCheckPriceListItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/check_price_list/n;", "Lcom/avito/android/service_booking_common/blueprints/check_price_list/e;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends e {
    @Inject
    public n() {
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) throws InterruptedException {
        Y((p) eVar, (C47439c) aVar);
    }

    public final void Y(@Y61.k p pVar, @Y61.k C47439c c47439c) throws InterruptedException {
        f fVar = new f(this);
        g gVar = new g(this);
        h hVar = new h(this, c47439c);
        I5.a(pVar.f276265d, c47439c.f429402d, false);
        boolean z12 = c47439c.f429403e;
        pVar.C80(z12);
        ViewGroup viewGroup = pVar.f276268g;
        viewGroup.removeAllViews();
        if (!z12) {
            pVar.B80(viewGroup, c47439c.f429404f, c47439c.f429401c, fVar, gVar);
        }
        pVar.f276266e.setOnClickListener(new A(3, hVar));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) throws InterruptedException {
        p pVar = (p) eVar;
        C47439c c47439c = (C47439c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof com.avito.android.service_booking_common.d) {
                obj = obj2;
            }
        }
        com.avito.android.service_booking_common.d dVar = (com.avito.android.service_booking_common.d) (obj instanceof com.avito.android.service_booking_common.d ? obj : null);
        if (dVar == null) {
            Y(pVar, c47439c);
            return;
        }
        ViewGroup viewGroup = pVar.f276268g;
        Boolean bool = dVar.f276502a;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            i iVar = new i(this);
            j jVar = new j(this);
            pVar.C80(zBooleanValue);
            if (zBooleanValue) {
                viewGroup.removeAllViews();
            } else {
                pVar.B80(pVar.f276268g, c47439c.f429404f, c47439c.f429401c, iVar, jVar);
            }
        }
        C47439c.a aVar2 = dVar.f276503b;
        if (aVar2 != null) {
            k kVar = new k(this);
            l lVar = new l(this);
            p6 p6Var = new p6(viewGroup);
            while (p6Var.hasNext()) {
                View view = (View) p6Var.next();
                if (((String) view.getTag()).equals(aVar2.f429405a)) {
                    View viewFindViewById = view.findViewById(R.id.sb_service_check);
                    if (viewFindViewById == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkbox");
                    }
                    ((Checkbox) viewFindViewById).setChecked(aVar2.f429409e);
                    View viewFindViewById2 = view.findViewById(R.id.sb_check_price_list_value);
                    if (viewFindViewById2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
                    }
                    ((DescriptionParameterItem) viewFindViewById2).setLeftTextIconClickListener(new com.avito.android.service_booking_calendar.flexible.header.toolbar.g(2, lVar, aVar2));
                    view.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(kVar, aVar2, c47439c.f429401c, 16));
                }
            }
        }
        pVar.f276266e.setOnClickListener(new A(3, new m(this, c47439c)));
    }
}
