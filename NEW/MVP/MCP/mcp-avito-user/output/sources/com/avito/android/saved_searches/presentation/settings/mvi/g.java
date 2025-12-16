package com.avito.android.saved_searches.presentation.settings.mvi;

import Fo0.InterfaceC13823b;
import com.avito.android.arch.mvi.t;
import com.avito.android.saved_searches.presentation.settings.mvi.entity.SavedSearchSettingsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SavedSearchSettingsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/mvi/g;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction;", "LFo0/b;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements t<SavedSearchSettingsInternalAction, InterfaceC13823b> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13823b b(SavedSearchSettingsInternalAction savedSearchSettingsInternalAction) {
        SavedSearchSettingsInternalAction savedSearchSettingsInternalAction2 = savedSearchSettingsInternalAction;
        if (savedSearchSettingsInternalAction2 instanceof SavedSearchSettingsInternalAction.HandleBackButtonClick) {
            return InterfaceC13823b.a.f5988a;
        }
        if (!(savedSearchSettingsInternalAction2 instanceof SavedSearchSettingsInternalAction.HandleSelectedSettings)) {
            return null;
        }
        SavedSearchSettingsInternalAction.HandleSelectedSettings handleSelectedSettings = (SavedSearchSettingsInternalAction.HandleSelectedSettings) savedSearchSettingsInternalAction2;
        return new InterfaceC13823b.C0304b(handleSelectedSettings.f258766c, handleSelectedSettings.f258765b);
    }
}
