package com.avito.android.vas_union.ui.items.vas_performance_click;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.text.j;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VasUnionV2PerformanceClickItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_union/ui/items/vas_performance_click/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/vas_union/ui/items/vas_performance_click/h;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f323332f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f323333b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f323334c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f323335d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f323336e;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f323333b = aVar;
        this.f323334c = (TextView) view.findViewById(R.id.vas_union_v2_performance_click_price);
        this.f323335d = (TextView) view.findViewById(R.id.vas_union_v2_performance_click_title);
        this.f323336e = (SimpleDraweeView) view.findViewById(R.id.vas_union_v2_performance_click_image);
    }

    @Override // com.avito.android.vas_union.ui.items.vas_performance_click.h
    public final void L(@k AttributedText attributedText) {
        j.c(this.f323334c, attributedText, this.f323333b);
    }

    @Override // com.avito.android.vas_union.ui.items.vas_performance_click.h
    public final void c(@k Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new com.avito.android.vas_planning_checkout.item.checkout.i(2, aVar));
    }

    @Override // com.avito.android.vas_union.ui.items.vas_performance_click.h
    public final void e(@k AttributedText attributedText) {
        j.c(this.f323335d, attributedText, this.f323333b);
    }

    @Override // com.avito.android.vas_union.ui.items.vas_performance_click.h
    public final void i(@l UniversalImage universalImage) {
        C35949t5.c(this.f323336e, com.avito.android.image_loader.b.b(universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f323336e.getContext())) : null), null, null, null, 14);
    }
}
