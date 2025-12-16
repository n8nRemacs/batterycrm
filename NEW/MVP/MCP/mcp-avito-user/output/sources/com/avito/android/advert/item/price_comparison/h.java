package com.avito.android.advert.item.price_comparison;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.model_card.LinkInfo;
import com.avito.android.remote.model.model_card.PriceInfo;
import com.avito.android.util.C35835l0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PriceComparisonItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/price_comparison/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/price_comparison/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f78233f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f78234b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f78235c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f78236d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f78237e;

    public h(@k View view) {
        super(view);
        this.f78234b = view;
        this.f78235c = (TextView) view.findViewById(R.id.price_comparison_title);
        this.f78236d = (LinearLayout) view.findViewById(R.id.price_comparison_entities_container);
        this.f78237e = (TextView) view.findViewById(R.id.price_comparison_link);
    }

    @Override // com.avito.android.advert.item.price_comparison.g
    public final void Hq(@k PriceInfo priceInfo) {
        this.f78235c.setText(priceInfo.getTitle());
        LinkInfo linkInfo = priceInfo.getLinkInfo();
        this.f78237e.setText(linkInfo != null ? linkInfo.getTitle() : null);
        LinearLayout linearLayout = this.f78236d;
        linearLayout.removeAllViews();
        List<String> entities = priceInfo.getEntities();
        if (entities != null) {
            for (String str : entities) {
                Context context = linearLayout.getContext();
                com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(context, null, 0, 0, 14, null);
                aVar.setText(context.getString(R.string.advert_details_price_comparison_text, str));
                aVar.setTextAppearance(C35835l0.j(R.attr.textBody, this.f78234b.getContext()));
                aVar.setTextColor(C35835l0.d(R.attr.black, context));
                linearLayout.addView(aVar);
            }
        }
    }

    @Override // com.avito.android.advert.item.price_comparison.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f78237e.setOnClickListener(new com.avito.android.advert.item.parking.h(3, aVar));
    }
}
