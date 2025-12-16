package com.avito.android.guests_selector.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.guests_selector.mvi.entity.GuestsSelectorInternalAction;
import com.avito.android.guests_selector.mvi.entity.state.entity.ActivePageType;
import hI.C40827a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: GuestsSelectorReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/guests_selector/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction;", "LhI/a;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements u<GuestsSelectorInternalAction, C40827a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f161569b;

    @Inject
    public k(@Y61.k m mVar) {
        this.f161569b = mVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C40827a a(GuestsSelectorInternalAction guestsSelectorInternalAction, C40827a c40827a) {
        ActivePageType activePageType;
        GuestsSelectorInternalAction guestsSelectorInternalAction2 = guestsSelectorInternalAction;
        C40827a c40827a2 = c40827a;
        boolean z12 = guestsSelectorInternalAction2 instanceof GuestsSelectorInternalAction.Initial;
        m mVar = this.f161569b;
        if (z12) {
            GuestsSelectorInternalAction.Initial initial = (GuestsSelectorInternalAction.Initial) guestsSelectorInternalAction2;
            initial.getClass();
            return mVar.b(C40827a.a(c40827a2, ActivePageType.f161554b, initial.f161533b, initial.f161534c, initial.f161535d, initial.f161536e, initial.f161539h, initial.f161540i, initial.f161541j, initial.f161542k, initial.f161543l, initial.f161544m, null, 2048));
        }
        if (guestsSelectorInternalAction2 instanceof GuestsSelectorInternalAction.Navigate) {
            GuestsSelectorInternalAction.Navigate navigate = (GuestsSelectorInternalAction.Navigate) guestsSelectorInternalAction2;
            if (navigate instanceof GuestsSelectorInternalAction.Navigate.GuestsList) {
                activePageType = ActivePageType.f161554b;
            } else {
                if (!(navigate instanceof GuestsSelectorInternalAction.Navigate.ChildAgePicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                activePageType = ActivePageType.f161555c;
            }
            return mVar.b(C40827a.a(c40827a2, activePageType, 0, 0, 0, 0, 0, null, null, null, false, null, null, 4094));
        }
        if (guestsSelectorInternalAction2 instanceof GuestsSelectorInternalAction.UpdateGuestsCount) {
            return mVar.b(C40827a.a(c40827a2, null, 0, 0, 0, 0, ((GuestsSelectorInternalAction.UpdateGuestsCount) guestsSelectorInternalAction2).f161552b, null, null, null, false, null, null, 4063));
        }
        if (guestsSelectorInternalAction2 instanceof GuestsSelectorInternalAction.UpdateSelectedChildAge) {
            return C40827a.a(c40827a2, null, 0, 0, 0, 0, 0, ((GuestsSelectorInternalAction.UpdateSelectedChildAge) guestsSelectorInternalAction2).f161553b, null, null, false, null, null, 4031);
        }
        if (guestsSelectorInternalAction2 instanceof GuestsSelectorInternalAction.NewChildCreated) {
            GuestsSelectorInternalAction.NewChildCreated newChildCreated = (GuestsSelectorInternalAction.NewChildCreated) guestsSelectorInternalAction2;
            newChildCreated.getClass();
            return mVar.b(C40827a.a(c40827a2, ActivePageType.f161554b, 0, 0, 0, 0, 0, null, newChildCreated.f161547b, null, false, null, null, 3966));
        }
        if (guestsSelectorInternalAction2 instanceof GuestsSelectorInternalAction.RemoveChild) {
            return mVar.b(C40827a.a(c40827a2, null, 0, 0, 0, 0, 0, null, ((GuestsSelectorInternalAction.RemoveChild) guestsSelectorInternalAction2).f161548b, null, false, null, null, 3967));
        }
        if (!(guestsSelectorInternalAction2 instanceof GuestsSelectorInternalAction.UpdateBooleanValue)) {
            return c40827a2;
        }
        GuestsSelectorInternalAction.UpdateBooleanValue updateBooleanValue = (GuestsSelectorInternalAction.UpdateBooleanValue) guestsSelectorInternalAction2;
        return mVar.a(c40827a2, updateBooleanValue.f161550b, updateBooleanValue.f161551c);
    }
}
