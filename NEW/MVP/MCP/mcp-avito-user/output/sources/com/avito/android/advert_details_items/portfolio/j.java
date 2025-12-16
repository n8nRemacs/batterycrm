package com.avito.android.advert_details_items.portfolio;

import Y41.l;
import Y61.k;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.PortfolioProject;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PortfolioBlockItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/portfolio/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/portfolio/i;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f85133f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f85134b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f85135c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f85136d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinearLayout f85137e;

    public j(@k View view) {
        super(view);
        this.f85134b = view;
        View viewFindViewById = view.findViewById(R.id.portfolio_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f85135c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.portfolio_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f85136d = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.portfolio_projects);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f85137e = (LinearLayout) viewFindViewById3;
    }

    @Override // com.avito.android.advert_details_items.portfolio.i
    public final void G60(@k String str, @k Y41.a<G0> aVar) {
        Button button = this.f85136d;
        com.avito.android.lib.design.button.b.a(button, str, false);
        button.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(20, aVar));
        button.setVisibility(0);
    }

    @Override // com.avito.android.advert_details_items.portfolio.i
    public final void h10(@k l lVar, @k List list) {
        LinearLayout linearLayout = this.f85137e;
        linearLayout.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PortfolioProject portfolioProject = (PortfolioProject) it.next();
            View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.advert_details_portfolio_project, (ViewGroup) linearLayout, false);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewInflate.findViewById(R.id.portfolio_main_image);
            TextView textView = (TextView) viewInflate.findViewById(R.id.project_title);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.project_subtitle);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.project_price);
            simpleDraweeView.setImageURI((Uri) C42745f0.F(portfolioProject.getImage().getVariants().values()));
            I5.a(textView, portfolioProject.getTitle(), false);
            I5.a(textView2, portfolioProject.getSubtitle(), false);
            I5.a(textView3, portfolioProject.getPriceText(), false);
            viewInflate.setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(portfolioProject, lVar));
            linearLayout.addView(viewInflate);
        }
    }

    @Override // com.avito.android.advert_details_items.portfolio.i
    public final void setTitle(@k String str) {
        I5.a(this.f85135c, str, false);
    }
}
