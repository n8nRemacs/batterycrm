package com.avito.android.search.filter.adapter.inline_select;

import Y41.p;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GlobalSelectItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/inline_select/a;", "Lcom/avito/android/search/filter/adapter/inline_select/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f262391b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InlineSelectView f262392c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Badge f262393d;

    public a(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f262391b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.select_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.search.filter.adapter.inline_select.InlineSelectView");
        }
        this.f262392c = (InlineSelectView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.badge_new);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f262393d = (Badge) viewFindViewById3;
    }

    @Override // com.avito.android.search.filter.adapter.inline_select.i
    public final void RZ() {
        D6.w(this.f262393d);
    }

    @Override // com.avito.android.search.filter.adapter.inline_select.i
    public final void i00(@Y61.k List<Cp0.e> list, @l Cp0.e eVar, @Y61.k p<? super Cp0.e, ? super Boolean, G0> pVar) {
        this.f262392c.a(list, eVar, pVar);
    }

    @Override // com.avito.android.search.filter.adapter.inline_select.i
    public final void setTitle(@Y61.k String str) {
        this.f262391b.setText(str);
    }
}
