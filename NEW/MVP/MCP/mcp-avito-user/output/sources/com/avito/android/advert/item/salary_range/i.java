package com.avito.android.advert.item.salary_range;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.salary_range.salary_view.SalaryRangeView;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.V2;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertSalaryRangeView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/salary_range/i;", "Lcom/avito/android/advert/item/salary_range/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f79272b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f79273c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f79274d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SalaryRangeView f79275e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f79276f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f79277g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f79278h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final DecimalFormat f79279i;

    public i(@k View view) {
        super(view);
        this.f79272b = view;
        View viewFindViewById = view.findViewById(R.id.salary_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f79273c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.salary_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f79274d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.salary_widget);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.advert.item.salary_range.salary_view.SalaryRangeView");
        }
        this.f79275e = (SalaryRangeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.salary_below);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f79276f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.salary_middle);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f79277g = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.salary_above);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f79278h = (TextView) viewFindViewById6;
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(new Locale("ru", "RU"));
        decimalFormat.setGroupingSize(3);
        decimalFormat.getDecimalFormatSymbols().setGroupingSeparator((char) 160);
        this.f79279i = decimalFormat;
    }

    @Override // com.avito.android.advert.item.salary_range.h
    public final void P40(long j12, long j13, @l Long l12, @l Long l13) {
        View view = this.f79272b;
        D6.H(view);
        SalaryRangeView salaryRangeView = this.f79275e;
        Context context = salaryRangeView.getContext();
        DecimalFormat decimalFormat = this.f79279i;
        String str = l12 != null ? decimalFormat.format(l12.longValue()) : null;
        String str2 = l13 != null ? decimalFormat.format(l13.longValue()) : null;
        String str3 = decimalFormat.format(j12);
        String str4 = decimalFormat.format(j13);
        if (str == null && str2 == null) {
            V2.f318762a.d("AdvertSalaryRangeView", "Salary is null.");
            D6.w(view);
            return;
        }
        String string = str == null ? context.getString(R.string.advert_details_salary_range_display_single_to, str2) : str2 == null ? context.getString(R.string.advert_details_salary_range_display_single_from, str) : str.equals(str2) ? context.getString(R.string.advert_details_salary_range_display_single, str) : context.getString(R.string.advert_details_salary_range_display, str, str2);
        Long lValueOf = l12 == null ? l13 : l13 == null ? l12 : Long.valueOf((l13.longValue() + l12.longValue()) / 2);
        if (lValueOf == null) {
            V2.f318762a.d("AdvertSalaryRangeView", "Middle salary is null.");
            D6.w(view);
        } else {
            salaryRangeView.setState(new K6.a(string, lValueOf.longValue(), j12, j13));
            I5.a(this.f79276f, context.getString(R.string.advert_details_salary_range_below), false);
            I5.a(this.f79277g, context.getString(R.string.advert_details_salary_range_middle, str3, str4), false);
            I5.a(this.f79278h, context.getString(R.string.advert_details_salary_range_above), false);
        }
    }

    @Override // com.avito.android.advert.item.salary_range.h
    public final void h(@k String str) {
        I5.a(this.f79274d, str, false);
    }

    @Override // com.avito.android.advert.item.salary_range.h
    public final void setTitle(@k String str) {
        I5.a(this.f79273c, str, false);
    }
}
