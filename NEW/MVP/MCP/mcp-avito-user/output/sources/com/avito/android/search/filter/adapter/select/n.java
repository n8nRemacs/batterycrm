package com.avito.android.search.filter.adapter.select;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.category_parameters.Badge;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SelectItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/select/n;", "Lcom/avito/android/search/filter/adapter/select/l;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f262590g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f262591b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.util.text.a f262592c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f262593d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Input f262594e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f262595f;

    public n(@Y61.k View view, @Y61.l com.avito.android.util.text.a aVar) {
        super(view);
        this.f262591b = view;
        this.f262592c = aVar;
        this.f262593d = view.getContext();
        View viewFindViewById = view.findViewById(R.id.select_filter_input);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f262594e = (Input) viewFindViewById;
        this.f262595f = (ComponentContainer) view;
    }

    @Override // com.avito.android.search.filter.adapter.select.l
    public final void B6(@Y61.k String str, @Y61.k Badge badge) {
        String title = badge.getTitle();
        String titleColor = badge.getTitleColor();
        String backgroundColor = badge.getBackgroundColor();
        ComponentContainer componentContainer = this.f262595f;
        TextView textView = componentContainer.f178841b;
        if (textView != null) {
            com.avito.android.lib.design.badge.e.a(textView, str, title, " ", R.style.Re23_Badge_TextRedM, titleColor, backgroundColor);
        }
        componentContainer.t();
    }

    @Override // com.avito.android.search.filter.adapter.select.l
    public final void H4(int i12) {
        Input input = this.f262594e;
        input.setLeftIcon(C35835l0.h(R.attr.ic_hollowPin16, input.getContext()));
    }

    @Override // com.avito.android.search.filter.adapter.select.l
    public final void J4(int i12) {
        Input input = this.f262594e;
        input.setRightIcon(C35835l0.h(R.attr.ic_arrowDown20, input.getContext()));
    }

    @Override // com.avito.android.search.filter.adapter.select.l
    public final void Kz(@Y61.l PrintableText printableText) {
        Input.t(this.f262594e, printableText != null ? printableText.k0(this.f262593d) : null, false, 6);
    }

    @Override // com.avito.android.search.filter.adapter.select.l
    public final void Sa(@Y61.k Y41.a aVar) {
        Input input = this.f262594e;
        input.setRightIcon(C35835l0.h(R.attr.ic_close16, input.getContext()));
        input.setRightIconListener(new m(this, aVar));
    }

    @Override // com.avito.android.search.filter.adapter.select.l
    public final void a(@Y61.k Y41.a<G0> aVar) {
        com.avito.android.profile_settings_extended.adapter.phones.l lVar = new com.avito.android.profile_settings_extended.adapter.phones.l(14, aVar);
        Input input = this.f262594e;
        input.setOnClickListener(lVar);
        input.setRightIconListener(new com.avito.android.profile_settings_extended.adapter.phones.l(15, aVar));
    }

    @Override // com.avito.android.search.filter.adapter.select.l
    public final void c3(boolean z12) {
        this.f262594e.setEnabled(z12);
        this.f262595f.setEnabled(z12);
    }

    @Override // com.avito.android.search.filter.adapter.select.l
    public final void m(@Y61.l String str) {
        if (str == null) {
            str = "";
        }
        Input.t(this.f262594e, str, false, 6);
    }

    @Override // com.avito.android.search.filter.adapter.select.l
    public final void m4(int i12) {
        int iB2 = y6.b(i12);
        View view = this.f262591b;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), iB2);
    }

    @Override // com.avito.android.search.filter.adapter.select.l
    public final void o(@Y61.k String str) {
        this.f262594e.setHint(str);
    }

    @Override // com.avito.android.search.filter.adapter.select.l
    public final void ra() {
        View view = this.f262591b;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), D6.t(view, R.dimen.filter_item_compensation_vertical));
    }

    @Override // com.avito.android.search.filter.adapter.select.l
    public final void setTitle(@Y61.k String str) {
        this.f262595f.setTitle(str);
    }

    @Override // com.avito.android.search.filter.adapter.select.l
    public final void setTopPadding(int i12) {
        int iB2 = y6.b(i12);
        View view = this.f262591b;
        view.setPadding(view.getPaddingLeft(), iB2, view.getPaddingRight(), view.getPaddingBottom());
    }

    @Override // com.avito.android.search.filter.adapter.select.l
    public final void t3() {
        this.f262594e.setOnClickListener(null);
    }

    @Override // com.avito.android.search.filter.adapter.select.l
    public final void t8() {
        View view = this.f262591b;
        view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
    }

    public /* synthetic */ n(View view, com.avito.android.util.text.a aVar, int i12, C42822w c42822w) {
        this(view, (i12 & 2) != 0 ? null : aVar);
    }
}
