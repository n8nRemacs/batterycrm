package com.avito.android.photo_list_view_group_selection.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.photo_list_view_group_selection.items.header.PhotoItemGroupSelectionHeaderItem;
import com.avito.android.photo_list_view_group_selection.items.imageGroup.PhotoItemGroupSelectionImageGroupItem;
import com.avito.android.photo_list_view_group_selection.mvi.entity.PhotoItemGroupSelectionInternalAction;
import com.avito.android.remote.model.category_parameters.ImageGroup;
import e80.C39966c;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoItemGroupSelectionReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/mvi/i;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/photo_list_view_group_selection/mvi/entity/PhotoItemGroupSelectionInternalAction;", "Le80/c;", "<init>", "()V", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements u<PhotoItemGroupSelectionInternalAction, C39966c> {
    @Inject
    public i() {
    }

    public static C39966c b(C39966c c39966c) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PhotoItemGroupSelectionHeaderItem("header_item_id", c39966c.f394984b));
        List<ImageGroup> list = c39966c.f394985c;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
        for (ImageGroup imageGroup : list) {
            arrayList2.add(Boolean.valueOf(arrayList.add(new PhotoItemGroupSelectionImageGroupItem(imageGroup.getId(), imageGroup.getId(), imageGroup.getTitle(), L.f(c39966c.f394986d, imageGroup.getId())))));
        }
        return C39966c.a(c39966c, null, null, null, new e80.d(arrayList), 7);
    }

    @Y61.k
    public static C39966c c(@Y61.k PhotoItemGroupSelectionInternalAction photoItemGroupSelectionInternalAction, @Y61.k C39966c c39966c) {
        if (!(photoItemGroupSelectionInternalAction instanceof PhotoItemGroupSelectionInternalAction.InitState)) {
            return photoItemGroupSelectionInternalAction instanceof PhotoItemGroupSelectionInternalAction.ChangeImageGroup ? b(C39966c.a(c39966c, null, null, ((PhotoItemGroupSelectionInternalAction.ChangeImageGroup) photoItemGroupSelectionInternalAction).f218448b, null, 11)) : c39966c;
        }
        PhotoItemGroupSelectionInternalAction.InitState initState = (PhotoItemGroupSelectionInternalAction.InitState) photoItemGroupSelectionInternalAction;
        return b(C39966c.a(c39966c, initState.f218450b, initState.f218451c, initState.f218452d, null, 8));
    }

    @Override // com.avito.android.arch.mvi.u
    public final /* bridge */ /* synthetic */ C39966c a(PhotoItemGroupSelectionInternalAction photoItemGroupSelectionInternalAction, C39966c c39966c) {
        return c(photoItemGroupSelectionInternalAction, c39966c);
    }
}
