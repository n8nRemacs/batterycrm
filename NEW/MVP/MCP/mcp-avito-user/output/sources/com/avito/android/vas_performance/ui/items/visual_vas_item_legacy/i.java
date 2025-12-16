package com.avito.android.vas_performance.ui.items.visual_vas_item_legacy;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.Group;
import com.avito.android.R;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VisualVasItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/visual_vas_item_legacy/i;", "Lcom/avito/android/vas_performance/ui/items/visual_vas_item_legacy/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f321843n = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f321844b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f321845c;

    /* renamed from: d, reason: collision with root package name */
    public final SimpleDraweeView f321846d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f321847e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f321848f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f321849g;

    /* renamed from: h, reason: collision with root package name */
    public final Switcher f321850h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f321851i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f321852j;

    /* renamed from: k, reason: collision with root package name */
    public final SimpleDraweeView f321853k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f321854l;

    /* renamed from: m, reason: collision with root package name */
    public final Group f321855m;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f321844b = view;
        this.f321845c = aVar;
        this.f321846d = (SimpleDraweeView) view.findViewById(R.id.visual_vas_item_icon);
        this.f321847e = (TextView) view.findViewById(R.id.visual_vas_item_price);
        this.f321848f = (TextView) view.findViewById(R.id.visual_vas_item_price_old);
        this.f321849g = (TextView) view.findViewById(R.id.visual_vas_item_duration);
        this.f321850h = (Switcher) view.findViewById(R.id.visual_vas_item_switcher);
        this.f321851i = (TextView) view.findViewById(R.id.visual_vas_item_title);
        this.f321852j = (TextView) view.findViewById(R.id.visual_vas_item_description);
        this.f321853k = (SimpleDraweeView) view.findViewById(R.id.visual_vas_item_extra_option_icon);
        this.f321854l = (TextView) view.findViewById(R.id.visual_vas_item_extra_option_description);
        this.f321855m = (Group) view.findViewById(R.id.visual_vas_item_extra_option_group);
    }

    @Override // com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.h
    public final void L(@l AttributedText attributedText) {
        I5.a(this.f321847e, this.f321845c.c(this.f321844b.getContext(), attributedText), false);
    }

    @Override // com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.h
    public final void Z0(@l AttributedText attributedText) {
        I5.a(this.f321848f, this.f321845c.c(this.f321844b.getContext(), attributedText), false);
    }

    @Override // com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.h
    public final void Z8(@k com.avito.android.image_loader.a aVar) {
        C35949t5.c(this.f321846d, aVar, null, null, null, 14);
    }

    @Override // com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.h
    public final void aa(@k String str) {
        this.f321849g.setText(str);
    }

    @Override // com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.h
    public final void c(@k Y41.a<G0> aVar) {
        this.f321844b.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(24, aVar, this));
    }

    @Override // com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.h
    public final void g(@l AttributedText attributedText) {
        I5.a(this.f321852j, this.f321845c.c(this.f321844b.getContext(), attributedText), false);
    }

    @Override // com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.h
    public final void q30(@l UniversalImage universalImage, @l AttributedText attributedText) {
        G0 g02;
        Group group = this.f321855m;
        if (universalImage == null && attributedText == null) {
            D6.w(group);
            return;
        }
        D6.H(group);
        View view = this.f321844b;
        I5.a(this.f321854l, this.f321845c.c(view.getContext(), attributedText), false);
        SimpleDraweeView simpleDraweeView = this.f321853k;
        if (universalImage != null) {
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(view.getContext()))), null, null, null, 14);
            D6.H(simpleDraweeView);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(simpleDraweeView);
        }
    }

    @Override // com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.h
    public final void setSelected(boolean z12) throws Resources.NotFoundException {
        this.f321850h.setChecked(z12);
    }

    @Override // com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.h
    public final void setTitle(@k String str) {
        this.f321851i.setText(str);
    }
}
