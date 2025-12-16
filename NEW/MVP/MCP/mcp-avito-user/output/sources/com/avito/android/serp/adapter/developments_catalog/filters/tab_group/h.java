package com.avito.android.serp.adapter.developments_catalog.filters.tab_group;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: FiltersTabGroupView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/developments_catalog/filters/tab_group/h;", "Lcom/avito/android/serp/adapter/developments_catalog/filters/tab_group/g;", "Lcom/avito/android/serp/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.android.serp.c implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TabGroup f269869b;

    public h(@k View view) {
        super(view);
        this.f269869b = (TabGroup) view;
    }

    @Override // com.avito.android.serp.adapter.developments_catalog.filters.tab_group.g
    public final void DE(@k com.avito.android.lib.design.tab_group.d dVar) {
        this.f269869b.setState(dVar);
    }

    @Override // com.avito.android.serp.adapter.developments_catalog.filters.tab_group.g
    public final void setVisibility(boolean z12) {
        D6.G(this.f269869b, z12);
    }
}
