package com.avito.android.inline_filters.dialog.range;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.L0;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.inline_filters.dialog.E;
import com.avito.android.inline_filters.dialog.calendar.DialogInterfaceOnCancelListenerC31002b;
import com.avito.android.inline_filters.dialog.range.RangeFilterView;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.InlineFilterValueKt;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: RangeFilterDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/range/g;", "Lcom/avito/android/inline_filters/dialog/a;", "Lcom/avito/android/inline_filters/dialog/range/RangeFilterView;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends AbstractC30998a<RangeFilterView> {
    public g(@k Context context, @k Filter filter, @l Parcelable parcelable, @k p<? super Filter, ? super InlineFilterValue, G0> pVar, @k Y41.a<G0> aVar, int i12) {
        int i13;
        Filter.Config config;
        String thousandsSeparator;
        Filter.Config config2;
        String toValueFormat;
        Filter.Config config3;
        String toPlaceholder;
        Filter.Config config4;
        String fromValueFormat;
        Filter.Config config5;
        String fromPlaceholder;
        super(context, i12);
        InlineFilterValue value = filter.getValue();
        InlineFilterValue.InlineFilterNumericRangeValue inlineFilterNumericRangeValue = value instanceof InlineFilterValue.InlineFilterNumericRangeValue ? (InlineFilterValue.InlineFilterNumericRangeValue) value : null;
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.inline_filters_dialog_range, (ViewGroup) null);
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f171146b;
        Window window = dVar.getWindow();
        Filter.Widget widget = filter.getWidget();
        String str = (widget == null || (config5 = widget.getConfig()) == null || (fromPlaceholder = config5.getFromPlaceholder()) == null) ? "" : fromPlaceholder;
        Filter.Widget widget2 = filter.getWidget();
        String str2 = (widget2 == null || (config4 = widget2.getConfig()) == null || (fromValueFormat = config4.getFromValueFormat()) == null) ? "%s" : fromValueFormat;
        Filter.Widget widget3 = filter.getWidget();
        String str3 = (widget3 == null || (config3 = widget3.getConfig()) == null || (toPlaceholder = config3.getToPlaceholder()) == null) ? "" : toPlaceholder;
        Filter.Widget widget4 = filter.getWidget();
        String str4 = (widget4 == null || (config2 = widget4.getConfig()) == null || (toValueFormat = config2.getToValueFormat()) == null) ? "%s" : toValueFormat;
        boolean zIsNotEmpty = InlineFilterValueKt.isNotEmpty(inlineFilterNumericRangeValue);
        Filter.Widget widget5 = filter.getWidget();
        this.f171147c = new RangeFilterView(viewInflate, window, str, str2, str3, str4, zIsNotEmpty, (widget5 == null || (config = widget5.getConfig()) == null || (thousandsSeparator = config.getThousandsSeparator()) == null) ? "" : thousandsSeparator);
        f fVar = new f(viewInflate, aVar, this);
        RangeFilterView rangeFilterView = (RangeFilterView) this.f171147c;
        Long from = inlineFilterNumericRangeValue != null ? inlineFilterNumericRangeValue.getFrom() : null;
        Long to2 = inlineFilterNumericRangeValue != null ? inlineFilterNumericRangeValue.getTo() : null;
        Input input = rangeFilterView.f171962l;
        String str5 = rangeFilterView.f171953c;
        if (from == null) {
            input.setHint(str5);
        } else {
            Input.t(input, from.toString(), false, 6);
        }
        String str6 = rangeFilterView.f171954d;
        Input input2 = rangeFilterView.f171961k;
        if (to2 == null) {
            input2.setHint(str6);
        } else {
            Input.t(input2, to2.toString(), false, 6);
        }
        View view = rangeFilterView.f171951a;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
        String title = filter.getTitle();
        rangeFilterView.setTitle(title == null ? "" : title);
        rangeFilterView.Qd(new b(fVar));
        rangeFilterView.f171957g = new c(pVar, filter, fVar);
        rangeFilterView.Sd(new d(pVar, filter, fVar));
        rangeFilterView.Ud(!(filter.getValue() != null ? r2.isEmpty() : true));
        if (parcelable instanceof RangeFilterView.State) {
            RangeFilterView.State state = (RangeFilterView.State) parcelable;
            String str7 = state.f171963b;
            Long lZ02 = str7 != null ? C43066x.z0(str7) : null;
            String str8 = state.f171964c;
            Long lZ03 = str8 != null ? C43066x.z0(str8) : null;
            Input input3 = rangeFilterView.f171962l;
            if (lZ02 == null) {
                input3.setHint(str5);
                i13 = 6;
            } else {
                i13 = 6;
                Input.t(input3, lZ02.toString(), false, 6);
            }
            if (lZ03 == null) {
                input2.setHint(str6);
            } else {
                Input.t(input2, lZ03.toString(), false, i13);
            }
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
        }
        dVar.G(viewInflate, false);
        dVar.R(new e(fVar));
        dVar.setCanceledOnTouchOutside(true);
        dVar.setOnCancelListener(new DialogInterfaceOnCancelListenerC31002b(4, fVar));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    public final void d() {
        super.d();
        E e12 = this.f171147c;
        RangeFilterView rangeFilterView = e12 instanceof RangeFilterView ? (RangeFilterView) e12 : null;
        if (rangeFilterView != null) {
            Input input = rangeFilterView.f171962l;
            input.requestFocus();
            Window window = rangeFilterView.f171952b;
            if (window != null) {
                new L0(window, input).g(8);
            } else {
                input.post(new com.avito.android.inline_filters.dialog.group.item.double_input.e(rangeFilterView, 1));
            }
        }
    }
}
