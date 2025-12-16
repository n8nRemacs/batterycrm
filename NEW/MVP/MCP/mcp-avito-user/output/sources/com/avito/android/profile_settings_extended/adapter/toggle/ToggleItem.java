package com.avito.android.profile_settings_extended.adapter.toggle;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ToggleItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/toggle/ToggleItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "Lcom/avito/android/profile_settings_extended/adapter/toggle/RegularToggleItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class ToggleItem implements SettingsListItem {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ToggleViewState f229866b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType.FullWidth f229867c = GridElementType.FullWidth.f161209b;

    public ToggleItem(ToggleViewState toggleViewState, C42822w c42822w) {
        this.f229866b = toggleViewState;
    }

    @k
    /* renamed from: f, reason: from getter */
    public ToggleViewState getF229866b() {
        return this.f229866b;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public final GridElementType getF154825c() {
        return this.f229867c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222258b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF231095b() {
        return "toggle_item";
    }
}
