package com.avito.android.developments_agency_search.screen.deal_room;

import Cw.InterfaceC13362a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.developments_agency_search.utils.AppBarStateChangeListener;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.P5;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.component.appbar.ActionMenu;

/* compiled from: DealRoomAppBarView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/c;", "Lcom/avito/android/developments_agency_search/screen/deal_room/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements com.avito.android.developments_agency_search.screen.deal_room.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AppBarLayout f137464a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f137465b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f137466c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f137467d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f137468e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f137469f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f137470g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f137471h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f137472i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f137473j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f137474k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Button f137475l;

    /* compiled from: DealRoomAppBarView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/developments_agency_search/screen/deal_room/c$a", "Lcom/avito/android/developments_agency_search/utils/AppBarStateChangeListener;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AppBarStateChangeListener {
        public a() {
        }

        @Override // com.avito.android.developments_agency_search.utils.AppBarStateChangeListener
        public final void a(@Y61.k AppBarStateChangeListener.State state) {
            boolean z12 = state == AppBarStateChangeListener.State.f139061c;
            boolean z13 = state == AppBarStateChangeListener.State.f139060b;
            c cVar = c.this;
            c.a(cVar.f137468e, z12);
            c.a(cVar.f137465b, z12);
            c.a(cVar.f137469f, z13);
        }
    }

    public c(@Y61.k AppBarLayout appBarLayout, @Y61.k Y41.l<? super InterfaceC13362a, G0> lVar) {
        this.f137464a = appBarLayout;
        View viewFindViewById = appBarLayout.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        toolbar.setNavigationIcon(R.drawable.ic_back_24_black);
        toolbar.setNavigationOnClickListener(new com.avito.android.advert.item.compatibility.v2.m(19, lVar));
        P5.a(toolbar, 0, new ActionMenu(toolbar.getContext().getString(R.string.das_deal_room_toolbar_action_edit_client_info), 2, Integer.valueOf(R.drawable.common_ic_edit_outline_24), Integer.valueOf(R.attr.black), null, 16, null));
        com.avito.android.ui.d.a(toolbar.getMenu().getItem(0), new b(0, lVar));
        View viewFindViewById2 = appBarLayout.findViewById(R.id.avatar_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f137465b = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = appBarLayout.findViewById(R.id.avatar);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f137466c = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = appBarLayout.findViewById(R.id.avatar_placeholder);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137467d = (TextView) viewFindViewById4;
        View viewFindViewById5 = appBarLayout.findViewById(R.id.toolbar_title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137468e = (TextView) viewFindViewById5;
        View viewFindViewById6 = appBarLayout.findViewById(R.id.expandedToolbarContainer);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f137469f = (ViewGroup) viewFindViewById6;
        View viewFindViewById7 = appBarLayout.findViewById(R.id.big_avatar);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f137470g = (SimpleDraweeView) viewFindViewById7;
        View viewFindViewById8 = appBarLayout.findViewById(R.id.big_avatar_placeholder);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137471h = (TextView) viewFindViewById8;
        View viewFindViewById9 = appBarLayout.findViewById(R.id.client_name);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137472i = (TextView) viewFindViewById9;
        View viewFindViewById10 = appBarLayout.findViewById(R.id.phone);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137473j = (TextView) viewFindViewById10;
        View viewFindViewById11 = appBarLayout.findViewById(R.id.email);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137474k = (TextView) viewFindViewById11;
        View viewFindViewById12 = appBarLayout.findViewById(R.id.call_button);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById12;
        button.setImageResource(R.drawable.common_ic_call_outline_20);
        button.setOnClickListener(new com.avito.android.advert.item.compatibility.v2.m(20, lVar));
        this.f137475l = button;
        appBarLayout.a(new a());
    }

    public static void a(View view, boolean z12) {
        view.animate().alpha(z12 ? 1.0f : 0.0f).setDuration(300L).start();
    }
}
