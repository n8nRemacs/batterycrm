package com.avito.android.publish.screen.objects.mvi;

import Ge0.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ObjectFillFormOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "LGe0/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m implements t<ObjectFillFormInternalAction, Ge0.d> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Ge0.d b(ObjectFillFormInternalAction objectFillFormInternalAction) {
        ObjectFillFormInternalAction objectFillFormInternalAction2 = objectFillFormInternalAction;
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.OpenDeepLink) {
            return new d.e(((ObjectFillFormInternalAction.OpenDeepLink) objectFillFormInternalAction2).f240201b);
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ShowSelectScreen) {
            return new d.r(((ObjectFillFormInternalAction.ShowSelectScreen) objectFillFormInternalAction2).f240216b);
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ShowLocationPicker) {
            ObjectFillFormInternalAction.ShowLocationPicker showLocationPicker = (ObjectFillFormInternalAction.ShowLocationPicker) objectFillFormInternalAction2;
            return new d.q(showLocationPicker.f240214b, showLocationPicker.f240215c);
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ShowAutoEarlyAccessSelectScreen) {
            return new d.i(((ObjectFillFormInternalAction.ShowAutoEarlyAccessSelectScreen) objectFillFormInternalAction2).f240205b);
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ShowSelectorCardGroupBottomSheet) {
            return new d.s(((ObjectFillFormInternalAction.ShowSelectorCardGroupBottomSheet) objectFillFormInternalAction2).f240217b);
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ShowConfirmation) {
            return new d.k(((ObjectFillFormInternalAction.ShowConfirmation) objectFillFormInternalAction2).f240206b);
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.LeaveScreen) {
            return d.b.f6667a;
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.NavigateToAuth) {
            return d.C0362d.f6669a;
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ShowDeleteObjectDialog) {
            return d.n.f6679a;
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.LeaveScreenWithChangedObject) {
            return new d.c(((ObjectFillFormInternalAction.LeaveScreenWithChangedObject) objectFillFormInternalAction2).f240199b);
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ShowDatePickerDialog) {
            ObjectFillFormInternalAction.ShowDatePickerDialog showDatePickerDialog = (ObjectFillFormInternalAction.ShowDatePickerDialog) objectFillFormInternalAction2;
            return new d.l(showDatePickerDialog.f240208b, showDatePickerDialog.f240209c);
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ShowDateTimeRangeDialog) {
            ObjectFillFormInternalAction.ShowDateTimeRangeDialog showDateTimeRangeDialog = (ObjectFillFormInternalAction.ShowDateTimeRangeDialog) objectFillFormInternalAction2;
            return new d.m(showDateTimeRangeDialog.f240210b, showDateTimeRangeDialog.f240211c);
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ShowSuggestInstitutesDialog) {
            return new d.u(((ObjectFillFormInternalAction.ShowSuggestInstitutesDialog) objectFillFormInternalAction2).f240218b);
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ScrollToItem) {
            return new d.f(((ObjectFillFormInternalAction.ScrollToItem) objectFillFormInternalAction2).f240203b, false, 2, null);
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ShowAppBarOnboarding) {
            return new d.h();
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ShowConfettiAnimation) {
            return new d.j();
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ShowTooltipForItem) {
            return new d.w();
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.HideKeyboard) {
            return d.a.f6666a;
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ShowSimpleMessageAlert) {
            return new d.t();
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ShowAddressActionMessageAlert) {
            return new d.g();
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ShowErrorAlert) {
            return new d.o(((ObjectFillFormInternalAction.ShowErrorAlert) objectFillFormInternalAction2).f240213b);
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ShowErrorWithAction) {
            return new d.p();
        }
        if (objectFillFormInternalAction2 instanceof ObjectFillFormInternalAction.ShowToastBarError) {
            return new d.v();
        }
        return null;
    }
}
