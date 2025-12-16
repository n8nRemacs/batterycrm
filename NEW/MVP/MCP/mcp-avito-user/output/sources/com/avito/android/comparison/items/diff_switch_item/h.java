package com.avito.android.comparison.items.diff_switch_item;

import Y41.l;
import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import kotlin.Metadata;

/* compiled from: DiffSwitchItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comparison/items/diff_switch_item/h;", "Lcom/avito/android/comparison/items/diff_switch_item/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f123938c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemSwitcher f123939b;

    public h(@k View view) {
        super(view);
        this.f123939b = (ListItemSwitcher) view.findViewById(R.id.diff_switch);
    }

    @Override // com.avito.android.comparison.items.diff_switch_item.g
    public final void OH(@k l lVar, boolean z12) {
        ListItemSwitcher listItemSwitcher = this.f123939b;
        listItemSwitcher.setChecked(z12);
        listItemSwitcher.e(new com.avito.android.blueprint.switcher.h(2, lVar));
    }
}
