package com.avito.android.mortgage.sending_confirm.mvi;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.mortgage.api.model.CheckboxMeta;
import com.avito.android.mortgage.api.model.LegalRequirements;
import com.avito.android.mortgage.sending_confirm.model.SendingConfirmArguments;
import com.avito.android.mortgage.sending_confirm.mvi.entity.SendingConfirmInternalAction;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import l10.InterfaceC43527a;
import m10.C43861c;

/* compiled from: SendingConfirmReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/sending_confirm/mvi/i;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction;", "Lm10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements u<SendingConfirmInternalAction, C43861c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC43527a f203583b;

    @Inject
    public i(@k InterfaceC43527a interfaceC43527a) {
        this.f203583b = interfaceC43527a;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C43861c a(SendingConfirmInternalAction sendingConfirmInternalAction, C43861c c43861c) {
        C43861c c43861cA;
        SendingConfirmInternalAction sendingConfirmInternalAction2 = sendingConfirmInternalAction;
        C43861c c43861cA2 = c43861c;
        if (sendingConfirmInternalAction2 instanceof SendingConfirmInternalAction.Init) {
            SendingConfirmArguments sendingConfirmArguments = ((SendingConfirmInternalAction.Init) sendingConfirmInternalAction2).f203573b;
            LegalRequirements legalRequirements = sendingConfirmArguments.f203547b;
            c43861cA = C43861c.a(c43861cA2, sendingConfirmArguments.f203548c, sendingConfirmArguments.f203549d, legalRequirements.getDescription(), legalRequirements.c(), legalRequirements.getDisclaimer(), false, 32);
        } else {
            boolean z12 = sendingConfirmInternalAction2 instanceof SendingConfirmInternalAction.CheckClick;
            Map<String, CheckboxMeta> map = c43861cA2.f414266e;
            if (z12) {
                String str = ((SendingConfirmInternalAction.CheckClick) sendingConfirmInternalAction2).f203572b;
                CheckboxMeta checkboxMeta = map.get(str);
                if (checkboxMeta != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.put(str, CheckboxMeta.a(checkboxMeta, !checkboxMeta.getIsChecked(), false, 3));
                    c43861cA2 = C43861c.a(c43861cA2, null, null, null, linkedHashMap, null, false, 55);
                }
                c43861cA = c43861cA2;
            } else if (sendingConfirmInternalAction2 instanceof SendingConfirmInternalAction.SetErrorOnCheckboxes) {
                SendingConfirmInternalAction.SetErrorOnCheckboxes setErrorOnCheckboxes = (SendingConfirmInternalAction.SetErrorOnCheckboxes) sendingConfirmInternalAction2;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    String str2 = (String) entry.getKey();
                    CheckboxMeta checkboxMetaA = (CheckboxMeta) entry.getValue();
                    if (setErrorOnCheckboxes.f203576b.contains(str2)) {
                        checkboxMetaA = CheckboxMeta.a(checkboxMetaA, false, true, 7);
                    }
                    linkedHashMap2.put(key, checkboxMetaA);
                }
                c43861cA = C43861c.a(c43861cA2, null, null, null, linkedHashMap2, null, false, 55);
            } else if (sendingConfirmInternalAction2 instanceof SendingConfirmInternalAction.LegalSendingStarted) {
                c43861cA = C43861c.a(c43861cA2, null, null, null, null, null, true, 31);
            } else {
                if (!(sendingConfirmInternalAction2 instanceof SendingConfirmInternalAction.LegalSendingFailed) && !(sendingConfirmInternalAction2 instanceof SendingConfirmInternalAction.LegalSendingCompleted)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43861cA = C43861c.a(c43861cA2, null, null, null, null, null, false, 31);
            }
        }
        this.f203583b.a(sendingConfirmInternalAction2, c43861cA);
        return c43861cA;
    }
}
