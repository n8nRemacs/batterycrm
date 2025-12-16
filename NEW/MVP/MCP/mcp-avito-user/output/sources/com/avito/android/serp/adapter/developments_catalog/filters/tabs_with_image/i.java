package com.avito.android.serp.adapter.developments_catalog.filters.tabs_with_image;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: FiltersTabsAdapter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/developments_catalog/filters/tabs_with_image/i;", "Lcom/avito/android/lib/deprecated_design/tab/adapter/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements com.avito.android.lib.deprecated_design.tab.adapter.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f269895a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f269896b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f269897c;

    public i(@k View view) {
        this.f269895a = view;
        this.f269896b = (TextView) view.findViewById(R.id.filter_tabs_custom_text);
        this.f269897c = (SimpleDraweeView) view.findViewById(R.id.filter_tabs_custom_image);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.a
    public final void a(@l String str, @l String str2) {
        I5.a(this.f269896b, str, false);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.i
    @k
    /* renamed from: getView, reason: from getter */
    public final View getF269895a() {
        return this.f269895a;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.i
    public final void b(int i12, int i13, boolean z12) {
    }
}
