package com.avito.android.home.tabs_item;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.tab_group.TabGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SectionTabsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/home/tabs_item/g;", "Lcom/avito/android/home/tabs_item/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TabGroup f162486b;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.section_tabs);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.tab_group.TabGroup");
        }
        this.f162486b = (TabGroup) viewFindViewById;
    }

    @Override // com.avito.android.home.tabs_item.f
    public final void w10(@k com.avito.android.lib.design.tab_group.d dVar) {
        this.f162486b.setState(dVar);
    }
}
