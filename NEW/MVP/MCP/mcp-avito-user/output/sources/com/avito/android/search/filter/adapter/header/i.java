package com.avito.android.search.filter.adapter.header;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: HeaderItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/header/i;", "Lcom/avito/android/search/filter/adapter/header/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f262359b;

    public i(@k View view) {
        super(view);
        this.f262359b = (TextView) view;
    }

    @Override // com.avito.android.search.filter.adapter.header.h
    public final void setTitle(@k String str) {
        I5.a(this.f262359b, str, false);
    }
}
