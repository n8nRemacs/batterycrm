package com.avito.android.tariff_lf_constructor.configure.locations.viewmodel;

import androidx.compose.runtime.internal.P;
import com.avito.android.tariff_lf_constructor.configure.locations.items.badges.LocationBadgesItem;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import oD0.C44627a;
import oD0.C44628b;
import uD0.C48885b;

/* compiled from: ConstructorConfigureLocationsConverter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/locations/viewmodel/b;", "Lcom/avito/android/tariff_lf_constructor/configure/locations/viewmodel/a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.checkbox_selector.a f299955a;

    @Inject
    public b(@Y61.k com.avito.android.tariff_lf_constructor.configure.checkbox_selector.a aVar) {
        this.f299955a = aVar;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.a
    @Y61.k
    public final C44627a a(@Y61.k C48885b c48885b) {
        return new C44627a(new C44628b(c48885b.getTitle()), C42745f0.h0(this.f299955a.a(c48885b.d(), false), Collections.singletonList(new LocationBadgesItem("location_badges_id", c48885b.getBadges().getCollapseTitle(), C42784z0.f406748b))), c48885b.getButton(), c48885b.getAlertInfo());
    }
}
