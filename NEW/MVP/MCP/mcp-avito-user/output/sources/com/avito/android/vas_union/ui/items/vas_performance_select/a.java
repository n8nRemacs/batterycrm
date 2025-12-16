package com.avito.android.vas_union.ui.items.vas_performance_select;

import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import bV.C25568a;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.selector_card.r;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.android.vas_union.ui.items.vas_performance_select.c;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VasUnionV2PerformanceSelectContentBinder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/ui/items/vas_performance_select/a;", "Lcom/avito/android/lib/design/selector_card/f;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.lib.design.selector_card.f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f323337a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public View f323338b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public DockingBadge f323339c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public TextView f323340d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public StrikethroughTextView f323341e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public TextView f323342f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public SimpleDraweeView f323343g;

    /* renamed from: h, reason: collision with root package name */
    public final int f323344h = y6.b(16);

    public a(@Y61.k com.avito.android.util.text.a aVar) {
        this.f323337a = aVar;
    }

    @Override // com.avito.android.lib.design.selector_card.f
    public final void a(@Y61.k View view) {
        this.f323338b = view.findViewById(R.id.vas_union_v2_performance_select_content_container);
        this.f323339c = (DockingBadge) view.findViewById(R.id.vas_union_v2_performance_select_content_discount_badge);
        this.f323340d = (TextView) view.findViewById(R.id.vas_union_v2_performance_select_content_price);
        this.f323341e = (StrikethroughTextView) view.findViewById(R.id.vas_union_v2_performance_select_content_budget);
        this.f323342f = (TextView) view.findViewById(R.id.vas_union_v2_performance_select_content_title);
        this.f323343g = (SimpleDraweeView) view.findViewById(R.id.vas_union_v2_performance_select_content_image);
    }

    @Override // com.avito.android.lib.design.selector_card.f
    public final void b(@Y61.k r rVar) {
        c.a aVar = (c.a) rVar;
        View view = this.f323338b;
        c.a.C9995a c9995a = aVar.f323351d;
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), c9995a == null ? 0 : this.f323344h, view.getPaddingRight(), view.getPaddingBottom());
        }
        if (c9995a == null) {
            DockingBadge dockingBadge = this.f323339c;
            if (dockingBadge != null) {
                D6.w(dockingBadge);
            }
        } else {
            DockingBadge dockingBadge2 = this.f323339c;
            if (dockingBadge2 != null) {
                int iF2 = com.avito.android.lib.util.f.f(dockingBadge2.getContext(), c9995a.f323358b);
                C25568a.C2002a c2002a = C25568a.f57090g;
                Context context = dockingBadge2.getContext();
                c2002a.getClass();
                dockingBadge2.setStyle(C25568a.C2002a.b(iF2, context));
                dockingBadge2.setText(c9995a.f323357a);
                D6.H(dockingBadge2);
            }
        }
        TextView textView = this.f323340d;
        com.avito.android.util.text.a aVar2 = this.f323337a;
        if (textView != null) {
            com.avito.android.util.text.j.c(textView, aVar.f323352e, aVar2);
        }
        StrikethroughTextView strikethroughTextView = this.f323341e;
        if (strikethroughTextView != null) {
            com.avito.android.util.text.j.a(strikethroughTextView, aVar.f323353f, aVar2);
        }
        TextView textView2 = this.f323342f;
        if (textView2 != null) {
            com.avito.android.util.text.j.c(textView2, aVar.f323354g, aVar2);
        }
        SimpleDraweeView simpleDraweeView = this.f323343g;
        if (simpleDraweeView != null) {
            UniversalImage universalImage = aVar.f323355h;
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext())) : null), null, null, null, 14);
        }
    }
}
