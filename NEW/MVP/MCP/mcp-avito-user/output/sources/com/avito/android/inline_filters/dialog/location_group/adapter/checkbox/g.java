package com.avito.android.inline_filters.dialog.location_group.adapter.checkbox;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.blueprint.switcher.h;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GroupFilterItemCheckboxView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/location_group/adapter/checkbox/g;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/inline_filters/dialog/location_group/adapter/checkbox/f;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements TV0.e, f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f171722d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemSwitcher f171723b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public h f171724c;

    public g(@k View view) {
        super(view);
        this.f171723b = (ListItemSwitcher) view;
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.checkbox.f
    public final void Z1(boolean z12) {
        this.f171723b.setChecked(z12);
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.checkbox.f
    public final void d7(@k Y41.l<? super Boolean, G0> lVar) {
        h hVar = this.f171724c;
        ListItemSwitcher listItemSwitcher = this.f171723b;
        if (hVar != null) {
            listItemSwitcher.j(hVar);
        }
        h hVar2 = new h(3, lVar);
        listItemSwitcher.e(hVar2);
        this.f171724c = hVar2;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        h hVar = this.f171724c;
        if (hVar != null) {
            this.f171723b.j(hVar);
        }
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.adapter.checkbox.f
    public final void setTitle(@k String str) {
        this.f171723b.setTitle(str);
    }
}
