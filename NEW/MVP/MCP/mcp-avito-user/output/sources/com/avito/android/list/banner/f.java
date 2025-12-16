package com.avito.android.list.banner;

import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.search.suggest.PaddingInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import sK0.C48063a;

/* compiled from: BannerItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/list/banner/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/list/banner/e;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f181546k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f181547b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public PaddingInfo f181548c;

    /* renamed from: d, reason: collision with root package name */
    public final Banner f181549d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f181550e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f181551f;

    /* renamed from: g, reason: collision with root package name */
    public final SimpleDraweeView f181552g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f181553h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f181554i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f181555j;

    public f(@k View view) {
        super(view);
        this.f181547b = view;
        this.f181549d = (Banner) view.findViewById(R.id.banner_suggest_item);
        this.f181550e = (LinearLayout) view.findViewById(R.id.banner_centred_title_layout);
        this.f181551f = (LinearLayout) view.findViewById(R.id.banner_title_with_subtitle_layout);
        this.f181552g = (SimpleDraweeView) view.findViewById(R.id.banner_right_image);
        this.f181553h = (TextView) view.findViewById(R.id.banner_centred_title);
        this.f181554i = (TextView) view.findViewById(R.id.banner_title);
        this.f181555j = (TextView) view.findViewById(R.id.banner_subtitle);
    }

    @Override // com.avito.android.list.banner.e
    public final void N4(@l AttributedText attributedText, @l AttributedText attributedText2) {
        LinearLayout linearLayout = this.f181551f;
        LinearLayout linearLayout2 = this.f181550e;
        if (attributedText2 == null) {
            linearLayout2.setVisibility(0);
            linearLayout.setVisibility(8);
            j.a(this.f181553h, attributedText, null);
        } else {
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(0);
            j.a(this.f181554i, attributedText, null);
            j.a(this.f181555j, attributedText2, null);
        }
    }

    @Override // com.avito.android.list.banner.e
    public final void c(@k Y41.a<G0> aVar) {
        this.f181549d.setOnClickListener(new C(6, aVar));
    }

    @Override // com.avito.android.list.banner.e
    public final void i(@l UniversalImage universalImage) {
        int i12;
        SimpleDraweeView simpleDraweeView = this.f181552g;
        if (universalImage != null) {
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))), null, null, null, 14);
            i12 = 0;
        } else {
            i12 = 8;
        }
        simpleDraweeView.setVisibility(i12);
    }

    @Override // com.avito.android.list.banner.e
    public final void qv(@l PaddingInfo paddingInfo) {
        this.f181548c = paddingInfo;
    }

    @Override // com.avito.android.list.banner.e
    public final void v(@l UniversalColor universalColor) {
        int iD2;
        Banner banner = this.f181549d;
        if (universalColor != null) {
            iD2 = C48063a.f437606a.a(banner.getContext(), universalColor);
        } else {
            iD2 = C35835l0.d(R.attr.white, banner.getContext());
        }
        Banner.h(banner, ColorStateList.valueOf(iD2));
    }

    @Override // com.avito.android.list.banner.e
    @l
    /* renamed from: vJ, reason: from getter */
    public final PaddingInfo getF181548c() {
        return this.f181548c;
    }
}
