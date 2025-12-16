package com.avito.android.user_stats.extended_user_stats;

import SK0.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.ui.SafeViewPager;
import com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel;
import com.avito.android.user_stats.extended_user_stats.tabs.tab_item.UserStatsTabItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedUserStatsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/r;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f317309A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.C f317310B;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f317311a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.tab.adapter.j<UserStatsTabItem> f317312b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ExtendedUserStatsFragment f317313c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SK0.b f317314d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f317315e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AvitoTabLayout f317316f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SafeViewPager f317317g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final HorizontalScrollView f317318h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f317319i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f317320j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f317321k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Integer> f317322l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f317323m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ExtendedUserStatsViewModel.ConfigType> f317324n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ExtendedUserStatsViewModel.ConfigType> f317325o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f317326p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f317327q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f317328r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public ExtendedUserStatsViewModel.c f317329s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f317330t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f317331u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f317332v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f317333w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f317334x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f317335y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f317336z;

    /* compiled from: ExtendedUserStatsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ExtendedUserStatsViewModel.ConfigProgressState.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ExtendedUserStatsViewModel.ConfigProgressState configProgressState = ExtendedUserStatsViewModel.ConfigProgressState.f317081b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ExtendedUserStatsViewModel.ConfigProgressState configProgressState2 = ExtendedUserStatsViewModel.ConfigProgressState.f317081b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ExtendedUserStatsViewModel.ConfigType.values().length];
            try {
                iArr2[4] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ExtendedUserStatsViewModel.ConfigType configType = ExtendedUserStatsViewModel.ConfigType.f317086c;
                iArr2[6] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ExtendedUserStatsViewModel.ConfigType configType2 = ExtendedUserStatsViewModel.ConfigType.f317086c;
                iArr2[8] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public r(@Y61.k View view, @Y61.k com.avito.android.lib.deprecated_design.tab.adapter.j jVar, @Y61.k ExtendedUserStatsFragment extendedUserStatsFragment, @Y61.k lE.g gVar, @Y61.k SK0.b bVar, @Y61.k com.avito.android.util.text.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f317311a = view;
        this.f317312b = jVar;
        this.f317313c = extendedUserStatsFragment;
        this.f317314d = bVar;
        this.f317315e = aVar;
        View viewFindViewById = view.findViewById(R.id.extended_stats_tabs);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.tab_layout.AvitoTabLayout");
        }
        AvitoTabLayout avitoTabLayout = (AvitoTabLayout) viewFindViewById;
        this.f317316f = avitoTabLayout;
        View viewFindViewById2 = view.findViewById(R.id.extended_stats_view_pager);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.ui.SafeViewPager");
        }
        SafeViewPager safeViewPager = (SafeViewPager) viewFindViewById2;
        this.f317317g = safeViewPager;
        View viewFindViewById3 = view.findViewById(R.id.v_stats_settings_group);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.HorizontalScrollView");
        }
        this.f317318h = (HorizontalScrollView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.ll_stats_settings);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f317319i = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.extended_user_stats_fragment_root);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById5, R.id.ll_user_stats, interfaceC28373a, 0, 0, 24, null);
        this.f317320j = lVar;
        com.jakewharton.rxrelay3.c<Integer> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f317322l = cVar;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f317323m = cVar2;
        com.jakewharton.rxrelay3.c<ExtendedUserStatsViewModel.ConfigType> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f317324n = cVar3;
        com.jakewharton.rxrelay3.c<ExtendedUserStatsViewModel.ConfigType> cVar4 = new com.jakewharton.rxrelay3.c<>();
        this.f317325o = cVar4;
        com.jakewharton.rxrelay3.c<DeepLink> cVar5 = new com.jakewharton.rxrelay3.c<>();
        this.f317326p = cVar5;
        com.jakewharton.rxrelay3.c<String> cVar6 = new com.jakewharton.rxrelay3.c<>();
        this.f317327q = cVar6;
        this.f317332v = cVar3;
        this.f317333w = cVar4;
        this.f317334x = cVar;
        this.f317335y = cVar5;
        this.f317336z = cVar6;
        this.f317309A = cVar2;
        this.f317310B = lVar.e();
        v vVar = new v(this);
        avitoTabLayout.postDelayed(vVar, 300L);
        avitoTabLayout.addOnAttachStateChangeListener(new w(avitoTabLayout, vVar));
        com.avito.android.lib.deprecated_design.tab.l.d(avitoTabLayout, new com.avito.android.lib.deprecated_design.tab.adapter.c(jVar, extendedUserStatsFragment.requireContext(), 0, x.f318264b, 4, null));
        avitoTabLayout.setupWithViewPager(safeViewPager);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.extended_user_stats_toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_back_24);
        toolbar.setNavigationOnClickListener(new o(this, 1));
    }

    public static View c(final r rVar, int i12, Context context, String str, Integer num, final ExtendedUserStatsViewModel.ConfigType configType) {
        rVar.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(i12, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.btn_stats);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.v_stats);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        if (str.length() > 23) {
            str = str.substring(0, 23).concat("...");
        }
        button.setText(str);
        final int i13 = 0;
        button.setOnClickListener(new View.OnClickListener(rVar) { // from class: com.avito.android.user_stats.extended_user_stats.p

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ r f317304c;

            {
                this.f317304c = rVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.f317304c.f317324n.accept(configType);
                        break;
                    default:
                        this.f317304c.f317325o.accept(configType);
                        break;
                }
            }
        });
        Button.g(button, configType == ExtendedUserStatsViewModel.ConfigType.f317086c ? context.getDrawable(R.drawable.user_stats_ic_calendar_outlined) : null, C35835l0.h(num.intValue(), context), false, null, 12);
        if (num.intValue() == R.attr.ic_close16) {
            final int i14 = 1;
            viewFindViewById2.setOnClickListener(new View.OnClickListener(rVar) { // from class: com.avito.android.user_stats.extended_user_stats.p

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ r f317304c;

                {
                    this.f317304c = rVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            this.f317304c.f317324n.accept(configType);
                            break;
                        default:
                            this.f317304c.f317325o.accept(configType);
                            break;
                    }
                }
            });
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, D6.i(2, context), 0);
        button.setLayoutParams(layoutParams);
        return viewInflate;
    }

    public final void a(ExtendedUserStatsViewModel.b bVar, boolean z12) {
        String str;
        ExtendedUserStatsViewModel.c cVar;
        List<ExtendedUserStatsViewModel.b> list;
        List<ExtendedUserStatsViewModel.b> list2;
        List<ExtendedUserStatsViewModel.b> list3;
        ExtendedUserStatsViewModel.ConfigType configType = ExtendedUserStatsViewModel.ConfigType.f317086c;
        ExtendedUserStatsViewModel.ConfigType configType2 = bVar.f317103c;
        int iIndexOf = 0;
        boolean z13 = bVar.f317102b;
        boolean z14 = configType2 == configType || configType2 == ExtendedUserStatsViewModel.ConfigType.f317092i || !z13;
        if (configType2 != configType || z13 || (str = bVar.f317104d) == null) {
            str = bVar.f317101a;
        }
        int i12 = z14 ? R.layout.user_stats_config_button_primary : R.layout.config_button_secondary;
        LinearLayout linearLayout = this.f317319i;
        Context context = linearLayout.getContext();
        if (str == null) {
            str = "";
        }
        View viewC = c(this, i12, context, str, Integer.valueOf(z13 ? R.attr.ic_arrowExpandLess16 : R.attr.ic_close16), bVar.f317103c);
        viewC.setTag(configType2.f317097b);
        if (z12 && !z13) {
            linearLayout.addView(viewC, 1);
            return;
        }
        if (!z12 || ((cVar = this.f317329s) != null && (list3 = cVar.f317106a) != null && list3.size() == 0)) {
            linearLayout.addView(viewC);
            return;
        }
        ExtendedUserStatsViewModel.c cVar2 = this.f317329s;
        ExtendedUserStatsViewModel.b bVar2 = null;
        if (cVar2 != null && (list2 = cVar2.f317106a) != null) {
            ListIterator<ExtendedUserStatsViewModel.b> listIterator = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                ExtendedUserStatsViewModel.b bVarPrevious = listIterator.previous();
                if (!bVarPrevious.f317102b) {
                    bVar2 = bVarPrevious;
                    break;
                }
            }
            bVar2 = bVar2;
        }
        ExtendedUserStatsViewModel.c cVar3 = this.f317329s;
        if (cVar3 != null && (list = cVar3.f317106a) != null) {
            iIndexOf = list.indexOf(bVar2);
        }
        linearLayout.addView(viewC, iIndexOf >= 1 ? 1 + iIndexOf : 1);
    }

    public final void b() {
        ExtendedUserStatsViewModel.b bVar;
        String str;
        List<ExtendedUserStatsViewModel.b> list;
        Object next;
        ExtendedUserStatsViewModel.b bVar2;
        List<ExtendedUserStatsViewModel.b> list2;
        Object next2;
        ExtendedUserStatsViewModel.c cVar;
        List<ExtendedUserStatsViewModel.b> list3;
        Object next3;
        int i12 = 2;
        if (this.f317328r) {
            AvitoTabLayout avitoTabLayout = this.f317316f;
            int selectedTabPosition = avitoTabLayout.getSelectedTabPosition();
            Button button = null;
            LinearLayout linearLayout = this.f317319i;
            if (selectedTabPosition == 0) {
                ExtendedUserStatsViewModel.ConfigType configType = ExtendedUserStatsViewModel.ConfigType.f317086c;
                d("SETTINGS");
                d("METRICS");
                d("SPENDINGS");
            } else if (selectedTabPosition == 1) {
                d("SPENDINGS");
                View viewFindViewWithTag = linearLayout.findViewWithTag("METRICS");
                ExtendedUserStatsViewModel.c cVar2 = this.f317329s;
                if (cVar2 == null || (list2 = cVar2.f317106a) == null) {
                    bVar2 = null;
                } else {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        } else {
                            next2 = it.next();
                            if (((ExtendedUserStatsViewModel.b) next2).f317103c == ExtendedUserStatsViewModel.ConfigType.f317092i) {
                                break;
                            }
                        }
                    }
                    bVar2 = (ExtendedUserStatsViewModel.b) next2;
                }
                if (viewFindViewWithTag == null && bVar2 != null) {
                    Context context = linearLayout.getContext();
                    String str2 = bVar2.f317101a;
                    View viewC = c(this, R.layout.user_stats_config_button_primary, context, str2 == null ? "" : str2, Integer.valueOf(bVar2.f317102b ? R.attr.ic_arrowExpandLess16 : R.attr.ic_close16), ExtendedUserStatsViewModel.ConfigType.f317092i);
                    viewC.setTag("METRICS");
                    linearLayout.addView(viewC, 1);
                    if (this.f317331u) {
                        View viewFindViewById = viewC.findViewById(R.id.sl_filter_chips);
                        if (viewFindViewById == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout");
                        }
                        ShimmerLayout shimmerLayout = (ShimmerLayout) viewFindViewById;
                        shimmerLayout.c();
                        viewC.postDelayed(new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(shimmerLayout, i12), 4500L);
                        this.f317331u = false;
                    }
                }
            } else if (selectedTabPosition == 2) {
                d("SETTINGS");
                d("METRICS");
                if (linearLayout.findViewWithTag("SPENDINGS") == null && (cVar = this.f317329s) != null && (list3 = cVar.f317106a) != null) {
                    Iterator<T> it2 = list3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next3 = null;
                            break;
                        } else {
                            next3 = it2.next();
                            if (((ExtendedUserStatsViewModel.b) next3).f317103c == ExtendedUserStatsViewModel.ConfigType.f317090g) {
                                break;
                            }
                        }
                    }
                    ExtendedUserStatsViewModel.b bVar3 = (ExtendedUserStatsViewModel.b) next3;
                    if (bVar3 != null) {
                        if (!this.f317330t) {
                            b.a.a(this.f317314d, SJ0.b.f14898a, null, null, null, 14);
                            this.f317330t = true;
                        }
                        a(bVar3, true);
                    }
                }
            }
            ExtendedUserStatsViewModel.c cVar3 = this.f317329s;
            if (cVar3 == null || (list = cVar3.f317106a) == null) {
                bVar = null;
            } else {
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it3.next();
                        if (((ExtendedUserStatsViewModel.b) next).f317103c == ExtendedUserStatsViewModel.ConfigType.f317086c) {
                            break;
                        }
                    }
                }
                bVar = (ExtendedUserStatsViewModel.b) next;
            }
            if (bVar != null && (str = bVar.f317104d) != null) {
                boolean z12 = avitoTabLayout.getSelectedTabPosition() == 2;
                boolean z13 = avitoTabLayout.getSelectedTabPosition() == 1;
                if (!z12 && !z13) {
                    str = bVar.f317101a;
                }
                int i13 = bVar.f317102b ? R.attr.ic_arrowExpandLess16 : R.attr.ic_close16;
                ExtendedUserStatsViewModel.ConfigType configType2 = ExtendedUserStatsViewModel.ConfigType.f317086c;
                View viewFindViewWithTag2 = linearLayout.findViewWithTag("CALENDAR");
                if (viewFindViewWithTag2 != null) {
                    View viewFindViewById2 = viewFindViewWithTag2.findViewById(R.id.btn_stats);
                    if (viewFindViewById2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                    }
                    button = (Button) viewFindViewById2;
                }
                if (button != null) {
                    button.setText(str != null ? str : "");
                    Button.g(button, null, C35835l0.h(i13, viewFindViewWithTag2.getContext()), false, new u(this, bVar), 5);
                }
            }
            this.f317318h.setScrollX(0);
        }
    }

    public final void d(String str) {
        LinearLayout linearLayout = this.f317319i;
        View viewFindViewWithTag = linearLayout.findViewWithTag(str);
        if (viewFindViewWithTag != null) {
            linearLayout.removeView(viewFindViewWithTag);
        }
    }
}
