package com.avito.android.widget_filters.ui.items.category;

import Y41.p;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.selector_card.SelectorCardGroup;
import com.avito.android.lib.design.selector_card.SelectorCardSelectStrategy;
import com.avito.android.lib.design.selector_card.r;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetFiltersCategoryWidgetView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/category/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/widget_filters/ui/items/category/l;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: b, reason: collision with root package name */
    public final Context f330347b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f330348c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f330349d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f330350e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f330351f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f330352g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f330353h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SelectorCardGroup f330354i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public p<? super NP0.c, ? super Boolean, G0> f330355j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f330356k;

    /* compiled from: WidgetFiltersCategoryWidgetView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/widget_filters/ui/items/category/m$a", "Lcom/avito/android/lib/design/selector_card/SelectorCardGroup$c;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements SelectorCardGroup.c {
        public a() {
        }

        @Override // com.avito.android.lib.design.selector_card.SelectorCardGroup.c
        public final void a(@Y61.k r rVar) {
            p<? super NP0.c, ? super Boolean, G0> pVar = m.this.f330355j;
            if (pVar != null) {
                pVar.invoke((NP0.c) rVar, Boolean.FALSE);
            }
        }

        @Override // com.avito.android.lib.design.selector_card.SelectorCardGroup.c
        public final void b(@Y61.k r rVar) {
            p<? super NP0.c, ? super Boolean, G0> pVar = m.this.f330355j;
            if (pVar != null) {
                pVar.invoke((NP0.c) rVar, Boolean.TRUE);
            }
        }
    }

    public m(@Y61.k View view) {
        super(view);
        this.f330347b = view.getContext();
        this.f330348c = view.findViewById(R.id.category_widget_collapsed_layout);
        this.f330349d = (TextView) view.findViewById(R.id.widget_collapsed_title_tv);
        this.f330350e = (TextView) view.findViewById(R.id.widget_collapsed_placeholder_tv);
        this.f330351f = view.findViewById(R.id.category_widget_expanded_content);
        this.f330352g = (TextView) view.findViewById(R.id.category_widget_title_tv);
        this.f330353h = (TextView) view.findViewById(R.id.category_widget_selector_hint);
        SelectorCardGroup selectorCardGroup = (SelectorCardGroup) view.findViewById(R.id.category_widget_selector);
        selectorCardGroup.setContentBinderFactory(new d());
        this.f330354i = selectorCardGroup;
        view.setOnClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(this, 20));
    }

    @Override // com.avito.android.widget_filters.ui.items.category.l
    public final void AA(@Y61.l com.avito.android.widget_filters.ui.items.category.a aVar) {
        String strK0;
        if (aVar != null) {
            boolean z12 = aVar.f330323c;
            int i12 = z12 ? R.attr.gray54 : R.attr.black;
            Context context = this.f330347b;
            int iD2 = C35835l0.d(i12, context);
            TextView textView = this.f330350e;
            textView.setTextColor(iD2);
            if (z12) {
                strK0 = aVar.f330322b;
            } else {
                PrintableText printableText = aVar.f330321a;
                strK0 = printableText != null ? printableText.k0(context) : null;
            }
            I5.a(textView, strK0, false);
        }
    }

    @Override // com.avito.android.widget_filters.ui.items.category.l
    public final void E00(@Y61.l p<? super NP0.c, ? super Boolean, G0> pVar) {
        this.f330355j = pVar;
    }

    @Override // com.avito.android.widget_filters.ui.items.category.l
    public final void W3(boolean z12) {
        D6.G(this.f330348c, !z12);
        D6.G(this.f330351f, z12);
    }

    @Override // com.avito.android.widget_filters.ui.items.e
    public final void ZD(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f330356k = lVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f330355j = null;
        this.f330356k = null;
    }

    @Override // com.avito.android.widget_filters.ui.items.category.l
    public final void jJ(@Y61.l String str) {
        I5.a(this.f330353h, str, false);
    }

    @Override // com.avito.android.widget_filters.ui.items.category.l
    public final void oL(boolean z12) {
        this.f330354i.setSelectStrategy(z12 ? SelectorCardSelectStrategy.f180366c : SelectorCardSelectStrategy.f180365b);
    }

    @Override // com.avito.android.widget_filters.ui.items.category.l
    public final void v2(@Y61.l com.avito.android.widget_filters.ui.items.d dVar) {
        Context context = this.f330347b;
        com.avito.android.widget_filters.utils.e.a(this.f330352g, dVar, context);
        com.avito.android.widget_filters.utils.e.a(this.f330349d, dVar, context);
    }

    @Override // com.avito.android.widget_filters.ui.items.category.l
    public final void xF(@Y61.k List<NP0.c> list) {
        SelectorCardGroup selectorCardGroup = this.f330354i;
        selectorCardGroup.setData(list);
        selectorCardGroup.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((NP0.c) obj).f11431f) {
                arrayList.add(obj);
            }
        }
        selectorCardGroup.e(arrayList);
        selectorCardGroup.setSelectedListener(new a());
    }
}
