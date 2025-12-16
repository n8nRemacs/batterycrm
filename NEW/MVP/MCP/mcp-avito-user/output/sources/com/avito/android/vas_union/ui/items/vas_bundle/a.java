package com.avito.android.vas_union.ui.items.vas_bundle;

import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bV.C25568a;
import com.avito.android.R;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.selector_card.r;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.android.vas_union.ui.items.vas_bundle.c;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VasUnionV2BundleContentBinder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/ui/items/vas_bundle/a;", "Lcom/avito/android/lib/design/selector_card/f;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.lib.design.selector_card.f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f323265a;

    /* renamed from: b, reason: collision with root package name */
    public final int f323266b = y6.b(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f323267c = y6.b(14);

    /* renamed from: d, reason: collision with root package name */
    @l
    public DockingBadge f323268d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public TextView f323269e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public SimpleDraweeView f323270f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public TextView f323271g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public LinearLayout f323272h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public TextView f323273i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public StrikethroughTextView f323274j;

    public a(@Y61.k com.avito.android.util.text.a aVar) {
        this.f323265a = aVar;
    }

    @Override // com.avito.android.lib.design.selector_card.f
    public final void a(@Y61.k View view) {
        this.f323268d = (DockingBadge) view.findViewById(R.id.vas_union_v2_bundle_content_discount_badge);
        this.f323269e = (TextView) view.findViewById(R.id.vas_union_v2_bundle_content_price_hint);
        this.f323270f = (SimpleDraweeView) view.findViewById(R.id.vas_union_v2_bundle_content_image);
        this.f323271g = (TextView) view.findViewById(R.id.vas_union_v2_bundle_content_title);
        this.f323272h = (LinearLayout) view.findViewById(R.id.vas_union_v2_bundle_content_benefits);
        this.f323273i = (TextView) view.findViewById(R.id.vas_union_v2_bundle_content_price);
        this.f323274j = (StrikethroughTextView) view.findViewById(R.id.vas_union_v2_bundle_content_budget);
    }

    @Override // com.avito.android.lib.design.selector_card.f
    public final void b(@Y61.k r rVar) {
        c.a aVar = (c.a) rVar;
        TextView textView = this.f323269e;
        com.avito.android.util.text.a aVar2 = this.f323265a;
        if (textView != null) {
            com.avito.android.util.text.j.a(textView, aVar.f323281d, aVar2);
        }
        c.a.b bVar = aVar.f323282e;
        if (bVar == null) {
            DockingBadge dockingBadge = this.f323268d;
            if (dockingBadge != null) {
                D6.w(dockingBadge);
            }
        } else {
            DockingBadge dockingBadge2 = this.f323268d;
            if (dockingBadge2 != null) {
                int iF2 = com.avito.android.lib.util.f.f(dockingBadge2.getContext(), bVar.f323292b);
                C25568a.C2002a c2002a = C25568a.f57090g;
                Context context = dockingBadge2.getContext();
                c2002a.getClass();
                dockingBadge2.setStyle(C25568a.C2002a.b(iF2, context));
                dockingBadge2.setText(bVar.f323291a);
                D6.H(dockingBadge2);
            }
        }
        SimpleDraweeView simpleDraweeView = this.f323270f;
        if (simpleDraweeView != null) {
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(aVar.f323283f, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))), null, null, null, 14);
        }
        TextView textView2 = this.f323271g;
        if (textView2 != null) {
            com.avito.android.util.text.j.c(textView2, aVar.f323284g, aVar2);
        }
        LinearLayout linearLayout = this.f323272h;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() != 0) {
                linearLayout.removeAllViews();
            }
            for (c.a.C9993a c9993a : aVar.f323285h) {
                LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
                linearLayout2.setOrientation(0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, this.f323266b, 0, 0);
                linearLayout2.setLayoutParams(layoutParams);
                com.avito.android.lib.design.text_view.a aVar3 = new com.avito.android.lib.design.text_view.a(linearLayout.getContext(), null, 0, 0, 14, null);
                com.avito.android.util.text.j.c(aVar3, c9993a.f323290b, aVar2);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMargins(0, 0, this.f323267c, 0);
                aVar3.setLayoutParams(layoutParams2);
                com.avito.android.lib.design.text_view.a aVar4 = new com.avito.android.lib.design.text_view.a(linearLayout.getContext(), null, 0, 0, 14, null);
                com.avito.android.util.text.j.c(aVar4, c9993a.f323289a, aVar2);
                aVar4.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                linearLayout2.addView(aVar3);
                linearLayout2.addView(aVar4);
                linearLayout.addView(linearLayout2);
            }
        }
        TextView textView3 = this.f323273i;
        if (textView3 != null) {
            com.avito.android.util.text.j.c(textView3, aVar.f323286i, aVar2);
        }
        StrikethroughTextView strikethroughTextView = this.f323274j;
        if (strikethroughTextView != null) {
            com.avito.android.util.text.j.a(strikethroughTextView, aVar.f323287j, aVar2);
        }
    }
}
