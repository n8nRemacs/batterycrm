package com.avito.android.photo_list_view_group_selection.di;

import com.avito.android.photo_list_view_group_selection.items.header.PhotoItemGroupSelectionHeaderItem;
import com.avito.android.photo_list_view_group_selection.items.imageGroup.PhotoItemGroupSelectionImageGroupItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoItemGroupSelectionChangePayloadCreator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/di/c;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.recycler.data_aware.a {
    @Override // com.avito.android.recycler.data_aware.a
    @Y61.l
    public final Object a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        Object cVar;
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF85686c()) : null, aVar2 != null ? Long.valueOf(aVar2.getF85686c()) : null)) {
            return null;
        }
        if ((aVar instanceof PhotoItemGroupSelectionImageGroupItem) && (aVar2 instanceof PhotoItemGroupSelectionImageGroupItem)) {
            PhotoItemGroupSelectionImageGroupItem photoItemGroupSelectionImageGroupItem = (PhotoItemGroupSelectionImageGroupItem) aVar2;
            cVar = new com.avito.android.photo_list_view_group_selection.items.imageGroup.c(Boolean.valueOf(photoItemGroupSelectionImageGroupItem.f218427e));
            if (((PhotoItemGroupSelectionImageGroupItem) aVar).f218427e == photoItemGroupSelectionImageGroupItem.f218427e) {
                return null;
            }
        } else {
            if (!(aVar instanceof PhotoItemGroupSelectionHeaderItem) || !(aVar2 instanceof PhotoItemGroupSelectionHeaderItem)) {
                return null;
            }
            cVar = com.avito.android.photo_list_view_group_selection.items.header.c.f218421a;
            if (L.f(((PhotoItemGroupSelectionHeaderItem) aVar).f218416c, ((PhotoItemGroupSelectionHeaderItem) aVar2).f218416c)) {
                return null;
            }
        }
        return cVar;
    }
}
