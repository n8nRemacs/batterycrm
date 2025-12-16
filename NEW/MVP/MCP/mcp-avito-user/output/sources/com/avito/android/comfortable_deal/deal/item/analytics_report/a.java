package com.avito.android.comfortable_deal.deal.item.analytics_report;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;

/* compiled from: AnalyticsReportItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/analytics_report/a;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.conveyor_item.a, b.InterfaceC10495b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final WebViewLink.OnlyAvitoDomain f121186b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f121187c;

    public a(@k WebViewLink.OnlyAvitoDomain onlyAvitoDomain, @k PrintableText printableText) {
        this.f121186b = onlyAvitoDomain;
        this.f121187c = printableText;
    }

    @Override // TV0.a
    public final long getId() {
        return -1546592251;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF173886b() {
        return "analytics_report_item";
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId */
    public final long getF273038j() {
        return -1546592251;
    }
}
