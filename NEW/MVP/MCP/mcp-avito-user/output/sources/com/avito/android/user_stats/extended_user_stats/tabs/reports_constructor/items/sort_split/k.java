package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.sort_split;

import KV.a;
import RJ0.a;
import VU.b;
import Y41.l;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.design.tooltip.state.TooltipState;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SplitView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/sort_split/k;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/sort_split/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f318096e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f318097b;

    /* renamed from: c, reason: collision with root package name */
    public final Button f318098c;

    /* renamed from: d, reason: collision with root package name */
    public final Button f318099d;

    public k(@Y61.k View view) {
        super(view);
        this.f318097b = view;
        this.f318098c = (Button) view.findViewById(R.id.b_dynamic_sort_text);
        this.f318099d = (Button) view.findViewById(R.id.b_dynamic_sort);
    }

    @Override // com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.sort_split.f
    public final void kw(@Y61.k final SplitItemData splitItemData, @Y61.k final l<? super RJ0.a, G0> lVar) {
        UU.a aVar;
        Button button = this.f318098c;
        Context context = button.getContext();
        String str = splitItemData.f318077c;
        if (splitItemData.f318081g) {
            String str2 = str == null ? "" : str;
            Resources resources = context.getResources();
            ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
            aVar = new UU.a(str2, null, false, false, false, null, resources.getDrawable(R.drawable.ic_round_3, null), null, null, false, 938, null);
        } else {
            String str3 = str == null ? "" : str;
            Resources resources2 = context.getResources();
            ThreadLocal<TypedValue> threadLocal2 = androidx.core.content.res.i.f44673a;
            aVar = new UU.a(str3, null, false, false, false, null, resources2.getDrawable(R.drawable.ic_round_3, null), C35835l0.m(context, R.attr.ic_arrowExpandLess16, R.attr.black), null, false, 830, null);
        }
        b.a aVar2 = VU.b.f17147t;
        int iJ2 = C35835l0.j(R.attr.buttonSecondarySmall, context);
        aVar2.getClass();
        button.setStyle(b.a.c(iJ2, context));
        button.setState(aVar);
        button.setOnClickListener(new com.avito.android.seller_promotions.b(21, lVar));
        int iJ3 = C35835l0.j(R.attr.buttonSecondarySmall, context);
        aVar2.getClass();
        VU.b bVarC = b.a.c(iJ3, context);
        Button button2 = this.f318099d;
        button2.setStyle(bVarC);
        button2.setState(new UU.a(null, null, false, false, false, null, context.getResources().getDrawable(L.f(splitItemData.f318078d, "asc") ? R.drawable.ic_arrow_top : R.drawable.ic_arrow_down, null), null, null, false, 959, null));
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.sort_split.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = k.f318096e;
                if (splitItemData.f318079e) {
                    lVar.invoke(a.k.f14325a);
                }
            }
        });
        button2.setVisibility(splitItemData.f318079e ? 0 : 8);
        if (splitItemData.f318080f) {
            button.postDelayed(new Runnable() { // from class: com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.sort_split.h
                @Override // java.lang.Runnable
                public final void run() {
                    Button button3 = this.f318090b.f318098c;
                    Context context2 = button3.getContext();
                    com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(context2, 0, 0, 6, null);
                    a.C0572a c0572a = KV.a.f9464v;
                    int iJ4 = C35835l0.j(R.attr.tooltipSmall, context2);
                    c0572a.getClass();
                    kVar.c(a.C0572a.b(iJ4, context2));
                    r.d dVar = new r.d(new i.c(new b.c()));
                    String string = context2.getString(R.string.user_stats_tooltip_split);
                    String string2 = context2.getString(R.string.user_stats_tooltip_split_description);
                    String string3 = context2.getString(R.string.user_stats_tooltip_button);
                    TooltipState.State state = TooltipState.State.f181285b;
                    l lVar2 = lVar;
                    kVar.b(new TooltipState(dVar, false, new i(kVar, lVar2), string, string2, string3, new j(kVar, lVar2), null, null, null, false, null, button3, state, 2944, null));
                    kVar.f(button3);
                }
            }, 300L);
        }
    }
}
