package com.avito.android.serp.adapter.search_bar;

import android.view.View;
import android.widget.FrameLayout;
import androidx.view.InterfaceC22983P;
import com.avito.android.C31100l2;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.search_view.SubscriptionButtonState;
import com.avito.android.search_view.Toolbar23SearchView;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchBarItemView.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/search_bar/M;", "Lcom/avito/android/serp/adapter/search_bar/I;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class M extends com.avito.konveyor.adapter.b implements I {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f271601b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f271602c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C31100l2 f271603d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final L f271604e;

    public M(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k View view, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC34822a interfaceC34822a, @Y61.k N n12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f271601b = view;
        FrameLayout frameLayoutA = n12.a((FrameLayout) view.findViewById(R.id.search_view_container));
        this.f271602c = frameLayoutA;
        this.f271603d = new C31100l2(interfaceC22983P, frameLayoutA, interfaceC35745a5, interfaceC34822a, interfaceC28373a, aVar);
        this.f271604e = new L(this);
    }

    @Y61.l
    public final View B80() {
        com.avito.android.search_view.v vVar = this.f271603d.f174866f;
        if (vVar instanceof Toolbar23SearchView) {
            return ((Toolbar23SearchView) vVar).getLoyaltyBonusesItemView();
        }
        return null;
    }

    @Y61.l
    public final View C80() {
        com.avito.android.search_view.v vVar = this.f271603d.f174866f;
        if (vVar instanceof Toolbar23SearchView) {
            return ((Toolbar23SearchView) vVar).getTicketItemView();
        }
        return null;
    }

    @Y61.l
    public final String D80() {
        return this.f271603d.f174866f.getHint();
    }

    public final void E80(boolean z12, boolean z13, boolean z14) {
        boolean z15 = !z12;
        C31100l2 c31100l2 = this.f271603d;
        com.avito.android.search_view.v vVar = c31100l2.f174866f;
        if (vVar instanceof com.avito.android.search_view.h) {
            ((com.avito.android.search_view.h) vVar).setCartEnabled(z15);
        }
        boolean z16 = !z13;
        com.avito.android.search_view.v vVar2 = c31100l2.f174866f;
        boolean z17 = vVar2 instanceof Toolbar23SearchView;
        if (z17) {
            ((Toolbar23SearchView) vVar2).setTicketEnabled(z16);
        }
        boolean z18 = !z14;
        if (z17) {
            ((Toolbar23SearchView) vVar2).setLoyaltyBonusesEnabled(z18);
        }
        c31100l2.f174866f.setMenu(R.menu.item_list);
        vVar2.getClass();
    }

    public final void F80(@Y61.k String str) {
        this.f271603d.f174866f.setHint(str);
    }

    public final void G80() {
        F80(this.f271601b.getResources().getString(R.string.search));
    }

    public final void H80() {
        this.f271603d.f174866f.p(SubscriptionButtonState.f264432d);
    }
}
