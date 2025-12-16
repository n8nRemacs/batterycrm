package com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar;

import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.n;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VerticalMiniSearchToolbarView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/vertical_toolbar/vertical_mini_search_toolbar/k;", "Lcom/avito/android/bxcontent/vertical_toolbar/vertical_mini_search_toolbar/i;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f113216a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AppBarLayout f113217b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CollapsingToolbarLayout f113218c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f113219d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f113220e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f113221f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f113222g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f113223h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f113224i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f113225j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f113226k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public n f113227l;

    public k(@Y61.k View view) {
        this.f113216a = view;
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.bx_appbar);
        this.f113217b = appBarLayout;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) appBarLayout.findViewById(R.id.mini_search_collapsing_toolbar);
        this.f113218c = collapsingToolbarLayout;
        TextView textView = (TextView) appBarLayout.findViewById(R.id.mini_search_collapsing_title);
        this.f113219d = textView;
        this.f113220e = (TextView) appBarLayout.findViewById(R.id.mini_search_toolbar_title);
        this.f113221f = (SimpleDraweeView) view.findViewById(R.id.mini_search_collapsing_image);
        ImageView imageView = (ImageView) appBarLayout.findViewById(R.id.mini_search_navigation_icon);
        ImageView imageView2 = (ImageView) appBarLayout.findViewById(R.id.mini_search_search_icon);
        this.f113222g = appBarLayout.findViewById(R.id.mini_search_action_view);
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f113223h = cVar;
        this.f113224i = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f113225j = cVar2;
        this.f113226k = new C41981q0(cVar2);
        com.avito.android.lib.util.i.f181373a.getClass();
        boolean z12 = !com.avito.android.lib.util.i.f181377e;
        appBarLayout.setFitsSystemWindows(z12);
        collapsingToolbarLayout.setFitsSystemWindows(z12);
        textView.setFitsSystemWindows(z12);
        final int i12 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f113215c;

            {
                this.f113215c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f113215c.f113223h.accept(G0.f406611a);
                        break;
                    default:
                        this.f113215c.f113225j.accept(G0.f406611a);
                        break;
                }
            }
        });
        final int i13 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f113215c;

            {
                this.f113215c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f113215c.f113223h.accept(G0.f406611a);
                        break;
                    default:
                        this.f113215c.f113225j.accept(G0.f406611a);
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.i
    public final void M(@l UniversalImage universalImage) {
        Image imageG = universalImage != null ? com.avito.android.advert.item.delivery_suggests.l.g(this.f113216a, universalImage) : null;
        SimpleDraweeView simpleDraweeView = this.f113221f;
        if (imageG == null) {
            D6.w(simpleDraweeView);
        } else {
            C35949t5.c(this.f113221f, com.avito.android.image_loader.b.b(imageG), null, null, null, 14);
            D6.H(simpleDraweeView);
        }
    }

    @Override // tl.InterfaceC48686b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C41981q0 getF113226k() {
        return this.f113226k;
    }

    @Override // tl.InterfaceC48686b
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final C41981q0 getF113224i() {
        return this.f113224i;
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.i
    public final void g(int i12, @l AttributedText attributedText) {
        TextView textView = this.f113219d;
        com.avito.android.util.text.j.a(textView, attributedText, null);
        textView.setTextAppearance(C35835l0.j(i12, this.f113218c.getContext()));
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.i
    @Y61.k
    /* renamed from: getActionView, reason: from getter */
    public final View getF113222g() {
        return this.f113222g;
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.i
    public final void j(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f113220e, attributedText, null);
    }
}
