package com.avito.android.search.filter.adapter.double_select;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DoubleSelectItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/double_select/r;", "Lcom/avito/android/search/filter/adapter/double_select/p;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r extends com.avito.konveyor.adapter.b implements p {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f262293e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f262294b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Input f262295c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Input f262296d;

    public r(@Y61.k View view) {
        super(view);
        this.f262294b = (ComponentContainer) view;
        Input input = (Input) view.findViewById(R.id.select_filter_input_first);
        this.f262295c = input;
        Input input2 = (Input) view.findViewById(R.id.select_filter_input_second);
        this.f262296d = input2;
        input.setRightIconColor(androidx.core.content.d.getColor(input.getContext(), R.color.ic_select_color));
        input2.setRightIconColor(androidx.core.content.d.getColor(input2.getContext(), R.color.ic_select_color));
    }

    @Override // com.avito.android.search.filter.adapter.double_select.p
    public final void Ec(@Y61.l String str) {
        if (str == null) {
            str = "";
        }
        Input.t(this.f262296d, str, false, 6);
    }

    @Override // com.avito.android.search.filter.adapter.double_select.p
    public final void FX(@Y61.k Y41.a aVar) {
        Input input = this.f262296d;
        input.setRightIcon(R.drawable.design_icon_clear_text_field);
        input.setRightIconListener(new q(this, aVar, 1));
    }

    @Override // com.avito.android.search.filter.adapter.double_select.p
    public final void G6(@Y61.l String str) {
        if (str == null) {
            str = "";
        }
        Input.t(this.f262295c, str, false, 6);
    }

    @Override // com.avito.android.search.filter.adapter.double_select.p
    public final void PP(@Y61.l String str) {
        this.f262295c.setHint(str);
    }

    @Override // com.avito.android.search.filter.adapter.double_select.p
    public final void XF(@Y61.l String str) {
        this.f262296d.setHint(str);
    }

    @Override // com.avito.android.search.filter.adapter.double_select.p
    public final void cs() {
        Input input = this.f262296d;
        input.setRightIcon(C35835l0.h(R.attr.ic_arrowDown20, input.getContext()));
    }

    @Override // com.avito.android.search.filter.adapter.double_select.p
    public final void ct(@Y61.k Y41.a aVar) {
        Input input = this.f262295c;
        input.setRightIcon(R.drawable.design_icon_clear_text_field);
        input.setRightIconListener(new q(this, aVar, 0));
    }

    @Override // com.avito.android.search.filter.adapter.double_select.p
    public final void j30(@Y61.k Y41.a<G0> aVar) {
        com.avito.android.saved_searches.presentation.items.switcher.l lVar = new com.avito.android.saved_searches.presentation.items.switcher.l(12, aVar);
        Input input = this.f262295c;
        input.setOnClickListener(lVar);
        input.setRightIconListener(new com.avito.android.saved_searches.presentation.items.switcher.l(13, aVar));
    }

    @Override // com.avito.android.search.filter.adapter.double_select.p
    public final void jy() {
        Input input = this.f262295c;
        input.setRightIcon(C35835l0.h(R.attr.ic_arrowDown20, input.getContext()));
    }

    @Override // com.avito.android.search.filter.adapter.double_select.p
    public final void setTitle(@Y61.k String str) {
        this.f262294b.setTitle(str);
    }

    @Override // com.avito.android.search.filter.adapter.double_select.p
    public final void wn(@Y61.k Y41.a<G0> aVar) {
        com.avito.android.saved_searches.presentation.items.switcher.l lVar = new com.avito.android.saved_searches.presentation.items.switcher.l(10, aVar);
        Input input = this.f262296d;
        input.setOnClickListener(lVar);
        input.setRightIconListener(new com.avito.android.saved_searches.presentation.items.switcher.l(11, aVar));
    }
}
