package com.avito.android.entry_point_client_room.report.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.entry_point_client_room.report.mvi.entity.SendReportInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import sz.C48436a;
import sz.C48437b;

/* compiled from: SendReportReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/entry_point_client_room/report/mvi/i;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction;", "Lsz/e;", "<init>", "()V", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements u<SendReportInternalAction, sz.e> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final sz.e a(SendReportInternalAction sendReportInternalAction, sz.e eVar) {
        SendReportInternalAction sendReportInternalAction2 = sendReportInternalAction;
        sz.e eVar2 = eVar;
        boolean z12 = sendReportInternalAction2 instanceof SendReportInternalAction.UpdateDescriptionInput;
        C48436a c48436a = eVar2.f438954f;
        C48437b c48437b = eVar2.f438953e;
        C48437b c48437b2 = eVar2.f438952d;
        if (z12) {
            SendReportInternalAction.UpdateDescriptionInput updateDescriptionInput = (SendReportInternalAction.UpdateDescriptionInput) sendReportInternalAction2;
            return sz.e.a(eVar2, null, C48437b.a(c48437b, updateDescriptionInput.f147718b, false, 30), new C48436a(c48436a.f438936a, c48437b2.f438938a.length() > 0 && updateDescriptionInput.f147718b.length() > 0), 39);
        }
        if (!(sendReportInternalAction2 instanceof SendReportInternalAction.UpdatePhoneInput)) {
            return sendReportInternalAction2.equals(SendReportInternalAction.ErrorOnPhoneInput.f147717b) ? sz.e.a(eVar2, C48437b.a(c48437b2, null, true, 27), null, null, 59) : eVar2;
        }
        SendReportInternalAction.UpdatePhoneInput updatePhoneInput = (SendReportInternalAction.UpdatePhoneInput) sendReportInternalAction2;
        return sz.e.a(eVar2, C48437b.a(c48437b2, updatePhoneInput.f147719b, false, 26), null, new C48436a(c48436a.f438936a, updatePhoneInput.f147719b.length() > 0 && c48437b.f438938a.length() > 0), 43);
    }
}
