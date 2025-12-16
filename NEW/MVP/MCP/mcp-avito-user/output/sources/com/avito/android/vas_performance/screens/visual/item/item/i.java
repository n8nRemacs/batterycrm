package com.avito.android.vas_performance.screens.visual.item.item;

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
import com.avito.android.util.text.j;
import com.avito.android.vas_performance.screens.visual.item.item.a;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VisualVasItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/item/item/i;", "Lcom/avito/android/vas_performance/screens/visual/item/item/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f321075l = 0;

    /* renamed from: b, reason: collision with root package name */
    public final SimpleDraweeView f321076b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f321077c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f321078d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f321079e;

    /* renamed from: f, reason: collision with root package name */
    public final Switcher f321080f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f321081g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f321082h;

    /* renamed from: i, reason: collision with root package name */
    public final SimpleDraweeView f321083i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f321084j;

    /* renamed from: k, reason: collision with root package name */
    public final Group f321085k;

    public i(@k View view) {
        super(view);
        this.f321076b = (SimpleDraweeView) view.findViewById(R.id.visual_vas_item_icon);
        this.f321077c = (TextView) view.findViewById(R.id.visual_vas_item_price);
        this.f321078d = (TextView) view.findViewById(R.id.visual_vas_item_price_old);
        this.f321079e = (TextView) view.findViewById(R.id.visual_vas_item_duration);
        this.f321080f = (Switcher) view.findViewById(R.id.visual_vas_item_switcher);
        this.f321081g = (TextView) view.findViewById(R.id.visual_vas_item_title);
        this.f321082h = (TextView) view.findViewById(R.id.visual_vas_item_description);
        this.f321083i = (SimpleDraweeView) view.findViewById(R.id.visual_vas_item_extra_option_icon);
        this.f321084j = (TextView) view.findViewById(R.id.visual_vas_item_extra_option_description);
        this.f321085k = (Group) view.findViewById(R.id.visual_vas_item_extra_option_group);
    }

    @Override // com.avito.android.vas_performance.screens.visual.item.item.h
    public final void L(@l AttributedText attributedText) {
        j.a(this.f321077c, attributedText, null);
    }

    @Override // com.avito.android.vas_performance.screens.visual.item.item.h
    public final void Z0(@l AttributedText attributedText) {
        j.a(this.f321078d, attributedText, null);
    }

    @Override // com.avito.android.vas_performance.screens.visual.item.item.h
    public final void Z8(@k com.avito.android.image_loader.a aVar) {
        C35949t5.c(this.f321076b, aVar, null, null, null, 14);
    }

    @Override // com.avito.android.vas_performance.screens.visual.item.item.h
    public final void aa(@k String str) {
        this.f321079e.setText(str);
    }

    @Override // com.avito.android.vas_performance.screens.visual.item.item.h
    public final void c(@k Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(19, aVar));
    }

    @Override // com.avito.android.vas_performance.screens.visual.item.item.h
    public final void g(@l AttributedText attributedText) {
        j.a(this.f321082h, attributedText, null);
    }

    @Override // com.avito.android.vas_performance.screens.visual.item.item.h
    public final void setSelected(boolean z12) throws Resources.NotFoundException {
        this.f321080f.setChecked(z12);
    }

    @Override // com.avito.android.vas_performance.screens.visual.item.item.h
    public final void setTitle(@k String str) {
        this.f321081g.setText(str);
    }

    @Override // com.avito.android.vas_performance.screens.visual.item.item.h
    public final void zi(@l a.b bVar) {
        G0 g02 = null;
        UniversalImage universalImage = bVar != null ? bVar.f321065a : null;
        Group group = this.f321085k;
        if (universalImage == null) {
            if ((bVar != null ? bVar.f321066b : null) == null) {
                D6.w(group);
                return;
            }
        }
        D6.H(group);
        j.a(this.f321084j, bVar.f321066b, null);
        SimpleDraweeView simpleDraweeView = this.f321083i;
        UniversalImage universalImage2 = bVar.f321065a;
        if (universalImage2 != null) {
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage2, com.avito.android.lib.util.darkTheme.c.b(this.itemView.getContext()))), null, null, null, 14);
            D6.H(simpleDraweeView);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            D6.w(simpleDraweeView);
        }
    }
}
