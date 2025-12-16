package com.avito.android.search.filter.adapter.inline_select;

import Y41.p;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import com.avito.android.lib.design.list_item.ListItemRadio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InlineSelectView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/inline_select/InlineSelectView;", "Landroid/widget/LinearLayout;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InlineSelectView extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f262389b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public ListItemRadio f262390c;

    @X41.j
    public InlineSelectView(@l Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@Y61.k List<Cp0.e> list, @l Cp0.e eVar, @Y61.k final p<? super Cp0.e, ? super Boolean, G0> pVar) {
        ArrayList arrayList = this.f262389b;
        if (arrayList.size() != list.size()) {
            arrayList.clear();
            removeAllViews();
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                ListItemRadio listItemRadio = (ListItemRadio) LayoutInflater.from(getContext()).inflate(R.layout.filters_radio_button, (ViewGroup) null);
                addView(listItemRadio);
                arrayList.add(listItemRadio);
            }
        }
        Iterator it = C42745f0.T0(list, arrayList).iterator();
        while (it.hasNext()) {
            Q q12 = (Q) it.next();
            final Cp0.e eVar2 = (Cp0.e) q12.f406619b;
            final ListItemRadio listItemRadio2 = (ListItemRadio) q12.f406620c;
            boolean zF2 = L.f(eVar2.f2697b, eVar != null ? eVar.f2697b : null);
            listItemRadio2.setTitle(eVar2.f2698c);
            listItemRadio2.setChecked(zF2);
            if (zF2) {
                this.f262390c = listItemRadio2;
            }
            listItemRadio2.i();
            listItemRadio2.e(new ListItemCompoundButton.a() { // from class: com.avito.android.search.filter.adapter.inline_select.k
                @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
                public final void a(ListItemCompoundButton listItemCompoundButton, boolean z12) {
                    InlineSelectView inlineSelectView = this.f262407a;
                    ListItemRadio listItemRadio3 = inlineSelectView.f262390c;
                    if (listItemRadio3 != null) {
                        listItemRadio3.setChecked(false);
                    }
                    if (z12) {
                        inlineSelectView.f262390c = listItemRadio2;
                    }
                    pVar.invoke(eVar2, Boolean.valueOf(z12));
                }
            });
        }
    }

    public InlineSelectView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f262389b = new ArrayList();
        setOrientation(1);
    }
}
