package com.avito.android.advert_stats.detail.tab.items.cost_extended;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.text.j;
import com.facebook.drawee.view.SimpleDraweeView;
import eb.InterfaceC40078a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CostExtendedByPeriodView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/cost_extended/g;", "Lcom/avito/android/advert_stats/detail/tab/items/cost_extended/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f86419i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f86420b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f86421c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<InterfaceC40078a, G0> f86422d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f86423e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f86424f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f86425g;

    /* renamed from: h, reason: collision with root package name */
    public final SimpleDraweeView f86426h;

    public g(@k l lVar, @k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f86420b = view;
        this.f86421c = aVar;
        this.f86422d = lVar;
        this.f86423e = (TextView) view.findViewById(R.id.tv_cost_text_item);
        this.f86424f = (TextView) view.findViewById(R.id.tv_cost_date_item);
        this.f86425g = (TextView) view.findViewById(R.id.tv_cost_item);
        this.f86426h = (SimpleDraweeView) view.findViewById(R.id.sdv_cost_item);
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.cost_extended.f
    public final void fo(@k CostExtendedByPeriodItem costExtendedByPeriodItem) {
        UniversalImage universalImage = costExtendedByPeriodItem.f86406c;
        SimpleDraweeView simpleDraweeView = this.f86426h;
        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext())) : null;
        com.avito.android.util.text.a aVar = this.f86421c;
        TextView textView = this.f86423e;
        AttributedText attributedText = costExtendedByPeriodItem.f86407d;
        if (attributedText != null) {
            j.c(textView, attributedText, aVar);
        } else {
            textView.setText("");
        }
        TextView textView2 = this.f86424f;
        Action action = costExtendedByPeriodItem.f86409f;
        if (action != null) {
            textView2.setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(28, this, costExtendedByPeriodItem));
            textView2.setText(action.getTitle());
        } else {
            textView2.setText("");
        }
        TextView textView3 = this.f86425g;
        AttributedText attributedText2 = costExtendedByPeriodItem.f86408e;
        if (attributedText2 != null) {
            j.c(textView3, attributedText2, aVar);
        } else {
            textView3.setText("");
        }
        C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault), null, null, null, 14);
        textView2.setVisibility(action == null ? 8 : 0);
        textView3.setVisibility(attributedText2 == null ? 8 : 0);
        simpleDraweeView.setVisibility(imageDependsOnThemeOrDefault == null ? 8 : 0);
    }
}
