package com.avito.android.mortgage.applications_list.mvi;

import SZ.b;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.mortgage.acceptance_dialog.model.ButtonStyle;
import com.avito.android.mortgage.applications_list.mvi.entity.ApplicationsListInternalAction;
import com.avito.android.mortgage.root.model.ApplicationDeleteAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ApplicationsListOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/applications_list/mvi/o;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction;", "LSZ/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o implements t<ApplicationsListInternalAction, SZ.b> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final SZ.b b(ApplicationsListInternalAction applicationsListInternalAction) {
        SZ.b cVar;
        ApplicationsListInternalAction applicationsListInternalAction2 = applicationsListInternalAction;
        if (applicationsListInternalAction2 instanceof ApplicationsListInternalAction.CloseScreen) {
            return b.a.f15052a;
        }
        if (applicationsListInternalAction2 instanceof ApplicationsListInternalAction.OpenDeeplink) {
            cVar = new b.C1026b(((ApplicationsListInternalAction.OpenDeeplink) applicationsListInternalAction2).f198448b);
        } else if (applicationsListInternalAction2 instanceof ApplicationsListInternalAction.ShowMoreDialog) {
            ApplicationsListInternalAction.ShowMoreDialog showMoreDialog = (ApplicationsListInternalAction.ShowMoreDialog) applicationsListInternalAction2;
            ApplicationDeleteAction applicationDeleteAction = new ApplicationDeleteAction(showMoreDialog.f198450b);
            Parcelable.Creator<ButtonStyle> creator = ButtonStyle.CREATOR;
            cVar = new b.d(showMoreDialog.f198451c, showMoreDialog.f198452d, showMoreDialog.f198453e, showMoreDialog.f198454f, applicationDeleteAction);
        } else {
            if (!(applicationsListInternalAction2 instanceof ApplicationsListInternalAction.ShowErrorToast)) {
                return null;
            }
            cVar = new b.c(com.avito.android.printable_text.b.f(((ApplicationsListInternalAction.ShowErrorToast) applicationsListInternalAction2).f198449b));
        }
        return cVar;
    }
}
