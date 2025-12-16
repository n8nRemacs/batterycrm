package com.avito.android.advert.item.complementary;

import VU.b;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.item.similars.m;
import com.avito.android.advert.viewed.j;
import com.avito.android.advert_core.advert.q;
import com.avito.android.favorite.n;
import com.avito.android.favorite.s;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.ui.Chips;
import com.avito.android.lib.design.chips.ui.g;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35976x4;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ComplementaryBottomSheetView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/complementary/f;", "Lcom/avito/android/favorite/s;", "Lcom/avito/android/advert/viewed/j;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements s, j {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f74590b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.similars.a f74591c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f74592d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final n f74593e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.advert.viewed.f f74594f;

    /* renamed from: g, reason: collision with root package name */
    public final Chips f74595g;

    /* renamed from: h, reason: collision with root package name */
    public final RecyclerView f74596h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f74597i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f74598j;

    /* renamed from: k, reason: collision with root package name */
    public final Button f74599k;

    /* renamed from: l, reason: collision with root package name */
    public final ScrollView f74600l;

    /* renamed from: m, reason: collision with root package name */
    public final ShimmerLayout f74601m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.j f74602n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public m f74603o;

    public f(@k View view, @k com.avito.android.advert.item.similars.a aVar, @k com.avito.konveyor.adapter.a aVar2, @k n nVar, @k com.avito.android.advert.viewed.f fVar, @k q qVar, @k com.avito.konveyor.a aVar3) {
        this.f74590b = view;
        this.f74591c = aVar;
        this.f74592d = aVar2;
        this.f74593e = nVar;
        this.f74594f = fVar;
        Chips chips = (Chips) view.findViewById(R.id.chips_container);
        this.f74595g = chips;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.items_container);
        this.f74596h = recyclerView;
        this.f74597i = (LinearLayout) view.findViewById(R.id.placeholder);
        this.f74598j = (TextView) view.findViewById(R.id.placeholder_text);
        Button button = (Button) view.findViewById(R.id.reload_button);
        this.f74599k = button;
        this.f74600l = (ScrollView) view.findViewById(R.id.shimmer_container);
        this.f74601m = (ShimmerLayout) view.findViewById(R.id.shimmer_layout);
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar2, aVar3);
        this.f74602n = jVar;
        D6.w(chips);
        g.b bVar = com.avito.android.lib.design.chips.ui.g.f178794f;
        Context context = chips.getContext();
        int iJ2 = C35835l0.j(R.attr.chipsOutlinedSmall, chips.getContext());
        bVar.getClass();
        chips.setStyle(g.b.c(iJ2, context));
        recyclerView.setAdapter(jVar);
        view.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(aVar.getSpanCount()));
        recyclerView.l(qVar, -1);
        recyclerView.setItemAnimator(null);
        nVar.s4(this);
        fVar.d(this);
        b.a aVar4 = VU.b.f17147t;
        Context context2 = button.getContext();
        int iJ3 = C35835l0.j(R.attr.buttonSecondaryMedium, button.getContext());
        aVar4.getClass();
        button.setStyle(b.a.c(iJ3, context2));
    }

    @Override // com.avito.android.favorite.s, com.avito.android.advert.viewed.j, com.avito.android.serp.adapter.closable.e
    public final void C3(int i12) {
        C35976x4.c(i12, this.f74596h);
    }

    public final void a(boolean z12) {
        D6.G(this.f74600l, z12);
        ShimmerLayout shimmerLayout = this.f74601m;
        if (z12) {
            shimmerLayout.c();
        } else {
            shimmerLayout.d();
        }
    }
}
