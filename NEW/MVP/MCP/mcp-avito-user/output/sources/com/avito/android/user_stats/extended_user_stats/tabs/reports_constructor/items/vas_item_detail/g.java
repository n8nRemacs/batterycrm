package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item_detail;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: VasItemDetailView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/vas_item_detail/g;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/vas_item_detail/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f318154b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f318155c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f318156d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f318157e;

    /* renamed from: f, reason: collision with root package name */
    public final SimpleDraweeView f318158f;

    public g(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f318154b = view;
        this.f318155c = aVar;
        this.f318156d = (TextView) view.findViewById(R.id.tv_vas_item_detail_name);
        this.f318157e = (TextView) view.findViewById(R.id.tv_vas_item_detail_period);
        this.f318158f = (SimpleDraweeView) view.findViewById(R.id.sdv_vas_item_detail);
    }

    @Override // com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item_detail.f
    public final void p10(@k VasItemDetailData vasItemDetailData) {
        TextView textView = this.f318156d;
        Context context = textView.getContext();
        AttributedText attributedText = vasItemDetailData.f318143c;
        com.avito.android.util.text.a aVar = this.f318155c;
        textView.setText(aVar.c(context, attributedText));
        this.f318157e.setText(aVar.c(textView.getContext(), vasItemDetailData.f318144d));
        C35949t5.c(this.f318158f, com.avito.android.image_loader.b.b(vasItemDetailData.f318145e), androidx.core.content.d.getDrawable(this.itemView.getContext(), R.drawable.user_stats_round_placeholder), null, null, 12);
    }
}
