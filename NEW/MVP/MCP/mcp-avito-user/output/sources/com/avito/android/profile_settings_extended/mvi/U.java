package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection.SelectionItem;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSettingsReducer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/profile_settings_extended/adapter/item_selections/adapter/selection/SelectionItem;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class U extends kotlin.jvm.internal.N implements Y41.l<SelectionItem, SelectionItem> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction f230498l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction selectionsWidgetInternalAction) {
        super(1);
        this.f230498l = selectionsWidgetInternalAction;
    }

    @Override // Y41.l
    public final SelectionItem invoke(SelectionItem selectionItem) {
        return ((ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.SetSelectionPublicSuccess) this.f230498l).f230637b;
    }
}
