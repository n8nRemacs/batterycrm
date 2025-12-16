package com.avito.android.rating_form.step.dialog.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_form.api.remote.model.ButtonStyle;
import com.avito.android.rating_form.step.dialog.DialogInfo;
import com.avito.android.rating_form.step.dialog.mvi.entity.DialogInternalAction;
import gh0.C40684c;
import gh0.InterfaceC40682a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: DialogReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/rating_form/step/dialog/mvi/entity/DialogInternalAction;", "Lgh0/c;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements u<DialogInternalAction, C40684c> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C40684c a(DialogInternalAction dialogInternalAction, C40684c c40684c) {
        List list;
        InterfaceC40682a c11222a;
        DeepLink deepLink;
        DialogInternalAction dialogInternalAction2 = dialogInternalAction;
        C40684c c40684c2 = c40684c;
        if (!(dialogInternalAction2 instanceof DialogInternalAction.Content)) {
            if (!(dialogInternalAction2 instanceof DialogInternalAction.ProceedSendAnyway)) {
                if (dialogInternalAction2 instanceof DialogInternalAction.Empty ? true : dialogInternalAction2 instanceof DialogInternalAction.ShowErrorToast ? true : dialogInternalAction2 instanceof DialogInternalAction.OpenDeeplink ? true : dialogInternalAction2 instanceof DialogInternalAction.OpenUrl ? true : dialogInternalAction2 instanceof DialogInternalAction.StartAuthentication ? true : dialogInternalAction2 instanceof DialogInternalAction.CloseDialog) {
                    return c40684c2;
                }
                throw new NoWhenBranchMatchedException();
            }
            List<C40684c.a> list2 = c40684c2.f396720c;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (C40684c.a aVar : list2) {
                arrayList.add(new C40684c.a(aVar.f396722a, aVar.f396723b, aVar.f396724c, true, aVar.f396726e));
            }
            return new C40684c(c40684c2.f396718a, c40684c2.f396719b, arrayList, c40684c2.f396721d);
        }
        DialogInternalAction.Content content = (DialogInternalAction.Content) dialogInternalAction2;
        ArrayList<DialogInfo.Action> arrayList2 = content.f249435d;
        if (arrayList2 == null) {
            list = C42784z0.f406748b;
        } else {
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
            for (DialogInfo.Action action : arrayList2) {
                String f249348b = action.getF249348b();
                ButtonStyle f249349c = action.getF249349c();
                boolean z12 = action instanceof DialogInfo.Action.UpdateStateAction;
                if (z12) {
                    c11222a = new InterfaceC40682a.g(((DialogInfo.Action.UpdateStateAction) action).f249361g, ((DialogInfo.Action.UpdateStateAction) action).f249360f);
                } else if (action instanceof DialogInfo.Action.CloseDialogAction) {
                    DialogInfo.Action.CloseDialogAction closeDialogAction = (DialogInfo.Action.CloseDialogAction) action;
                    c11222a = new InterfaceC40682a.b(new InterfaceC40682a.c(closeDialogAction.f249356g, closeDialogAction.f249357h), ((DialogInfo.Action.CloseDialogAction) action).f249355f);
                } else {
                    if (!(action instanceof DialogInfo.Action.AuthDialogAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c11222a = new InterfaceC40682a.C11222a(((DialogInfo.Action.AuthDialogAction) action).f249352f);
                }
                arrayList3.add(new C40684c.a(f249348b, f249349c, c11222a, false, z12 || (action instanceof DialogInfo.Action.AuthDialogAction), 8, null));
            }
            list = arrayList3;
        }
        ArrayList<DialogInfo.OnCloseAction> arrayList4 = content.f249436e;
        InterfaceC40682a.c cVar = null;
        DeepLink deepLink2 = null;
        if (arrayList4 != null) {
            InterfaceC40682a.c cVar2 = null;
            for (DialogInfo.OnCloseAction onCloseAction : arrayList4) {
                if (onCloseAction instanceof DialogInfo.OnCloseAction.SendAnalyticsAction) {
                    deepLink2 = ((DialogInfo.OnCloseAction.SendAnalyticsAction) onCloseAction).f249366b;
                } else if (onCloseAction instanceof DialogInfo.OnCloseAction.FocusFieldAction) {
                    DialogInfo.OnCloseAction.FocusFieldAction focusFieldAction = (DialogInfo.OnCloseAction.FocusFieldAction) onCloseAction;
                    cVar2 = new InterfaceC40682a.c(focusFieldAction.f249364b, focusFieldAction.f249365c);
                }
            }
            deepLink = deepLink2;
            cVar = cVar2;
        } else {
            deepLink = null;
        }
        return new C40684c(content.f249433b, content.f249434c, list, new InterfaceC40682a.b(cVar, deepLink));
    }
}
