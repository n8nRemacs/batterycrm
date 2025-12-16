package com.avito.android.inline_filters.dialog.numeric_range_select;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.inline_filters.dialog.calendar.DialogInterfaceOnCancelListenerC31002b;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.select.Select;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.select.Arguments;
import com.avito.android.select.bottom_sheet.SelectBottomSheetMviFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: NumericRangeSelectFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/numeric_range_select/v;", "Lcom/avito/android/inline_filters/dialog/a;", "Lcom/avito/android/inline_filters/dialog/numeric_range_select/x;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class v extends AbstractC30998a<x> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public SelectBottomSheetMviFragment f171933d;

    public v(@Y61.k Context context, @Y61.k Filter filter, @Y61.l Parcelable parcelable, @Y61.k Y41.p pVar, @Y61.k Y41.a aVar, @Y61.k FragmentManager fragmentManager) {
        Filter.Config config;
        Filter.Config config2;
        super(context, R.style.Re23_BottomSheet_Default);
        InlineFilterValue value = filter.getValue();
        InlineFilterValue.InlineFilterNumericRangeSelectValue inlineFilterNumericRangeSelectValue = value instanceof InlineFilterValue.InlineFilterNumericRangeSelectValue ? (InlineFilterValue.InlineFilterNumericRangeSelectValue) value : null;
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.inline_filters_dialog_select_range, (ViewGroup) null);
        x xVar = new x(viewInflate);
        this.f171147c = xVar;
        List<Filter.InnerOptions> options = filter.getOptions();
        List<Filter.InnerOptions> list = options == null ? C42784z0.f406748b : options;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<Filter.InnerOptions.Options> options2 = ((Filter.InnerOptions) it.next()).getOptions();
            if (options2 == null) {
                options2 = C42784z0.f406748b;
            }
            arrayList.add(options2);
        }
        ArrayList arrayListH = C42745f0.H(arrayList);
        q qVar = new q(aVar, this);
        String title = filter.getTitle();
        xVar.setTitle(title == null ? "" : title);
        xVar.Qd(new d(qVar));
        Filter.Widget widget = filter.getWidget();
        String fromPlaceholder = (widget == null || (config2 = widget.getConfig()) == null) ? null : config2.getFromPlaceholder();
        Filter.Widget widget2 = filter.getWidget();
        String toPlaceholder = (widget2 == null || (config = widget2.getConfig()) == null) ? null : config.getToPlaceholder();
        Select select = xVar.f171938e;
        select.setHint(fromPlaceholder);
        Select select2 = xVar.f171939f;
        select2.setHint(toPlaceholder);
        String strI = i(inlineFilterNumericRangeSelectValue != null ? inlineFilterNumericRangeSelectValue.getFrom() : null, arrayListH);
        Input.t(select, strI == null ? "" : strI, false, 6);
        String strI2 = i(inlineFilterNumericRangeSelectValue != null ? inlineFilterNumericRangeSelectValue.getTo() : null, arrayListH);
        Input.t(select2, strI2 != null ? strI2 : "", false, 6);
        xVar.f171940g.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(14, new e(xVar, arrayListH, qVar)));
        f fVar = new f(1, this, v.class, "configureFromSelectState", "configureFromSelectState(Lcom/avito/android/inline_filters/dialog/numeric_range_select/NumericRangeSelectFilterView;)V", 0);
        i iVar = new i(aVar, context, fragmentManager, this, xVar, filter, arrayListH);
        fVar.invoke(xVar);
        iVar.invoke(xVar);
        j jVar = new j(1, this, v.class, "configureToSelectState", "configureToSelectState(Lcom/avito/android/inline_filters/dialog/numeric_range_select/NumericRangeSelectFilterView;)V", 0);
        m mVar = new m(aVar, context, fragmentManager, this, xVar, filter, arrayListH);
        jVar.invoke(xVar);
        mVar.invoke(xVar);
        xVar.f171937d = new n(pVar, filter, qVar);
        xVar.Sd(new o(pVar, filter, qVar));
        xVar.Ud(!(filter.getValue() != null ? r0.isEmpty() : true));
        xVar.f171936c = parcelable;
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f171146b;
        dVar.G(viewInflate, false);
        dVar.R(new p(qVar));
        dVar.setCanceledOnTouchOutside(true);
        dVar.setOnCancelListener(new DialogInterfaceOnCancelListenerC31002b(3, qVar));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
    }

    public static final void e(v vVar, x xVar) {
        vVar.getClass();
        boolean zK2 = C43066x.K(xVar.w());
        Select select = xVar.f171938e;
        if (zK2) {
            select.setRightIcon(R.drawable.common_ic_arrow_down_20);
            return;
        }
        a aVar = new a(vVar, xVar);
        select.setRightIcon(R.drawable.design_icon_clear_text_field);
        select.setRightIconListener(new com.avito.android.guests_selector.items.children_add_button.g(12, aVar));
    }

    public static final void f(v vVar, x xVar) {
        vVar.getClass();
        boolean zK2 = C43066x.K(xVar.x());
        Select select = xVar.f171939f;
        if (zK2) {
            select.setRightIcon(R.drawable.common_ic_arrow_down_20);
            return;
        }
        b bVar = new b(vVar, xVar);
        select.setRightIcon(R.drawable.design_icon_clear_text_field);
        select.setRightIconListener(new com.avito.android.guests_selector.items.children_add_button.g(11, bVar));
    }

    public static final void g(v vVar, String str, FragmentManager fragmentManager, Filter filter, Y41.a aVar, Y41.l lVar, x xVar, String str2, String str3) {
        vVar.getClass();
        String id2 = filter.getId();
        if (id2 == null) {
            id2 = "";
        }
        String str4 = id2;
        List<Filter.InnerOptions> options = filter.getOptions();
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
        ArrayList arrayListH = C42745f0.H(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 0; i12 < str3.length(); i12++) {
            arrayList3.add(Boolean.valueOf(arrayList2.add(new SelectParameter.Value(str2, String.valueOf(str3.charAt(i12)), null, null, null, null, false, null, null, null, ErrorCodes.PROTOCOL_EXCEPTION, null))));
        }
        SelectBottomSheetMviFragment selectBottomSheetMviFragmentA = com.avito.android.select.bottom_sheet.c.a(null, new Arguments(false, str4, null, arrayListH, arrayList2, str, null, true, false, false, false, false, false, false, false, null, false, null, null, null, null, false, false, false, false, false, false, false, null, null, null, false, false, null, false, false, false, 0, null, null, -7355, 255, null));
        vVar.f171933d = selectBottomSheetMviFragmentA;
        selectBottomSheetMviFragmentA.show(fragmentManager, "tag.select_bottom_sheet_dialog_fragment");
        SelectBottomSheetMviFragment selectBottomSheetMviFragment = vVar.f171933d;
        if (selectBottomSheetMviFragment != null) {
            selectBottomSheetMviFragment.f265015r0 = new c(lVar, vVar, xVar, aVar);
        }
    }

    public static final void h(v vVar, x xVar, String str, String str2) {
        vVar.getClass();
        if (C43066x.K(str) && C43066x.K(str2)) {
            TextView textView = xVar.f171941h;
            textView.setClickable(false);
            textView.setTextColor(xVar.f171943j);
        } else {
            TextView textView2 = xVar.f171941h;
            textView2.setClickable(true);
            textView2.setTextColor(xVar.f171942i);
        }
    }

    public static String i(String str, ArrayList arrayList) {
        Object next;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(str, ((Filter.InnerOptions.Options) next).getId())) {
                break;
            }
        }
        Filter.InnerOptions.Options options = (Filter.InnerOptions.Options) next;
        if (options != null) {
            return options.getTitle();
        }
        return null;
    }
}
