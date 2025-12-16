package com.avito.android.tariff_lf.package_info.recycler.price_segment;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.avito.android.tariff_lf.remote.model.TariffPriceSegment;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: TariffPriceSegmentParameterFormatter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/recycler/price_segment/h;", "Lcom/avito/android/tariff_lf/package_info/recycler/price_segment/g;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf.package_info.viewmodel.i f299273a;

    @Inject
    public h(@Y61.k com.avito.android.tariff_lf.package_info.viewmodel.i iVar) {
        this.f299273a = iVar;
    }

    @Override // com.avito.android.tariff_lf.package_info.recycler.price_segment.g
    @Y61.l
    public final ArrayList a(@Y61.l List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<TariffPriceSegment.SegmentParameter> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (TariffPriceSegment.SegmentParameter segmentParameter : list2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString(segmentParameter.getKey());
            com.avito.android.tariff_lf.package_info.viewmodel.i iVar = this.f299273a;
            spannableString.setSpan(new ForegroundColorSpan(iVar.b()), 0, spannableString.length(), 33);
            SpannableString spannableString2 = new SpannableString(segmentParameter.getValue());
            spannableString2.setSpan(new ForegroundColorSpan(iVar.a()), 0, spannableString2.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString).append((char) 160).append((CharSequence) spannableString2);
            arrayList.add(new a(spannableStringBuilder, segmentParameter.getBadge()));
        }
        return arrayList;
    }
}
