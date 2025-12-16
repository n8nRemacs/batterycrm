package com.avito.android.serp.adapter.seller_element.seller_pin;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SellerElement;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.seller_promotions.o;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr0.C42418a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PinnedSellerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/seller_element/seller_pin/h;", "Lcom/avito/android/serp/adapter/seller_element/seller_pin/g;", "Lcom/avito/android/serp/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.android.serp.c implements g {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f271712j = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f271713b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f271714c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DockingBadgeContainer f271715d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f271716e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f271717f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f271718g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f271719h;

    /* renamed from: i, reason: collision with root package name */
    public final int f271720i;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.pinned_seller_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f271713b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.pinned_seller_preview);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f271714c = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.pinned_seller_badge_bar);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.docking_badge.DockingBadgeContainer");
        }
        this.f271715d = (DockingBadgeContainer) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.pinned_seller_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271716e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.pinned_seller_developer);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f271717f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.pinned_seller_arrow);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f271718g = viewFindViewById6;
        Context context = view.getContext();
        this.f271719h = context;
        this.f271720i = C35835l0.d(R.attr.gray54, context);
    }

    @Override // com.avito.android.serp.adapter.seller_element.seller_pin.g
    public final void EP(@l SellerElement.DeveloperInfo developerInfo) {
        I5.a(this.f271717f, developerInfo != null ? developerInfo.getAsDescription(this.f271720i) : null, false);
    }

    @Override // com.avito.android.serp.adapter.seller_element.seller_pin.g
    public final void My(@l Image image) {
        C35949t5.c(this.f271714c, com.avito.android.image_loader.b.b(image), null, null, null, 14);
    }

    @Override // com.avito.android.serp.adapter.seller_element.seller_pin.g
    public final void P3(@k List<SerpBadge> list) {
        List<SerpBadge> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(C42418a.a((SerpBadge) it.next(), this.f271719h));
        }
        this.f271715d.setBadgeItems(arrayList);
    }

    @Override // com.avito.android.serp.adapter.seller_element.seller_pin.g
    public final void c(@k Y41.a<G0> aVar) {
        this.f271713b.setOnClickListener(new o(25, aVar));
        this.f271718g.setOnClickListener(new o(26, aVar));
    }

    @Override // com.avito.android.serp.adapter.seller_element.seller_pin.g
    public final void setTitle(@k String str) {
        this.f271716e.setText(str);
    }
}
