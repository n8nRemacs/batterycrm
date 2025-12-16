package com.avito.android.advert_stats.item;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DaysView.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert_stats/item/DaysView;", "Landroid/widget/LinearLayout;", "", "width", "Lkotlin/G0;", "setDayWidth", "(I)V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DaysView extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final int f86683b;

    /* renamed from: c, reason: collision with root package name */
    public final int f86684c;

    /* renamed from: d, reason: collision with root package name */
    public final int f86685d;

    /* renamed from: e, reason: collision with root package name */
    public int f86686e;

    @X41.j
    public DaysView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setDayWidth(int width) {
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12).getLayoutParams().width = width;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DaysView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) throws Resources.NotFoundException {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f86683b = C35835l0.d(R.attr.gray48, context);
        this.f86684c = C35835l0.d(R.attr.black, context);
        this.f86685d = getResources().getDimensionPixelSize(R.dimen.gap_between_bars_small);
        this.f86686e = -1;
        for (String str : getResources().getStringArray(R.array.days_of_week)) {
            com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(getContext(), null, 0, 0, 14, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int i14 = this.f86685d;
            layoutParams.leftMargin = i14;
            layoutParams.rightMargin = i14;
            aVar.setLayoutParams(layoutParams);
            aVar.setText(str.toUpperCase(Locale.ROOT));
            aVar.setTextAppearance(C35835l0.j(R.attr.textMicro, aVar.getContext()));
            aVar.setTextColor(this.f86683b);
            aVar.setGravity(17);
            addView(aVar);
        }
    }
}
