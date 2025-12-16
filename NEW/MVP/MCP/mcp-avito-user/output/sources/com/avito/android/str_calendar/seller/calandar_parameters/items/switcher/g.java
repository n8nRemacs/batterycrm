package com.avito.android.str_calendar.seller.calandar_parameters.items.switcher;

import Gy0.InterfaceC13931a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.items.SwitcherItem;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SwitcherItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/switcher/g;", "LTV0/d;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/switcher/i;", "Lcom/avito/android/items/SwitcherItem;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements TV0.d<i, SwitcherItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13931a, G0> f287280b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super InterfaceC13931a, G0> lVar) {
        this.f287280b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        SwitcherItem switcherItem = (SwitcherItem) aVar;
        iVar.Jg();
        iVar.O0(switcherItem.f173918c, switcherItem.f173925j);
        AttributedText attributedText = switcherItem.f173922g;
        iVar.a50(attributedText);
        iVar.setChecked(switcherItem.f173919d);
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 27));
        }
        iVar.V4(new f(this, switcherItem));
    }
}
