package com.avito.android.photo_list_view_group_selection.items.header;

import Y61.k;
import android.widget.TextView;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: PhotoItemGroupSelectionHeaderView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/items/header/g;", "Lcom/avito/android/photo_list_view_group_selection/items/header/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f218423b;

    public g(@k TextView textView) {
        super(textView);
        this.f218423b = textView;
    }

    @Override // com.avito.android.photo_list_view_group_selection.items.header.f
    public final void lE(@k PhotoItemGroupSelectionHeaderItem photoItemGroupSelectionHeaderItem) {
        I5.a(this.f218423b, photoItemGroupSelectionHeaderItem.f218416c, false);
    }
}
