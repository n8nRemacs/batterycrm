package com.avito.android.photo_list_view_group_selection.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.photo_list_view_group_selection.mvi.entity.PhotoItemGroupSelectionInternalAction;
import e80.InterfaceC39965b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhotoItemGroupSelectionOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/mvi/g;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/photo_list_view_group_selection/mvi/entity/PhotoItemGroupSelectionInternalAction;", "Le80/b;", "<init>", "()V", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements t<PhotoItemGroupSelectionInternalAction, InterfaceC39965b> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC39965b b(PhotoItemGroupSelectionInternalAction photoItemGroupSelectionInternalAction) {
        PhotoItemGroupSelectionInternalAction photoItemGroupSelectionInternalAction2 = photoItemGroupSelectionInternalAction;
        if (photoItemGroupSelectionInternalAction2 instanceof PhotoItemGroupSelectionInternalAction.SelectImageGroup) {
            PhotoItemGroupSelectionInternalAction.SelectImageGroup selectImageGroup = (PhotoItemGroupSelectionInternalAction.SelectImageGroup) photoItemGroupSelectionInternalAction2;
            return new InterfaceC39965b.C11055b(selectImageGroup.f218453b, selectImageGroup.f218454c, selectImageGroup.f218455d, selectImageGroup.f218456e, selectImageGroup.f218457f);
        }
        if (photoItemGroupSelectionInternalAction2 instanceof PhotoItemGroupSelectionInternalAction.CloseScreen) {
            return InterfaceC39965b.a.f394976a;
        }
        return null;
    }
}
