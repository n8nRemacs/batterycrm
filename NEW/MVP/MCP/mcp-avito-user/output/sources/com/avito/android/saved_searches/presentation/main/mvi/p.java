package com.avito.android.saved_searches.presentation.main.mvi;

import Eo0.InterfaceC13516b;
import com.avito.android.saved_searches.presentation.main.mvi.entity.SavedSearchMainInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SavedSearchMainOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/p;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "LEo0/b;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p implements com.avito.android.arch.mvi.t<SavedSearchMainInternalAction, InterfaceC13516b> {
    @Inject
    public p() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13516b b(SavedSearchMainInternalAction savedSearchMainInternalAction) {
        SavedSearchMainInternalAction savedSearchMainInternalAction2 = savedSearchMainInternalAction;
        if (savedSearchMainInternalAction2 instanceof SavedSearchMainInternalAction.HandleDeeplink) {
            return new InterfaceC13516b.a(((SavedSearchMainInternalAction.HandleDeeplink) savedSearchMainInternalAction2).f258640b);
        }
        if (savedSearchMainInternalAction2 instanceof SavedSearchMainInternalAction.RouteBack) {
            return InterfaceC13516b.C0256b.f4258a;
        }
        if (savedSearchMainInternalAction2 instanceof SavedSearchMainInternalAction.ShowEmailChooser) {
            return InterfaceC13516b.c.f4259a;
        }
        if (savedSearchMainInternalAction2 instanceof SavedSearchMainInternalAction.ShowEmailSettings) {
            return new InterfaceC13516b.d(((SavedSearchMainInternalAction.ShowEmailSettings) savedSearchMainInternalAction2).f258645b);
        }
        if (savedSearchMainInternalAction2 instanceof SavedSearchMainInternalAction.ShowNotificationSettingsScreen) {
            return InterfaceC13516b.e.f4261a;
        }
        if (savedSearchMainInternalAction2 instanceof SavedSearchMainInternalAction.ShowPushSettings) {
            return new InterfaceC13516b.f(((SavedSearchMainInternalAction.ShowPushSettings) savedSearchMainInternalAction2).f258650b);
        }
        if (!(savedSearchMainInternalAction2 instanceof SavedSearchMainInternalAction.ShowToast)) {
            return null;
        }
        SavedSearchMainInternalAction.ShowToast showToast = (SavedSearchMainInternalAction.ShowToast) savedSearchMainInternalAction2;
        int i12 = showToast.f258654d;
        return new InterfaceC13516b.g(showToast.f258652b, showToast.f258653c, i12, showToast.f258655e);
    }
}
