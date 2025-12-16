package com.avito.android.comparison.menu_bottom_sheet;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItem;
import kotlin.Metadata;

/* compiled from: ComparisonBottomSheetView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/menu_bottom_sheet/h;", "Lcom/avito/android/comparison/menu_bottom_sheet/g;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ListItem f124108a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItem f124109b;

    public h(@k View view) {
        this.f124108a = (ListItem) view.findViewById(R.id.bottom_sheet_message_button);
        this.f124109b = (ListItem) view.findViewById(R.id.bottom_sheet_remove_button);
    }
}
