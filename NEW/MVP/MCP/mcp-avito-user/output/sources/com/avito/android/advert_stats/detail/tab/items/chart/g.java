package com.avito.android.advert_stats.detail.tab.items.chart;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;

/* compiled from: StatsBarItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/chart/g;", "LTV0/d;", "Lcom/avito/android/advert_stats/detail/tab/items/chart/h;", "Lcom/avito/android/advert_stats/detail/tab/items/chart/StatsBarItem;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements TV0.d<h, StatsBarItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final r f86305b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28315a f86306c;

    public g(@Y61.k r rVar, @Y61.k InterfaceC28315a interfaceC28315a) {
        this.f86305b = rVar;
        this.f86306c = interfaceC28315a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String string;
        h hVar = (h) eVar;
        StatsBarItem statsBarItem = (StatsBarItem) aVar;
        Integer num = statsBarItem.f86282c;
        boolean z12 = num == null;
        if (num == null) {
            string = "";
        } else if (new kotlin.ranges.l(0, 999, 1).h(num.intValue())) {
            string = num.toString();
        } else if (new kotlin.ranges.l(1000, 9999, 1).h(num.intValue())) {
            String string2 = num.toString();
            string = string2.substring(0, 1) + ' ' + string2.substring(1, string2.length());
        } else {
            int iLog = (int) (Math.log(num.intValue()) / Math.log(10000.0d));
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
            decimalFormatSymbols.setDecimalSeparator('.');
            decimalFormatSymbols.setGroupingSeparator('.');
            String str = new DecimalFormat("0.#", decimalFormatSymbols).format(num.intValue() / Math.pow(1000.0d, iLog));
            u0 u0Var = u0.f406856a;
            string = String.format("%s%c", Arrays.copyOf(new Object[]{str, Character.valueOf("kMBTPE".charAt(iLog - 1))}, 2));
        }
        hVar.xd(string);
        int iIntValue = num != null ? num.intValue() : 0;
        hVar.p9(statsBarItem.f86284e, z12, kotlin.ranges.s.f(statsBarItem.f86286g != null ? r0.intValue() / iIntValue : 0.0f, 0.0f, 1.0f));
        String str2 = statsBarItem.f86288i;
        if (str2 != null) {
            hVar.ts(str2);
        }
        r rVar = this.f86305b;
        hVar.f6(rVar.d(), z12 ? rVar.getF86346g() : Math.max((int) (rVar.getF86344e() * statsBarItem.f86283d), rVar.getF86345f()));
        hVar.JX(statsBarItem.f86289j);
        hVar.a(new f(this, statsBarItem));
    }
}
