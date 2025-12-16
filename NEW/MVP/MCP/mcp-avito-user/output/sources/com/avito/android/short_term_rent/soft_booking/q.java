package com.avito.android.short_term_rent.soft_booking;

import KV.a;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.design.tooltip.state.TooltipState;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrSoftBookingFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "anchorView", "", "hint", "Lkotlin/G0;", "invoke", "(Landroid/view/View;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class q extends N implements Y41.p<View, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ StrSoftBookingFragment f282878l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(StrSoftBookingFragment strSoftBookingFragment) {
        super(2);
        this.f282878l = strSoftBookingFragment;
    }

    @Override // Y41.p
    public final G0 invoke(View view, String str) {
        View view2 = view;
        String str2 = str;
        StrSoftBookingFragment strSoftBookingFragment = this.f282878l;
        com.avito.android.lib.design.tooltip.k kVar = strSoftBookingFragment.f282548x0;
        if (kVar != null) {
            kVar.b(new TooltipState(null, false, null, null, null, null, null, null, null, null, false, null, null, TooltipState.State.f181286c, 8191, null));
        }
        com.avito.android.lib.design.tooltip.k kVar2 = new com.avito.android.lib.design.tooltip.k(strSoftBookingFragment.requireContext(), 0, 0, 6, null);
        a.C0572a c0572a = KV.a.f9464v;
        Context contextRequireContext = strSoftBookingFragment.requireContext();
        int iJ2 = C35835l0.j(R.attr.tooltipDefault, strSoftBookingFragment.requireContext());
        c0572a.getClass();
        kVar2.c(KV.a.a(a.C0572a.b(iJ2, contextRequireContext), -2, 0, 0, 2097150));
        kVar2.b(new TooltipState(new r.d(new i.a(new b.c())), true, null, null, str2, null, null, null, null, null, false, null, view2, TooltipState.State.f181285b, 3052, null));
        strSoftBookingFragment.f282548x0 = kVar2;
        return G0.f406611a;
    }
}
