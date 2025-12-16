package com.avito.android.inline_filters.dialog.select;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: QuarterSelectFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/r;", "Lcom/avito/android/inline_filters/dialog/a;", "Lcom/avito/android/inline_filters/dialog/select/SelectFilterView;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class r extends AbstractC30998a<SelectFilterView> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Filter f172186d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f172187e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f172188f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    @SuppressLint({"InflateParams"})
    public final View f172189g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f172190h;

    public /* synthetic */ r(Context context, Filter filter, List list, Parcelable parcelable, Y41.p pVar, Y41.a aVar, int i12, boolean z12, boolean z13, int i13, C42822w c42822w) {
        this(context, filter, list, parcelable, pVar, aVar, i12, (i13 & 128) != 0 ? false : z12, (i13 & 256) != 0 ? false : z13);
    }

    public static final InlineFilterValue.InlineFilterNumericRangeValue e(r rVar, String str) {
        Long lValueOf;
        Object next;
        Integer toInt;
        Integer fromInt;
        List<Filter.InnerOptions> options = rVar.f172186d.getOptions();
        if (options == null) {
            options = C42784z0.f406748b;
        }
        List<Filter.InnerOptions> list = options;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<Filter.InnerOptions.Options> options2 = ((Filter.InnerOptions) it.next()).getOptions();
            if (options2 == null) {
                options2 = C42784z0.f406748b;
            }
            arrayList.add(options2);
        }
        Iterator it2 = C42745f0.H(arrayList).iterator();
        while (true) {
            lValueOf = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (kotlin.jvm.internal.L.f(((Filter.InnerOptions.Options) next).getId(), str)) {
                break;
            }
        }
        Filter.InnerOptions.Options options3 = (Filter.InnerOptions.Options) next;
        Long lValueOf2 = (options3 == null || (fromInt = options3.getFromInt()) == null) ? null : Long.valueOf(fromInt.intValue());
        if (options3 != null && (toInt = options3.getToInt()) != null) {
            lValueOf = Long.valueOf(toInt.intValue());
        }
        return new InlineFilterValue.InlineFilterNumericRangeValue(lValueOf2, lValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(@Y61.k android.content.Context r15, @Y61.k com.avito.android.remote.model.search.Filter r16, @Y61.k java.util.List<com.avito.android.inline_filters.dialog.select.adapter.i> r17, @Y61.l android.os.Parcelable r18, @Y61.k Y41.p<? super com.avito.android.remote.model.search.Filter, ? super com.avito.android.remote.model.search.InlineFilterValue, kotlin.G0> r19, @Y61.k Y41.a<kotlin.G0> r20, int r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.inline_filters.dialog.select.r.<init>(android.content.Context, com.avito.android.remote.model.search.Filter, java.util.List, android.os.Parcelable, Y41.p, Y41.a, int, boolean, boolean):void");
    }
}
