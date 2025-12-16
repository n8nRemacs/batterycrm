package com.avito.android.tariff.cpx.configure.landing.items.card;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.UniversalImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CpxConfigureLandingCardItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/items/card/h;", "LTV0/e;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface h extends TV0.e {

    /* compiled from: CpxConfigureLandingCardItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Ez(@k l lVar, @k com.avito.android.util.text.a aVar, @k ArrayList arrayList);

    void L1();

    void P3(@k List<DockingBadgeItem> list);

    void XR();

    void gc(@k ButtonAction buttonAction, @k l<? super DeepLink, G0> lVar);

    void i(@k UniversalImage universalImage);

    void lC();

    void p0();
}
