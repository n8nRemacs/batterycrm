package com.avito.android.brand_global_snippet;

import Y61.k;
import Y61.l;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: BrandGlobalSnippetViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/brand_global_snippet/j;", "Lcom/avito/android/brand_global_snippet/i;", "Lcom/avito/android/serp/c;", "_avito_bx-content_snippet_brand-global-snippet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends com.avito.android.serp.c implements i {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f107494l = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f107495b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f107496c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f107497d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f107498e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SimpleDraweeView f107499f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f107500g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ImageView f107501h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final View f107502i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f107503j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f107504k;

    public j(@k View view) {
        super(view);
        this.f107495b = view;
        View viewFindViewById = view.findViewById(R.id.container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f107496c = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f107497d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.price);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f107498e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f107499f = (SimpleDraweeView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.favoriteButtonCard);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f107500g = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.favoriteIcon);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f107501h = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.viewedBadge);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f107502i = viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.location);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f107503j = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.date);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f107504k = (TextView) viewFindViewById9;
    }

    @Override // com.avito.android.brand_global_snippet.i
    public final void gx(boolean z12) {
        this.f107501h.setImageDrawable(C35835l0.h(z12 ? R.attr.ic_favoritesFilled16 : R.attr.ic_favorites16, this.f107495b.getContext()));
    }

    @Override // com.avito.android.brand_global_snippet.i
    public final void we(@k String str, @k String str2, @l Image image, @k String str3, @k String str4, boolean z12, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2) {
        this.f107497d.setText(str);
        this.f107498e.setText(str2);
        this.f107500g.setOnClickListener(new com.avito.android.blueprint.date.interval.j(23, aVar));
        this.f107496c.setOnClickListener(new com.avito.android.blueprint.date.interval.j(24, aVar2));
        this.f107502i.setVisibility(z12 ? 0 : 8);
        int i12 = !C43066x.K(str3) ? 0 : 8;
        TextView textView = this.f107503j;
        textView.setVisibility(i12);
        textView.setText(str3);
        int i13 = C43066x.K(str4) ? 8 : 0;
        TextView textView2 = this.f107504k;
        textView2.setVisibility(i13);
        textView2.setText(str4);
        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(image);
        ColorDrawable colorDrawable = new ColorDrawable(C35835l0.d(R.attr.bg_default, this.f107495b.getContext()));
        SimpleDraweeView simpleDraweeView = this.f107499f;
        colorDrawable.setBounds(0, 0, simpleDraweeView.getWidth(), simpleDraweeView.getHeight());
        C35949t5.c(this.f107499f, aVarB, colorDrawable, null, null, 12);
    }
}
