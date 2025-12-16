package com.avito.android.photo_list_view_group_selection.items.header;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoItemGroupSelectionHeaderPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/items/header/d;", "LTV0/f;", "Lcom/avito/android/photo_list_view_group_selection/items/header/f;", "Lcom/avito/android/photo_list_view_group_selection/items/header/PhotoItemGroupSelectionHeaderItem;", "<init>", "()V", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements TV0.f<f, PhotoItemGroupSelectionHeaderItem> {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((f) eVar).lE((PhotoItemGroupSelectionHeaderItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        f fVar = (f) eVar;
        PhotoItemGroupSelectionHeaderItem photoItemGroupSelectionHeaderItem = (PhotoItemGroupSelectionHeaderItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof c) {
                obj = obj2;
            }
        }
        if (((c) (obj instanceof c ? obj : null)) == null) {
            fVar.lE(photoItemGroupSelectionHeaderItem);
        }
    }
}
