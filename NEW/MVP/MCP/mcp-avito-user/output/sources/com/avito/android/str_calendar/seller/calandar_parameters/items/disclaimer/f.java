package com.avito.android.str_calendar.seller.calandar_parameters.items.disclaimer;

import Gy0.InterfaceC13931a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_calendar.seller.calandar_parameters.C35090a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: DisclaimerItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/disclaimer/f;", "LTV0/f;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/disclaimer/h;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/disclaimer/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements TV0.f<h, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13931a, G0> f287133b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super InterfaceC13931a, G0> lVar) {
        this.f287133b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        AttributedText attributedText = ((a) aVar).f287128c;
        attributedText.setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 26));
        ((h) eVar).a6(attributedText);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C35090a) {
                arrayList.add(obj);
            }
        }
        C35090a c35090a = (C35090a) C42745f0.G(arrayList);
        if (c35090a == null) {
            AttributedText attributedText = aVar2.f287128c;
            attributedText.setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 26));
            hVar.a6(attributedText);
        } else {
            AttributedText attributedText2 = c35090a.f286731a;
            if (attributedText2 != null) {
                attributedText2.setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 26));
                hVar.a6(attributedText2);
            }
        }
    }
}
