package com.avito.android.important_addresses_selection.presentation.items.address;

import Y41.l;
import Y61.k;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ImportantAddressesSelectionAddressView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/items/address/f;", "Lcom/avito/android/important_addresses_selection/presentation/items/address/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f169852d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<SM.a, G0> f169853b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ListItemCheckbox f169854c;

    public f(@k View view, @k l lVar) {
        super(view);
        this.f169853b = lVar;
        this.f169854c = (ListItemCheckbox) view.findViewById(R.id.address);
    }

    @Override // com.avito.android.important_addresses_selection.presentation.items.address.e
    public final void Yu(@k ImportantAddressesSelectionAddressItem importantAddressesSelectionAddressItem) {
        ListItemCheckbox listItemCheckbox = this.f169854c;
        listItemCheckbox.i();
        TextView textView = (TextView) listItemCheckbox.findViewById(R.id.design_item_title);
        if (textView != null) {
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.START);
        }
        listItemCheckbox.setTitle(importantAddressesSelectionAddressItem.f169841d);
        listItemCheckbox.setSubtitle(importantAddressesSelectionAddressItem.f169842e);
        listItemCheckbox.setChecked(importantAddressesSelectionAddressItem.f169843f);
        listItemCheckbox.setEnabled(importantAddressesSelectionAddressItem.f169844g);
        listItemCheckbox.e(new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.e(4, this, importantAddressesSelectionAddressItem));
    }
}
