package com.avito.android.inline_filters.dialog.select;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.di.C29972i;
import com.avito.android.inline_filters.InlineFiltersCommonViewInfo;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.inline_filters.dialog.calendar.DialogInterfaceOnCancelListenerC31002b;
import com.avito.android.inline_filters.dialog.select.adapter.InlineItemType;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.search.DirectionFilterValue;
import com.avito.android.remote.model.search.DistrictFilterValue;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35745a5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: MultiselectFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/i;", "Lcom/avito/android/inline_filters/dialog/a;", "Lcom/avito/android/inline_filters/dialog/select/m;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.inline_filters.dialog.select.i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31039i extends AbstractC30998a<C31043m> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final InlineFiltersCommonViewInfo f172160d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public com.avito.android.candy.f f172161e;

    /* renamed from: f, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f172162f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    @SuppressLint({"InflateParams"})
    public final View f172163g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f172164h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ArrayList f172165i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public ArrayList f172166j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final View f172167k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final View f172168l;

    public C31039i(@Y61.k Context context, @Y61.k Filter filter, @Y61.k List<com.avito.android.inline_filters.dialog.select.adapter.i> list, @Y61.l Parcelable parcelable, @Y61.k Y41.p<? super Filter, ? super InlineFilterValue, G0> pVar, @Y61.k Y41.a<G0> aVar, @Y61.l com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.l InlineFiltersCommonViewInfo inlineFiltersCommonViewInfo, int i12) {
        InlineFilterValue.InlineFilterMultiSelectValue inlineFilterMultiSelectValue;
        ArrayList arrayList;
        Object next;
        String[] stringArray;
        List<String> selectedOptions;
        ArrayList arrayList2;
        super(context, i12);
        this.f172160d = inlineFiltersCommonViewInfo;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.inline_filters_dialog, (ViewGroup) null);
        this.f172163g = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.filter_options_recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f172164h = (RecyclerView) viewFindViewById;
        this.f172165i = new ArrayList();
        View viewFindViewById2 = viewInflate.findViewById(R.id.apply_button_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f172167k = viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.search_edit_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f172168l = viewFindViewById3;
        com.avito.android.inline_filters.dialog.select.di.a.a().a((com.avito.android.inline_filters.dialog.select.di.c) C29972i.a(C29972i.b(context), com.avito.android.inline_filters.dialog.select.di.c.class)).a(this);
        InlineFilterValue value = filter.getValue();
        if (value instanceof InlineFilterValue.InlineFilterDistrictValue) {
            List<DistrictFilterValue> selectedItems = ((InlineFilterValue.InlineFilterDistrictValue) value).getSelectedItems();
            if (selectedItems != null) {
                List<DistrictFilterValue> list2 = selectedItems;
                arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(String.valueOf(((DistrictFilterValue) it.next()).getId()));
                }
            } else {
                arrayList2 = null;
            }
            inlineFilterMultiSelectValue = new InlineFilterValue.InlineFilterMultiSelectValue(arrayList2);
        } else if (value instanceof InlineFilterValue.InlineFilterDirectionValue) {
            List<DirectionFilterValue> selectedItems2 = ((InlineFilterValue.InlineFilterDirectionValue) value).getSelectedItems();
            if (selectedItems2 != null) {
                List<DirectionFilterValue> list3 = selectedItems2;
                arrayList = new ArrayList(C42745f0.q(list3, 10));
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(String.valueOf(((DirectionFilterValue) it2.next()).getId()));
                }
            } else {
                arrayList = null;
            }
            inlineFilterMultiSelectValue = new InlineFilterValue.InlineFilterMultiSelectValue(arrayList);
        } else {
            inlineFilterMultiSelectValue = value instanceof InlineFilterValue.InlineFilterMultiSelectValue ? (InlineFilterValue.InlineFilterMultiSelectValue) value : null;
        }
        com.avito.android.candy.f fVar = this.f172161e;
        fVar = fVar == null ? null : fVar;
        InterfaceC35745a5 interfaceC35745a5 = this.f172162f;
        interfaceC35745a5 = interfaceC35745a5 == null ? null : interfaceC35745a5;
        View view = this.f172163g;
        this.f171147c = new C31043m(view, fVar, interfaceC35745a5);
        this.f172165i = new ArrayList();
        if (inlineFilterMultiSelectValue != null && (selectedOptions = inlineFilterMultiSelectValue.getSelectedOptions()) != null) {
            this.f172165i.addAll(selectedOptions);
        }
        if ((parcelable instanceof Bundle) && (stringArray = ((Bundle) parcelable).getStringArray("inlineMultiSelect")) != null) {
            for (String str : stringArray) {
                if (!f(str)) {
                    this.f172165i.add(str);
                }
            }
        }
        for (com.avito.android.inline_filters.dialog.select.adapter.i iVar : list) {
            iVar.f172094e = f(iVar.f172092c);
        }
        ArrayList arrayListE = e(list);
        Iterator it3 = arrayListE.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (((com.avito.android.inline_filters.dialog.select.adapter.i) next).f172095f == InlineItemType.f172056c) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        boolean z12 = next != null;
        Y41.a<G0> c31038h = new C31038h(aVar, this);
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f171146b;
        dVar.G(view, false);
        dVar.T();
        dVar.setCanceledOnTouchOutside(true);
        dVar.setOnCancelListener(new DialogInterfaceOnCancelListenerC31002b(5, c31038h));
        dVar.R(new C31034d(c31038h));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        C31043m c31043m = (C31043m) this.f171147c;
        String title = filter.getTitle();
        title = title == null ? "" : title;
        c31043m.f172034c.f171134a.setMaxLines(1);
        c31043m.setTitle(title);
        c31043m.f172036e.setHint(title);
        c31043m.Qd(c31038h);
        c31043m.Sd(new C31035e(z12, this, arrayListE, c31043m));
        InlineFiltersCommonViewInfo inlineFiltersCommonViewInfo2 = this.f172160d;
        Button button = c31043m.f172172n;
        if (inlineFiltersCommonViewInfo2 != null) {
            button.setText(inlineFiltersCommonViewInfo2.f170991b);
        } else {
            c31043m.Td(view.getContext().getString(R.string.clear_inline_filter));
            button.setText(view.getContext().getString(R.string.apply_inline_filter));
        }
        c31043m.k(arrayListE, null);
        c31043m.f172041j.t0(new C31036f(this, c31043m, aVar2));
        button.setOnClickListener(new ViewOnClickListenerC31042l(0, new C31037g(pVar, filter, this, list, arrayListE)));
        c31043m.l(8);
        g(c31043m);
        c31043m.f172174p.post(new com.avito.android.inline_filters.dialog.group.item.double_input.e(c31043m, 2));
        RecyclerView recyclerView = this.f172164h;
        if (!z12) {
            D6.l(true, recyclerView, new C31033c(this));
        }
        if (z12) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, 0, marginLayoutParams.bottomMargin);
            recyclerView.setLayoutParams(marginLayoutParams);
        }
    }

    public static ArrayList e(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(com.avito.android.inline_filters.dialog.select.adapter.i.a((com.avito.android.inline_filters.dialog.select.adapter.i) it.next()));
        }
        return arrayList;
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    public final void a() {
        c();
        com.avito.android.candy.f fVar = this.f172161e;
        if (fVar == null) {
            fVar = null;
        }
        fVar.f114885d.dispose();
        fVar.f114886e.clear();
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    @Y61.l
    public final Parcelable b() {
        Bundle bundle = new Bundle();
        bundle.putStringArray("inlineMultiSelect", (String[]) this.f172165i.toArray(new String[0]));
        return bundle;
    }

    public final boolean f(String str) {
        Object next;
        Iterator it = this.f172165i.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.L.f((String) next, str)) {
                break;
            }
        }
        return next != null;
    }

    public final void g(C31043m c31043m) {
        c31043m.Ud(!this.f172165i.isEmpty());
    }
}
