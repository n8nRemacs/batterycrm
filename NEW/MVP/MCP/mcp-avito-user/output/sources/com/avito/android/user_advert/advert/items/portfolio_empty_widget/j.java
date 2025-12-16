package com.avito.android.user_advert.advert.items.portfolio_empty_widget;

import Y61.k;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PortfolioEmptyWidgetItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/portfolio_empty_widget/j;", "Lcom/avito/android/user_advert/advert/items/portfolio_empty_widget/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f309799f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f309800b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f309801c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f309802d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f309803e;

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.portfolio_empty_widget_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f309800b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.portfolio_empty_widget_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f309801c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.portfolio_add_project_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f309802d = (Button) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.portfolio_image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f309803e = (SimpleDraweeView) viewFindViewById4;
    }

    @Override // com.avito.android.user_advert.advert.items.portfolio_empty_widget.i
    public final void PV(@k String str, @k e eVar) {
        Button button = this.f309802d;
        com.avito.android.lib.design.button.b.a(button, str, false);
        button.setOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(eVar, 25));
    }

    @Override // com.avito.android.user_advert.advert.items.portfolio_empty_widget.i
    public final void kL(@k a aVar) {
        MyAdvertDetails.Portfolio.EmptyPortfolio emptyPortfolio = aVar.f309788c;
        I5.a(this.f309800b, emptyPortfolio.getTitle(), false);
        I5.a(this.f309801c, emptyPortfolio.getDescription(), false);
        Image image = emptyPortfolio.getImage();
        SimpleDraweeView simpleDraweeView = this.f309803e;
        Uri uriA = C35829k2.c(image, simpleDraweeView, 0, 30).a();
        if (uriA != null) {
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.f(uriA);
            aVarA.c();
        }
    }
}
