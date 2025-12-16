package com.avito.android.competitor_analytics.ui;

import androidx.compose.runtime.C22066f2;
import com.avito.android.competitor_analytics.domain.model.ChartColor;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsChartMetrics.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.competitor_analytics.ui.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29532h extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f124745l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ChartColor f124746m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f124747n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AttributedText f124748o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f124749p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f124750q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29532h(String str, ChartColor chartColor, String str2, AttributedText attributedText, String str3, int i12) {
        super(2);
        this.f124745l = str;
        this.f124746m = chartColor;
        this.f124747n = str2;
        this.f124748o = attributedText;
        this.f124749p = str3;
        this.f124750q = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f124750q | 1);
        AttributedText attributedText = this.f124748o;
        String str = this.f124749p;
        C29534i.b(this.f124745l, this.f124746m, this.f124747n, attributedText, str, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
