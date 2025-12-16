package com.avito.android.comfortable_deal.deal.item.analytics_report;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.calltracking.item.m;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AnalyticsReportItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/analytics_report/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/deal/item/analytics_report/g;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f121196e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f121197b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f121198c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f121199d;

    public h(@k View view) {
        super(view);
        this.f121197b = view;
        View viewFindViewById = view.findViewById(R.id.body);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f121198c = (TextView) viewFindViewById;
        this.f121199d = view.getContext();
    }

    @Override // com.avito.android.comfortable_deal.deal.item.analytics_report.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f121197b.setOnClickListener(new m(18, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f121197b.setOnClickListener(null);
    }

    @Override // com.avito.android.comfortable_deal.deal.item.analytics_report.g
    public final void y(@k PrintableText printableText) {
        this.f121198c.setText(printableText.k0(this.f121199d));
    }
}
