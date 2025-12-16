package com.avito.android.user_stats.extended_user_stats;

import KV.a;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.design.tooltip.state.TooltipState;
import com.avito.android.util.C35835l0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f317306b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f317307c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f317308d;

    public /* synthetic */ q(View view, r rVar) {
        this.f317308d = rVar;
        this.f317307c = view;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        switch (this.f317306b) {
            case 0:
                r rVar = (r) this.f317308d;
                com.avito.android.lib.design.tooltip.k kVar = rVar.f317321k;
                if (kVar != null) {
                    kVar.dismiss();
                }
                View view = this.f317307c;
                com.avito.android.lib.design.tooltip.k kVar2 = new com.avito.android.lib.design.tooltip.k(view.getContext(), 0, 0, 6, null);
                kVar2.f181224j = new r.a(new i.a(new b.a()));
                com.avito.android.lib.design.tooltip.p.a(kVar2, new A(view, rVar));
                rVar.f317321k = kVar2.f(view);
                break;
            default:
                View view2 = this.f317307c;
                Context context = view2.getContext();
                Resources resources = context.getResources();
                com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(context, 0, 0, 6, null);
                a.C0572a c0572a = KV.a.f9464v;
                int iJ2 = C35835l0.j(R.attr.tooltipSmall, context);
                c0572a.getClass();
                kVar3.c(a.C0572a.b(iJ2, context));
                kVar3.b(new TooltipState(new r.a(new i.a(new b.a())), true, null, resources.getString(R.string.user_stats_spaces_tooltip_title), resources.getString(R.string.user_stats_spaces_tooltip_description), null, null, null, null, null, true, new z((Y41.a) this.f317308d, kVar3), view2, TooltipState.State.f181285b, 996, null));
                break;
        }
    }

    public /* synthetic */ q(r rVar, View view, Y41.a aVar) {
        this.f317307c = view;
        this.f317308d = aVar;
    }
}
