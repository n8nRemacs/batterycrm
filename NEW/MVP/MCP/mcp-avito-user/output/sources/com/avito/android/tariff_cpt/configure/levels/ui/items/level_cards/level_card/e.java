package com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.m;
import com.avito.android.image_loader.n;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.badge.g;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.c;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.O2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCptConfigureLevelsCardItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/ui/items/level_cards/level_card/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_cpt/configure/levels/ui/items/level_cards/level_card/d;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f297980l = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f297981b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f297982c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f297983d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinearLayout f297984e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f297985f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SimpleDraweeView f297986g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final DockingBadgeContainer f297987h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final FrameLayout f297988i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Badge f297989j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f297990k;

    public e(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f297981b = aVar;
        View viewFindViewById = view.findViewById(R.id.tariff_cpt_configure_levels_card_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f297982c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tariff_cpt_configure_levels_card_action_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f297983d = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tariff_cpt_configure_levels_card_advantages_list_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f297984e = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tariff_cpt_configure_levels_card_other_advantage_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f297985f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.tariff_cpt_configure_levels_card_other_advantage_icon);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f297986g = (SimpleDraweeView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.tariff_cpt_configure_levels_card_badge_bar);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.docking_badge.DockingBadgeContainer");
        }
        this.f297987h = (DockingBadgeContainer) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.tariff_cpt_configure_levels_card_badge_frame);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f297988i = (FrameLayout) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.tariff_cpt_configure_levels_card_badge);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f297989j = (Badge) viewFindViewById8;
        this.f297990k = view.getContext();
    }

    @Override // com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.d
    public final void Ad(@l Boolean bool) {
        Button button = this.f297983d;
        if (bool == null || bool.equals(Boolean.TRUE)) {
            D6.k(button);
        } else {
            D6.h(button);
        }
    }

    @Override // com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.d
    public final void Y(@k Y41.a<G0> aVar) {
        this.f297983d.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(17, aVar));
    }

    @Override // com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.d
    public final void kV(@l c.b bVar) {
        FrameLayout frameLayout = this.f297988i;
        if (bVar == null) {
            D6.w(frameLayout);
            return;
        }
        g.a aVar = com.avito.android.lib.design.badge.g.f178395r;
        Badge badge = this.f297989j;
        Context context = badge.getContext();
        int iJ2 = C35835l0.j(bVar.f297976b, badge.getContext());
        aVar.getClass();
        badge.setStyle(g.a.b(iJ2, context));
        badge.setState(new com.avito.android.lib.design.badge.f(bVar.f297975a, null, false, 2, null));
        D6.H(frameLayout);
    }

    @Override // com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.d
    public final void m00(@l c.C9103c c9103c) {
        TextView textView = this.f297985f;
        SimpleDraweeView simpleDraweeView = this.f297986g;
        G0 g02 = null;
        if (c9103c != null) {
            iC0.f fVar = c9103c.f297977a;
            m mVarA = n.a(fVar != null ? fVar.a(this.f297990k) : null);
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.d(mVarA);
            aVarA.c();
            com.avito.android.util.text.j.a(textView, c9103c.f297978b, this.f297981b);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            D6.w(textView);
            D6.w(simpleDraweeView);
        }
    }

    @Override // com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.d
    public final void mb(@l String str) {
        com.avito.android.lib.design.button.b.a(this.f297983d, str, false);
    }

    @Override // com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.d
    public final void n1(@l List<c.a> list) {
        LinearLayout linearLayout = this.f297984e;
        linearLayout.removeAllViews();
        Context context = this.f297990k;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (list != null) {
            for (c.a aVar : list) {
                ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflaterFrom.inflate(R.layout.cpt_level_advantage_layout, (ViewGroup) linearLayout, false);
                View viewFindViewById = constraintLayout.findViewById(R.id.cpt_advantage_text);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView = (TextView) viewFindViewById;
                View viewFindViewById2 = constraintLayout.findViewById(R.id.cpt_advantage_icon);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
                }
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById2;
                iC0.f fVar = aVar.f297973a;
                m mVarA = n.a(fVar != null ? fVar.a(context) : null);
                ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
                aVarA.d(mVarA);
                aVarA.c();
                com.avito.android.util.text.j.a(textView, aVar.f297974b, this.f297981b);
                linearLayout.addView(constraintLayout);
            }
        }
    }

    @Override // com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.d
    public final void r(@k AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f297982c, attributedText, this.f297981b);
    }

    @Override // com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.d
    public final void rd(@k Y41.a<G0> aVar) {
        this.f297985f.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(16, aVar));
    }

    @Override // com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.d
    public final void setLoading(boolean z12) {
        this.f297983d.setLoading(z12);
    }

    @Override // com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.d
    public final void t0(@l List<DockingBadgeItem> list) {
        boolean zA2 = O2.a(list);
        DockingBadgeContainer dockingBadgeContainer = this.f297987h;
        if (!zA2) {
            D6.w(dockingBadgeContainer);
            return;
        }
        if (list == null) {
            list = C42784z0.f406748b;
        }
        dockingBadgeContainer.setBadgeItems(list);
        D6.H(dockingBadgeContainer);
    }
}
